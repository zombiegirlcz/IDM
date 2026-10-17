package j49;

import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f171323a;

    public d(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f171323a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f171323a, ((d) obj2).f171323a);
    }

    public final int hashCode() {
        return this.f171323a.hashCode();
    }
}
