package ai9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5222b;

    public e(String planId, int i) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f5221a = planId;
        this.f5222b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f5221a, eVar.f5221a) && this.f5222b == eVar.f5222b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5222b) + (this.f5221a.hashCode() * 31);
    }
}
