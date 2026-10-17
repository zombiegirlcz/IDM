package nme;

import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TabLifestyleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TabLifestyleScreen tabLifestyleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tabLifestyleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((IconDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        IconDelegate.Model model = (IconDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (model.i instanceof kme.a) {
            z zVarG3 = this.v.d();
            Object obj3 = model.i;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.tab.lifestyle.impl.ui.mapper.products.LifestyleHomeProductParcelWrapper");
            ((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG3).J2((kme.a) obj3);
        }
        return Unit.f186387a;
    }
}
