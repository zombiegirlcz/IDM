package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ufi.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/PropertyDescription;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ufi/i", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PropertyDescription implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PropertyDescription> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f98072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98073b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PropertyDescription(i.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PropertyDescription[i];
        }
    }

    public PropertyDescription(i category, String plainText) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(plainText, "plainText");
        this.f98072a = category;
        this.f98073b = plainText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PropertyDescription)) {
            return false;
        }
        PropertyDescription propertyDescription = (PropertyDescription) obj2;
        return this.f98072a == propertyDescription.f98072a && Intrinsics.f(this.f98073b, propertyDescription.f98073b);
    }

    public final int hashCode() {
        return this.f98073b.hashCode() + (this.f98072a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98072a.name());
        dest.writeString(this.f98073b);
    }
}
