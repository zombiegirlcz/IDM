package pcd;

import java.io.Serializable;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f234904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f234905c;
    public final String d;
    public final String e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f234906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f234907h;

    public x(String id10, a0 state, z role, String firstName, String lastName, long j2, Set permissions, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        this.f234903a = id10;
        this.f234904b = state;
        this.f234905c = role;
        this.d = firstName;
        this.e = lastName;
        this.f = j2;
        this.f234906g = permissions;
        this.f234907h = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f234903a, xVar.f234903a) && this.f234904b == xVar.f234904b && this.f234905c == xVar.f234905c && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e) && this.f == xVar.f && Intrinsics.f(this.f234906g, xVar.f234906g) && Intrinsics.f(this.f234907h, xVar.f234907h);
    }

    public final String getId() {
        return this.f234903a;
    }

    public final int hashCode() {
        int iF = p.a.f(a0.d.c(p.a.c(p.a.c((this.f234905c.hashCode() + ((this.f234904b.hashCode() + (this.f234903a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f234906g);
        String str = this.f234907h;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
