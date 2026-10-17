package k50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n4 implements r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t4 f181190a;

    public n4(t4 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f181190a = event;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n4) && Intrinsics.f(this.f181190a, ((n4) obj2).f181190a);
    }

    public final int hashCode() {
        return this.f181190a.hashCode();
    }
}
