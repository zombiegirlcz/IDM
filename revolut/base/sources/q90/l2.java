package q90;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u001cR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b\u001a\u0010!¨\u0006#"}, d2 = {"Lq90/l2;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "Lq90/o2;", "b", "Lq90/o2;", "h", "()Lq90/o2;", "value", "", "Ljava/util/Collection;", "()Ljava/util/Collection;", "currencies", "d", "e", "style", "hint", "f", "underlineText", "", "g", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "required", "", "Lq90/m2;", "Ljava/util/List;", "()Ljava/util/List;", "validations", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l2 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final o2 value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currencies")
    @NotNull
    private final Collection<String> currencies;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("style")
    private final String style;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("hint")
    private final String hint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("underlineText")
    private final String underlineText;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final Boolean required;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("validations")
    private final List<m2> validations;

    public l2(String id10, o2 o2Var, ArrayList currencies, String str, String str2, String str3, Boolean bool) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.id = id10;
        this.value = o2Var;
        this.currencies = currencies;
        this.style = str;
        this.hint = str2;
        this.underlineText = str3;
        this.required = bool;
        this.validations = null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Collection getCurrencies() {
        return this.currencies;
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
    public final Boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj2;
        return Intrinsics.f(this.id, l2Var.id) && Intrinsics.f(this.value, l2Var.value) && Intrinsics.f(this.currencies, l2Var.currencies) && Intrinsics.f(this.style, l2Var.style) && Intrinsics.f(this.hint, l2Var.hint) && Intrinsics.f(this.underlineText, l2Var.underlineText) && Intrinsics.f(this.required, l2Var.required) && Intrinsics.f(this.validations, l2Var.validations);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUnderlineText() {
        return this.underlineText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getValidations() {
        return this.validations;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final o2 getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        o2 o2Var = this.value;
        int iHashCode2 = (this.currencies.hashCode() + ((iHashCode + (o2Var == null ? 0 : o2Var.hashCode())) * 31)) * 31;
        String str = this.style;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hint;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.underlineText;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.required;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<m2> list = this.validations;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }
}
