package n4d;

import com.revolut.feature.separate_favourites.item_data.impl.watchlist.network.WatchlistService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import s4d.i;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f212367w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, List list, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f212367w = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f212367w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            WatchlistService watchlistService = this.v.d;
            s4d.j jVar = new s4d.j(zhm.u.c(new i.c(this.f212367w)));
            this.u = 1;
            if (watchlistService.updateWatchlists(jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
