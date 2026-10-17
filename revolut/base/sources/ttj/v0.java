package ttj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class v0 {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274419b;

    public /* synthetic */ v0(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qlm.j1.f(t0.f274406a.getDescriptor(), i, 1);
            throw null;
        }
        this.f274418a = str;
        if ((i & 2) == 0) {
            this.f274419b = null;
        } else {
            this.f274419b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f274418a, v0Var.f274418a) && Intrinsics.f(this.f274419b, v0Var.f274419b);
    }

    public final int hashCode() {
        int iHashCode = this.f274418a.hashCode() * 31;
        String str = this.f274419b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
