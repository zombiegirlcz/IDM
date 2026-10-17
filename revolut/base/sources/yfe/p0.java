package yfe;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f313289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f313290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f313291c;

    public p0(int i, Clause title, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f313289a = title;
        this.f313290b = i;
        this.f313291c = clause;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // yfe.r0
    public final Clause a() {
        return this.f313289a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return this.f313289a.equals(p0Var.f313289a) && this.f313290b == p0Var.f313290b && Intrinsics.f(this.f313291c, p0Var.f313291c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f313290b, this.f313289a.hashCode() * 31, 31);
        Clause clause = this.f313291c;
        return iB + (clause == null ? 0 : clause.hashCode());
    }
}
