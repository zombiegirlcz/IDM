package q75;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f242750a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof j) {
            return Intrinsics.f(this.f242750a, ((j) obj2).f242750a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f242750a.hashCode();
    }

    public final String toString() {
        return "InputAmountParcel(currency=" + this.f242750a + ")";
    }
}
