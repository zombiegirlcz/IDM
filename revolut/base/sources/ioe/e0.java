package ioe;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lioe/e0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCertification", "certification", "b", "getCountry", "country", "c", "getRationale", "rationale", "d", "getRationaleDescription", "rationaleDescription", "", "e", "Z", "getNewTaxExemptionFlowEnabled", "()Z", "newTaxExemptionFlowEnabled", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("certification")
    @NotNull
    private final String certification;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("rationale")
    @NotNull
    private final String rationale;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("rationaleDescription")
    private final String rationaleDescription;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("newTaxExemptionFlowEnabled")
    private final boolean newTaxExemptionFlowEnabled;

    public e0(String certification, String country, String rationale) {
        Intrinsics.checkNotNullParameter(certification, "certification");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(rationale, "rationale");
        this.certification = certification;
        this.country = country;
        this.rationale = rationale;
        this.rationaleDescription = null;
        this.newTaxExemptionFlowEnabled = true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.certification, e0Var.certification) && Intrinsics.f(this.country, e0Var.country) && Intrinsics.f(this.rationale, e0Var.rationale) && Intrinsics.f(this.rationaleDescription, e0Var.rationaleDescription) && this.newTaxExemptionFlowEnabled == e0Var.newTaxExemptionFlowEnabled;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.certification.hashCode() * 31, 31, this.country), 31, this.rationale);
        String str = this.rationaleDescription;
        return Boolean.hashCode(this.newTaxExemptionFlowEnabled) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
