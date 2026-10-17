package j19;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k0 implements c {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k19.c f170217c;
    public final String d;
    public final k19.q e;

    public /* synthetic */ k0(int i, String str, String str2, k19.c cVar, String str3, k19.q qVar) {
        if (23 != (i & 23)) {
            qlm.j1.f(i0.f170213a.getDescriptor(), i, 23);
            throw null;
        }
        this.f170215a = str;
        this.f170216b = str2;
        this.f170217c = cVar;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        this.e = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f170215a, k0Var.f170215a) && Intrinsics.f(this.f170216b, k0Var.f170216b) && Intrinsics.f(this.f170217c, k0Var.f170217c) && Intrinsics.f(this.d, k0Var.d) && Intrinsics.f(this.e, k0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f170217c.hashCode() + p.a.c(this.f170215a.hashCode() * 31, 31, this.f170216b)) * 31;
        String str = this.d;
        return this.e.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
