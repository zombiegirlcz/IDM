package ft4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class y implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f137933a;

    public y(k model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f137933a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f137933a, ((y) obj2).f137933a);
    }

    public final int hashCode() {
        return this.f137933a.hashCode();
    }
}
