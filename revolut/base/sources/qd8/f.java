package qd8;

import com.revolut.feature.junior_core.api.JuniorCoreApi$Toggles;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.c0;
import nii.y0;
import oki.h;
import qa9.r;
import te8.z;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h implements b {
    public final kd8.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f244890p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f244891q;

    public f(kd8.e consentInteractor, z juniorProductsInteractor, gte.a featureTogglesInteractor) {
        Intrinsics.checkNotNullParameter(consentInteractor, "consentInteractor");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(featureTogglesInteractor, "featureTogglesInteractor");
        this.o = consentInteractor;
        this.f244890p = juniorProductsInteractor;
        this.f244891q = featureTogglesInteractor;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        if (!((jte.d) this.f244891q).c(JuniorCoreApi$Toggles.JuniorSuccessStatusMigration.f76894c)) {
            X1(new y0(null, new c0(null, null, null, false, null, false, false, null, 2047), false, 5));
        }
        l2(new e(this, continuation, 0), new r(this, 22));
    }
}
