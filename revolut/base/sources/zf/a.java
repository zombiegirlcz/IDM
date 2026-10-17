package zf;

import ag.m;
import ag.o;
import ag.s;
import ag.u;
import ag.x;
import com.google.firebase.messaging.t;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd.b f321806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f321807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ag.e f321808c;
    public final ag.e d;
    public final m e;
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f321809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jpf.a f321810h;
    public final t i;

    public a(qd.b bVar, Executor executor, ag.e eVar, ag.e eVar2, ag.e eVar3, m mVar, o oVar, u uVar, jpf.a aVar, t tVar) {
        this.f321806a = bVar;
        this.f321807b = executor;
        this.f321808c = eVar;
        this.d = eVar2;
        this.e = mVar;
        this.f = oVar;
        this.f321809g = uVar;
        this.f321810h = aVar;
        this.i = tVar;
    }

    public static ArrayList d(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final HashMap a() {
        x xVar;
        HashSet<String> hashSet = new HashSet();
        o oVar = this.f;
        ag.e eVar = oVar.f4715c;
        hashSet.addAll(o.b(eVar));
        ag.e eVar2 = oVar.d;
        hashSet.addAll(o.b(eVar2));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            String strC = o.c(eVar, str);
            if (strC != null) {
                oVar.a(str, eVar.c());
                xVar = new x(strC, 2);
            } else {
                String strC2 = o.c(eVar2, str);
                if (strC2 != null) {
                    xVar = new x(strC2, 1);
                } else {
                    o.d(str, "FirebaseRemoteConfigValue");
                    xVar = new x("", 0);
                }
            }
            map.put(str, xVar);
        }
        return map;
    }

    public final String b(String str) {
        o oVar = this.f;
        ag.e eVar = oVar.f4715c;
        String strC = o.c(eVar, str);
        if (strC != null) {
            oVar.a(str, eVar.c());
            return strC;
        }
        String strC2 = o.c(oVar.d, str);
        if (strC2 != null) {
            return strC2;
        }
        o.d(str, "String");
        return "";
    }

    public final void c(boolean z) {
        HttpURLConnection httpURLConnection;
        jpf.a aVar = this.f321810h;
        synchronized (aVar) {
            s sVar = (s) aVar.f177268b;
            synchronized (sVar.f4735r) {
                try {
                    sVar.e = z;
                    ag.c cVar = sVar.f4727g;
                    if (cVar != null) {
                        cVar.e(z);
                    }
                    if (z && (httpURLConnection = sVar.f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            if (!z) {
                synchronized (aVar) {
                    if (!((LinkedHashSet) aVar.f177267a).isEmpty()) {
                        ((s) aVar.f177268b).e(0L);
                    }
                }
            }
        }
    }
}
