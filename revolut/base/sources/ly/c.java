package ly;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.api.models.BiometricVerificationFeatures;
import com.revolut.biometric_verification.api.models.FaceDetectionResource;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.client.api.models.CameraKitUiSettings;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlowContract$FlowType;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitFlowContract$FlowType f200604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraKitUiSettings f200605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraKitClientSettings f200606c;
    public final ry.a d;
    public final Set e;
    public final AnalyticsProduct f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w0 f200607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f200608h;
    public final BiometricVerificationFeatures i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FaceDetectionResource f200609j;
    public final boolean k;

    public c(CameraKitFlowContract$FlowType flowType, CameraKitUiSettings cameraKitUiSettings, CameraKitClientSettings cameraKitClientSettings, ry.a cameraScreenSettings, Set validatorConfigs, AnalyticsProduct analyticsProduct, w0 w0Var, boolean z, BiometricVerificationFeatures biometricVerificationFeatures, FaceDetectionResource faceDetectionResource, boolean z3) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(cameraKitUiSettings, "cameraKitUiSettings");
        Intrinsics.checkNotNullParameter(cameraKitClientSettings, "cameraKitClientSettings");
        Intrinsics.checkNotNullParameter(cameraScreenSettings, "cameraScreenSettings");
        Intrinsics.checkNotNullParameter(validatorConfigs, "validatorConfigs");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(biometricVerificationFeatures, "biometricVerificationFeatures");
        this.f200604a = flowType;
        this.f200605b = cameraKitUiSettings;
        this.f200606c = cameraKitClientSettings;
        this.d = cameraScreenSettings;
        this.e = validatorConfigs;
        this.f = analyticsProduct;
        this.f200607g = w0Var;
        this.f200608h = z;
        this.i = biometricVerificationFeatures;
        this.f200609j = faceDetectionResource;
        this.k = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f200604a, cVar.f200604a) && Intrinsics.f(this.f200605b, cVar.f200605b) && Intrinsics.f(this.f200606c, cVar.f200606c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f200607g, cVar.f200607g) && this.f200608h == cVar.f200608h && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f200609j, cVar.f200609j) && this.k == cVar.k;
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + j6.a.c((AnalyticsContext.a(this.f200607g) + h30.l.a(p.a.f((this.d.hashCode() + ((this.f200606c.hashCode() + ((this.f200605b.hashCode() + (this.f200604a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f)) * 31, 31, this.f200608h)) * 31;
        FaceDetectionResource faceDetectionResource = this.f200609j;
        return Boolean.hashCode(this.k) + ((iHashCode + (faceDetectionResource == null ? 0 : faceDetectionResource.hashCode())) * 31);
    }

    public /* synthetic */ c(CameraKitFlowContract$FlowType cameraKitFlowContract$FlowType, CameraKitUiSettings cameraKitUiSettings, CameraKitClientSettings cameraKitClientSettings, ry.a aVar, Set set, AnalyticsProduct analyticsProduct, w0 w0Var, boolean z, BiometricVerificationFeatures biometricVerificationFeatures, boolean z3, int i) {
        this(cameraKitFlowContract$FlowType, cameraKitUiSettings, cameraKitClientSettings, aVar, set, analyticsProduct, w0Var, z, biometricVerificationFeatures, (FaceDetectionResource) null, (i & 1024) != 0 ? false : z3);
    }
}
