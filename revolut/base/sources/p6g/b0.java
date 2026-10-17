package p6g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f233272a;

    public b0(y causedByRule) {
        Intrinsics.checkNotNullParameter(causedByRule, "causedByRule");
        this.f233272a = causedByRule;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f233272a, ((b0) obj2).f233272a);
    }

    public final int hashCode() {
        return this.f233272a.hashCode();
    }
}
