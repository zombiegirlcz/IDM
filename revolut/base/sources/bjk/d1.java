package bjk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class d1 {

    @NotNull
    public static final c1 Companion = new c1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15834b;

    public /* synthetic */ d1(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(b1.f15704a.getDescriptor(), i, 3);
            throw null;
        }
        this.f15833a = str;
        this.f15834b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f15833a, d1Var.f15833a) && Intrinsics.f(this.f15834b, d1Var.f15834b);
    }

    public final int hashCode() {
        return this.f15834b.hashCode() + (this.f15833a.hashCode() * 31);
    }
}
