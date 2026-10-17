package xfe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f305244a;

    public c(dj0.d remainingBalance) {
        Intrinsics.checkNotNullParameter(remainingBalance, "remainingBalance");
        this.f305244a = remainingBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f305244a, ((c) obj2).f305244a);
    }

    public final int hashCode() {
        return this.f305244a.hashCode();
    }
}
