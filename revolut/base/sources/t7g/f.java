package t7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268673c;

    public /* synthetic */ f(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            j1.f(d.f268670a.getDescriptor(), i, 3);
            throw null;
        }
        this.f268671a = str;
        this.f268672b = str2;
        if ((i & 4) == 0) {
            this.f268673c = null;
        } else {
            this.f268673c = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f268671a, fVar.f268671a) && Intrinsics.f(this.f268672b, fVar.f268672b) && Intrinsics.f(this.f268673c, fVar.f268673c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f268671a.hashCode() * 31, 31, this.f268672b);
        String str = this.f268673c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
