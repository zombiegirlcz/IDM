package lr6;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f199397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f199399c;
    public final String d;
    public final Address e;

    public e(String fullName, String email, String str, String str2, Address address) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(email, "email");
        this.f199397a = fullName;
        this.f199398b = email;
        this.f199399c = str;
        this.d = str2;
        this.e = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f199397a, eVar.f199397a) && Intrinsics.f(this.f199398b, eVar.f199398b) && Intrinsics.f(this.f199399c, eVar.f199399c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f199397a.hashCode() * 31, 31, this.f199398b);
        String str = this.f199399c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Address address = this.e;
        return iHashCode2 + (address != null ? address.hashCode() : 0);
    }
}
