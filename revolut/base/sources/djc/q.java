package djc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f115312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f115313b;

    public q(ArrayList linkedPaymentsForCategory, List recurringPayments) {
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(linkedPaymentsForCategory, "linkedPaymentsForCategory");
        this.f115312a = recurringPayments;
        this.f115313b = linkedPaymentsForCategory;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f115312a.equals(qVar.f115312a) && this.f115313b.equals(qVar.f115313b);
    }

    public final int hashCode() {
        return this.f115313b.hashCode() + (this.f115312a.hashCode() * 31);
    }
}
