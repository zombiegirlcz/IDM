package cq9;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.AddSplitItemController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddSplitItemController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AddSplitItemController addSplitItemController, Continuation continuation) {
        super(2, continuation);
        this.v = addSplitItemController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarE3 = this.v.R2();
        Intrinsics.h(textData);
        com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a aVar2 = (com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a) hVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        String str = textData.f52597a;
        if (Intrinsics.f(str, "split_item_name")) {
            aVar2.H2(aVar2.f79276t, new ak8.i(textData, 2));
        } else {
            hx7.e.h(new IllegalArgumentException(j6.a.q("Unknown listId=", str)));
        }
        return Unit.f186387a;
    }
}
