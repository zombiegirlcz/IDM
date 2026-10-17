package ueg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f279397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f279398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f279399c;

    public k0(Clause inputPrimaryText, TimeRangeClause timeRangeClause, TextClause textClause) {
        Intrinsics.checkNotNullParameter(inputPrimaryText, "inputPrimaryText");
        this.f279397a = inputPrimaryText;
        this.f279398b = timeRangeClause;
        this.f279399c = textClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return this.f279397a.equals(k0Var.f279397a) && Intrinsics.f(this.f279398b, k0Var.f279398b) && this.f279399c.equals(k0Var.f279399c);
    }

    public final int hashCode() {
        int iHashCode = this.f279397a.hashCode() * 31;
        Clause clause = this.f279398b;
        return this.f279399c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
