package t18;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreen;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AllInsightsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AllInsightsScreen allInsightsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = allInsightsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b bVar = (com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b) pVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        q18.g gVar = obj3 instanceof q18.g ? (q18.g) obj3 : null;
        if (Intrinsics.f(gVar, q18.d.f241404a)) {
            oki.h.v2(bVar.f76438w, AllInsightsScreenContract$ModalStep.AddToWatchlist.f76428a, ModalDestination.Style.POPUP.f98311a);
        } else if (Intrinsics.f(gVar, q18.e.f241405a)) {
            bVar.n2(new d(bVar, null), new whi.b(6));
        } else if (Intrinsics.f(gVar, q18.f.f241406a)) {
            FeedFilter byAssetFilter = bVar.o.f76427a;
            if (byAssetFilter instanceof FeedFilter.ByAssetFilter) {
                byAssetFilter = new FeedFilter.ByAssetFilter(((q) ((j2) bVar.v.f22677a).getValue()).f267223a);
            } else if (!(byAssetFilter instanceof FeedFilter.ByRef)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.n2(new e(bVar, byAssetFilter, null), new whi.b(6));
        } else if (gVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
