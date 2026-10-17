package w30;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294080a;

    public c(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f294080a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f294080a, ((c) obj2).f294080a);
    }

    public final int hashCode() {
        return this.f294080a.hashCode();
    }
}
