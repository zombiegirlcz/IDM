package zub;

import com.revolut.feature.rev_points.buying.impl.ui.screen.info.RevPointsBuyingInfoControllerScreen;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.terms_and_conditions.RevPointsGiftcardsTermsAndConditionsScreen;
import com.revolut.feature.security_hub.impl.ui.linked_wallets_learn_more.LinkedWalletsLearnMoreScreen;
import com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.TrustedWifisListScreen;
import com.revolut.feature.selfserve.sot.impl.ui.home.SotHomeController;
import com.revolut.feature.transport.impl.ui.help.main.TransportHelpMainScreen;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.upcoming_dividends.UpcomingDividendsController;
import com.revolut.kompot.navigable.vc.ViewController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zwb.e;
import zyc.m;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ViewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ViewController viewController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = viewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b((RevPointsBuyingInfoControllerScreen) this.v, continuation, 0);
            case 1:
                return new b((LinkedWalletsLearnMoreScreen) this.v, continuation, 1);
            case 2:
                return new b((UpcomingDividendsController) this.v, continuation, 2);
            case 3:
                return new b((TrustedWifisListScreen) this.v, continuation, 3);
            case 4:
                return new b((TransportHelpMainScreen) this.v, continuation, 4);
            case 5:
                return new b((RevPointsGiftcardsTermsAndConditionsScreen) this.v, continuation, 5);
            default:
                return new b((SotHomeController) this.v, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ViewController viewController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((c) ((RevPointsBuyingInfoControllerScreen) viewController).R.getValue()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((zuc.b) ((LinkedWalletsLearnMoreScreen) viewController).S.getValue()).B2();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((zug.i) ((UpcomingDividendsController) viewController).N.getValue()).B2();
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.security_hub.impl.ui.street_mode.trusted_wifis_list.a) ((TrustedWifisListScreen) viewController).d3()).B2();
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((TransportHelpMainScreen) viewController).m2().onBackPressed();
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((e) ((RevPointsGiftcardsTermsAndConditionsScreen) viewController).R.getValue()).B2();
                break;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((SotHomeController) viewController).c3(m.f326422a);
                break;
        }
        return Unit.f186387a;
    }
}
