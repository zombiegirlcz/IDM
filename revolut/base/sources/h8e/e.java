package h8e;

import do3.n;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f150020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f150021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f150022c;

    public e(List members, Set usersWithWithdraw, n user) {
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(usersWithWithdraw, "usersWithWithdraw");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f150020a = members;
        this.f150021b = usersWithWithdraw;
        this.f150022c = user;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f150020a, eVar.f150020a) && Intrinsics.f(this.f150021b, eVar.f150021b) && Intrinsics.f(this.f150022c, eVar.f150022c);
    }

    public final int hashCode() {
        return this.f150022c.hashCode() + p.a.f(this.f150020a.hashCode() * 31, 31, this.f150021b);
    }
}
