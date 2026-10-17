package mx0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f209699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f209700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d01.f f209701c;
    public final boolean d;

    public f8(Clause text, Clause clause, d01.f style, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f209699a = text;
        this.f209700b = clause;
        this.f209701c = style;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj2;
        return Intrinsics.f(this.f209699a, f8Var.f209699a) && Intrinsics.f(this.f209700b, f8Var.f209700b) && this.f209701c == f8Var.f209701c && this.d == f8Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.f209699a.hashCode() * 31;
        Clause clause = this.f209700b;
        return Boolean.hashCode(this.d) + ((this.f209701c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31);
    }
}
