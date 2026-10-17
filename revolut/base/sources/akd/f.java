package akd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5787b;

    public /* synthetic */ f(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(d.f5785a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5786a = str;
        this.f5787b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f5786a, fVar.f5786a) && Intrinsics.f(this.f5787b, fVar.f5787b);
    }

    public final int hashCode() {
        return this.f5787b.hashCode() + (this.f5786a.hashCode() * 31);
    }
}
