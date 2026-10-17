package c9e;

import aii.e;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f22365a;

    public b(p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f22365a = subscription;
    }

    public final p b() {
        return this.f22365a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f22365a, ((b) obj2).f22365a);
    }

    public final int hashCode() {
        return this.f22365a.hashCode();
    }
}
