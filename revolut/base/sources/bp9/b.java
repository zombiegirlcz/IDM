package bp9;

import com.revolut.feature.payments.bills_chooser.api.common.SplitMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SplitMethod f17564b;

    public b(List selectedBills, SplitMethod splitMethod) {
        Intrinsics.checkNotNullParameter(selectedBills, "selectedBills");
        Intrinsics.checkNotNullParameter(splitMethod, "splitMethod");
        this.f17563a = selectedBills;
        this.f17564b = splitMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f17563a, bVar.f17563a) && Intrinsics.f(this.f17564b, bVar.f17564b);
    }

    public final int hashCode() {
        return this.f17564b.hashCode() + (this.f17563a.hashCode() * 31);
    }
}
