package gp3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m8b.e f145232a;

    public e(m8b.e eventHeader) {
        Intrinsics.checkNotNullParameter(eventHeader, "eventHeader");
        this.f145232a = eventHeader;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f145232a.equals(((e) obj2).f145232a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f145232a.hashCode() * 31);
    }
}
