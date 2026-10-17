package o45;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class v1 extends f1 {

    @NotNull
    public static final u1 Companion = new u1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f222118c;
    public final String d;
    public final c e;

    public /* synthetic */ v1(int i, String str, long j2, String str2, c cVar) {
        if (15 != (i & 15)) {
            qlm.j1.f(t1.f222109a.getDescriptor(), i, 15);
            throw null;
        }
        this.f222117b = str;
        this.f222118c = j2;
        this.d = str2;
        this.e = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj2;
        return Intrinsics.f(this.f222117b, v1Var.f222117b) && this.f222118c == v1Var.f222118c && Intrinsics.f(this.d, v1Var.d) && Intrinsics.f(this.e, v1Var.e);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f222117b.hashCode() * 31, 31, this.f222118c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.e;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public v1(String terminationDate, long j2, String str, c cVar) {
        Intrinsics.checkNotNullParameter(terminationDate, "terminationDate");
        this.f222117b = terminationDate;
        this.f222118c = j2;
        this.d = str;
        this.e = cVar;
    }
}
