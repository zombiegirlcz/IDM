package ke;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f182935b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oe.c f182936a;

    public h(oe.c cVar) {
        this.f182936a = cVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                wif.a aVar = n.f182950a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j2 = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, 256);
                }
                arrayList.add(new b(j2, string2, string3, string4, string5));
            } catch (Exception e) {
                String str2 = "Failed de-serializing rollouts state. " + string;
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(n.f182950a.a(list.get(i))));
            } catch (JSONException e) {
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            String str = "Deleted corrupt file: " + file.getAbsolutePath();
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            a0.d.s("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    public final Map c(String str, boolean z) throws Throwable {
        Throwable th10;
        FileInputStream fileInputStream;
        oe.c cVar = this.f182936a;
        File fileH = z ? cVar.h(str, "internal-keys") : cVar.h(str, "keys");
        if (!fileH.exists() || fileH.length() == 0) {
            g(fileH, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileH);
                try {
                    HashMap mapA = a(ie.g.i(fileInputStream));
                    ie.g.b(fileInputStream, "Failed to close user metadata file.");
                    return mapA;
                } catch (Exception e) {
                    f(fileH);
                    ie.g.b(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th11) {
                th10 = th11;
                ie.g.b(, "Failed to close user metadata file.");
                throw th10;
            }
        } catch (Exception e2) {
            fileInputStream = null;
        } catch (Throwable th12) {
            ?? r110 = 0;
            th10 = th12;
            ie.g.b(r110, "Failed to close user metadata file.");
            throw th10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    public final String d(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileH = this.f182936a.h(str, "user-data");
        ?? r62 = 0;
        if (fileH.exists()) {
            ?? r3 = (fileH.length() > 0L ? 1 : (fileH.length() == 0L ? 0 : -1));
            try {
                if (r3 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileH);
                        try {
                            JSONObject jSONObject = new JSONObject(ie.g.i(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            }
                            ie.g.b(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e) {
                            f(fileH);
                            ie.g.b(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e2) {
                        fileInputStream = null;
                    } catch (Throwable th10) {
                        th = th10;
                        ie.g.b(r62, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                r62 = r3;
            }
        }
        j6.a.q("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
        f(fileH);
        return null;
    }

    public final void h(String str, Map map, boolean z) {
        String string;
        BufferedWriter bufferedWriter;
        oe.c cVar = this.f182936a;
        File fileH = z ? cVar.h(str, "internal-keys") : cVar.h(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                string = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileH), f182935b));
            } catch (Exception e) {
            }
        } catch (Throwable th10) {
            th = th10;
        }
        try {
            bufferedWriter.write(string);
            bufferedWriter.flush();
            ie.g.b(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e2) {
            bufferedWriter2 = bufferedWriter;
            f(fileH);
            ie.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th11) {
            th = th11;
            bufferedWriter2 = bufferedWriter;
            ie.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    public final void i(String str, List list) {
        Throwable th10;
        BufferedWriter bufferedWriter;
        File fileH = this.f182936a.h(str, "rollouts-state");
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            g(fileH, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                String strE = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileH), f182935b));
                try {
                    bufferedWriter.write(strE);
                    bufferedWriter.flush();
                    ie.g.b(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e) {
                    f(fileH);
                    ie.g.b(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th11) {
                th10 = th11;
                ie.g.b(IsEmpty, "Failed to close rollouts state file.");
                throw th10;
            }
        } catch (Exception e2) {
            bufferedWriter = null;
        } catch (Throwable th12) {
            IsEmpty = 0;
            th10 = th12;
            ie.g.b(IsEmpty, "Failed to close rollouts state file.");
            throw th10;
        }
    }

    public final void j(String str, String str2) {
        String string;
        BufferedWriter bufferedWriter;
        File fileH = this.f182936a.h(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            g gVar = new g();
            gVar.put("userId", str2);
            string = gVar.toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileH), f182935b));
        } catch (Exception e) {
        } catch (Throwable th10) {
            th = th10;
        }
        try {
            bufferedWriter.write(string);
            bufferedWriter.flush();
            ie.g.b(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e2) {
            bufferedWriter2 = bufferedWriter;
            ie.g.b(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th11) {
            th = th11;
            bufferedWriter2 = bufferedWriter;
            ie.g.b(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
