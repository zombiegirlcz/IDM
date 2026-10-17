package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public final class AFf1hSDK extends AFf1xSDK<Map<String, Object>> {
    private static final int AFLogger = (int) TimeUnit.SECONDS.toMillis(2);
    private final Context d;
    private final AFc1oSDK e;
    private final Uri registerClient;
    private Map<String, Object> unregisterClient;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List<String> f26025w;

    public AFf1hSDK(@NonNull Context context, @NonNull AFc1oSDK aFc1oSDK, @NonNull Uri uri2, @NonNull List<String> list) {
        super(AFf1ySDK.RESOLVE_ESP, new AFf1ySDK[]{AFf1ySDK.RC_CDN}, "ResolveEsp");
        this.d = context;
        this.e = aFc1oSDK;
        this.registerClient = uri2;
        this.f26025w = list;
    }

    private boolean AFInAppEventType(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Validate if link ", str, " belongs to ESP domains: ");
        sbX.append(this.f26025w);
        AFLogger.afRDLog(sbX.toString());
        try {
            return this.f26025w.contains(new URL(str).getHost());
        } catch (MalformedURLException e) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    @NonNull
    public final AFe1fSDK AFInAppEventParameterName() throws Exception {
        Integer num = null;
        if (!AFInAppEventType(this.registerClient.toString())) {
            AFb1rSDK.AFInAppEventParameterName().valueOf(this.d, this.e, this.registerClient, null);
            return AFe1fSDK.SUCCESS;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = this.registerClient.toString();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        String str = null;
        while (i < 5) {
            Map<String, Object> mapAFInAppEventParameterName = AFInAppEventParameterName(Uri.parse(string));
            String str2 = (String) mapAFInAppEventParameterName.get("res");
            Integer num2 = (Integer) mapAFInAppEventParameterName.get("status");
            String str3 = (String) mapAFInAppEventParameterName.get("error");
            if (str2 == null || !AFInAppEventType(str2)) {
                str = str3;
                string = str2;
                num = num2;
                break;
            }
            if (i < 4) {
                arrayList.add(str2);
            }
            i++;
            str = str3;
            string = str2;
            num = num2;
        }
        HashMap map = new HashMap();
        map.put("res", string != null ? string : "");
        map.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            map.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            map.put("redirects", arrayList);
        }
        map.put("latency", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        synchronized (this.e) {
            this.e.values("af_deeplink_r", map);
            this.e.values("af_deeplink", this.registerClient.toString());
        }
        AFb1rSDK.AFInAppEventParameterName().valueOf(this.d, this.e, string != null ? Uri.parse(string) : this.registerClient, this.registerClient);
        this.unregisterClient = map;
        return AFe1fSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    public final long valueOf() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFf1xSDK
    public final boolean values() {
        return false;
    }

    private static Map<String, Object> AFInAppEventParameterName(Uri uri2) {
        HashMap map = new HashMap();
        try {
            StringBuilder sb6 = new StringBuilder("ESP deeplink resolving is started: ");
            sb6.append(uri2.toString());
            AFLogger.afDebugLog(sb6.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri2.toString()).openConnection()));
            httpURLConnection.setInstanceFollowRedirects(false);
            int i = AFLogger;
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.14.2");
            int responseCode = httpURLConnection.getResponseCode();
            map.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                map.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
            return map;
        } catch (Throwable th10) {
            map.put("error", th10.getLocalizedMessage());
            AFLogger.afErrorLog(th10.getMessage(), th10);
            return map;
        }
    }
}
