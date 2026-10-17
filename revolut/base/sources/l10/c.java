package l10;

import com.revolut.cards.shared.ui.screen.catalogue.SharedCardDesignCatalogueController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import l10.w;

/* JADX INFO: loaded from: classes16.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ SharedCardDesignCatalogueController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SharedCardDesignCatalogueController sharedCardDesignCatalogueController, Continuation continuation) {
        super(2, continuation);
        this.u = sharedCardDesignCatalogueController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((n) this.u.k3()).I2(w.a.f191406a);
        return Unit.f186387a;
    }
}
