package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
public final class AFf1tSDK extends AFf1qSDK<String> {
    private final String AFLogger;
    private final String afInfoLog;
    private final LinkGenerator.ResponseListener force;

    @NonNull
    private final UUID i;
    private final Map<String, String> v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    private final LinkGenerator f26029w;

    public AFf1tSDK(@NonNull AFd1fSDK aFd1fSDK, @NonNull UUID uuid, @NonNull String str, @NonNull Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener, @NonNull LinkGenerator linkGenerator) {
        super(AFf1ySDK.ONELINK, new AFf1ySDK[]{AFf1ySDK.RC_CDN}, aFd1fSDK, uuid.toString());
        this.i = uuid;
        this.AFLogger = str;
        this.v = new HashMap(map);
        this.force = responseListener;
        this.afInfoLog = str2;
        this.f26029w = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final void AFInAppEventType() {
        ResponseNetwork responseNetwork;
        super.AFInAppEventType();
        LinkGenerator.ResponseListener responseListener = this.force;
        if (responseListener != null) {
            if (this.values == AFe1fSDK.SUCCESS && (responseNetwork = ((AFf1qSDK) this).d) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable thD = d();
            if (!(thD instanceof ParsingException)) {
                responseListener.onResponse(this.f26029w.generateLink());
            } else if (((ParsingException) thD).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(this.f26029w.generateLink());
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final AFe1uSDK<String> AFKeystoreWrapper(@NonNull String str) {
        return this.e.AFKeystoreWrapper(this.AFLogger, this.v, this.afInfoLog, this.i, str);
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1qSDK
    public final boolean force() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1qSDK, com.appsflyer.internal.AFf1xSDK
    public final long valueOf() {
        return CapturePresenter.PASSPORT_OVERLAY_DELAY_MS;
    }
}
