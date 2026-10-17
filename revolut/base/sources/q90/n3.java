package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lq90/n3;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "", "b", "Z", "d", "()Z", "required", "c", "negativeLabel", "positiveLabel", "Lq90/h2;", "e", "Lq90/h2;", "()Lq90/h2;", "value", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n3 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("negativeLabel")
    private final String negativeLabel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("positiveLabel")
    private final String positiveLabel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("value")
    private final h2 value;

    public n3(String id10, boolean z, String str, String str2, h2 h2Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.id = id10;
        this.required = z;
        this.negativeLabel = str;
        this.positiveLabel = str2;
        this.value = h2Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNegativeLabel() {
        return this.negativeLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPositiveLabel() {
        return this.positiveLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h2 getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj2;
        return Intrinsics.f(this.id, n3Var.id) && this.required == n3Var.required && Intrinsics.f(this.negativeLabel, n3Var.negativeLabel) && Intrinsics.f(this.positiveLabel, n3Var.positiveLabel) && Intrinsics.f(this.value, n3Var.value);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.id.hashCode() * 31, 31, this.required);
        String str = this.negativeLabel;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.positiveLabel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        h2 h2Var = this.value;
        return iHashCode2 + (h2Var != null ? h2Var.hashCode() : 0);
    }
}
