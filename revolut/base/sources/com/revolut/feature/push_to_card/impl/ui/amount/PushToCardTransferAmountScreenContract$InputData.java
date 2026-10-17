package com.revolut.feature.push_to_card.impl.ui.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.feature.transfer.models.tracking.TransferAppSource;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/push_to_card/impl/ui/amount/PushToCardTransferAmountScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "NewTransfer", "WithTransferData", "Lcom/revolut/feature/push_to_card/impl/ui/amount/PushToCardTransferAmountScreenContract$InputData$NewTransfer;", "Lcom/revolut/feature/push_to_card/impl/ui/amount/PushToCardTransferAmountScreenContract$InputData$WithTransferData;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PushToCardTransferAmountScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/ui/amount/PushToCardTransferAmountScreenContract$InputData$NewTransfer;", "Lcom/revolut/feature/push_to_card/impl/ui/amount/PushToCardTransferAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewTransfer implements PushToCardTransferAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<NewTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardOwner f81596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferFlowType f81597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferMoneyPocket f81598c;
        public final TransferAppSource d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewTransfer((CardOwner) parcel.readParcelable(NewTransfer.class.getClassLoader()), (TransferFlowType) parcel.readParcelable(NewTransfer.class.getClassLoader()), (TransferMoneyPocket) parcel.readParcelable(NewTransfer.class.getClassLoader()), (TransferAppSource) parcel.readParcelable(NewTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransfer[i];
            }
        }

        public NewTransfer(CardOwner recipient, TransferFlowType transferFlowType, TransferMoneyPocket moneyPocket, TransferAppSource transferAppSource) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(transferFlowType, "transferFlowType");
            Intrinsics.checkNotNullParameter(moneyPocket, "moneyPocket");
            Intrinsics.checkNotNullParameter(transferAppSource, "transferAppSource");
            this.f81596a = recipient;
            this.f81597b = transferFlowType;
            this.f81598c = moneyPocket;
            this.d = transferAppSource;
        }

        @Override // com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreenContract$InputData
        /* JADX INFO: renamed from: R6, reason: from getter */
        public final CardOwner getF81599a() {
            return this.f81596a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewTransfer)) {
                return false;
            }
            NewTransfer newTransfer = (NewTransfer) obj2;
            return Intrinsics.f(this.f81596a, newTransfer.f81596a) && Intrinsics.f(this.f81597b, newTransfer.f81597b) && Intrinsics.f(this.f81598c, newTransfer.f81598c) && Intrinsics.f(this.d, newTransfer.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f81598c.hashCode() + d.c(this.f81597b, this.f81596a.hashCode() * 31, 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f81596a, i);
            dest.writeParcelable(this.f81597b, i);
            dest.writeParcelable(this.f81598c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/ui/amount/PushToCardTransferAmountScreenContract$InputData$WithTransferData;", "Lcom/revolut/feature/push_to_card/impl/ui/amount/PushToCardTransferAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithTransferData implements PushToCardTransferAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<WithTransferData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardOwner f81599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PushToCardTransferData f81600b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithTransferData((CardOwner) parcel.readParcelable(WithTransferData.class.getClassLoader()), (PushToCardTransferData) parcel.readParcelable(WithTransferData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithTransferData[i];
            }
        }

        public WithTransferData(CardOwner recipient, PushToCardTransferData transferData) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(transferData, "transferData");
            this.f81599a = recipient;
            this.f81600b = transferData;
        }

        @Override // com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreenContract$InputData
        /* JADX INFO: renamed from: R6, reason: from getter */
        public final CardOwner getF81599a() {
            return this.f81599a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithTransferData)) {
                return false;
            }
            WithTransferData withTransferData = (WithTransferData) obj2;
            return Intrinsics.f(this.f81599a, withTransferData.f81599a) && Intrinsics.f(this.f81600b, withTransferData.f81600b);
        }

        public final int hashCode() {
            return this.f81600b.hashCode() + (this.f81599a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f81599a, i);
            dest.writeParcelable(this.f81600b, i);
        }
    }

    /* JADX INFO: renamed from: R6 */
    CardOwner getF81599a();
}
