package com.revolut.feature_travel_hotels_models.property;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ufi.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/HotelsPropertyGuestReviewSource;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HotelsPropertyGuestReviewSource implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HotelsPropertyGuestReviewSource> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f98028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HotelsInventoryProviderLogos f98030c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HotelsPropertyGuestReviewSource(d.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : HotelsInventoryProviderLogos.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HotelsPropertyGuestReviewSource[i];
        }
    }

    public HotelsPropertyGuestReviewSource(d type, String str, HotelsInventoryProviderLogos hotelsInventoryProviderLogos) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f98028a = type;
        this.f98029b = str;
        this.f98030c = hotelsInventoryProviderLogos;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HotelsPropertyGuestReviewSource)) {
            return false;
        }
        HotelsPropertyGuestReviewSource hotelsPropertyGuestReviewSource = (HotelsPropertyGuestReviewSource) obj2;
        return this.f98028a == hotelsPropertyGuestReviewSource.f98028a && Intrinsics.f(this.f98029b, hotelsPropertyGuestReviewSource.f98029b) && Intrinsics.f(this.f98030c, hotelsPropertyGuestReviewSource.f98030c);
    }

    public final int hashCode() {
        int iHashCode = this.f98028a.hashCode() * 31;
        String str = this.f98029b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        HotelsInventoryProviderLogos hotelsInventoryProviderLogos = this.f98030c;
        return iHashCode2 + (hotelsInventoryProviderLogos != null ? hotelsInventoryProviderLogos.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98028a.name());
        dest.writeString(this.f98029b);
        HotelsInventoryProviderLogos hotelsInventoryProviderLogos = this.f98030c;
        if (hotelsInventoryProviderLogos == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsInventoryProviderLogos.writeToParcel(dest, i);
        }
    }
}
