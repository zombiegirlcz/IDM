package gs;

import com.revolut.biometric_verification.impl.ui.flow.launcher.extensions.polling_report.BiometricVerificationPollingReportDialogMapperImpl;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.j2;
import vkm.t0;

/* JADX INFO: loaded from: classes17.dex */
public final class r extends yji.n implements vki.b {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zr.k f146265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final BiometricVerificationPollingReportDialogMapperImpl f146266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a2 f146267n;
    public a2 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j2 f146268p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vki.a f146269q;

    public r(zr.k biometricVerificationInteractor, BiometricVerificationPollingReportDialogMapperImpl dialogMapper) {
        Intrinsics.checkNotNullParameter(biometricVerificationInteractor, "biometricVerificationInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.f146265l = biometricVerificationInteractor;
        this.f146266m = dialogMapper;
        this.f146268p = vkm.q.c(null);
        this.f146269q = pyd.c.a(this, new k(null, d.f146251a, true, 0, false));
    }

    public static final rv6.e Z2(r rVar, y0 y0Var) {
        return (rv6.e) rVar.L2(y0.a(y0Var, null, ((k) ((j2) rVar.f146269q.f22677a).getValue()).e, 3));
    }

    @Override // yji.n
    public final void H2() {
        Continuation continuation = null;
        yji.n.l2(this, new t0(vkm.q.H(new d4f.m(2, 21, continuation), (j2) this.f146269q.f22677a), 1), null, new gm6.j(this, continuation, 10), 3);
        yji.n.j2(this, vkm.q.Q(new t0(this.f146268p, 1), new n(continuation, this, 0)), null, new o(this, null), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f146269q;
    }
}
