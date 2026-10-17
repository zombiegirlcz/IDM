package ed8;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0015"}, d2 = {"Led8/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "juniorId", "Led8/a;", "b", "Led8/a;", "()Led8/a;", "firstPartyMarketing", "f", "thirdPartyMarketing", "d", "e", "personalDataProcessing", "paymentLinks", "firstPartyNfcPayments", "feature_junior_consent_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("youthId")
    @NotNull
    private final String juniorId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstPartyMarketing")
    private final a firstPartyMarketing;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("thirdPartyMarketing")
    private final a thirdPartyMarketing;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("personalDataProcessing")
    private final a personalDataProcessing;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("paymentLinks")
    private final a paymentLinks;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("firstPartyNfcPayments")
    private final a firstPartyNfcPayments;

    public d(String juniorId, a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.juniorId = juniorId;
        this.firstPartyMarketing = aVar;
        this.thirdPartyMarketing = aVar2;
        this.personalDataProcessing = aVar3;
        this.paymentLinks = aVar4;
        this.firstPartyNfcPayments = aVar5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getFirstPartyMarketing() {
        return this.firstPartyMarketing;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getFirstPartyNfcPayments() {
        return this.firstPartyNfcPayments;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getJuniorId() {
        return this.juniorId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getPaymentLinks() {
        return this.paymentLinks;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getPersonalDataProcessing() {
        return this.personalDataProcessing;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.juniorId, dVar.juniorId) && Intrinsics.f(this.firstPartyMarketing, dVar.firstPartyMarketing) && Intrinsics.f(this.thirdPartyMarketing, dVar.thirdPartyMarketing) && Intrinsics.f(this.personalDataProcessing, dVar.personalDataProcessing) && Intrinsics.f(this.paymentLinks, dVar.paymentLinks) && Intrinsics.f(this.firstPartyNfcPayments, dVar.firstPartyNfcPayments);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getThirdPartyMarketing() {
        return this.thirdPartyMarketing;
    }

    public final int hashCode() {
        int iHashCode = this.juniorId.hashCode() * 31;
        a aVar = this.firstPartyMarketing;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.thirdPartyMarketing;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.personalDataProcessing;
        int iHashCode4 = (iHashCode3 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        a aVar4 = this.paymentLinks;
        int iHashCode5 = (iHashCode4 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        a aVar5 = this.firstPartyNfcPayments;
        return iHashCode5 + (aVar5 != null ? aVar5.hashCode() : 0);
    }
}
