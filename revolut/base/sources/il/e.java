package il;

import com.onfido.android.sdk.capture.common.di.SdkComponent;
import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class e implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SdkComponent f162011b;

    public /* synthetic */ e(SdkComponent sdkComponent, int i) {
        this.f162010a = i;
        this.f162011b = sdkComponent;
    }

    @Override // com.onfido.javax.inject.Provider
    public final Object get() {
        switch (this.f162010a) {
            case 0:
                OnfidoApiService onfidoApiService = this.f162011b.onfidoApiService();
                n14.e.f(onfidoApiService);
                return onfidoApiService;
            default:
                String strProvideCustomerUserHash = this.f162011b.provideCustomerUserHash();
                n14.e.f(strProvideCustomerUserHash);
                return strProvideCustomerUserHash;
        }
    }
}
