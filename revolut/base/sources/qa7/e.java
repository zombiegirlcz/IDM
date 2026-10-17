package qa7;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1j.d f243975a;

    public e(j1j.d selectedAccount) {
        Intrinsics.checkNotNullParameter(selectedAccount, "selectedAccount");
        this.f243975a = selectedAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f243975a, ((e) obj2).f243975a);
    }

    public final int hashCode() {
        return this.f243975a.hashCode();
    }
}
