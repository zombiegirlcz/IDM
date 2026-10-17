package brc;

import com.revolut.feature.salary_switch.impl.models.v2.SalarySwitchV2StatusDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SalarySwitchV2StatusDetails f17991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cqc.a f17993c;

    public o(SalarySwitchV2StatusDetails details, boolean z, cqc.a dispute) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(dispute, "dispute");
        this.f17991a = details;
        this.f17992b = z;
        this.f17993c = dispute;
    }

    @Override // brc.p
    public final SalarySwitchV2StatusDetails a() {
        return this.f17991a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f17991a, oVar.f17991a) && this.f17992b == oVar.f17992b && Intrinsics.f(this.f17993c, oVar.f17993c);
    }

    public final int hashCode() {
        return this.f17993c.hashCode() + j6.a.c(this.f17991a.hashCode() * 31, 31, this.f17992b);
    }
}
