package nyd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220848a;

    public e(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f220848a = requestId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f220848a, ((e) obj2).f220848a);
    }

    public final int hashCode() {
        return this.f220848a.hashCode();
    }
}
