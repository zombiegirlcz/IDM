package d8e;

import com.revolut.feature.subaccount.impl.ui.edit.billl.flow.BillsEditFlow;
import gim.i;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BillsEditFlow f112222w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(BillsEditFlow billsEditFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112222w = billsEditFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f112222w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            default:
                b bVar2 = new b(this.f112222w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BillsEditFlow billsEditFlow = this.f112222w;
        switch (i) {
            case 0:
                um0 um0Var = (um0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                c cVar = (c) billsEditFlow.Q.getValue();
                String listId = um0Var.f166695a;
                com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a aVar2 = (com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a) cVar;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "ON_TRACKING_DIALOG_LIST_ID")) {
                    aVar2.s1();
                    j60.a.v(aVar2.f89064x, false, null, 3);
                    aVar2.I2();
                }
                break;
            default:
                um0 um0Var2 = (um0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                c cVar2 = (c) billsEditFlow.Q.getValue();
                String listId2 = um0Var2.f166695a;
                com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a aVar4 = (com.revolut.feature.subaccount.impl.ui.edit.billl.flow.a) cVar2;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                if (Intrinsics.f(listId2, "ON_TRACKING_DIALOG_LIST_ID")) {
                    aVar4.l2(new f(aVar4, null, 1), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
