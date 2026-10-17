package gie;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import vkm.z1;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends f {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lie.b f144135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rxl.b f144136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z1 f144137n;

    public i(lie.b tabAccountsNudgeInteractor, rxl.b nudgeDisplayer) {
        Intrinsics.checkNotNullParameter(tabAccountsNudgeInteractor, "tabAccountsNudgeInteractor");
        Intrinsics.checkNotNullParameter(nudgeDisplayer, "nudgeDisplayer");
        this.f144135l = tabAccountsNudgeInteractor;
        this.f144136m = nudgeDisplayer;
        this.f144137n = ta6.a.a(1);
    }

    @Override // yji.n
    public final void F2() {
        this.f144137n.k(Boolean.FALSE);
    }

    @Override // yji.n
    public final void H2() {
        this.f144137n.k(Boolean.TRUE);
    }

    @Override // gie.f
    public final void Z2(Flow currentAccountContentFlow, boolean z) {
        Intrinsics.checkNotNullParameter(currentAccountContentFlow, "currentAccountContentFlow");
        Flow flowQ = vkm.q.Q(this.f144137n, new eh9.j((Continuation) null, this, currentAccountContentFlow, 13));
        if (z) {
            flowQ = vkm.q.C(flowQ, p0.f264002b);
        }
        yji.n.l2(this, flowQ, null, new gaa.g(this, null, 29), 3);
    }

    @Override // gie.f
    public final void b3() {
        z1 z1Var = this.f144137n;
        Object objD0 = d0.d0(z1Var.d());
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.f(objD0, bool)) {
            z1Var.k(bool);
        }
    }
}
