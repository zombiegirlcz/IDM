package com.revolut.feature.apm.core.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/core/ui/api/navigation/PaymentsBreakdownNavigation$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentsBreakdownNavigation$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PaymentsBreakdownNavigation$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f62307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FundingSource f62308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApmQuoteDirection f62309c;
    public final ApmQuote d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentsBreakdownNavigation$InputData((d) parcel.readSerializable(), (FundingSource) parcel.readParcelable(PaymentsBreakdownNavigation$InputData.class.getClassLoader()), (ApmQuoteDirection) parcel.readParcelable(PaymentsBreakdownNavigation$InputData.class.getClassLoader()), (ApmQuote) parcel.readParcelable(PaymentsBreakdownNavigation$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentsBreakdownNavigation$InputData[i];
        }
    }

    public PaymentsBreakdownNavigation$InputData(d recipientAmount, FundingSource fundingSource, ApmQuoteDirection direction, ApmQuote startingApmQuote) {
        Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(startingApmQuote, "startingApmQuote");
        this.f62307a = recipientAmount;
        this.f62308b = fundingSource;
        this.f62309c = direction;
        this.d = startingApmQuote;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentsBreakdownNavigation$InputData)) {
            return false;
        }
        PaymentsBreakdownNavigation$InputData paymentsBreakdownNavigation$InputData = (PaymentsBreakdownNavigation$InputData) obj2;
        return Intrinsics.f(this.f62307a, paymentsBreakdownNavigation$InputData.f62307a) && Intrinsics.f(this.f62308b, paymentsBreakdownNavigation$InputData.f62308b) && Intrinsics.f(this.f62309c, paymentsBreakdownNavigation$InputData.f62309c) && Intrinsics.f(this.d, paymentsBreakdownNavigation$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f62309c.hashCode() + ((this.f62308b.hashCode() + (this.f62307a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f62307a);
        dest.writeParcelable(this.f62308b, i);
        dest.writeParcelable(this.f62309c, i);
        dest.writeParcelable(this.d, i);
    }
}
