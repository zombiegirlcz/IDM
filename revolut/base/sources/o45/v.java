package o45;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f222112c;
    public final String d;
    public final String e;

    public /* synthetic */ v(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            qlm.j1.f(t.f222105a.getDescriptor(), i, 31);
            throw null;
        }
        this.f222110a = str;
        this.f222111b = str2;
        this.f222112c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f222110a, vVar.f222110a) && Intrinsics.f(this.f222111b, vVar.f222111b) && Intrinsics.f(this.f222112c, vVar.f222112c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e);
    }

    public final int hashCode() {
        String str = this.f222110a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f222111b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f222112c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public v(String str, String str2, String str3, String str4, String str5) {
        this.f222110a = str;
        this.f222111b = str2;
        this.f222112c = str3;
        this.d = str4;
        this.e = str5;
    }
}
