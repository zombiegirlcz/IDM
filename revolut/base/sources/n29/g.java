package n29;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g implements h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211469b;

    public /* synthetic */ g(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(e.f211464a.getDescriptor(), i, 3);
            throw null;
        }
        this.f211468a = str;
        this.f211469b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f211468a, gVar.f211468a) && Intrinsics.f(this.f211469b, gVar.f211469b);
    }

    public final int hashCode() {
        int iHashCode = this.f211468a.hashCode() * 31;
        String str = this.f211469b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public g(String primary, String str) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.f211468a = primary;
        this.f211469b = str;
    }
}
