package ps0;

import aw0.a6;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f239379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f239380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f239381c;
    public final float d;
    public final a6 e;

    public m(Clause clause, Clause clause2, int i, float f, a6 barColor) {
        Intrinsics.checkNotNullParameter(barColor, "barColor");
        this.f239379a = clause;
        this.f239380b = clause2;
        this.f239381c = i;
        this.d = f;
        this.e = barColor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f239379a, mVar.f239379a) && Intrinsics.f(this.f239380b, mVar.f239380b) && this.f239381c == mVar.f239381c && Float.compare(this.d, mVar.d) == 0 && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        Clause clause = this.f239379a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f239380b;
        return this.e.hashCode() + m72.b.b(this.d, j6.a.b(this.f239381c, (iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31), 31);
    }
}
