package afk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zek.f;
import zek.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u000b\u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006\""}, d2 = {"Lafk/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "planId", "", "Lzek/w;", "b", "Ljava/util/List;", "()Ljava/util/List;", "fees", "Ljo3/b;", "Ljo3/b;", "f", "()Ljo3/b;", "totalDueAmount", "Lzek/f;", "d", "Lzek/f;", "()Lzek/f;", "refundAmountCharge", "Lafk/a;", "e", "Lafk/a;", "()Lafk/a;", "nextPayment", "Lafk/d;", "Lafk/d;", "()Lafk/d;", "termsAndConditions", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("planId")
    @NotNull
    private final String planId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fees")
    private final List<w> fees;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalDueAmount")
    private final jo3.b totalDueAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("refundAmountCharge")
    private final f refundAmountCharge;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("nextPayment")
    private final a nextPayment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("termsAndConditions")
    private final d termsAndConditions;

    public c(String planId, ArrayList arrayList, jo3.b bVar, f fVar, a aVar, d dVar) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.planId = planId;
        this.fees = arrayList;
        this.totalDueAmount = bVar;
        this.refundAmountCharge = fVar;
        this.nextPayment = aVar;
        this.termsAndConditions = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getNextPayment() {
        return this.nextPayment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getRefundAmountCharge() {
        return this.refundAmountCharge;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.planId, cVar.planId) && Intrinsics.f(this.fees, cVar.fees) && Intrinsics.f(this.totalDueAmount, cVar.totalDueAmount) && Intrinsics.f(this.refundAmountCharge, cVar.refundAmountCharge) && Intrinsics.f(this.nextPayment, cVar.nextPayment) && Intrinsics.f(this.termsAndConditions, cVar.termsAndConditions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.b getTotalDueAmount() {
        return this.totalDueAmount;
    }

    public final int hashCode() {
        int iHashCode = this.planId.hashCode() * 31;
        List<w> list = this.fees;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        jo3.b bVar = this.totalDueAmount;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        f fVar = this.refundAmountCharge;
        int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        a aVar = this.nextPayment;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d dVar = this.termsAndConditions;
        return iHashCode5 + (dVar != null ? dVar.hashCode() : 0);
    }
}
