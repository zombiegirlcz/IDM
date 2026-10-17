package j9j;

import com.revolut.retail.feature.crypto.asset_details.common.api.model.CryptoAssetStats;
import dj0.d;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u80.q;
import uv5.g;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f172347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi0.b f172348b;

    public b(List list, xi0.b bVar) {
        this.f172347a = list;
        this.f172348b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xi0.b bVar;
        d dVarA;
        uv5.b cryptoDetails = (uv5.b) obj2;
        Intrinsics.checkNotNullParameter(cryptoDetails, "cryptoDetails");
        Iterator it8 = d0.P0(this.f172347a, new a()).iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it8.hasNext();
            bVar = this.f172348b;
            if (!zHasNext) {
                i = -1;
                break;
            }
            if (Intrinsics.f(((cw5.b) it8.next()).f109534a, bVar.f306286a)) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        d dVarA2 = null;
        if (i == -1) {
            numValueOf = null;
        }
        Integer numValueOf2 = numValueOf != null ? Integer.valueOf(numValueOf.intValue() + 1) : null;
        g gVar = cryptoDetails.e;
        if (gVar == null) {
            return null;
        }
        d dVar = gVar.f283317c;
        CryptoAssetStats.MarketCapRank.Value value = new CryptoAssetStats.MarketCapRank.Value(numValueOf2);
        Long l2 = gVar.f283316b;
        if (l2 != null) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(l2.longValue());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            dVarA = q.a(bigDecimalValueOf, bVar);
        } else {
            dVarA = null;
        }
        Long l3 = gVar.d;
        if (l3 != null) {
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(l3.longValue());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            dVarA2 = q.a(bigDecimalValueOf2, bVar);
        }
        return new CryptoAssetStats(dVar, value, dVarA, dVarA2, gVar.f);
    }
}
