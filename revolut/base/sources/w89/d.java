package w89;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295624c;

    public d(String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f295622a = title;
        this.f295623b = str;
        this.f295624c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f295622a, dVar.f295622a) && Intrinsics.f(this.f295623b, dVar.f295623b) && Intrinsics.f(this.f295624c, dVar.f295624c);
    }

    public final int hashCode() {
        int iHashCode = this.f295622a.hashCode() * 31;
        String str = this.f295623b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f295624c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
