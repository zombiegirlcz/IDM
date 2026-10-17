package e2f;

import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsPurchaseController$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.TradeRevPointsAgentDetailsScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.TradeRevPointsAgentDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TradeRevPointsAgentDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(TradeRevPointsAgentDetailsScreen tradeRevPointsAgentDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = tradeRevPointsAgentDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TradeRevPointsAgentDetailsScreen tradeRevPointsAgentDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b) tradeRevPointsAgentDetailsScreen.R2()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b bVar = (com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b) tradeRevPointsAgentDetailsScreen.R2();
                u2f.d dVar = (u2f.d) ((n) ((j2) bVar.A.f22677a).getValue()).f122075a.getContent();
                if (dVar != null) {
                    ArrayList arrayList = dVar.f276625n;
                    if (arrayList.size() == 1) {
                        int i2 = b0.f122056a[((u2f.l) zhm.d0.b0(arrayList)).ordinal()];
                        if (i2 == 1) {
                            bVar.J2();
                        } else if (i2 == 2) {
                            String str = dVar.o;
                            if (str != null) {
                                bVar.C1(new ExternalDestination.Browser(str, null));
                            }
                        } else if (i2 == 3) {
                            String str2 = dVar.f276626p;
                            if (str2 != null) {
                                oki.h.v2(bVar.B, new TradeRevPointsAgentDetailsScreenContract$ModalStep.RevPointsGiftCardsPurchase(new RevPointsGiftcardsPurchaseController$InputData(str2)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            } else {
                                yji.l.a1(bVar, bVar.X1(com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b.I2()), null, null, null, 7);
                            }
                        } else {
                            if (i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            yji.l.a1(bVar, bVar.X1(com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.b.I2()), null, null, null, 7);
                        }
                    } else {
                        bVar.J2();
                    }
                }
                return Unit.f186387a;
        }
    }
}
