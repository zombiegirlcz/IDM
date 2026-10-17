package b3a;

import jq9.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f12018a;

    public e(t recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f12018a = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f12018a, ((e) obj2).f12018a);
    }

    public final int hashCode() {
        return this.f12018a.hashCode();
    }
}
