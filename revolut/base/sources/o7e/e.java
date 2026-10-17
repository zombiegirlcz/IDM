package o7e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.subaccount.impl.ui.bill.screen.BillAccountDetailScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BillAccountDetailScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BillAccountDetailScreen billAccountDetailScreen, Continuation continuation) {
        super(2, continuation);
        this.v = billAccountDetailScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarI3 = this.v.T2();
        String resId = model.f53228a;
        Object obj3 = model.u;
        k kVar = (k) hVarI3;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(resId, "resId");
        if (obj3 instanceof k6e.f) {
            kVar.l2(new nyd.j(resId, kVar, obj3, (Continuation) null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
