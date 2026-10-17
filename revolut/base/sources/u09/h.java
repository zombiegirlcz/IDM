package u09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f276125a;

    public h(g type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f276125a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f276125a == ((h) obj2).f276125a;
    }

    public final int hashCode() {
        return this.f276125a.hashCode();
    }
}
