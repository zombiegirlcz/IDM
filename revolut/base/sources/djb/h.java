package djb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f115279a;

    public h(List recurringPayments) {
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        this.f115279a = recurringPayments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f115279a, ((h) obj2).f115279a);
    }

    public final int hashCode() {
        return this.f115279a.hashCode();
    }
}
