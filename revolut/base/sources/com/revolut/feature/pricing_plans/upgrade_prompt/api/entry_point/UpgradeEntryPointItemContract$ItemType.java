package com.revolut.feature.pricing_plans.upgrade_prompt.api.entry_point;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType", "Landroid/os/Parcelable;", "<init>", "()V", "Fees", "ReviewOrder", "Transaction", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Fees;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction;", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public abstract class UpgradeEntryPointItemContract$ItemType implements Parcelable {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Fees;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType;", "<init>", "()V", "Stocks", "Crypto", "Commodity", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Fees$Commodity;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Fees$Crypto;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Fees$Stocks;", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Fees extends UpgradeEntryPointItemContract$ItemType {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Fees$Commodity;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Fees;", "<init>", "()V", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Commodity extends Fees {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Commodity f80977a = new Commodity();

            @NotNull
            public static final Parcelable.Creator<Commodity> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Commodity.f80977a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Commodity[i];
                }
            }

            private Commodity() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Fees$Crypto;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Fees;", "<init>", "()V", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Crypto extends Fees {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Crypto f80978a = new Crypto();

            @NotNull
            public static final Parcelable.Creator<Crypto> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Crypto.f80978a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Crypto[i];
                }
            }

            private Crypto() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Fees$Stocks;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Fees;", "<init>", "()V", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Stocks extends Fees {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Stocks f80979a = new Stocks();

            @NotNull
            public static final Parcelable.Creator<Stocks> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Stocks.f80979a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Stocks[i];
                }
            }

            private Stocks() {
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

        private Fees() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType;", "<init>", "()V", "Stocks", "CryptoFeeTiering", "Commodity", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$Commodity;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$Stocks;", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ReviewOrder extends UpgradeEntryPointItemContract$ItemType {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$Commodity;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder;", "<init>", "()V", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Commodity extends ReviewOrder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Commodity f80980a = new Commodity();

            @NotNull
            public static final Parcelable.Creator<Commodity> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Commodity.f80980a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Commodity[i];
                }
            }

            private Commodity() {
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

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder;", "<init>", "()V", "Exchange", "Staking", "Transfer", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Staking;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Transfer;", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class CryptoFeeTiering extends ReviewOrder {

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering;", "MarketOrderExchange", "RecurringBuyExchange", "LimitOrderExchange", "StopOrderExchange", "TPSLExchange", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange$LimitOrderExchange;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange$MarketOrderExchange;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange$RecurringBuyExchange;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange$StopOrderExchange;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange$TPSLExchange;", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static abstract class Exchange extends CryptoFeeTiering {

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange$LimitOrderExchange;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class LimitOrderExchange extends Exchange {

                    @NotNull
                    public static final Parcelable.Creator<LimitOrderExchange> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final dj0.d f80981a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final boolean f80982b;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new LimitOrderExchange((dj0.d) parcel.readSerializable(), parcel.readInt() != 0);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new LimitOrderExchange[i];
                        }
                    }

                    public LimitOrderExchange(dj0.d transactionAmount, boolean z) {
                        Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
                        this.f80981a = transactionAmount;
                        this.f80982b = z;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof LimitOrderExchange)) {
                            return false;
                        }
                        LimitOrderExchange limitOrderExchange = (LimitOrderExchange) obj2;
                        return Intrinsics.f(this.f80981a, limitOrderExchange.f80981a) && this.f80982b == limitOrderExchange.f80982b;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.f80982b) + (this.f80981a.hashCode() * 31);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeSerializable(this.f80981a);
                        dest.writeInt(this.f80982b ? 1 : 0);
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange$MarketOrderExchange;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class MarketOrderExchange extends Exchange {

                    @NotNull
                    public static final Parcelable.Creator<MarketOrderExchange> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final dj0.d f80983a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final boolean f80984b;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new MarketOrderExchange((dj0.d) parcel.readSerializable(), parcel.readInt() != 0);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new MarketOrderExchange[i];
                        }
                    }

                    public MarketOrderExchange(dj0.d transactionAmount, boolean z) {
                        Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
                        this.f80983a = transactionAmount;
                        this.f80984b = z;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof MarketOrderExchange)) {
                            return false;
                        }
                        MarketOrderExchange marketOrderExchange = (MarketOrderExchange) obj2;
                        return Intrinsics.f(this.f80983a, marketOrderExchange.f80983a) && this.f80984b == marketOrderExchange.f80984b;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.f80984b) + (this.f80983a.hashCode() * 31);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeSerializable(this.f80983a);
                        dest.writeInt(this.f80984b ? 1 : 0);
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange$RecurringBuyExchange;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class RecurringBuyExchange extends Exchange {

                    @NotNull
                    public static final Parcelable.Creator<RecurringBuyExchange> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final dj0.d f80985a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final boolean f80986b;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new RecurringBuyExchange((dj0.d) parcel.readSerializable(), parcel.readInt() != 0);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new RecurringBuyExchange[i];
                        }
                    }

                    public RecurringBuyExchange(dj0.d transactionAmount, boolean z) {
                        Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
                        this.f80985a = transactionAmount;
                        this.f80986b = z;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof RecurringBuyExchange)) {
                            return false;
                        }
                        RecurringBuyExchange recurringBuyExchange = (RecurringBuyExchange) obj2;
                        return Intrinsics.f(this.f80985a, recurringBuyExchange.f80985a) && this.f80986b == recurringBuyExchange.f80986b;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.f80986b) + (this.f80985a.hashCode() * 31);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeSerializable(this.f80985a);
                        dest.writeInt(this.f80986b ? 1 : 0);
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange$StopOrderExchange;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class StopOrderExchange extends Exchange {

                    @NotNull
                    public static final Parcelable.Creator<StopOrderExchange> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final dj0.d f80987a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final boolean f80988b;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new StopOrderExchange((dj0.d) parcel.readSerializable(), parcel.readInt() != 0);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new StopOrderExchange[i];
                        }
                    }

                    public StopOrderExchange(dj0.d transactionAmount, boolean z) {
                        Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
                        this.f80987a = transactionAmount;
                        this.f80988b = z;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof StopOrderExchange)) {
                            return false;
                        }
                        StopOrderExchange stopOrderExchange = (StopOrderExchange) obj2;
                        return Intrinsics.f(this.f80987a, stopOrderExchange.f80987a) && this.f80988b == stopOrderExchange.f80988b;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.f80988b) + (this.f80987a.hashCode() * 31);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeSerializable(this.f80987a);
                        dest.writeInt(this.f80988b ? 1 : 0);
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange$TPSLExchange;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Exchange;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class TPSLExchange extends Exchange {

                    @NotNull
                    public static final Parcelable.Creator<TPSLExchange> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final dj0.d f80989a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final boolean f80990b;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new TPSLExchange((dj0.d) parcel.readSerializable(), parcel.readInt() != 0);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new TPSLExchange[i];
                        }
                    }

                    public TPSLExchange(dj0.d transactionAmount, boolean z) {
                        Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
                        this.f80989a = transactionAmount;
                        this.f80990b = z;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof TPSLExchange)) {
                            return false;
                        }
                        TPSLExchange tPSLExchange = (TPSLExchange) obj2;
                        return Intrinsics.f(this.f80989a, tPSLExchange.f80989a) && this.f80990b == tPSLExchange.f80990b;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.f80990b) + (this.f80989a.hashCode() * 31);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeSerializable(this.f80989a);
                        dest.writeInt(this.f80990b ? 1 : 0);
                    }
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Staking;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Staking extends CryptoFeeTiering {

                @NotNull
                public static final Parcelable.Creator<Staking> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final dj0.d f80991a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Staking((dj0.d) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Staking[i];
                    }
                }

                public Staking(dj0.d transactionAmount) {
                    Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
                    this.f80991a = transactionAmount;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Staking) && Intrinsics.f(this.f80991a, ((Staking) obj2).f80991a);
                }

                public final int hashCode() {
                    return this.f80991a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f80991a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering$Transfer;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$CryptoFeeTiering;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Transfer extends CryptoFeeTiering {

                @NotNull
                public static final Parcelable.Creator<Transfer> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final dj0.d f80992a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Transfer((dj0.d) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Transfer[i];
                    }
                }

                public Transfer(dj0.d transactionAmount) {
                    Intrinsics.checkNotNullParameter(transactionAmount, "transactionAmount");
                    this.f80992a = transactionAmount;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Transfer) && Intrinsics.f(this.f80992a, ((Transfer) obj2).f80992a);
                }

                public final int hashCode() {
                    return this.f80992a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f80992a);
                }
            }

            private CryptoFeeTiering() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder$Stocks;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$ReviewOrder;", "<init>", "()V", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Stocks extends ReviewOrder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Stocks f80993a = new Stocks();

            @NotNull
            public static final Parcelable.Creator<Stocks> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Stocks.f80993a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Stocks[i];
                }
            }

            private Stocks() {
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

        private ReviewOrder() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType;", "<init>", "()V", "Atm", "Stocks", "Crypto", "CryptoFeeTiering", "Exchange", "Commodity", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction$Atm;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction$Commodity;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction$Crypto;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction$CryptoFeeTiering;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction$Exchange;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction$Stocks;", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Transaction extends UpgradeEntryPointItemContract$ItemType {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction$Atm;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction;", "<init>", "()V", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Atm extends Transaction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Atm f80994a = new Atm();

            @NotNull
            public static final Parcelable.Creator<Atm> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Atm.f80994a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Atm[i];
                }
            }

            private Atm() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction$Commodity;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction;", "<init>", "()V", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Commodity extends Transaction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Commodity f80995a = new Commodity();

            @NotNull
            public static final Parcelable.Creator<Commodity> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Commodity.f80995a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Commodity[i];
                }
            }

            private Commodity() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction$Crypto;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction;", "<init>", "()V", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Crypto extends Transaction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Crypto f80996a = new Crypto();

            @NotNull
            public static final Parcelable.Creator<Crypto> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Crypto.f80996a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Crypto[i];
                }
            }

            private Crypto() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction$CryptoFeeTiering;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction;", "<init>", "()V", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class CryptoFeeTiering extends Transaction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final CryptoFeeTiering f80997a = new CryptoFeeTiering();

            @NotNull
            public static final Parcelable.Creator<CryptoFeeTiering> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CryptoFeeTiering.f80997a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CryptoFeeTiering[i];
                }
            }

            private CryptoFeeTiering() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction$Exchange;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction;", "<init>", "()V", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Exchange extends Transaction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Exchange f80998a = new Exchange();

            @NotNull
            public static final Parcelable.Creator<Exchange> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Exchange.f80998a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Exchange[i];
                }
            }

            private Exchange() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction$Stocks;", "Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/entry_point/UpgradeEntryPointItemContract$ItemType$Transaction;", "<init>", "()V", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Stocks extends Transaction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Stocks f80999a = new Stocks();

            @NotNull
            public static final Parcelable.Creator<Stocks> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Stocks.f80999a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Stocks[i];
                }
            }

            private Stocks() {
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

        private Transaction() {
        }
    }

    private UpgradeEntryPointItemContract$ItemType() {
    }
}
