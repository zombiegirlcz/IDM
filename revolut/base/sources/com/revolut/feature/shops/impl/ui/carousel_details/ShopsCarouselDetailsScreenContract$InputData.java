package com.revolut.feature.shops.impl.ui.carousel_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yid.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/shops/impl/ui/carousel_details/ShopsCarouselDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "yid/j", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsCarouselDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ShopsCarouselDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f87149c;
    public final j d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopsCarouselDetailsScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readInt() != 0, j.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsCarouselDetailsScreenContract$InputData[i];
        }
    }

    public ShopsCarouselDetailsScreenContract$InputData(String carouselId, String carouselTitle, boolean z, j layoutType) {
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        Intrinsics.checkNotNullParameter(carouselTitle, "carouselTitle");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        this.f87147a = carouselId;
        this.f87148b = carouselTitle;
        this.f87149c = z;
        this.d = layoutType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsCarouselDetailsScreenContract$InputData)) {
            return false;
        }
        ShopsCarouselDetailsScreenContract$InputData shopsCarouselDetailsScreenContract$InputData = (ShopsCarouselDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f87147a, shopsCarouselDetailsScreenContract$InputData.f87147a) && Intrinsics.f(this.f87148b, shopsCarouselDetailsScreenContract$InputData.f87148b) && this.f87149c == shopsCarouselDetailsScreenContract$InputData.f87149c && this.d == shopsCarouselDetailsScreenContract$InputData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(p.a.c(this.f87147a.hashCode() * 31, 31, this.f87148b), 31, this.f87149c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87147a);
        dest.writeString(this.f87148b);
        dest.writeInt(this.f87149c ? 1 : 0);
        dest.writeString(this.d.name());
    }
}
