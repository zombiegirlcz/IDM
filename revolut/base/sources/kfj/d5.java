package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000e"}, d2 = {"Lkfj/d5;", "", "", "toString", "()Ljava/lang/String;", "", "Lkfj/f5;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "subscriptions", "Lkfj/e5;", "mobilePlans", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("subscriptions")
    @NotNull
    private final List<f5> subscriptions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("mobilePlans")
    @NotNull
    private final List<e5> mobilePlans;

    public d5(ArrayList subscriptions, ArrayList mobilePlans) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        Intrinsics.checkNotNullParameter(mobilePlans, "mobilePlans");
        this.subscriptions = subscriptions;
        this.mobilePlans = mobilePlans;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getMobilePlans() {
        return this.mobilePlans;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getSubscriptions() {
        return this.subscriptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj2;
        return Intrinsics.f(this.subscriptions, d5Var.subscriptions) && Intrinsics.f(this.mobilePlans, d5Var.mobilePlans);
    }

    public final int hashCode() {
        return this.mobilePlans.hashCode() + (this.subscriptions.hashCode() * 31);
    }
}
