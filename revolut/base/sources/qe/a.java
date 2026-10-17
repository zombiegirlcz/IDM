package qe;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245003a;

    public a(String str) {
        this.f245003a = str;
    }

    public static void a(jt0.b bVar, e eVar) {
        String str = eVar.f245007a;
        if (str != null) {
            bVar.u0("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        bVar.u0("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        bVar.u0("X-CRASHLYTICS-API-CLIENT-VERSION", "19.4.4");
        bVar.u0("Accept", "application/json");
        String str2 = eVar.f245008b;
        if (str2 != null) {
            bVar.u0("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = eVar.f245009c;
        if (str3 != null) {
            bVar.u0("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = eVar.d;
        if (str4 != null) {
            bVar.u0("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = eVar.e.c().f160512a;
        if (str5 != null) {
            bVar.u0("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(e eVar) {
        HashMap map = new HashMap();
        map.put("build_version", eVar.f245011h);
        map.put("display_version", eVar.f245010g);
        map.put("source", Integer.toString(eVar.i));
        String str = eVar.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public JSONObject c(jm.a aVar) {
        int iB = aVar.b();
        fe.c cVar = fe.c.f134428a;
        cVar.e("Settings response code was: " + iB);
        String str = this.f245003a;
        if (iB != 200 && iB != 201 && iB != 202 && iB != 203) {
            j6.a.m(iB, "Settings request failed; (status: ", ") from ", str);
            if (cVar.a(6)) {
            }
            return null;
        }
        String strA = aVar.a();
        try {
            return new JSONObject(strA);
        } catch (Exception e) {
            cVar.f("Failed to parse settings JSON from " + str, e);
            cVar.f("Settings response " + strA, null);
            return null;
        }
    }

    public a(String str, dfm.c cVar) {
        if (str != null) {
            this.f245003a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
