package cq9;

import aw0.n6;
import cli.y;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.AddSplitItemController;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddSplitItemController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AddSplitItemController addSplitItemController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addSplitItemController;
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
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String strU;
        Set set;
        int i = this.u;
        AddSplitItemController addSplitItemController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                addSplitItemController.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a aVar3 = (com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a) addSplitItemController.e3();
                y yVar = aVar3.f79276t;
                g gVar = aVar3.f79273q;
                SplitBillItem splitBillItem = gVar.f108051b;
                if (splitBillItem == null || (strU = splitBillItem.f79225a) == null) {
                    strU = wp5.y.u(aVar3.f79275s, "toString(...)");
                }
                String str = ((f) ((j2) yVar.f22677a).getValue()).f108048b;
                long j2 = ((f) ((j2) yVar.f22677a).getValue()).f108047a;
                SplitBillItem splitBillItem2 = gVar.f108051b;
                if (splitBillItem2 == null || (set = splitBillItem2.d) == null) {
                    set = h0.f322473a;
                }
                aVar3.C2(new j(new SplitBillItem(strU, str, j2, set)));
                break;
        }
        return Unit.f186387a;
    }
}
