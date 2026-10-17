package q4a;

import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.search.PaymentsSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PaymentsSearchScreen f242094w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PaymentsSearchScreen paymentsSearchScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f242094w = paymentsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f242094w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f242094w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c(this.f242094w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c(this.f242094w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
            default:
                c cVar5 = new c(this.f242094w, continuation, 4);
                cVar5.v = obj2;
                return cVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((WhoToTransferFilter) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PaymentsSearchScreen paymentsSearchScreen = this.f242094w;
        switch (i) {
            case 0:
                String buttonId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE3 = paymentsSearchScreen.e3();
                Intrinsics.h(buttonId);
                com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar2 = (com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) hVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(buttonId, "buttonId");
                aVar2.f80133t.getClass();
                aVar2.C1(h3a.p.a(buttonId));
                break;
            case 1:
                String str = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE32 = paymentsSearchScreen.e3();
                Intrinsics.h(str);
                String input = d0.F0(str).toString();
                com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar4 = (com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) hVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                aVar4.C.d(input);
                break;
            case 2:
                Object item = this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar6 = (com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) paymentsSearchScreen.e3();
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                aVar6.l2(new q03.m(aVar6, item, null, 10), new yi5.b(26));
                break;
            case 3:
                WhoToTransferFilter selectedFilter = (WhoToTransferFilter) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE33 = paymentsSearchScreen.e3();
                Intrinsics.h(selectedFilter);
                com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar8 = (com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) hVarE33;
                aVar8.getClass();
                Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
                aVar8.l2(new q03.m(aVar8, selectedFilter, null, 9), new yi5.b(26));
                break;
            default:
                Object item2 = this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVarE34 = paymentsSearchScreen.e3();
                Intrinsics.h(item2);
                com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar10 = (com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) hVarE34;
                aVar10.getClass();
                Intrinsics.checkNotNullParameter(item2, "item");
                aVar10.l2(new q03.m(aVar10, item2, null, 10), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
