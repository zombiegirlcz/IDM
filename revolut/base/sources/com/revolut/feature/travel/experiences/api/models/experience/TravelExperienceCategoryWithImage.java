package com.revolut.feature.travel.experiences.api.models.experience;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceCategoryWithImage;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceCategoryWithImage implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceCategoryWithImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92811c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperienceCategoryWithImage(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceCategoryWithImage[i];
        }
    }

    public TravelExperienceCategoryWithImage(String id10, String label, String image) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f92809a = id10;
        this.f92810b = label;
        this.f92811c = image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceCategoryWithImage)) {
            return false;
        }
        TravelExperienceCategoryWithImage travelExperienceCategoryWithImage = (TravelExperienceCategoryWithImage) obj2;
        return Intrinsics.f(this.f92809a, travelExperienceCategoryWithImage.f92809a) && Intrinsics.f(this.f92810b, travelExperienceCategoryWithImage.f92810b) && Intrinsics.f(this.f92811c, travelExperienceCategoryWithImage.f92811c);
    }

    public final int hashCode() {
        return this.f92811c.hashCode() + p.a.c(this.f92809a.hashCode() * 31, 31, this.f92810b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92809a);
        dest.writeString(this.f92810b);
        dest.writeString(this.f92811c);
    }
}
