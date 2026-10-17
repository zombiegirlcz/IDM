package gr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145783b;

    public /* synthetic */ i(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(g.f145781a.getDescriptor(), i, 3);
            throw null;
        }
        this.f145782a = str;
        this.f145783b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f145782a, iVar.f145782a) && Intrinsics.f(this.f145783b, iVar.f145783b);
    }

    public final int hashCode() {
        String str = this.f145782a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f145783b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
