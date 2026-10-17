package av3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9889c;
    public final String d;

    public c(String label, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f9887a = label;
        this.f9888b = str;
        this.f9889c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f9887a, cVar.f9887a) && Intrinsics.f(this.f9888b, cVar.f9888b) && Intrinsics.f(this.f9889c, cVar.f9889c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f9887a.hashCode() * 31;
        String str = this.f9888b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9889c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
