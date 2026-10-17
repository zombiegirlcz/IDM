package p6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f233336a;

    public k(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f233336a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f233336a, ((k) obj2).f233336a);
    }

    public final int hashCode() {
        return this.f233336a.hashCode();
    }
}
