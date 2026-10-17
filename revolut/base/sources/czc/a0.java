package czc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f110182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f110183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f110184c;
    public final ArrayList d;

    public a0(q qVar, boolean z, boolean z3, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f110182a = qVar;
        this.f110183b = z;
        this.f110184c = z3;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f110182a, a0Var.f110182a) && this.f110183b == a0Var.f110183b && this.f110184c == a0Var.f110184c && this.d.equals(a0Var.d);
    }

    public final int hashCode() {
        q qVar = this.f110182a;
        return this.d.hashCode() + j6.a.c(j6.a.c((qVar == null ? 0 : qVar.hashCode()) * 31, 31, this.f110183b), 31, this.f110184c);
    }
}
