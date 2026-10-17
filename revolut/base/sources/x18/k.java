package x18;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.SmartFeedScreen;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsFilter;
import com.revolut.retail.feature.marketnews.api.navigation.destination.WealthAllNewsDestination;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SmartFeedScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SmartFeedScreen smartFeedScreen, Continuation continuation) {
        super(2, continuation);
        this.v = smartFeedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b bVar = (com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b) pVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.f52715m instanceof r) {
            Set set = (Set) bVar.A.getValue();
            if (set == null) {
                set = h0.f322473a;
            }
            bVar.C1(new WealthAllNewsDestination(new WealthNewsFilter.ByAssetFilter(set)));
        }
        return Unit.f186387a;
    }
}
