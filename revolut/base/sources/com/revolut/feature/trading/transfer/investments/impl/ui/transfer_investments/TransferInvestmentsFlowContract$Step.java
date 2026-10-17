package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "NewTransferAccountSelector", "NewTransferInvestmentsTypeSelection", "NewIsaTransferOut", "NewPersonalJisaTransferOut", "NewCustodianJisaTransferOut", "TransferOutFlow", "TransferInFlow", "ProductArticle", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step$NewCustodianJisaTransferOut;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step$NewIsaTransferOut;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step$NewPersonalJisaTransferOut;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step$NewTransferAccountSelector;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step$NewTransferInvestmentsTypeSelection;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step$TransferInFlow;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step$TransferOutFlow;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferInvestmentsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step$NewCustodianJisaTransferOut;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step;", "<init>", "()V", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewCustodianJisaTransferOut implements TransferInvestmentsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewCustodianJisaTransferOut f91611a = new NewCustodianJisaTransferOut();

        @NotNull
        public static final Parcelable.Creator<NewCustodianJisaTransferOut> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewCustodianJisaTransferOut.f91611a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewCustodianJisaTransferOut[i];
            }
        }

        private NewCustodianJisaTransferOut() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step$NewIsaTransferOut;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step;", "<init>", "()V", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewIsaTransferOut implements TransferInvestmentsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewIsaTransferOut f91612a = new NewIsaTransferOut();

        @NotNull
        public static final Parcelable.Creator<NewIsaTransferOut> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewIsaTransferOut.f91612a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewIsaTransferOut[i];
            }
        }

        private NewIsaTransferOut() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step$NewPersonalJisaTransferOut;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step;", "<init>", "()V", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewPersonalJisaTransferOut implements TransferInvestmentsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewPersonalJisaTransferOut f91613a = new NewPersonalJisaTransferOut();

        @NotNull
        public static final Parcelable.Creator<NewPersonalJisaTransferOut> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewPersonalJisaTransferOut.f91613a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewPersonalJisaTransferOut[i];
            }
        }

        private NewPersonalJisaTransferOut() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step$NewTransferAccountSelector;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step;", "<init>", "()V", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewTransferAccountSelector implements TransferInvestmentsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewTransferAccountSelector f91614a = new NewTransferAccountSelector();

        @NotNull
        public static final Parcelable.Creator<NewTransferAccountSelector> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewTransferAccountSelector.f91614a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransferAccountSelector[i];
            }
        }

        private NewTransferAccountSelector() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step$NewTransferInvestmentsTypeSelection;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewTransferInvestmentsTypeSelection implements TransferInvestmentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NewTransferInvestmentsTypeSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccount f91615a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewTransferInvestmentsTypeSelection((TradingAccount) parcel.readParcelable(NewTransferInvestmentsTypeSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransferInvestmentsTypeSelection[i];
            }
        }

        public NewTransferInvestmentsTypeSelection(TradingAccount tradingAccount) {
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            this.f91615a = tradingAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NewTransferInvestmentsTypeSelection) && Intrinsics.f(this.f91615a, ((NewTransferInvestmentsTypeSelection) obj2).f91615a);
        }

        public final int hashCode() {
            return this.f91615a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91615a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle implements TransferInvestmentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccount f91616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProductArticleKey f91617b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticle((TradingAccount) parcel.readParcelable(ProductArticle.class.getClassLoader()), (ProductArticleKey) parcel.readParcelable(ProductArticle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(TradingAccount tradingAccount, ProductArticleKey productArticleKey) {
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            Intrinsics.checkNotNullParameter(productArticleKey, "productArticleKey");
            this.f91616a = tradingAccount;
            this.f91617b = productArticleKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductArticle)) {
                return false;
            }
            ProductArticle productArticle = (ProductArticle) obj2;
            return Intrinsics.f(this.f91616a, productArticle.f91616a) && Intrinsics.f(this.f91617b, productArticle.f91617b);
        }

        public final int hashCode() {
            return this.f91617b.hashCode() + (this.f91616a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91616a, i);
            dest.writeParcelable(this.f91617b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step$TransferInFlow;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferInFlow implements TransferInvestmentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TransferInFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccount f91618a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferInFlow((TradingAccount) parcel.readParcelable(TransferInFlow.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferInFlow[i];
            }
        }

        public TransferInFlow(TradingAccount tradingAccount) {
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            this.f91618a = tradingAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransferInFlow) && Intrinsics.f(this.f91618a, ((TransferInFlow) obj2).f91618a);
        }

        public final int hashCode() {
            return this.f91618a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91618a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step$TransferOutFlow;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/TransferInvestmentsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferOutFlow implements TransferInvestmentsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TransferOutFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccount f91619a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferOutFlow((TradingAccount) parcel.readParcelable(TransferOutFlow.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferOutFlow[i];
            }
        }

        public TransferOutFlow(TradingAccount tradingAccount) {
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            this.f91619a = tradingAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransferOutFlow) && Intrinsics.f(this.f91619a, ((TransferOutFlow) obj2).f91619a);
        }

        public final int hashCode() {
            return this.f91619a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91619a, i);
        }
    }
}
