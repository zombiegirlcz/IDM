package en8;

import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.feature.junior_savings.impl.ui.screen.savings_list.JuniorSavingsListScreen;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorSavingsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(JuniorSavingsListScreen juniorSavingsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorSavingsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ProductSelectionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProductSelectionDelegate.Model model = (ProductSelectionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVar = (h) this.v.S.getValue();
        Intrinsics.h(model);
        n nVar = (n) hVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        g gVar = obj3 instanceof g ? (g) obj3 : null;
        if (gVar == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Model should contain vault as a parcel");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        } else {
            nVar.C1(new MainContainerScreenDestination.JustShow(new MainScreenTab(ibb.c.f160140a.f83420a), new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(gVar.f127767a, null), ProductId.SAVINGS), null), (AccountCreationTransitionAnimation) null, 12));
        }
        return Unit.f186387a;
    }
}
