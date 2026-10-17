package g1j;

import aii.r;
import j1j.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f139686a;

    public b(d selectedBalance) {
        Intrinsics.checkNotNullParameter(selectedBalance, "selectedBalance");
        this.f139686a = selectedBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f139686a, ((b) obj2).f139686a);
    }

    public final int hashCode() {
        return this.f139686a.hashCode();
    }
}
