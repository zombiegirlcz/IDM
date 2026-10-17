package tgi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f271185a;

    public e(c message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f271185a = message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f271185a == ((e) obj2).f271185a;
    }

    public final int hashCode() {
        return this.f271185a.hashCode();
    }
}
