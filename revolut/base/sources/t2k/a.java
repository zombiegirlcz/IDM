package t2k;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.screen.account.IndiaWithdrawalChooseAccountScreen;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IndiaWithdrawalChooseAccountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(IndiaWithdrawalChooseAccountScreen indiaWithdrawalChooseAccountScreen, Continuation continuation) {
        super(2, continuation);
        this.v = indiaWithdrawalChooseAccountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.R.getValue();
        Object obj3 = model.u;
        f event = new f(obj3);
        hVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        f5j.a aVar2 = obj3 instanceof f5j.a ? (f5j.a) obj3 : null;
        if (aVar2 == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Clicked object should be a Beneficiary");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        } else {
            hVar.C2(new d(aVar2));
        }
        return Unit.f186387a;
    }
}
