package com.revolut.retail.feature.stockdetails.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/api/navigation/StartNavigation;", "Landroid/os/Parcelable;", "OrderFlow", "InsightsFlow", "Lcom/revolut/retail/feature/stockdetails/api/navigation/StartNavigation$InsightsFlow;", "Lcom/revolut/retail/feature/stockdetails/api/navigation/StartNavigation$OrderFlow;", "feature_stock_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StartNavigation extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/api/navigation/StartNavigation$InsightsFlow;", "Lcom/revolut/retail/feature/stockdetails/api/navigation/StartNavigation;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InsightsFlow implements StartNavigation {

        @NotNull
        public static final Parcelable.Creator<InsightsFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103741a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InsightsFlow(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InsightsFlow[i];
            }
        }

        public InsightsFlow(String insightId) {
            Intrinsics.checkNotNullParameter(insightId, "insightId");
            this.f103741a = insightId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InsightsFlow) && Intrinsics.f(this.f103741a, ((InsightsFlow) obj2).f103741a);
        }

        public final int hashCode() {
            return this.f103741a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103741a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/api/navigation/StartNavigation$OrderFlow;", "Lcom/revolut/retail/feature/stockdetails/api/navigation/StartNavigation;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderFlow implements StartNavigation {

        @NotNull
        public static final Parcelable.Creator<OrderFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccountType f103742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f103743b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderFlow((TradingAccountType) parcel.readParcelable(OrderFlow.class.getClassLoader()), g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderFlow[i];
            }
        }

        public OrderFlow(TradingAccountType account, g action) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f103742a = account;
            this.f103743b = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OrderFlow)) {
                return false;
            }
            OrderFlow orderFlow = (OrderFlow) obj2;
            return Intrinsics.f(this.f103742a, orderFlow.f103742a) && this.f103743b == orderFlow.f103743b;
        }

        public final int hashCode() {
            return this.f103743b.hashCode() + (this.f103742a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103742a, i);
            dest.writeString(this.f103743b.name());
        }
    }
}
