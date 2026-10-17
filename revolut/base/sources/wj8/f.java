package wj8;

import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.feature.junior_profile.impl.ui.screen.details.JuniorProfileDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorProfileDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(JuniorProfileDetailsScreen juniorProfileDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorProfileDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ProductSelectionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProductSelectionDelegate.Model model = (ProductSelectionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarE3 = this.v.R2();
        Intrinsics.h(model);
        c0 c0Var = (c0) sVarE3;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        c0Var.l2(new wgb.v(c0Var, new b0(model, c0Var, null), (Continuation) null), new yi5.b(26));
        return Unit.f186387a;
    }
}
