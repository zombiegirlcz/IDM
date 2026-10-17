package t6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f268356a;

    public i(a automation) {
        Intrinsics.checkNotNullParameter(automation, "automation");
        this.f268356a = automation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f268356a == ((i) obj2).f268356a;
    }

    public final int hashCode() {
        return this.f268356a.hashCode();
    }
}
