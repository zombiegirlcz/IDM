package ppe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238593a;

    public d(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f238593a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f238593a, ((d) obj2).f238593a);
    }

    public final int hashCode() {
        return this.f238593a.hashCode();
    }
}
