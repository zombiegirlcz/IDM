package bjk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class s2 {

    @NotNull
    public static final r2 Companion = new r2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16069b;

    public /* synthetic */ s2(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(q2.f16053a.getDescriptor(), i, 3);
            throw null;
        }
        this.f16068a = str;
        this.f16069b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj2;
        return Intrinsics.f(this.f16068a, s2Var.f16068a) && Intrinsics.f(this.f16069b, s2Var.f16069b);
    }

    public final int hashCode() {
        return this.f16069b.hashCode() + (this.f16068a.hashCode() * 31);
    }
}
