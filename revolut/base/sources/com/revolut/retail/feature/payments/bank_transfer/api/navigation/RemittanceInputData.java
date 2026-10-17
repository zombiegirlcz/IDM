package com.revolut.retail.feature.payments.bank_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/api/navigation/RemittanceInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RemittanceInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RemittanceInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferFlowType f101974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferMoneyPocket f101975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RemittancePaymentsCountryData f101976c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RemittanceInputData((TransferFlowType) parcel.readParcelable(RemittanceInputData.class.getClassLoader()), (TransferMoneyPocket) parcel.readParcelable(RemittanceInputData.class.getClassLoader()), parcel.readInt() == 0 ? null : RemittancePaymentsCountryData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RemittanceInputData[i];
        }
    }

    public RemittanceInputData() {
        this(null, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RemittanceInputData)) {
            return false;
        }
        RemittanceInputData remittanceInputData = (RemittanceInputData) obj2;
        return Intrinsics.f(this.f101974a, remittanceInputData.f101974a) && Intrinsics.f(this.f101975b, remittanceInputData.f101975b) && Intrinsics.f(this.f101976c, remittanceInputData.f101976c);
    }

    public final int hashCode() {
        int iHashCode = (this.f101975b.hashCode() + (this.f101974a.hashCode() * 31)) * 31;
        RemittancePaymentsCountryData remittancePaymentsCountryData = this.f101976c;
        return iHashCode + (remittancePaymentsCountryData == null ? 0 : remittancePaymentsCountryData.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101974a, i);
        dest.writeParcelable(this.f101975b, i);
        RemittancePaymentsCountryData remittancePaymentsCountryData = this.f101976c;
        if (remittancePaymentsCountryData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            remittancePaymentsCountryData.writeToParcel(dest, i);
        }
    }

    public RemittanceInputData(TransferFlowType flowType, TransferMoneyPocket moneyPocket, RemittancePaymentsCountryData remittancePaymentsCountryData) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(moneyPocket, "moneyPocket");
        this.f101974a = flowType;
        this.f101975b = moneyPocket;
        this.f101976c = remittancePaymentsCountryData;
    }

    public /* synthetic */ RemittanceInputData(TransferMoneyPocket transferMoneyPocket, int i) {
        this(TransferFlowType.Default.f92257b, (i & 2) != 0 ? new TransferMoneyPocket(null, null, 3) : transferMoneyPocket, null);
    }
}
