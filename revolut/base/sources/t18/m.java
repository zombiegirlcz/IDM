package t18;

import cli.y;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreen;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AllInsightsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AllInsightsScreen allInsightsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = allInsightsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.R2();
        Intrinsics.h(item);
        com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b bVar = (com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.b) pVarE3;
        y yVar = bVar.v;
        Intrinsics.checkNotNullParameter(item, "item");
        if (bVar.o.f76427a instanceof FeedFilter.ByAssetFilter) {
            Object obj3 = item.f58324n;
            tdh.a aVar2 = obj3 instanceof tdh.a ? (tdh.a) obj3 : null;
            if (aVar2 != null) {
                LinkedHashSet linkedHashSetA = gc0.c.A(((q) ((j2) yVar.f22677a).getValue()).f267223a, aVar2);
                bVar.H2(yVar, new an9.t(linkedHashSetA, 12));
                bVar.l2(new f(bVar, linkedHashSetA, null), new yi5.b(26));
            }
        }
        return Unit.f186387a;
    }
}
