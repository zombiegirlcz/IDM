package eu4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f129503a;

    public d(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f129503a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f129503a, ((d) obj2).f129503a);
    }

    @Override // eu4.f
    public final dj0.d f() {
        return this.f129503a;
    }

    public final int hashCode() {
        return this.f129503a.hashCode();
    }
}
