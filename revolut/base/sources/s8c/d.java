package s8c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f260968a;

    public d(c accountDetailsUpdateState) {
        Intrinsics.checkNotNullParameter(accountDetailsUpdateState, "accountDetailsUpdateState");
        this.f260968a = accountDetailsUpdateState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f260968a, ((d) obj2).f260968a);
    }

    public final int hashCode() {
        return this.f260968a.hashCode();
    }
}
