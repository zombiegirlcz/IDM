package tu2;

import com.revolut.feature.card.terminate.impl.ui.flow.screen.CardTerminateScreenContract$InputData;
import jki.i;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tjf.p0;
import tpl.o;
import tqh.j;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends jki.g implements jki.h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CardTerminateScreenContract$InputData f274524p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l93.f f274525q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f274526r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pu2.d f274527s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o f274528t;
    public final a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, CardTerminateScreenContract$InputData inputData, l93.f interactor, j60.a dialogView, pu2.d dialogMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.f274524p = inputData;
        this.f274525q = interactor;
        this.f274526r = dialogView;
        this.f274527s = dialogMapper;
        this.f274528t = new o(this, 16);
        this.u = new a(null);
    }

    @Override // yji.l
    public final void I1() {
        l2(new p0(this, null, 13), this.f274528t);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, rd0.e.b(this.f274526r.E()), null, new tna.p(this, null, 13), 3);
    }

    @Override // jki.g
    public final i r2() {
        return this.u;
    }

    public final void y2(pu2.c action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action.equals(pu2.a.f239804a)) {
            v2(b.f274521a);
        } else {
            if (!(action instanceof pu2.b)) {
                throw new NoWhenBranchMatchedException();
            }
            j60.a.v(this.f274526r, false, null, 3);
            l2(new j(this, ((pu2.b) action).f239805a, null, 9), this.f274528t);
        }
    }
}
