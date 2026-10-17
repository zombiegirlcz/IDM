package o45;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class e1 extends f1 {

    @NotNull
    public static final d1 Companion = new d1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f222042c;
    public final c d;

    public /* synthetic */ e1(int i, String str, long j2, c cVar) {
        if (7 != (i & 7)) {
            qlm.j1.f(c1.f222025a.getDescriptor(), i, 7);
            throw null;
        }
        this.f222041b = str;
        this.f222042c = j2;
        this.d = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f222041b, e1Var.f222041b) && this.f222042c == e1Var.f222042c && Intrinsics.f(this.d, e1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.d.c(this.f222041b.hashCode() * 31, 31, this.f222042c);
    }

    public e1(String dueDate, long j2, c accruedInterest) {
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(accruedInterest, "accruedInterest");
        this.f222041b = dueDate;
        this.f222042c = j2;
        this.d = accruedInterest;
    }
}
