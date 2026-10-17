package dp5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116758b;

    public /* synthetic */ g0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(e0.f116742a.getDescriptor(), i, 3);
            throw null;
        }
        this.f116757a = str;
        this.f116758b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f116757a, g0Var.f116757a) && Intrinsics.f(this.f116758b, g0Var.f116758b);
    }

    public final int hashCode() {
        int iHashCode = this.f116757a.hashCode() * 31;
        String str = this.f116758b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
