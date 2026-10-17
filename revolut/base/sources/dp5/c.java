package dp5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116735c;
    public final String d;
    public final String e;
    public final l f;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, String str5, l lVar) {
        if (63 != (i & 63)) {
            qlm.j1.f(a.f116724a.getDescriptor(), i, 63);
            throw null;
        }
        this.f116733a = str;
        this.f116734b = str2;
        this.f116735c = str3;
        this.d = str4;
        this.e = str5;
        this.f = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f116733a, cVar.f116733a) && Intrinsics.f(this.f116734b, cVar.f116734b) && Intrinsics.f(this.f116735c, cVar.f116735c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f116733a.hashCode() * 31;
        String str = this.f116734b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f116735c);
        String str2 = this.d;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        l lVar = this.f;
        return iHashCode3 + (lVar != null ? lVar.hashCode() : 0);
    }

    public c(String currency, String str, String address, String str2, String str3, l lVar) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f116733a = currency;
        this.f116734b = str;
        this.f116735c = address;
        this.d = str2;
        this.e = str3;
        this.f = lVar;
    }
}
