package com.revolut.feature.trading_add_ons.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading_add_ons.domain.model.TradingAddOnsCloseAction;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading_add_ons/navigation/TradingAddOnsDestination$AddOnsMainDestination", "", "", "toString", "()Ljava/lang/String;", "feature_trading_add_ons_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradingAddOnsDestination$AddOnsMainDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TradingAddOnsDestination$AddOnsMainDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingAddOnsCloseAction f91685a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TradingAddOnsDestination$AddOnsMainDestination((TradingAddOnsCloseAction) parcel.readParcelable(TradingAddOnsDestination$AddOnsMainDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradingAddOnsDestination$AddOnsMainDestination[i];
        }
    }

    public TradingAddOnsDestination$AddOnsMainDestination() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TradingAddOnsDestination$AddOnsMainDestination) && Intrinsics.f(this.f91685a, ((TradingAddOnsDestination$AddOnsMainDestination) obj2).f91685a);
    }

    public final int hashCode() {
        return this.f91685a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91685a, i);
    }

    public TradingAddOnsDestination$AddOnsMainDestination(TradingAddOnsCloseAction closeAction) {
        Intrinsics.checkNotNullParameter(closeAction, "closeAction");
        this.f91685a = closeAction;
    }

    public /* synthetic */ TradingAddOnsDestination$AddOnsMainDestination(int i) {
        this(TradingAddOnsCloseAction.GoToInvest.f91663a);
    }
}
