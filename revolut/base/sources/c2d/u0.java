package c2d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class u0 implements x3d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f20745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2d.a f20746c;
    public final Lazy d;

    public u0(ybl.b instrumentTickerInteractor, e2d.a tradingAssetsProvider, int i) {
        this.f20744a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
                Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
                this.f20745b = instrumentTickerInteractor;
                this.f20746c = tradingAssetsProvider;
                this.d = yhm.j.b(new c0d.e(6));
                break;
            default:
                Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
                Intrinsics.checkNotNullParameter(tradingAssetsProvider, "tradingAssetsProvider");
                this.f20745b = instrumentTickerInteractor;
                this.f20746c = tradingAssetsProvider;
                this.d = yhm.j.b(new c0d.e(5));
                break;
        }
    }

    @Override // x3d.a
    public final FavouritesAssetTypeKey a() {
        switch (this.f20744a) {
            case 0:
                y1d.b.Companion.getClass();
                return y1d.a.f310360g;
            default:
                y1d.b.Companion.getClass();
                return y1d.a.f;
        }
    }

    @Override // x3d.a
    public final Flow b(int i, String query) {
        switch (this.f20744a) {
            case 0:
                Intrinsics.checkNotNullParameter(query, "query");
                if (i > 0) {
                    return new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2);
                }
                return ((e2d.e) this.f20746c).a(query, i, (Set) this.d.getValue(), a());
            default:
                Intrinsics.checkNotNullParameter(query, "query");
                if (i > 0) {
                    return new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2);
                }
                return ((e2d.e) this.f20746c).a(query, i, (Set) this.d.getValue(), a());
        }
    }

    @Override // x3d.a
    public final Flow c(xi0.b bVar) {
        switch (this.f20744a) {
            case 0:
                return rd0.e.b(nim.a.w(ybl.b.c(this.f20745b), new bzg.t(this, 6)));
            default:
                return rd0.e.b(nim.a.w(ybl.b.c(this.f20745b), new bzg.t(this, 10)));
        }
    }
}
