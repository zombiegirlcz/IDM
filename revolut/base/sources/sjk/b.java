package sjk;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f263736a;

    public b(Data planSubscription) {
        Intrinsics.checkNotNullParameter(planSubscription, "planSubscription");
        this.f263736a = planSubscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f263736a, ((b) obj2).f263736a);
    }

    public final int hashCode() {
        return this.f263736a.hashCode();
    }
}
