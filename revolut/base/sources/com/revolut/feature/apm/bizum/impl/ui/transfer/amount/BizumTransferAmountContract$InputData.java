package com.revolut.feature.apm.bizum.impl.ui.transfer.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData;
import com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.IOData$Input;
import hrf.f;
import jt1.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/bizum/impl/ui/transfer/amount/BizumTransferAmountContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "NewTransfer", "WithTransferData", "Lcom/revolut/feature/apm/bizum/impl/ui/transfer/amount/BizumTransferAmountContract$InputData$NewTransfer;", "Lcom/revolut/feature/apm/bizum/impl/ui/transfer/amount/BizumTransferAmountContract$InputData$WithTransferData;", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BizumTransferAmountContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/transfer/amount/BizumTransferAmountContract$InputData$NewTransfer;", "Lcom/revolut/feature/apm/bizum/impl/ui/transfer/amount/BizumTransferAmountContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewTransfer implements BizumTransferAmountContract$InputData {

        @NotNull
        public static final Parcelable.Creator<NewTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BizumContact f61601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f61602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferMoneyPocket f61603c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewTransfer((BizumContact) parcel.readParcelable(NewTransfer.class.getClassLoader()), f.valueOf(parcel.readString()), (TransferMoneyPocket) parcel.readParcelable(NewTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransfer[i];
            }
        }

        public NewTransfer(BizumContact recipient, f direction, TransferMoneyPocket fundingSource) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
            this.f61601a = recipient;
            this.f61602b = direction;
            this.f61603c = fundingSource;
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
            return Intrinsics.f(this.f61601a, newTransfer.f61601a) && this.f61602b == newTransfer.f61602b && Intrinsics.f(this.f61603c, newTransfer.f61603c);
        }

        public final int hashCode() {
            return this.f61603c.hashCode() + ((this.f61602b.hashCode() + (this.f61601a.hashCode() * 31)) * 31);
        }

        @Override // com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData
        /* JADX INFO: renamed from: k, reason: from getter */
        public final f getF61605b() {
            return this.f61602b;
        }

        @Override // com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData
        /* JADX INFO: renamed from: o7, reason: from getter */
        public final BizumContact getF61604a() {
            return this.f61601a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61601a, i);
            dest.writeString(this.f61602b.name());
            dest.writeParcelable(this.f61603c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/transfer/amount/BizumTransferAmountContract$InputData$WithTransferData;", "Lcom/revolut/feature/apm/bizum/impl/ui/transfer/amount/BizumTransferAmountContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithTransferData implements BizumTransferAmountContract$InputData {

        @NotNull
        public static final Parcelable.Creator<WithTransferData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BizumContact f61604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f61605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BizumTransferData f61606c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithTransferData((BizumContact) parcel.readParcelable(WithTransferData.class.getClassLoader()), f.valueOf(parcel.readString()), BizumTransferData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithTransferData[i];
            }
        }

        public WithTransferData(BizumContact recipient, f direction, BizumTransferData transferData) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(transferData, "transferData");
            this.f61604a = recipient;
            this.f61605b = direction;
            this.f61606c = transferData;
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
            return Intrinsics.f(this.f61604a, withTransferData.f61604a) && this.f61605b == withTransferData.f61605b && Intrinsics.f(this.f61606c, withTransferData.f61606c);
        }

        public final int hashCode() {
            return this.f61606c.hashCode() + ((this.f61605b.hashCode() + (this.f61604a.hashCode() * 31)) * 31);
        }

        @Override // com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData
        /* JADX INFO: renamed from: k, reason: from getter */
        public final f getF61605b() {
            return this.f61605b;
        }

        @Override // com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData
        /* JADX INFO: renamed from: o7, reason: from getter */
        public final BizumContact getF61604a() {
            return this.f61604a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61604a, i);
            dest.writeString(this.f61605b.name());
            this.f61606c.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: renamed from: k */
    f getF61605b();

    default ApmQuoteDirection k7() {
        int i = c.f178279a[getF61605b().ordinal()];
        if (i == 1) {
            return new ApmQuoteDirection.Outgoing(ApmPaymentMethod.BIZUM.f62164a);
        }
        if (i == 2) {
            return new ApmQuoteDirection.Incoming(MoneyRequestChannel.Bizum.f60331b);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o7 */
    BizumContact getF61604a();
}
