package com.revolut.feature.trading_orders.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dj0.d;
import kel.b;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l4l.a;
import m4l.j;
import opg.c;
import org.jetbrains.annotations.NotNull;
import pcd.s;
import prk.o;
import z92.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading_orders/common/models/SourcePocket;", "Landroid/os/Parcelable;", "Holding", "InvestAccountCombinedBuyingPower", "Pocket", "VaultWrapper", "Savings", "Balance", "Lcom/revolut/feature/trading_orders/common/models/SourcePocket$Holding;", "Lcom/revolut/feature/trading_orders/common/models/SourcePocket$InvestAccountCombinedBuyingPower;", "Lcom/revolut/feature/trading_orders/common/models/SourcePocket$Pocket;", "Lcom/revolut/feature/trading_orders/common/models/SourcePocket$Savings;", "Lcom/revolut/feature/trading_orders/common/models/SourcePocket$VaultWrapper;", "feature_trading_orders_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SourcePocket extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading_orders/common/models/SourcePocket$Balance;", "Landroid/os/Parcelable;", "MoneyBalance", "Lcom/revolut/feature/trading_orders/common/models/SourcePocket$Balance$MoneyBalance;", "feature_trading_orders_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Balance extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/common/models/SourcePocket$Balance$MoneyBalance;", "Lcom/revolut/feature/trading_orders/common/models/SourcePocket$Balance;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MoneyBalance implements Balance {

            @NotNull
            public static final Parcelable.Creator<MoneyBalance> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f91775a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new MoneyBalance((d) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new MoneyBalance[i];
                }
            }

            public MoneyBalance(d balance) {
                Intrinsics.checkNotNullParameter(balance, "balance");
                this.f91775a = balance;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof MoneyBalance) && Intrinsics.f(this.f91775a, ((MoneyBalance) obj2).f91775a);
            }

            public final int hashCode() {
                return this.f91775a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f91775a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/common/models/SourcePocket$Holding;", "Lcom/revolut/feature/trading_orders/common/models/SourcePocket;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Holding implements SourcePocket {

        @NotNull
        public static final Parcelable.Creator<Holding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f91776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradingAccount f91777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f91778c;
        public final Balance d;
        public final d e;
        public final l4l.a f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final j f91779g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Holding((b) parcel.readSerializable(), (TradingAccount) parcel.readParcelable(Holding.class.getClassLoader()), parcel.readInt() != 0, (Balance) parcel.readParcelable(Holding.class.getClassLoader()), (d) parcel.readSerializable(), l4l.a.valueOf(parcel.readString()), (j) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Holding[i];
            }
        }

        public Holding(b cashHolding, TradingAccount tradingAccount, boolean z, Balance balance, d dVar, l4l.a source, j jVar) {
            Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            Intrinsics.checkNotNullParameter(balance, "balance");
            Intrinsics.checkNotNullParameter(source, "source");
            this.f91776a = cashHolding;
            this.f91777b = tradingAccount;
            this.f91778c = z;
            this.d = balance;
            this.e = dVar;
            this.f = source;
            this.f91779g = jVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Holding)) {
                return false;
            }
            Holding holding = (Holding) obj2;
            return Intrinsics.f(this.f91776a, holding.f91776a) && Intrinsics.f(this.f91777b, holding.f91777b) && this.f91778c == holding.f91778c && Intrinsics.f(this.d, holding.d) && Intrinsics.f(this.e, holding.e) && this.f == holding.f && Intrinsics.f(this.f91779g, holding.f91779g);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getBalance, reason: from getter */
        public final Balance getE() {
            return this.d;
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getCurrency */
        public final xi0.b getF91784h() {
            xi0.a aVar = xi0.b.Companion;
            String str = this.f91776a.f183148a.e;
            aVar.getClass();
            return xi0.a.a(str);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getId */
        public final String getF91780a() {
            return this.f91776a.f183148a.f183145a;
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        public final String getPocketId() {
            return this.f91776a.f183150c;
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getSource, reason: from getter */
        public final l4l.a getF91793c() {
            return this.f;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + j6.a.c(o.b(this.f91777b, this.f91776a.hashCode() * 31, 31), 31, this.f91778c)) * 31;
            d dVar = this.e;
            int iHashCode2 = (this.f.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
            j jVar = this.f91779g;
            return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: u9, reason: from getter */
        public final j getD() {
            return this.f91779g;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91776a);
            dest.writeParcelable(this.f91777b, i);
            dest.writeInt(this.f91778c ? 1 : 0);
            dest.writeParcelable(this.d, i);
            dest.writeSerializable(this.e);
            dest.writeString(this.f.name());
            dest.writeSerializable(this.f91779g);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: y7, reason: from getter */
        public final d getF91792b() {
            return this.e;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/common/models/SourcePocket$InvestAccountCombinedBuyingPower;", "Lcom/revolut/feature/trading_orders/common/models/SourcePocket;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvestAccountCombinedBuyingPower implements SourcePocket {

        @NotNull
        public static final Parcelable.Creator<InvestAccountCombinedBuyingPower> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradingAccount f91781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CombinedBuyingPowerConverted f91782c;
        public final Clause d;
        public final Balance e;
        public final d f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final j f91783g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final xi0.b f91784h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvestAccountCombinedBuyingPower(parcel.readString(), (TradingAccount) parcel.readParcelable(InvestAccountCombinedBuyingPower.class.getClassLoader()), (CombinedBuyingPowerConverted) parcel.readParcelable(InvestAccountCombinedBuyingPower.class.getClassLoader()), (Clause) parcel.readParcelable(InvestAccountCombinedBuyingPower.class.getClassLoader()), (Balance) parcel.readParcelable(InvestAccountCombinedBuyingPower.class.getClassLoader()), (d) parcel.readSerializable(), (j) parcel.readSerializable(), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvestAccountCombinedBuyingPower[i];
            }
        }

        public InvestAccountCombinedBuyingPower(String id10, TradingAccount tradingAccount, CombinedBuyingPowerConverted combinedBuyingPowerConverted, Clause name, Balance balance, d dVar, j jVar, xi0.b currency) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            Intrinsics.checkNotNullParameter(combinedBuyingPowerConverted, "combinedBuyingPowerConverted");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(balance, "balance");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f91780a = id10;
            this.f91781b = tradingAccount;
            this.f91782c = combinedBuyingPowerConverted;
            this.d = name;
            this.e = balance;
            this.f = dVar;
            this.f91783g = jVar;
            this.f91784h = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InvestAccountCombinedBuyingPower)) {
                return false;
            }
            InvestAccountCombinedBuyingPower investAccountCombinedBuyingPower = (InvestAccountCombinedBuyingPower) obj2;
            return Intrinsics.f(this.f91780a, investAccountCombinedBuyingPower.f91780a) && Intrinsics.f(this.f91781b, investAccountCombinedBuyingPower.f91781b) && Intrinsics.f(this.f91782c, investAccountCombinedBuyingPower.f91782c) && Intrinsics.f(this.d, investAccountCombinedBuyingPower.d) && Intrinsics.f(this.e, investAccountCombinedBuyingPower.e) && Intrinsics.f(this.f, investAccountCombinedBuyingPower.f) && Intrinsics.f(this.f91783g, investAccountCombinedBuyingPower.f91783g) && Intrinsics.f(this.f91784h, investAccountCombinedBuyingPower.f91784h);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getBalance, reason: from getter */
        public final Balance getE() {
            return this.e;
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final xi0.b getF91784h() {
            return this.f91784h;
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF91780a() {
            return this.f91780a;
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        public final String getPocketId() {
            return null;
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getSource */
        public final l4l.a getF91793c() {
            return l4l.a.TRADING_GIA_CBP;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + p.a.a((this.f91782c.hashCode() + o.b(this.f91781b, this.f91780a.hashCode() * 31, 31)) * 31, 31, this.d)) * 31;
            d dVar = this.f;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            j jVar = this.f91783g;
            return this.f91784h.hashCode() + ((iHashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: u9, reason: from getter */
        public final j getD() {
            return this.f91783g;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91780a);
            dest.writeParcelable(this.f91781b, i);
            dest.writeParcelable(this.f91782c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeSerializable(this.f);
            dest.writeSerializable(this.f91783g);
            dest.writeSerializable(this.f91784h);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: y7, reason: from getter */
        public final d getF91792b() {
            return this.f;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/common/models/SourcePocket$Pocket;", "Lcom/revolut/feature/trading_orders/common/models/SourcePocket;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pocket implements SourcePocket {

        @NotNull
        public static final Parcelable.Creator<Pocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io3.d f91785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f91786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l4l.a f91787c;
        public final j d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pocket((io3.d) parcel.readSerializable(), (d) parcel.readSerializable(), l4l.a.valueOf(parcel.readString()), (j) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pocket[i];
            }
        }

        public Pocket(io3.d pocket, d dVar, l4l.a source, j jVar) {
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            Intrinsics.checkNotNullParameter(source, "source");
            this.f91785a = pocket;
            this.f91786b = dVar;
            this.f91787c = source;
            this.d = jVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pocket)) {
                return false;
            }
            Pocket pocket = (Pocket) obj2;
            return Intrinsics.f(this.f91785a, pocket.f91785a) && Intrinsics.f(this.f91786b, pocket.f91786b) && this.f91787c == pocket.f91787c && Intrinsics.f(this.d, pocket.d);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getBalance */
        public final Balance getE() {
            return new Balance.MoneyBalance(f.j(this.f91785a));
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getCurrency */
        public final xi0.b getF91784h() {
            xi0.a aVar = xi0.b.Companion;
            String str = this.f91785a.f163147c;
            aVar.getClass();
            return xi0.a.a(str);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getId */
        public final String getF91780a() {
            return this.f91785a.f163145a;
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        public final String getPocketId() {
            return this.f91785a.f163145a;
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getSource, reason: from getter */
        public final l4l.a getF91793c() {
            return this.f91787c;
        }

        public final int hashCode() {
            int iHashCode = this.f91785a.hashCode() * 31;
            d dVar = this.f91786b;
            int iHashCode2 = (this.f91787c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
            j jVar = this.d;
            return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: u9, reason: from getter */
        public final j getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91785a);
            dest.writeSerializable(this.f91786b);
            dest.writeString(this.f91787c.name());
            dest.writeSerializable(this.d);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: y7, reason: from getter */
        public final d getF91792b() {
            return this.f91786b;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/common/models/SourcePocket$Savings;", "Lcom/revolut/feature/trading_orders/common/models/SourcePocket;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Savings implements SourcePocket {

        @NotNull
        public static final Parcelable.Creator<Savings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SavingsAccountDetails f91788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f91789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l4l.a f91790c;
        public final j d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Savings((SavingsAccountDetails) parcel.readParcelable(Savings.class.getClassLoader()), (d) parcel.readSerializable(), l4l.a.valueOf(parcel.readString()), (j) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Savings[i];
            }
        }

        public Savings(SavingsAccountDetails savingsAccountDetails, d dVar, l4l.a source, j jVar) {
            Intrinsics.checkNotNullParameter(savingsAccountDetails, "savingsAccountDetails");
            Intrinsics.checkNotNullParameter(source, "source");
            this.f91788a = savingsAccountDetails;
            this.f91789b = dVar;
            this.f91790c = source;
            this.d = jVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Savings)) {
                return false;
            }
            Savings savings = (Savings) obj2;
            return Intrinsics.f(this.f91788a, savings.f91788a) && Intrinsics.f(this.f91789b, savings.f91789b) && this.f91790c == savings.f91790c && Intrinsics.f(this.d, savings.d);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getBalance */
        public final Balance getE() {
            return new Balance.MoneyBalance(this.f91788a.f86460a.c());
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getCurrency */
        public final xi0.b getF91784h() {
            return e.u(this.f91788a.f86460a, xi0.b.Companion);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getId */
        public final String getF91780a() {
            return this.f91788a.f86460a.f234881a;
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        public final String getPocketId() {
            return c.j(this.f91788a.f86460a);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getSource, reason: from getter */
        public final l4l.a getF91793c() {
            return this.f91790c;
        }

        public final int hashCode() {
            int iHashCode = this.f91788a.hashCode() * 31;
            d dVar = this.f91789b;
            int iHashCode2 = (this.f91790c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
            j jVar = this.d;
            return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: u9, reason: from getter */
        public final j getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91788a, i);
            dest.writeSerializable(this.f91789b);
            dest.writeString(this.f91790c.name());
            dest.writeSerializable(this.d);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: y7, reason: from getter */
        public final d getF91792b() {
            return this.f91789b;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_orders/common/models/SourcePocket$VaultWrapper;", "Lcom/revolut/feature/trading_orders/common/models/SourcePocket;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VaultWrapper implements SourcePocket {

        @NotNull
        public static final Parcelable.Creator<VaultWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f91791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f91792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l4l.a f91793c;
        public final j d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VaultWrapper((s) parcel.readSerializable(), (d) parcel.readSerializable(), l4l.a.valueOf(parcel.readString()), (j) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VaultWrapper[i];
            }
        }

        public VaultWrapper(s vault, d dVar, l4l.a source, j jVar) {
            Intrinsics.checkNotNullParameter(vault, "vault");
            Intrinsics.checkNotNullParameter(source, "source");
            this.f91791a = vault;
            this.f91792b = dVar;
            this.f91793c = source;
            this.d = jVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof VaultWrapper)) {
                return false;
            }
            VaultWrapper vaultWrapper = (VaultWrapper) obj2;
            return Intrinsics.f(this.f91791a, vaultWrapper.f91791a) && Intrinsics.f(this.f91792b, vaultWrapper.f91792b) && this.f91793c == vaultWrapper.f91793c && Intrinsics.f(this.d, vaultWrapper.d);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getBalance */
        public final Balance getE() {
            return new Balance.MoneyBalance(this.f91791a.c());
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getCurrency */
        public final xi0.b getF91784h() {
            return e.u(this.f91791a, xi0.b.Companion);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getId */
        public final String getF91780a() {
            return this.f91791a.f234881a;
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        public final String getPocketId() {
            return c.j(this.f91791a);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: getSource, reason: from getter */
        public final l4l.a getF91793c() {
            return this.f91793c;
        }

        public final int hashCode() {
            int iHashCode = this.f91791a.hashCode() * 31;
            d dVar = this.f91792b;
            int iHashCode2 = (this.f91793c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
            j jVar = this.d;
            return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: u9, reason: from getter */
        public final j getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f91791a);
            dest.writeSerializable(this.f91792b);
            dest.writeString(this.f91793c.name());
            dest.writeSerializable(this.d);
        }

        @Override // com.revolut.feature.trading_orders.common.models.SourcePocket
        /* JADX INFO: renamed from: y7, reason: from getter */
        public final d getF91792b() {
            return this.f91792b;
        }
    }

    /* JADX INFO: renamed from: getBalance */
    Balance getE();

    /* JADX INFO: renamed from: getCurrency */
    xi0.b getF91784h();

    /* JADX INFO: renamed from: getId */
    String getF91780a();

    String getPocketId();

    /* JADX INFO: renamed from: getSource */
    a getF91793c();

    /* JADX INFO: renamed from: u9 */
    j getD();

    /* JADX INFO: renamed from: y7 */
    d getF91792b();
}
