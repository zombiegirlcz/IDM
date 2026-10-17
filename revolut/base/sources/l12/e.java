package l12;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f191422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f191423b;

    public e(dj0.d targetMoney, boolean z) {
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        this.f191422a = targetMoney;
        this.f191423b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f191422a, eVar.f191422a) && this.f191423b == eVar.f191423b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191423b) + (this.f191422a.hashCode() * 31);
    }
}
