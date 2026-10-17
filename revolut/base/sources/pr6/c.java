package pr6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f238936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f238937c;
    public final String d;
    public final String e;
    public final String f;

    public c(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f238935a = str;
        this.f238936b = str2;
        this.f238937c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f238935a, cVar.f238935a) && Intrinsics.f(this.f238936b, cVar.f238936b) && Intrinsics.f(this.f238937c, cVar.f238937c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        String str = this.f238935a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f238936b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f238937c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
