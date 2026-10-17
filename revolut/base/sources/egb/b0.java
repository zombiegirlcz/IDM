package egb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class b0 implements g0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125581c;
    public final String d;

    public /* synthetic */ b0(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(z.f125626a.getDescriptor(), i, 15);
            throw null;
        }
        this.f125579a = str;
        this.f125580b = str2;
        this.f125581c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f125579a, b0Var.f125579a) && Intrinsics.f(this.f125580b, b0Var.f125580b) && Intrinsics.f(this.f125581c, b0Var.f125581c) && Intrinsics.f(this.d, b0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f125579a.hashCode() * 31, 31, this.f125580b), 31, this.f125581c);
    }
}
