package ybd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f312237b;

    public /* synthetic */ g(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(e.f312227a.getDescriptor(), i, 3);
            throw null;
        }
        this.f312236a = str;
        this.f312237b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f312236a, gVar.f312236a) && Intrinsics.f(this.f312237b, gVar.f312237b);
    }

    public final int hashCode() {
        int iHashCode = this.f312236a.hashCode() * 31;
        String str = this.f312237b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public g(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f312236a = name;
        this.f312237b = str;
    }
}
