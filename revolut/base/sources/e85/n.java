package e85;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123594a;

    public n(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f123594a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f123594a, ((n) obj2).f123594a);
    }

    public final int hashCode() {
        return this.f123594a.hashCode();
    }
}
