package c5a;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f21522w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(RowDelegate.Model model, com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar, Continuation continuation) {
        super(1, continuation);
        this.v = fVar;
        this.f21522w = model;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q0(this.f21522w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar = this.v;
        RowDelegate.Model model = this.f21522w;
        if (i == 0) {
            yhm.o.b(obj2);
            g4a.b bVar = fVar.f80177w;
            Object obj3 = model.u;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.payments.core.models.PaymentRecentRecipient");
            this.u = 1;
            obj2 = bVar.a((jq9.k) obj3, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        List list = (List) obj2;
        if (list.isEmpty()) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "ChatTransferScreenModel", a0.d.m(model.u, "Empty long click action list for "), null, null, 16);
        } else {
            fVar.g0.onNext(new m(model.f53228a, zi0.c.d(list)));
        }
        return Unit.f186387a;
    }
}
