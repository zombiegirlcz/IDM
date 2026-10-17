package zga;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oga.f f322102a;

    public i(oga.f nudge) {
        Intrinsics.checkNotNullParameter(nudge, "nudge");
        this.f322102a = nudge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f322102a, ((i) obj2).f322102a);
    }

    public final int hashCode() {
        return this.f322102a.hashCode();
    }
}
