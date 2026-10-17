package n4d;

import com.revolut.feature.separate_favourites.item_data.impl.watchlist.network.WatchlistService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import s4d.i;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f212364w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f212365x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f212364w = str;
        this.f212365x = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f212364w, this.f212365x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            WatchlistService watchlistService = this.v.d;
            s4d.j jVar = new s4d.j(zhm.u.c(new i.b(this.f212364w, this.f212365x)));
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
