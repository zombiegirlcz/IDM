package x7e;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f303180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f303181b;

    public e(List contacts, Set usersWithWithdraw) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        Intrinsics.checkNotNullParameter(usersWithWithdraw, "usersWithWithdraw");
        this.f303180a = contacts;
        this.f303181b = usersWithWithdraw;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f303180a, eVar.f303180a) && Intrinsics.f(this.f303181b, eVar.f303181b);
    }

    public final int hashCode() {
        return this.f303181b.hashCode() + (this.f303180a.hashCode() * 31);
    }
}
