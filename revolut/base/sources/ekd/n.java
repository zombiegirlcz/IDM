package ekd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f127014c;
    public final String d;
    public final u e;
    public final y f;

    public /* synthetic */ n(int i, String str, String str2, String str3, String str4, u uVar, y yVar) {
        if (47 != (i & 47)) {
            j1.f(l.f127009a.getDescriptor(), i, 47);
            throw null;
        }
        this.f127012a = str;
        this.f127013b = str2;
        this.f127014c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = uVar;
        }
        this.f = yVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f127012a, nVar.f127012a) && Intrinsics.f(this.f127013b, nVar.f127013b) && Intrinsics.f(this.f127014c, nVar.f127014c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f127012a.hashCode() * 31, 31, this.f127013b), 31, this.f127014c), 31, this.d);
        u uVar = this.e;
        return this.f.f127028a.hashCode() + ((iC + (uVar == null ? 0 : uVar.hashCode())) * 31);
    }
}
