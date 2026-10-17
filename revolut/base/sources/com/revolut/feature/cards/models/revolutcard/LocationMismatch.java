package com.revolut.feature.cards.models.revolutcard;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cards/models/revolutcard/LocationMismatch;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cards_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocationMismatch implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LocationMismatch> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final co3.a f65541c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocationMismatch(parcel.readString(), parcel.readString(), (co3.a) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LocationMismatch[i];
        }
    }

    public LocationMismatch(String str, String str2, co3.a aVar) {
        this.f65539a = str;
        this.f65540b = str2;
        this.f65541c = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LocationMismatch)) {
            return false;
        }
        LocationMismatch locationMismatch = (LocationMismatch) obj2;
        return Intrinsics.f(this.f65539a, locationMismatch.f65539a) && Intrinsics.f(this.f65540b, locationMismatch.f65540b) && Intrinsics.f(this.f65541c, locationMismatch.f65541c);
    }

    public final int hashCode() {
        String str = this.f65539a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f65540b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        co3.a aVar = this.f65541c;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65539a);
        dest.writeString(this.f65540b);
        dest.writeSerializable(this.f65541c);
    }

    public LocationMismatch() {
        this(null, null, null);
    }
}
