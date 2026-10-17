package com.revolut.feature_crypto_order_details.impl.ui.pager;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature_crypto_order_details/impl/ui/pager/CryptoOrderDetailsPagerFlowContract$OrderPage", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "<init>", "()V", "Exchange", "Recurring", "Lcom/revolut/feature_crypto_order_details/impl/ui/pager/CryptoOrderDetailsPagerFlowContract$OrderPage$Exchange;", "Lcom/revolut/feature_crypto_order_details/impl/ui/pager/CryptoOrderDetailsPagerFlowContract$OrderPage$Recurring;", "feature_crypto_order_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoOrderDetailsPagerFlowContract$OrderPage implements PagerItem {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_details/impl/ui/pager/CryptoOrderDetailsPagerFlowContract$OrderPage$Exchange;", "Lcom/revolut/feature_crypto_order_details/impl/ui/pager/CryptoOrderDetailsPagerFlowContract$OrderPage;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Exchange extends CryptoOrderDetailsPagerFlowContract$OrderPage {

        @NotNull
        public static final Parcelable.Creator<Exchange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExchangeOrder.Active f96667a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Exchange((ExchangeOrder.Active) parcel.readParcelable(Exchange.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Exchange[i];
            }
        }

        public Exchange(ExchangeOrder.Active order) {
            Intrinsics.checkNotNullParameter(order, "order");
            this.f96667a = order;
        }

        @Override // com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlowContract$OrderPage
        public final CryptoOrderDetailsInputData a() {
            return com.revolut.feature_crypto_order_details.api.navigation.a.a(this.f96667a);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlowContract$OrderPage
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Exchange) && Intrinsics.f(this.f96667a, ((Exchange) obj2).f96667a);
        }

        @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId */
        public final String getD() {
            return this.f96667a.f72129a.f72137a;
        }

        @Override // com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlowContract$OrderPage
        public final int hashCode() {
            return this.f96667a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96667a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_details/impl/ui/pager/CryptoOrderDetailsPagerFlowContract$OrderPage$Recurring;", "Lcom/revolut/feature_crypto_order_details/impl/ui/pager/CryptoOrderDetailsPagerFlowContract$OrderPage;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Recurring extends CryptoOrderDetailsPagerFlowContract$OrderPage {

        @NotNull
        public static final Parcelable.Creator<Recurring> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoOrderDetailsInputData.RecurringInputData f96668a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Recurring((CryptoOrderDetailsInputData.RecurringInputData) parcel.readParcelable(Recurring.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Recurring[i];
            }
        }

        public Recurring(CryptoOrderDetailsInputData.RecurringInputData recurringInputData) {
            Intrinsics.checkNotNullParameter(recurringInputData, "recurringInputData");
            this.f96668a = recurringInputData;
        }

        @Override // com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlowContract$OrderPage
        public final CryptoOrderDetailsInputData a() {
            return this.f96668a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlowContract$OrderPage
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Recurring) && Intrinsics.f(this.f96668a, ((Recurring) obj2).f96668a);
        }

        @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId */
        public final String getD() {
            return this.f96668a.f96658a;
        }

        @Override // com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlowContract$OrderPage
        public final int hashCode() {
            return this.f96668a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96668a, i);
        }
    }

    private CryptoOrderDetailsPagerFlowContract$OrderPage() {
    }

    public abstract CryptoOrderDetailsInputData a();

    public boolean equals(Object obj2) {
        return (obj2 instanceof CryptoOrderDetailsPagerFlowContract$OrderPage) && Intrinsics.f(getD(), ((CryptoOrderDetailsPagerFlowContract$OrderPage) obj2).getD());
    }

    public int hashCode() {
        return getD().hashCode();
    }
}
