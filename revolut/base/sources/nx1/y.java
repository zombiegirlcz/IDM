package nx1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f220092a;

    public y(e discovery) {
        Intrinsics.checkNotNullParameter(discovery, "discovery");
        this.f220092a = discovery;
    }

    public final e a() {
        return this.f220092a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f220092a, ((y) obj2).f220092a);
    }

    public final int hashCode() {
        return this.f220092a.hashCode();
    }
}
