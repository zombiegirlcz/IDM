package qdk;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.plan_rewards.impl.presentation.monthly_draw_hub.screen.MonthlyDrawHubScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okl.l1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class w0 extends oki.h implements q0 {

    @NotNull
    private static final s0 Companion = new s0();
    public final gdk.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ffk.t f244988p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f244989q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cli.y f244990r;

    public w0(MonthlyDrawHubScreenContract$InputData inputData, gdk.d interactor, ffk.t pricingPlanInteractor, m5e.o stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f244988p = pricingPlanInteractor;
        this.f244989q = new vii.b(w4l.i.f294643c);
        this.f244990r = mra.d.b(this, new x(null, new Data(null, null, true, 3, null), inputData.f102569a, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        vkm.d dVarB = rd0.e.b(this.f244988p.q());
        zhm.h0 h0Var = zhm.h0.f322473a;
        yji.l.a1(this, new l1(rd0.e.n(dVarB, h0Var), 3), null, null, new u0(this, null, 1), 3);
        yji.l.a1(this, rd0.e.n(vkm.q.Q(this.f244989q, new q7b.j((Continuation) null, this, 12)), h0Var), null, null, new u0(this, null, 0), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (j2 > 0) {
            this.f244989q.a();
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f244990r;
    }
}
