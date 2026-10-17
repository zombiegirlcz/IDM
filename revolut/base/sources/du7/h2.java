package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h2 {

    @NotNull
    public static final g2 Companion = new g2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d2 f117694b;

    public /* synthetic */ h2(int i, String str, d2 d2Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(c2.f117621a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117693a = str;
        this.f117694b = d2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj2;
        return Intrinsics.f(this.f117693a, h2Var.f117693a) && Intrinsics.f(this.f117694b, h2Var.f117694b);
    }

    public final int hashCode() {
        int iHashCode = this.f117693a.hashCode() * 31;
        d2 d2Var = this.f117694b;
        return iHashCode + (d2Var == null ? 0 : d2Var.hashCode());
    }
}
