package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k4 {

    @NotNull
    public static final j4 Companion = new j4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117735b;

    public /* synthetic */ k4(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(i4.f117716a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117734a = str;
        this.f117735b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj2;
        return Intrinsics.f(this.f117734a, k4Var.f117734a) && Intrinsics.f(this.f117735b, k4Var.f117735b);
    }

    public final int hashCode() {
        String str = this.f117734a;
        return this.f117735b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
