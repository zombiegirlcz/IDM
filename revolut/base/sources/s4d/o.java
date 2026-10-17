package s4d;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0015"}, d2 = {"Ls4d/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCurrencyPair", "currencyPair", "Ls4d/c;", "b", "Ls4d/c;", "getType", "()Ls4d/c;", "type", "c", "getAssetType", "assetType", "d", "getWatchlistId", "watchlistId", "feature_separate_favourites_item_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("currencyPair")
    @NotNull
    private final String currencyPair;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final c type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("assetType")
    @NotNull
    private final String assetType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("watchlistId")
    private final String watchlistId;

    public o(String currencyPair, c type, String assetType, String str) {
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        this.currencyPair = currencyPair;
        this.type = type;
        this.assetType = assetType;
        this.watchlistId = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.currencyPair, oVar.currencyPair) && this.type == oVar.type && Intrinsics.f(this.assetType, oVar.assetType) && Intrinsics.f(this.watchlistId, oVar.watchlistId);
    }

    public final int hashCode() {
        int iC = p.a.c((this.type.hashCode() + (this.currencyPair.hashCode() * 31)) * 31, 31, this.assetType);
        String str = this.watchlistId;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
