package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.transfer_review_submit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/screens/transfer_review_submit/TransferReviewSubmitContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReviewSubmitContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransferReviewSubmitContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferBroker f91605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferUserAccountInformation f91606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f91607c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            TransferBroker transferBroker = (TransferBroker) j6.a.f(parcel, "parcel", TransferReviewSubmitContract$InputData.class);
            TransferUserAccountInformation transferUserAccountInformation = (TransferUserAccountInformation) parcel.readParcelable(TransferReviewSubmitContract$InputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TransferReviewSubmitContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new TransferReviewSubmitContract$InputData(transferBroker, transferUserAccountInformation, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferReviewSubmitContract$InputData[i];
        }
    }

    public TransferReviewSubmitContract$InputData(TransferBroker selectedBroker, TransferUserAccountInformation userAccountInformation, List selectedAssets, String tradingAccountId) {
        Intrinsics.checkNotNullParameter(selectedBroker, "selectedBroker");
        Intrinsics.checkNotNullParameter(userAccountInformation, "userAccountInformation");
        Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        this.f91605a = selectedBroker;
        this.f91606b = userAccountInformation;
        this.f91607c = selectedAssets;
        this.d = tradingAccountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferReviewSubmitContract$InputData)) {
            return false;
        }
        TransferReviewSubmitContract$InputData transferReviewSubmitContract$InputData = (TransferReviewSubmitContract$InputData) obj2;
        return Intrinsics.f(this.f91605a, transferReviewSubmitContract$InputData.f91605a) && Intrinsics.f(this.f91606b, transferReviewSubmitContract$InputData.f91606b) && Intrinsics.f(this.f91607c, transferReviewSubmitContract$InputData.f91607c) && Intrinsics.f(this.d, transferReviewSubmitContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d((this.f91606b.hashCode() + (this.f91605a.hashCode() * 31)) * 31, 31, this.f91607c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91605a, i);
        dest.writeParcelable(this.f91606b, i);
        Iterator itV = p.a.v(this.f91607c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.d);
    }
}
