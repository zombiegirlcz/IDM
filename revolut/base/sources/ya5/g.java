package ya5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f311935a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof g) {
            return Intrinsics.f(this.f311935a, ((g) obj2).f311935a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f311935a.hashCode();
    }

    public final String toString() {
        return "InputAmountParcel(currency=" + this.f311935a + ")";
    }
}
