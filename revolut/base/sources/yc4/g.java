package yc4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312517a;

    public g(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f312517a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f312517a, ((g) obj2).f312517a);
    }

    public final int hashCode() {
        return this.f312517a.hashCode();
    }
}
