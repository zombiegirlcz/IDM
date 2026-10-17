package mx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210152a;

    public b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f210152a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f210152a, ((b) obj2).f210152a);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f210152a;
    }

    public final int hashCode() {
        return this.f210152a.hashCode();
    }
}
