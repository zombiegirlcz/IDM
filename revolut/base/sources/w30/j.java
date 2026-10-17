package w30;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Period f294091a;

    public j(Period duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f294091a = duration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f294091a, ((j) obj2).f294091a);
    }

    public final int hashCode() {
        return this.f294091a.hashCode();
    }
}
