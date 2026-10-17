package com.revolut.feature.travel.experiences.api.models.experience;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import myf.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceAgeBand;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "myf/b", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceAgeBand implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceAgeBand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f92783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f92785c;
    public final int d;
    public final int e;
    public final int f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperienceAgeBand(b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceAgeBand[i];
        }
    }

    public TravelExperienceAgeBand(b type, String name, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f92783a = type;
        this.f92784b = name;
        this.f92785c = i;
        this.d = i2;
        this.e = i3;
        this.f = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceAgeBand)) {
            return false;
        }
        TravelExperienceAgeBand travelExperienceAgeBand = (TravelExperienceAgeBand) obj2;
        return this.f92783a == travelExperienceAgeBand.f92783a && Intrinsics.f(this.f92784b, travelExperienceAgeBand.f92784b) && this.f92785c == travelExperienceAgeBand.f92785c && this.d == travelExperienceAgeBand.d && this.e == travelExperienceAgeBand.e && this.f == travelExperienceAgeBand.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f92785c, p.a.c(this.f92783a.hashCode() * 31, 31, this.f92784b), 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92783a.name());
        dest.writeString(this.f92784b);
        dest.writeInt(this.f92785c);
        dest.writeInt(this.d);
        dest.writeInt(this.e);
        dest.writeInt(this.f);
    }
}
