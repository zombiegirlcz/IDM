package q65;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f242493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f242494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f242495c;

    public g(int i, Data newRepaymentSchedule, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(newRepaymentSchedule, "newRepaymentSchedule");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f242493a = i;
        this.f242494b = newRepaymentSchedule;
        this.f242495c = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f242493a == gVar.f242493a && Intrinsics.f(this.f242494b, gVar.f242494b) && Intrinsics.f(this.f242495c, gVar.f242495c);
    }

    public final int hashCode() {
        return this.f242495c.f297794a.hashCode() + kii.e.c(this.f242494b, Integer.hashCode(this.f242493a) * 31, 31);
    }
}
