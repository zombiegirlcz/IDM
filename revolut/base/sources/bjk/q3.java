package bjk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class q3 {

    @NotNull
    public static final p3 Companion = new p3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16055b;

    public /* synthetic */ q3(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(o3.f16041a.getDescriptor(), i, 3);
            throw null;
        }
        this.f16054a = str;
        this.f16055b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj2;
        return Intrinsics.f(this.f16054a, q3Var.f16054a) && Intrinsics.f(this.f16055b, q3Var.f16055b);
    }

    public final int hashCode() {
        String str = this.f16054a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f16055b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
