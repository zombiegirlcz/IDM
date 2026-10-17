package j1f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170379b;

    public /* synthetic */ f0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(d0.f170374a.getDescriptor(), i, 3);
            throw null;
        }
        this.f170378a = str;
        this.f170379b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f170378a, f0Var.f170378a) && Intrinsics.f(this.f170379b, f0Var.f170379b);
    }

    public final int hashCode() {
        return this.f170379b.hashCode() + (this.f170378a.hashCode() * 31);
    }

    public f0(String revPoints, String partnerPoints) {
        Intrinsics.checkNotNullParameter(revPoints, "revPoints");
        Intrinsics.checkNotNullParameter(partnerPoints, "partnerPoints");
        this.f170378a = revPoints;
        this.f170379b = partnerPoints;
    }
}
