package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsInventoryProviderLogos;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsInventoryProviderLogos implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsInventoryProviderLogos> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97974b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsInventoryProviderLogos(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsInventoryProviderLogos[i];
        }
    }

    public HotelsInventoryProviderLogos(String str, String str2) {
        this.f97973a = str;
        this.f97974b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsInventoryProviderLogos)) {
            return false;
        }
        HotelsInventoryProviderLogos hotelsInventoryProviderLogos = (HotelsInventoryProviderLogos) obj2;
        return Intrinsics.f(this.f97973a, hotelsInventoryProviderLogos.f97973a) && Intrinsics.f(this.f97974b, hotelsInventoryProviderLogos.f97974b);
    }

    public final int hashCode() {
        String str = this.f97973a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f97974b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97973a);
        dest.writeString(this.f97974b);
    }
}
