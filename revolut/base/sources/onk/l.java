package onk;

import akd.s;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ojk.a0;
import ojk.b0;
import ojk.q;
import ojk.v;
import okf.m;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends q implements h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final egk.e f226964t;
    public final cha.c u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f226965w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s f226966x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n stateMapper, egk.e plansUiInteractor, cha.c studentPlanInteractor, mkd.d slotManagerFeedExtension, q06.l deeplinkRouter, ajk.c bottomSheetNavigationResolver, ajk.b outOfAppNavigationProvider) {
        super(deeplinkRouter, slotManagerFeedExtension, bottomSheetNavigationResolver, outOfAppNavigationProvider, false);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(plansUiInteractor, "plansUiInteractor");
        Intrinsics.checkNotNullParameter(studentPlanInteractor, "studentPlanInteractor");
        Intrinsics.checkNotNullParameter(slotManagerFeedExtension, "slotManagerFeedExtension");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(bottomSheetNavigationResolver, "bottomSheetNavigationResolver");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        this.f226964t = plansUiInteractor;
        this.u = studentPlanInteractor;
        this.v = new vii.b(w4l.i.f294643c);
        this.f226965w = mra.d.b(this, new d(new Data(null, null, true, 3, null), new a0(new ojk.y(r0.g()), new Data(null, null, true, 3, null), new b0(null))), stateMapper, null, false, 12);
        this.f226966x = s.STUDENT_HUB;
    }

    @Override // ojk.q, yji.l
    public final void I1() {
        super.I1();
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.v, new m(continuation, this, 5)), null, null, new oli.f(this, continuation, 10), 3);
    }

    @Override // ojk.q
    public final s I2() {
        return this.f226966x;
    }

    @Override // ojk.q
    public final y L2() {
        return this.f226965w;
    }

    @Override // ojk.q
    public final v M2(v vVar, a0 extraData) {
        d currentState = (d) vVar;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return d.c(currentState, null, extraData, 1);
    }

    @Override // ojk.q, yji.l
    public final void T1(long j2) {
        super.T1(j2);
        yji.l.b1(this, mo3.a.g(cha.c.a(this.u), null, null, 3), null, new k(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f226965w;
    }

    @Override // ojk.c0
    public final void h0() {
        this.v.a();
    }
}
