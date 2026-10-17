package b1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends com.revolut.feature.rev_points.impl.ui.trophy_room.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y19.i f11787a;

    public l(y19.i type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f11787a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f11787a == ((l) obj2).f11787a;
    }

    public final int hashCode() {
        return this.f11787a.hashCode();
    }
}
