package com.revolut.feature.travel.experiences.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/models/TravelExperienceCancellationCondition;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "x3g/a", "feature_travel_experiences_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceCancellationCondition implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceCancellationCondition> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x3g.a f93177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93178b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperienceCancellationCondition(x3g.a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceCancellationCondition[i];
        }
    }

    public TravelExperienceCancellationCondition(x3g.a type, String description) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f93177a = type;
        this.f93178b = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceCancellationCondition)) {
            return false;
        }
        TravelExperienceCancellationCondition travelExperienceCancellationCondition = (TravelExperienceCancellationCondition) obj2;
        return this.f93177a == travelExperienceCancellationCondition.f93177a && Intrinsics.f(this.f93178b, travelExperienceCancellationCondition.f93178b);
    }

    public final int hashCode() {
        return this.f93178b.hashCode() + (this.f93177a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93177a.name());
        dest.writeString(this.f93178b);
    }
}
