package com.revolut.feature.wealth.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.Beneficiary;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xzg.o0;
import xzg.p0;
import xzg.q0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/WealthAccount;", "Landroid/os/Parcelable;", "Securities", "Robo", "Commodities", "Margin", "TaxAdvantageWealthAccount", "xzg/o0", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$Commodities;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$Margin;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$Robo;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$Securities;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WealthAccount extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$Margin;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Margin implements WealthAccount {

        @NotNull
        public static final Parcelable.Creator<Margin> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o0 f95232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f95233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f95234c;
        public final q0 d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Margin(o0.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), q0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Margin[i];
            }
        }

        public Margin(o0 state, String str, String str2, q0 wealthAccountHolderType) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(wealthAccountHolderType, "wealthAccountHolderType");
            this.f95232a = state;
            this.f95233b = str;
            this.f95234c = str2;
            this.d = wealthAccountHolderType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Margin)) {
                return false;
            }
            Margin margin = (Margin) obj2;
            return this.f95232a == margin.f95232a && Intrinsics.f(this.f95233b, margin.f95233b) && Intrinsics.f(this.f95234c, margin.f95234c) && this.d == margin.d;
        }

        @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount
        /* JADX INFO: renamed from: getState, reason: from getter */
        public final o0 getF95255c() {
            return this.f95232a;
        }

        public final int hashCode() {
            int iHashCode = this.f95232a.hashCode() * 31;
            String str = this.f95233b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f95234c;
            return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount
        /* JADX INFO: renamed from: m7, reason: from getter */
        public final q0 getF95256g() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95232a.name());
            dest.writeString(this.f95233b);
            dest.writeString(this.f95234c);
            dest.writeString(this.d.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$Robo;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Robo implements WealthAccount {

        @NotNull
        public static final Parcelable.Creator<Robo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f95235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o0 f95236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f95237c;
        public final q0 d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                o0 o0VarValueOf = o0.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Robo.class, parcel, arrayList, iE, 1);
                }
                return new Robo(string, o0VarValueOf, arrayList, q0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Robo[i];
            }
        }

        public Robo(String str, o0 state, List portfolios, q0 wealthAccountHolderType) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(portfolios, "portfolios");
            Intrinsics.checkNotNullParameter(wealthAccountHolderType, "wealthAccountHolderType");
            this.f95235a = str;
            this.f95236b = state;
            this.f95237c = portfolios;
            this.d = wealthAccountHolderType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Robo)) {
                return false;
            }
            Robo robo = (Robo) obj2;
            return Intrinsics.f(this.f95235a, robo.f95235a) && this.f95236b == robo.f95236b && Intrinsics.f(this.f95237c, robo.f95237c) && this.d == robo.d;
        }

        @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount
        /* JADX INFO: renamed from: getState, reason: from getter */
        public final o0 getF95255c() {
            return this.f95236b;
        }

        public final int hashCode() {
            String str = this.f95235a;
            return this.d.hashCode() + p.a.d((this.f95236b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f95237c);
        }

        @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount
        /* JADX INFO: renamed from: m7, reason: from getter */
        public final q0 getF95256g() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95235a);
            dest.writeString(this.f95236b.name());
            Iterator itV = p.a.v(this.f95237c, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeString(this.d.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$Securities;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Securities implements WealthAccount {

        @NotNull
        public static final Parcelable.Creator<Securities> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o0 f95238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q0 f95239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TradingAccount.Portfolio f95240c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Securities(o0.valueOf(parcel.readString()), q0.valueOf(parcel.readString()), (TradingAccount.Portfolio) parcel.readParcelable(Securities.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Securities[i];
            }
        }

        public Securities(o0 state, q0 wealthAccountHolderType, TradingAccount.Portfolio portfolio, String str, String str2) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(wealthAccountHolderType, "wealthAccountHolderType");
            this.f95238a = state;
            this.f95239b = wealthAccountHolderType;
            this.f95240c = portfolio;
            this.d = str;
            this.e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Securities)) {
                return false;
            }
            Securities securities = (Securities) obj2;
            return this.f95238a == securities.f95238a && this.f95239b == securities.f95239b && Intrinsics.f(this.f95240c, securities.f95240c) && Intrinsics.f(this.d, securities.d) && Intrinsics.f(this.e, securities.e);
        }

        @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount
        /* JADX INFO: renamed from: getState, reason: from getter */
        public final o0 getF95255c() {
            return this.f95238a;
        }

        public final int hashCode() {
            int iHashCode = (this.f95239b.hashCode() + (this.f95238a.hashCode() * 31)) * 31;
            TradingAccount.Portfolio portfolio = this.f95240c;
            int iHashCode2 = (iHashCode + (portfolio == null ? 0 : portfolio.hashCode())) * 31;
            String str = this.d;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount
        /* JADX INFO: renamed from: m7, reason: from getter */
        public final q0 getF95256g() {
            return this.f95239b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95238a.name());
            dest.writeString(this.f95239b.name());
            dest.writeParcelable(this.f95240c, i);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount;", "Isa", "Pea", "JIsa", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount$Isa;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount$JIsa;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount$Pea;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface TaxAdvantageWealthAccount extends WealthAccount {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount$Isa;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Isa implements TaxAdvantageWealthAccount {

            @NotNull
            public static final Parcelable.Creator<Isa> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f95241a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f95242b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final o0 f95243c;
            public final TradingAccount.Portfolio d;
            public final TradingAccount.TaxAdvantage.Limit e;
            public final Beneficiary f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final q0 f95244g;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Isa(parcel.readString(), parcel.readString(), o0.valueOf(parcel.readString()), (TradingAccount.Portfolio) parcel.readParcelable(Isa.class.getClassLoader()), (TradingAccount.TaxAdvantage.Limit) parcel.readParcelable(Isa.class.getClassLoader()), (Beneficiary) parcel.readParcelable(Isa.class.getClassLoader()), q0.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Isa[i];
                }
            }

            public Isa(String str, String str2, o0 state, TradingAccount.Portfolio portfolio, TradingAccount.TaxAdvantage.Limit limit, Beneficiary beneficiary, q0 wealthAccountHolderType) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                Intrinsics.checkNotNullParameter(wealthAccountHolderType, "wealthAccountHolderType");
                this.f95241a = str;
                this.f95242b = str2;
                this.f95243c = state;
                this.d = portfolio;
                this.e = limit;
                this.f = beneficiary;
                this.f95244g = wealthAccountHolderType;
            }

            @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
            /* JADX INFO: renamed from: R9, reason: from getter */
            public final String getF95254b() {
                return this.f95242b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Isa)) {
                    return false;
                }
                Isa isa = (Isa) obj2;
                return Intrinsics.f(this.f95241a, isa.f95241a) && Intrinsics.f(this.f95242b, isa.f95242b) && this.f95243c == isa.f95243c && Intrinsics.f(this.d, isa.d) && Intrinsics.f(this.e, isa.e) && Intrinsics.f(this.f, isa.f) && this.f95244g == isa.f95244g;
            }

            @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
            /* JADX INFO: renamed from: getAccountId, reason: from getter */
            public final String getF95253a() {
                return this.f95241a;
            }

            @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount
            /* JADX INFO: renamed from: getState, reason: from getter */
            public final o0 getF95255c() {
                return this.f95243c;
            }

            public final int hashCode() {
                String str = this.f95241a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f95242b;
                int iHashCode2 = (this.f95243c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                TradingAccount.Portfolio portfolio = this.d;
                int iHashCode3 = (iHashCode2 + (portfolio == null ? 0 : portfolio.hashCode())) * 31;
                TradingAccount.TaxAdvantage.Limit limit = this.e;
                return this.f95244g.hashCode() + ((this.f.hashCode() + ((iHashCode3 + (limit != null ? limit.hashCode() : 0)) * 31)) * 31);
            }

            @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount
            /* JADX INFO: renamed from: m7, reason: from getter */
            public final q0 getF95256g() {
                return this.f95244g;
            }

            @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
            /* JADX INFO: renamed from: p5, reason: from getter */
            public final TradingAccount.Portfolio getD() {
                return this.d;
            }

            @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
            /* JADX INFO: renamed from: s, reason: from getter */
            public final Beneficiary getF() {
                return this.f;
            }

            @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
            /* JADX INFO: renamed from: w, reason: from getter */
            public final TradingAccount.TaxAdvantage.Limit getE() {
                return this.e;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f95241a);
                dest.writeString(this.f95242b);
                dest.writeString(this.f95243c.name());
                dest.writeParcelable(this.d, i);
                dest.writeParcelable(this.e, i);
                dest.writeParcelable(this.f, i);
                dest.writeString(this.f95244g.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount$JIsa;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount;", "<init>", "()V", "Personal", "Custodian", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount$JIsa$Custodian;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount$JIsa$Personal;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class JIsa implements TaxAdvantageWealthAccount {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount$JIsa$Custodian;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount$JIsa;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Custodian extends JIsa {

                @NotNull
                public static final Parcelable.Creator<Custodian> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f95245a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f95246b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final o0 f95247c;
                public final TradingAccount.Portfolio d;
                public final TradingAccount.TaxAdvantage.Limit e;
                public final Beneficiary f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final q0 f95248g;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Custodian(parcel.readString(), parcel.readString(), o0.valueOf(parcel.readString()), (TradingAccount.Portfolio) parcel.readParcelable(Custodian.class.getClassLoader()), (TradingAccount.TaxAdvantage.Limit) parcel.readParcelable(Custodian.class.getClassLoader()), (Beneficiary) parcel.readParcelable(Custodian.class.getClassLoader()), q0.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Custodian[i];
                    }
                }

                public Custodian(String str, String str2, o0 state, TradingAccount.Portfolio portfolio, TradingAccount.TaxAdvantage.Limit limit, Beneficiary beneficiary, q0 wealthAccountHolderType) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                    Intrinsics.checkNotNullParameter(wealthAccountHolderType, "wealthAccountHolderType");
                    this.f95245a = str;
                    this.f95246b = str2;
                    this.f95247c = state;
                    this.d = portfolio;
                    this.e = limit;
                    this.f = beneficiary;
                    this.f95248g = wealthAccountHolderType;
                }

                @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
                /* JADX INFO: renamed from: R9, reason: from getter */
                public final String getF95254b() {
                    return this.f95246b;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Custodian)) {
                        return false;
                    }
                    Custodian custodian = (Custodian) obj2;
                    return Intrinsics.f(this.f95245a, custodian.f95245a) && Intrinsics.f(this.f95246b, custodian.f95246b) && this.f95247c == custodian.f95247c && Intrinsics.f(this.d, custodian.d) && Intrinsics.f(this.e, custodian.e) && Intrinsics.f(this.f, custodian.f) && this.f95248g == custodian.f95248g;
                }

                @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
                /* JADX INFO: renamed from: getAccountId, reason: from getter */
                public final String getF95253a() {
                    return this.f95245a;
                }

                @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount
                /* JADX INFO: renamed from: getState, reason: from getter */
                public final o0 getF95255c() {
                    return this.f95247c;
                }

                public final int hashCode() {
                    String str = this.f95245a;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.f95246b;
                    int iHashCode2 = (this.f95247c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                    TradingAccount.Portfolio portfolio = this.d;
                    int iHashCode3 = (iHashCode2 + (portfolio == null ? 0 : portfolio.hashCode())) * 31;
                    TradingAccount.TaxAdvantage.Limit limit = this.e;
                    return this.f95248g.hashCode() + ((this.f.hashCode() + ((iHashCode3 + (limit != null ? limit.hashCode() : 0)) * 31)) * 31);
                }

                @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount
                /* JADX INFO: renamed from: m7, reason: from getter */
                public final q0 getF95256g() {
                    return this.f95248g;
                }

                @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
                /* JADX INFO: renamed from: p5, reason: from getter */
                public final TradingAccount.Portfolio getD() {
                    return this.d;
                }

                @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
                /* JADX INFO: renamed from: s, reason: from getter */
                public final Beneficiary getF() {
                    return this.f;
                }

                @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
                /* JADX INFO: renamed from: w, reason: from getter */
                public final TradingAccount.TaxAdvantage.Limit getE() {
                    return this.e;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f95245a);
                    dest.writeString(this.f95246b);
                    dest.writeString(this.f95247c.name());
                    dest.writeParcelable(this.d, i);
                    dest.writeParcelable(this.e, i);
                    dest.writeParcelable(this.f, i);
                    dest.writeString(this.f95248g.name());
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount$JIsa$Personal;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount$JIsa;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Personal extends JIsa {

                @NotNull
                public static final Parcelable.Creator<Personal> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f95249a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f95250b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final o0 f95251c;
                public final TradingAccount.Portfolio d;
                public final TradingAccount.TaxAdvantage.Limit e;
                public final Beneficiary f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final q0 f95252g;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Personal(parcel.readString(), parcel.readString(), o0.valueOf(parcel.readString()), (TradingAccount.Portfolio) parcel.readParcelable(Personal.class.getClassLoader()), (TradingAccount.TaxAdvantage.Limit) parcel.readParcelable(Personal.class.getClassLoader()), (Beneficiary) parcel.readParcelable(Personal.class.getClassLoader()), q0.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Personal[i];
                    }
                }

                public Personal(String str, String str2, o0 state, TradingAccount.Portfolio portfolio, TradingAccount.TaxAdvantage.Limit limit, Beneficiary beneficiary, q0 wealthAccountHolderType) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                    Intrinsics.checkNotNullParameter(wealthAccountHolderType, "wealthAccountHolderType");
                    this.f95249a = str;
                    this.f95250b = str2;
                    this.f95251c = state;
                    this.d = portfolio;
                    this.e = limit;
                    this.f = beneficiary;
                    this.f95252g = wealthAccountHolderType;
                }

                @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
                /* JADX INFO: renamed from: R9, reason: from getter */
                public final String getF95254b() {
                    return this.f95250b;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Personal)) {
                        return false;
                    }
                    Personal personal = (Personal) obj2;
                    return Intrinsics.f(this.f95249a, personal.f95249a) && Intrinsics.f(this.f95250b, personal.f95250b) && this.f95251c == personal.f95251c && Intrinsics.f(this.d, personal.d) && Intrinsics.f(this.e, personal.e) && Intrinsics.f(this.f, personal.f) && this.f95252g == personal.f95252g;
                }

                @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
                /* JADX INFO: renamed from: getAccountId, reason: from getter */
                public final String getF95253a() {
                    return this.f95249a;
                }

                @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount
                /* JADX INFO: renamed from: getState, reason: from getter */
                public final o0 getF95255c() {
                    return this.f95251c;
                }

                public final int hashCode() {
                    String str = this.f95249a;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.f95250b;
                    int iHashCode2 = (this.f95251c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                    TradingAccount.Portfolio portfolio = this.d;
                    int iHashCode3 = (iHashCode2 + (portfolio == null ? 0 : portfolio.hashCode())) * 31;
                    TradingAccount.TaxAdvantage.Limit limit = this.e;
                    return this.f95252g.hashCode() + ((this.f.hashCode() + ((iHashCode3 + (limit != null ? limit.hashCode() : 0)) * 31)) * 31);
                }

                @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount
                /* JADX INFO: renamed from: m7, reason: from getter */
                public final q0 getF95256g() {
                    return this.f95252g;
                }

                @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
                /* JADX INFO: renamed from: p5, reason: from getter */
                public final TradingAccount.Portfolio getD() {
                    return this.d;
                }

                @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
                /* JADX INFO: renamed from: s, reason: from getter */
                public final Beneficiary getF() {
                    return this.f;
                }

                @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
                /* JADX INFO: renamed from: w, reason: from getter */
                public final TradingAccount.TaxAdvantage.Limit getE() {
                    return this.e;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f95249a);
                    dest.writeString(this.f95250b);
                    dest.writeString(this.f95251c.name());
                    dest.writeParcelable(this.d, i);
                    dest.writeParcelable(this.e, i);
                    dest.writeParcelable(this.f, i);
                    dest.writeString(this.f95252g.name());
                }
            }

            private JIsa() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount$Pea;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$TaxAdvantageWealthAccount;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Pea implements TaxAdvantageWealthAccount {

            @NotNull
            public static final Parcelable.Creator<Pea> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f95253a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f95254b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final o0 f95255c;
            public final TradingAccount.Portfolio d;
            public final TradingAccount.TaxAdvantage.Limit e;
            public final Beneficiary f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final q0 f95256g;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Pea(parcel.readString(), parcel.readString(), o0.valueOf(parcel.readString()), (TradingAccount.Portfolio) parcel.readParcelable(Pea.class.getClassLoader()), (TradingAccount.TaxAdvantage.Limit) parcel.readParcelable(Pea.class.getClassLoader()), (Beneficiary) parcel.readParcelable(Pea.class.getClassLoader()), q0.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Pea[i];
                }
            }

            public Pea(String str, String str2, o0 state, TradingAccount.Portfolio portfolio, TradingAccount.TaxAdvantage.Limit limit, Beneficiary beneficiary, q0 wealthAccountHolderType) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                Intrinsics.checkNotNullParameter(wealthAccountHolderType, "wealthAccountHolderType");
                this.f95253a = str;
                this.f95254b = str2;
                this.f95255c = state;
                this.d = portfolio;
                this.e = limit;
                this.f = beneficiary;
                this.f95256g = wealthAccountHolderType;
            }

            @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
            /* JADX INFO: renamed from: R9, reason: from getter */
            public final String getF95254b() {
                return this.f95254b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Pea)) {
                    return false;
                }
                Pea pea2 = (Pea) obj2;
                return Intrinsics.f(this.f95253a, pea2.f95253a) && Intrinsics.f(this.f95254b, pea2.f95254b) && this.f95255c == pea2.f95255c && Intrinsics.f(this.d, pea2.d) && Intrinsics.f(this.e, pea2.e) && Intrinsics.f(this.f, pea2.f) && this.f95256g == pea2.f95256g;
            }

            @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
            /* JADX INFO: renamed from: getAccountId, reason: from getter */
            public final String getF95253a() {
                return this.f95253a;
            }

            @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount
            /* JADX INFO: renamed from: getState, reason: from getter */
            public final o0 getF95255c() {
                return this.f95255c;
            }

            public final int hashCode() {
                String str = this.f95253a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f95254b;
                int iHashCode2 = (this.f95255c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                TradingAccount.Portfolio portfolio = this.d;
                int iHashCode3 = (iHashCode2 + (portfolio == null ? 0 : portfolio.hashCode())) * 31;
                TradingAccount.TaxAdvantage.Limit limit = this.e;
                return this.f95256g.hashCode() + ((this.f.hashCode() + ((iHashCode3 + (limit != null ? limit.hashCode() : 0)) * 31)) * 31);
            }

            @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount
            /* JADX INFO: renamed from: m7, reason: from getter */
            public final q0 getF95256g() {
                return this.f95256g;
            }

            @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
            /* JADX INFO: renamed from: p5, reason: from getter */
            public final TradingAccount.Portfolio getD() {
                return this.d;
            }

            @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
            /* JADX INFO: renamed from: s, reason: from getter */
            public final Beneficiary getF() {
                return this.f;
            }

            @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount.TaxAdvantageWealthAccount
            /* JADX INFO: renamed from: w, reason: from getter */
            public final TradingAccount.TaxAdvantage.Limit getE() {
                return this.e;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f95253a);
                dest.writeString(this.f95254b);
                dest.writeString(this.f95255c.name());
                dest.writeParcelable(this.d, i);
                dest.writeParcelable(this.e, i);
                dest.writeParcelable(this.f, i);
                dest.writeString(this.f95256g.name());
            }
        }

        /* JADX INFO: renamed from: R9 */
        String getF95254b();

        /* JADX INFO: renamed from: getAccountId */
        String getF95253a();

        /* JADX INFO: renamed from: p5 */
        TradingAccount.Portfolio getD();

        /* JADX INFO: renamed from: s */
        Beneficiary getF();

        /* JADX INFO: renamed from: w */
        TradingAccount.TaxAdvantage.Limit getE();
    }

    default boolean H6() {
        return getF95255c() == o0.ONBOARDING;
    }

    default boolean Q2() {
        return v.k(o0.ACTIVE, o0.SUSPENDED, o0.OFFBOARDING).contains(getF95255c());
    }

    default WealthAccountType T0() {
        if (this instanceof Commodities) {
            return WealthAccountType.COMMODITIES;
        }
        if (this instanceof Margin) {
            return WealthAccountType.MARGIN;
        }
        if (this instanceof Robo) {
            return WealthAccountType.ROBO;
        }
        if (this instanceof Securities) {
            return WealthAccountType.SECURITIES;
        }
        if (this instanceof TaxAdvantageWealthAccount) {
            return WealthAccountType.TAA;
        }
        throw new NoWhenBranchMatchedException();
    }

    default boolean available() {
        switch (p0.f310021a[getF95255c().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return false;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    default boolean b5() {
        return getF95256g() == q0.PERSONAL;
    }

    default boolean d9() {
        return getF95256g() == q0.PERSONAL_JOINT;
    }

    /* JADX INFO: renamed from: getState */
    o0 getF95255c();

    /* JADX INFO: renamed from: m7 */
    q0 getF95256g();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/WealthAccount$Commodities;", "Lcom/revolut/feature/wealth/api/domain/model/WealthAccount;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Commodities implements WealthAccount {

        @NotNull
        public static final Parcelable.Creator<Commodities> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o0 f95230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q0 f95231b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Commodities(o0.valueOf(parcel.readString()), q0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Commodities[i];
            }
        }

        public Commodities(o0 state, q0 wealthAccountHolderType) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(wealthAccountHolderType, "wealthAccountHolderType");
            this.f95230a = state;
            this.f95231b = wealthAccountHolderType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Commodities)) {
                return false;
            }
            Commodities commodities = (Commodities) obj2;
            return this.f95230a == commodities.f95230a && this.f95231b == commodities.f95231b;
        }

        @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount
        /* JADX INFO: renamed from: getState, reason: from getter */
        public final o0 getF95255c() {
            return this.f95230a;
        }

        public final int hashCode() {
            return this.f95231b.hashCode() + (this.f95230a.hashCode() * 31);
        }

        @Override // com.revolut.feature.wealth.api.domain.model.WealthAccount
        /* JADX INFO: renamed from: m7, reason: from getter */
        public final q0 getF95256g() {
            return this.f95231b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95230a.name());
            dest.writeString(this.f95231b.name());
        }

        public /* synthetic */ Commodities(o0 o0Var) {
            this(o0Var, q0.PERSONAL);
        }
    }
}
