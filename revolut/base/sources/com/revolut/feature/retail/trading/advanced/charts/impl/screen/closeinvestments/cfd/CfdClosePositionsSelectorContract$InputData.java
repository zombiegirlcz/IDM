package com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.cfd;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/trading/advanced/charts/impl/screen/closeinvestments/cfd/CfdClosePositionsSelectorContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_trading_advanced_charts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CfdClosePositionsSelectorContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CfdClosePositionsSelectorContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83402b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CfdClosePositionsSelectorContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CfdClosePositionsSelectorContract$InputData[i];
        }
    }

    public CfdClosePositionsSelectorContract$InputData(String securityRef, String portfolioId) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f83401a = securityRef;
        this.f83402b = portfolioId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CfdClosePositionsSelectorContract$InputData)) {
            return false;
        }
        CfdClosePositionsSelectorContract$InputData cfdClosePositionsSelectorContract$InputData = (CfdClosePositionsSelectorContract$InputData) obj2;
        return Intrinsics.f(this.f83401a, cfdClosePositionsSelectorContract$InputData.f83401a) && Intrinsics.f(this.f83402b, cfdClosePositionsSelectorContract$InputData.f83402b);
    }

    public final int hashCode() {
        return this.f83402b.hashCode() + (this.f83401a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83401a);
        dest.writeString(this.f83402b);
    }
}
