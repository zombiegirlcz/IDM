package wr1;

import cli.y;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount.TapiTransferAmountScreen;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteRate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ TapiTransferAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TapiTransferAmountScreen tapiTransferAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = tapiTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        aii.r jVar;
        xi0.b bVar;
        ApmQuoteRate apmQuoteRate;
        ApmQuoteRate apmQuoteRate2;
        xi0.b bVar2;
        ApmQuoteRate apmQuoteRate3;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVar = (u) this.u.R2();
        uVar.getClass();
        xi0.a aVar2 = xi0.b.Companion;
        y yVar = uVar.f299511t;
        String str = ((g) ((j2) yVar.f22677a).getValue()).f.f282231b.f163147c;
        aVar2.getClass();
        xi0.b bVarA = xi0.a.a(str);
        ApmQuote apmQuote = ((g) ((j2) yVar.f22677a).getValue()).f299489g;
        xi0.b bVar3 = xi0.b.z;
        if (bVarA.equals(bVar3)) {
            jVar = new h(apmQuote != null ? apmQuote.d : null);
        } else {
            if (apmQuote == null || (apmQuoteRate3 = apmQuote.f62209a) == null || (bVar = apmQuoteRate3.f62229b) == null) {
                bVar = bVar3;
            }
            if (apmQuote != null && (apmQuoteRate2 = apmQuote.f62209a) != null && (bVar2 = apmQuoteRate2.f62230c) != null) {
                bVar3 = bVar2;
            }
            jVar = new j(apmQuote, new n9l.a((apmQuote == null || (apmQuoteRate = apmQuote.f62209a) == null) ? 0.0d : apmQuoteRate.f62228a, bVar, bVar3));
        }
        uVar.C2(jVar);
        return Unit.f186387a;
    }
}
