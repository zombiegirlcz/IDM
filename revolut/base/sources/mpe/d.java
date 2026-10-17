package mpe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207812a;

    public d(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f207812a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f207812a, ((d) obj2).f207812a);
    }

    public final int hashCode() {
        return this.f207812a.hashCode();
    }
}
