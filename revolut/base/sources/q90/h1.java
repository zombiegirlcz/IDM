package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lq90/h1;", "Lq90/v;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "Lq90/a;", "b", "Lq90/a;", "()Lq90/a;", "action", "entityType", "", "d", "Z", "()Z", "openEntitiesListOnTap", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h1 extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("action")
    private final a action;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("entityType")
    private final String entityType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("openEntitiesListOnTap")
    private final boolean openEntitiesListOnTap;

    public h1(String id10, a aVar, String str, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.id = id10;
        this.action = aVar;
        this.entityType = str;
        this.openEntitiesListOnTap = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEntityType() {
        return this.entityType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getOpenEntitiesListOnTap() {
        return this.openEntitiesListOnTap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.id, h1Var.id) && Intrinsics.f(this.action, h1Var.action) && Intrinsics.f(this.entityType, h1Var.entityType) && this.openEntitiesListOnTap == h1Var.openEntitiesListOnTap;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        a aVar = this.action;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.entityType;
        return Boolean.hashCode(this.openEntitiesListOnTap) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
