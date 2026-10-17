package ii;

import android.content.Context;
import android.os.Build;
import android.webkit.JavascriptInterface;
import ch.qos.logback.core.CoreConstants;
import dalvik.system.DexFile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import k9.n;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f161489b = "[]";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f161490c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f161491a;

    public c(Context context) {
        if (context == null) {
            throw new NullPointerException("context is marked non-null but is null");
        }
        this.f161491a = context;
    }

    public static ArrayList a(String str, String str2) throws NoSuchAlgorithmException, IOException {
        ArrayList arrayList = new ArrayList(512);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
        MessageDigest messageDigest3 = MessageDigest.getInstance("MD5");
        DexFile dexFile = new DexFile(str2);
        try {
            Enumeration<String> enumerationEntries = dexFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                String strNextElement = enumerationEntries.nextElement();
                if (strNextElement.startsWith("com.google.android.") || strNextElement.startsWith("android.")) {
                    messageDigest.update(strNextElement.getBytes("UTF-8"));
                } else if (strNextElement.startsWith(str)) {
                    messageDigest2.update(strNextElement.getBytes("UTF-8"));
                } else {
                    messageDigest3.update(strNextElement.getBytes("UTF-8"));
                }
            }
            dexFile.close();
            arrayList.add("sys_".concat(String.format("%032x", new BigInteger(1, messageDigest.digest()))));
            arrayList.add("deps_".concat(String.format("%032x", new BigInteger(1, messageDigest3.digest()))));
            arrayList.add("app_".concat(String.format("%032x", new BigInteger(1, messageDigest2.digest()))));
            arrayList.add("aver_" + Build.VERSION.RELEASE);
            arrayList.add("sdk_" + "4.0.5_44".replace(CoreConstants.DOT, '_'));
            return arrayList;
        } catch (Throwable th10) {
            dexFile.close();
            throw th10;
        }
    }

    public static HashMap b() {
        HashMap map = new HashMap();
        Process processStart = null;
        try {
            processStart = new ProcessBuilder("/system/bin/getprop").start();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream(), "UTF-8"));
            try {
                StringBuilder sb6 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        processStart.destroy();
                        return map;
                    }
                    if (line.endsWith("]")) {
                        sb6.replace(0, sb6.length() == 0 ? 0 : sb6.length() - 1, line);
                        String[] strArrSplit = sb6.toString().split("]: \\[");
                        String strSubstring = strArrSplit[0].substring(1);
                        if (strSubstring.startsWith("ro")) {
                            map.put(strSubstring, strArrSplit[1].substring(0, r4.length() - 2));
                        }
                    } else {
                        sb6.append(line);
                    }
                }
            } finally {
            }
        } catch (Throwable th10) {
            if (processStart != null) {
                processStart.destroy();
            }
            throw th10;
        }
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        Context context = ((c) obj2).f161491a;
        Context context2 = this.f161491a;
        return context2 != null ? context2.equals(context) : context == null;
    }

    @JavascriptInterface
    public String getDebugInfo() {
        String strC;
        String str = f161489b;
        if (str != null) {
            return str;
        }
        synchronized (this) {
            strC = f161489b;
            if (strC == null) {
                try {
                    strC = new n().c(a(this.f161491a.getPackageName(), this.f161491a.getPackageCodePath()));
                    f161489b = strC;
                } catch (IOException | NoSuchAlgorithmException unused) {
                    return "[]";
                }
            }
        }
        return strC;
    }

    @JavascriptInterface
    public String getSysDebug() {
        String strC;
        String str = f161490c;
        if (str != null) {
            return str;
        }
        synchronized (this) {
            strC = f161490c;
            if (strC == null) {
                try {
                    strC = new n().c(b());
                    f161490c = strC;
                } catch (IOException unused) {
                    return "{}";
                }
            }
        }
        return strC;
    }

    public final int hashCode() {
        Context context = this.f161491a;
        return (context == null ? 43 : context.hashCode()) + 59;
    }

    public final String toString() {
        return "HCaptchaDebugInfo(context=" + this.f161491a + ")";
    }
}
