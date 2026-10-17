package ueg;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsSearchResultsMapScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsSearchResultsMapScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f0 f0VarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) f0VarR2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        j60.a.v(bVar.f94065w, false, null, 3);
        return Unit.f186387a;
    }
}
