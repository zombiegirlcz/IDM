package s14;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Ls14/b;", "", "", "toString", "()Ljava/lang/String;", "Ls14/d;", "a", "Ls14/d;", "b", "()Ls14/d;", "offerInfoDto", "Lc04/a;", "Lc04/a;", "()Lc04/a;", "editOfferDto", "Ld04/a;", "c", "Ld04/a;", "()Ld04/a;", "repaymentTypeSelectionDto", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("offerInfo")
    @NotNull
    private final d offerInfoDto;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("editOffer")
    private final c04.a editOfferDto;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("editRepaymentType")
    private final d04.a repaymentTypeSelectionDto;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c04.a getEditOfferDto() {
        return this.editOfferDto;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getOfferInfoDto() {
        return this.offerInfoDto;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d04.a getRepaymentTypeSelectionDto() {
        return this.repaymentTypeSelectionDto;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.offerInfoDto, bVar.offerInfoDto) && Intrinsics.f(this.editOfferDto, bVar.editOfferDto) && Intrinsics.f(this.repaymentTypeSelectionDto, bVar.repaymentTypeSelectionDto);
    }

    public final int hashCode() {
        int iHashCode = this.offerInfoDto.hashCode() * 31;
        c04.a aVar = this.editOfferDto;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d04.a aVar2 = this.repaymentTypeSelectionDto;
        return iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
