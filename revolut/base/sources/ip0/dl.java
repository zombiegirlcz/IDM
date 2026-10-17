package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class dl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p3 f163917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fl f163918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f163919c;

    public dl(p3 barChartDataset, fl flVar, TextClause textClause) {
        Intrinsics.checkNotNullParameter(barChartDataset, "barChartDataset");
        this.f163917a = barChartDataset;
        this.f163918b = flVar;
        this.f163919c = textClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dl)) {
            return false;
        }
        dl dlVar = (dl) obj2;
        return Intrinsics.f(this.f163917a, dlVar.f163917a) && Intrinsics.f(this.f163918b, dlVar.f163918b) && Intrinsics.f(this.f163919c, dlVar.f163919c);
    }

    public final int hashCode() {
        int iHashCode = this.f163917a.hashCode() * 31;
        fl flVar = this.f163918b;
        int iHashCode2 = (iHashCode + (flVar == null ? 0 : flVar.hashCode())) * 31;
        Clause clause = this.f163919c;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }
}
