package com.revolut.feature_exchange.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfigFinishBehavior;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.c;
import wd6.h;
import xi0.b;
import xi0.e;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Default", "Buy", "Sell", "RecurringBuy", "CryptoCommodityOnboarded", "Refresh", "FreelancerSell", "BuyInvest", "SellInvest", "s0i/a", "s0i/b", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$Buy;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$BuyInvest;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$CryptoCommodityOnboarded;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$Default;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$FreelancerSell;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$RecurringBuy;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$Refresh;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$Sell;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$SellInvest;", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public abstract class ExchangeFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$BuyInvest;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BuyInvest extends ExchangeFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<BuyInvest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f96837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f96838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f96839c;
        public final wd6.d d;
        public final boolean e;
        public final ExchangeFeatureConfigFinishBehavior f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BuyInvest((b) parcel.readSerializable(), (b) parcel.readSerializable(), c.valueOf(parcel.readString()), wd6.d.valueOf(parcel.readString()), parcel.readInt() != 0, (ExchangeFeatureConfigFinishBehavior) parcel.readParcelable(BuyInvest.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BuyInvest[i];
            }
        }

        public BuyInvest(b from, b to6, c currencyMode, wd6.d exchangeInvestInstrumentType, boolean z, ExchangeFeatureConfigFinishBehavior finishBehavior) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to6, "to");
            Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
            Intrinsics.checkNotNullParameter(exchangeInvestInstrumentType, "exchangeInvestInstrumentType");
            Intrinsics.checkNotNullParameter(finishBehavior, "finishBehavior");
            this.f96837a = from;
            this.f96838b = to6;
            this.f96839c = currencyMode;
            this.d = exchangeInvestInstrumentType;
            this.e = z;
            this.f = finishBehavior;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BuyInvest)) {
                return false;
            }
            BuyInvest buyInvest = (BuyInvest) obj2;
            return Intrinsics.f(this.f96837a, buyInvest.f96837a) && Intrinsics.f(this.f96838b, buyInvest.f96838b) && this.f96839c == buyInvest.f96839c && this.d == buyInvest.d && this.e == buyInvest.e && Intrinsics.f(this.f, buyInvest.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + j6.a.c((this.d.hashCode() + ((this.f96839c.hashCode() + l.j(this.f96838b, this.f96837a.hashCode() * 31, 31)) * 31)) * 31, 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96837a);
            dest.writeSerializable(this.f96838b);
            dest.writeString(this.f96839c.name());
            dest.writeString(this.d.name());
            dest.writeInt(this.e ? 1 : 0);
            dest.writeParcelable(this.f, i);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$CryptoCommodityOnboarded;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig;", "<init>", "()V", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CryptoCommodityOnboarded extends ExchangeFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CryptoCommodityOnboarded f96840a = new CryptoCommodityOnboarded();

        @NotNull
        public static final Parcelable.Creator<CryptoCommodityOnboarded> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CryptoCommodityOnboarded.f96840a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoCommodityOnboarded[i];
            }
        }

        private CryptoCommodityOnboarded() {
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

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$Default;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default extends ExchangeFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f96841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f96842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ExchangeFeatureConfigFinishBehavior f96843c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Default(h.valueOf(parcel.readString()), c.valueOf(parcel.readString()), (ExchangeFeatureConfigFinishBehavior) parcel.readParcelable(Default.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Default)) {
                return false;
            }
            Default r56 = (Default) obj2;
            return this.f96841a == r56.f96841a && this.f96842b == r56.f96842b && Intrinsics.f(this.f96843c, r56.f96843c);
        }

        public final int hashCode() {
            return this.f96843c.hashCode() + ((this.f96842b.hashCode() + (this.f96841a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96841a.name());
            dest.writeString(this.f96842b.name());
            dest.writeParcelable(this.f96843c, i);
        }

        public Default(h orderType, c currencyMode, ExchangeFeatureConfigFinishBehavior finishBehavior) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
            Intrinsics.checkNotNullParameter(finishBehavior, "finishBehavior");
            this.f96841a = orderType;
            this.f96842b = currencyMode;
            this.f96843c = finishBehavior;
        }

        public /* synthetic */ Default(int i) {
            this(h.MARKET, c.ALL, ExchangeFeatureConfigFinishBehavior.Default.f96860a);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$FreelancerSell;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FreelancerSell extends ExchangeFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<FreelancerSell> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f96844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExchangeFeatureConfigFinishBehavior f96845b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FreelancerSell((b) parcel.readSerializable(), (ExchangeFeatureConfigFinishBehavior) parcel.readParcelable(FreelancerSell.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FreelancerSell[i];
            }
        }

        public FreelancerSell(b from, ExchangeFeatureConfigFinishBehavior finishBehavior) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(finishBehavior, "finishBehavior");
            this.f96844a = from;
            this.f96845b = finishBehavior;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FreelancerSell)) {
                return false;
            }
            FreelancerSell freelancerSell = (FreelancerSell) obj2;
            return Intrinsics.f(this.f96844a, freelancerSell.f96844a) && Intrinsics.f(this.f96845b, freelancerSell.f96845b);
        }

        public final int hashCode() {
            return this.f96845b.hashCode() + (this.f96844a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96844a);
            dest.writeParcelable(this.f96845b, i);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$RecurringBuy;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurringBuy extends ExchangeFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<RecurringBuy> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f96846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f96847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ExchangeFeatureConfigFinishBehavior f96848c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurringBuy((b) parcel.readSerializable(), (b) parcel.readSerializable(), (ExchangeFeatureConfigFinishBehavior) parcel.readParcelable(RecurringBuy.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurringBuy[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RecurringBuy() {
            b bVar = null;
            this(bVar, bVar, 15);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RecurringBuy)) {
                return false;
            }
            RecurringBuy recurringBuy = (RecurringBuy) obj2;
            return Intrinsics.f(this.f96846a, recurringBuy.f96846a) && Intrinsics.f(this.f96847b, recurringBuy.f96847b) && Intrinsics.f(this.f96848c, recurringBuy.f96848c) && this.d == recurringBuy.d;
        }

        public final int hashCode() {
            b bVar = this.f96846a;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            b bVar2 = this.f96847b;
            return Boolean.hashCode(this.d) + ((this.f96848c.hashCode() + ((iHashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96846a);
            dest.writeSerializable(this.f96847b);
            dest.writeParcelable(this.f96848c, i);
            dest.writeInt(this.d ? 1 : 0);
        }

        public RecurringBuy(b bVar, b bVar2, ExchangeFeatureConfigFinishBehavior finishBehavior, boolean z) {
            Intrinsics.checkNotNullParameter(finishBehavior, "finishBehavior");
            this.f96846a = bVar;
            this.f96847b = bVar2;
            this.f96848c = finishBehavior;
            this.d = z;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ RecurringBuy(b bVar, b bVar2, int i) {
            ExchangeFeatureConfigFinishBehavior exchangeFeatureConfigFinishBehavior;
            bVar = (i & 1) != 0 ? null : bVar;
            bVar2 = (i & 2) != 0 ? null : bVar2;
            if ((i & 4) != 0) {
                exchangeFeatureConfigFinishBehavior = ExchangeFeatureConfigFinishBehavior.Default.f96860a;
            } else {
                exchangeFeatureConfigFinishBehavior = ExchangeFeatureConfigFinishBehavior.Finish.f96861a;
            }
            this(bVar, bVar2, exchangeFeatureConfigFinishBehavior, false);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$Refresh;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig;", "<init>", "()V", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Refresh extends ExchangeFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Refresh f96849a = new Refresh();

        @NotNull
        public static final Parcelable.Creator<Refresh> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Refresh.f96849a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Refresh[i];
            }
        }

        private Refresh() {
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

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$SellInvest;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SellInvest extends ExchangeFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<SellInvest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f96857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f96858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f96859c;
        public final wd6.d d;
        public final boolean e;
        public final ExchangeFeatureConfigFinishBehavior f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SellInvest((b) parcel.readSerializable(), (b) parcel.readSerializable(), c.valueOf(parcel.readString()), wd6.d.valueOf(parcel.readString()), parcel.readInt() != 0, (ExchangeFeatureConfigFinishBehavior) parcel.readParcelable(SellInvest.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SellInvest[i];
            }
        }

        public SellInvest(b from, b to6, c currencyMode, wd6.d exchangeInvestInstrumentType, boolean z, ExchangeFeatureConfigFinishBehavior finishBehavior) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to6, "to");
            Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
            Intrinsics.checkNotNullParameter(exchangeInvestInstrumentType, "exchangeInvestInstrumentType");
            Intrinsics.checkNotNullParameter(finishBehavior, "finishBehavior");
            this.f96857a = from;
            this.f96858b = to6;
            this.f96859c = currencyMode;
            this.d = exchangeInvestInstrumentType;
            this.e = z;
            this.f = finishBehavior;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SellInvest)) {
                return false;
            }
            SellInvest sellInvest = (SellInvest) obj2;
            return Intrinsics.f(this.f96857a, sellInvest.f96857a) && Intrinsics.f(this.f96858b, sellInvest.f96858b) && this.f96859c == sellInvest.f96859c && this.d == sellInvest.d && this.e == sellInvest.e && Intrinsics.f(this.f, sellInvest.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + j6.a.c((this.d.hashCode() + ((this.f96859c.hashCode() + l.j(this.f96858b, this.f96857a.hashCode() * 31, 31)) * 31)) * 31, 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96857a);
            dest.writeSerializable(this.f96858b);
            dest.writeString(this.f96859c.name());
            dest.writeString(this.d.name());
            dest.writeInt(this.e ? 1 : 0);
            dest.writeParcelable(this.f, i);
        }
    }

    private ExchangeFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$Buy;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig;", "Ls0i/b;", "", "toString", "()Ljava/lang/String;", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Buy extends ExchangeFeatureConfig implements s0i.b {

        @NotNull
        public static final Parcelable.Creator<Buy> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f96830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f96831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h f96832c;
        public final c d;
        public final ExchangeFeatureConfigFinishBehavior e;
        public final AccountId f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f96833g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Set f96834h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f96835j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final s0i.a f96836l;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                LinkedHashSet linkedHashSet;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                b bVar = (b) parcel.readSerializable();
                b bVar2 = (b) parcel.readSerializable();
                h hVarValueOf = h.valueOf(parcel.readString());
                c cVarValueOf = c.valueOf(parcel.readString());
                ExchangeFeatureConfigFinishBehavior exchangeFeatureConfigFinishBehavior = (ExchangeFeatureConfigFinishBehavior) parcel.readParcelable(Buy.class.getClassLoader());
                AccountId accountId = (AccountId) parcel.readParcelable(Buy.class.getClassLoader());
                boolean z3 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z3 = false;
                }
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet2.add(e.valueOf(parcel.readString()));
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new Buy(bVar, bVar2, hVarValueOf, cVarValueOf, exchangeFeatureConfigFinishBehavior, accountId, z3, linkedHashSet, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false, s0i.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Buy[i];
            }
        }

        public Buy(b bVar, b to6, h orderType, c currencyMode, ExchangeFeatureConfigFinishBehavior finishBehavior, AccountId accountId, boolean z, LinkedHashSet linkedHashSet, boolean z3, boolean z4, boolean z6, s0i.a entryPoint) {
            Intrinsics.checkNotNullParameter(to6, "to");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
            Intrinsics.checkNotNullParameter(finishBehavior, "finishBehavior");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.f96830a = bVar;
            this.f96831b = to6;
            this.f96832c = orderType;
            this.d = currencyMode;
            this.e = finishBehavior;
            this.f = accountId;
            this.f96833g = z;
            this.f96834h = linkedHashSet;
            this.i = z3;
            this.f96835j = z4;
            this.k = z6;
            this.f96836l = entryPoint;
        }

        @Override // s0i.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final s0i.a getF96856l() {
            return this.f96836l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Buy)) {
                return false;
            }
            Buy buy = (Buy) obj2;
            return Intrinsics.f(this.f96830a, buy.f96830a) && Intrinsics.f(this.f96831b, buy.f96831b) && this.f96832c == buy.f96832c && this.d == buy.d && Intrinsics.f(this.e, buy.e) && Intrinsics.f(this.f, buy.f) && this.f96833g == buy.f96833g && Intrinsics.f(this.f96834h, buy.f96834h) && this.i == buy.i && this.f96835j == buy.f96835j && this.k == buy.k && this.f96836l == buy.f96836l;
        }

        public final int hashCode() {
            b bVar = this.f96830a;
            int iC = j6.a.c(l.b(this.f, (this.e.hashCode() + ((this.d.hashCode() + v1.c.b(this.f96832c, l.j(this.f96831b, (bVar == null ? 0 : bVar.hashCode()) * 31, 31), 31)) * 31)) * 31, 31), 31, this.f96833g);
            Set set = this.f96834h;
            return this.f96836l.hashCode() + j6.a.c(j6.a.c(j6.a.c((iC + (set != null ? set.hashCode() : 0)) * 31, 31, this.i), 31, this.f96835j), 31, this.k);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96830a);
            dest.writeSerializable(this.f96831b);
            dest.writeString(this.f96832c.name());
            dest.writeString(this.d.name());
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
            dest.writeInt(this.f96833g ? 1 : 0);
            Set set = this.f96834h;
            if (set == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = kii.e.q(dest, 1, set);
                while (itQ.hasNext()) {
                    dest.writeString(((e) itQ.next()).name());
                }
            }
            dest.writeInt(this.i ? 1 : 0);
            dest.writeInt(this.f96835j ? 1 : 0);
            dest.writeInt(this.k ? 1 : 0);
            dest.writeString(this.f96836l.name());
        }

        public /* synthetic */ Buy(b bVar, b bVar2, h hVar, c cVar, ExchangeFeatureConfigFinishBehavior exchangeFeatureConfigFinishBehavior, AccountId accountId, boolean z, s0i.a aVar, int i) {
            this((i & 1) != 0 ? null : bVar, bVar2, (i & 4) != 0 ? h.MARKET : hVar, (i & 8) != 0 ? c.ALL : cVar, (i & 16) != 0 ? ExchangeFeatureConfigFinishBehavior.Default.f96860a : exchangeFeatureConfigFinishBehavior, (i & 32) != 0 ? AccountId.Personal.f51414a : accountId, (i & 64) != 0, null, false, (i & 512) != 0 ? false : z, (i & 1024) == 0, (i & 2048) != 0 ? s0i.a.OTHER : aVar);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig$Sell;", "Lcom/revolut/feature_exchange/api/navigation/ExchangeFeatureConfig;", "Ls0i/b;", "", "toString", "()Ljava/lang/String;", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Sell extends ExchangeFeatureConfig implements s0i.b {

        @NotNull
        public static final Parcelable.Creator<Sell> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f96850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f96851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f96852c;
        public final h d;
        public final c e;
        public final ExchangeFeatureConfigFinishBehavior f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AccountId f96853g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f96854h;
        public final Set i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f96855j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final s0i.a f96856l;

        public static final class a implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                b bVar = (b) parcel.readSerializable();
                b bVar2 = (b) parcel.readSerializable();
                LinkedHashSet linkedHashSet = null;
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                h hVarValueOf = h.valueOf(parcel.readString());
                c cVarValueOf = c.valueOf(parcel.readString());
                ExchangeFeatureConfigFinishBehavior exchangeFeatureConfigFinishBehavior = (ExchangeFeatureConfigFinishBehavior) parcel.readParcelable(Sell.class.getClassLoader());
                AccountId accountId = (AccountId) parcel.readParcelable(Sell.class.getClassLoader());
                boolean z = false;
                if (parcel.readInt() != 0) {
                    i = 0;
                    z = true;
                } else {
                    i = 0;
                }
                if (parcel.readInt() != 0) {
                    int i2 = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
                    for (int i3 = i; i3 != i2; i3++) {
                        linkedHashSet2.add(e.valueOf(parcel.readString()));
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new Sell(bVar, bVar2, lValueOf, hVarValueOf, cVarValueOf, exchangeFeatureConfigFinishBehavior, accountId, z, linkedHashSet, parcel.readInt() != 0 ? 1 : i, parcel.readInt() != 0 ? 1 : i, s0i.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Sell[i];
            }
        }

        public Sell(b from, b bVar, Long l2, h orderType, c currencyMode, ExchangeFeatureConfigFinishBehavior finishBehavior, AccountId accountId, boolean z, LinkedHashSet linkedHashSet, boolean z3, boolean z4, s0i.a entryPoint) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
            Intrinsics.checkNotNullParameter(finishBehavior, "finishBehavior");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.f96850a = from;
            this.f96851b = bVar;
            this.f96852c = l2;
            this.d = orderType;
            this.e = currencyMode;
            this.f = finishBehavior;
            this.f96853g = accountId;
            this.f96854h = z;
            this.i = linkedHashSet;
            this.f96855j = z3;
            this.k = z4;
            this.f96856l = entryPoint;
        }

        @Override // s0i.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final s0i.a getF96856l() {
            return this.f96856l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Sell)) {
                return false;
            }
            Sell sell = (Sell) obj2;
            return Intrinsics.f(this.f96850a, sell.f96850a) && Intrinsics.f(this.f96851b, sell.f96851b) && Intrinsics.f(this.f96852c, sell.f96852c) && this.d == sell.d && this.e == sell.e && Intrinsics.f(this.f, sell.f) && Intrinsics.f(this.f96853g, sell.f96853g) && this.f96854h == sell.f96854h && Intrinsics.f(this.i, sell.i) && this.f96855j == sell.f96855j && this.k == sell.k && this.f96856l == sell.f96856l;
        }

        public final int hashCode() {
            int iHashCode = this.f96850a.hashCode() * 31;
            b bVar = this.f96851b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Long l2 = this.f96852c;
            int iC = j6.a.c(l.b(this.f96853g, (this.f.hashCode() + ((this.e.hashCode() + v1.c.b(this.d, (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31)) * 31)) * 31, 31), 31, this.f96854h);
            Set set = this.i;
            return this.f96856l.hashCode() + j6.a.c(j6.a.c((iC + (set != null ? set.hashCode() : 0)) * 31, 31, this.f96855j), 31, this.k);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96850a);
            dest.writeSerializable(this.f96851b);
            Long l2 = this.f96852c;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
            dest.writeString(this.d.name());
            dest.writeString(this.e.name());
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f96853g, i);
            dest.writeInt(this.f96854h ? 1 : 0);
            Set set = this.i;
            if (set == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = kii.e.q(dest, 1, set);
                while (itQ.hasNext()) {
                    dest.writeString(((e) itQ.next()).name());
                }
            }
            dest.writeInt(this.f96855j ? 1 : 0);
            dest.writeInt(this.k ? 1 : 0);
            dest.writeString(this.f96856l.name());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Sell(b bVar, b bVar2, Long l2, h hVar, c cVar, AccountId accountId, s0i.a aVar, int i) {
            ExchangeFeatureConfigFinishBehavior exchangeFeatureConfigFinishBehavior;
            b bVar3 = (i & 2) != 0 ? null : bVar2;
            Long l3 = (i & 4) != 0 ? null : l2;
            h hVar2 = (i & 8) != 0 ? h.MARKET : hVar;
            c cVar2 = (i & 16) != 0 ? c.ALL : cVar;
            if ((i & 32) != 0) {
                exchangeFeatureConfigFinishBehavior = ExchangeFeatureConfigFinishBehavior.Default.f96860a;
            } else {
                exchangeFeatureConfigFinishBehavior = ExchangeFeatureConfigFinishBehavior.Finish.f96861a;
            }
            this(bVar, bVar3, l3, hVar2, cVar2, exchangeFeatureConfigFinishBehavior, (i & 64) != 0 ? AccountId.Personal.f51414a : accountId, true, null, false, false, (i & 2048) != 0 ? s0i.a.OTHER : aVar);
        }
    }
}
