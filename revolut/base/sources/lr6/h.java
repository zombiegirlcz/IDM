package lr6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f199404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f199406c;
    public final String d;
    public final String e;
    public final String f;

    public h(wi0.b countryCode, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f199404a = countryCode;
        this.f199405b = str;
        this.f199406c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f199404a, hVar.f199404a) && Intrinsics.f(this.f199405b, hVar.f199405b) && Intrinsics.f(this.f199406c, hVar.f199406c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f199404a.f297794a.hashCode() * 31;
        String str = this.f199405b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f199406c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }
}
