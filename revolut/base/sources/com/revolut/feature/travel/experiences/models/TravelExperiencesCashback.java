package com.revolut.feature.travel.experiences.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/models/TravelExperiencesCashback;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesCashback implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesCashback> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f93193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f93194b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesCashback(parcel.readDouble(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesCashback[i];
        }
    }

    public TravelExperiencesCashback(double d, d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f93193a = value;
        this.f93194b = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesCashback)) {
            return false;
        }
        TravelExperiencesCashback travelExperiencesCashback = (TravelExperiencesCashback) obj2;
        return Intrinsics.f(this.f93193a, travelExperiencesCashback.f93193a) && Double.compare(this.f93194b, travelExperiencesCashback.f93194b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f93194b) + (this.f93193a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f93193a);
        dest.writeDouble(this.f93194b);
    }
}
