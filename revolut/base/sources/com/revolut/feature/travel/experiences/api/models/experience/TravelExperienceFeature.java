package com.revolut.feature.travel.experiences.api.models.experience;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import myf.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceFeature;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "myf/j", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceFeature implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceFeature> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f92817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f92819c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperienceFeature(j.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceFeature[i];
        }
    }

    public TravelExperienceFeature(j category, String label, Integer num) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f92817a = category;
        this.f92818b = label;
        this.f92819c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceFeature)) {
            return false;
        }
        TravelExperienceFeature travelExperienceFeature = (TravelExperienceFeature) obj2;
        return this.f92817a == travelExperienceFeature.f92817a && Intrinsics.f(this.f92818b, travelExperienceFeature.f92818b) && Intrinsics.f(this.f92819c, travelExperienceFeature.f92819c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f92817a.hashCode() * 31, 31, this.f92818b);
        Integer num = this.f92819c;
        return iC + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92817a.name());
        dest.writeString(this.f92818b);
        Integer num = this.f92819c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
