package l10;

import com.revolut.cards.shared.ui.screen.catalogue.SharedCardDesignCatalogueController;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SharedCardDesignCatalogueController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SharedCardDesignCatalogueController sharedCardDesignCatalogueController, Continuation continuation) {
        super(2, continuation);
        this.v = sharedCardDesignCatalogueController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((n) this.v.k3()).I2(new y(model.f53228a));
        return Unit.f186387a;
    }
}
