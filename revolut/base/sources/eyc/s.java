package eyc;

import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.selfserve.entity.config.shared.ui.home.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.selfserve.entity.config.shared.ui.home.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PopupMenuItem popupMenuItem = (PopupMenuItem) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object f51903b = popupMenuItem.getF51903b();
        FincrimeHomeScreenAction.PopupMenu.Item item = f51903b instanceof FincrimeHomeScreenAction.PopupMenu.Item ? (FincrimeHomeScreenAction.PopupMenu.Item) f51903b : null;
        if (item == null) {
            return Unit.f186387a;
        }
        this.v.I2(new FincrimeHomeScreenAction.Deeplink(item.d));
        return Unit.f186387a;
    }
}
