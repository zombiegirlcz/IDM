package klf;

import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p2 implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitBillLink f185556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f185557b;

    public p2(SplitBillLink splitBillLink, List relatedTransactions) {
        Intrinsics.checkNotNullParameter(splitBillLink, "splitBillLink");
        Intrinsics.checkNotNullParameter(relatedTransactions, "relatedTransactions");
        this.f185556a = splitBillLink;
        this.f185557b = relatedTransactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return Intrinsics.f(this.f185556a, p2Var.f185556a) && Intrinsics.f(this.f185557b, p2Var.f185557b);
    }

    public final int hashCode() {
        return this.f185557b.hashCode() + (this.f185556a.hashCode() * 31);
    }
}
