package com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import gim.i;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        List list = (List) pair.f186385a;
        List list2 = (List) pair.f186386b;
        boolean zIsEmpty = list.isEmpty();
        h hVar = this.v;
        if (zIsEmpty) {
            hVar.B2();
        } else {
            hVar.H2(hVar.f86958t, new g31.e(list, 23, (FavouritesAssetTypeKey) d0.d0(list), list2));
        }
        return Unit.f186387a;
    }
}
