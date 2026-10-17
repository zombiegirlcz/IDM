package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017¨\u0006\u0019"}, d2 = {"Lq90/x0;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "", "Z", "c", "()Z", "required", "hint", "Lq90/w;", "d", "Lq90/w;", "e", "()Lq90/w;", "valueFilter", "Lq90/y0;", "Lq90/y0;", "()Lq90/y0;", "value", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class x0 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("hint")
    private final String hint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("valueFilter")
    private final w valueFilter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("value")
    private final y0 value;

    public x0(String id10, boolean z, String str, w wVar, y0 y0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.id = id10;
        this.required = z;
        this.hint = str;
        this.valueFilter = wVar;
        this.value = y0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final y0 getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final w getValueFilter() {
        return this.valueFilter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.id, x0Var.id) && this.required == x0Var.required && Intrinsics.f(this.hint, x0Var.hint) && Intrinsics.f(this.valueFilter, x0Var.valueFilter) && Intrinsics.f(this.value, x0Var.value);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.id.hashCode() * 31, 31, this.required);
        String str = this.hint;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        w wVar = this.valueFilter;
        int iHashCode2 = (iHashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        y0 y0Var = this.value;
        return iHashCode2 + (y0Var != null ? y0Var.hashCode() : 0);
    }
}
