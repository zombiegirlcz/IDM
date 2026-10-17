package com.revolut.feature.pricingplans.models;

import android.os.Parcel;
import android.os.Parcelable;
import hha.o;
import ip0.v7;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PricingPlanOfferDiscount;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanOfferDiscount implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanOfferDiscount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f81127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f81128c;
    public final PricingPlanOfferCode d;
    public final Period e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PricingPlanOfferDiscount(parcel.readString(), (dj0.d) parcel.readSerializable(), (o) parcel.readSerializable(), parcel.readInt() == 0 ? null : PricingPlanOfferCode.CREATOR.createFromParcel(parcel), (Period) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanOfferDiscount[i];
        }
    }

    public PricingPlanOfferDiscount(String id10, dj0.d fee2, o charge, PricingPlanOfferCode pricingPlanOfferCode, Period period) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(charge, "charge");
        this.f81126a = id10;
        this.f81127b = fee2;
        this.f81128c = charge;
        this.d = pricingPlanOfferCode;
        this.e = period;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanOfferDiscount)) {
            return false;
        }
        PricingPlanOfferDiscount pricingPlanOfferDiscount = (PricingPlanOfferDiscount) obj2;
        return Intrinsics.f(this.f81126a, pricingPlanOfferDiscount.f81126a) && Intrinsics.f(this.f81127b, pricingPlanOfferDiscount.f81127b) && Intrinsics.f(this.f81128c, pricingPlanOfferDiscount.f81128c) && Intrinsics.f(this.d, pricingPlanOfferDiscount.d) && Intrinsics.f(this.e, pricingPlanOfferDiscount.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f81128c.hashCode() + v7.c(this.f81126a.hashCode() * 31, 31, this.f81127b)) * 31;
        PricingPlanOfferCode pricingPlanOfferCode = this.d;
        int iHashCode2 = (iHashCode + (pricingPlanOfferCode == null ? 0 : pricingPlanOfferCode.f81125a.hashCode())) * 31;
        Period period = this.e;
        return iHashCode2 + (period != null ? period.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81126a);
        dest.writeSerializable(this.f81127b);
        dest.writeSerializable(this.f81128c);
        PricingPlanOfferCode pricingPlanOfferCode = this.d;
        if (pricingPlanOfferCode == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pricingPlanOfferCode.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.e);
    }
}
