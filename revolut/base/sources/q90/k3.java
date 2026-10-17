package q90;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lq90/k3;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "", "b", "Z", "d", "()Z", "required", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "group", "hint", "e", "underlineText", "Lq90/w3;", "f", "Lq90/w3;", "()Lq90/w3;", "validation", "Lq90/e3;", "g", "Lq90/e3;", "()Lq90/e3;", "value", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k3 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("group")
    private final Integer group;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("hint")
    private final String hint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("underlineText")
    private final String underlineText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("validation")
    private final w3 validation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final e3 value;

    public k3(String id10, boolean z, Integer num, String str, String str2, e3 e3Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.id = id10;
        this.required = z;
        this.group = num;
        this.hint = str;
        this.underlineText = str2;
        this.validation = null;
        this.value = e3Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getGroup() {
        return this.group;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getUnderlineText() {
        return this.underlineText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj2;
        return Intrinsics.f(this.id, k3Var.id) && this.required == k3Var.required && Intrinsics.f(this.group, k3Var.group) && Intrinsics.f(this.hint, k3Var.hint) && Intrinsics.f(this.underlineText, k3Var.underlineText) && Intrinsics.f(this.validation, k3Var.validation) && Intrinsics.f(this.value, k3Var.value);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final w3 getValidation() {
        return this.validation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final e3 getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.id.hashCode() * 31, 31, this.required);
        Integer num = this.group;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.hint;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.underlineText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        w3 w3Var = this.validation;
        int iHashCode4 = (iHashCode3 + (w3Var == null ? 0 : w3Var.hashCode())) * 31;
        e3 e3Var = this.value;
        return iHashCode4 + (e3Var != null ? e3Var.hashCode() : 0);
    }
}
