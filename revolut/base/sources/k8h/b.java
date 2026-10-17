package k8h;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0007\u0011J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\nR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\nR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0012"}, d2 = {"Lk8h/b;", "", "", "toString", "()Ljava/lang/String;", "", "Lk8h/b$a;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "commodities", "allAssets", "c", "d", "stocks", "crypto", "k8h/a", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("commodities")
    private final List<a> commodities;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("allAssets")
    private final List<a> allAssets;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("stocks")
    private final List<a> stocks;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("crypto")
    private final List<a> crypto;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lk8h/b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "symbol", "b", "ref", "Lk8h/a;", "Lk8h/a;", "()Lk8h/a;", "assetType", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("symbol")
        @NotNull
        private final String symbol;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String ref;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("assetType")
        @NotNull
        private final k8h.a assetType;

        public a(String symbol, String ref2, k8h.a assetType) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(ref2, "ref");
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            this.symbol = symbol;
            this.ref = ref2;
            this.assetType = assetType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final k8h.a getAssetType() {
            return this.assetType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getRef() {
            return this.ref;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.symbol, aVar.symbol) && Intrinsics.f(this.ref, aVar.ref) && this.assetType == aVar.assetType;
        }

        public final int hashCode() {
            return this.assetType.hashCode() + p.a.c(this.symbol.hashCode() * 31, 31, this.ref);
        }
    }

    public b(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.commodities = arrayList;
        this.allAssets = arrayList2;
        this.stocks = arrayList3;
        this.crypto = arrayList4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAllAssets() {
        return this.allAssets;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getCommodities() {
        return this.commodities;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getCrypto() {
        return this.crypto;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getStocks() {
        return this.stocks;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.commodities, bVar.commodities) && Intrinsics.f(this.allAssets, bVar.allAssets) && Intrinsics.f(this.stocks, bVar.stocks) && Intrinsics.f(this.crypto, bVar.crypto);
    }

    public final int hashCode() {
        List<a> list = this.commodities;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<a> list2 = this.allAssets;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<a> list3 = this.stocks;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<a> list4 = this.crypto;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }
}
