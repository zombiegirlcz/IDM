package l10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class x extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5l.i f191410a;

    public x(o5l.i cardDesign) {
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        this.f191410a = cardDesign;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f191410a, ((x) obj2).f191410a);
    }

    public final int hashCode() {
        return this.f191410a.hashCode();
    }
}
