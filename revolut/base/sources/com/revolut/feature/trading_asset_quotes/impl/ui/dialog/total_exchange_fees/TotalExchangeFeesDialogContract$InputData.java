package com.revolut.feature.trading_asset_quotes.impl.ui.dialog.total_exchange_fees;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading_asset_quotes/impl/ui/dialog/total_exchange_fees/TotalExchangeFeesDialogContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_asset_quotes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TotalExchangeFeesDialogContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TotalExchangeFeesDialogContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FiatExchangeOrderQuoteParams f91692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f91693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f91694c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TotalExchangeFeesDialogContract$InputData((FiatExchangeOrderQuoteParams) parcel.readParcelable(TotalExchangeFeesDialogContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(TotalExchangeFeesDialogContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(TotalExchangeFeesDialogContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TotalExchangeFeesDialogContract$InputData[i];
        }
    }

    public TotalExchangeFeesDialogContract$InputData(FiatExchangeOrderQuoteParams fiatOrderQuoteParams, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(fiatOrderQuoteParams, "fiatOrderQuoteParams");
        this.f91692a = fiatOrderQuoteParams;
        this.f91693b = clause;
        this.f91694c = clause2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TotalExchangeFeesDialogContract$InputData)) {
            return false;
        }
        TotalExchangeFeesDialogContract$InputData totalExchangeFeesDialogContract$InputData = (TotalExchangeFeesDialogContract$InputData) obj2;
        return Intrinsics.f(this.f91692a, totalExchangeFeesDialogContract$InputData.f91692a) && Intrinsics.f(this.f91693b, totalExchangeFeesDialogContract$InputData.f91693b) && Intrinsics.f(this.f91694c, totalExchangeFeesDialogContract$InputData.f91694c);
    }

    public final int hashCode() {
        int iHashCode = this.f91692a.hashCode() * 31;
        Clause clause = this.f91693b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f91694c;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91692a, i);
        dest.writeParcelable(this.f91693b, i);
        dest.writeParcelable(this.f91694c, i);
    }
}
