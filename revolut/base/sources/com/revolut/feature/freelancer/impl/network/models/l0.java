package com.revolut.feature.freelancer.impl.network.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\t\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/models/l0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "supportPhone", "b", "c", "supportEmail", "e", "tradeName", "f", "url", "", "J", "()J", "settlementDelay", "g", "vatNumber", "Lcom/revolut/feature/freelancer/impl/network/models/r;", "Lcom/revolut/feature/freelancer/impl/network/models/r;", "()Lcom/revolut/feature/freelancer/impl/network/models/r;", "changeRequests", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("supportPhone")
    @NotNull
    private final String supportPhone;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("supportEmail")
    @NotNull
    private final String supportEmail;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("tradeName")
    @NotNull
    private final String tradeName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("url")
    private final String url;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("settlementDelay")
    private final long settlementDelay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("vatNumber")
    private final String vatNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("changeRequests")
    private final r changeRequests;

    public l0(String supportPhone, String supportEmail, String tradeName, String str, long j2, String str2, r rVar) {
        Intrinsics.checkNotNullParameter(supportPhone, "supportPhone");
        Intrinsics.checkNotNullParameter(supportEmail, "supportEmail");
        Intrinsics.checkNotNullParameter(tradeName, "tradeName");
        this.supportPhone = supportPhone;
        this.supportEmail = supportEmail;
        this.tradeName = tradeName;
        this.url = str;
        this.settlementDelay = j2;
        this.vatNumber = str2;
        this.changeRequests = rVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final r getChangeRequests() {
        return this.changeRequests;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getSettlementDelay() {
        return this.settlementDelay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSupportEmail() {
        return this.supportEmail;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSupportPhone() {
        return this.supportPhone;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTradeName() {
        return this.tradeName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.supportPhone, l0Var.supportPhone) && Intrinsics.f(this.supportEmail, l0Var.supportEmail) && Intrinsics.f(this.tradeName, l0Var.tradeName) && Intrinsics.f(this.url, l0Var.url) && this.settlementDelay == l0Var.settlementDelay && Intrinsics.f(this.vatNumber, l0Var.vatNumber) && Intrinsics.f(this.changeRequests, l0Var.changeRequests);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getVatNumber() {
        return this.vatNumber;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.supportPhone.hashCode() * 31, 31, this.supportEmail), 31, this.tradeName);
        String str = this.url;
        int iC2 = a0.d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.settlementDelay);
        String str2 = this.vatNumber;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        r rVar = this.changeRequests;
        return iHashCode + (rVar != null ? rVar.hashCode() : 0);
    }
}
