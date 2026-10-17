package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g3 {

    @NotNull
    public static final f3 Companion = new f3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117681b;

    public /* synthetic */ g3(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(e3.f117663a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117680a = str;
        this.f117681b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj2;
        return Intrinsics.f(this.f117680a, g3Var.f117680a) && Intrinsics.f(this.f117681b, g3Var.f117681b);
    }

    public final int hashCode() {
        return this.f117681b.hashCode() + (this.f117680a.hashCode() * 31);
    }
}
