package wyd;

import com.revolut.feature.statements.api.models.StatementPeriod;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f301266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0e.w f301267c;
    public final StatementPeriod d;
    public final w e;

    public x(String selectedTabId, Set currencies, i0e.w periodItems, StatementPeriod statementPeriod, w titleState) {
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(periodItems, "periodItems");
        Intrinsics.checkNotNullParameter(titleState, "titleState");
        this.f301265a = selectedTabId;
        this.f301266b = currencies;
        this.f301267c = periodItems;
        this.d = statementPeriod;
        this.e = titleState;
    }

    public static x a(x xVar, String str, Set set, i0e.w wVar, StatementPeriod statementPeriod, w wVar2, int i) {
        if ((i & 1) != 0) {
            str = xVar.f301265a;
        }
        String selectedTabId = str;
        if ((i & 2) != 0) {
            set = xVar.f301266b;
        }
        Set currencies = set;
        if ((i & 4) != 0) {
            wVar = xVar.f301267c;
        }
        i0e.w periodItems = wVar;
        if ((i & 8) != 0) {
            statementPeriod = xVar.d;
        }
        StatementPeriod statementPeriod2 = statementPeriod;
        if ((i & 16) != 0) {
            wVar2 = xVar.e;
        }
        w titleState = wVar2;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(periodItems, "periodItems");
        Intrinsics.checkNotNullParameter(titleState, "titleState");
        return new x(selectedTabId, currencies, periodItems, statementPeriod2, titleState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f301265a, xVar.f301265a) && Intrinsics.f(this.f301266b, xVar.f301266b) && Intrinsics.f(this.f301267c, xVar.f301267c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f301267c.hashCode() + p.a.f(this.f301265a.hashCode() * 31, 31, this.f301266b)) * 31;
        StatementPeriod statementPeriod = this.d;
        return this.e.hashCode() + ((iHashCode + (statementPeriod == null ? 0 : statementPeriod.hashCode())) * 31);
    }
}
