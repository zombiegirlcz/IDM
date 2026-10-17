package com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "CloseAccountInputData", "CloseTradingProductInputData", "NegativeBalanceInputData", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$InputData$CloseAccountInputData;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$InputData$CloseTradingProductInputData;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$InputData$NegativeBalanceInputData;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AccountClosureFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$InputData$CloseAccountInputData;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CloseAccountInputData implements AccountClosureFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CloseAccountInputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94899a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CloseAccountInputData(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CloseAccountInputData[i];
            }
        }

        public CloseAccountInputData(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f94899a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CloseAccountInputData) && Intrinsics.f(this.f94899a, ((CloseAccountInputData) obj2).f94899a);
        }

        public final int hashCode() {
            return this.f94899a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94899a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$InputData$CloseTradingProductInputData;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CloseTradingProductInputData implements AccountClosureFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CloseTradingProductInputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradingProductCode f94901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f94902c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                TradingProductCode tradingProductCode = (TradingProductCode) parcel.readParcelable(CloseTradingProductInputData.class.getClassLoader());
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(CloseTradingProductInputData.class, parcel, linkedHashSet, iE, 1);
                }
                return new CloseTradingProductInputData(string, tradingProductCode, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CloseTradingProductInputData[i];
            }
        }

        public CloseTradingProductInputData(String accountId, TradingProductCode product, Set applicablePreconditions) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(applicablePreconditions, "applicablePreconditions");
            this.f94900a = accountId;
            this.f94901b = product;
            this.f94902c = applicablePreconditions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CloseTradingProductInputData)) {
                return false;
            }
            CloseTradingProductInputData closeTradingProductInputData = (CloseTradingProductInputData) obj2;
            return Intrinsics.f(this.f94900a, closeTradingProductInputData.f94900a) && Intrinsics.f(this.f94901b, closeTradingProductInputData.f94901b) && Intrinsics.f(this.f94902c, closeTradingProductInputData.f94902c);
        }

        public final int hashCode() {
            return this.f94902c.hashCode() + ((this.f94901b.hashCode() + (this.f94900a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94900a);
            dest.writeParcelable(this.f94901b, i);
            Iterator itV = n.v(this.f94902c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$InputData$NegativeBalanceInputData;", "Lcom/revolut/feature/wealth/account_closure/impl/ui/flows/account_closure/AccountClosureFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NegativeBalanceInputData implements AccountClosureFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<NegativeBalanceInputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94903a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NegativeBalanceInputData(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NegativeBalanceInputData[i];
            }
        }

        public NegativeBalanceInputData(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f94903a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NegativeBalanceInputData) && Intrinsics.f(this.f94903a, ((NegativeBalanceInputData) obj2).f94903a);
        }

        public final int hashCode() {
            return this.f94903a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94903a);
        }
    }
}
