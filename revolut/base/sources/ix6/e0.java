package ix6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f169385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f169386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f169387c;

    public e0(d0 d0Var, List items, c0 c0Var) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f169385a = d0Var;
        this.f169386b = items;
        this.f169387c = c0Var;
    }

    @Override // cli.p
    public final List c() {
        return this.f169386b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f169385a, e0Var.f169385a) && Intrinsics.f(this.f169386b, e0Var.f169386b) && Intrinsics.f(this.f169387c, e0Var.f169387c);
    }

    public final int hashCode() {
        d0 d0Var = this.f169385a;
        int iD = p.a.d((d0Var == null ? 0 : d0Var.hashCode()) * 31, 31, this.f169386b);
        c0 c0Var = this.f169387c;
        return iD + (c0Var != null ? c0Var.hashCode() : 0);
    }
}
