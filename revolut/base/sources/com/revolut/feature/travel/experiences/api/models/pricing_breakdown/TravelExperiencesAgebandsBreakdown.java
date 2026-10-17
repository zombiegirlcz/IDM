package com.revolut.feature.travel.experiences.api.models.pricing_breakdown;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import myf.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/pricing_breakdown/TravelExperiencesAgebandsBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesAgebandsBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesAgebandsBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f92875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f92877c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesAgebandsBreakdown(b.valueOf(parcel.readString()), parcel.readInt(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesAgebandsBreakdown[i];
        }
    }

    public TravelExperiencesAgebandsBreakdown(b type, int i, d price) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(price, "price");
        this.f92875a = type;
        this.f92876b = i;
        this.f92877c = price;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesAgebandsBreakdown)) {
            return false;
        }
        TravelExperiencesAgebandsBreakdown travelExperiencesAgebandsBreakdown = (TravelExperiencesAgebandsBreakdown) obj2;
        return this.f92875a == travelExperiencesAgebandsBreakdown.f92875a && this.f92876b == travelExperiencesAgebandsBreakdown.f92876b && Intrinsics.f(this.f92877c, travelExperiencesAgebandsBreakdown.f92877c);
    }

    public final int hashCode() {
        return this.f92877c.hashCode() + j6.a.b(this.f92876b, this.f92875a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92875a.name());
        dest.writeInt(this.f92876b);
        dest.writeSerializable(this.f92877c);
    }
}
