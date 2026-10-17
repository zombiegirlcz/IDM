package pij;

import dej.t1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f236524a;

    public a(t1 subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f236524a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f236524a, ((a) obj2).f236524a);
    }

    public final int hashCode() {
        return this.f236524a.hashCode();
    }
}
