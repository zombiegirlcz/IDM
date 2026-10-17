package com.revolut.feature.pricingplans.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PricingPlanOfferCode;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanOfferCode implements Parcelable, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81125a;

    @NotNull
    public static final Parcelable.Creator<PricingPlanOfferCode> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PricingPlanOfferCode(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanOfferCode[i];
        }
    }

    public PricingPlanOfferCode(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f81125a = code;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PricingPlanOfferCode) && Intrinsics.f(this.f81125a, ((PricingPlanOfferCode) obj2).f81125a);
    }

    public final int hashCode() {
        return this.f81125a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81125a);
    }
}
