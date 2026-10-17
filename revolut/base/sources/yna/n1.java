package yna;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.profile.impl.ui.profile.screens.main.ProfileScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ProfileScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(ProfileScreen profileScreen, Continuation continuation) {
        super(2, continuation);
        this.v = profileScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n1 n1Var = new n1(this.v, continuation);
        n1Var.u = obj2;
        return n1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n1) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item action = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c0 c0VarT2 = this.v.T2();
        Intrinsics.h(action);
        c1 c1Var = (c1) c0VarT2;
        c1Var.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        String str = action.f58316a;
        Continuation continuation = null;
        if (Intrinsics.f(str, "ID_REV_TAG")) {
            c1Var.l2(new u0(c1Var, continuation, 1), new yi5.b(26));
        } else if (Intrinsics.f(str, "ID_ESIM")) {
            c1Var.l2(new v0(c1Var, null, 2), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
