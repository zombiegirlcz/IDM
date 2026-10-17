package j9e;

import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f172319a;

    public b(p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f172319a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f172319a, ((b) obj2).f172319a);
    }

    public final int hashCode() {
        return this.f172319a.hashCode();
    }
}
