package k29;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180425b;

    public /* synthetic */ g(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(e.f180423a.getDescriptor(), i, 3);
            throw null;
        }
        this.f180424a = str;
        this.f180425b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f180424a, gVar.f180424a) && Intrinsics.f(this.f180425b, gVar.f180425b);
    }

    public final int hashCode() {
        int iHashCode = this.f180424a.hashCode() * 31;
        String str = this.f180425b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
