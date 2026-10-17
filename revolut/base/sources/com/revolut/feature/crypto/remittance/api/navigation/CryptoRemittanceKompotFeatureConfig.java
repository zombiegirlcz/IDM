package com.revolut.feature.crypto.remittance.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.ActivityAnimation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rj5.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "CurrencyPicker", "CurrencyPickerDestination", "com/revolut/feature/crypto/remittance/api/navigation/b", "MultichainInfoDestination", "Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker;", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoRemittanceKompotFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker;", "Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Entrypoint", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyPicker extends CryptoRemittanceKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CurrencyPicker> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CurrencyPickerDestination.InputData f70936g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f70937h;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint;", "Landroid/os/Parcelable;", "Deposit", "DepositWidget", "OrdersWidget", "RecurringStrategy", "TakeProfitStopLossBuy", "Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint$Deposit;", "Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint$DepositWidget;", "Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint$OrdersWidget;", "Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint$RecurringStrategy;", "Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint$TakeProfitStopLossBuy;", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Entrypoint extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint$Deposit;", "Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint;", "<init>", "()V", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Deposit implements Entrypoint {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Deposit f70938a = new Deposit();

                @NotNull
                public static final Parcelable.Creator<Deposit> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Deposit.f70938a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Deposit[i];
                    }
                }

                private Deposit() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint$DepositWidget;", "Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint;", "<init>", "()V", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class DepositWidget implements Entrypoint {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final DepositWidget f70939a = new DepositWidget();

                @NotNull
                public static final Parcelable.Creator<DepositWidget> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return DepositWidget.f70939a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new DepositWidget[i];
                    }
                }

                private DepositWidget() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint$OrdersWidget;", "Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint;", "<init>", "()V", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class OrdersWidget implements Entrypoint {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final OrdersWidget f70940a = new OrdersWidget();

                @NotNull
                public static final Parcelable.Creator<OrdersWidget> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return OrdersWidget.f70940a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new OrdersWidget[i];
                    }
                }

                private OrdersWidget() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint$RecurringStrategy;", "Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint;", "<init>", "()V", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class RecurringStrategy implements Entrypoint {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final RecurringStrategy f70941a = new RecurringStrategy();

                @NotNull
                public static final Parcelable.Creator<RecurringStrategy> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return RecurringStrategy.f70941a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new RecurringStrategy[i];
                    }
                }

                private RecurringStrategy() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint$TakeProfitStopLossBuy;", "Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPicker$Entrypoint;", "<init>", "()V", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class TakeProfitStopLossBuy implements Entrypoint {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final TakeProfitStopLossBuy f70942a = new TakeProfitStopLossBuy();

                @NotNull
                public static final Parcelable.Creator<TakeProfitStopLossBuy> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return TakeProfitStopLossBuy.f70942a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new TakeProfitStopLossBuy[i];
                    }
                }

                private TakeProfitStopLossBuy() {
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
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrencyPicker(CurrencyPickerDestination.InputData.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(CurrencyPicker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyPicker[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CurrencyPicker(CurrencyPickerDestination.InputData inputData, ActivityAnimation activityAnimation) {
            super(null, new CurrencyPickerDestination(inputData), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f70936g = inputData;
            this.f70937h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF82495h() {
            return this.f70937h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrencyPicker)) {
                return false;
            }
            CurrencyPicker currencyPicker = (CurrencyPicker) obj2;
            return Intrinsics.f(this.f70936g, currencyPicker.f70936g) && Intrinsics.f(this.f70937h, currencyPicker.f70937h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f70936g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f70937h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f70936g.writeToParcel(dest, i);
            dest.writeParcelable(this.f70937h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$MultichainInfoDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MultichainInfoDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<MultichainInfoDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f70951a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MultichainInfoDestination(c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MultichainInfoDestination[i];
            }
        }

        public MultichainInfoDestination(c tab2) {
            Intrinsics.checkNotNullParameter(tab2, "tab");
            this.f70951a = tab2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getF70951a() {
            return this.f70951a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MultichainInfoDestination) && this.f70951a == ((MultichainInfoDestination) obj2).f70951a;
        }

        public final int hashCode() {
            return this.f70951a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70951a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPickerDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyPickerDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<CurrencyPickerDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputData f70943a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrencyPickerDestination(InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyPickerDestination[i];
            }
        }

        public CurrencyPickerDestination(InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f70943a = inputData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InputData getF70943a() {
            return this.f70943a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CurrencyPickerDestination) && Intrinsics.f(this.f70943a, ((CurrencyPickerDestination) obj2).f70943a);
        }

        public final int hashCode() {
            return this.f70943a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f70943a.writeToParcel(dest, i);
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPickerDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Currencies", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InputData implements IOData$Input {

            @NotNull
            public static final Parcelable.Creator<InputData> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Currencies f70944a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f70945b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final xi0.b f70946c;
            public final CurrencyPicker.Entrypoint d;
            public final pj5.a e;
            public final Clause f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f70947g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final boolean f70948h;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPickerDestination$InputData$Currencies;", "Landroid/os/Parcelable;", "Sorted", "DefaultSorting", "Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPickerDestination$InputData$Currencies$DefaultSorting;", "Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPickerDestination$InputData$Currencies$Sorted;", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface Currencies extends Parcelable {

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPickerDestination$InputData$Currencies$DefaultSorting;", "Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPickerDestination$InputData$Currencies;", "", "toString", "()Ljava/lang/String;", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class DefaultSorting implements Currencies {

                    @NotNull
                    public static final Parcelable.Creator<DefaultSorting> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final List f70949a;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            int i = parcel.readInt();
                            ArrayList arrayList = new ArrayList(i);
                            int iC = 0;
                            while (iC != i) {
                                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                            }
                            return new DefaultSorting(arrayList);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new DefaultSorting[i];
                        }
                    }

                    public DefaultSorting(List currencyList) {
                        Intrinsics.checkNotNullParameter(currencyList, "currencyList");
                        this.f70949a = currencyList;
                    }

                    @Override // com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies
                    /* JADX INFO: renamed from: Z2, reason: from getter */
                    public final List getF70950a() {
                        return this.f70949a;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof DefaultSorting) && Intrinsics.f(this.f70949a, ((DefaultSorting) obj2).f70949a);
                    }

                    public final int hashCode() {
                        return this.f70949a.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        Iterator itV = p.a.v(this.f70949a, dest);
                        while (itV.hasNext()) {
                            dest.writeSerializable((Serializable) itV.next());
                        }
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPickerDestination$InputData$Currencies$Sorted;", "Lcom/revolut/feature/crypto/remittance/api/navigation/CryptoRemittanceKompotFeatureConfig$CurrencyPickerDestination$InputData$Currencies;", "", "toString", "()Ljava/lang/String;", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Sorted implements Currencies {

                    @NotNull
                    public static final Parcelable.Creator<Sorted> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final List f70950a;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            int i = parcel.readInt();
                            ArrayList arrayList = new ArrayList(i);
                            int iC = 0;
                            while (iC != i) {
                                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                            }
                            return new Sorted(arrayList);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new Sorted[i];
                        }
                    }

                    public Sorted(List currencyList) {
                        Intrinsics.checkNotNullParameter(currencyList, "currencyList");
                        this.f70950a = currencyList;
                    }

                    @Override // com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies
                    /* JADX INFO: renamed from: Z2, reason: from getter */
                    public final List getF70950a() {
                        return this.f70950a;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof Sorted) && Intrinsics.f(this.f70950a, ((Sorted) obj2).f70950a);
                    }

                    public final int hashCode() {
                        return this.f70950a.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        Iterator itV = p.a.v(this.f70950a, dest);
                        while (itV.hasNext()) {
                            dest.writeSerializable((Serializable) itV.next());
                        }
                    }
                }

                /* JADX INFO: renamed from: Z2 */
                List getF70950a();
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Currencies currencies = (Currencies) parcel.readParcelable(InputData.class.getClassLoader());
                    Clause clause = (Clause) parcel.readParcelable(InputData.class.getClassLoader());
                    xi0.b bVar = (xi0.b) parcel.readSerializable();
                    CurrencyPicker.Entrypoint entrypoint = (CurrencyPicker.Entrypoint) parcel.readParcelable(InputData.class.getClassLoader());
                    pj5.a aVarValueOf = pj5.a.valueOf(parcel.readString());
                    Clause clause2 = (Clause) parcel.readParcelable(InputData.class.getClassLoader());
                    boolean z3 = false;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z3 = true;
                    } else {
                        z = false;
                    }
                    return new InputData(currencies, clause, bVar, entrypoint, aVarValueOf, clause2, z3, parcel.readInt() == 0 ? z : true);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InputData[i];
                }
            }

            public InputData(Currencies currencies, Clause title, xi0.b bVar, CurrencyPicker.Entrypoint entrypoint, pj5.a sortingType, Clause clause, boolean z, boolean z3) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
                Intrinsics.checkNotNullParameter(sortingType, "sortingType");
                this.f70944a = currencies;
                this.f70945b = title;
                this.f70946c = bVar;
                this.d = entrypoint;
                this.e = sortingType;
                this.f = clause;
                this.f70947g = z;
                this.f70948h = z3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof InputData)) {
                    return false;
                }
                InputData inputData = (InputData) obj2;
                return Intrinsics.f(this.f70944a, inputData.f70944a) && Intrinsics.f(this.f70945b, inputData.f70945b) && Intrinsics.f(this.f70946c, inputData.f70946c) && Intrinsics.f(this.d, inputData.d) && this.e == inputData.e && Intrinsics.f(this.f, inputData.f) && this.f70947g == inputData.f70947g && this.f70948h == inputData.f70948h;
            }

            public final int hashCode() {
                Currencies currencies = this.f70944a;
                int iA = p.a.a((currencies == null ? 0 : currencies.hashCode()) * 31, 31, this.f70945b);
                xi0.b bVar = this.f70946c;
                int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((iA + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31)) * 31;
                Clause clause = this.f;
                return Boolean.hashCode(this.f70948h) + j6.a.c((iHashCode + (clause != null ? clause.hashCode() : 0)) * 31, 31, this.f70947g);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f70944a, i);
                dest.writeParcelable(this.f70945b, i);
                dest.writeSerializable(this.f70946c);
                dest.writeParcelable(this.d, i);
                dest.writeString(this.e.name());
                dest.writeParcelable(this.f, i);
                dest.writeInt(this.f70947g ? 1 : 0);
                dest.writeInt(this.f70948h ? 1 : 0);
            }

            public /* synthetic */ InputData(Currencies currencies, TextLocalisedClause textLocalisedClause, CurrencyPicker.Entrypoint entrypoint, pj5.a aVar, TextLocalisedClause textLocalisedClause2, boolean z, boolean z3, int i) {
                this((i & 1) != 0 ? null : currencies, textLocalisedClause, (xi0.b) null, entrypoint, (i & 16) != 0 ? pj5.a.DEFAULT : aVar, (i & 32) != 0 ? null : textLocalisedClause2, (i & 64) != 0 ? false : z, (i & 128) != 0 ? true : z3);
            }
        }
    }
}
