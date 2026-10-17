package ekd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f126995c;
    public final String d;
    public final m0 e;

    public /* synthetic */ e0(int i, String str, String str2, String str3, String str4, m0 m0Var) {
        if (31 != (i & 31)) {
            j1.f(c0.f126989a.getDescriptor(), i, 31);
            throw null;
        }
        this.f126993a = str;
        this.f126994b = str2;
        this.f126995c = str3;
        this.d = str4;
        this.e = m0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f126993a, e0Var.f126993a) && Intrinsics.f(this.f126994b, e0Var.f126994b) && Intrinsics.f(this.f126995c, e0Var.f126995c) && Intrinsics.f(this.d, e0Var.d) && Intrinsics.f(this.e, e0Var.e);
    }

    public final int hashCode() {
        return this.e.f127011a.hashCode() + p.a.c(p.a.c(p.a.c(this.f126993a.hashCode() * 31, 31, this.f126994b), 31, this.f126995c), 31, this.d);
    }
}
