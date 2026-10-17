package u09;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f276156a;

    public w(v domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.f276156a = domain;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && this.f276156a == ((w) obj2).f276156a;
    }

    public final int hashCode() {
        return this.f276156a.hashCode();
    }
}
