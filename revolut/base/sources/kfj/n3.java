package kfj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0006\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0016\u0010\t¨\u0006\u0018"}, d2 = {"Lkfj/n3;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/p3;", "a", "Lkfj/p3;", "e", "()Lkfj/p3;", "subtitle", "b", "d", "description", "", "c", "Ljava/util/List;", "()Ljava/util/List;", "actions", "Lkfj/m3;", "actionItems", "dataUsageDescription", "f", "validityDescription", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtitle")
    private final p3 subtitle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final p3 description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("actions")
    private final List<String> actions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("actionItems")
    private final List<m3> actionItems;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("dataUsageDescription")
    private final p3 dataUsageDescription;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("validityDescription")
    private final p3 validityDescription;

    public n3(p3 p3Var, p3 p3Var2, ArrayList arrayList, ArrayList arrayList2, p3 p3Var3, p3 p3Var4) {
        this.subtitle = p3Var;
        this.description = p3Var2;
        this.actions = arrayList;
        this.actionItems = arrayList2;
        this.dataUsageDescription = p3Var3;
        this.validityDescription = p3Var4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getActionItems() {
        return this.actionItems;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getActions() {
        return this.actions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final p3 getDataUsageDescription() {
        return this.dataUsageDescription;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final p3 getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final p3 getSubtitle() {
        return this.subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj2;
        return Intrinsics.f(this.subtitle, n3Var.subtitle) && Intrinsics.f(this.description, n3Var.description) && Intrinsics.f(this.actions, n3Var.actions) && Intrinsics.f(this.actionItems, n3Var.actionItems) && Intrinsics.f(this.dataUsageDescription, n3Var.dataUsageDescription) && Intrinsics.f(this.validityDescription, n3Var.validityDescription);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final p3 getValidityDescription() {
        return this.validityDescription;
    }

    public final int hashCode() {
        p3 p3Var = this.subtitle;
        int iHashCode = (p3Var == null ? 0 : p3Var.hashCode()) * 31;
        p3 p3Var2 = this.description;
        int iHashCode2 = (iHashCode + (p3Var2 == null ? 0 : p3Var2.hashCode())) * 31;
        List<String> list = this.actions;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<m3> list2 = this.actionItems;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        p3 p3Var3 = this.dataUsageDescription;
        int iHashCode5 = (iHashCode4 + (p3Var3 == null ? 0 : p3Var3.hashCode())) * 31;
        p3 p3Var4 = this.validityDescription;
        return iHashCode5 + (p3Var4 != null ? p3Var4.hashCode() : 0);
    }
}
