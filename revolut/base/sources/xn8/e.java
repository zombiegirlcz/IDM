package xn8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f307339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f307340b;

    public e(boolean z, String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f307339a = z;
        this.f307340b = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f307339a == eVar.f307339a && Intrinsics.f(this.f307340b, eVar.f307340b);
    }

    public final int hashCode() {
        return this.f307340b.hashCode() + (Boolean.hashCode(this.f307339a) * 31);
    }
}
