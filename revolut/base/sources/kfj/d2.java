package kfj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lkfj/d2;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "mobilePlanIds", "Lkfj/c2;", "b", "Lkfj/c2;", "()Lkfj/c2;", "options", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("mobilePlanIds")
    @NotNull
    private final List<String> mobilePlanIds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("options")
    @NotNull
    private final c2 options;

    public d2(List mobilePlanIds, c2 options) {
        Intrinsics.checkNotNullParameter(mobilePlanIds, "mobilePlanIds");
        Intrinsics.checkNotNullParameter(options, "options");
        this.mobilePlanIds = mobilePlanIds;
        this.options = options;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getMobilePlanIds() {
        return this.mobilePlanIds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c2 getOptions() {
        return this.options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj2;
        return Intrinsics.f(this.mobilePlanIds, d2Var.mobilePlanIds) && Intrinsics.f(this.options, d2Var.options);
    }

    public final int hashCode() {
        return this.options.hashCode() + (this.mobilePlanIds.hashCode() * 31);
    }
}
