package wm;

import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f298572a;

    public c(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f298572a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f298572a, ((c) obj2).f298572a);
    }

    public final int hashCode() {
        return this.f298572a.hashCode();
    }
}
