package h3k;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Lh3k/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "label", "c", "type", "", "Lh3k/o$a;", "Ljava/util/List;", "()Ljava/util/List;", "fields", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    @NotNull
    private final String label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fields")
    @NotNull
    private final List<a> fields;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\f\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u000f\u0010 ¨\u0006\""}, d2 = {"Lh3k/o$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "type", "b", "g", "label", "c", "i", "regex", "d", "e", "inputMask", "f", "inputType", "description", "", "Z", "h", "()Z", "optional", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "editable", "defaultValue", "", "Ljava/util/List;", "()Ljava/util/List;", "hidden", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("regex")
        @NotNull
        private final String regex;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("inputMask")
        private final String inputMask;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("inputType")
        private final String inputType;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("optional")
        private final boolean optional;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("editable")
        private final Boolean editable;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("defaultValue")
        private final String defaultValue;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("hidden")
        private final List<String> hidden;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDefaultValue() {
            return this.defaultValue;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Boolean getEditable() {
            return this.editable;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final List getHidden() {
            return this.hidden;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getInputMask() {
            return this.inputMask;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.label, aVar.label) && Intrinsics.f(this.regex, aVar.regex) && Intrinsics.f(this.inputMask, aVar.inputMask) && Intrinsics.f(this.inputType, aVar.inputType) && Intrinsics.f(this.description, aVar.description) && this.optional == aVar.optional && Intrinsics.f(this.editable, aVar.editable) && Intrinsics.f(this.defaultValue, aVar.defaultValue) && Intrinsics.f(this.hidden, aVar.hidden);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getInputType() {
            return this.inputType;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getOptional() {
            return this.optional;
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.label), 31, this.regex);
            String str = this.inputMask;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.inputType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.description;
            int iC2 = j6.a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.optional);
            Boolean bool = this.editable;
            int iHashCode3 = (iC2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str4 = this.defaultValue;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<String> list = this.hidden;
            return iHashCode4 + (list != null ? list.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getRegex() {
            return this.regex;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getType() {
            return this.type;
        }
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
    public final String getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.label, oVar.label) && Intrinsics.f(this.type, oVar.type) && Intrinsics.f(this.fields, oVar.fields);
    }

    public final int hashCode() {
        return this.fields.hashCode() + p.a.c(this.label.hashCode() * 31, 31, this.type);
    }
}
