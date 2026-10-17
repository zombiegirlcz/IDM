package dd3;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cashback.impl.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends zjh.j implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f113096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hha.d f113097c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(hha.d currentPlan, boolean z) {
        super(currentPlan);
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        this.f113096b = z;
        this.f113097c = currentPlan;
    }

    @Override // dd3.b
    public final TextLocalisedClause c() {
        return this.f113096b ? new TextLocalisedClause(R$string.cashback_source_plan_with_ultra_subtitle, null, null, 14) : new TextLocalisedClause(R$string.cashback_source_plan_subtitle, null, null, 14);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f113096b == lVar.f113096b && Intrinsics.f(this.f113097c, lVar.f113097c);
    }

    public final int hashCode() {
        return this.f113097c.hashCode() + (Boolean.hashCode(this.f113096b) * 31);
    }
}
