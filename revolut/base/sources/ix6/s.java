package ix6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169411a;

    public s(String customerId) {
        Intrinsics.checkNotNullParameter(customerId, "customerId");
        this.f169411a = customerId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f169411a, ((s) obj2).f169411a);
    }

    public final int hashCode() {
        return this.f169411a.hashCode();
    }
}
