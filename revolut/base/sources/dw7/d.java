package dw7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.card_claims.CardClaimsScreen;
import dlk.k;
import gim.i;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardClaimsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CardClaimsScreen cardClaimsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cardClaimsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Q.getValue();
        String id10 = model.f53228a;
        Object obj3 = model.u;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        if (obj3 instanceof f0) {
            hVar.l2(new k(hVar, (f0) obj3, null, 23), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
