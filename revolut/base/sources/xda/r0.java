package xda;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class r0 {

    @NotNull
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304360b;

    public /* synthetic */ r0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(p0.f304356a.getDescriptor(), i, 3);
            throw null;
        }
        this.f304359a = str;
        this.f304360b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f304359a, r0Var.f304359a) && Intrinsics.f(this.f304360b, r0Var.f304360b);
    }

    public final int hashCode() {
        return this.f304360b.hashCode() + (this.f304359a.hashCode() * 31);
    }
}
