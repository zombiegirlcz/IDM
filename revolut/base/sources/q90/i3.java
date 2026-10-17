package q90;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u001c\u0010!\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b\u0005\u0010 ¨\u0006\""}, d2 = {"Lq90/i3;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "", "Lq90/w3;", "Ljava/util/List;", "g", "()Ljava/util/List;", "validations", "Lq90/q3;", "c", "Lq90/q3;", "h", "()Lq90/q3;", "value", "d", "outerText", "e", "label", "f", "placeholder", "", "Z", "()Z", "required", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "copyButton", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i3 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("validations")
    private final List<w3> validations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final q3 value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("outerText")
    private final String outerText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("label")
    private final String label;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("placeholder")
    @NotNull
    private final String placeholder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("copyButton")
    private final Boolean copyButton;

    public i3(String id10, q3 q3Var, String str, String str2, String placeholder, boolean z, Boolean bool) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        this.id = id10;
        this.validations = null;
        this.value = q3Var;
        this.outerText = str;
        this.label = str2;
        this.placeholder = placeholder;
        this.required = z;
        this.copyButton = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getCopyButton() {
        return this.copyButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOuterText() {
        return this.outerText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj2;
        return Intrinsics.f(this.id, i3Var.id) && Intrinsics.f(this.validations, i3Var.validations) && Intrinsics.f(this.value, i3Var.value) && Intrinsics.f(this.outerText, i3Var.outerText) && Intrinsics.f(this.label, i3Var.label) && Intrinsics.f(this.placeholder, i3Var.placeholder) && this.required == i3Var.required && Intrinsics.f(this.copyButton, i3Var.copyButton);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getValidations() {
        return this.validations;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final q3 getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        List<w3> list = this.validations;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        q3 q3Var = this.value;
        int iHashCode3 = (iHashCode2 + (q3Var == null ? 0 : q3Var.hashCode())) * 31;
        String str = this.outerText;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.label;
        int iC = j6.a.c(p.a.c((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.placeholder), 31, this.required);
        Boolean bool = this.copyButton;
        return iC + (bool != null ? bool.hashCode() : 0);
    }
}
