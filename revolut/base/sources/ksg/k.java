package ksg;

import com.revolut.data.model.Data;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gsg.d f189462p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f189463q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f189464r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p stateMapper, gsg.d removeObstaclesInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(removeObstaclesInteractor, "removeObstaclesInteractor");
        this.f189462p = removeObstaclesInteractor;
        this.f189463q = new e(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void T1(long j2) {
        z2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f189463q;
    }

    public final void y2(FincrimeHomeScreenAction fincrimeHomeScreenAction) throws Throwable {
        if (fincrimeHomeScreenAction == null) {
            return;
        }
        if (fincrimeHomeScreenAction instanceof FincrimeHomeScreenAction.Deeplink) {
            v2(new f(((FincrimeHomeScreenAction.Deeplink) fincrimeHomeScreenAction).f64132a));
            return;
        }
        if (!(fincrimeHomeScreenAction instanceof FincrimeHomeScreenAction.Dismiss) && !(fincrimeHomeScreenAction instanceof FincrimeHomeScreenAction.Dialog) && !(fincrimeHomeScreenAction instanceof FincrimeHomeScreenAction.PopupMenu) && !(fincrimeHomeScreenAction instanceof FincrimeHomeScreenAction.Request)) {
            throw new NoWhenBranchMatchedException();
        }
        hx7.e.n(new IllegalStateException("Unsupported action " + fincrimeHomeScreenAction + " for RemoveObstaclesScreen"));
    }

    public final void z2() {
        a2 a2Var = this.f189464r;
        if (a2Var != null) {
            a2Var.f(null);
        }
        x2(new kog.k(this, 16));
        this.f189464r = yji.l.b1(this, this.f189462p.c(false), null, new j(this, null), 3);
    }
}
