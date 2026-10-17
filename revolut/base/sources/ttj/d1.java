package ttj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class d1 {

    @NotNull
    public static final c1 Companion = new c1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f274334c;

    public /* synthetic */ d1(int i, String str, String str2, z0 z0Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(b1.f274323a.getDescriptor(), i, 7);
            throw null;
        }
        this.f274332a = str;
        this.f274333b = str2;
        this.f274334c = z0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f274332a, d1Var.f274332a) && Intrinsics.f(this.f274333b, d1Var.f274333b) && Intrinsics.f(this.f274334c, d1Var.f274334c);
    }

    public final int hashCode() {
        return this.f274334c.hashCode() + p.a.c(this.f274332a.hashCode() * 31, 31, this.f274333b);
    }
}
