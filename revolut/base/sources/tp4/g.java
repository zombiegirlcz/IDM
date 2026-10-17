package tp4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273270a;

    public g(String mandateId) {
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        this.f273270a = mandateId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f273270a, ((g) obj2).f273270a);
    }

    public final int hashCode() {
        return this.f273270a.hashCode();
    }
}
