package pzd;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.statements.impl.ui.consolidated.StatementsModeConfig;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f240969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0e.w f240970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StatementPeriod f240971c;
    public final StatementPeriodType d;
    public final q e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f240972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f240973h;
    public final StatementsModeConfig i;

    public p(Set productTypes, i0e.w periodItems, StatementPeriod statementPeriod, StatementPeriodType statementPeriodType, q selectedTab, boolean z, n action, Data data, StatementsModeConfig modeConfig) {
        Intrinsics.checkNotNullParameter(productTypes, "productTypes");
        Intrinsics.checkNotNullParameter(periodItems, "periodItems");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(modeConfig, "modeConfig");
        this.f240969a = productTypes;
        this.f240970b = periodItems;
        this.f240971c = statementPeriod;
        this.d = statementPeriodType;
        this.e = selectedTab;
        this.f = z;
        this.f240972g = action;
        this.f240973h = data;
        this.i = modeConfig;
    }

    public static p a(p pVar, Set set, i0e.w wVar, StatementPeriod statementPeriod, StatementPeriodType statementPeriodType, q qVar, Data data, int i) {
        if ((i & 1) != 0) {
            set = pVar.f240969a;
        }
        Set productTypes = set;
        if ((i & 2) != 0) {
            wVar = pVar.f240970b;
        }
        i0e.w periodItems = wVar;
        StatementPeriod statementPeriod2 = (i & 4) != 0 ? pVar.f240971c : statementPeriod;
        StatementPeriodType statementPeriodType2 = (i & 8) != 0 ? pVar.d : statementPeriodType;
        q selectedTab = (i & 16) != 0 ? pVar.e : qVar;
        boolean z = pVar.f;
        n action = pVar.f240972g;
        Data data2 = (i & 128) != 0 ? pVar.f240973h : data;
        StatementsModeConfig modeConfig = pVar.i;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(productTypes, "productTypes");
        Intrinsics.checkNotNullParameter(periodItems, "periodItems");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(modeConfig, "modeConfig");
        return new p(productTypes, periodItems, statementPeriod2, statementPeriodType2, selectedTab, z, action, data2, modeConfig);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f240969a, pVar.f240969a) && Intrinsics.f(this.f240970b, pVar.f240970b) && Intrinsics.f(this.f240971c, pVar.f240971c) && this.d == pVar.d && this.e == pVar.e && this.f == pVar.f && this.f240972g == pVar.f240972g && Intrinsics.f(this.f240973h, pVar.f240973h) && Intrinsics.f(this.i, pVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f240970b.hashCode() + (this.f240969a.hashCode() * 31)) * 31;
        StatementPeriod statementPeriod = this.f240971c;
        int iHashCode2 = (iHashCode + (statementPeriod == null ? 0 : statementPeriod.hashCode())) * 31;
        StatementPeriodType statementPeriodType = this.d;
        int iHashCode3 = (this.f240972g.hashCode() + j6.a.c((this.e.hashCode() + ((iHashCode2 + (statementPeriodType == null ? 0 : statementPeriodType.hashCode())) * 31)) * 31, 31, this.f)) * 31;
        Data data = this.f240973h;
        return this.i.hashCode() + ((iHashCode3 + (data != null ? data.hashCode() : 0)) * 31);
    }
}
