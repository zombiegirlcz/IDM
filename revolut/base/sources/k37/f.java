package k37;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds6.q f180625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f180626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final do3.n f180627c;

    public f(ds6.q taxAuthority, List paymentDetails, do3.n user) {
        Intrinsics.checkNotNullParameter(taxAuthority, "taxAuthority");
        Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f180625a = taxAuthority;
        this.f180626b = paymentDetails;
        this.f180627c = user;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f180625a, fVar.f180625a) && Intrinsics.f(this.f180626b, fVar.f180626b) && Intrinsics.f(this.f180627c, fVar.f180627c);
    }

    public final int hashCode() {
        return this.f180627c.hashCode() + p.a.d(this.f180625a.hashCode() * 31, 31, this.f180626b);
    }
}
