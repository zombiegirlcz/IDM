package at8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9018a;

    public c(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f9018a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f9018a, ((c) obj2).f9018a);
    }

    public final int hashCode() {
        return this.f9018a.hashCode();
    }
}
