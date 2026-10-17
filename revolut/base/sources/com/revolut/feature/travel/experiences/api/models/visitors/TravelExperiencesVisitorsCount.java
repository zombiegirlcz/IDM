package com.revolut.feature.travel.experiences.api.models.visitors;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import myf.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/visitors/TravelExperiencesVisitorsCount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesVisitorsCount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesVisitorsCount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f92917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f92918b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesVisitorsCount(parcel.readInt(), b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesVisitorsCount[i];
        }
    }

    public TravelExperiencesVisitorsCount(int i, b ageBand) {
        Intrinsics.checkNotNullParameter(ageBand, "ageBand");
        this.f92917a = i;
        this.f92918b = ageBand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesVisitorsCount)) {
            return false;
        }
        TravelExperiencesVisitorsCount travelExperiencesVisitorsCount = (TravelExperiencesVisitorsCount) obj2;
        return this.f92917a == travelExperiencesVisitorsCount.f92917a && this.f92918b == travelExperiencesVisitorsCount.f92918b;
    }

    public final int hashCode() {
        return this.f92918b.hashCode() + (Integer.hashCode(this.f92917a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f92917a);
        dest.writeString(this.f92918b.name());
    }
}
