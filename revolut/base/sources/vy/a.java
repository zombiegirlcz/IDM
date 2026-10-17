package vy;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.biometric_verification.api.models.FaceDetectionResource;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.client.api.models.CameraKitUiSettings;
import com.revolut.camerakit.revolut.ui.flow.CameraKitFlowContract$FlowType;
import h30.l;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraKitFlowContract$FlowType f293107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraKitUiSettings f293108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraKitClientSettings f293109c;
    public final ry.a d;
    public final Set e;
    public final AnalyticsProduct f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w0 f293110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f293111h;
    public final FaceDetectionResource i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f293112j;

    public a(CameraKitFlowContract$FlowType flowType, CameraKitUiSettings cameraKitUiSettings, CameraKitClientSettings cameraKitClientSettings, ry.a cameraScreenSettings, Set validatorConfigs, AnalyticsProduct analyticsProduct, w0 w0Var, boolean z, FaceDetectionResource faceDetectionResource, boolean z3) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(cameraKitUiSettings, "cameraKitUiSettings");
        Intrinsics.checkNotNullParameter(cameraKitClientSettings, "cameraKitClientSettings");
        Intrinsics.checkNotNullParameter(cameraScreenSettings, "cameraScreenSettings");
        Intrinsics.checkNotNullParameter(validatorConfigs, "validatorConfigs");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f293107a = flowType;
        this.f293108b = cameraKitUiSettings;
        this.f293109c = cameraKitClientSettings;
        this.d = cameraScreenSettings;
        this.e = validatorConfigs;
        this.f = analyticsProduct;
        this.f293110g = w0Var;
        this.f293111h = z;
        this.i = faceDetectionResource;
        this.f293112j = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f293107a, aVar.f293107a) && Intrinsics.f(this.f293108b, aVar.f293108b) && Intrinsics.f(this.f293109c, aVar.f293109c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f293110g, aVar.f293110g) && this.f293111h == aVar.f293111h && Intrinsics.f(this.i, aVar.i) && this.f293112j == aVar.f293112j;
    }

    public final int hashCode() {
        int iC = j6.a.c((AnalyticsContext.a(this.f293110g) + l.a(p.a.f((this.d.hashCode() + ((this.f293109c.hashCode() + ((this.f293108b.hashCode() + (this.f293107a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f)) * 31, 31, this.f293111h);
        FaceDetectionResource faceDetectionResource = this.i;
        return Boolean.hashCode(this.f293112j) + ((iC + (faceDetectionResource == null ? 0 : faceDetectionResource.hashCode())) * 31);
    }
}
