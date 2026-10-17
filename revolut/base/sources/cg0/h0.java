package cg0;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcg0/h0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getEntityId", "entityId", "b", "getEntityType", "entityType", "c", "getEntitySubType", "entitySubType", "", "d", "Ljava/lang/Boolean;", "getDisableFiltering", "()Ljava/lang/Boolean;", "disableFiltering", "core_faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("entityId")
    @NotNull
    private final String entityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("entityType")
    @NotNull
    private final String entityType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("entitySubType")
    private final String entitySubType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("debug")
    private final Boolean disableFiltering;

    public h0(String entityId, String entityType, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        this.entityId = entityId;
        this.entityType = entityType;
        this.entitySubType = str;
        this.disableFiltering = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.entityId, h0Var.entityId) && Intrinsics.f(this.entityType, h0Var.entityType) && Intrinsics.f(this.entitySubType, h0Var.entitySubType) && Intrinsics.f(this.disableFiltering, h0Var.disableFiltering);
    }

    public final int hashCode() {
        int iC = p.a.c(this.entityId.hashCode() * 31, 31, this.entityType);
        String str = this.entitySubType;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.disableFiltering;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
