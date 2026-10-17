package j1f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170423b;

    public /* synthetic */ p0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(n0.f170417a.getDescriptor(), i, 3);
            throw null;
        }
        this.f170422a = str;
        this.f170423b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f170422a, p0Var.f170422a) && Intrinsics.f(this.f170423b, p0Var.f170423b);
    }

    public final int hashCode() {
        return this.f170423b.hashCode() + (this.f170422a.hashCode() * 31);
    }
}
