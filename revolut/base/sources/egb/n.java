package egb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125605b;

    public /* synthetic */ n(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(l.f125602a.getDescriptor(), i, 3);
            throw null;
        }
        this.f125604a = str;
        this.f125605b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f125604a, nVar.f125604a) && Intrinsics.f(this.f125605b, nVar.f125605b);
    }

    public final int hashCode() {
        return this.f125605b.hashCode() + (this.f125604a.hashCode() * 31);
    }
}
