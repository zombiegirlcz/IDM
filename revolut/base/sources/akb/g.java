package akb;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.ManageChallengeScreen;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ ManageChallengeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ManageChallengeScreen manageChallengeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = manageChallengeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a aVar2 = (com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a) this.u.d();
        io3.d dVar = ((h) zi0.c.I(((i) ((j2) aVar2.f83195t.f22677a).getValue()).f5773a)).f5772c;
        String str = dVar != null ? dVar.f163145a : null;
        if (str != null) {
            aVar2.C1(new MainContainerScreenDestination.JustShow(new MainScreenTab(ibb.c.f160140a.f83420a), new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, null), ProductId.CURRENCY), null), (AccountCreationTransitionAnimation) null, 12));
        }
        return Unit.f186387a;
    }
}
