package com.revolut.feature.freelancer.impl.network.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/models/m0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getSupportPhone", "supportPhone", "b", "getSupportEmail", "supportEmail", "c", "getTradeName", "tradeName", "d", "getUrl", "url", "Lcom/revolut/feature/freelancer/impl/network/models/b0;", "e", "Lcom/revolut/feature/freelancer/impl/network/models/b0;", "getVatNumber", "()Lcom/revolut/feature/freelancer/impl/network/models/b0;", "vatNumber", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("supportPhone")
    private final String supportPhone = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("supportEmail")
    private final String supportEmail = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("tradeName")
    private final String tradeName = null;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("url")
    private final String url = null;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("vatNumber")
    private final b0 vatNumber;

    public m0(b0 b0Var) {
        this.vatNumber = b0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.supportPhone, m0Var.supportPhone) && Intrinsics.f(this.supportEmail, m0Var.supportEmail) && Intrinsics.f(this.tradeName, m0Var.tradeName) && Intrinsics.f(this.url, m0Var.url) && Intrinsics.f(this.vatNumber, m0Var.vatNumber);
    }

    public final int hashCode() {
        String str = this.supportPhone;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.supportEmail;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tradeName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        b0 b0Var = this.vatNumber;
        return iHashCode4 + (b0Var != null ? b0Var.hashCode() : 0);
    }
}
