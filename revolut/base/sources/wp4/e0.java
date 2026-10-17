package wp4;

import com.revolut.feature.credit.autopay.models.CreditAutopaySourceConfig;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfig;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zh9.u0;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class e0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ i0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(i0 i0Var, Continuation continuation) {
        super(2, continuation);
        this.v = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e0 e0Var = new e0(this.v, continuation);
        e0Var.u = obj2;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        Object next;
        Object next2;
        Object next3;
        Flow flowI;
        lb5.b bVar;
        Flow flowI2;
        CreditCardAutopayPayment.PaymentSource paymentSource;
        i0 i0Var = this.v;
        lb5.b bVar2 = i0Var.f299061r;
        yhm.r rVar = (yhm.r) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        CreditCardAutopayPayments creditCardAutopayPayments = (CreditCardAutopayPayments) rVar.f314201a;
        CreditCardAutopayConfig creditCardAutopayConfig = (CreditCardAutopayConfig) rVar.f314202b;
        wi0.b bVar3 = (wi0.b) rVar.f314203c;
        List list = creditCardAutopayPayments.d;
        xi0.b bVar4 = creditCardAutopayPayments.f70724c;
        Iterator it8 = list.iterator();
        while (true) {
            str = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof CreditCardAutopayPayment.BackupCard) {
                break;
            }
        }
        CreditCardAutopayPayment.BackupCard backupCard = (CreditCardAutopayPayment.BackupCard) next;
        List list2 = creditCardAutopayPayments.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof CreditCardAutopayPayment.AutoPayment) {
                arrayList.add(obj3);
            }
        }
        Iterator it9 = arrayList.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it9.next();
            if (((CreditCardAutopayPayment.AutoPayment) next2).f70706c == nb5.d.ACTIVE) {
                break;
            }
        }
        CreditCardAutopayPayment.AutoPayment autoPayment = (CreditCardAutopayPayment.AutoPayment) next2;
        Iterator it10 = arrayList.iterator();
        while (true) {
            if (!it10.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it10.next();
            if (((CreditCardAutopayPayment.AutoPayment) next3).f70706c == nb5.d.INACTIVE) {
                break;
            }
        }
        CreditCardAutopayPayment.AutoPayment autoPayment2 = (CreditCardAutopayPayment.AutoPayment) next3;
        CreditAutopaySourceConfig creditAutopaySourceConfigC = ((yb5.e) bVar2).c(y0.b(bVar4));
        if (autoPayment == null) {
            return autoPayment2 != null ? zi0.c.i(new c(autoPayment2, bVar3)) : zi0.c.i(new d(bVar3));
        }
        if (backupCard != null && (paymentSource = backupCard.d) != null) {
            str = paymentSource.f70719a;
        }
        if (backupCard == null || backupCard.f70711c == nb5.d.INACTIVE || str == null) {
            Optional optionalEmpty = Optional.empty();
            Intrinsics.checkNotNullExpressionValue(optionalEmpty, "empty(...)");
            flowI = zi0.c.i(optionalEmpty);
        } else {
            flowI = nim.a.v(rd0.e.b(((e0f.z) i0Var.f299063t).c(str, w4l.j.f294644c)), new wnc.x(24));
        }
        String facilityId = i0Var.f299059p.f69097a;
        boolean z = autoPayment.f70705b == nb5.e.DIRECT_DEBIT;
        String mandateId = autoPayment.d.f70719a;
        if (!z || mandateId == null) {
            bVar = bVar2;
            Optional optionalEmpty2 = Optional.empty();
            Intrinsics.checkNotNullExpressionValue(optionalEmpty2, "empty(...)");
            flowI2 = zi0.c.i(optionalEmpty2);
        } else {
            yb5.e eVar = (yb5.e) bVar2;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(mandateId, "mandateId");
            w4l.h loadingStrategy = w4l.h.f294642c;
            bVar = bVar2;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            hd.r rVar2 = eVar.f312201a;
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(mandateId, "mandateId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            flowI2 = c6d.b.i(((x4l.c) rVar2.f).b(new bc5.b(facilityId, mandateId), loadingStrategy), new wk2.x(i0Var, 23));
        }
        Set setB = y0.b(bVar4);
        yb5.e eVar2 = (yb5.e) bVar;
        return nim.a.v(vkm.q.q(u0.i(flowI, flowI2, eVar2.d(eVar2.c(setB)))), new krl.m(autoPayment, i0Var, creditCardAutopayConfig, creditCardAutopayPayments, bVar3, backupCard, creditAutopaySourceConfigC, 14));
    }
}
