package sq5;

import com.revolut.feature.crypto.config.api.models.CryptoAddressHostingProviderType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddressHostingProviderType f265000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f265001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f265002c;
    public final String d;
    public final boolean e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f265003g;

    public c() {
        this(0);
    }

    public static c a(c cVar, CryptoAddressHostingProviderType cryptoAddressHostingProviderType, List list, List list2, String str, boolean z, List list3, List list4, int i) {
        if ((i & 1) != 0) {
            cryptoAddressHostingProviderType = cVar.f265000a;
        }
        CryptoAddressHostingProviderType selectedTab = cryptoAddressHostingProviderType;
        if ((i & 2) != 0) {
            list = cVar.f265001b;
        }
        List walletHostingItems = list;
        if ((i & 4) != 0) {
            list2 = cVar.f265002c;
        }
        List exchangeHostingItems = list2;
        if ((i & 8) != 0) {
            str = cVar.d;
        }
        String searchQuery = str;
        if ((i & 16) != 0) {
            z = cVar.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            list3 = cVar.f;
        }
        List walletItemsSearchResults = list3;
        if ((i & 64) != 0) {
            list4 = cVar.f265003g;
        }
        List exchangeItemsSearchResults = list4;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(walletHostingItems, "walletHostingItems");
        Intrinsics.checkNotNullParameter(exchangeHostingItems, "exchangeHostingItems");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(walletItemsSearchResults, "walletItemsSearchResults");
        Intrinsics.checkNotNullParameter(exchangeItemsSearchResults, "exchangeItemsSearchResults");
        return new c(selectedTab, walletHostingItems, exchangeHostingItems, searchQuery, z3, walletItemsSearchResults, exchangeItemsSearchResults);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f265000a == cVar.f265000a && Intrinsics.f(this.f265001b, cVar.f265001b) && Intrinsics.f(this.f265002c, cVar.f265002c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f265003g, cVar.f265003g);
    }

    public final int hashCode() {
        return this.f265003g.hashCode() + p.a.d(j6.a.c(p.a.c(p.a.d(p.a.d(this.f265000a.hashCode() * 31, 31, this.f265001b), 31, this.f265002c), 31, this.d), 31, this.e), 31, this.f);
    }

    public c(CryptoAddressHostingProviderType selectedTab, List walletHostingItems, List exchangeHostingItems, String searchQuery, boolean z, List walletItemsSearchResults, List exchangeItemsSearchResults) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(walletHostingItems, "walletHostingItems");
        Intrinsics.checkNotNullParameter(exchangeHostingItems, "exchangeHostingItems");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(walletItemsSearchResults, "walletItemsSearchResults");
        Intrinsics.checkNotNullParameter(exchangeItemsSearchResults, "exchangeItemsSearchResults");
        this.f265000a = selectedTab;
        this.f265001b = walletHostingItems;
        this.f265002c = exchangeHostingItems;
        this.d = searchQuery;
        this.e = z;
        this.f = walletItemsSearchResults;
        this.f265003g = exchangeItemsSearchResults;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(int i) {
        CryptoAddressHostingProviderType cryptoAddressHostingProviderType = CryptoAddressHostingProviderType.WALLET;
        f0 f0Var = f0.f322471a;
        m70.a.c(t0.f186434a);
        this(cryptoAddressHostingProviderType, f0Var, f0Var, "", false, f0Var, f0Var);
    }
}
