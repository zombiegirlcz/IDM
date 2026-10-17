package l10;

import com.revolut.cards.shared.ui.screen.catalogue.SharedCardDesignCatalogueController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import l10.w;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SharedCardDesignCatalogueController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SharedCardDesignCatalogueController sharedCardDesignCatalogueController, Continuation continuation) {
        super(2, continuation);
        this.v = sharedCardDesignCatalogueController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str = (String) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (str != null) {
            int iHashCode = str.hashCode();
            SharedCardDesignCatalogueController sharedCardDesignCatalogueController = this.v;
            if (iHashCode != -1342433697) {
                if (iHashCode != -309492240) {
                    if (iHashCode == 1286050915 && str.equals("LIST_ID_MENU_ITEM_GO_VIRTUAL")) {
                        ((n) sharedCardDesignCatalogueController.k3()).I2(w.c.f191408a);
                    }
                } else if (str.equals("REV_POINTS_MENU_ITEM_LIST_ID")) {
                    ((n) sharedCardDesignCatalogueController.k3()).I2(w.d.f191409a);
                }
            } else if (str.equals("LIST_ID_MENU_ITEM_GO_PHYSICAL")) {
                ((n) sharedCardDesignCatalogueController.k3()).I2(w.b.f191407a);
            }
        }
        return Unit.f186387a;
    }
}
