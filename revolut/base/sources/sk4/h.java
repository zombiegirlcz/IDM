package sk4;

import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v2.SelectAutopayMethodScreenV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import sk4.b;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SelectAutopayMethodScreenV2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SelectAutopayMethodScreenV2 selectAutopayMethodScreenV2, Continuation continuation) {
        super(2, continuation);
        this.v = selectAutopayMethodScreenV2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((ProductSelectionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProductSelectionDelegate.Model model = (ProductSelectionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = model.f52973a;
        int iHashCode = str.hashCode();
        SelectAutopayMethodScreenV2 selectAutopayMethodScreenV2 = this.v;
        if (iHashCode != -1137518063) {
            if (iHashCode != 694482729) {
                if (iHashCode == 1828022365 && str.equals("id_external_account")) {
                    ((e) selectAutopayMethodScreenV2.T2()).v2(b.C1467b.f263768a);
                }
            } else if (str.equals("id_revolut_account")) {
                ((e) selectAutopayMethodScreenV2.T2()).v2(b.d.f263770a);
            }
        } else if (str.equals("id_revolut_manual_payment")) {
            ((e) selectAutopayMethodScreenV2.T2()).v2(b.c.f263769a);
        }
        return Unit.f186387a;
    }
}
