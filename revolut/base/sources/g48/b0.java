package g48;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f140351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140352b;

    public b0(List invitations, String str) {
        Intrinsics.checkNotNullParameter(invitations, "invitations");
        this.f140351a = invitations;
        this.f140352b = str;
    }

    public final String a() {
        return this.f140352b;
    }

    public final List b() {
        return this.f140351a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f140351a, b0Var.f140351a) && Intrinsics.f(this.f140352b, b0Var.f140352b);
    }

    public final int hashCode() {
        int iHashCode = this.f140351a.hashCode() * 31;
        String str = this.f140352b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
