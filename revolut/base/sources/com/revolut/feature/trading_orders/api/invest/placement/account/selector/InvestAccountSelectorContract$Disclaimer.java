package com.revolut.feature.trading_orders.api.invest.placement.account.selector;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$Disclaimer", "Landroid/os/Parcelable;", "Securities", "Commodities", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$Disclaimer$Commodities;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$Disclaimer$Securities;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvestAccountSelectorContract$Disclaimer extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$Disclaimer$Commodities;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$Disclaimer;", "<init>", "()V", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Commodities implements InvestAccountSelectorContract$Disclaimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Commodities f91708a = new Commodities();

        @NotNull
        public static final Parcelable.Creator<Commodities> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Commodities.f91708a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Commodities[i];
            }
        }

        private Commodities() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$Disclaimer$Securities;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$Disclaimer;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Securities implements InvestAccountSelectorContract$Disclaimer {

        @NotNull
        public static final Parcelable.Creator<Securities> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91709a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Securities(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Securities[i];
            }
        }

        public Securities(String securityRef) {
            Intrinsics.checkNotNullParameter(securityRef, "securityRef");
            this.f91709a = securityRef;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Securities) && Intrinsics.f(this.f91709a, ((Securities) obj2).f91709a);
        }

        public final int hashCode() {
            return this.f91709a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91709a);
        }
    }
}
