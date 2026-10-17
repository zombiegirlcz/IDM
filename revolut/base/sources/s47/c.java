package s47;

import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreen;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.a3;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TaxHubTransactionExportReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TaxHubTransactionExportReviewScreen taxHubTransactionExportReviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = taxHubTransactionExportReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TaxHubTransactionExportReviewScreen taxHubTransactionExportReviewScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a) taxHubTransactionExportReviewScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a aVar3 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.a) taxHubTransactionExportReviewScreen.d();
                u47.g gVar = aVar3.f74431p;
                Set set = ((j) ((j2) aVar3.f74434s.f22677a).getValue()).d;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it8 = set.iterator();
                while (it8.hasNext()) {
                    linkedHashSet.add(((a3) it8.next()).f272581b);
                }
                gVar.P1(linkedHashSet);
                break;
        }
        return Unit.f186387a;
    }
}
