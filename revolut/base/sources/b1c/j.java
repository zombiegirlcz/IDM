package b1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends com.revolut.feature.rev_points.impl.ui.trophy_room.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11784a;

    public j(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f11784a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f11784a, ((j) obj2).f11784a);
    }

    public final int hashCode() {
        return this.f11784a.hashCode();
    }
}
