package com.revolut.feature.shops.impl.ui.bid_custom_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shops/impl/ui/bid_custom_input/BidCustomInputContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BidCustomInputContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BidCustomInputContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f87128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f87129c;
    public final double d;
    public final double e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (true) {
                double d = parcel.readDouble();
                if (i2 == i) {
                    return new BidCustomInputContract$InputData(d, parcel.readDouble(), parcel.readDouble(), string, arrayList);
                }
                arrayList.add(Double.valueOf(d));
                i2++;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BidCustomInputContract$InputData[i];
        }
    }

    public BidCustomInputContract$InputData(double d, double d5, double d6, String auctionId, List suggestedValues) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(suggestedValues, "suggestedValues");
        this.f87127a = auctionId;
        this.f87128b = suggestedValues;
        this.f87129c = d;
        this.d = d5;
        this.e = d6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BidCustomInputContract$InputData)) {
            return false;
        }
        BidCustomInputContract$InputData bidCustomInputContract$InputData = (BidCustomInputContract$InputData) obj2;
        return Intrinsics.f(this.f87127a, bidCustomInputContract$InputData.f87127a) && Intrinsics.f(this.f87128b, bidCustomInputContract$InputData.f87128b) && Double.compare(this.f87129c, bidCustomInputContract$InputData.f87129c) == 0 && Double.compare(this.d, bidCustomInputContract$InputData.d) == 0 && Double.compare(this.e, bidCustomInputContract$InputData.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + b.c(b.c(p.a.d(this.f87127a.hashCode() * 31, 31, this.f87128b), this.f87129c, 31), this.d, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87127a);
        Iterator itV = p.a.v(this.f87128b, dest);
        while (itV.hasNext()) {
            dest.writeDouble(((Number) itV.next()).doubleValue());
        }
        dest.writeDouble(this.f87129c);
        dest.writeDouble(this.d);
        dest.writeDouble(this.e);
    }
}
