package as7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8849b;

    public /* synthetic */ j0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(h0.f8843a.getDescriptor(), i, 3);
            throw null;
        }
        this.f8848a = str;
        this.f8849b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f8848a, j0Var.f8848a) && Intrinsics.f(this.f8849b, j0Var.f8849b);
    }

    public final int hashCode() {
        int iHashCode = this.f8848a.hashCode() * 31;
        String str = this.f8849b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public j0(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f8848a = title;
        this.f8849b = str;
    }
}
