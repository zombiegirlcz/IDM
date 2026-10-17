package com.revolut.feature.travel.experiences.api.models.options;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLanguage;
import com.revolut.feature.travel.experiences.api.models.pricing_breakdown.TravelExperiencesPricingBreakdown;
import com.revolut.feature.travel.experiences.models.TravelExperiencesCashback;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/options/TravelExperiencesOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92861c;
    public final TravelExperiencesPricingBreakdown d;
    public final TravelExperiencesPricingBreakdown e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TravelExperiencesCashback f92862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f92863h;
    public final TravelExperiencesPointsOption i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RevPoints f92864j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Parcelable.Creator<TravelExperiencesPricingBreakdown> creator = TravelExperiencesPricingBreakdown.CREATOR;
            TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownCreateFromParcel = creator.createFromParcel(parcel);
            TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownCreateFromParcel2 = creator.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(TravelExperiencesAvailabilityTimes.CREATOR, parcel, arrayList, iA2, 1);
            }
            TravelExperiencesCashback travelExperiencesCashback = (TravelExperiencesCashback) parcel.readParcelable(TravelExperiencesOption.class.getClassLoader());
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelExperienceLanguage.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new TravelExperiencesOption(string, string2, string3, travelExperiencesPricingBreakdownCreateFromParcel, travelExperiencesPricingBreakdownCreateFromParcel2, arrayList, travelExperiencesCashback, arrayList2, (TravelExperiencesPointsOption) parcel.readParcelable(TravelExperiencesOption.class.getClassLoader()), (RevPoints) parcel.readParcelable(TravelExperiencesOption.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesOption[i];
        }
    }

    public TravelExperiencesOption(String id10, String name, String description, TravelExperiencesPricingBreakdown pricing, TravelExperiencesPricingBreakdown pricingInRequestedCurrency, ArrayList times, TravelExperiencesCashback cashback, ArrayList languages, TravelExperiencesPointsOption travelExperiencesPointsOption, RevPoints revPoints) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(pricingInRequestedCurrency, "pricingInRequestedCurrency");
        Intrinsics.checkNotNullParameter(times, "times");
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        Intrinsics.checkNotNullParameter(languages, "languages");
        this.f92859a = id10;
        this.f92860b = name;
        this.f92861c = description;
        this.d = pricing;
        this.e = pricingInRequestedCurrency;
        this.f = times;
        this.f92862g = cashback;
        this.f92863h = languages;
        this.i = travelExperiencesPointsOption;
        this.f92864j = revPoints;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesOption)) {
            return false;
        }
        TravelExperiencesOption travelExperiencesOption = (TravelExperiencesOption) obj2;
        return Intrinsics.f(this.f92859a, travelExperiencesOption.f92859a) && Intrinsics.f(this.f92860b, travelExperiencesOption.f92860b) && Intrinsics.f(this.f92861c, travelExperiencesOption.f92861c) && Intrinsics.f(this.d, travelExperiencesOption.d) && Intrinsics.f(this.e, travelExperiencesOption.e) && this.f.equals(travelExperiencesOption.f) && Intrinsics.f(this.f92862g, travelExperiencesOption.f92862g) && this.f92863h.equals(travelExperiencesOption.f92863h) && Intrinsics.f(this.i, travelExperiencesOption.i) && Intrinsics.f(this.f92864j, travelExperiencesOption.f92864j);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f92863h, (this.f92862g.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (this.e.hashCode() + ((this.d.hashCode() + p.a.c(p.a.c(this.f92859a.hashCode() * 31, 31, this.f92860b), 31, this.f92861c)) * 31)) * 31, 31)) * 31, 31);
        TravelExperiencesPointsOption travelExperiencesPointsOption = this.i;
        int iHashCode = (iB + (travelExperiencesPointsOption == null ? 0 : travelExperiencesPointsOption.hashCode())) * 31;
        RevPoints revPoints = this.f92864j;
        return iHashCode + (revPoints != null ? revPoints.f83960a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92859a);
        dest.writeString(this.f92860b);
        dest.writeString(this.f92861c);
        this.d.writeToParcel(dest, i);
        this.e.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f, dest);
        while (itY.hasNext()) {
            ((TravelExperiencesAvailabilityTimes) itY.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f92862g, i);
        Iterator itY2 = j6.a.y(this.f92863h, dest);
        while (itY2.hasNext()) {
            ((TravelExperienceLanguage) itY2.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.f92864j, i);
    }
}
