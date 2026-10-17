package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class y6 {

    @NotNull
    public static final x6 Companion = new x6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117915b;

    public /* synthetic */ y6(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(w6.f117894a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117914a = str;
        this.f117915b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj2;
        return Intrinsics.f(this.f117914a, y6Var.f117914a) && Intrinsics.f(this.f117915b, y6Var.f117915b);
    }

    public final int hashCode() {
        return this.f117915b.hashCode() + (this.f117914a.hashCode() * 31);
    }
}
