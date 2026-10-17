package com.revolut.feature_travel_hotels_models.property.room;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/room/BedOption;", "Landroid/os/Parcelable;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BedOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BedOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98089c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BedOption(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BedOption[i];
        }
    }

    public BedOption(String id10, String bookingToken, String description) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(bookingToken, "bookingToken");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f98087a = id10;
        this.f98088b = bookingToken;
        this.f98089c = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof BedOption) && Intrinsics.f(((BedOption) obj2).f98087a, this.f98087a);
    }

    public final int hashCode() {
        return this.f98087a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98087a);
        dest.writeString(this.f98088b);
        dest.writeString(this.f98089c);
    }
}
