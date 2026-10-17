package wxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300857a;

    public d(String payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f300857a = payload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f300857a, ((d) obj2).f300857a);
    }

    public final int hashCode() {
        return this.f300857a.hashCode();
    }
}
