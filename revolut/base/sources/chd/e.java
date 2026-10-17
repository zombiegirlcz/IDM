package chd;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.WatchlistsSelectorScreen;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WatchlistsSelectorScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WatchlistsSelectorScreen watchlistsSelectorScreen, Continuation continuation) {
        super(2, continuation);
        this.v = watchlistsSelectorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        InputChecklistDelegate.Model it8 = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlists_selector.a aVarE3 = this.v.d();
        Intrinsics.h(it8);
        aVarE3.getClass();
        Intrinsics.checkNotNullParameter(it8, "it");
        Object obj3 = it8.i;
        if ((obj3 instanceof Watchlist) && (list = (List) ((g) ((j2) aVarE3.f86935q.f22677a).getValue()).f24198a.getContent()) != null) {
            List list2 = list;
            boolean z = false;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it9 = list2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) it9.next();
                    Watchlist watchlist = (Watchlist) pair.f186385a;
                    if (((Boolean) pair.f186386b).booleanValue() && Intrinsics.f(watchlist, obj3)) {
                        z = true;
                        break;
                    }
                }
            }
            aVarE3.n2(new b(z, aVarE3, obj3, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
