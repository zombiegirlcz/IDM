package n9e;

import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f213636a;

    public d(p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f213636a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f213636a, ((d) obj2).f213636a);
    }

    public final int hashCode() {
        return this.f213636a.hashCode();
    }
}
