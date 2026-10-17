package brc;

import com.revolut.feature.salary_switch.impl.models.v2.SalarySwitchV2StatusDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SalarySwitchV2StatusDetails f17989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17990b;

    public n(SalarySwitchV2StatusDetails details, boolean z) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f17989a = details;
        this.f17990b = z;
    }

    @Override // brc.p
    public final SalarySwitchV2StatusDetails a() {
        return this.f17989a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f17989a, nVar.f17989a) && this.f17990b == nVar.f17990b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17990b) + (this.f17989a.hashCode() * 31);
    }
}
