package kd3;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.cashback.impl.ui.pocket.details.CashbackPocketDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CashbackPocketDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CashbackPocketDetailsScreen cashbackPocketDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cashbackPocketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarT2 = this.v.T2();
        Intrinsics.h(model);
        m mVar = (m) hVarT2;
        j60.a aVar2 = mVar.v;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (Intrinsics.f(str, "ID_SELECT_CURRENCY")) {
            j60.a.v(aVar2, true, null, 2);
            mVar.n2(new l(mVar, model, null), new whi.b(6));
        } else if (Intrinsics.f(str, "ID_GOT_IT")) {
            j60.a.v(aVar2, false, null, 3);
        }
        return Unit.f186387a;
    }
}
