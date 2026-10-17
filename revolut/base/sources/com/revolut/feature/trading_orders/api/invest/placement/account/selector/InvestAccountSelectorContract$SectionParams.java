package com.revolut.feature.trading_orders.api.invest.placement.account.selector;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import fdf.b;
import h30.l;
import ip0.v7;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"com/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams", "Landroid/os/Parcelable;", "<init>", "()V", "InvestSectionParams", "MainAccountSectionParams", "CommoditySectionParams", "fdf/b", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$CommoditySectionParams;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$InvestSectionParams;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$MainAccountSectionParams;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InvestAccountSelectorContract$SectionParams implements Parcelable {
    private InvestAccountSelectorContract$SectionParams() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$CommoditySectionParams;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CommoditySectionParams extends InvestAccountSelectorContract$SectionParams {

        @NotNull
        public static final Parcelable.Creator<CommoditySectionParams> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f91716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f91717b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                    int iD = 0;
                    while (iD != i) {
                        iD = v7.d(parcel, linkedHashSet2, iD, 1);
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new CommoditySectionParams(linkedHashSet, b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CommoditySectionParams[i];
            }
        }

        public CommoditySectionParams(Set set, b balanceFilter) {
            Intrinsics.checkNotNullParameter(balanceFilter, "balanceFilter");
            this.f91716a = set;
            this.f91717b = balanceFilter;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CommoditySectionParams)) {
                return false;
            }
            CommoditySectionParams commoditySectionParams = (CommoditySectionParams) obj2;
            return Intrinsics.f(this.f91716a, commoditySectionParams.f91716a) && this.f91717b == commoditySectionParams.f91717b;
        }

        public final int hashCode() {
            Set set = this.f91716a;
            return this.f91717b.hashCode() + ((set == null ? 0 : set.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Set set = this.f91716a;
            if (set == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = e.q(dest, 1, set);
                while (itQ.hasNext()) {
                    dest.writeSerializable((Serializable) itQ.next());
                }
            }
            dest.writeString(this.f91717b.name());
        }

        public CommoditySectionParams() {
            this(null, b.ONLY_POSITIVE);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$MainAccountSectionParams;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams;", "", "toString", "()Ljava/lang/String;", "BaseCurrency", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MainAccountSectionParams extends InvestAccountSelectorContract$SectionParams {

        @NotNull
        public static final Parcelable.Creator<MainAccountSectionParams> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseCurrency f91725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f91726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f91727c;
        public final boolean d;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$MainAccountSectionParams$BaseCurrency;", "Landroid/os/Parcelable;", "<init>", "()V", "InstrumentCurrency", "PersonalAccountBaseCurrency", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$MainAccountSectionParams$BaseCurrency$InstrumentCurrency;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$MainAccountSectionParams$BaseCurrency$PersonalAccountBaseCurrency;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class BaseCurrency implements Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$MainAccountSectionParams$BaseCurrency$InstrumentCurrency;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$MainAccountSectionParams$BaseCurrency;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class InstrumentCurrency extends BaseCurrency {

                @NotNull
                public static final Parcelable.Creator<InstrumentCurrency> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f91728a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new InstrumentCurrency(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new InstrumentCurrency[i];
                    }
                }

                public InstrumentCurrency(String securityRef) {
                    Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                    this.f91728a = securityRef;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof InstrumentCurrency) && Intrinsics.f(this.f91728a, ((InstrumentCurrency) obj2).f91728a);
                }

                public final int hashCode() {
                    return this.f91728a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f91728a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$MainAccountSectionParams$BaseCurrency$PersonalAccountBaseCurrency;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$MainAccountSectionParams$BaseCurrency;", "<init>", "()V", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class PersonalAccountBaseCurrency extends BaseCurrency {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final PersonalAccountBaseCurrency f91729a = new PersonalAccountBaseCurrency();

                @NotNull
                public static final Parcelable.Creator<PersonalAccountBaseCurrency> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return PersonalAccountBaseCurrency.f91729a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new PersonalAccountBaseCurrency[i];
                    }
                }

                private PersonalAccountBaseCurrency() {
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

            private BaseCurrency() {
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                BaseCurrency baseCurrency = (BaseCurrency) j6.a.f(parcel, "parcel", MainAccountSectionParams.class);
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                    int iD = 0;
                    while (iD != i) {
                        iD = v7.d(parcel, linkedHashSet2, iD, 1);
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new MainAccountSectionParams(baseCurrency, linkedHashSet, b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MainAccountSectionParams[i];
            }
        }

        public MainAccountSectionParams(BaseCurrency baseCurrency, Set set, b balanceFilter, boolean z) {
            Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
            Intrinsics.checkNotNullParameter(balanceFilter, "balanceFilter");
            this.f91725a = baseCurrency;
            this.f91726b = set;
            this.f91727c = balanceFilter;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MainAccountSectionParams)) {
                return false;
            }
            MainAccountSectionParams mainAccountSectionParams = (MainAccountSectionParams) obj2;
            return Intrinsics.f(this.f91725a, mainAccountSectionParams.f91725a) && Intrinsics.f(this.f91726b, mainAccountSectionParams.f91726b) && this.f91727c == mainAccountSectionParams.f91727c && this.d == mainAccountSectionParams.d;
        }

        public final int hashCode() {
            int iHashCode = this.f91725a.hashCode() * 31;
            Set set = this.f91726b;
            return Boolean.hashCode(this.d) + ((this.f91727c.hashCode() + ((iHashCode + (set == null ? 0 : set.hashCode())) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91725a, i);
            Set set = this.f91726b;
            if (set == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = e.q(dest, 1, set);
                while (itQ.hasNext()) {
                    dest.writeSerializable((Serializable) itQ.next());
                }
            }
            dest.writeString(this.f91727c.name());
            dest.writeInt(this.d ? 1 : 0);
        }

        public /* synthetic */ MainAccountSectionParams(Set set, b bVar) {
            this(BaseCurrency.PersonalAccountBaseCurrency.f91729a, set, bVar, false);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$InvestSectionParams;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams;", "", "toString", "()Ljava/lang/String;", "HoldingsDisplayConfiguration", "TradingAccountConfiguration", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvestSectionParams extends InvestAccountSelectorContract$SectionParams {

        @NotNull
        public static final Parcelable.Creator<InvestSectionParams> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HoldingsDisplayConfiguration f91718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f91719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TradingAccountConfiguration f91720c;
        public final Set d;
        public final b e;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$InvestSectionParams$HoldingsDisplayConfiguration;", "Landroid/os/Parcelable;", "<init>", "()V", "HoldingWithInstrumentCurrency", "AllHoldings", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$InvestSectionParams$HoldingsDisplayConfiguration$AllHoldings;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$InvestSectionParams$HoldingsDisplayConfiguration$HoldingWithInstrumentCurrency;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class HoldingsDisplayConfiguration implements Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$InvestSectionParams$HoldingsDisplayConfiguration$AllHoldings;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$InvestSectionParams$HoldingsDisplayConfiguration;", "<init>", "()V", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class AllHoldings extends HoldingsDisplayConfiguration {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final AllHoldings f91721a = new AllHoldings();

                @NotNull
                public static final Parcelable.Creator<AllHoldings> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return AllHoldings.f91721a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new AllHoldings[i];
                    }
                }

                private AllHoldings() {
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

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$InvestSectionParams$HoldingsDisplayConfiguration$HoldingWithInstrumentCurrency;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$InvestSectionParams$HoldingsDisplayConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class HoldingWithInstrumentCurrency extends HoldingsDisplayConfiguration {

                @NotNull
                public static final Parcelable.Creator<HoldingWithInstrumentCurrency> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f91722a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new HoldingWithInstrumentCurrency(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new HoldingWithInstrumentCurrency[i];
                    }
                }

                public HoldingWithInstrumentCurrency(String securityRef) {
                    Intrinsics.checkNotNullParameter(securityRef, "securityRef");
                    this.f91722a = securityRef;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof HoldingWithInstrumentCurrency) && Intrinsics.f(this.f91722a, ((HoldingWithInstrumentCurrency) obj2).f91722a);
                }

                public final int hashCode() {
                    return this.f91722a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f91722a);
                }
            }

            private HoldingsDisplayConfiguration() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$InvestSectionParams$TradingAccountConfiguration;", "Landroid/os/Parcelable;", "WithAccountType", "WithAccountId", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$InvestSectionParams$TradingAccountConfiguration$WithAccountId;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$InvestSectionParams$TradingAccountConfiguration$WithAccountType;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface TradingAccountConfiguration extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$InvestSectionParams$TradingAccountConfiguration$WithAccountId;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$InvestSectionParams$TradingAccountConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class WithAccountId implements TradingAccountConfiguration {

                @NotNull
                public static final Parcelable.Creator<WithAccountId> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UUID f91723a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new WithAccountId((UUID) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new WithAccountId[i];
                    }
                }

                public WithAccountId(UUID tradingAccountId) {
                    Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
                    this.f91723a = tradingAccountId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof WithAccountId) && Intrinsics.f(this.f91723a, ((WithAccountId) obj2).f91723a);
                }

                public final int hashCode() {
                    return this.f91723a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f91723a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$InvestSectionParams$TradingAccountConfiguration$WithAccountType;", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$SectionParams$InvestSectionParams$TradingAccountConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class WithAccountType implements TradingAccountConfiguration {

                @NotNull
                public static final Parcelable.Creator<WithAccountType> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TradingAccountType f91724a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new WithAccountType((TradingAccountType) parcel.readParcelable(WithAccountType.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new WithAccountType[i];
                    }
                }

                public WithAccountType(TradingAccountType accountType) {
                    Intrinsics.checkNotNullParameter(accountType, "accountType");
                    this.f91724a = accountType;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof WithAccountType) && Intrinsics.f(this.f91724a, ((WithAccountType) obj2).f91724a);
                }

                public final int hashCode() {
                    return this.f91724a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f91724a, i);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                HoldingsDisplayConfiguration holdingsDisplayConfiguration = (HoldingsDisplayConfiguration) j6.a.f(parcel, "parcel", InvestSectionParams.class);
                xi0.b bVar = (xi0.b) parcel.readSerializable();
                TradingAccountConfiguration tradingAccountConfiguration = (TradingAccountConfiguration) parcel.readParcelable(InvestSectionParams.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                    int iD = 0;
                    while (iD != i) {
                        iD = v7.d(parcel, linkedHashSet2, iD, 1);
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new InvestSectionParams(holdingsDisplayConfiguration, bVar, tradingAccountConfiguration, linkedHashSet, b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvestSectionParams[i];
            }
        }

        public InvestSectionParams(HoldingsDisplayConfiguration holdingsDisplayConfiguration, xi0.b baseCurrency, TradingAccountConfiguration tradingAccountConfiguration, Set set, b balanceFilter) {
            Intrinsics.checkNotNullParameter(holdingsDisplayConfiguration, "holdingsDisplayConfiguration");
            Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
            Intrinsics.checkNotNullParameter(tradingAccountConfiguration, "tradingAccountConfiguration");
            Intrinsics.checkNotNullParameter(balanceFilter, "balanceFilter");
            this.f91718a = holdingsDisplayConfiguration;
            this.f91719b = baseCurrency;
            this.f91720c = tradingAccountConfiguration;
            this.d = set;
            this.e = balanceFilter;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InvestSectionParams)) {
                return false;
            }
            InvestSectionParams investSectionParams = (InvestSectionParams) obj2;
            return Intrinsics.f(this.f91718a, investSectionParams.f91718a) && Intrinsics.f(this.f91719b, investSectionParams.f91719b) && Intrinsics.f(this.f91720c, investSectionParams.f91720c) && Intrinsics.f(this.d, investSectionParams.d) && this.e == investSectionParams.e;
        }

        public final int hashCode() {
            int iHashCode = (this.f91720c.hashCode() + l.j(this.f91719b, this.f91718a.hashCode() * 31, 31)) * 31;
            Set set = this.d;
            return this.e.hashCode() + ((iHashCode + (set == null ? 0 : set.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91718a, i);
            dest.writeSerializable(this.f91719b);
            dest.writeParcelable(this.f91720c, i);
            Set set = this.d;
            if (set == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = e.q(dest, 1, set);
                while (itQ.hasNext()) {
                    dest.writeSerializable((Serializable) itQ.next());
                }
            }
            dest.writeString(this.e.name());
        }

        public /* synthetic */ InvestSectionParams(xi0.b bVar, Set set, b bVar2) {
            this(HoldingsDisplayConfiguration.AllHoldings.f91721a, bVar, new TradingAccountConfiguration.WithAccountType(TradingAccountType.Gia.f105270a), set, bVar2);
        }
    }
}
