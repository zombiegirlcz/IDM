package q90;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010&\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010+\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010(\u0012\u0004\b*\u0010\u0019\u001a\u0004\b\u0014\u0010)R\u001c\u00100\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b1\u0010\u0004R\u001c\u00105\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b\"\u0010%R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u00067"}, d2 = {"Lq90/v3;", "Lq90/b2;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "Lq90/q3;", "b", "Lq90/q3;", "n", "()Lq90/q3;", "value", "hint", "d", "k", "underlineText", "Lq90/w3;", "e", "Lq90/w3;", "l", "()Lq90/w3;", "getValidation$annotations", "()V", "validation", "", "f", "Ljava/util/List;", "m", "()Ljava/util/List;", "validations", "", "g", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "required", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getMaxLength$annotations", "maxLength", "Lq90/v3$a;", "i", "Lq90/v3$a;", "()Lq90/v3$a;", "shape", "j", "mask", "placeholder", "textTransformation", "placeholderAsInlineHint", "contentType", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v3 extends b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final q3 value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("hint")
    @NotNull
    private final String hint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("underlineText")
    private final String underlineText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("validation")
    private final w3 validation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("validations")
    private final List<w3> validations;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("required")
    private final Boolean required;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxLength")
    private final Integer maxLength;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("shape")
    private final a shape;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("mask")
    private final String mask;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("placeholder")
    private final String placeholder;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("textTransformation")
    private final String textTransformation;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("placeholderAsInlineHint")
    private final Boolean placeholderAsInlineHint;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("contentType")
    private final String contentType;

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lq90/v3$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "linesCount", "", "Z", "()Z", "expandable", "core_backend_flow_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("linesCount")
        private final int linesCount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("expandable")
        private final boolean expandable;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getExpandable() {
            return this.expandable;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getLinesCount() {
            return this.linesCount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.linesCount == aVar.linesCount && this.expandable == aVar.expandable;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.expandable) + (Integer.hashCode(this.linesCount) * 31);
        }
    }

    public v3(String id10, q3 q3Var, String hint, String str, Boolean bool, Integer num, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.id = id10;
        this.value = q3Var;
        this.hint = hint;
        this.underlineText = str;
        this.validation = null;
        this.validations = null;
        this.required = bool;
        this.maxLength = num;
        this.shape = null;
        this.mask = str2;
        this.placeholder = str3;
        this.textTransformation = str4;
        this.placeholderAsInlineHint = null;
        this.contentType = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContentType() {
        return this.contentType;
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
    public final String getMask() {
        return this.mask;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj2;
        return Intrinsics.f(this.id, v3Var.id) && Intrinsics.f(this.value, v3Var.value) && Intrinsics.f(this.hint, v3Var.hint) && Intrinsics.f(this.underlineText, v3Var.underlineText) && Intrinsics.f(this.validation, v3Var.validation) && Intrinsics.f(this.validations, v3Var.validations) && Intrinsics.f(this.required, v3Var.required) && Intrinsics.f(this.maxLength, v3Var.maxLength) && Intrinsics.f(this.shape, v3Var.shape) && Intrinsics.f(this.mask, v3Var.mask) && Intrinsics.f(this.placeholder, v3Var.placeholder) && Intrinsics.f(this.textTransformation, v3Var.textTransformation) && Intrinsics.f(this.placeholderAsInlineHint, v3Var.placeholderAsInlineHint) && Intrinsics.f(this.contentType, v3Var.contentType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getPlaceholderAsInlineHint() {
        return this.placeholderAsInlineHint;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getRequired() {
        return this.required;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        q3 q3Var = this.value;
        int iC = p.a.c((iHashCode + (q3Var == null ? 0 : q3Var.hashCode())) * 31, 31, this.hint);
        String str = this.underlineText;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        w3 w3Var = this.validation;
        int iHashCode3 = (iHashCode2 + (w3Var == null ? 0 : w3Var.hashCode())) * 31;
        List<w3> list = this.validations;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.required;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.maxLength;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        a aVar = this.shape;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.mask;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placeholder;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textTransformation;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.placeholderAsInlineHint;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.contentType;
        return iHashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final a getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTextTransformation() {
        return this.textTransformation;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getUnderlineText() {
        return this.underlineText;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final w3 getValidation() {
        return this.validation;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final List getValidations() {
        return this.validations;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final q3 getValue() {
        return this.value;
    }
}
