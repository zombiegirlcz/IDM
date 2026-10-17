package com.revolut.shared.feature.wealth.models.trading_accounts;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType;", "Landroid/os/Parcelable;", "Companion", "Gia", "Robo", "Margin", "MoneyMarketFunds", "Taa", "PaperTrading", "Unknown", "a", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType$Gia;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType$Margin;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType$MoneyMarketFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType$PaperTrading;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType$Robo;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType$Taa;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType$Unknown;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingAccountType extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f105277a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType$Gia;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Gia implements TradingAccountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Gia f105270a = new Gia();

        @NotNull
        public static final Parcelable.Creator<Gia> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Gia.f105270a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gia[i];
            }
        }

        private Gia() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType
        public final String getLabel() {
            return "GIA";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType$Margin;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Margin implements TradingAccountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Margin f105271a = new Margin();

        @NotNull
        public static final Parcelable.Creator<Margin> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Margin.f105271a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Margin[i];
            }
        }

        private Margin() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType
        public final String getLabel() {
            return "MARGIN";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType$MoneyMarketFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoneyMarketFunds implements TradingAccountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MoneyMarketFunds f105272a = new MoneyMarketFunds();

        @NotNull
        public static final Parcelable.Creator<MoneyMarketFunds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoneyMarketFunds.f105272a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoneyMarketFunds[i];
            }
        }

        private MoneyMarketFunds() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType
        public final String getLabel() {
            return "MMF";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType$PaperTrading;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaperTrading implements TradingAccountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaperTrading f105273a = new PaperTrading();

        @NotNull
        public static final Parcelable.Creator<PaperTrading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaperTrading.f105273a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaperTrading[i];
            }
        }

        private PaperTrading() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType
        public final String getLabel() {
            return "PAPER_TRADING";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType$Robo;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Robo implements TradingAccountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Robo f105274a = new Robo();

        @NotNull
        public static final Parcelable.Creator<Robo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Robo.f105274a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Robo[i];
            }
        }

        private Robo() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType
        public final String getLabel() {
            return "ROBO";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType$Taa;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Taa implements TradingAccountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Taa f105275a = new Taa();

        @NotNull
        public static final Parcelable.Creator<Taa> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Taa.f105275a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Taa[i];
            }
        }

        private Taa() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType
        public final String getLabel() {
            return "TAX_ADVANTAGED";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType$Unknown;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountType;", "<init>", "()V", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unknown implements TradingAccountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f105276a = new Unknown();

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.f105276a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        private Unknown() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType
        public final String getLabel() {
            r6.b.D("Label for TradingAccountType Unknown requested.");
            return "Unknown";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f105277a = new Companion();

        private Companion() {
        }
    }

    String getLabel();
}
