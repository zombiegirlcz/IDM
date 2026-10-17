package qp1;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a¨\u0006\u001c"}, d2 = {"Lqp1/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "label", "Lqp1/i;", "Lqp1/i;", "e", "()Lqp1/i;", "value", "Lqp1/c;", "c", "Lqp1/c;", "d", "()Lqp1/c;", "type", "", "Ljava/util/List;", "()Ljava/util/List;", "fields", "Lyo1/f;", "Lyo1/f;", "()Lyo1/f;", "tooltip", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    private final String label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final i value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final c type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fields")
    @NotNull
    private final List<b> fields;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("tooltip")
    private final yo1.f tooltip;

    public b(String str, i iVar, c cVar, List fields, yo1.f fVar) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.label = str;
        this.value = iVar;
        this.type = cVar;
        this.fields = fields;
        this.tooltip = fVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getFields() {
        return this.fields;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final yo1.f getTooltip() {
        return this.tooltip;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final i getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.label, bVar.label) && Intrinsics.f(this.value, bVar.value) && this.type == bVar.type && Intrinsics.f(this.fields, bVar.fields) && Intrinsics.f(this.tooltip, bVar.tooltip);
    }

    public final int hashCode() {
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        i iVar = this.value;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        c cVar = this.type;
        int iD = p.a.d((iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.fields);
        yo1.f fVar = this.tooltip;
        return iD + (fVar != null ? fVar.hashCode() : 0);
    }
}
