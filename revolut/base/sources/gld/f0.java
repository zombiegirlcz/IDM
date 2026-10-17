package gld;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import rp0.f1;
import vkm.q0;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends mkd.d {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a0 f144638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bld.j f144639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jld.f f144640n;

    public f0(a0 slotManagerFeedControllerModel, bld.j customRatingMediator, jld.f fincrimeNpsMediator) {
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModel, "slotManagerFeedControllerModel");
        Intrinsics.checkNotNullParameter(customRatingMediator, "customRatingMediator");
        Intrinsics.checkNotNullParameter(fincrimeNpsMediator, "fincrimeNpsMediator");
        this.f144638l = slotManagerFeedControllerModel;
        this.f144639m = customRatingMediator;
        this.f144640n = fincrimeNpsMediator;
    }

    @Override // yji.n
    public final void F2() {
        a0 a0Var = this.f144638l;
        skm.e0.n(a0Var.f144622l.f323100a);
        a0Var.f144623m.clear();
        a0Var.f144624n.clear();
        this.f144639m.getClass();
    }

    @Override // yji.n
    public final void H2() {
        a0 a0Var = this.f144638l;
        Continuation continuation = null;
        yji.n.l2(this, a0Var.j(), null, null, 7);
        yji.n.l2(this, a0Var.i(), null, null, 7);
        yji.n.l2(this, a0Var.f(), null, null, 7);
        yji.n.l2(this, a0Var.g(), null, null, 7);
        skd.j jVar = a0Var.f;
        yji.n.l2(this, vkm.q.H(new ge7.f(a0Var, continuation, 13), new q0(vkm.q.g(jVar.f263838a), new se4.c(jVar, continuation, 9), 1)), null, null, 7);
        bld.m mVar = (bld.m) this.f144639m;
        if (mVar.f16548g.getAndSet(false)) {
            mVar.f.k(bld.m.c());
        }
        yji.n.l2(this, new q0(vkm.q.g(mVar.f), new bf5.a(mVar, continuation, 13), 1), null, new d0(this, continuation, 0), 3);
        yji.n.l2(this, vkm.q.g(((jld.k) this.f144640n).f175728c), null, new d0(this, continuation, 1), 3);
    }

    public final void Z2(TextLocalisedClause textLocalisedClause, String str) {
        yji.n.l2(this, L2(new y0(str, new nii.z(textLocalisedClause, null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, null, 7);
    }

    public final void b3(String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, f1 f1Var, Function0 function0) {
        yji.n.j2(this, L2(new mii.k(str, textLocalisedClause, textLocalisedClause2, null, f1Var, 8)), null, new e0(0, null, function0), 3);
    }

    public final void c3(mkd.c screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        a0 a0Var = this.f144638l;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        a0Var.o.setValue(screen);
    }
}
