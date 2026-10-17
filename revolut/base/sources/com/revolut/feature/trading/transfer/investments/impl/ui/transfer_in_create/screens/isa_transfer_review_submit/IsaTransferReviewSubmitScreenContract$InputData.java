package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.isa_transfer_review_submit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import u8f.b;
import u8f.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/screens/isa_transfer_review_submit/IsaTransferReviewSubmitScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IsaTransferReviewSubmitScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IsaTransferReviewSubmitScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferBroker f91599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferUserAccountInformation.TaaTransferUserAccountInformation f91600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TradingAccount.TaxAdvantage f91601c;
    public final b d;
    public final Object e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            TransferBroker transferBroker = (TransferBroker) j6.a.f(parcel, "parcel", IsaTransferReviewSubmitScreenContract$InputData.class);
            TransferUserAccountInformation.TaaTransferUserAccountInformation taaTransferUserAccountInformation = (TransferUserAccountInformation.TaaTransferUserAccountInformation) parcel.readParcelable(IsaTransferReviewSubmitScreenContract$InputData.class.getClassLoader());
            TradingAccount.TaxAdvantage taxAdvantage = (TradingAccount.TaxAdvantage) parcel.readParcelable(IsaTransferReviewSubmitScreenContract$InputData.class.getClassLoader());
            b bVarValueOf = b.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readParcelable(IsaTransferReviewSubmitScreenContract$InputData.class.getClassLoader()), c.valueOf(parcel.readString()));
            }
            return new IsaTransferReviewSubmitScreenContract$InputData(transferBroker, taaTransferUserAccountInformation, taxAdvantage, bVarValueOf, linkedHashMap, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IsaTransferReviewSubmitScreenContract$InputData[i];
        }
    }

    public IsaTransferReviewSubmitScreenContract$InputData(TransferBroker transferBroker, TransferUserAccountInformation.TaaTransferUserAccountInformation taaTransferInAccountInformation, TradingAccount.TaxAdvantage tradingAccount, b transferType, Map transferYears, boolean z) {
        Intrinsics.checkNotNullParameter(transferBroker, "transferBroker");
        Intrinsics.checkNotNullParameter(taaTransferInAccountInformation, "taaTransferInAccountInformation");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        Intrinsics.checkNotNullParameter(transferYears, "transferYears");
        this.f91599a = transferBroker;
        this.f91600b = taaTransferInAccountInformation;
        this.f91601c = tradingAccount;
        this.d = transferType;
        this.e = transferYears;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IsaTransferReviewSubmitScreenContract$InputData)) {
            return false;
        }
        IsaTransferReviewSubmitScreenContract$InputData isaTransferReviewSubmitScreenContract$InputData = (IsaTransferReviewSubmitScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91599a, isaTransferReviewSubmitScreenContract$InputData.f91599a) && Intrinsics.f(this.f91600b, isaTransferReviewSubmitScreenContract$InputData.f91600b) && Intrinsics.f(this.f91601c, isaTransferReviewSubmitScreenContract$InputData.f91601c) && this.d == isaTransferReviewSubmitScreenContract$InputData.d && this.e.equals(isaTransferReviewSubmitScreenContract$InputData.e) && this.f == isaTransferReviewSubmitScreenContract$InputData.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + p.a.b((this.d.hashCode() + ((this.f91601c.hashCode() + p.a.c(this.f91599a.hashCode() * 31, 31, this.f91600b.f91536a)) * 31)) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91599a, i);
        dest.writeParcelable(this.f91600b, i);
        dest.writeParcelable(this.f91601c, i);
        dest.writeString(this.d.name());
        Iterator itT = o.t(this.e, dest);
        while (itT.hasNext()) {
            Map.Entry entry = (Map.Entry) itT.next();
            dest.writeParcelable((Parcelable) entry.getKey(), i);
            dest.writeString(((c) entry.getValue()).name());
        }
        dest.writeInt(this.f ? 1 : 0);
    }
}
