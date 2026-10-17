package com.revolut.feature_travel_hotels_models.property.search;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/search/SimplifiedLocationType;", "Lcom/revolut/feature_travel_hotels_models/property/search/LocationData;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SimplifiedLocationType extends LocationData {

    @NotNull
    public static final Parcelable.Creator<SimplifiedLocationType> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ffi.a f98140c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SimplifiedLocationType(parcel.readString(), ffi.a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SimplifiedLocationType[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimplifiedLocationType(String id10, ffi.a type, String name) {
        super(name);
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f98139b = id10;
        this.f98140c = type;
        this.d = name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SimplifiedLocationType)) {
            return false;
        }
        SimplifiedLocationType simplifiedLocationType = (SimplifiedLocationType) obj2;
        return Intrinsics.f(this.f98139b, simplifiedLocationType.f98139b) && this.f98140c == simplifiedLocationType.f98140c && Intrinsics.f(this.d, simplifiedLocationType.d);
    }

    @Override // com.revolut.feature_travel_hotels_models.property.search.LocationData
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f98140c.hashCode() + (this.f98139b.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98139b);
        dest.writeString(this.f98140c.name());
        dest.writeString(this.d);
    }
}
