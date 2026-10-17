package ty4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final py4.a f275467a;

    public e(py4.a accountInfo) {
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        this.f275467a = accountInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f275467a, ((e) obj2).f275467a);
    }

    public final int hashCode() {
        return this.f275467a.hashCode();
    }
}
