package k0e;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.models.StatementPeriod;
import i0e.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f180025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f180026c;
    public final StatementPeriod d;
    public final Data e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f180027g;

    public e(String selectedTabId, List savingsAccounts, w periodItems, StatementPeriod statementPeriod, Data statementNameType, boolean z, Data countryCodeData) {
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(savingsAccounts, "savingsAccounts");
        Intrinsics.checkNotNullParameter(periodItems, "periodItems");
        Intrinsics.checkNotNullParameter(statementNameType, "statementNameType");
        Intrinsics.checkNotNullParameter(countryCodeData, "countryCodeData");
        this.f180024a = selectedTabId;
        this.f180025b = savingsAccounts;
        this.f180026c = periodItems;
        this.d = statementPeriod;
        this.e = statementNameType;
        this.f = z;
        this.f180027g = countryCodeData;
    }

    public static e a(e eVar, String str, ArrayList arrayList, w wVar, StatementPeriod statementPeriod, Data data, Data data2, int i) {
        if ((i & 1) != 0) {
            str = eVar.f180024a;
        }
        String selectedTabId = str;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = eVar.f180025b;
        }
        List savingsAccounts = list;
        if ((i & 4) != 0) {
            wVar = eVar.f180026c;
        }
        w periodItems = wVar;
        if ((i & 8) != 0) {
            statementPeriod = eVar.d;
        }
        StatementPeriod statementPeriod2 = statementPeriod;
        if ((i & 16) != 0) {
            data = eVar.e;
        }
        Data statementNameType = data;
        boolean z = eVar.f;
        if ((i & 64) != 0) {
            data2 = eVar.f180027g;
        }
        Data countryCodeData = data2;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(savingsAccounts, "savingsAccounts");
        Intrinsics.checkNotNullParameter(periodItems, "periodItems");
        Intrinsics.checkNotNullParameter(statementNameType, "statementNameType");
        Intrinsics.checkNotNullParameter(countryCodeData, "countryCodeData");
        return new e(selectedTabId, savingsAccounts, periodItems, statementPeriod2, statementNameType, z, countryCodeData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f180024a, eVar.f180024a) && Intrinsics.f(this.f180025b, eVar.f180025b) && Intrinsics.f(this.f180026c, eVar.f180026c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && this.f == eVar.f && Intrinsics.f(this.f180027g, eVar.f180027g);
    }

    public final int hashCode() {
        int iHashCode = (this.f180026c.hashCode() + p.a.d(this.f180024a.hashCode() * 31, 31, this.f180025b)) * 31;
        StatementPeriod statementPeriod = this.d;
        return this.f180027g.hashCode() + j6.a.c(kii.e.c(this.e, (iHashCode + (statementPeriod == null ? 0 : statementPeriod.hashCode())) * 31, 31), 31, this.f);
    }
}
