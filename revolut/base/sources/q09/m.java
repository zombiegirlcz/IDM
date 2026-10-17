package q09;

import ip0.zi0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zi0 f241196a;

    public m(zi0 clickEvent) {
        Intrinsics.checkNotNullParameter(clickEvent, "clickEvent");
        this.f241196a = clickEvent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f241196a, ((m) obj2).f241196a);
    }

    public final int hashCode() {
        return this.f241196a.hashCode();
    }
}
