package nvk;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.models.StockFinancialsStatementPeriodState;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uqk.e f219715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StockFinancialsStatementPeriodState f219716c;
    public final StockFinancialsStatementPeriodState d;
    public final Map e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f219717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f219718h;

    public k(String str, uqk.e selectedPeriod, StockFinancialsStatementPeriodState annualStatementPeriod, StockFinancialsStatementPeriodState quarterlyStatementPeriod, Map expandedItems, Data subPeriods, Data statements, Data disclaimerData) {
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        Intrinsics.checkNotNullParameter(annualStatementPeriod, "annualStatementPeriod");
        Intrinsics.checkNotNullParameter(quarterlyStatementPeriod, "quarterlyStatementPeriod");
        Intrinsics.checkNotNullParameter(expandedItems, "expandedItems");
        Intrinsics.checkNotNullParameter(subPeriods, "subPeriods");
        Intrinsics.checkNotNullParameter(statements, "statements");
        Intrinsics.checkNotNullParameter(disclaimerData, "disclaimerData");
        this.f219714a = str;
        this.f219715b = selectedPeriod;
        this.f219716c = annualStatementPeriod;
        this.d = quarterlyStatementPeriod;
        this.e = expandedItems;
        this.f = subPeriods;
        this.f219717g = statements;
        this.f219718h = disclaimerData;
    }

    public static k a(k kVar, String str, uqk.e eVar, StockFinancialsStatementPeriodState stockFinancialsStatementPeriodState, StockFinancialsStatementPeriodState stockFinancialsStatementPeriodState2, Map map, Data data, Data data2, Data data3, int i) {
        if ((i & 1) != 0) {
            str = kVar.f219714a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            eVar = kVar.f219715b;
        }
        uqk.e selectedPeriod = eVar;
        if ((i & 4) != 0) {
            stockFinancialsStatementPeriodState = kVar.f219716c;
        }
        StockFinancialsStatementPeriodState annualStatementPeriod = stockFinancialsStatementPeriodState;
        if ((i & 8) != 0) {
            stockFinancialsStatementPeriodState2 = kVar.d;
        }
        StockFinancialsStatementPeriodState quarterlyStatementPeriod = stockFinancialsStatementPeriodState2;
        if ((i & 16) != 0) {
            map = kVar.e;
        }
        Map expandedItems = map;
        if ((i & 32) != 0) {
            data = kVar.f;
        }
        Data subPeriods = data;
        Data statements = (i & 64) != 0 ? kVar.f219717g : data2;
        Data disclaimerData = (i & 128) != 0 ? kVar.f219718h : data3;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        Intrinsics.checkNotNullParameter(annualStatementPeriod, "annualStatementPeriod");
        Intrinsics.checkNotNullParameter(quarterlyStatementPeriod, "quarterlyStatementPeriod");
        Intrinsics.checkNotNullParameter(expandedItems, "expandedItems");
        Intrinsics.checkNotNullParameter(subPeriods, "subPeriods");
        Intrinsics.checkNotNullParameter(statements, "statements");
        Intrinsics.checkNotNullParameter(disclaimerData, "disclaimerData");
        return new k(str2, selectedPeriod, annualStatementPeriod, quarterlyStatementPeriod, expandedItems, subPeriods, statements, disclaimerData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f219714a, kVar.f219714a) && this.f219715b == kVar.f219715b && Intrinsics.f(this.f219716c, kVar.f219716c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f219717g, kVar.f219717g) && Intrinsics.f(this.f219718h, kVar.f219718h);
    }

    public final int hashCode() {
        String str = this.f219714a;
        return this.f219718h.hashCode() + kii.e.c(this.f219717g, kii.e.c(this.f, p.a.e((this.d.hashCode() + ((this.f219716c.hashCode() + ((this.f219715b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31, 31, this.e), 31), 31);
    }
}
