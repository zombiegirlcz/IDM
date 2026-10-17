package bp9;

import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f17567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SplitMemberType f17568b;

    public f(Map billsSplits, SplitMemberType owner) {
        Intrinsics.checkNotNullParameter(billsSplits, "billsSplits");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f17567a = billsSplits;
        this.f17568b = owner;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f17567a, fVar.f17567a) && Intrinsics.f(this.f17568b, fVar.f17568b);
    }

    public final int hashCode() {
        return this.f17568b.hashCode() + (this.f17567a.hashCode() * 31);
    }
}
