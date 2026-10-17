package nmb;

import aw0.n6;
import cli.y;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.SavingsCurrencySelectionContract$ModalStep;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.SavingsCurrencySelectionScreen;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SavingsCurrencySelectionScreen f217252w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(SavingsCurrencySelectionScreen savingsCurrencySelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f217252w = savingsCurrencySelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f217252w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            default:
                p pVar2 = new p(this.f217252w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SavingsCurrencySelectionScreen savingsCurrencySelectionScreen = this.f217252w;
        switch (i) {
            case 0:
                n6 model = (n6) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE3 = savingsCurrencySelectionScreen.R2();
                Intrinsics.h(model);
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.a aVar2 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.a) gVarE3;
                y yVar = aVar2.f83325w;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.k;
                if (obj3 == f.NEXT_CTA) {
                    SavingsProductData savingsProductData = ((c) ((j2) yVar.f22677a).getValue()).f217236b;
                    if (savingsProductData == null) {
                        throw new IllegalStateException("SelectedProduct should not be null");
                    }
                    aVar2.C2(new e(savingsProductData));
                } else if (obj3 == f.ADDITIONAL_CTA) {
                    SavingsProductData savingsProductData2 = ((c) ((j2) yVar.f22677a).getValue()).f217236b;
                    if (savingsProductData2 == null) {
                        throw new IllegalStateException("SelectedProduct should not be null");
                    }
                    oki.h.v2(aVar2.f83326x, new SavingsCurrencySelectionContract$ModalStep.SavingsCalculator(savingsProductData2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            default:
                String query = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE32 = savingsCurrencySelectionScreen.R2();
                Intrinsics.h(query);
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.a aVar4 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.a) gVarE32;
                aVar4.getClass();
                f01.c cVar = aVar4.v;
                Intrinsics.checkNotNullParameter(query, "query");
                y yVar2 = aVar4.f83325w;
                b bVar = (b) ((c) ((j2) yVar2.f22677a).getValue()).f217235a.getContent();
                if (bVar != null) {
                    SavingsProductData savingsProductData3 = ((c) ((j2) yVar2.f22677a).getValue()).f217236b;
                    List list = bVar.f217232a;
                    if (!d0.W(query) && list.size() > 5) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            SavingsProductData savingsProductData4 = ((ncd.a) obj4).f214169a;
                            CharSequence charSequenceB = cVar.b(new CurrencyClause(savingsProductData4.f86683a.f86618b, CurrencyClause.Format.DisplayName.f57755a, null, 4));
                            CharSequence charSequenceB2 = cVar.b(new CurrencyClause(savingsProductData4.f86683a.f86618b, CurrencyClause.Format.Ticker.f57756a, null, 4));
                            if (d0.J(charSequenceB, query, true) || d0.J(charSequenceB2, query, true)) {
                                arrayList.add(obj4);
                            }
                        }
                        list = arrayList;
                    }
                    ncd.a aVar5 = (ncd.a) zhm.d0.b0(list);
                    if (savingsProductData3 == null) {
                        savingsProductData3 = aVar5.f214169a;
                    } else {
                        List list2 = list;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            savingsProductData3 = aVar5.f214169a;
                        } else {
                            Iterator it8 = list2.iterator();
                            while (it8.hasNext()) {
                                if (Intrinsics.f(((ncd.a) it8.next()).f214169a.f86683a.f86617a, savingsProductData3.f86683a.f86617a)) {
                                }
                            }
                            savingsProductData3 = aVar5.f214169a;
                        }
                    }
                    aVar4.H2(yVar2, new n68.w(bVar, list, savingsProductData3, query, 6));
                }
                return Unit.f186387a;
        }
    }
}
