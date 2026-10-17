package nx4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u0010\u0010\u001b¨\u0006\u001d"}, d2 = {"Lnx4/m2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "text", "", "b", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "valueUpdated", "Lnx4/s1;", "c", "Lnx4/s1;", "()Lnx4/s1;", "info", "Lnx4/n;", "Lnx4/n;", "()Lnx4/n;", "action", "", "Lnx4/s0;", "Ljava/util/List;", "()Ljava/util/List;", "links", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("text")
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("valueUpdated")
    private final Boolean valueUpdated;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("info")
    private final s1 info;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("action")
    private final n action;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("links")
    private final List<s0> links;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final n getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final s1 getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getLinks() {
        return this.links;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getValueUpdated() {
        return this.valueUpdated;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj2;
        return Intrinsics.f(this.text, m2Var.text) && Intrinsics.f(this.valueUpdated, m2Var.valueUpdated) && Intrinsics.f(this.info, m2Var.info) && Intrinsics.f(this.action, m2Var.action) && Intrinsics.f(this.links, m2Var.links);
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Boolean bool = this.valueUpdated;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        s1 s1Var = this.info;
        int iHashCode3 = (iHashCode2 + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        n nVar = this.action;
        int iHashCode4 = (iHashCode3 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        List<s0> list = this.links;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }
}
