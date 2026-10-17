package aj7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\n\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u0010\u0010\u001c¨\u0006\u001f"}, d2 = {"Laj7/y;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "storyTemplateId", "Laj7/a0;", "b", "Laj7/a0;", "d", "()Laj7/a0;", "productSummary", "Lel7/b;", "c", "Lel7/b;", "f", "()Lel7/b;", "subtypeInfo", "", "Laj7/r;", "Ljava/util/List;", "()Ljava/util/List;", "coverages", "Laj7/b0;", "Laj7/b0;", "()Laj7/b0;", "docProofReimbursement", "noProofReimbursement", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("storyTemplateId")
    @NotNull
    private final String storyTemplateId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("productSummary")
    @NotNull
    private final a0 productSummary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("subtypeInfo")
    @NotNull
    private final el7.b subtypeInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("coverage")
    @NotNull
    private final List<r> coverages;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("docProofReimbursement")
    @NotNull
    private final b0 docProofReimbursement;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("noProofReimbursement")
    @NotNull
    private final b0 noProofReimbursement;

    public y(String storyTemplateId, a0 productSummary, el7.b subtypeInfo, ArrayList coverages, b0 docProofReimbursement, b0 noProofReimbursement) {
        Intrinsics.checkNotNullParameter(storyTemplateId, "storyTemplateId");
        Intrinsics.checkNotNullParameter(productSummary, "productSummary");
        Intrinsics.checkNotNullParameter(subtypeInfo, "subtypeInfo");
        Intrinsics.checkNotNullParameter(coverages, "coverages");
        Intrinsics.checkNotNullParameter(docProofReimbursement, "docProofReimbursement");
        Intrinsics.checkNotNullParameter(noProofReimbursement, "noProofReimbursement");
        this.storyTemplateId = storyTemplateId;
        this.productSummary = productSummary;
        this.subtypeInfo = subtypeInfo;
        this.coverages = coverages;
        this.docProofReimbursement = docProofReimbursement;
        this.noProofReimbursement = noProofReimbursement;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCoverages() {
        return this.coverages;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getDocProofReimbursement() {
        return this.docProofReimbursement;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getNoProofReimbursement() {
        return this.noProofReimbursement;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a0 getProductSummary() {
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
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.storyTemplateId, yVar.storyTemplateId) && Intrinsics.f(this.productSummary, yVar.productSummary) && Intrinsics.f(this.subtypeInfo, yVar.subtypeInfo) && Intrinsics.f(this.coverages, yVar.coverages) && Intrinsics.f(this.docProofReimbursement, yVar.docProofReimbursement) && Intrinsics.f(this.noProofReimbursement, yVar.noProofReimbursement);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final el7.b getSubtypeInfo() {
        return this.subtypeInfo;
    }

    public final int hashCode() {
        return this.noProofReimbursement.hashCode() + ((this.docProofReimbursement.hashCode() + p.a.d((this.subtypeInfo.hashCode() + ((this.productSummary.hashCode() + (this.storyTemplateId.hashCode() * 31)) * 31)) * 31, 31, this.coverages)) * 31);
    }
}
