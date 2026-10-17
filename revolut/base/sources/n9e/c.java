package n9e;

import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f213635a;

    public c(p subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f213635a = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f213635a, ((c) obj2).f213635a);
    }

    public final int hashCode() {
        return this.f213635a.hashCode();
    }
}
