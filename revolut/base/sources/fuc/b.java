package fuc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.security_hub.impl.ui.card_security.CardSecurityController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardSecurityController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CardSecurityController cardSecurityController, Continuation continuation) {
        super(2, continuation);
        this.v = cardSecurityController;
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

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.N.getValue();
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
        String cardId = (String) obj3;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        hVar.C2(new e(cardId));
        return Unit.f186387a;
    }
}
