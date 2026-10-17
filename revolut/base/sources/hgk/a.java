package hgk;

import hha.d;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f152188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f152189b;

    public a(d fromPlan, d toPlan) {
        Intrinsics.checkNotNullParameter(fromPlan, "fromPlan");
        Intrinsics.checkNotNullParameter(toPlan, "toPlan");
        this.f152188a = fromPlan;
        this.f152189b = toPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f152188a, aVar.f152188a) && Intrinsics.f(this.f152189b, aVar.f152189b);
    }

    public final int hashCode() {
        return this.f152189b.hashCode() + (this.f152188a.hashCode() * 31);
    }
}
