package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Disclaimer", "BrokerSelection", "AccountInformation", "AssetSelection", "Review", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$Step$AccountInformation;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$Step$AssetSelection;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$Step$BrokerSelection;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$Step$Disclaimer;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$Step$Review;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferOutFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$Step$AccountInformation;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountInformation implements TransferOutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountInformation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferBroker f91628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradingAccount f91629b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountInformation((TransferBroker) parcel.readParcelable(AccountInformation.class.getClassLoader()), (TradingAccount) parcel.readParcelable(AccountInformation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountInformation[i];
            }
        }

        public AccountInformation(TransferBroker destinationBroker, TradingAccount sourceAccount) {
            Intrinsics.checkNotNullParameter(destinationBroker, "destinationBroker");
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            this.f91628a = destinationBroker;
            this.f91629b = sourceAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountInformation)) {
                return false;
            }
            AccountInformation accountInformation = (AccountInformation) obj2;
            return Intrinsics.f(this.f91628a, accountInformation.f91628a) && Intrinsics.f(this.f91629b, accountInformation.f91629b);
        }

        public final int hashCode() {
            return this.f91629b.hashCode() + (this.f91628a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91628a, i);
            dest.writeParcelable(this.f91629b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$Step$AssetSelection;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AssetSelection implements TransferOutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AssetSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccount f91630a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AssetSelection((TradingAccount) parcel.readParcelable(AssetSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AssetSelection[i];
            }
        }

        public AssetSelection(TradingAccount sourceAccount) {
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            this.f91630a = sourceAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AssetSelection) && Intrinsics.f(this.f91630a, ((AssetSelection) obj2).f91630a);
        }

        public final int hashCode() {
            return this.f91630a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91630a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$Step$BrokerSelection;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BrokerSelection implements TransferOutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BrokerSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccount f91631a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BrokerSelection((TradingAccount) parcel.readParcelable(BrokerSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BrokerSelection[i];
            }
        }

        public BrokerSelection(TradingAccount sourceAccount) {
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            this.f91631a = sourceAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BrokerSelection) && Intrinsics.f(this.f91631a, ((BrokerSelection) obj2).f91631a);
        }

        public final int hashCode() {
            return this.f91631a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91631a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$Step$Disclaimer;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$Step;", "<init>", "()V", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Disclaimer implements TransferOutFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Disclaimer f91632a = new Disclaimer();

        @NotNull
        public static final Parcelable.Creator<Disclaimer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Disclaimer.f91632a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Disclaimer[i];
            }
        }

        private Disclaimer() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$Step$Review;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create_revamp/TransferOutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review implements TransferOutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferBroker f91633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferUserAccountInformation f91634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f91635c;
        public final TradingAccount d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                TransferBroker transferBroker = (TransferBroker) j6.a.f(parcel, "parcel", Review.class);
                TransferUserAccountInformation transferUserAccountInformation = (TransferUserAccountInformation) parcel.readParcelable(Review.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Review.class, parcel, arrayList, iE, 1);
                }
                return new Review(transferBroker, transferUserAccountInformation, arrayList, (TradingAccount) parcel.readParcelable(Review.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(TransferBroker destinationBroker, TransferUserAccountInformation destinationAccountInformation, ArrayList selectedAssets, TradingAccount sourceAccount) {
            Intrinsics.checkNotNullParameter(destinationBroker, "destinationBroker");
            Intrinsics.checkNotNullParameter(destinationAccountInformation, "destinationAccountInformation");
            Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            this.f91633a = destinationBroker;
            this.f91634b = destinationAccountInformation;
            this.f91635c = selectedAssets;
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
            if (!(obj2 instanceof Review)) {
                return false;
            }
            Review review = (Review) obj2;
            return Intrinsics.f(this.f91633a, review.f91633a) && Intrinsics.f(this.f91634b, review.f91634b) && this.f91635c.equals(review.f91635c) && Intrinsics.f(this.d, review.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f91635c, (this.f91634b.hashCode() + (this.f91633a.hashCode() * 31)) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91633a, i);
            dest.writeParcelable(this.f91634b, i);
            Iterator itY = j6.a.y(this.f91635c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeParcelable(this.d, i);
        }
    }
}
