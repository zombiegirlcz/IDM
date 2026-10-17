package qf4;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.bigtile.BigTileOfferContentScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ BigTileOfferContentScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BigTileOfferContentScreen bigTileOfferContentScreen, Continuation continuation) {
        super(2, continuation);
        this.u = bigTileOfferContentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b) this.u.d()).K2();
        return Unit.f186387a;
    }
}
