package il;

import com.onfido.android.sdk.capture.common.di.SdkComponent;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.api.client.token.sdk.ApplicantId;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class d implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SdkComponent f162009b;

    public /* synthetic */ d(SdkComponent sdkComponent, int i) {
        this.f162008a = i;
        this.f162009b = sdkComponent;
    }

    @Override // com.onfido.javax.inject.Provider
    public final Object get() {
        switch (this.f162008a) {
            case 0:
                OnfidoAnalytics onfidoAnalytics = this.f162009b.onfidoAnalytics();
                n14.e.f(onfidoAnalytics);
                return onfidoAnalytics;
            default:
                ApplicantId applicantIdProvideApplicantId = this.f162009b.provideApplicantId();
                n14.e.f(applicantIdProvideApplicantId);
                return applicantIdProvideApplicantId;
        }
    }
}
