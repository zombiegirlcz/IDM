package t14;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u0012\u0010\u001dR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\f\u0010!R\u001c\u0010'\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006("}, d2 = {"Lt14/o;", "", "", "toString", "()Ljava/lang/String;", "Lt14/q;", "a", "Lt14/q;", "f", "()Lt14/q;", "parameters", "Lt14/h;", "b", "Lt14/h;", "e", "()Lt14/h;", "offerContent", "Lt14/a;", "c", "Lt14/a;", "()Lt14/a;", "calculator", "Lm04/b;", "d", "Lm04/b;", "()Lm04/b;", "insurance", "Ld04/a;", "Ld04/a;", "()Ld04/a;", "editRepaymentType", "Lz14/a;", "Lz14/a;", "()Lz14/a;", "creditsToRefinance", "Lf04/a;", "g", "Lf04/a;", "()Lf04/a;", "repaymentDaySelection", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("parameters")
    private final q parameters;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("offer")
    private final h offerContent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("calculator")
    private final a calculator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("insurance")
    private final m04.b insurance;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("editRepaymentType")
    private final d04.a editRepaymentType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("creditsToRefinance")
    private final z14.a creditsToRefinance;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentDaySelection")
    private final f04.a repaymentDaySelection;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getCalculator() {
        return this.calculator;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final z14.a getCreditsToRefinance() {
        return this.creditsToRefinance;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d04.a getEditRepaymentType() {
        return this.editRepaymentType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final m04.b getInsurance() {
        return this.insurance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h getOfferContent() {
        return this.offerContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.parameters, oVar.parameters) && Intrinsics.f(this.offerContent, oVar.offerContent) && Intrinsics.f(this.calculator, oVar.calculator) && Intrinsics.f(this.insurance, oVar.insurance) && Intrinsics.f(this.editRepaymentType, oVar.editRepaymentType) && Intrinsics.f(this.creditsToRefinance, oVar.creditsToRefinance) && Intrinsics.f(this.repaymentDaySelection, oVar.repaymentDaySelection);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final q getParameters() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final f04.a getRepaymentDaySelection() {
        return this.repaymentDaySelection;
    }

    public final int hashCode() {
        q qVar = this.parameters;
        int iHashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        h hVar = this.offerContent;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        a aVar = this.calculator;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        m04.b bVar = this.insurance;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d04.a aVar2 = this.editRepaymentType;
        int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        z14.a aVar3 = this.creditsToRefinance;
        int iHashCode6 = (iHashCode5 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        f04.a aVar4 = this.repaymentDaySelection;
        return iHashCode6 + (aVar4 != null ? aVar4.hashCode() : 0);
    }
}
