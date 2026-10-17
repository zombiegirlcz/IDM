package wm;

import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f298573a;

    public d(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f298573a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f298573a, ((d) obj2).f298573a);
    }

    public final int hashCode() {
        return this.f298573a.hashCode();
    }
}
