package il;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.common.di.SdkComponent;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class f implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SdkComponent f162013b;

    public /* synthetic */ f(SdkComponent sdkComponent, int i) {
        this.f162012a = i;
        this.f162013b = sdkComponent;
    }

    @Override // com.onfido.javax.inject.Provider
    public final Object get() {
        switch (this.f162012a) {
            case 0:
                OnfidoConfig onfidoConfig = this.f162013b.onfidoConfig();
                n14.e.f(onfidoConfig);
                return onfidoConfig;
            default:
                NfcInteractor nfcInteractorProvideNfcInteractor = this.f162013b.provideNfcInteractor();
                n14.e.f(nfcInteractorProvideNfcInteractor);
                return nfcInteractorProvideNfcInteractor;
        }
    }
}
