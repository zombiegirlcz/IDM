package z7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f319997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f319998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f319999c;

    public /* synthetic */ u(int i, String str, String str2, jo3.a aVar) {
        if (1 != (i & 1)) {
            j1.f(s.f319996a.getDescriptor(), i, 1);
            throw null;
        }
        this.f319997a = aVar;
        if ((i & 2) == 0) {
            this.f319998b = null;
        } else {
            this.f319998b = str;
        }
        if ((i & 4) == 0) {
            this.f319999c = null;
        } else {
            this.f319999c = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f319997a, uVar.f319997a) && Intrinsics.f(this.f319998b, uVar.f319998b) && Intrinsics.f(this.f319999c, uVar.f319999c);
    }

    public final int hashCode() {
        int iHashCode = this.f319997a.hashCode() * 31;
        String str = this.f319998b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f319999c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
