package chj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24299a;

    public s(String subscriptionId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        this.f24299a = subscriptionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f24299a, ((s) obj2).f24299a);
    }

    public final int hashCode() {
        return this.f24299a.hashCode();
    }
}
