package yna;

import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.feature.profile.impl.ui.profile.screens.main.ProfileScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ProfileScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(ProfileScreen profileScreen, Continuation continuation) {
        super(2, continuation);
        this.v = profileScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k1 k1Var = new k1(this.v, continuation);
        k1Var.u = obj2;
        return k1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k1) create((ActionCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionCardDelegate.Model model = (ActionCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c0 c0VarT2 = this.v.T2();
        Intrinsics.h(model);
        c1 c1Var = (c1) c0VarT2;
        c1Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51573a;
        if (Intrinsics.f(str, "ID_PLAN")) {
            c1Var.G2();
        } else if (Intrinsics.f(str, "ID_INVITE_FRIENDS")) {
            Object obj3 = model.k;
            c1Var.B2(obj3 instanceof pwa.n ? (pwa.n) obj3 : null);
        }
        return Unit.f186387a;
    }
}
