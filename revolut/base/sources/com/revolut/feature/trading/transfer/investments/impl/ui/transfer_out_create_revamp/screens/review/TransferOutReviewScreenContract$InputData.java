package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/screens/review/TransferOutReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferOutReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransferOutReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferBroker f91641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferUserAccountInformation f91642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f91643c;
    public final TradingAccount d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            TransferBroker transferBroker = (TransferBroker) j6.a.f(parcel, "parcel", TransferOutReviewScreenContract$InputData.class);
            TransferUserAccountInformation transferUserAccountInformation = (TransferUserAccountInformation) parcel.readParcelable(TransferOutReviewScreenContract$InputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TransferOutReviewScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new TransferOutReviewScreenContract$InputData(transferBroker, transferUserAccountInformation, arrayList, (TradingAccount) parcel.readParcelable(TransferOutReviewScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferOutReviewScreenContract$InputData[i];
        }
    }

    public TransferOutReviewScreenContract$InputData(TransferBroker destinationBroker, TransferUserAccountInformation destinationAccountInformation, ArrayList selectedAssets, TradingAccount sourceAccount) {
        Intrinsics.checkNotNullParameter(destinationBroker, "destinationBroker");
        Intrinsics.checkNotNullParameter(destinationAccountInformation, "destinationAccountInformation");
        Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        this.f91641a = destinationBroker;
        this.f91642b = destinationAccountInformation;
        this.f91643c = selectedAssets;
        this.d = sourceAccount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferOutReviewScreenContract$InputData)) {
            return false;
        }
        TransferOutReviewScreenContract$InputData transferOutReviewScreenContract$InputData = (TransferOutReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91641a, transferOutReviewScreenContract$InputData.f91641a) && Intrinsics.f(this.f91642b, transferOutReviewScreenContract$InputData.f91642b) && this.f91643c.equals(transferOutReviewScreenContract$InputData.f91643c) && Intrinsics.f(this.d, transferOutReviewScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f91643c, (this.f91642b.hashCode() + (this.f91641a.hashCode() * 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91641a, i);
        dest.writeParcelable(this.f91642b, i);
        Iterator itY = j6.a.y(this.f91643c, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeParcelable(this.d, i);
    }
}
