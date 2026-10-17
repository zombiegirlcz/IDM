package l2d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f191780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FavouritesAssetTypeKey f191781c;

    public /* synthetic */ h(Flow flow, FavouritesAssetTypeKey favouritesAssetTypeKey, int i) {
        this.f191779a = i;
        this.f191780b = flow;
        this.f191781c = favouritesAssetTypeKey;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f191779a) {
            case 0:
                Object objCollect = this.f191780b.collect(new g(flowCollector, this.f191781c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f191780b.collect(new g(flowCollector, this.f191781c, 3), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f191780b.collect(new g(flowCollector, this.f191781c, 5), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
