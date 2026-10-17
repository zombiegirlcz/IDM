package iha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f161314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f161315c;
    public final e d;

    public b(String billingCycleId, f signupReasons, d downgradeReason, e feedback) {
        Intrinsics.checkNotNullParameter(billingCycleId, "billingCycleId");
        Intrinsics.checkNotNullParameter(signupReasons, "signupReasons");
        Intrinsics.checkNotNullParameter(downgradeReason, "downgradeReason");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        this.f161313a = billingCycleId;
        this.f161314b = signupReasons;
        this.f161315c = downgradeReason;
        this.d = feedback;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f161313a, bVar.f161313a) && this.f161314b.equals(bVar.f161314b) && this.f161315c.equals(bVar.f161315c) && this.d.equals(bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f161315c.hashCode() + ((this.f161314b.hashCode() + (this.f161313a.hashCode() * 31)) * 31)) * 961);
    }
}
