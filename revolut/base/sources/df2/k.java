package df2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113771c;
    public final String d;
    public final String e;
    public final Boolean f;

    public /* synthetic */ k(int i, Boolean bool, String str, String str2, String str3, String str4, String str5) {
        if (63 != (i & 63)) {
            j1.f(i.f113768a.getDescriptor(), i, 63);
            throw null;
        }
        this.f113769a = str;
        this.f113770b = str2;
        this.f113771c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f113769a, kVar.f113769a) && Intrinsics.f(this.f113770b, kVar.f113770b) && Intrinsics.f(this.f113771c, kVar.f113771c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f113769a.hashCode() * 31, 31, this.f113770b);
        String str = this.f113771c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }
}
