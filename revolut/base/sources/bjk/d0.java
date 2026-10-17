package bjk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v2 f15832c;

    public /* synthetic */ d0(int i, v2 v2Var, String str, String str2) {
        if (7 != (i & 7)) {
            qlm.j1.f(b0.f15703a.getDescriptor(), i, 7);
            throw null;
        }
        this.f15830a = str;
        this.f15831b = str2;
        this.f15832c = v2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f15830a, d0Var.f15830a) && Intrinsics.f(this.f15831b, d0Var.f15831b) && Intrinsics.f(this.f15832c, d0Var.f15832c);
    }

    public final int hashCode() {
        return this.f15832c.hashCode() + p.a.c(this.f15830a.hashCode() * 31, 31, this.f15831b);
    }
}
