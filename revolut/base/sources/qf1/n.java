package qf1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f245226a;

    public n(l id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f245226a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f245226a == ((n) obj2).f245226a;
    }

    public final int hashCode() {
        return this.f245226a.hashCode();
    }
}
