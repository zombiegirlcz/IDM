package com.revolut.feature_travel_hotels_models.property.search;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/search/EmptyLocation;", "Lcom/revolut/feature_travel_hotels_models/property/search/LocationData;", "<init>", "()V", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmptyLocation extends LocationData {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EmptyLocation f98126b = new EmptyLocation(null);

    @NotNull
    public static final Parcelable.Creator<EmptyLocation> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return EmptyLocation.f98126b;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmptyLocation[i];
        }
    }

    private EmptyLocation() {
        super(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
