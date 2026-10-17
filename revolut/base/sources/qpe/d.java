package qpe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248375a;

    public d(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f248375a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f248375a, ((d) obj2).f248375a);
    }

    public final int hashCode() {
        return this.f248375a.hashCode();
    }
}
