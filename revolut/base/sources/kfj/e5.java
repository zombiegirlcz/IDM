package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lkfj/e5;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/h5;", "a", "Lkfj/h5;", "()Lkfj/h5;", "mobilePlan", "", "b", "I", "()I", "priority", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("mobilePlan")
    @NotNull
    private final h5 mobilePlan;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("priority")
    private final int priority;

    public e5(h5 mobilePlan, int i) {
        Intrinsics.checkNotNullParameter(mobilePlan, "mobilePlan");
        this.mobilePlan = mobilePlan;
        this.priority = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final h5 getMobilePlan() {
        return this.mobilePlan;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj2;
        return Intrinsics.f(this.mobilePlan, e5Var.mobilePlan) && this.priority == e5Var.priority;
    }

    public final int hashCode() {
        return Integer.hashCode(this.priority) + (this.mobilePlan.hashCode() * 31);
    }
}
