package xal;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.cancel.CancelScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CancelScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CancelScreen cancelScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cancelScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.Z.getValue();
        Object obj3 = model.i;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
        String id10 = (String) obj3;
        h hVar = (h) dVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        hVar.l2(new g(hVar, id10, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
