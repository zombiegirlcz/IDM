package s1l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259176b;

    public /* synthetic */ g(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(e.f259173a.getDescriptor(), i, 3);
            throw null;
        }
        this.f259175a = str;
        this.f259176b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f259175a, gVar.f259175a) && Intrinsics.f(this.f259176b, gVar.f259176b);
    }

    public final int hashCode() {
        int iHashCode = this.f259175a.hashCode() * 31;
        String str = this.f259176b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public g(String label, String str) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f259175a = label;
        this.f259176b = str;
    }
}
