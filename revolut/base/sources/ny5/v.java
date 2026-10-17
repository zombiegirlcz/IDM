package ny5;

import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SortingType f220677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f220678b;

    public v(SortingType sortingType, ArrayList sortingOrder) {
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        Intrinsics.checkNotNullParameter(sortingOrder, "sortingOrder");
        this.f220677a = sortingType;
        this.f220678b = sortingOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f220677a, vVar.f220677a) && this.f220678b.equals(vVar.f220678b);
    }

    public final int hashCode() {
        return this.f220678b.hashCode() + (this.f220677a.hashCode() * 31);
    }
}
