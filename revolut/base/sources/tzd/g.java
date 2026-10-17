package tzd;

import com.revolut.feature.statements.api.models.StatementPeriod;
import i0e.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f275926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementPeriod f275927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f275928c;

    public g(w periodItems, StatementPeriod statementPeriod, h selectedTab) {
        Intrinsics.checkNotNullParameter(periodItems, "periodItems");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        this.f275926a = periodItems;
        this.f275927b = statementPeriod;
        this.f275928c = selectedTab;
    }

    public static g a(g gVar, w periodItems, StatementPeriod statementPeriod, h selectedTab, int i) {
        if ((i & 1) != 0) {
            periodItems = gVar.f275926a;
        }
        if ((i & 2) != 0) {
            statementPeriod = gVar.f275927b;
        }
        if ((i & 4) != 0) {
            selectedTab = gVar.f275928c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(periodItems, "periodItems");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        return new g(periodItems, statementPeriod, selectedTab);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f275926a, gVar.f275926a) && Intrinsics.f(this.f275927b, gVar.f275927b) && this.f275928c == gVar.f275928c;
    }

    public final int hashCode() {
        int iHashCode = this.f275926a.hashCode() * 31;
        StatementPeriod statementPeriod = this.f275927b;
        return this.f275928c.hashCode() + ((iHashCode + (statementPeriod == null ? 0 : statementPeriod.hashCode())) * 31);
    }
}
