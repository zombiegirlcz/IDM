package com.revolut.feature.wealth.api.ui.invest.transactions.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/api/ui/invest/transactions/list/InvestTransactionsListContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestTransactionsListContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InvestTransactionsListContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestTransactionsFilter f95365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestTransactionsListContract$DisplayOptions f95366b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestTransactionsListContract$InputData((InvestTransactionsFilter) parcel.readParcelable(InvestTransactionsListContract$InputData.class.getClassLoader()), InvestTransactionsListContract$DisplayOptions.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestTransactionsListContract$InputData[i];
        }
    }

    public InvestTransactionsListContract$InputData(InvestTransactionsFilter filter, InvestTransactionsListContract$DisplayOptions displayOptions) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
        this.f95365a = filter;
        this.f95366b = displayOptions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestTransactionsListContract$InputData)) {
            return false;
        }
        InvestTransactionsListContract$InputData investTransactionsListContract$InputData = (InvestTransactionsListContract$InputData) obj2;
        return Intrinsics.f(this.f95365a, investTransactionsListContract$InputData.f95365a) && Intrinsics.f(this.f95366b, investTransactionsListContract$InputData.f95366b);
    }

    public final int hashCode() {
        return this.f95366b.f95364a.hashCode() + (this.f95365a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95365a, i);
        this.f95366b.writeToParcel(dest, i);
    }
}
