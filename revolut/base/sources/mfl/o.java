package mfl;

import cli.y;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m2f.b0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends oki.h implements dli.b, od0.f {

    @NotNull
    public static final n Companion = new n();
    public final h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jx0.a f205034p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f205035q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f205036r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lazy f205037s;

    public o(g initialState, kxk.o stateMapper, h domainStateProvider, jx0.a reportLinkProvider, i inputData) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(domainStateProvider, "domainStateProvider");
        Intrinsics.checkNotNullParameter(reportLinkProvider, "reportLinkProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = domainStateProvider;
        this.f205034p = reportLinkProvider;
        this.f205035q = inputData;
        this.f205036r = mra.d.b(this, initialState, stateMapper, null, false, 12);
        this.f205037s = yhm.j.b(new b(1));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.o.a(), null, null, new m75.i(this, null, 22), 3);
    }

    @Override // od0.f
    public final void accept(Object obj2) {
        f action = (f) obj2;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action.equals(d.f205022a)) {
            B2();
        } else {
            if (!(action instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new b0(this, ((e) action).f205023a, null, 23), new yi5.b(26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f205036r;
    }
}
