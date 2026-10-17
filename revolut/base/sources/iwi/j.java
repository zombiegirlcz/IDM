package iwi;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Liwi/j;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "()Ljo3/b;", "passPrice", "", "Liwi/i;", "b", "Ljava/util/List;", "()Ljava/util/List;", "passPricePerPlan", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("passPrice")
    @NotNull
    private final jo3.b passPrice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("passPricePerPlan")
    private final List<i> passPricePerPlan;

    public j(ArrayList arrayList, jo3.b passPrice) {
        Intrinsics.checkNotNullParameter(passPrice, "passPrice");
        this.passPrice = passPrice;
        this.passPricePerPlan = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getPassPrice() {
        return this.passPrice;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getPassPricePerPlan() {
        return this.passPricePerPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.passPrice, jVar.passPrice) && Intrinsics.f(this.passPricePerPlan, jVar.passPricePerPlan);
    }

    public final int hashCode() {
        int iHashCode = this.passPrice.hashCode() * 31;
        List<i> list = this.passPricePerPlan;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
