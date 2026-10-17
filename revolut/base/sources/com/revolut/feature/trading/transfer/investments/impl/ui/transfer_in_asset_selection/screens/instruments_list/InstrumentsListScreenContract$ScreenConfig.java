package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.instruments_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/screens/instruments_list/InstrumentsListScreenContract$ScreenConfig", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstrumentsListScreenContract$ScreenConfig implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InstrumentsListScreenContract$ScreenConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f91571b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(InstrumentsListScreenContract$ScreenConfig.class, parcel, linkedHashSet, iE, 1);
            }
            return new InstrumentsListScreenContract$ScreenConfig(string, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstrumentsListScreenContract$ScreenConfig[i];
        }
    }

    public InstrumentsListScreenContract$ScreenConfig(String accountId, Set hiddenInstruments) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(hiddenInstruments, "hiddenInstruments");
        this.f91570a = accountId;
        this.f91571b = hiddenInstruments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InstrumentsListScreenContract$ScreenConfig)) {
            return false;
        }
        InstrumentsListScreenContract$ScreenConfig instrumentsListScreenContract$ScreenConfig = (InstrumentsListScreenContract$ScreenConfig) obj2;
        return Intrinsics.f(this.f91570a, instrumentsListScreenContract$ScreenConfig.f91570a) && Intrinsics.f(this.f91571b, instrumentsListScreenContract$ScreenConfig.f91571b);
    }

    public final int hashCode() {
        return this.f91571b.hashCode() + (this.f91570a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91570a);
        Iterator itV = n.v(this.f91571b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
