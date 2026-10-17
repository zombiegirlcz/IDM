package xda;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304322b;

    public /* synthetic */ f0(int i, String str, String str2) {
        if (1 != (i & 1)) {
            j1.f(d0.f304314a.getDescriptor(), i, 1);
            throw null;
        }
        this.f304321a = str;
        if ((i & 2) == 0) {
            this.f304322b = null;
        } else {
            this.f304322b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f304321a, f0Var.f304321a) && Intrinsics.f(this.f304322b, f0Var.f304322b);
    }

    public final int hashCode() {
        int iHashCode = this.f304321a.hashCode() * 31;
        String str = this.f304322b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
