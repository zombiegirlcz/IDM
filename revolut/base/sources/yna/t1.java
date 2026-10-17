package yna;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.profile.impl.ui.profile.screens.main.ProfileScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ProfileScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(ProfileScreen profileScreen, Continuation continuation) {
        super(2, continuation);
        this.v = profileScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t1 t1Var = new t1(this.v, continuation);
        t1Var.u = obj2;
        return t1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t1) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c0 c0VarT2 = this.v.T2();
        Intrinsics.h(model);
        c1 c1Var = (c1) c0VarT2;
        c1Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52613a, "CheckUsernameAllowance_REMAINING_ATTEMPTS_DIALOG_ID")) {
            d6k.g gVar = (d6k.g) c1Var.D;
            j60.a.v(gVar.o, false, new co7.a(gVar, 26), 1);
        }
        return Unit.f186387a;
    }
}
