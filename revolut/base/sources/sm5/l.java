package sm5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f264362c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ l(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        if (63 != (i & 63)) {
            j1.f(j.f264359a.getDescriptor(), i, 63);
            throw null;
        }
        this.f264360a = str;
        this.f264361b = str2;
        this.f264362c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f264360a, lVar.f264360a) && Intrinsics.f(this.f264361b, lVar.f264361b) && Intrinsics.f(this.f264362c, lVar.f264362c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f);
    }

    public final int hashCode() {
        String str = this.f264360a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f264361b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f264362c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public l(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f264360a = str;
        this.f264361b = str2;
        this.f264362c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }
}
