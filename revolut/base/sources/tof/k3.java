package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k3 extends i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2 f272879a;

    public k3(l2 predefinedCategory) {
        Intrinsics.checkNotNullParameter(predefinedCategory, "predefinedCategory");
        this.f272879a = predefinedCategory;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k3) && this.f272879a == ((k3) obj2).f272879a;
    }

    @Override // tof.i3
    public final String getId() {
        return le.u1.g(this.f272879a, l3.f272907a);
    }

    public final int hashCode() {
        return this.f272879a.hashCode();
    }
}
