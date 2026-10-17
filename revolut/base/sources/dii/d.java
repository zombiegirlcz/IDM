package dii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.l f115067a;

    public d(lw0.l item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f115067a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f115067a, ((d) obj2).f115067a);
    }

    public final int hashCode() {
        return this.f115067a.hashCode();
    }
}
