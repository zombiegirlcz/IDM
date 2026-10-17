package xgd;

import cli.y;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.EditWatchlistsController;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import xec.c0;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EditWatchlistsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(EditWatchlistsController editWatchlistsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = editWatchlistsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Set setKeySet;
        int i = this.u;
        EditWatchlistsController editWatchlistsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) editWatchlistsController.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a aVar3 = (com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) editWatchlistsController.d();
                y yVar = aVar3.f86928t;
                Map map = (Map) ((m) ((j2) yVar.f22677a).getValue()).f305683a.getContent();
                Continuation continuation = null;
                List listD1 = (map == null || (setKeySet = map.keySet()) == null) ? null : d0.d1(setKeySet);
                List list = ((m) ((j2) yVar.f22677a).getValue()).f305684b;
                if (list != null) {
                    if (list.equals(listD1)) {
                        aVar3.C2(new n(false));
                    } else {
                        aVar3.n2(new c0(aVar3, list, continuation, 6), new whi.b(6));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
