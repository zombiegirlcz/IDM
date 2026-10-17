package f40;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131992a;

    public e(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f131992a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f131992a, ((e) obj2).f131992a);
    }

    public final int hashCode() {
        return this.f131992a.hashCode();
    }
}
