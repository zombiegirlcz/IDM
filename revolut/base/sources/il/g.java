package il;

import com.onfido.android.sdk.capture.common.di.SdkComponent;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.api.client.OnfidoFetcher;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class g implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SdkComponent f162015b;

    public /* synthetic */ g(SdkComponent sdkComponent, int i) {
        this.f162014a = i;
        this.f162015b = sdkComponent;
    }

    @Override // com.onfido.javax.inject.Provider
    public final Object get() {
        switch (this.f162014a) {
            case 0:
                OnfidoFetcher onfidoFetcher = this.f162015b.onfidoFetcher();
                n14.e.f(onfidoFetcher);
                return onfidoFetcher;
            default:
                SchedulersProvider schedulersProvider = this.f162015b.schedulersProvider();
                n14.e.f(schedulersProvider);
                return schedulersProvider;
        }
    }
}
