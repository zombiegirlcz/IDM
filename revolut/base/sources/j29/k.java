package j29;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170756b;

    public /* synthetic */ k(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(i.f170754a.getDescriptor(), i, 3);
            throw null;
        }
        this.f170755a = str;
        this.f170756b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f170755a, kVar.f170755a) && Intrinsics.f(this.f170756b, kVar.f170756b);
    }

    public final int hashCode() {
        int iHashCode = this.f170755a.hashCode() * 31;
        String str = this.f170756b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
