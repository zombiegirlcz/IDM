package cq9;

import aw0.f4;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.AddSplitItemController;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.AddSplitItemControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AddSplitItemController f108046w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AddSplitItemController addSplitItemController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f108046w = addSplitItemController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f108046w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f108046w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f108046w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AddSplitItemController addSplitItemController = this.f108046w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarE3 = addSplitItemController.R2();
                Intrinsics.h(id10);
                com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a aVar2 = (com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a) hVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("split_item_remove")) {
                    SplitBillItem splitBillItem = aVar2.f79273q.f108051b;
                    if (splitBillItem == null) {
                        r6.b.r("Item must not be null");
                    } else {
                        oki.h.v2(aVar2.u, new AddSplitItemControllerContract$ModalStep.RemoveItem(splitBillItem.f79226b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    }
                } else {
                    hx7.e.h(new IllegalArgumentException("Unknown menu id: ".concat(id10)));
                }
                break;
            case 1:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarE32 = addSplitItemController.R2();
                String formattedValue = charSequence.toString();
                com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a aVar4 = (com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a) hVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                aVar4.H2(aVar4.f79276t, new cma.b(aVar4, formattedValue, 15));
                break;
            default:
                f4 focusData = (f4) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVarE33 = addSplitItemController.R2();
                Intrinsics.h(focusData);
                com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a aVar6 = (com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a) hVarE33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                aVar6.f79272p.b(focusData);
                break;
        }
        return Unit.f186387a;
    }
}
