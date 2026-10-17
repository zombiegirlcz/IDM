package tt8;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0019"}, d2 = {"Ltt8/c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "d", "()Z", "mandatory", "b", "f", "requiresValidation", "c", "Ljava/lang/String;", "e", "name", "displayName", "inputType", "h", "valueType", "g", "errorMessage", "validationPattern", "feature_kyc_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("mandatory")
    private final boolean mandatory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("requiresValidation")
    private final boolean requiresValidation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("displayName")
    @NotNull
    private final String displayName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("inputType")
    @NotNull
    private final String inputType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("valueType")
    @NotNull
    private final String valueType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("errorMessage")
    private final String errorMessage;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("validationPattern")
    private final String validationPattern;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInputType() {
        return this.inputType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getMandatory() {
        return this.mandatory;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.mandatory == cVar.mandatory && this.requiresValidation == cVar.requiresValidation && Intrinsics.f(this.name, cVar.name) && Intrinsics.f(this.displayName, cVar.displayName) && Intrinsics.f(this.inputType, cVar.inputType) && Intrinsics.f(this.valueType, cVar.valueType) && Intrinsics.f(this.errorMessage, cVar.errorMessage) && Intrinsics.f(this.validationPattern, cVar.validationPattern);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRequiresValidation() {
        return this.requiresValidation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getValidationPattern() {
        return this.validationPattern;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getValueType() {
        return this.valueType;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(j6.a.c(Boolean.hashCode(this.mandatory) * 31, 31, this.requiresValidation), 31, this.name), 31, this.displayName), 31, this.inputType), 31, this.valueType);
        String str = this.errorMessage;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.validationPattern;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
