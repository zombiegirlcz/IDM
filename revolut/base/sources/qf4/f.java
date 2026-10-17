package qf4;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.bigtile.BigTileOfferContentScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ BigTileOfferContentScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BigTileOfferContentScreen bigTileOfferContentScreen, Continuation continuation) {
        super(2, continuation);
        this.u = bigTileOfferContentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        KProperty[] kPropertyArr = BigTileOfferContentScreen.T;
        BigTileOfferContentScreen bigTileOfferContentScreen = this.u;
        bigTileOfferContentScreen.e3().setExpanded(false, true);
        ?? r4 = bigTileOfferContentScreen.Q;
        RecyclerView.LayoutManager layoutManager = ((dli.c) r4.getValue()).h().getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((dli.c) r4.getValue()).h().smoothScrollToPosition(((LinearLayoutManager) layoutManager).getItemCount());
        return Unit.f186387a;
    }
}
