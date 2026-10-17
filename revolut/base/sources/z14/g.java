package z14;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\f\u0010\u001dR\u001c\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010'\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b\u001b\u0010&¨\u0006("}, d2 = {"Lz14/g;", "", "", "toString", "()Ljava/lang/String;", "Lz14/h;", "a", "Lz14/h;", "c", "()Lz14/h;", "intro", "Lz14/i;", "b", "Lz14/i;", "f", "()Lz14/i;", "parameters", "Lz14/c;", "Lz14/c;", "()Lz14/c;", "creditsToRefinance", "Lz14/b;", "d", "Lz14/b;", "()Lz14/b;", "offerFixedDto", "Lc04/a;", "e", "Lc04/a;", "()Lc04/a;", "editOfferDto", "Ld04/a;", "Ld04/a;", "g", "()Ld04/a;", "repaymentTypeSelectionDto", "Ls14/d;", "Ls14/d;", "()Ls14/d;", "offerInfoDto", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("introDialog")
    private final h intro;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("parameters")
    @NotNull
    private final i parameters;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditsToRefinance")
    @NotNull
    private final c creditsToRefinance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fixedTermDialog")
    private final b offerFixedDto;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("loanSetup")
    private final c04.a editOfferDto;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("editRepaymentType")
    private final d04.a repaymentTypeSelectionDto;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("finalOffer")
    private final s14.d offerInfoDto;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getCreditsToRefinance() {
        return this.creditsToRefinance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c04.a getEditOfferDto() {
        return this.editOfferDto;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h getIntro() {
        return this.intro;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getOfferFixedDto() {
        return this.offerFixedDto;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final s14.d getOfferInfoDto() {
        return this.offerInfoDto;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.intro, gVar.intro) && Intrinsics.f(this.parameters, gVar.parameters) && Intrinsics.f(this.creditsToRefinance, gVar.creditsToRefinance) && Intrinsics.f(this.offerFixedDto, gVar.offerFixedDto) && Intrinsics.f(this.editOfferDto, gVar.editOfferDto) && Intrinsics.f(this.repaymentTypeSelectionDto, gVar.repaymentTypeSelectionDto) && Intrinsics.f(this.offerInfoDto, gVar.offerInfoDto);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final i getParameters() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d04.a getRepaymentTypeSelectionDto() {
        return this.repaymentTypeSelectionDto;
    }

    public final int hashCode() {
        h hVar = this.intro;
        int iHashCode = (this.creditsToRefinance.hashCode() + ((this.parameters.hashCode() + ((hVar == null ? 0 : hVar.hashCode()) * 31)) * 31)) * 31;
        b bVar = this.offerFixedDto;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c04.a aVar = this.editOfferDto;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d04.a aVar2 = this.repaymentTypeSelectionDto;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        s14.d dVar = this.offerInfoDto;
        return iHashCode4 + (dVar != null ? dVar.hashCode() : 0);
    }
}
