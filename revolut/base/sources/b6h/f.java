package b6h;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12748b;

    public /* synthetic */ f(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            j1.f(d.f12746a.getDescriptor(), i, 3);
            throw null;
        }
        this.f12747a = str;
        this.f12748b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f12747a, fVar.f12747a) && this.f12748b == fVar.f12748b;
    }

    public final int hashCode() {
        String str = this.f12747a;
        return Boolean.hashCode(this.f12748b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
