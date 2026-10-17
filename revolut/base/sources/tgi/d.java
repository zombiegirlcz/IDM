package tgi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f271184a;

    public d(b message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f271184a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f271184a == ((d) obj2).f271184a;
    }

    public final int hashCode() {
        return this.f271184a.hashCode();
    }
}
