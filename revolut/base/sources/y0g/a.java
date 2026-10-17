package y0g;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import lg0.g;
import xge.h;
import yhm.j;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f310211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f310212b;

    public a(e navigationDeeplink) {
        Intrinsics.checkNotNullParameter(navigationDeeplink, "navigationDeeplink");
        this.f310211a = navigationDeeplink;
        this.f310212b = j.b(new h(this, 21));
    }

    public final String a(String param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return g.a(param, this.f310211a.f195041c);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f310211a, ((a) obj2).f310211a);
    }

    public final int hashCode() {
        return this.f310211a.hashCode();
    }
}
