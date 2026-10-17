package jr6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PercentageClause f177940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f177941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f177942c;
    public final List d;

    public f(PercentageClause currentRateClause, TextLocalisedClause payoutInfoClause, Clause progressInfoClause, List progress) {
        Intrinsics.checkNotNullParameter(currentRateClause, "currentRateClause");
        Intrinsics.checkNotNullParameter(payoutInfoClause, "payoutInfoClause");
        Intrinsics.checkNotNullParameter(progressInfoClause, "progressInfoClause");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f177940a = currentRateClause;
        this.f177941b = payoutInfoClause;
        this.f177942c = progressInfoClause;
        this.d = progress;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f177940a.equals(fVar.f177940a) && this.f177941b.equals(fVar.f177941b) && this.f177942c.equals(fVar.f177942c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.b(t61.a.a(this.f177940a.hashCode() * 31, 31, this.f177941b), 31, this.f177942c);
    }
}
