package m2l;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f202198g = {yhm.j.c(yhm.k.PUBLICATION, new m05.d(22)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f202199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f202200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f202201c;
    public final int d;
    public final int e;
    public final int f;

    public /* synthetic */ h(int i, k0 k0Var, int i2, int i3, int i5, int i6, int i21) {
        if (63 != (i & 63)) {
            j1.f(f.f202196a.getDescriptor(), i, 63);
            throw null;
        }
        this.f202199a = k0Var;
        this.f202200b = i2;
        this.f202201c = i3;
        this.d = i5;
        this.e = i6;
        this.f = i21;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f202199a == hVar.f202199a && this.f202200b == hVar.f202200b && this.f202201c == hVar.f202201c && this.d == hVar.d && this.e == hVar.e && this.f == hVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f202201c, j6.a.b(this.f202200b, this.f202199a.hashCode() * 31, 31), 31), 31), 31);
    }

    public h(k0 consensus, int i, int i2, int i3, int i5, int i6) {
        Intrinsics.checkNotNullParameter(consensus, "consensus");
        this.f202199a = consensus;
        this.f202200b = i;
        this.f202201c = i2;
        this.d = i3;
        this.e = i5;
        this.f = i6;
    }
}
