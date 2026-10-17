package e9d;

import com.revolut.data.model.Data;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.top_level.TransactionsTroubleshooterTopLevelScreenContract$InputData;
import com.revolut.feature.support.api.navigation.InboundTransferTrackerDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import dp4.f1;
import java.util.concurrent.CancellationException;
import klf.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends jki.g implements t {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TransactionsTroubleshooterTopLevelScreenContract$InputData f123972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lde.m f123973q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mde.e f123974r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p9d.n f123975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lal.a f123976t;
    public final k18.c u;
    public final ude.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final lde.n f123977w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k f123978x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(jki.p stateMapper, TransactionsTroubleshooterTopLevelScreenContract$InputData inputData, lde.m transactionItemsDelegate, mde.e helpDestinationProvider, p9d.n troubleshooterActionHelper, lal.a sharedUpcomingTransactionTroubleshooterInteractor, k18.c faqProvider, ude.a inboundTransferLocatorDestinationProvider, lde.n sharedHelpWidgetsInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionItemsDelegate, "transactionItemsDelegate");
        Intrinsics.checkNotNullParameter(helpDestinationProvider, "helpDestinationProvider");
        Intrinsics.checkNotNullParameter(troubleshooterActionHelper, "troubleshooterActionHelper");
        Intrinsics.checkNotNullParameter(sharedUpcomingTransactionTroubleshooterInteractor, "sharedUpcomingTransactionTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(faqProvider, "faqProvider");
        Intrinsics.checkNotNullParameter(inboundTransferLocatorDestinationProvider, "inboundTransferLocatorDestinationProvider");
        Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
        this.f123972p = inputData;
        this.f123973q = transactionItemsDelegate;
        this.f123974r = helpDestinationProvider;
        this.f123975s = troubleshooterActionHelper;
        this.f123976t = sharedUpcomingTransactionTroubleshooterInteractor;
        this.u = faqProvider;
        this.v = inboundTransferLocatorDestinationProvider;
        this.f123977w = sharedHelpWidgetsInteractor;
        this.f123978x = new k(null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.f86350b, inputData.d);
    }

    @Override // yji.l
    public final void T1(long j2) {
        String str = this.f123972p.f86349a;
        if (str == null) {
            str = "category.card-payments-withdrawals";
        }
        Flow flowZ = this.u.z(str, true);
        lde.m mVar = this.f123973q;
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.q(new t38.e(flowZ, 24, new vkm.y(vkm.q.Q(mVar.e, new a3(continuation, mVar, 27)), new a82.q(3, 14, continuation)), new f1(this, continuation, 6))), null, null, 7);
        n2(new x(this, continuation, 0), new whi.b(6));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f123978x;
    }

    public final void y2(Object obj2, String itemId) throws Throwable {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "INBOUND_TRANSFER_ITEM_ID")) {
            this.v.getClass();
            C1(InboundTransferTrackerDestination.f89356a);
            return;
        }
        lde.m mVar = this.f123973q;
        mVar.getClass();
        int i = 3;
        int i2 = 6;
        Continuation continuation = null;
        if (obj2 instanceof tof.a3) {
            n2(new e8e.w(obj2, this, continuation, i), new whi.b(i2));
            return;
        }
        mVar.getClass();
        if (obj2 instanceof qua.p) {
            n2(new e8e.w(this, itemId, continuation, 4), new whi.b(i2));
            return;
        }
        mVar.getClass();
        if (obj2 instanceof ExchangeOrder) {
            BridgeDestination bridgeDestinationB = this.f123974r.b(obj2);
            if (bridgeDestinationB != null) {
                C1(bridgeDestinationB);
                return;
            }
            return;
        }
        boolean zF = Intrinsics.f(itemId, "TRANSACTIONS_ALL_LIST_ID");
        TransactionsTroubleshooterTopLevelScreenContract$InputData transactionsTroubleshooterTopLevelScreenContract$InputData = this.f123972p;
        if (!zF) {
            if (Intrinsics.f(itemId, "TRANSACTION_ACTION_ITEM_ID")) {
                z2(obj2);
                return;
            }
            if (Intrinsics.f(itemId, "TRANSACTION_ACTION_LIGHT_ITEM_ID")) {
                n2(new e0b.c(obj2, this, continuation, 29), new whi.b(i2));
                return;
            } else {
                if (Intrinsics.f(itemId, "SEARCH_ITEM_ID")) {
                    SharedFaqDestination.StartPoint.Search search = new SharedFaqDestination.StartPoint.Search(transactionsTroubleshooterTopLevelScreenContract$InputData.f86349a);
                    TransitionAnimation.FADE fade = TransitionAnimation.FADE.f98392a;
                    C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) search, (SharedFaqDestination.PassthroughData) null, false, 10));
                    return;
                }
                return;
            }
        }
        int i3 = w.f123967a[transactionsTroubleshooterTopLevelScreenContract$InputData.f86350b.ordinal()];
        int i5 = 1;
        if (i3 == 1) {
            n2(new x(this, continuation, i5), new whi.b(i2));
            return;
        }
        int i6 = 2;
        if (i3 == 2) {
            v2(new q(((k) t2()).f123953a));
            Unit unit = Unit.f186387a;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            n2(new x(this, continuation, i6), new whi.b(i2));
        }
    }

    public final void z2(Object obj2) {
        Object objA;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.model.troubleshooter.TroubleshooterAction");
            objA = (hj0.b) obj2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        Continuation continuation = null;
        if (objA instanceof yhm.n) {
            objA = null;
        }
        hj0.b bVar = (hj0.b) objA;
        if (bVar == null) {
            return;
        }
        String str = bVar.d;
        if (str != null && d0.J(str, "category.card-payments-withdrawals", false)) {
            v2(new m("category.card-payments-withdrawals"));
        } else if (str == null || !d0.J(str, "category.future-payments-subscriptions", false)) {
            n2(new e8e.w(this, bVar, continuation, 5), new whi.b(6));
        } else {
            v2(new m("category.future-payments-subscriptions"));
        }
    }
}
