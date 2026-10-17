package e2f;

import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.j1;
import nii.n1;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u2f.h f122066w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b bVar, u2f.h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f122066w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g0 g0Var = new g0(this.v, this.f122066w, continuation);
        g0Var.u = obj2;
        return g0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j1 j1Var = n1Var instanceof j1 ? (j1) n1Var : null;
        if (j1Var == null) {
            return Unit.f186387a;
        }
        if (Intrinsics.f(j1Var.f216180b.f275445a, "ERROR_DIALOG_SIGN_UP_ITEM_ID")) {
            this.v.C1(new ExternalDestination.Browser(this.f122066w.f, null));
        }
        return Unit.f186387a;
    }
}
