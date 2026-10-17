package nme;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TabLifestyleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TabLifestyleScreen tabLifestyleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tabLifestyleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        boolean z = obj3 instanceof eme.a;
        TabLifestyleScreen tabLifestyleScreen = this.v;
        if (z) {
            z zVarG3 = tabLifestyleScreen.d();
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.tab.lifestyle.impl.ui.mapper.feed.action_list.FeedSlotActionItemParcelWrapper");
            eme.a parcel = (eme.a) obj3;
            com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG3;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            k19.c cVar = parcel.f127652a.d;
            String str = cVar.f180147a;
            k19.d0 d0Var = cVar.f180148b;
            fVar.M2(str, d0Var != null ? d0Var.f180151a : null, parcel);
            fVar.z.Z2(parcel);
        } else if (obj3 instanceof kme.a) {
            z zVarG32 = tabLifestyleScreen.d();
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.tab.lifestyle.impl.ui.mapper.products.LifestyleHomeProductParcelWrapper");
            ((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG32).J2((kme.a) obj3);
        } else if (obj3 instanceof RevPointsTransaction) {
            z zVarG33 = tabLifestyleScreen.d();
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.rev_points.models.RevPointsTransaction");
            RevPointsTransaction transaction = (RevPointsTransaction) obj3;
            com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar2 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG33;
            fVar2.getClass();
            Intrinsics.checkNotNullParameter(transaction, "revPointsTransaction");
            pme.b bVar = (pme.b) fVar2.K;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            bVar.A2(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenRevPointsTransactionDetails(transaction, null, false, null, false, 30)));
        } else if (obj3 instanceof a3) {
            z zVarG34 = tabLifestyleScreen.d();
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.transactions.models.Transaction");
            a3 transaction2 = (a3) obj3;
            com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar3 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG34;
            fVar3.getClass();
            Intrinsics.checkNotNullParameter(transaction2, "transaction");
            pme.b bVar2 = (pme.b) fVar3.K;
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(transaction2, "transaction");
            bVar2.A2(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P(transaction2), null, null, null, 126))));
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Row delegate click not handled: " + model);
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
