package r77;

import android.os.Parcelable;
import com.revolut.feature.global_markets.domain.MarketAsset;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n77.g;
import n77.h;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final ArrayList a(List list) {
        Parcelable index;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<g> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (g gVar : list2) {
            h hVar = gVar.f213018b;
            String str = gVar.f213020g;
            String str2 = gVar.f;
            int i = a.f252036a[hVar.ordinal()];
            if (i == 1) {
                String str3 = gVar.f213019c;
                if (str3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String str4 = gVar.d;
                if (str4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String str5 = gVar.e;
                if (str5 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                index = new MarketAsset.Index(str3, str4, str5);
            } else if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (str2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                xi0.b.Companion.getClass();
                index = new MarketAsset.Commodity(xi0.a.a(str2));
            } else {
                if (str2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                xi0.b.Companion.getClass();
                index = new MarketAsset.CurrencyPair(xi0.a.a(str2), xi0.a.a(str));
            }
            arrayList.add(index);
        }
        return arrayList;
    }

    public static final ArrayList b(List list) {
        g gVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            MarketAsset marketAsset = (MarketAsset) obj2;
            if (marketAsset instanceof MarketAsset.Index) {
                MarketAsset.Index index = (MarketAsset.Index) marketAsset;
                gVar = new g(i, h.INDEX, index.f74571a, index.f74572b, index.f74573c, null, null, 96);
            } else if (marketAsset instanceof MarketAsset.Commodity) {
                gVar = new g(i, h.COMMODITY, null, null, null, ((MarketAsset.Commodity) marketAsset).f74568a.f306286a, null, 92);
            } else {
                if (!(marketAsset instanceof MarketAsset.CurrencyPair)) {
                    throw new NoWhenBranchMatchedException();
                }
                MarketAsset.CurrencyPair currencyPair = (MarketAsset.CurrencyPair) marketAsset;
                gVar = new g(i, h.CURRENCY, null, null, null, currencyPair.f74569a.f306286a, currencyPair.f74570b.f306286a, 28);
            }
            arrayList.add(gVar);
            i = i2;
        }
        return arrayList;
    }
}
