package jhb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f174195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f174196b;

    public /* synthetic */ g(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(e.f174194a.getDescriptor(), i, 3);
            throw null;
        }
        this.f174195a = str;
        this.f174196b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f174195a, gVar.f174195a) && Intrinsics.f(this.f174196b, gVar.f174196b);
    }

    public final int hashCode() {
        return this.f174196b.hashCode() + (this.f174195a.hashCode() * 31);
    }
}
