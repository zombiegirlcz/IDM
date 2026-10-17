package com.revolut.trading.orders.ui.invest.placement.tutorial;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.kompot.common.IOData$Input;
import k4l.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/trading/orders/ui/invest/placement/tutorial/TutorialScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TutorialScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TutorialScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f107014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f107015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f107016c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TutorialScreenContract$InputData(g.valueOf(parcel.readString()), r0.valueOf(parcel.readString()), (n) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TutorialScreenContract$InputData[i];
        }
    }

    public TutorialScreenContract$InputData(g tradeSide, r0 orderType, n instrument) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f107014a = tradeSide;
        this.f107015b = orderType;
        this.f107016c = instrument;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TutorialScreenContract$InputData)) {
            return false;
        }
        TutorialScreenContract$InputData tutorialScreenContract$InputData = (TutorialScreenContract$InputData) obj2;
        return this.f107014a == tutorialScreenContract$InputData.f107014a && this.f107015b == tutorialScreenContract$InputData.f107015b && Intrinsics.f(this.f107016c, tutorialScreenContract$InputData.f107016c);
    }

    public final int hashCode() {
        return this.f107016c.hashCode() + d.f(this.f107015b, this.f107014a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f107014a.name());
        dest.writeString(this.f107015b.name());
        dest.writeSerializable(this.f107016c);
    }
}
