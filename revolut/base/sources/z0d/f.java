package z0d;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f318218g = {null, yhm.j.c(yhm.k.PUBLICATION, new yui.d(18)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f318220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f318221c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public /* synthetic */ f(int i, String str, q qVar, e eVar, boolean z, boolean z3, String str2) {
        if (63 != (i & 63)) {
            j1.f(a.f318213a.getDescriptor(), i, 63);
            throw null;
        }
        this.f318219a = str;
        this.f318220b = qVar;
        this.f318221c = eVar;
        this.d = z;
        this.e = z3;
        this.f = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f318219a, fVar.f318219a) && this.f318220b == fVar.f318220b && Intrinsics.f(this.f318221c, fVar.f318221c) && this.d == fVar.d && this.e == fVar.e && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.f318221c.hashCode() + ((this.f318220b.hashCode() + (this.f318219a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
