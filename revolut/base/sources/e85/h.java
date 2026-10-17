package e85;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f123584a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof h) {
            return Intrinsics.f(this.f123584a, ((h) obj2).f123584a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f123584a.hashCode();
    }

    public final String toString() {
        return "InputAmountParcel(currency=" + this.f123584a + ")";
    }
}
