package bg2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.i f15060a;

    public h(k71.i transactionDescriptor) {
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        this.f15060a = transactionDescriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f15060a, ((h) obj2).f15060a);
    }

    public final int hashCode() {
        return this.f15060a.hashCode();
    }
}
