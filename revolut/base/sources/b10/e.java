package b10;

import com.revolut.camerakit.validators.config.StraightFaceValidatorConfig;
import com.revolut.camerakit.validators.exceptions.CameraKitValidatorException;
import dx.k;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import xv.i;
import xv.m;
import xv.p;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StraightFaceValidatorConfig f11702a;

    public e(StraightFaceValidatorConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f11702a = config;
    }

    @Override // xv.p
    public final Object b(List list, Continuation continuation, i iVar, m mVar) {
        StraightFaceValidatorConfig straightFaceValidatorConfig = this.f11702a;
        float f = straightFaceValidatorConfig.f50936c;
        float f4 = straightFaceValidatorConfig.f50935b;
        float f5 = straightFaceValidatorConfig.f50934a;
        dx.a aVar = iVar instanceof dx.a ? (dx.a) iVar : null;
        if (aVar == null) {
            return new b(null, new CameraKitValidatorException("MlKitFaceDetectorRawResult should be provided in result", null, 6));
        }
        k kVar = aVar.f120490a;
        float fC = kVar.c();
        float fA = kVar.a();
        float fD = kVar.d();
        boolean z = Math.abs(kVar.c()) > f5;
        boolean z3 = Math.abs(fA) > f4;
        boolean z4 = Math.abs(fD) > f;
        if (!z && !z3 && !z4) {
            return new c(new a(fC, fA, fD));
        }
        a aVar2 = new a(fC, fA, fD);
        String it8 = "roll = " + fC + " violated by threshold " + f5 + ", ";
        Intrinsics.checkNotNullParameter(it8, "it");
        if (!z) {
            it8 = "";
        }
        String it9 = "yaw = " + fA + " violated by threshold " + f4 + ", ";
        Intrinsics.checkNotNullParameter(it9, "it");
        if (!z3) {
            it9 = "";
        }
        String it10 = "pitch = " + fD + " violated by threshold " + f;
        Intrinsics.checkNotNullParameter(it10, "it");
        if (!z4) {
            it10 = "";
        }
        return new b(aVar2, new CameraKitValidatorException(a0.d.s("Face is not straight with ", it8, it9, it10), null, 6));
    }
}
