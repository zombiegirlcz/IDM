package cak;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcak/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "name", "b", "expirationDate", "c", "applicationId", "flowType", "feature_credit_pcw_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("expirationDate")
    @NotNull
    private final String expirationDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("applicationId")
    @NotNull
    private final String applicationId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("flowType")
    @NotNull
    private final String flowType;

    public a(String name, String expirationDate, String applicationId, String flowType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.name = name;
        this.expirationDate = expirationDate;
        this.applicationId = applicationId;
        this.flowType = flowType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFlowType() {
        return this.flowType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.expirationDate, aVar.expirationDate) && Intrinsics.f(this.applicationId, aVar.applicationId) && Intrinsics.f(this.flowType, aVar.flowType);
    }

    public final int hashCode() {
        return this.flowType.hashCode() + p.a.c(p.a.c(this.name.hashCode() * 31, 31, this.expirationDate), 31, this.applicationId);
    }
}
