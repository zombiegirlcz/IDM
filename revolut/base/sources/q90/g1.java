package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"Lq90/g1;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "entityType", "", "c", "Z", "e", "()Z", "required", "", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "maxSelected", "preselectedEntityId", "f", "style", "Lq90/j1;", "g", "Lq90/j1;", "()Lq90/j1;", "value", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g1 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("entityType")
    private final String entityType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("maxSelectedOptions")
    private final Integer maxSelected;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("preselectedEntityId")
    private final String preselectedEntityId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("style")
    @NotNull
    private final String style;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final j1 value;

    public g1(String id10, String str, boolean z, Integer num, String str2, String style, j1 j1Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(style, "style");
        this.id = id10;
        this.entityType = str;
        this.required = z;
        this.maxSelected = num;
        this.preselectedEntityId = str2;
        this.style = style;
        this.value = j1Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEntityType() {
        return this.entityType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getMaxSelected() {
        return this.maxSelected;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPreselectedEntityId() {
        return this.preselectedEntityId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.id, g1Var.id) && Intrinsics.f(this.entityType, g1Var.entityType) && this.required == g1Var.required && Intrinsics.f(this.maxSelected, g1Var.maxSelected) && Intrinsics.f(this.preselectedEntityId, g1Var.preselectedEntityId) && Intrinsics.f(this.style, g1Var.style) && Intrinsics.f(this.value, g1Var.value);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final j1 getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.entityType;
        int iC = j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.required);
        Integer num = this.maxSelected;
        int iHashCode2 = (iC + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.preselectedEntityId;
        int iC2 = p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.style);
        j1 j1Var = this.value;
        return iC2 + (j1Var != null ? j1Var.hashCode() : 0);
    }
}
