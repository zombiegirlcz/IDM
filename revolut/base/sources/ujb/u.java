package ujb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280590b;

    public /* synthetic */ u(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(s.f280587a.getDescriptor(), i, 3);
            throw null;
        }
        this.f280589a = str;
        this.f280590b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f280589a, uVar.f280589a) && Intrinsics.f(this.f280590b, uVar.f280590b);
    }

    public final int hashCode() {
        String str = this.f280589a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f280590b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public u(String str) {
        this.f280589a = null;
        this.f280590b = str;
    }
}
