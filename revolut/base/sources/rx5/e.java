package rx5;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.TrendingContract$ModalStep;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.TrendingScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ TrendingScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TrendingScreen trendingScreen, Continuation continuation) {
        super(2, continuation);
        this.u = trendingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.a aVar2 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.a) ((b) this.u.L.getValue());
        oki.h.v2(aVar2.f71577r, new TrendingContract$ModalStep.Timeframe(((a) ((j2) aVar2.f71578s.f22677a).getValue()).f258025a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
