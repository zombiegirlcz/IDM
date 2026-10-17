package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "BrokerSelection", "AccountInformation", "AssetSelection", "ReviewSubmit", "IsaReviewSubmit", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$Step$AccountInformation;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$Step$AssetSelection;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$Step$BrokerSelection;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$Step$IsaReviewSubmit;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$Step$ReviewSubmit;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferInFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$Step$AccountInformation;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountInformation implements TransferInFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountInformation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferBroker f91577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradingAccount f91578b;

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

        public AccountInformation(TransferBroker selectedBroker, TradingAccount tradingAccount) {
            Intrinsics.checkNotNullParameter(selectedBroker, "selectedBroker");
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            this.f91577a = selectedBroker;
            this.f91578b = tradingAccount;
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
            return Intrinsics.f(this.f91577a, accountInformation.f91577a) && Intrinsics.f(this.f91578b, accountInformation.f91578b);
        }

        public final int hashCode() {
            return this.f91578b.hashCode() + (this.f91577a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91577a, i);
            dest.writeParcelable(this.f91578b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$Step$AssetSelection;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AssetSelection implements TransferInFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AssetSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferBroker f91579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f91580b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AssetSelection((TransferBroker) parcel.readParcelable(AssetSelection.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AssetSelection[i];
            }
        }

        public AssetSelection(TransferBroker selectedBroker, String tradingAccountId) {
            Intrinsics.checkNotNullParameter(selectedBroker, "selectedBroker");
            Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
            this.f91579a = selectedBroker;
            this.f91580b = tradingAccountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AssetSelection)) {
                return false;
            }
            AssetSelection assetSelection = (AssetSelection) obj2;
            return Intrinsics.f(this.f91579a, assetSelection.f91579a) && Intrinsics.f(this.f91580b, assetSelection.f91580b);
        }

        public final int hashCode() {
            return this.f91580b.hashCode() + (this.f91579a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91579a, i);
            dest.writeString(this.f91580b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$Step$BrokerSelection;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BrokerSelection implements TransferInFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BrokerSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccount f91581a;

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

        public BrokerSelection(TradingAccount tradingAccount) {
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            this.f91581a = tradingAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BrokerSelection) && Intrinsics.f(this.f91581a, ((BrokerSelection) obj2).f91581a);
        }

        public final int hashCode() {
            return this.f91581a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91581a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$Step$IsaReviewSubmit;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IsaReviewSubmit implements TransferInFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<IsaReviewSubmit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferBroker f91582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferUserAccountInformation.TaaTransferUserAccountInformation f91583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TradingAccount f91584c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IsaReviewSubmit((TransferBroker) parcel.readParcelable(IsaReviewSubmit.class.getClassLoader()), (TransferUserAccountInformation.TaaTransferUserAccountInformation) parcel.readParcelable(IsaReviewSubmit.class.getClassLoader()), (TradingAccount) parcel.readParcelable(IsaReviewSubmit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IsaReviewSubmit[i];
            }
        }

        public IsaReviewSubmit(TransferBroker selectedBroker, TransferUserAccountInformation.TaaTransferUserAccountInformation userAccountInformation, TradingAccount tradingAccount) {
            Intrinsics.checkNotNullParameter(selectedBroker, "selectedBroker");
            Intrinsics.checkNotNullParameter(userAccountInformation, "userAccountInformation");
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            this.f91582a = selectedBroker;
            this.f91583b = userAccountInformation;
            this.f91584c = tradingAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IsaReviewSubmit)) {
                return false;
            }
            IsaReviewSubmit isaReviewSubmit = (IsaReviewSubmit) obj2;
            return Intrinsics.f(this.f91582a, isaReviewSubmit.f91582a) && Intrinsics.f(this.f91583b, isaReviewSubmit.f91583b) && Intrinsics.f(this.f91584c, isaReviewSubmit.f91584c);
        }

        public final int hashCode() {
            return this.f91584c.hashCode() + p.a.c(this.f91582a.hashCode() * 31, 31, this.f91583b.f91536a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91582a, i);
            dest.writeParcelable(this.f91583b, i);
            dest.writeParcelable(this.f91584c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$Step$ReviewSubmit;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/TransferInFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewSubmit implements TransferInFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReviewSubmit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferBroker f91585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferUserAccountInformation f91586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f91587c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                TransferBroker transferBroker = (TransferBroker) j6.a.f(parcel, "parcel", ReviewSubmit.class);
                TransferUserAccountInformation transferUserAccountInformation = (TransferUserAccountInformation) parcel.readParcelable(ReviewSubmit.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ReviewSubmit.class, parcel, arrayList, iE, 1);
                }
                return new ReviewSubmit(transferBroker, transferUserAccountInformation, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewSubmit[i];
            }
        }

        public ReviewSubmit(TransferBroker selectedBroker, TransferUserAccountInformation userAccountInformation, List selectedAssets, String tradingAccountId) {
            Intrinsics.checkNotNullParameter(selectedBroker, "selectedBroker");
            Intrinsics.checkNotNullParameter(userAccountInformation, "userAccountInformation");
            Intrinsics.checkNotNullParameter(selectedAssets, "selectedAssets");
            Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
            this.f91585a = selectedBroker;
            this.f91586b = userAccountInformation;
            this.f91587c = selectedAssets;
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
            if (!(obj2 instanceof ReviewSubmit)) {
                return false;
            }
            ReviewSubmit reviewSubmit = (ReviewSubmit) obj2;
            return Intrinsics.f(this.f91585a, reviewSubmit.f91585a) && Intrinsics.f(this.f91586b, reviewSubmit.f91586b) && Intrinsics.f(this.f91587c, reviewSubmit.f91587c) && Intrinsics.f(this.d, reviewSubmit.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.d((this.f91586b.hashCode() + (this.f91585a.hashCode() * 31)) * 31, 31, this.f91587c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91585a, i);
            dest.writeParcelable(this.f91586b, i);
            Iterator itV = p.a.v(this.f91587c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeString(this.d);
        }
    }
}
