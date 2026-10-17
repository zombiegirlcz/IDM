package nxa;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f220505b;

    public /* synthetic */ l0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(j0.f220500a.getDescriptor(), i, 3);
            throw null;
        }
        this.f220504a = str;
        this.f220505b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f220504a, l0Var.f220504a) && Intrinsics.f(this.f220505b, l0Var.f220505b);
    }

    public final int hashCode() {
        return this.f220505b.hashCode() + (this.f220504a.hashCode() * 31);
    }
}
