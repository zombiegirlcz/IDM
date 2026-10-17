package uai;

import a0e.n;
import cli.y;
import cli.z;
import com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.t;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends oki.h implements z {
    public final vai.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xai.a f278671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final EmailVerificationCooldownBottomSheetContract$InputData f278672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pai.a f278673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f278674s;

    public i(g mapper, vai.c cooldownTimer, xai.a emailVerificationEventObserver, EmailVerificationCooldownBottomSheetContract$InputData inputData, pai.a emailVerificationInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(cooldownTimer, "cooldownTimer");
        Intrinsics.checkNotNullParameter(emailVerificationEventObserver, "emailVerificationEventObserver");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(emailVerificationInteractor, "emailVerificationInteractor");
        this.o = cooldownTimer;
        this.f278671p = emailVerificationEventObserver;
        this.f278672q = inputData;
        this.f278673r = emailVerificationInteractor;
        this.f278674s = mra.d.b(this, new a(cooldownTimer.a(), 0), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.f278671p.f303891a, null, null, new u07.b(this, null, 21), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        vai.c cVar = this.o;
        Continuation continuation = null;
        l.b1(this, new t(q.Q(cVar.f287301a, new uec.d(continuation, cVar, 21)), new n(this, continuation, 14)), null, new h(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f278674s;
    }
}
