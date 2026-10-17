package q90;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0007\u0010\u0004R(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018¨\u0006\u001a"}, d2 = {"Lq90/h4;", "", "", "toString", "()Ljava/lang/String;", "", "Lq90/q0;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "conditions", "Ljava/lang/String;", "e", "id", "c", "conditionStrategy", "", "d", "Ljava/util/Map;", "()Ljava/util/Map;", "externalView", "Lq90/o3;", "Lq90/o3;", "()Lq90/o3;", "endDialog", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("conditions")
    private final List<q0> conditions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("conditionStrategy")
    private final String conditionStrategy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("externalView")
    private final Map<String, Object> externalView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("endDialog")
    private final o3 endDialog;

    public h4(ArrayList arrayList, String id10, String str, Map map, o3 o3Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.conditions = arrayList;
        this.id = id10;
        this.conditionStrategy = str;
        this.externalView = map;
        this.endDialog = o3Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getConditionStrategy() {
        return this.conditionStrategy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getConditions() {
        return this.conditions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final o3 getEndDialog() {
        return this.endDialog;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Map getExternalView() {
        return this.externalView;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj2;
        return Intrinsics.f(this.conditions, h4Var.conditions) && Intrinsics.f(this.id, h4Var.id) && Intrinsics.f(this.conditionStrategy, h4Var.conditionStrategy) && Intrinsics.f(this.externalView, h4Var.externalView) && Intrinsics.f(this.endDialog, h4Var.endDialog);
    }

    public final int hashCode() {
        List<q0> list = this.conditions;
        int iC = p.a.c((list == null ? 0 : list.hashCode()) * 31, 31, this.id);
        String str = this.conditionStrategy;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.externalView;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        o3 o3Var = this.endDialog;
        return iHashCode2 + (o3Var != null ? o3Var.hashCode() : 0);
    }
}
