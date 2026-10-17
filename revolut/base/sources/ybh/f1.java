package ybh;

import aw0.f4;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.WealthAddMoneyScreen;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WealthAddMoneyScreen f312307w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(WealthAddMoneyScreen wealthAddMoneyScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f312307w = wealthAddMoneyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f1 f1Var = new f1(this.f312307w, continuation, 0);
                f1Var.v = obj2;
                return f1Var;
            case 1:
                f1 f1Var2 = new f1(this.f312307w, continuation, 1);
                f1Var2.v = obj2;
                return f1Var2;
            case 2:
                f1 f1Var3 = new f1(this.f312307w, continuation, 2);
                f1Var3.v = obj2;
                return f1Var3;
            case 3:
                f1 f1Var4 = new f1(this.f312307w, continuation, 3);
                f1Var4.v = obj2;
                return f1Var4;
            case 4:
                f1 f1Var5 = new f1(this.f312307w, continuation, 4);
                f1Var5.v = obj2;
                return f1Var5;
            default:
                f1 f1Var6 = new f1(this.f312307w, continuation, 5);
                f1Var6.v = obj2;
                return f1Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f1) create((o) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f1) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f1) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f1) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f1) create((OrderQuoteParams) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f1) create((usb.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WealthAddMoneyScreen wealthAddMoneyScreen = this.f312307w;
        switch (i) {
            case 0:
                o oVar = (o) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) wealthAddMoneyScreen.R2()).accept(new k(oVar.f312337a));
                break;
            case 1:
                Object obj3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarR2 = wealthAddMoneyScreen.R2();
                Intrinsics.h(obj3);
                ((com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) sVarR2).accept(new f(obj3));
                break;
            case 2:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) wealthAddMoneyScreen.R2()).accept(new a(charSequence.toString()));
                break;
            case 3:
                f4 f4Var = (f4) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) wealthAddMoneyScreen.R2()).accept(new i(f4Var.f10304b));
                break;
            case 4:
                OrderQuoteParams orderQuoteParams = (OrderQuoteParams) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarR22 = wealthAddMoneyScreen.R2();
                Intrinsics.h(orderQuoteParams);
                ((com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) sVarR22).accept(new h(orderQuoteParams));
                break;
            default:
                usb.j jVar = (usb.j) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVarR23 = wealthAddMoneyScreen.R2();
                Intrinsics.h(jVar);
                ((com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) sVarR23).accept(new c(jVar));
                break;
        }
        return Unit.f186387a;
    }
}
