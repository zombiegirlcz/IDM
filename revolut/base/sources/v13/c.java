package v13;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Lv13/c;", "", "", "toString", "()Ljava/lang/String;", "", "Lv13/b;", "a", "Ljava/util/List;", "()Ljava/util/List;", "methods", "b", "upgradableDeliveryMethods", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("deliveryMethods")
    @NotNull
    private final List<b> methods;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("upgradableDeliveryMethods")
    private final List<b> upgradableDeliveryMethods;

    public c(ArrayList methods, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(methods, "methods");
        this.methods = methods;
        this.upgradableDeliveryMethods = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getMethods() {
        return this.methods;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getUpgradableDeliveryMethods() {
        return this.upgradableDeliveryMethods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.methods, cVar.methods) && Intrinsics.f(this.upgradableDeliveryMethods, cVar.upgradableDeliveryMethods);
    }

    public final int hashCode() {
        int iHashCode = this.methods.hashCode() * 31;
        List<b> list = this.upgradableDeliveryMethods;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
