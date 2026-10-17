package q9k;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f243914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f243915b;

    public a(String juniorFirstName, List pockets) {
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        this.f243914a = juniorFirstName;
        this.f243915b = pockets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f243914a, aVar.f243914a) && Intrinsics.f(this.f243915b, aVar.f243915b);
    }

    public final int hashCode() {
        return this.f243915b.hashCode() + (this.f243914a.hashCode() * 31);
    }
}
