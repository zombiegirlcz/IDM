package tf2;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k71.i f270214a;

    public f(k71.i transactionDescriptor) {
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        this.f270214a = transactionDescriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f270214a, ((f) obj2).f270214a);
    }

    public final int hashCode() {
        return this.f270214a.hashCode();
    }
}
