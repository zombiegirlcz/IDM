package lb0;

import com.revolut.feature.backend_flow.domain.models.FormScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aa0.b0 f193541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f193542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yc0.g f193543c;
    public final na0.e d;

    public m0(aa0.b0 visibilityInteractor, n0 footerMapper, yc0.g analyticsMapper, na0.e gradientEnabledProvider) {
        Intrinsics.checkNotNullParameter(visibilityInteractor, "visibilityInteractor");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        Intrinsics.checkNotNullParameter(analyticsMapper, "analyticsMapper");
        Intrinsics.checkNotNullParameter(gradientEnabledProvider, "gradientEnabledProvider");
        this.f193541a = visibilityInteractor;
        this.f193542b = footerMapper;
        this.f193543c = analyticsMapper;
        this.d = gradientEnabledProvider;
    }

    public final boolean a(FormScreen formScreen, k0 k0Var) {
        boolean z;
        if (k0Var instanceof j0) {
            z = true;
        } else {
            if (!(k0Var instanceof i0)) {
                throw new NoWhenBranchMatchedException();
            }
            z = ((i0) k0Var).f193539a;
        }
        return z && this.f193541a.d(formScreen);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a0  */
    @Override // lb0.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final aw0.i i(com.revolut.feature.backend_flow.domain.models.FormScreen r27, lb0.k0 r28, lb0.h0 r29) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb0.m0.i(com.revolut.feature.backend_flow.domain.models.FormScreen, lb0.k0, lb0.h0):aw0.i");
    }
}
