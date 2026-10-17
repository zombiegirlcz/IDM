package il;

import com.onfido.android.sdk.capture.common.di.SdkComponent;
import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import com.onfido.javax.inject.Provider;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SdkComponent f162007b;

    public /* synthetic */ c(SdkComponent sdkComponent, int i) {
        this.f162006a = i;
        this.f162007b = sdkComponent;
    }

    @Override // com.onfido.javax.inject.Provider
    public final Object get() {
        switch (this.f162006a) {
            case 0:
                Json jsonParser = this.f162007b.getJsonParser();
                n14.e.f(jsonParser);
                return jsonParser;
            default:
                OnfidoTokenProvider onfidoTokenProvider = this.f162007b.onfidoTokenProvider();
                n14.e.f(onfidoTokenProvider);
                return onfidoTokenProvider;
        }
    }
}
