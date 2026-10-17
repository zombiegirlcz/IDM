package com.revolut.feature.pricingplans.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PricingPlanOffer;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanOffer implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanOffer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanOfferDiscount f81124b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PricingPlanOffer(parcel.readString(), parcel.readInt() == 0 ? null : PricingPlanOfferDiscount.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanOffer[i];
        }
    }

    public PricingPlanOffer(String token, PricingPlanOfferDiscount pricingPlanOfferDiscount) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f81123a = token;
        this.f81124b = pricingPlanOfferDiscount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanOffer)) {
            return false;
        }
        PricingPlanOffer pricingPlanOffer = (PricingPlanOffer) obj2;
        return Intrinsics.f(this.f81123a, pricingPlanOffer.f81123a) && Intrinsics.f(this.f81124b, pricingPlanOffer.f81124b);
    }

    public final int hashCode() {
        int iHashCode = this.f81123a.hashCode() * 31;
        PricingPlanOfferDiscount pricingPlanOfferDiscount = this.f81124b;
        return iHashCode + (pricingPlanOfferDiscount == null ? 0 : pricingPlanOfferDiscount.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81123a);
        PricingPlanOfferDiscount pricingPlanOfferDiscount = this.f81124b;
        if (pricingPlanOfferDiscount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pricingPlanOfferDiscount.writeToParcel(dest, i);
        }
    }
}
