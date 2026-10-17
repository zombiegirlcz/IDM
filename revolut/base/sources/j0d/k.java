package j0d;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170007c;

    public /* synthetic */ k(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(i.f170004a.getDescriptor(), i, 7);
            throw null;
        }
        this.f170005a = str;
        this.f170006b = str2;
        this.f170007c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f170005a, kVar.f170005a) && Intrinsics.f(this.f170006b, kVar.f170006b) && Intrinsics.f(this.f170007c, kVar.f170007c);
    }

    public final int hashCode() {
        int iHashCode = this.f170005a.hashCode() * 31;
        String str = this.f170006b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f170007c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
