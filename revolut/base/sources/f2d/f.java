package f2d;

import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vkm.d f131523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WatchlistItem f131524c;

    public /* synthetic */ f(vkm.d dVar, WatchlistItem watchlistItem, int i) {
        this.f131522a = i;
        this.f131523b = dVar;
        this.f131524c = watchlistItem;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f131522a) {
            case 0:
                Object objCollect = this.f131523b.collect(new e(flowCollector, this.f131524c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f131523b.collect(new e(flowCollector, this.f131524c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
