package com.revolut.feature.travel.experiences.api.models.pricing_breakdown;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/pricing_breakdown/TravelExperiencesPricingBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesPricingBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesPricingBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f92878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f92879b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelExperiencesAgebandsBreakdown.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TravelExperiencesPricingBreakdown(dVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesPricingBreakdown[i];
        }
    }

    public TravelExperiencesPricingBreakdown(d total, ArrayList ageBandsBreakdown) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(ageBandsBreakdown, "ageBandsBreakdown");
        this.f92878a = total;
        this.f92879b = ageBandsBreakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesPricingBreakdown)) {
            return false;
        }
        TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown = (TravelExperiencesPricingBreakdown) obj2;
        return Intrinsics.f(this.f92878a, travelExperiencesPricingBreakdown.f92878a) && this.f92879b.equals(travelExperiencesPricingBreakdown.f92879b);
    }

    public final int hashCode() {
        return this.f92879b.hashCode() + (this.f92878a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f92878a);
        Iterator itY = j6.a.y(this.f92879b, dest);
        while (itY.hasNext()) {
            ((TravelExperiencesAgebandsBreakdown) itY.next()).writeToParcel(dest, i);
        }
    }
}
