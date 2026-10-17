package com.appsflyer.share;

import a0.d;
import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFd1fSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1aSDK.AnonymousClass4;
import com.appsflyer.internal.AFf1tSDK;
import com.appsflyer.internal.AFj1mSDK;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
public class LinkGenerator {
    String AFInAppEventParameterName;
    private final String AFInAppEventType;
    private String AFKeystoreWrapper;
    private String AFLogger;
    private final Map<String, String> afInfoLog = new HashMap();
    private String d;
    private String e;
    private String force;
    private String registerClient;
    private String unregisterClient;
    private String valueOf;
    String values;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f26063w;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.AFInAppEventType = str;
    }

    private Map<String, String> AFInAppEventType() {
        HashMap map = new HashMap();
        map.put("pid", this.AFInAppEventType);
        String str = this.AFLogger;
        if (str != null) {
            map.put("af_referrer_uid", str);
        }
        String str2 = this.AFKeystoreWrapper;
        if (str2 != null) {
            map.put("af_channel", str2);
        }
        String str3 = this.unregisterClient;
        if (str3 != null) {
            map.put("af_referrer_customer_id", str3);
        }
        String str4 = this.valueOf;
        if (str4 != null) {
            map.put("c", str4);
        }
        String str5 = this.e;
        if (str5 != null) {
            map.put("af_referrer_name", str5);
        }
        String str6 = this.registerClient;
        if (str6 != null) {
            map.put("af_referrer_image_url", str6);
        }
        if (this.force != null) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.force);
            String str7 = this.d;
            if (str7 != null) {
                this.d = str7.replaceFirst("^[/]", "");
                sb6.append(this.force.endsWith("/") ? "" : "/");
                sb6.append(this.d);
            }
            map.put("af_dp", sb6.toString());
        }
        for (Map.Entry<String, String> entry : this.afInfoLog.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return AFb1bSDK.valueOf(map);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.afInfoLog.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.afInfoLog.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb6 = new StringBuilder();
        String str = this.values;
        if (str == null || !str.startsWith("http")) {
            sb6.append(String.format(AFj1mSDK.AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.AFInAppEventParameterName().getHostName()));
        } else {
            sb6.append(this.values);
        }
        if (this.AFInAppEventParameterName != null) {
            sb6.append('/');
            sb6.append(this.AFInAppEventParameterName);
        }
        Map<String, String> mapAFInAppEventType = AFInAppEventType();
        StringBuilder sb9 = new StringBuilder();
        for (Map.Entry<String, String> entry : mapAFInAppEventType.entrySet()) {
            if (sb9.length() == 0) {
                sb9.append('?');
            } else {
                sb9.append('&');
            }
            sb9.append(entry.getKey());
            sb9.append('=');
            sb9.append(entry.getValue());
        }
        sb6.append(sb9.toString());
        return sb6.toString();
    }

    public String getBrandDomain() {
        return this.f26063w;
    }

    public String getCampaign() {
        return this.valueOf;
    }

    public String getChannel() {
        return this.AFKeystoreWrapper;
    }

    public String getMediaSource() {
        return this.AFInAppEventType;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.afInfoLog);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.force = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.values = d.s("https://", a.o(AppsFlyerLib.getInstance().getHostPrefix(), "app.", AFb1rSDK.AFInAppEventParameterName().getHostName()), "/", str3);
            return this;
        }
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        this.values = d.s("https://", str2, "/", str);
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.f26063w = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.valueOf = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.AFKeystoreWrapper = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.d = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.unregisterClient = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.registerClient = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.e = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.AFLogger = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        String str = this.f26063w;
        Map<String, String> mapAFInAppEventType = AFInAppEventType();
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        AFb1rSDK.AFInAppEventParameterName().valueOf(context);
        AFd1fSDK aFd1fSDKAFInAppEventType = AFb1rSDK.AFInAppEventParameterName().AFInAppEventType();
        AFf1tSDK aFf1tSDK = new AFf1tSDK(aFd1fSDKAFInAppEventType, UUID.randomUUID(), string, mapAFInAppEventType, str, responseListener, this);
        AFe1aSDK aFe1aSDKW = aFd1fSDKAFInAppEventType.w();
        aFe1aSDKW.AFInAppEventParameterName.execute(aFe1aSDKW.new AnonymousClass4(aFf1tSDK));
    }

    @Deprecated
    public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
        generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.1
            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponse(String str) {
                responseListener.onResponse(str);
            }

            @Override // com.appsflyer.share.LinkGenerator.ResponseListener
            public final void onResponseError(String str) {
                responseListener.onResponseError(str);
            }
        });
    }
}
