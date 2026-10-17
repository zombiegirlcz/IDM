package com.revolut.feature.wealth.api.ui.invest.transactions.list;

import aii.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/wealth/api/ui/invest/transactions/list/InvestTransactionsListContract$Descriptor", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Laii/q;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestTransactionsListContract$Descriptor implements ParcelableControllerDescriptor<q> {

    @NotNull
    public static final Parcelable.Creator<InvestTransactionsListContract$Descriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestTransactionsListContract$InputData f95359a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestTransactionsListContract$Descriptor(InvestTransactionsListContract$InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestTransactionsListContract$Descriptor[i];
        }
    }

    public InvestTransactionsListContract$Descriptor(InvestTransactionsListContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f95359a = inputData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InvestTransactionsListContract$InputData getF95359a() {
        return this.f95359a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof InvestTransactionsListContract$Descriptor) && Intrinsics.f(this.f95359a, ((InvestTransactionsListContract$Descriptor) obj2).f95359a);
    }

    public final int hashCode() {
        return this.f95359a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f95359a.writeToParcel(dest, i);
    }
}
