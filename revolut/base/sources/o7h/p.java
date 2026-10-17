package o7h;

import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import java.text.DecimalFormat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f222830a = r0.k(new Pair("all-bonds", zzg.j.f326741a), new Pair("all-funds", zzg.l.f326743a), new Pair("all-etfs", zzg.k.f326742a), new Pair("recommended-buy-stocks", zzg.m.f326744a));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f222831b = r0.k(new Pair("CRYPTO", zzg.h.CRYPTO), new Pair("COMMODITY", zzg.h.COMMODITY), new Pair("SECURITY", zzg.h.SECURITY));

    public static final String a(Integer num) {
        if (num == null) {
            return null;
        }
        return new DecimalFormat("0.00").format(((double) num.intValue()) / 100.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final zzg.r b(o7h.n r20, o7h.x r21) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o7h.p.b(o7h.n, o7h.x):zzg.r");
    }

    public static final String c(zzg.p pVar) {
        if (pVar instanceof zzg.n) {
            zzg.n nVar = (zzg.n) pVar;
            return a0.d.s("index_", nVar.f326745a, "_related_", nVar.f326746b.name());
        }
        if (pVar instanceof zzg.o) {
            return p.a.p("instrument_", ((zzg.o) pVar).f326747a, "_related");
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String d(zzg.s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        int i = o.f222829a[sVar.ordinal()];
        if (i == 1) {
            return "ASC";
        }
        if (i == 2) {
            return "DESC";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String e(InstrumentsCollectionSortOption instrumentsCollectionSortOption) {
        Intrinsics.checkNotNullParameter(instrumentsCollectionSortOption, "<this>");
        if (instrumentsCollectionSortOption instanceof InstrumentsCollectionSortOption.AlphabeticalOrder) {
            return "ALPHABETIC";
        }
        if (instrumentsCollectionSortOption instanceof InstrumentsCollectionSortOption.MostOwned) {
            return "MOST_OWNED";
        }
        if (instrumentsCollectionSortOption instanceof InstrumentsCollectionSortOption.RemainingYears) {
            return "REMAINING_YEARS";
        }
        if (instrumentsCollectionSortOption instanceof InstrumentsCollectionSortOption.YieldToMaturity) {
            return "YTM";
        }
        if (instrumentsCollectionSortOption instanceof InstrumentsCollectionSortOption.MostTraded) {
            return "MOST_TRADED";
        }
        if (instrumentsCollectionSortOption instanceof InstrumentsCollectionSortOption.PriceChange1Day) {
            return "PRICE_1D";
        }
        throw new NoWhenBranchMatchedException();
    }
}
