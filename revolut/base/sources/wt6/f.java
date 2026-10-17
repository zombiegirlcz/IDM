package wt6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lwt6/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getTaxType", "taxType", "Lwt6/i;", "b", "Lwt6/i;", "getSchedulingOptions", "()Lwt6/i;", "schedulingOptions", "", "c", "Z", "getNotificationsEnabled", "()Z", "notificationsEnabled", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxType")
    @NotNull
    private final String taxType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("schedulingOptions")
    @NotNull
    private final i schedulingOptions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("notificationEnabled")
    private final boolean notificationsEnabled;

    public f(String taxType, i schedulingOptions) {
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        Intrinsics.checkNotNullParameter(schedulingOptions, "schedulingOptions");
        this.taxType = taxType;
        this.schedulingOptions = schedulingOptions;
        this.notificationsEnabled = true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.taxType, fVar.taxType) && Intrinsics.f(this.schedulingOptions, fVar.schedulingOptions) && this.notificationsEnabled == fVar.notificationsEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.notificationsEnabled) + ((this.schedulingOptions.hashCode() + (this.taxType.hashCode() * 31)) * 31);
    }
}
