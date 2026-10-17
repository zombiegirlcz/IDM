package il;

import android.content.Context;
import com.onfido.android.sdk.capture.common.di.SdkComponent;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SdkComponent f162003b;

    public /* synthetic */ a(SdkComponent sdkComponent, int i) {
        this.f162002a = i;
        this.f162003b = sdkComponent;
    }

    @Override // com.onfido.javax.inject.Provider
    public final Object get() {
        switch (this.f162002a) {
            case 0:
                Context contextApplicationContext = this.f162003b.applicationContext();
                n14.e.f(contextApplicationContext);
                return contextApplicationContext;
            case 1:
                OnfidoRemoteConfig onfidoRemoteConfig = this.f162003b.onfidoRemoteConfig();
                n14.e.f(onfidoRemoteConfig);
                return onfidoRemoteConfig;
            default:
                WaitingScreenTracker waitingScreenTracker = this.f162003b.waitingScreenTracker();
                n14.e.f(waitingScreenTracker);
                return waitingScreenTracker;
        }
    }
}
