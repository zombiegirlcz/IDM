package m55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Lm55/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "applicationId", "", "b", "J", "()J", "endDate", "c", "type", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("applicationId")
    private final String applicationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("endDate")
    private final long endDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    public e(String str, long j2, String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.applicationId = str;
        this.endDate = j2;
        this.type = type;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.applicationId, eVar.applicationId) && this.endDate == eVar.endDate && Intrinsics.f(this.type, eVar.type);
    }

    public final int hashCode() {
        String str = this.applicationId;
        return this.type.hashCode() + a0.d.c((str == null ? 0 : str.hashCode()) * 31, 31, this.endDate);
    }
}
