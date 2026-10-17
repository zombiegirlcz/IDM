package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lkfj/f5;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/g5;", "a", "Lkfj/g5;", "b", "()Lkfj/g5;", "subscription", "Lkfj/l3;", "Lkfj/l3;", "()Lkfj/l3;", "contextualOrder", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("subscription")
    @NotNull
    private final g5 subscription;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("contextualOrder")
    @NotNull
    private final l3 contextualOrder;

    public f5(g5 subscription, l3 contextualOrder) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(contextualOrder, "contextualOrder");
        this.subscription = subscription;
        this.contextualOrder = contextualOrder;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l3 getContextualOrder() {
        return this.contextualOrder;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g5 getSubscription() {
        return this.subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj2;
        return Intrinsics.f(this.subscription, f5Var.subscription) && Intrinsics.f(this.contextualOrder, f5Var.contextualOrder);
    }

    public final int hashCode() {
        return this.contextualOrder.hashCode() + (this.subscription.hashCode() * 31);
    }
}
