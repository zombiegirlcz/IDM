package pij;

import dej.t1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f236528a;

    public b(t1 subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f236528a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f236528a, ((b) obj2).f236528a);
    }

    public final int hashCode() {
        return this.f236528a.hashCode();
    }
}
