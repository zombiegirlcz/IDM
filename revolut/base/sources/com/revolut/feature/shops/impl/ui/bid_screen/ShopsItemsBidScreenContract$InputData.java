package com.revolut.feature.shops.impl.ui.bid_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shops/impl/ui/bid_screen/ShopsItemsBidScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsItemsBidScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ShopsItemsBidScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f87146b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopsItemsBidScreenContract$InputData(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsItemsBidScreenContract$InputData[i];
        }
    }

    public ShopsItemsBidScreenContract$InputData(String auctionId, Double d) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        this.f87145a = auctionId;
        this.f87146b = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsItemsBidScreenContract$InputData)) {
            return false;
        }
        ShopsItemsBidScreenContract$InputData shopsItemsBidScreenContract$InputData = (ShopsItemsBidScreenContract$InputData) obj2;
        return Intrinsics.f(this.f87145a, shopsItemsBidScreenContract$InputData.f87145a) && Intrinsics.f(this.f87146b, shopsItemsBidScreenContract$InputData.f87146b);
    }

    public final int hashCode() {
        int iHashCode = this.f87145a.hashCode() * 31;
        Double d = this.f87146b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87145a);
        Double d = this.f87146b;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
    }
}
