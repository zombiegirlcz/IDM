package com.revolut.feature.travel.experiences.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/models/TravelExperiencesPricing;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesPricing implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesPricing> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f93198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f93199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperiencesCashback f93200c;
    public final TravelExperiencesPointsOption d;
    public final RevPoints e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesPricing((d) parcel.readSerializable(), (d) parcel.readSerializable(), TravelExperiencesCashback.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TravelExperiencesPointsOption.CREATOR.createFromParcel(parcel), (RevPoints) parcel.readParcelable(TravelExperiencesPricing.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesPricing[i];
        }
    }

    public TravelExperiencesPricing(d overallPrice, d priceInRequestedCurrency, TravelExperiencesCashback cashback, TravelExperiencesPointsOption travelExperiencesPointsOption, RevPoints revPoints) {
        Intrinsics.checkNotNullParameter(overallPrice, "overallPrice");
        Intrinsics.checkNotNullParameter(priceInRequestedCurrency, "priceInRequestedCurrency");
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        this.f93198a = overallPrice;
        this.f93199b = priceInRequestedCurrency;
        this.f93200c = cashback;
        this.d = travelExperiencesPointsOption;
        this.e = revPoints;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesPricing)) {
            return false;
        }
        TravelExperiencesPricing travelExperiencesPricing = (TravelExperiencesPricing) obj2;
        return Intrinsics.f(this.f93198a, travelExperiencesPricing.f93198a) && Intrinsics.f(this.f93199b, travelExperiencesPricing.f93199b) && Intrinsics.f(this.f93200c, travelExperiencesPricing.f93200c) && Intrinsics.f(this.d, travelExperiencesPricing.d) && Intrinsics.f(this.e, travelExperiencesPricing.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f93200c.hashCode() + v7.c(this.f93198a.hashCode() * 31, 31, this.f93199b)) * 31;
        TravelExperiencesPointsOption travelExperiencesPointsOption = this.d;
        int iHashCode2 = (iHashCode + (travelExperiencesPointsOption == null ? 0 : travelExperiencesPointsOption.hashCode())) * 31;
        RevPoints revPoints = this.e;
        return iHashCode2 + (revPoints != null ? revPoints.f83960a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f93198a);
        dest.writeSerializable(this.f93199b);
        this.f93200c.writeToParcel(dest, i);
        TravelExperiencesPointsOption travelExperiencesPointsOption = this.d;
        if (travelExperiencesPointsOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelExperiencesPointsOption.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.e, i);
    }
}
