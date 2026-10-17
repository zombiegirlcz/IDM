package rff;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lrff/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "entityId", "c", "entityType", "", "Ljava/util/List;", "d", "()Ljava/util/List;", "labels", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "disableFiltering", "feature_troubleshooter_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("entityId")
    @NotNull
    private final String entityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("entityType")
    @NotNull
    private final String entityType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("labels")
    private final List<String> labels;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("debug")
    private final Boolean disableFiltering;

    public a(String entityId, String entityType, List list, Boolean bool) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        this.entityId = entityId;
        this.entityType = entityType;
        this.labels = list;
        this.disableFiltering = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getDisableFiltering() {
        return this.disableFiltering;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEntityId() {
        return this.entityId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEntityType() {
        return this.entityType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getLabels() {
        return this.labels;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.entityId, aVar.entityId) && Intrinsics.f(this.entityType, aVar.entityType) && Intrinsics.f(this.labels, aVar.labels) && Intrinsics.f(this.disableFiltering, aVar.disableFiltering);
    }

    public final int hashCode() {
        int iC = p.a.c(this.entityId.hashCode() * 31, 31, this.entityType);
        List<String> list = this.labels;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.disableFiltering;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
