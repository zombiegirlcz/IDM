package e93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f123864c;

    public g(String str, String str2, String str3) {
        this.f123862a = str;
        this.f123863b = str2;
        this.f123864c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f123862a, gVar.f123862a) && Intrinsics.f(this.f123863b, gVar.f123863b) && Intrinsics.f(this.f123864c, gVar.f123864c);
    }

    public final int hashCode() {
        String str = this.f123862a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f123863b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f123864c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
