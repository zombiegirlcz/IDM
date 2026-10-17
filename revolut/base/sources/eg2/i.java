package eg2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.i f125532a;

    public i(k71.i transactionDescriptor) {
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        this.f125532a = transactionDescriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f125532a, ((i) obj2).f125532a);
    }

    public final int hashCode() {
        return this.f125532a.hashCode();
    }
}
