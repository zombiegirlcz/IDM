package p4a;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer_friend.NewTransferFriendScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NewTransferFriendScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NewTransferFriendScreen newTransferFriendScreen, Continuation continuation) {
        super(2, continuation);
        this.v = newTransferFriendScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model item = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.Z.getValue();
        Intrinsics.h(item);
        j jVar = (j) eVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        jVar.l2(new i(item, null, jVar), new yi5.b(26));
        return Unit.f186387a;
    }
}
