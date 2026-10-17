package jj7;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\n\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u0010\u0010\u001c¨\u0006\u001f"}, d2 = {"Ljj7/d0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "storyTemplateId", "Ljj7/f0;", "b", "Ljj7/f0;", "d", "()Ljj7/f0;", "productSummary", "Ljj7/r0;", "c", "Ljj7/r0;", "f", "()Ljj7/r0;", "subtypeInfo", "", "Ljj7/w;", "Ljava/util/List;", "()Ljava/util/List;", "coverages", "Ljj7/g0;", "Ljj7/g0;", "()Ljj7/g0;", "docProofReimbursement", "noProofReimbursement", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("storyTemplateId")
    @NotNull
    private final String storyTemplateId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("productSummary")
    @NotNull
    private final f0 productSummary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtypeInfo")
    @NotNull
    private final r0 subtypeInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("coverage")
    @NotNull
    private final List<w> coverages;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("docProofReimbursement")
    @NotNull
    private final g0 docProofReimbursement;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("noProofReimbursement")
    @NotNull
    private final g0 noProofReimbursement;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCoverages() {
        return this.coverages;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g0 getDocProofReimbursement() {
        return this.docProofReimbursement;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g0 getNoProofReimbursement() {
        return this.noProofReimbursement;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f0 getProductSummary() {
        return this.productSummary;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStoryTemplateId() {
        return this.storyTemplateId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.storyTemplateId, d0Var.storyTemplateId) && Intrinsics.f(this.productSummary, d0Var.productSummary) && Intrinsics.f(this.subtypeInfo, d0Var.subtypeInfo) && Intrinsics.f(this.coverages, d0Var.coverages) && Intrinsics.f(this.docProofReimbursement, d0Var.docProofReimbursement) && Intrinsics.f(this.noProofReimbursement, d0Var.noProofReimbursement);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final r0 getSubtypeInfo() {
        return this.subtypeInfo;
    }

    public final int hashCode() {
        return this.noProofReimbursement.hashCode() + ((this.docProofReimbursement.hashCode() + p.a.d((this.subtypeInfo.hashCode() + ((this.productSummary.hashCode() + (this.storyTemplateId.hashCode() * 31)) * 31)) * 31, 31, this.coverages)) * 31);
    }
}
