package com.revolut.feature.travel.experiences.api.models.experience;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import myf.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceTourSnapshotItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "myf/c0", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceTourSnapshotItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceTourSnapshotItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f92849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92850b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperienceTourSnapshotItem(c0.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceTourSnapshotItem[i];
        }
    }

    public TravelExperienceTourSnapshotItem(c0 category, String label) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f92849a = category;
        this.f92850b = label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceTourSnapshotItem)) {
            return false;
        }
        TravelExperienceTourSnapshotItem travelExperienceTourSnapshotItem = (TravelExperienceTourSnapshotItem) obj2;
        return this.f92849a == travelExperienceTourSnapshotItem.f92849a && Intrinsics.f(this.f92850b, travelExperienceTourSnapshotItem.f92850b);
    }

    public final int hashCode() {
        return this.f92850b.hashCode() + (this.f92849a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92849a.name());
        dest.writeString(this.f92850b);
    }
}
