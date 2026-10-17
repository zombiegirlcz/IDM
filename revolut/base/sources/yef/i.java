package yef;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312920a;

    public i(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f312920a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f312920a, ((i) obj2).f312920a);
    }

    public final int hashCode() {
        return this.f312920a.hashCode();
    }
}
