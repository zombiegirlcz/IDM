package com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary;

import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ c u;
    public final /* synthetic */ ArrayList v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
        this.v = arrayList;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = this.u;
        h.v2(cVar.f79256y, new SplitBillsSummaryScreenContract$Step.UnassignedItemsConfirmation(this.v, com.revolut.feature.payments.bills_chooser.api.common.a.c(cVar.v.f79198b)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
