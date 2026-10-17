package com.revolut.shared.feature.wealth.models.trading_accounts;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:8\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u00017=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrs¨\u0006t"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "GiaUSStocks", "GiaEUStocks", "GiaGBStocks", "GiaEUEtfs", "GiaUKEtfs", "GiaGBEtfs", "GiaUSEtfs", "GiaUSStockOptions", "GiaUSEtfOptions", "EUComplexEtfs", "GBComplexEtfs", "EUEtcs", "GBEtcs", "EUEtns", "GBEtns", "EUCryptoEtns", "GBCryptoEtns", "GiaEUBonds", "GiaUSBonds", "GiaGBUSBonds", "GiaGBEUBonds", "GiaGBBonds", "GiaEUComplexBonds", "GiaUSComplexBonds", "GiaUSStructuredNotes", "GiaEUStructuredNotes", "GiaGBStructuredNotes", "StockLendingUS", "GiaSecurityLending", "ExtendedHoursUS", "PrivateEquityEUFunds", "PrivateEquityUSFunds", "PrivateEquityCHFunds", "PrivateEquityGBFunds", "PrivateBankEUFunds", "PrivateBankUSFunds", "PrivateBankCHFunds", "PrivateBankGBFunds", "PrivateEquityEUCleanFunds", "PrivateBankEUCleanFunds", "RoboUS", "RoboEU", "RoboGB", "RoboSG", "CfdEU", "IsaGB", "JIsaGB", "PeaFr", "GiaAutoTopUp", "AutoTopUp", "MoneyMarketFundEu", "GiaMarginTrading", "MutualUSFunds", "MutualEUFunds", "Unknown", "a", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$AutoTopUp;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$CfdEU;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$EUComplexEtfs;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$EUCryptoEtns;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$EUEtcs;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$EUEtns;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$ExtendedHoursUS;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GBComplexEtfs;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GBCryptoEtns;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GBEtcs;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GBEtns;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaAutoTopUp;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaEUBonds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaEUComplexBonds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaEUEtfs;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaEUStocks;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaEUStructuredNotes;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaGBBonds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaGBEUBonds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaGBEtfs;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaGBStocks;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaGBStructuredNotes;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaGBUSBonds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaMarginTrading;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaSecurityLending;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaUKEtfs;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaUSBonds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaUSComplexBonds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaUSEtfOptions;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaUSEtfs;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaUSStockOptions;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaUSStocks;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaUSStructuredNotes;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$IsaGB;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$JIsaGB;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$MoneyMarketFundEu;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$MutualEUFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$MutualUSFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PeaFr;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateBankCHFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateBankEUCleanFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateBankEUFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateBankGBFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateBankUSFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateEquityCHFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateEquityEUCleanFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateEquityEUFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateEquityGBFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateEquityUSFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$RoboEU;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$RoboGB;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$RoboSG;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$RoboUS;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$StockLendingUS;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$Unknown;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TradingProductCode implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$AutoTopUp;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AutoTopUp extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AutoTopUp f105283a = new AutoTopUp();

        @NotNull
        public static final Parcelable.Creator<AutoTopUp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AutoTopUp.f105283a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoTopUp[i];
            }
        }

        private AutoTopUp() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "AUTO_TOPUP";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$CfdEU;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CfdEU extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CfdEU f105284a = new CfdEU();

        @NotNull
        public static final Parcelable.Creator<CfdEU> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CfdEU.f105284a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CfdEU[i];
            }
        }

        private CfdEU() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "CFD_EU";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$EUComplexEtfs;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EUComplexEtfs extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EUComplexEtfs f105285a = new EUComplexEtfs();

        @NotNull
        public static final Parcelable.Creator<EUComplexEtfs> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EUComplexEtfs.f105285a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EUComplexEtfs[i];
            }
        }

        private EUComplexEtfs() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "EU_COMPLEX_ETFS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$EUCryptoEtns;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EUCryptoEtns extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EUCryptoEtns f105286a = new EUCryptoEtns();

        @NotNull
        public static final Parcelable.Creator<EUCryptoEtns> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EUCryptoEtns.f105286a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EUCryptoEtns[i];
            }
        }

        private EUCryptoEtns() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "EU_CRYPTO_ETNS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$EUEtcs;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EUEtcs extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EUEtcs f105287a = new EUEtcs();

        @NotNull
        public static final Parcelable.Creator<EUEtcs> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EUEtcs.f105287a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EUEtcs[i];
            }
        }

        private EUEtcs() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "EU_ETCS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$EUEtns;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EUEtns extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EUEtns f105288a = new EUEtns();

        @NotNull
        public static final Parcelable.Creator<EUEtns> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EUEtns.f105288a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EUEtns[i];
            }
        }

        private EUEtns() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "EU_ETNS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$ExtendedHoursUS;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExtendedHoursUS extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExtendedHoursUS f105289a = new ExtendedHoursUS();

        @NotNull
        public static final Parcelable.Creator<ExtendedHoursUS> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExtendedHoursUS.f105289a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExtendedHoursUS[i];
            }
        }

        private ExtendedHoursUS() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "EXTENDED_HOURS_US";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GBComplexEtfs;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GBComplexEtfs extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GBComplexEtfs f105290a = new GBComplexEtfs();

        @NotNull
        public static final Parcelable.Creator<GBComplexEtfs> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GBComplexEtfs.f105290a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GBComplexEtfs[i];
            }
        }

        private GBComplexEtfs() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GB_COMPLEX_ETFS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GBCryptoEtns;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GBCryptoEtns extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GBCryptoEtns f105291a = new GBCryptoEtns();

        @NotNull
        public static final Parcelable.Creator<GBCryptoEtns> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GBCryptoEtns.f105291a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GBCryptoEtns[i];
            }
        }

        private GBCryptoEtns() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GB_CRYPTO_ETNS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GBEtcs;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GBEtcs extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GBEtcs f105292a = new GBEtcs();

        @NotNull
        public static final Parcelable.Creator<GBEtcs> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GBEtcs.f105292a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GBEtcs[i];
            }
        }

        private GBEtcs() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GB_ETCS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GBEtns;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GBEtns extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GBEtns f105293a = new GBEtns();

        @NotNull
        public static final Parcelable.Creator<GBEtns> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GBEtns.f105293a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GBEtns[i];
            }
        }

        private GBEtns() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GB_ETNS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaAutoTopUp;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @yhm.d
    public static final class GiaAutoTopUp extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaAutoTopUp f105294a = new GiaAutoTopUp();

        @NotNull
        public static final Parcelable.Creator<GiaAutoTopUp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaAutoTopUp.f105294a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaAutoTopUp[i];
            }
        }

        private GiaAutoTopUp() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_AUTO_TOPUP";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaEUBonds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaEUBonds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaEUBonds f105295a = new GiaEUBonds();

        @NotNull
        public static final Parcelable.Creator<GiaEUBonds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaEUBonds.f105295a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaEUBonds[i];
            }
        }

        private GiaEUBonds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_EU_BONDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaEUComplexBonds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaEUComplexBonds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaEUComplexBonds f105296a = new GiaEUComplexBonds();

        @NotNull
        public static final Parcelable.Creator<GiaEUComplexBonds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaEUComplexBonds.f105296a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaEUComplexBonds[i];
            }
        }

        private GiaEUComplexBonds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_EU_COMPLEX_BONDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaEUEtfs;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaEUEtfs extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaEUEtfs f105297a = new GiaEUEtfs();

        @NotNull
        public static final Parcelable.Creator<GiaEUEtfs> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaEUEtfs.f105297a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaEUEtfs[i];
            }
        }

        private GiaEUEtfs() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_EU_ETFS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaEUStocks;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaEUStocks extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaEUStocks f105298a = new GiaEUStocks();

        @NotNull
        public static final Parcelable.Creator<GiaEUStocks> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaEUStocks.f105298a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaEUStocks[i];
            }
        }

        private GiaEUStocks() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_EU_STOCKS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaEUStructuredNotes;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaEUStructuredNotes extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaEUStructuredNotes f105299a = new GiaEUStructuredNotes();

        @NotNull
        public static final Parcelable.Creator<GiaEUStructuredNotes> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaEUStructuredNotes.f105299a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaEUStructuredNotes[i];
            }
        }

        private GiaEUStructuredNotes() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_EU_STRUCTURED_NOTES";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaGBBonds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaGBBonds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaGBBonds f105300a = new GiaGBBonds();

        @NotNull
        public static final Parcelable.Creator<GiaGBBonds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaGBBonds.f105300a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaGBBonds[i];
            }
        }

        private GiaGBBonds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_GB_BONDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaGBEUBonds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaGBEUBonds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaGBEUBonds f105301a = new GiaGBEUBonds();

        @NotNull
        public static final Parcelable.Creator<GiaGBEUBonds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaGBEUBonds.f105301a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaGBEUBonds[i];
            }
        }

        private GiaGBEUBonds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_GB_EU_BONDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaGBEtfs;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaGBEtfs extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaGBEtfs f105302a = new GiaGBEtfs();

        @NotNull
        public static final Parcelable.Creator<GiaGBEtfs> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaGBEtfs.f105302a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaGBEtfs[i];
            }
        }

        private GiaGBEtfs() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_GB_ETFS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaGBStocks;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaGBStocks extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaGBStocks f105303a = new GiaGBStocks();

        @NotNull
        public static final Parcelable.Creator<GiaGBStocks> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaGBStocks.f105303a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaGBStocks[i];
            }
        }

        private GiaGBStocks() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_GB_STOCKS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaGBStructuredNotes;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaGBStructuredNotes extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaGBStructuredNotes f105304a = new GiaGBStructuredNotes();

        @NotNull
        public static final Parcelable.Creator<GiaGBStructuredNotes> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaGBStructuredNotes.f105304a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaGBStructuredNotes[i];
            }
        }

        private GiaGBStructuredNotes() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_GB_STRUCTURED_NOTES";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaGBUSBonds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaGBUSBonds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaGBUSBonds f105305a = new GiaGBUSBonds();

        @NotNull
        public static final Parcelable.Creator<GiaGBUSBonds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaGBUSBonds.f105305a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaGBUSBonds[i];
            }
        }

        private GiaGBUSBonds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_GB_US_BONDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaMarginTrading;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaMarginTrading extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaMarginTrading f105306a = new GiaMarginTrading();

        @NotNull
        public static final Parcelable.Creator<GiaMarginTrading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaMarginTrading.f105306a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaMarginTrading[i];
            }
        }

        private GiaMarginTrading() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_MARGIN_TRADING";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaSecurityLending;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaSecurityLending extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaSecurityLending f105307a = new GiaSecurityLending();

        @NotNull
        public static final Parcelable.Creator<GiaSecurityLending> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaSecurityLending.f105307a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaSecurityLending[i];
            }
        }

        private GiaSecurityLending() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_SECURITY_LENDING";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaUKEtfs;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaUKEtfs extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaUKEtfs f105308a = new GiaUKEtfs();

        @NotNull
        public static final Parcelable.Creator<GiaUKEtfs> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaUKEtfs.f105308a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaUKEtfs[i];
            }
        }

        private GiaUKEtfs() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_UK_ETFS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaUSBonds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaUSBonds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaUSBonds f105309a = new GiaUSBonds();

        @NotNull
        public static final Parcelable.Creator<GiaUSBonds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaUSBonds.f105309a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaUSBonds[i];
            }
        }

        private GiaUSBonds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_US_BONDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaUSComplexBonds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaUSComplexBonds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaUSComplexBonds f105310a = new GiaUSComplexBonds();

        @NotNull
        public static final Parcelable.Creator<GiaUSComplexBonds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaUSComplexBonds.f105310a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaUSComplexBonds[i];
            }
        }

        private GiaUSComplexBonds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_US_COMPLEX_BONDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaUSEtfOptions;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaUSEtfOptions extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaUSEtfOptions f105311a = new GiaUSEtfOptions();

        @NotNull
        public static final Parcelable.Creator<GiaUSEtfOptions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaUSEtfOptions.f105311a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaUSEtfOptions[i];
            }
        }

        private GiaUSEtfOptions() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_US_ETF_OPTIONS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaUSEtfs;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaUSEtfs extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaUSEtfs f105312a = new GiaUSEtfs();

        @NotNull
        public static final Parcelable.Creator<GiaUSEtfs> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaUSEtfs.f105312a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaUSEtfs[i];
            }
        }

        private GiaUSEtfs() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_US_ETFS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaUSStockOptions;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaUSStockOptions extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaUSStockOptions f105313a = new GiaUSStockOptions();

        @NotNull
        public static final Parcelable.Creator<GiaUSStockOptions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaUSStockOptions.f105313a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaUSStockOptions[i];
            }
        }

        private GiaUSStockOptions() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_US_STOCK_OPTIONS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaUSStocks;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaUSStocks extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaUSStocks f105314a = new GiaUSStocks();

        @NotNull
        public static final Parcelable.Creator<GiaUSStocks> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaUSStocks.f105314a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaUSStocks[i];
            }
        }

        private GiaUSStocks() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_US_STOCKS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$GiaUSStructuredNotes;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GiaUSStructuredNotes extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GiaUSStructuredNotes f105315a = new GiaUSStructuredNotes();

        @NotNull
        public static final Parcelable.Creator<GiaUSStructuredNotes> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GiaUSStructuredNotes.f105315a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiaUSStructuredNotes[i];
            }
        }

        private GiaUSStructuredNotes() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GIA_US_STRUCTURED_NOTES";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$IsaGB;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IsaGB extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IsaGB f105316a = new IsaGB();

        @NotNull
        public static final Parcelable.Creator<IsaGB> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IsaGB.f105316a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IsaGB[i];
            }
        }

        private IsaGB() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GB_ISA";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$JIsaGB;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class JIsaGB extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final JIsaGB f105317a = new JIsaGB();

        @NotNull
        public static final Parcelable.Creator<JIsaGB> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return JIsaGB.f105317a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JIsaGB[i];
            }
        }

        private JIsaGB() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "GB_JISA";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$MoneyMarketFundEu;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoneyMarketFundEu extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MoneyMarketFundEu f105318a = new MoneyMarketFundEu();

        @NotNull
        public static final Parcelable.Creator<MoneyMarketFundEu> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoneyMarketFundEu.f105318a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoneyMarketFundEu[i];
            }
        }

        private MoneyMarketFundEu() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "MMF_EU";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$MutualEUFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MutualEUFunds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MutualEUFunds f105319a = new MutualEUFunds();

        @NotNull
        public static final Parcelable.Creator<MutualEUFunds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MutualEUFunds.f105319a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MutualEUFunds[i];
            }
        }

        private MutualEUFunds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "MUTUAL_EU_FUNDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$MutualUSFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MutualUSFunds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MutualUSFunds f105320a = new MutualUSFunds();

        @NotNull
        public static final Parcelable.Creator<MutualUSFunds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MutualUSFunds.f105320a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MutualUSFunds[i];
            }
        }

        private MutualUSFunds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "MUTUAL_US_FUNDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PeaFr;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PeaFr extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PeaFr f105321a = new PeaFr();

        @NotNull
        public static final Parcelable.Creator<PeaFr> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PeaFr.f105321a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PeaFr[i];
            }
        }

        private PeaFr() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "FR_PEA";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateBankCHFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrivateBankCHFunds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrivateBankCHFunds f105322a = new PrivateBankCHFunds();

        @NotNull
        public static final Parcelable.Creator<PrivateBankCHFunds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrivateBankCHFunds.f105322a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrivateBankCHFunds[i];
            }
        }

        private PrivateBankCHFunds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "PRIVATE_BANK_CH_FUNDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateBankEUCleanFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrivateBankEUCleanFunds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrivateBankEUCleanFunds f105323a = new PrivateBankEUCleanFunds();

        @NotNull
        public static final Parcelable.Creator<PrivateBankEUCleanFunds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrivateBankEUCleanFunds.f105323a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrivateBankEUCleanFunds[i];
            }
        }

        private PrivateBankEUCleanFunds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "PRIVATE_BANK_EU_CLEAN_FUNDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateBankEUFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrivateBankEUFunds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrivateBankEUFunds f105324a = new PrivateBankEUFunds();

        @NotNull
        public static final Parcelable.Creator<PrivateBankEUFunds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrivateBankEUFunds.f105324a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrivateBankEUFunds[i];
            }
        }

        private PrivateBankEUFunds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "PRIVATE_BANK_EU_FUNDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateBankGBFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrivateBankGBFunds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrivateBankGBFunds f105325a = new PrivateBankGBFunds();

        @NotNull
        public static final Parcelable.Creator<PrivateBankGBFunds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrivateBankGBFunds.f105325a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrivateBankGBFunds[i];
            }
        }

        private PrivateBankGBFunds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "PRIVATE_BANK_GB_FUNDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateBankUSFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrivateBankUSFunds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrivateBankUSFunds f105326a = new PrivateBankUSFunds();

        @NotNull
        public static final Parcelable.Creator<PrivateBankUSFunds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrivateBankUSFunds.f105326a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrivateBankUSFunds[i];
            }
        }

        private PrivateBankUSFunds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "PRIVATE_BANK_US_FUNDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateEquityCHFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrivateEquityCHFunds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrivateEquityCHFunds f105327a = new PrivateEquityCHFunds();

        @NotNull
        public static final Parcelable.Creator<PrivateEquityCHFunds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrivateEquityCHFunds.f105327a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrivateEquityCHFunds[i];
            }
        }

        private PrivateEquityCHFunds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "PRIVATE_EQUITY_CH_FUNDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateEquityEUCleanFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrivateEquityEUCleanFunds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrivateEquityEUCleanFunds f105328a = new PrivateEquityEUCleanFunds();

        @NotNull
        public static final Parcelable.Creator<PrivateEquityEUCleanFunds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrivateEquityEUCleanFunds.f105328a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrivateEquityEUCleanFunds[i];
            }
        }

        private PrivateEquityEUCleanFunds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "PRIVATE_EQUITY_EU_CLEAN_FUNDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateEquityEUFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrivateEquityEUFunds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrivateEquityEUFunds f105329a = new PrivateEquityEUFunds();

        @NotNull
        public static final Parcelable.Creator<PrivateEquityEUFunds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrivateEquityEUFunds.f105329a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrivateEquityEUFunds[i];
            }
        }

        private PrivateEquityEUFunds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "PRIVATE_EQUITY_EU_FUNDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateEquityGBFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrivateEquityGBFunds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrivateEquityGBFunds f105330a = new PrivateEquityGBFunds();

        @NotNull
        public static final Parcelable.Creator<PrivateEquityGBFunds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrivateEquityGBFunds.f105330a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrivateEquityGBFunds[i];
            }
        }

        private PrivateEquityGBFunds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "PRIVATE_EQUITY_GB_FUNDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$PrivateEquityUSFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrivateEquityUSFunds extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PrivateEquityUSFunds f105331a = new PrivateEquityUSFunds();

        @NotNull
        public static final Parcelable.Creator<PrivateEquityUSFunds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrivateEquityUSFunds.f105331a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrivateEquityUSFunds[i];
            }
        }

        private PrivateEquityUSFunds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "PRIVATE_EQUITY_US_FUNDS";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$RoboEU;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RoboEU extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RoboEU f105332a = new RoboEU();

        @NotNull
        public static final Parcelable.Creator<RoboEU> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RoboEU.f105332a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoboEU[i];
            }
        }

        private RoboEU() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "ROBO_EU";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$RoboGB;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RoboGB extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RoboGB f105333a = new RoboGB();

        @NotNull
        public static final Parcelable.Creator<RoboGB> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RoboGB.f105333a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoboGB[i];
            }
        }

        private RoboGB() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "ROBO_GB";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$RoboSG;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RoboSG extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RoboSG f105334a = new RoboSG();

        @NotNull
        public static final Parcelable.Creator<RoboSG> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RoboSG.f105334a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoboSG[i];
            }
        }

        private RoboSG() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "ROBO_SG";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$RoboUS;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RoboUS extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RoboUS f105335a = new RoboUS();

        @NotNull
        public static final Parcelable.Creator<RoboUS> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RoboUS.f105335a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoboUS[i];
            }
        }

        private RoboUS() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "ROBO_US";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$StockLendingUS;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StockLendingUS extends TradingProductCode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StockLendingUS f105336a = new StockLendingUS();

        @NotNull
        public static final Parcelable.Creator<StockLendingUS> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StockLendingUS.f105336a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StockLendingUS[i];
            }
        }

        private StockLendingUS() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName */
        public final String getF105337a() {
            return "STOCK_LENDING_US";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode$Unknown;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingProductCode;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unknown extends TradingProductCode {

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105337a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Unknown(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        public Unknown(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f105337a = name;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Unknown) && Intrinsics.f(this.f105337a, ((Unknown) obj2).f105337a);
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF105337a() {
            return this.f105337a;
        }

        public final int hashCode() {
            return this.f105337a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105337a);
        }
    }

    private TradingProductCode() {
    }

    /* JADX INFO: renamed from: getName */
    public abstract String getF105337a();
}
