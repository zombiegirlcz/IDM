package com.revolut.feature.tax_residency.api.exemption.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/api/exemption/model/TaxExemptionAggregate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxExemptionAggregate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TaxExemptionAggregate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f89970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f89972c;
    public final d d;
    public final d e;
    public final ValidityPeriod f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f89973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PartnerInformation f89974h;
    public final String i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxExemptionAggregate(parcel.readLong(), parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), ValidityPeriod.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : PartnerInformation.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxExemptionAggregate[i];
        }
    }

    public TaxExemptionAggregate(long j2, String taxYear, d utilisedAmount, d dVar, d maxLimit, ValidityPeriod validityPeriod, String str, PartnerInformation partnerInformation, String code) {
        Intrinsics.checkNotNullParameter(taxYear, "taxYear");
        Intrinsics.checkNotNullParameter(utilisedAmount, "utilisedAmount");
        Intrinsics.checkNotNullParameter(maxLimit, "maxLimit");
        Intrinsics.checkNotNullParameter(validityPeriod, "validityPeriod");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f89970a = j2;
        this.f89971b = taxYear;
        this.f89972c = utilisedAmount;
        this.d = dVar;
        this.e = maxLimit;
        this.f = validityPeriod;
        this.f89973g = str;
        this.f89974h = partnerInformation;
        this.i = code;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxExemptionAggregate)) {
            return false;
        }
        TaxExemptionAggregate taxExemptionAggregate = (TaxExemptionAggregate) obj2;
        return this.f89970a == taxExemptionAggregate.f89970a && Intrinsics.f(this.f89971b, taxExemptionAggregate.f89971b) && Intrinsics.f(this.f89972c, taxExemptionAggregate.f89972c) && Intrinsics.f(this.d, taxExemptionAggregate.d) && Intrinsics.f(this.e, taxExemptionAggregate.e) && Intrinsics.f(this.f, taxExemptionAggregate.f) && Intrinsics.f(this.f89973g, taxExemptionAggregate.f89973g) && Intrinsics.f(this.f89974h, taxExemptionAggregate.f89974h) && Intrinsics.f(this.i, taxExemptionAggregate.i);
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(Long.hashCode(this.f89970a) * 31, 31, this.f89971b), 31, this.f89972c);
        d dVar = this.d;
        int iHashCode = (this.f.hashCode() + v7.c((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.e)) * 31;
        String str = this.f89973g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PartnerInformation partnerInformation = this.f89974h;
        return this.i.hashCode() + ((iHashCode2 + (partnerInformation != null ? partnerInformation.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f89970a);
        dest.writeString(this.f89971b);
        dest.writeSerializable(this.f89972c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        this.f.writeToParcel(dest, i);
        dest.writeString(this.f89973g);
        PartnerInformation partnerInformation = this.f89974h;
        if (partnerInformation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            partnerInformation.writeToParcel(dest, i);
        }
        dest.writeString(this.i);
    }
}
