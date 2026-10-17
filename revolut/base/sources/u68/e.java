package u68;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f277505a;

    public e(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f277505a = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f277505a, ((e) obj2).f277505a);
    }

    public final int hashCode() {
        return this.f277505a.hashCode();
    }
}
