package ioe;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001a\u0010 \u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u000e\u0010\u001dR\u001a\u0010!\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010#\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b\"\u0010\u001dR\u001a\u0010$\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006%"}, d2 = {"Lioe/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "countryCode", "l", "requirementForIndividual", "c", "f", "documentName", "d", "description", "e", "documentAcronym", "g", "documentType", "n", "validation", "h", "check", "i", "hint", "", "j", "Z", "()Z", "localTINRequired", "k", "disclosureAllTaxResidencies", "requireUsPersonDeclaration", "m", "requiresValidation", "reportable", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    private final String countryCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("requirementForIndividual")
    @NotNull
    private final String requirementForIndividual;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("documentName")
    @NotNull
    private final String documentName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("documentAcronym")
    @NotNull
    private final String documentAcronym;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("documentType")
    @NotNull
    private final String documentType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("validation")
    @NotNull
    private final String validation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("check")
    @NotNull
    private final String check;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("hint")
    private final String hint;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("localTINRequired")
    private final boolean localTINRequired;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("disclosureAllTaxResidencies")
    private final boolean disclosureAllTaxResidencies;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("requireUsPersonDeclaration")
    private final boolean requireUsPersonDeclaration;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("requiresValidation")
    private final boolean requiresValidation;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("reportable")
    private final boolean reportable;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCheck() {
        return this.check;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDisclosureAllTaxResidencies() {
        return this.disclosureAllTaxResidencies;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDocumentAcronym() {
        return this.documentAcronym;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.countryCode, mVar.countryCode) && Intrinsics.f(this.requirementForIndividual, mVar.requirementForIndividual) && Intrinsics.f(this.documentName, mVar.documentName) && Intrinsics.f(this.description, mVar.description) && Intrinsics.f(this.documentAcronym, mVar.documentAcronym) && Intrinsics.f(this.documentType, mVar.documentType) && Intrinsics.f(this.validation, mVar.validation) && Intrinsics.f(this.check, mVar.check) && Intrinsics.f(this.hint, mVar.hint) && this.localTINRequired == mVar.localTINRequired && this.disclosureAllTaxResidencies == mVar.disclosureAllTaxResidencies && this.requireUsPersonDeclaration == mVar.requireUsPersonDeclaration && this.requiresValidation == mVar.requiresValidation && this.reportable == mVar.reportable;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDocumentName() {
        return this.documentName;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    public final int hashCode() {
        String str = this.countryCode;
        int iC = p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.requirementForIndividual), 31, this.documentName);
        String str2 = this.description;
        int iC2 = p.a.c(p.a.c(p.a.c(p.a.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.documentAcronym), 31, this.documentType), 31, this.validation), 31, this.check);
        String str3 = this.hint;
        return Boolean.hashCode(this.reportable) + j6.a.c(j6.a.c(j6.a.c(j6.a.c((iC2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.localTINRequired), 31, this.disclosureAllTaxResidencies), 31, this.requireUsPersonDeclaration), 31, this.requiresValidation);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getLocalTINRequired() {
        return this.localTINRequired;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getReportable() {
        return this.reportable;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getRequireUsPersonDeclaration() {
        return this.requireUsPersonDeclaration;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getRequirementForIndividual() {
        return this.requirementForIndividual;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getRequiresValidation() {
        return this.requiresValidation;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getValidation() {
        return this.validation;
    }
}
