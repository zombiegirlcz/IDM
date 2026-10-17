package z8d;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.all.AllCardsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wo2.l;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AllCardsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AllCardsScreen allCardsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = allCardsScreen;
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

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.v.f86308a0.getValue();
        String itemId = model.f53228a;
        Object obj3 = model.u;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        jVar.n2(new l(jVar, itemId, obj3, (Continuation) null), new whi.b(6));
        return Unit.f186387a;
    }
}
