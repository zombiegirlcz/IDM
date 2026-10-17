package com.revolut.feature.travel.experiences.api.models.experience;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceBrief;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceBrief implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceBrief> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f92806c;
    public final TravelExperienceAddress d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperienceBrief(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : TravelExperienceAddress.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceBrief[i];
        }
    }

    public TravelExperienceBrief(String id10, String name, List images, TravelExperienceAddress travelExperienceAddress) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(images, "images");
        this.f92804a = id10;
        this.f92805b = name;
        this.f92806c = images;
        this.d = travelExperienceAddress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceBrief)) {
            return false;
        }
        TravelExperienceBrief travelExperienceBrief = (TravelExperienceBrief) obj2;
        return Intrinsics.f(this.f92804a, travelExperienceBrief.f92804a) && Intrinsics.f(this.f92805b, travelExperienceBrief.f92805b) && Intrinsics.f(this.f92806c, travelExperienceBrief.f92806c) && Intrinsics.f(this.d, travelExperienceBrief.d);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f92804a.hashCode() * 31, 31, this.f92805b), 31, this.f92806c);
        TravelExperienceAddress travelExperienceAddress = this.d;
        return iD + (travelExperienceAddress == null ? 0 : travelExperienceAddress.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92804a);
        dest.writeString(this.f92805b);
        dest.writeStringList(this.f92806c);
        TravelExperienceAddress travelExperienceAddress = this.d;
        if (travelExperienceAddress == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelExperienceAddress.writeToParcel(dest, i);
        }
    }
}
