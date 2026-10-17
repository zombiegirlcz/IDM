package vdf;

import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import u80.j;
import u80.k;
import u80.p;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f287920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ow4.a f287921b;

    public d(w80.b amountFormatter, ow4.a stockEditAmountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(stockEditAmountFormatter, "stockEditAmountFormatter");
        this.f287920a = amountFormatter;
        this.f287921b = stockEditAmountFormatter;
    }

    public final BigDecimal a(String amount, Asset asset, int i) {
        long jA;
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(asset, "asset");
        f8l.c cVar = asset.f104719a;
        String symbol = asset.f104720b;
        int i2 = c.f287919a[cVar.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            jA = this.f287920a.a(amount, Integer.valueOf(i), symbol);
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Unsupported asset type");
            }
            ow4.a aVar = this.f287921b;
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            jA = 0;
            if (amount.length() != 0) {
                try {
                    p pVar = p.f278066a;
                    jA = p.a(amount, symbol, aVar.f230305a, Integer.valueOf(i));
                } catch (Exception unused) {
                }
            }
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(jA, i);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    public final String b(BigDecimal amount, Asset asset) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(asset, "asset");
        long jLongValue = amount.unscaledValue().longValue();
        f8l.c cVar = asset.f104719a;
        String symbol = asset.f104720b;
        int i = c.f287919a[cVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            int iScale = amount.scale();
            if (iScale <= 0) {
                iScale = asset.f104721c.c();
            }
            return this.f287920a.c(jLongValue, Integer.valueOf(iScale), symbol);
        }
        if (i != 4) {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("Unsupported asset type");
        }
        int iScale2 = amount.scale();
        e signShowingPolicy = e.NEVER;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
        j jVar = k.Companion;
        qd0.b bVar = this.f287921b.f230305a;
        jVar.getClass();
        k kVarA = j.a(bVar);
        kVarA.q(jLongValue);
        kVarA.f278047b = new xi0.b(4, symbol, Integer.valueOf(iScale2));
        int i2 = f.f287922a[signShowingPolicy.ordinal()];
        if (i2 == 1) {
            kVarA.f278051j = true;
        } else if (i2 == 2) {
            kVarA.i = true;
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        kVarA.f278053m = true;
        kVarA.f278052l = true;
        kVarA.k = true;
        return kVarA.a();
    }
}
