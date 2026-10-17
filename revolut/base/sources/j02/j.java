package j02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169922a;

    public j(String customerReference) {
        Intrinsics.checkNotNullParameter(customerReference, "customerReference");
        this.f169922a = customerReference;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f169922a, ((j) obj2).f169922a);
    }

    public final int hashCode() {
        return this.f169922a.hashCode();
    }
}
