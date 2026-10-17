package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f131531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f131532b;

    public /* synthetic */ a0(double d, int i, jo3.a aVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(y.f131770a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131531a = d;
        this.f131532b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Double.compare(this.f131531a, a0Var.f131531a) == 0 && Intrinsics.f(this.f131532b, a0Var.f131532b);
    }

    public final int hashCode() {
        return this.f131532b.hashCode() + (Double.hashCode(this.f131531a) * 31);
    }

    public a0(double d, jo3.a money) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f131531a = d;
        this.f131532b = money;
    }
}
