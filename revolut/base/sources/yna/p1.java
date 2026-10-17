package yna;

import com.revolut.core.ui_kit.delegates.PlanWidgetDelegate;
import com.revolut.feature.profile.impl.ui.profile.screens.main.ProfileScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ProfileScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(ProfileScreen profileScreen, Continuation continuation) {
        super(2, continuation);
        this.v = profileScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p1 p1Var = new p1(this.v, continuation);
        p1Var.u = obj2;
        return p1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p1) create((PlanWidgetDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PlanWidgetDelegate.Model item = (PlanWidgetDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c0 c0VarT2 = this.v.T2();
        Intrinsics.h(item);
        c1 c1Var = (c1) c0VarT2;
        c1Var.getClass();
        Intrinsics.checkNotNullParameter(item, "model");
        String str = item.f52956a;
        if (Intrinsics.f(str, "ID_PLAN")) {
            c1Var.G2();
        } else if (Intrinsics.f(str, "ID_COBRANDED_PLAN")) {
            c1Var.l2(new v0(c1Var, null, 1), new yi5.b(26));
        } else {
            c1Var.m0.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
        }
        return Unit.f186387a;
    }
}
