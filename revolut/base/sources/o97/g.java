package o97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rp0.y f223103a;

    public g(rp0.y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f223103a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f223103a, ((g) obj2).f223103a);
    }

    public final int hashCode() {
        return this.f223103a.hashCode();
    }
}
