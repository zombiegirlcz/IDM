package ttj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class z0 {

    @NotNull
    public static final y0 Companion = new y0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274432b;

    public /* synthetic */ z0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(x0.f274428a.getDescriptor(), i, 3);
            throw null;
        }
        this.f274431a = str;
        this.f274432b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f274431a, z0Var.f274431a) && Intrinsics.f(this.f274432b, z0Var.f274432b);
    }

    public final int hashCode() {
        return this.f274432b.hashCode() + (this.f274431a.hashCode() * 31);
    }
}
