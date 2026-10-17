package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkfj/v3;", "", "", "toString", "()Ljava/lang/String;", "", "Lkfj/p3;", "a", "Ljava/util/List;", "()Ljava/util/List;", "items", "Lkfj/t4;", "b", "Lkfj/t4;", "()Lkfj/t4;", "subscriptionStatusIndicator", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("items")
    private final List<p3> items;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subscriptionStatusIndicator")
    private final t4 subscriptionStatusIndicator;

    public v3(ArrayList arrayList, t4 t4Var) {
        this.items = arrayList;
        this.subscriptionStatusIndicator = t4Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final t4 getSubscriptionStatusIndicator() {
        return this.subscriptionStatusIndicator;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj2;
        return Intrinsics.f(this.items, v3Var.items) && Intrinsics.f(this.subscriptionStatusIndicator, v3Var.subscriptionStatusIndicator);
    }

    public final int hashCode() {
        List<p3> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        t4 t4Var = this.subscriptionStatusIndicator;
        return iHashCode + (t4Var != null ? t4Var.hashCode() : 0);
    }
}
