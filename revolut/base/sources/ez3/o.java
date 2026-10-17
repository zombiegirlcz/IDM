package ez3;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f130911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f130912c;
    public final String d;
    public final Address e;

    public o(String solicitorName, String email, String str, String str2, Address address) {
        Intrinsics.checkNotNullParameter(solicitorName, "solicitorName");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f130910a = solicitorName;
        this.f130911b = email;
        this.f130912c = str;
        this.d = str2;
        this.e = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f130910a, oVar.f130910a) && Intrinsics.f(this.f130911b, oVar.f130911b) && Intrinsics.f(this.f130912c, oVar.f130912c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f130910a.hashCode() * 31, 31, this.f130911b);
        String str = this.f130912c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
