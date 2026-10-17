package com.revolut.feature.freelancer.impl.network.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u0013"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/models/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "streetLine1", "b", "f", "streetLine2", "c", "d", "region", "city", "country", "postcode", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetLine1")
    private final String streetLine1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("streetLine2")
    private final String streetLine2;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("region")
    private final String region;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("city")
    private final String city;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("country")
    private final String country;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("postcode")
    private final String postcode;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getStreetLine1() {
        return this.streetLine1;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.streetLine1, kVar.streetLine1) && Intrinsics.f(this.streetLine2, kVar.streetLine2) && Intrinsics.f(this.region, kVar.region) && Intrinsics.f(this.city, kVar.city) && Intrinsics.f(this.country, kVar.country) && Intrinsics.f(this.postcode, kVar.postcode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStreetLine2() {
        return this.streetLine2;
    }

    public final int hashCode() {
        String str = this.streetLine1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.streetLine2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.region;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.country;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.postcode;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
