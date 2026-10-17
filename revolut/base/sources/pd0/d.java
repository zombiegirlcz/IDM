package pd0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f235036a;

    public d(Function0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f235036a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f235036a, ((d) obj2).f235036a);
    }

    public final int hashCode() {
        return this.f235036a.hashCode();
    }
}
