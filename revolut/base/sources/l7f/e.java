package l7f;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192580a;

    public e(String selectedInvestorUpdateId) {
        Intrinsics.checkNotNullParameter(selectedInvestorUpdateId, "selectedInvestorUpdateId");
        this.f192580a = selectedInvestorUpdateId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f192580a, ((e) obj2).f192580a);
    }

    public final int hashCode() {
        return this.f192580a.hashCode();
    }
}
