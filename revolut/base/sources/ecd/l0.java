package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124607c;

    public /* synthetic */ l0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(j0.f124587a.getDescriptor(), i, 7);
            throw null;
        }
        this.f124605a = str;
        this.f124606b = str2;
        this.f124607c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f124605a, l0Var.f124605a) && Intrinsics.f(this.f124606b, l0Var.f124606b) && Intrinsics.f(this.f124607c, l0Var.f124607c);
    }

    public final int hashCode() {
        int iHashCode = this.f124605a.hashCode() * 31;
        String str = this.f124606b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f124607c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public l0(String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f124605a = title;
        this.f124606b = str;
        this.f124607c = str2;
    }
}
