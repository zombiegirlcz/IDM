package ec6;

import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.feature.donations.impl.ui.kompot.screen.overview.tab.charities.CharitiesTabScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CharitiesTabScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CharitiesTabScreen charitiesTabScreen, Continuation continuation) {
        super(2, continuation);
        this.v = charitiesTabScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((BigTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BigTileDelegate.Model model = (BigTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.f51742s;
        boolean z = obj3 instanceof ba6.f;
        CharitiesTabScreen charitiesTabScreen = this.v;
        if (z) {
            f fVarH3 = charitiesTabScreen.T2();
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.donations.api.model.CharitiesCollection");
            ba6.f collection = (ba6.f) obj3;
            m mVar = (m) fVarH3;
            mVar.getClass();
            Intrinsics.checkNotNullParameter(collection, "collection");
            mVar.v2(new nb6.f(collection.f13931a));
        } else if (obj3 instanceof ba6.l) {
            f fVarH32 = charitiesTabScreen.T2();
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.donations.api.model.Charity");
            ba6.l charity = (ba6.l) obj3;
            m mVar2 = (m) fVarH32;
            mVar2.getClass();
            Intrinsics.checkNotNullParameter(charity, "charity");
            mVar2.v2(new nb6.e(charity.f13938a));
        }
        return Unit.f186387a;
    }
}
