package xkj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f306827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f306828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f306829c;

    public k(Clause clause, TextLocalisedClause buttonTitle, boolean z) {
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f306827a = z;
        this.f306828b = buttonTitle;
        this.f306829c = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f306827a == kVar.f306827a && this.f306828b.equals(kVar.f306828b) && Intrinsics.f(this.f306829c, kVar.f306829c);
    }

    public final int hashCode() {
        int iA = t61.a.a(Boolean.hashCode(this.f306827a) * 31, 31, this.f306828b);
        Clause clause = this.f306829c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
