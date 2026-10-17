package com.revolut.shared.feature.wealth.models.trading_accounts;

import android.os.Parcel;
import android.os.Parcelable;
import cfl.j;
import cfl.o;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import ip0.v7;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount;", "Landroid/os/Parcelable;", "<init>", "()V", "GIA", "Robo", "Margin", "TaxAdvantage", "MoneyMarketFunds", "PaperTrading", "Unknown", "cfl/b", "Portfolio", "cfl/d", "cfl/c", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$GIA;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$Margin;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$MoneyMarketFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$PaperTrading;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$Robo;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$Unknown;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TradingAccount implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$GIA;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GIA extends TradingAccount {

        @NotNull
        public static final Parcelable.Creator<GIA> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f105181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105183c;
        public final cfl.b d;
        public final j e;
        public final ArrayList f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f105184g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final cfl.d f105185h;
        public final cfl.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ArrayList f105186j;
        public final ArrayList k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Beneficiary f105187l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Settings f105188m;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                String string = parcel.readString();
                String string2 = parcel.readString();
                cfl.b bVarValueOf = cfl.b.valueOf(parcel.readString());
                j jVarValueOf = j.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TradingProduct.CREATOR, parcel, arrayList, iA, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Portfolio.CREATOR, parcel, arrayList2, iA2, 1);
                }
                cfl.d dVarValueOf = cfl.d.valueOf(parcel.readString());
                cfl.c cVarValueOf = cfl.c.valueOf(parcel.readString());
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                int iC = 0;
                while (iC != i3) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList3, iC, 1);
                }
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList4.add(o.valueOf(parcel.readString()));
                }
                return new GIA(uuid, string, string2, bVarValueOf, jVarValueOf, arrayList, arrayList2, dVarValueOf, cVarValueOf, arrayList3, arrayList4, Beneficiary.CREATOR.createFromParcel(parcel), Settings.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GIA[i];
            }
        }

        public GIA(UUID id10, String accountHolderId, String globalPersonalAccountId, cfl.b state, j accountHolderType, ArrayList tradingProducts, ArrayList portfolios, cfl.d allowedTrades, cfl.c allowedCashOperations, ArrayList holdingCurrencies, ArrayList permittedActions, Beneficiary beneficiary, Settings settings) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
            Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
            Intrinsics.checkNotNullParameter(portfolios, "portfolios");
            Intrinsics.checkNotNullParameter(allowedTrades, "allowedTrades");
            Intrinsics.checkNotNullParameter(allowedCashOperations, "allowedCashOperations");
            Intrinsics.checkNotNullParameter(holdingCurrencies, "holdingCurrencies");
            Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f105181a = id10;
            this.f105182b = accountHolderId;
            this.f105183c = globalPersonalAccountId;
            this.d = state;
            this.e = accountHolderType;
            this.f = tradingProducts;
            this.f105184g = portfolios;
            this.f105185h = allowedTrades;
            this.i = allowedCashOperations;
            this.f105186j = holdingCurrencies;
            this.k = permittedActions;
            this.f105187l = beneficiary;
            this.f105188m = settings;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List J() {
            return this.f105184g;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: T, reason: from getter */
        public final cfl.b getD() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final TradingAccountType W() {
            return TradingAccountType.Gia.f105270a;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: a */
        public final String getF105259c() {
            throw null;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: b, reason: from getter */
        public final cfl.c getF105254j() {
            return this.i;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: b8, reason: from getter */
        public final j getE() {
            return this.e;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: c, reason: from getter */
        public final cfl.d getI() {
            return this.f105185h;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List c0() {
            return this.f;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF105264c() {
            return this.f105183c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List e() {
            return this.f105186j;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GIA)) {
                return false;
            }
            GIA gia = (GIA) obj2;
            return Intrinsics.f(this.f105181a, gia.f105181a) && Intrinsics.f(this.f105182b, gia.f105182b) && Intrinsics.f(this.f105183c, gia.f105183c) && this.d == gia.d && this.e == gia.e && this.f.equals(gia.f) && this.f105184g.equals(gia.f105184g) && this.f105185h == gia.f105185h && this.i == gia.i && this.f105186j.equals(gia.f105186j) && this.k.equals(gia.k) && Intrinsics.f(this.f105187l, gia.f105187l) && Intrinsics.f(this.f105188m, gia.f105188m);
        }

        public final int hashCode() {
            return this.f105188m.f105178a.hashCode() + ((this.f105187l.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105186j, (this.i.hashCode() + ((this.f105185h.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105184g, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, v7.f(this.e, (this.d.hashCode() + p.a.c(p.a.c(this.f105181a.hashCode() * 31, 31, this.f105182b), 31, this.f105183c)) * 31, 31), 31), 31)) * 31)) * 31, 31), 31)) * 31);
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: j, reason: from getter */
        public final UUID getF105262a() {
            return this.f105181a;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: s, reason: from getter */
        public final Beneficiary getF() {
            return this.f105187l;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f105181a);
            dest.writeString(this.f105182b);
            dest.writeString(this.f105183c);
            dest.writeString(this.d.name());
            dest.writeString(this.e.name());
            Iterator itY = j6.a.y(this.f, dest);
            while (itY.hasNext()) {
                ((TradingProduct) itY.next()).writeToParcel(dest, i);
            }
            Iterator itY2 = j6.a.y(this.f105184g, dest);
            while (itY2.hasNext()) {
                ((Portfolio) itY2.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.f105185h.name());
            dest.writeString(this.i.name());
            Iterator itY3 = j6.a.y(this.f105186j, dest);
            while (itY3.hasNext()) {
                dest.writeSerializable((Serializable) itY3.next());
            }
            Iterator itY4 = j6.a.y(this.k, dest);
            while (itY4.hasNext()) {
                dest.writeString(((o) itY4.next()).name());
            }
            this.f105187l.writeToParcel(dest, i);
            this.f105188m.writeToParcel(dest, i);
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List z() {
            return this.k;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$Margin;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Margin extends TradingAccount {

        @NotNull
        public static final Parcelable.Creator<Margin> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f105189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105191c;
        public final cfl.b d;
        public final j e;
        public final ArrayList f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f105192g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final cfl.d f105193h;
        public final cfl.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ArrayList f105194j;
        public final ArrayList k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Beneficiary f105195l;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                String string = parcel.readString();
                String string2 = parcel.readString();
                cfl.b bVarValueOf = cfl.b.valueOf(parcel.readString());
                j jVarValueOf = j.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TradingProduct.CREATOR, parcel, arrayList, iA, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Portfolio.CREATOR, parcel, arrayList2, iA2, 1);
                }
                cfl.d dVarValueOf = cfl.d.valueOf(parcel.readString());
                cfl.c cVarValueOf = cfl.c.valueOf(parcel.readString());
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                int iC = 0;
                while (iC != i3) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList3, iC, 1);
                }
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList4.add(o.valueOf(parcel.readString()));
                }
                return new Margin(uuid, string, string2, bVarValueOf, jVarValueOf, arrayList, arrayList2, dVarValueOf, cVarValueOf, arrayList3, arrayList4, Beneficiary.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Margin[i];
            }
        }

        public Margin(UUID id10, String accountHolderId, String globalPersonalAccountId, cfl.b state, j accountHolderType, ArrayList tradingProducts, ArrayList portfolios, cfl.d allowedTrades, cfl.c allowedCashOperations, ArrayList holdingCurrencies, ArrayList permittedActions, Beneficiary beneficiary) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
            Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
            Intrinsics.checkNotNullParameter(portfolios, "portfolios");
            Intrinsics.checkNotNullParameter(allowedTrades, "allowedTrades");
            Intrinsics.checkNotNullParameter(allowedCashOperations, "allowedCashOperations");
            Intrinsics.checkNotNullParameter(holdingCurrencies, "holdingCurrencies");
            Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f105189a = id10;
            this.f105190b = accountHolderId;
            this.f105191c = globalPersonalAccountId;
            this.d = state;
            this.e = accountHolderType;
            this.f = tradingProducts;
            this.f105192g = portfolios;
            this.f105193h = allowedTrades;
            this.i = allowedCashOperations;
            this.f105194j = holdingCurrencies;
            this.k = permittedActions;
            this.f105195l = beneficiary;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List J() {
            return this.f105192g;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: T, reason: from getter */
        public final cfl.b getD() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final TradingAccountType W() {
            return TradingAccountType.Margin.f105271a;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: a */
        public final String getF105259c() {
            throw null;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: b, reason: from getter */
        public final cfl.c getF105254j() {
            return this.i;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: b8, reason: from getter */
        public final j getE() {
            return this.e;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: c, reason: from getter */
        public final cfl.d getI() {
            return this.f105193h;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List c0() {
            return this.f;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF105264c() {
            return this.f105191c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List e() {
            return this.f105194j;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Margin)) {
                return false;
            }
            Margin margin = (Margin) obj2;
            return Intrinsics.f(this.f105189a, margin.f105189a) && Intrinsics.f(this.f105190b, margin.f105190b) && Intrinsics.f(this.f105191c, margin.f105191c) && this.d == margin.d && this.e == margin.e && this.f.equals(margin.f) && this.f105192g.equals(margin.f105192g) && this.f105193h == margin.f105193h && this.i == margin.i && this.f105194j.equals(margin.f105194j) && this.k.equals(margin.k) && Intrinsics.f(this.f105195l, margin.f105195l);
        }

        public final int hashCode() {
            return this.f105195l.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105194j, (this.i.hashCode() + ((this.f105193h.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105192g, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, v7.f(this.e, (this.d.hashCode() + p.a.c(p.a.c(this.f105189a.hashCode() * 31, 31, this.f105190b), 31, this.f105191c)) * 31, 31), 31), 31)) * 31)) * 31, 31), 31);
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: j, reason: from getter */
        public final UUID getF105262a() {
            return this.f105189a;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: s, reason: from getter */
        public final Beneficiary getF() {
            return this.f105195l;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f105189a);
            dest.writeString(this.f105190b);
            dest.writeString(this.f105191c);
            dest.writeString(this.d.name());
            dest.writeString(this.e.name());
            Iterator itY = j6.a.y(this.f, dest);
            while (itY.hasNext()) {
                ((TradingProduct) itY.next()).writeToParcel(dest, i);
            }
            Iterator itY2 = j6.a.y(this.f105192g, dest);
            while (itY2.hasNext()) {
                ((Portfolio) itY2.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.f105193h.name());
            dest.writeString(this.i.name());
            Iterator itY3 = j6.a.y(this.f105194j, dest);
            while (itY3.hasNext()) {
                dest.writeSerializable((Serializable) itY3.next());
            }
            Iterator itY4 = j6.a.y(this.k, dest);
            while (itY4.hasNext()) {
                dest.writeString(((o) itY4.next()).name());
            }
            this.f105195l.writeToParcel(dest, i);
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List z() {
            return this.k;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$MoneyMarketFunds;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoneyMarketFunds extends TradingAccount {

        @NotNull
        public static final Parcelable.Creator<MoneyMarketFunds> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f105196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105198c;
        public final cfl.b d;
        public final j e;
        public final ArrayList f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f105199g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final cfl.d f105200h;
        public final cfl.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ArrayList f105201j;
        public final ArrayList k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Beneficiary f105202l;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                String string = parcel.readString();
                String string2 = parcel.readString();
                cfl.b bVarValueOf = cfl.b.valueOf(parcel.readString());
                j jVarValueOf = j.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TradingProduct.CREATOR, parcel, arrayList, iA, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Portfolio.CREATOR, parcel, arrayList2, iA2, 1);
                }
                cfl.d dVarValueOf = cfl.d.valueOf(parcel.readString());
                cfl.c cVarValueOf = cfl.c.valueOf(parcel.readString());
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                int iC = 0;
                while (iC != i3) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList3, iC, 1);
                }
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList4.add(o.valueOf(parcel.readString()));
                }
                return new MoneyMarketFunds(uuid, string, string2, bVarValueOf, jVarValueOf, arrayList, arrayList2, dVarValueOf, cVarValueOf, arrayList3, arrayList4, Beneficiary.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoneyMarketFunds[i];
            }
        }

        public MoneyMarketFunds(UUID id10, String accountHolderId, String globalPersonalAccountId, cfl.b state, j accountHolderType, ArrayList tradingProducts, ArrayList portfolios, cfl.d allowedTrades, cfl.c allowedCashOperations, ArrayList holdingCurrencies, ArrayList permittedActions, Beneficiary beneficiary) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
            Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
            Intrinsics.checkNotNullParameter(portfolios, "portfolios");
            Intrinsics.checkNotNullParameter(allowedTrades, "allowedTrades");
            Intrinsics.checkNotNullParameter(allowedCashOperations, "allowedCashOperations");
            Intrinsics.checkNotNullParameter(holdingCurrencies, "holdingCurrencies");
            Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f105196a = id10;
            this.f105197b = accountHolderId;
            this.f105198c = globalPersonalAccountId;
            this.d = state;
            this.e = accountHolderType;
            this.f = tradingProducts;
            this.f105199g = portfolios;
            this.f105200h = allowedTrades;
            this.i = allowedCashOperations;
            this.f105201j = holdingCurrencies;
            this.k = permittedActions;
            this.f105202l = beneficiary;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List J() {
            return this.f105199g;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: T, reason: from getter */
        public final cfl.b getD() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final TradingAccountType W() {
            return TradingAccountType.MoneyMarketFunds.f105272a;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: a */
        public final String getF105259c() {
            throw null;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: b, reason: from getter */
        public final cfl.c getF105254j() {
            return this.i;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: b8, reason: from getter */
        public final j getE() {
            return this.e;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: c, reason: from getter */
        public final cfl.d getI() {
            return this.f105200h;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List c0() {
            return this.f;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF105264c() {
            return this.f105198c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List e() {
            return this.f105201j;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MoneyMarketFunds)) {
                return false;
            }
            MoneyMarketFunds moneyMarketFunds = (MoneyMarketFunds) obj2;
            return Intrinsics.f(this.f105196a, moneyMarketFunds.f105196a) && Intrinsics.f(this.f105197b, moneyMarketFunds.f105197b) && Intrinsics.f(this.f105198c, moneyMarketFunds.f105198c) && this.d == moneyMarketFunds.d && this.e == moneyMarketFunds.e && this.f.equals(moneyMarketFunds.f) && this.f105199g.equals(moneyMarketFunds.f105199g) && this.f105200h == moneyMarketFunds.f105200h && this.i == moneyMarketFunds.i && this.f105201j.equals(moneyMarketFunds.f105201j) && this.k.equals(moneyMarketFunds.k) && Intrinsics.f(this.f105202l, moneyMarketFunds.f105202l);
        }

        public final int hashCode() {
            return this.f105202l.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105201j, (this.i.hashCode() + ((this.f105200h.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105199g, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, v7.f(this.e, (this.d.hashCode() + p.a.c(p.a.c(this.f105196a.hashCode() * 31, 31, this.f105197b), 31, this.f105198c)) * 31, 31), 31), 31)) * 31)) * 31, 31), 31);
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: j, reason: from getter */
        public final UUID getF105262a() {
            return this.f105196a;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: s, reason: from getter */
        public final Beneficiary getF() {
            return this.f105202l;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f105196a);
            dest.writeString(this.f105197b);
            dest.writeString(this.f105198c);
            dest.writeString(this.d.name());
            dest.writeString(this.e.name());
            Iterator itY = j6.a.y(this.f, dest);
            while (itY.hasNext()) {
                ((TradingProduct) itY.next()).writeToParcel(dest, i);
            }
            Iterator itY2 = j6.a.y(this.f105199g, dest);
            while (itY2.hasNext()) {
                ((Portfolio) itY2.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.f105200h.name());
            dest.writeString(this.i.name());
            Iterator itY3 = j6.a.y(this.f105201j, dest);
            while (itY3.hasNext()) {
                dest.writeSerializable((Serializable) itY3.next());
            }
            Iterator itY4 = j6.a.y(this.k, dest);
            while (itY4.hasNext()) {
                dest.writeString(((o) itY4.next()).name());
            }
            this.f105202l.writeToParcel(dest, i);
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List z() {
            return this.k;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$PaperTrading;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaperTrading extends TradingAccount {

        @NotNull
        public static final Parcelable.Creator<PaperTrading> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f105203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105205c;
        public final cfl.b d;
        public final j e;
        public final ArrayList f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f105206g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final cfl.d f105207h;
        public final cfl.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ArrayList f105208j;
        public final ArrayList k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Beneficiary f105209l;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                String string = parcel.readString();
                String string2 = parcel.readString();
                cfl.b bVarValueOf = cfl.b.valueOf(parcel.readString());
                j jVarValueOf = j.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TradingProduct.CREATOR, parcel, arrayList, iA, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Portfolio.CREATOR, parcel, arrayList2, iA2, 1);
                }
                cfl.d dVarValueOf = cfl.d.valueOf(parcel.readString());
                cfl.c cVarValueOf = cfl.c.valueOf(parcel.readString());
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                int iC = 0;
                while (iC != i3) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList3, iC, 1);
                }
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList4.add(o.valueOf(parcel.readString()));
                }
                return new PaperTrading(uuid, string, string2, bVarValueOf, jVarValueOf, arrayList, arrayList2, dVarValueOf, cVarValueOf, arrayList3, arrayList4, Beneficiary.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaperTrading[i];
            }
        }

        public PaperTrading(UUID id10, String accountHolderId, String globalPersonalAccountId, cfl.b state, j accountHolderType, ArrayList tradingProducts, ArrayList portfolios, cfl.d allowedTrades, cfl.c allowedCashOperations, ArrayList holdingCurrencies, ArrayList permittedActions, Beneficiary beneficiary) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
            Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
            Intrinsics.checkNotNullParameter(portfolios, "portfolios");
            Intrinsics.checkNotNullParameter(allowedTrades, "allowedTrades");
            Intrinsics.checkNotNullParameter(allowedCashOperations, "allowedCashOperations");
            Intrinsics.checkNotNullParameter(holdingCurrencies, "holdingCurrencies");
            Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f105203a = id10;
            this.f105204b = accountHolderId;
            this.f105205c = globalPersonalAccountId;
            this.d = state;
            this.e = accountHolderType;
            this.f = tradingProducts;
            this.f105206g = portfolios;
            this.f105207h = allowedTrades;
            this.i = allowedCashOperations;
            this.f105208j = holdingCurrencies;
            this.k = permittedActions;
            this.f105209l = beneficiary;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List J() {
            return this.f105206g;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: T, reason: from getter */
        public final cfl.b getD() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final TradingAccountType W() {
            return TradingAccountType.PaperTrading.f105273a;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: a */
        public final String getF105259c() {
            throw null;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: b, reason: from getter */
        public final cfl.c getF105254j() {
            return this.i;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: b8, reason: from getter */
        public final j getE() {
            return this.e;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: c, reason: from getter */
        public final cfl.d getI() {
            return this.f105207h;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List c0() {
            return this.f;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF105264c() {
            return this.f105205c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List e() {
            return this.f105208j;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaperTrading)) {
                return false;
            }
            PaperTrading paperTrading = (PaperTrading) obj2;
            return Intrinsics.f(this.f105203a, paperTrading.f105203a) && Intrinsics.f(this.f105204b, paperTrading.f105204b) && Intrinsics.f(this.f105205c, paperTrading.f105205c) && this.d == paperTrading.d && this.e == paperTrading.e && this.f.equals(paperTrading.f) && this.f105206g.equals(paperTrading.f105206g) && this.f105207h == paperTrading.f105207h && this.i == paperTrading.i && this.f105208j.equals(paperTrading.f105208j) && this.k.equals(paperTrading.k) && Intrinsics.f(this.f105209l, paperTrading.f105209l);
        }

        public final int hashCode() {
            return this.f105209l.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105208j, (this.i.hashCode() + ((this.f105207h.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105206g, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, v7.f(this.e, (this.d.hashCode() + p.a.c(p.a.c(this.f105203a.hashCode() * 31, 31, this.f105204b), 31, this.f105205c)) * 31, 31), 31), 31)) * 31)) * 31, 31), 31);
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: j, reason: from getter */
        public final UUID getF105262a() {
            return this.f105203a;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: s, reason: from getter */
        public final Beneficiary getF() {
            return this.f105209l;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f105203a);
            dest.writeString(this.f105204b);
            dest.writeString(this.f105205c);
            dest.writeString(this.d.name());
            dest.writeString(this.e.name());
            Iterator itY = j6.a.y(this.f, dest);
            while (itY.hasNext()) {
                ((TradingProduct) itY.next()).writeToParcel(dest, i);
            }
            Iterator itY2 = j6.a.y(this.f105206g, dest);
            while (itY2.hasNext()) {
                ((Portfolio) itY2.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.f105207h.name());
            dest.writeString(this.i.name());
            Iterator itY3 = j6.a.y(this.f105208j, dest);
            while (itY3.hasNext()) {
                dest.writeSerializable((Serializable) itY3.next());
            }
            Iterator itY4 = j6.a.y(this.k, dest);
            while (itY4.hasNext()) {
                dest.writeString(((o) itY4.next()).name());
            }
            this.f105209l.writeToParcel(dest, i);
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List z() {
            return this.k;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$Portfolio;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/shared/feature/wealth/models/trading_accounts/a", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Portfolio implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Portfolio> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f105210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.revolut.shared.feature.wealth.models.trading_accounts.a f105211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Instant f105212c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Portfolio((UUID) parcel.readSerializable(), com.revolut.shared.feature.wealth.models.trading_accounts.a.valueOf(parcel.readString()), (Instant) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Portfolio[i];
            }
        }

        public Portfolio(UUID id10, com.revolut.shared.feature.wealth.models.trading_accounts.a state, Instant createdDate) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(createdDate, "createdDate");
            this.f105210a = id10;
            this.f105211b = state;
            this.f105212c = createdDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Portfolio)) {
                return false;
            }
            Portfolio portfolio = (Portfolio) obj2;
            return Intrinsics.f(this.f105210a, portfolio.f105210a) && this.f105211b == portfolio.f105211b && Intrinsics.f(this.f105212c, portfolio.f105212c);
        }

        public final int hashCode() {
            return this.f105212c.hashCode() + ((this.f105211b.hashCode() + (this.f105210a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f105210a);
            dest.writeString(this.f105211b.name());
            dest.writeSerializable(this.f105212c);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$Robo;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount;", "<init>", "()V", "Regular", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$Robo$Regular;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Robo extends TradingAccount {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccountType.Robo f105213a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$Robo$Regular;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$Robo;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Regular extends Robo {

            @NotNull
            public static final Parcelable.Creator<Regular> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UUID f105214b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105215c;
            public final String d;
            public final cfl.b e;
            public final j f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final ArrayList f105216g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final ArrayList f105217h;
            public final cfl.d i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final cfl.c f105218j;
            public final ArrayList k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final ArrayList f105219l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final Beneficiary f105220m;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    UUID uuid = (UUID) parcel.readSerializable();
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    cfl.b bVarValueOf = cfl.b.valueOf(parcel.readString());
                    j jVarValueOf = j.valueOf(parcel.readString());
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(TradingProduct.CREATOR, parcel, arrayList, iA, 1);
                    }
                    int i2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i2);
                    int iA2 = 0;
                    while (iA2 != i2) {
                        iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Portfolio.CREATOR, parcel, arrayList2, iA2, 1);
                    }
                    cfl.d dVarValueOf = cfl.d.valueOf(parcel.readString());
                    cfl.c cVarValueOf = cfl.c.valueOf(parcel.readString());
                    int i3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i3);
                    int iC = 0;
                    while (iC != i3) {
                        iC = ch.qos.logback.core.util.a.c(parcel, arrayList3, iC, 1);
                    }
                    int i5 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i5);
                    for (int i6 = 0; i6 != i5; i6++) {
                        arrayList4.add(o.valueOf(parcel.readString()));
                    }
                    return new Regular(uuid, string, string2, bVarValueOf, jVarValueOf, arrayList, arrayList2, dVarValueOf, cVarValueOf, arrayList3, arrayList4, Beneficiary.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Regular[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Regular(UUID id10, String accountHolderId, String globalPersonalAccountId, cfl.b state, j accountHolderType, ArrayList tradingProducts, ArrayList portfolios, cfl.d allowedTrades, cfl.c allowedCashOperations, ArrayList holdingCurrencies, ArrayList permittedActions, Beneficiary beneficiary) {
                super(0);
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
                Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
                Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
                Intrinsics.checkNotNullParameter(portfolios, "portfolios");
                Intrinsics.checkNotNullParameter(allowedTrades, "allowedTrades");
                Intrinsics.checkNotNullParameter(allowedCashOperations, "allowedCashOperations");
                Intrinsics.checkNotNullParameter(holdingCurrencies, "holdingCurrencies");
                Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                this.f105214b = id10;
                this.f105215c = accountHolderId;
                this.d = globalPersonalAccountId;
                this.e = state;
                this.f = accountHolderType;
                this.f105216g = tradingProducts;
                this.f105217h = portfolios;
                this.i = allowedTrades;
                this.f105218j = allowedCashOperations;
                this.k = holdingCurrencies;
                this.f105219l = permittedActions;
                this.f105220m = beneficiary;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            public final List J() {
                return this.f105217h;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: T, reason: from getter */
            public final cfl.b getD() {
                return this.e;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF105259c() {
                return this.f105215c;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: b, reason: from getter */
            public final cfl.c getF105254j() {
                return this.f105218j;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: b8, reason: from getter */
            public final j getE() {
                return this.f;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: c, reason: from getter */
            public final cfl.d getI() {
                return this.i;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            public final List c0() {
                return this.f105216g;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getF105264c() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            public final List e() {
                return this.k;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Regular)) {
                    return false;
                }
                Regular regular = (Regular) obj2;
                return Intrinsics.f(this.f105214b, regular.f105214b) && Intrinsics.f(this.f105215c, regular.f105215c) && Intrinsics.f(this.d, regular.d) && this.e == regular.e && this.f == regular.f && this.f105216g.equals(regular.f105216g) && this.f105217h.equals(regular.f105217h) && this.i == regular.i && this.f105218j == regular.f105218j && this.k.equals(regular.k) && this.f105219l.equals(regular.f105219l) && Intrinsics.f(this.f105220m, regular.f105220m);
            }

            public final int hashCode() {
                return this.f105220m.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105219l, com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, (this.f105218j.hashCode() + ((this.i.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105217h, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105216g, v7.f(this.f, (this.e.hashCode() + p.a.c(p.a.c(this.f105214b.hashCode() * 31, 31, this.f105215c), 31, this.d)) * 31, 31), 31), 31)) * 31)) * 31, 31), 31);
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: j, reason: from getter */
            public final UUID getF105262a() {
                return this.f105214b;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: s, reason: from getter */
            public final Beneficiary getF() {
                return this.f105220m;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f105214b);
                dest.writeString(this.f105215c);
                dest.writeString(this.d);
                dest.writeString(this.e.name());
                dest.writeString(this.f.name());
                Iterator itY = j6.a.y(this.f105216g, dest);
                while (itY.hasNext()) {
                    ((TradingProduct) itY.next()).writeToParcel(dest, i);
                }
                Iterator itY2 = j6.a.y(this.f105217h, dest);
                while (itY2.hasNext()) {
                    ((Portfolio) itY2.next()).writeToParcel(dest, i);
                }
                dest.writeString(this.i.name());
                dest.writeString(this.f105218j.name());
                Iterator itY3 = j6.a.y(this.k, dest);
                while (itY3.hasNext()) {
                    dest.writeSerializable((Serializable) itY3.next());
                }
                Iterator itY4 = j6.a.y(this.f105219l, dest);
                while (itY4.hasNext()) {
                    dest.writeString(((o) itY4.next()).name());
                }
                this.f105220m.writeToParcel(dest, i);
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            public final List z() {
                return this.f105219l;
            }
        }

        public /* synthetic */ Robo(int i) {
            this();
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final TradingAccountType W() {
            return this.f105213a;
        }

        private Robo() {
            this.f105213a = TradingAccountType.Robo.f105274a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount;", "<init>", "()V", "Limit", "Isa", "Pea", "JIsa", "Unknown", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage$Isa;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage$JIsa;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage$Pea;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage$Unknown;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class TaxAdvantage extends TradingAccount {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccountType.Taa f105221a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage$Isa;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Isa extends TaxAdvantage {

            @NotNull
            public static final Parcelable.Creator<Isa> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UUID f105222b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105223c;
            public final String d;
            public final cfl.b e;
            public final j f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final ArrayList f105224g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final ArrayList f105225h;
            public final cfl.d i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final cfl.c f105226j;
            public final ArrayList k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final Limit f105227l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final ArrayList f105228m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final Beneficiary f105229n;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    UUID uuid = (UUID) parcel.readSerializable();
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    cfl.b bVarValueOf = cfl.b.valueOf(parcel.readString());
                    j jVarValueOf = j.valueOf(parcel.readString());
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(TradingProduct.CREATOR, parcel, arrayList, iA, 1);
                    }
                    int i2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i2);
                    int iA2 = 0;
                    while (iA2 != i2) {
                        iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Portfolio.CREATOR, parcel, arrayList2, iA2, 1);
                    }
                    cfl.d dVarValueOf = cfl.d.valueOf(parcel.readString());
                    cfl.c cVarValueOf = cfl.c.valueOf(parcel.readString());
                    int i3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i3);
                    int iC = 0;
                    while (iC != i3) {
                        iC = ch.qos.logback.core.util.a.c(parcel, arrayList3, iC, 1);
                    }
                    Limit limitCreateFromParcel = parcel.readInt() == 0 ? null : Limit.CREATOR.createFromParcel(parcel);
                    int i5 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i5);
                    for (int i6 = 0; i6 != i5; i6++) {
                        arrayList4.add(o.valueOf(parcel.readString()));
                    }
                    return new Isa(uuid, string, string2, bVarValueOf, jVarValueOf, arrayList, arrayList2, dVarValueOf, cVarValueOf, arrayList3, limitCreateFromParcel, arrayList4, Beneficiary.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Isa[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Isa(UUID id10, String accountHolderId, String globalPersonalAccountId, cfl.b state, j accountHolderType, ArrayList tradingProducts, ArrayList portfolios, cfl.d allowedTrades, cfl.c allowedCashOperations, ArrayList holdingCurrencies, Limit limit, ArrayList permittedActions, Beneficiary beneficiary) {
                super(0);
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
                Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
                Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
                Intrinsics.checkNotNullParameter(portfolios, "portfolios");
                Intrinsics.checkNotNullParameter(allowedTrades, "allowedTrades");
                Intrinsics.checkNotNullParameter(allowedCashOperations, "allowedCashOperations");
                Intrinsics.checkNotNullParameter(holdingCurrencies, "holdingCurrencies");
                Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                this.f105222b = id10;
                this.f105223c = accountHolderId;
                this.d = globalPersonalAccountId;
                this.e = state;
                this.f = accountHolderType;
                this.f105224g = tradingProducts;
                this.f105225h = portfolios;
                this.i = allowedTrades;
                this.f105226j = allowedCashOperations;
                this.k = holdingCurrencies;
                this.f105227l = limit;
                this.f105228m = permittedActions;
                this.f105229n = beneficiary;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            public final List J() {
                return this.f105225h;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: T, reason: from getter */
            public final cfl.b getD() {
                return this.e;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF105259c() {
                return this.f105223c;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: b, reason: from getter */
            public final cfl.c getF105254j() {
                return this.f105226j;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: b8, reason: from getter */
            public final j getE() {
                return this.f;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: c, reason: from getter */
            public final cfl.d getI() {
                return this.i;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            public final List c0() {
                return this.f105224g;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getF105264c() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            public final List e() {
                return this.k;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Isa)) {
                    return false;
                }
                Isa isa = (Isa) obj2;
                return Intrinsics.f(this.f105222b, isa.f105222b) && Intrinsics.f(this.f105223c, isa.f105223c) && Intrinsics.f(this.d, isa.d) && this.e == isa.e && this.f == isa.f && this.f105224g.equals(isa.f105224g) && this.f105225h.equals(isa.f105225h) && this.i == isa.i && this.f105226j == isa.f105226j && this.k.equals(isa.k) && Intrinsics.f(this.f105227l, isa.f105227l) && this.f105228m.equals(isa.f105228m) && Intrinsics.f(this.f105229n, isa.f105229n);
            }

            public final int hashCode() {
                int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, (this.f105226j.hashCode() + ((this.i.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105225h, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105224g, v7.f(this.f, (this.e.hashCode() + p.a.c(p.a.c(this.f105222b.hashCode() * 31, 31, this.f105223c), 31, this.d)) * 31, 31), 31), 31)) * 31)) * 31, 31);
                Limit limit = this.f105227l;
                return this.f105229n.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105228m, (iB + (limit == null ? 0 : limit.hashCode())) * 31, 31);
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: j, reason: from getter */
            public final UUID getF105262a() {
                return this.f105222b;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: s, reason: from getter */
            public final Beneficiary getF() {
                return this.f105229n;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage
            /* JADX INFO: renamed from: w, reason: from getter */
            public final Limit getF105255l() {
                return this.f105227l;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f105222b);
                dest.writeString(this.f105223c);
                dest.writeString(this.d);
                dest.writeString(this.e.name());
                dest.writeString(this.f.name());
                Iterator itY = j6.a.y(this.f105224g, dest);
                while (itY.hasNext()) {
                    ((TradingProduct) itY.next()).writeToParcel(dest, i);
                }
                Iterator itY2 = j6.a.y(this.f105225h, dest);
                while (itY2.hasNext()) {
                    ((Portfolio) itY2.next()).writeToParcel(dest, i);
                }
                dest.writeString(this.i.name());
                dest.writeString(this.f105226j.name());
                Iterator itY3 = j6.a.y(this.k, dest);
                while (itY3.hasNext()) {
                    dest.writeSerializable((Serializable) itY3.next());
                }
                Limit limit = this.f105227l;
                if (limit == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    limit.writeToParcel(dest, i);
                }
                Iterator itY4 = j6.a.y(this.f105228m, dest);
                while (itY4.hasNext()) {
                    dest.writeString(((o) itY4.next()).name());
                }
                this.f105229n.writeToParcel(dest, i);
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            public final List z() {
                return this.f105228m;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage$JIsa;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage;", "<init>", "()V", "Personal", "Custodian", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage$JIsa$Custodian;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage$JIsa$Personal;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class JIsa extends TaxAdvantage {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage$JIsa$Custodian;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage$JIsa;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Custodian extends JIsa {

                @NotNull
                public static final Parcelable.Creator<Custodian> CREATOR = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final UUID f105230b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f105231c;
                public final String d;
                public final cfl.b e;
                public final j f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final ArrayList f105232g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final ArrayList f105233h;
                public final cfl.d i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final cfl.c f105234j;
                public final ArrayList k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final Limit f105235l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final ArrayList f105236m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final Beneficiary f105237n;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        UUID uuid = (UUID) parcel.readSerializable();
                        String string = parcel.readString();
                        String string2 = parcel.readString();
                        cfl.b bVarValueOf = cfl.b.valueOf(parcel.readString());
                        j jVarValueOf = j.valueOf(parcel.readString());
                        int i = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i);
                        int iA = 0;
                        while (iA != i) {
                            iA = org.bouncycastle.jcajce.provider.digest.a.a(TradingProduct.CREATOR, parcel, arrayList, iA, 1);
                        }
                        int i2 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i2);
                        int iA2 = 0;
                        while (iA2 != i2) {
                            iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Portfolio.CREATOR, parcel, arrayList2, iA2, 1);
                        }
                        cfl.d dVarValueOf = cfl.d.valueOf(parcel.readString());
                        cfl.c cVarValueOf = cfl.c.valueOf(parcel.readString());
                        int i3 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(i3);
                        int iC = 0;
                        while (iC != i3) {
                            iC = ch.qos.logback.core.util.a.c(parcel, arrayList3, iC, 1);
                        }
                        Limit limitCreateFromParcel = parcel.readInt() == 0 ? null : Limit.CREATOR.createFromParcel(parcel);
                        int i5 = parcel.readInt();
                        ArrayList arrayList4 = new ArrayList(i5);
                        for (int i6 = 0; i6 != i5; i6++) {
                            arrayList4.add(o.valueOf(parcel.readString()));
                        }
                        return new Custodian(uuid, string, string2, bVarValueOf, jVarValueOf, arrayList, arrayList2, dVarValueOf, cVarValueOf, arrayList3, limitCreateFromParcel, arrayList4, Beneficiary.CREATOR.createFromParcel(parcel));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Custodian[i];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Custodian(UUID id10, String accountHolderId, String globalPersonalAccountId, cfl.b state, j accountHolderType, ArrayList tradingProducts, ArrayList portfolios, cfl.d allowedTrades, cfl.c allowedCashOperations, ArrayList holdingCurrencies, Limit limit, ArrayList permittedActions, Beneficiary beneficiary) {
                    super(0);
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
                    Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
                    Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
                    Intrinsics.checkNotNullParameter(portfolios, "portfolios");
                    Intrinsics.checkNotNullParameter(allowedTrades, "allowedTrades");
                    Intrinsics.checkNotNullParameter(allowedCashOperations, "allowedCashOperations");
                    Intrinsics.checkNotNullParameter(holdingCurrencies, "holdingCurrencies");
                    Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
                    Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                    this.f105230b = id10;
                    this.f105231c = accountHolderId;
                    this.d = globalPersonalAccountId;
                    this.e = state;
                    this.f = accountHolderType;
                    this.f105232g = tradingProducts;
                    this.f105233h = portfolios;
                    this.i = allowedTrades;
                    this.f105234j = allowedCashOperations;
                    this.k = holdingCurrencies;
                    this.f105235l = limit;
                    this.f105236m = permittedActions;
                    this.f105237n = beneficiary;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                public final List J() {
                    return this.f105233h;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                /* JADX INFO: renamed from: T, reason: from getter */
                public final cfl.b getD() {
                    return this.e;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getF105259c() {
                    return this.f105231c;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                /* JADX INFO: renamed from: b, reason: from getter */
                public final cfl.c getF105254j() {
                    return this.f105234j;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                /* JADX INFO: renamed from: b8, reason: from getter */
                public final j getE() {
                    return this.f;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                /* JADX INFO: renamed from: c, reason: from getter */
                public final cfl.d getI() {
                    return this.i;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                public final List c0() {
                    return this.f105232g;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                /* JADX INFO: renamed from: d, reason: from getter */
                public final String getF105264c() {
                    return this.d;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                public final List e() {
                    return this.k;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Custodian)) {
                        return false;
                    }
                    Custodian custodian = (Custodian) obj2;
                    return Intrinsics.f(this.f105230b, custodian.f105230b) && Intrinsics.f(this.f105231c, custodian.f105231c) && Intrinsics.f(this.d, custodian.d) && this.e == custodian.e && this.f == custodian.f && this.f105232g.equals(custodian.f105232g) && this.f105233h.equals(custodian.f105233h) && this.i == custodian.i && this.f105234j == custodian.f105234j && this.k.equals(custodian.k) && Intrinsics.f(this.f105235l, custodian.f105235l) && this.f105236m.equals(custodian.f105236m) && Intrinsics.f(this.f105237n, custodian.f105237n);
                }

                public final int hashCode() {
                    int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, (this.f105234j.hashCode() + ((this.i.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105233h, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105232g, v7.f(this.f, (this.e.hashCode() + p.a.c(p.a.c(this.f105230b.hashCode() * 31, 31, this.f105231c), 31, this.d)) * 31, 31), 31), 31)) * 31)) * 31, 31);
                    Limit limit = this.f105235l;
                    return this.f105237n.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105236m, (iB + (limit == null ? 0 : limit.hashCode())) * 31, 31);
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                /* JADX INFO: renamed from: j, reason: from getter */
                public final UUID getF105262a() {
                    return this.f105230b;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                /* JADX INFO: renamed from: s, reason: from getter */
                public final Beneficiary getF() {
                    return this.f105237n;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage
                /* JADX INFO: renamed from: w, reason: from getter */
                public final Limit getF105255l() {
                    return this.f105235l;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f105230b);
                    dest.writeString(this.f105231c);
                    dest.writeString(this.d);
                    dest.writeString(this.e.name());
                    dest.writeString(this.f.name());
                    Iterator itY = j6.a.y(this.f105232g, dest);
                    while (itY.hasNext()) {
                        ((TradingProduct) itY.next()).writeToParcel(dest, i);
                    }
                    Iterator itY2 = j6.a.y(this.f105233h, dest);
                    while (itY2.hasNext()) {
                        ((Portfolio) itY2.next()).writeToParcel(dest, i);
                    }
                    dest.writeString(this.i.name());
                    dest.writeString(this.f105234j.name());
                    Iterator itY3 = j6.a.y(this.k, dest);
                    while (itY3.hasNext()) {
                        dest.writeSerializable((Serializable) itY3.next());
                    }
                    Limit limit = this.f105235l;
                    if (limit == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        limit.writeToParcel(dest, i);
                    }
                    Iterator itY4 = j6.a.y(this.f105236m, dest);
                    while (itY4.hasNext()) {
                        dest.writeString(((o) itY4.next()).name());
                    }
                    this.f105237n.writeToParcel(dest, i);
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                public final List z() {
                    return this.f105236m;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage$JIsa$Personal;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage$JIsa;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Personal extends JIsa {

                @NotNull
                public static final Parcelable.Creator<Personal> CREATOR = new a();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final UUID f105238b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f105239c;
                public final String d;
                public final cfl.b e;
                public final j f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final ArrayList f105240g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final ArrayList f105241h;
                public final cfl.d i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final cfl.c f105242j;
                public final ArrayList k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final Limit f105243l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final ArrayList f105244m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final Beneficiary f105245n;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        UUID uuid = (UUID) parcel.readSerializable();
                        String string = parcel.readString();
                        String string2 = parcel.readString();
                        cfl.b bVarValueOf = cfl.b.valueOf(parcel.readString());
                        j jVarValueOf = j.valueOf(parcel.readString());
                        int i = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i);
                        int iA = 0;
                        while (iA != i) {
                            iA = org.bouncycastle.jcajce.provider.digest.a.a(TradingProduct.CREATOR, parcel, arrayList, iA, 1);
                        }
                        int i2 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i2);
                        int iA2 = 0;
                        while (iA2 != i2) {
                            iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Portfolio.CREATOR, parcel, arrayList2, iA2, 1);
                        }
                        cfl.d dVarValueOf = cfl.d.valueOf(parcel.readString());
                        cfl.c cVarValueOf = cfl.c.valueOf(parcel.readString());
                        int i3 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(i3);
                        int iC = 0;
                        while (iC != i3) {
                            iC = ch.qos.logback.core.util.a.c(parcel, arrayList3, iC, 1);
                        }
                        Limit limitCreateFromParcel = parcel.readInt() == 0 ? null : Limit.CREATOR.createFromParcel(parcel);
                        int i5 = parcel.readInt();
                        ArrayList arrayList4 = new ArrayList(i5);
                        for (int i6 = 0; i6 != i5; i6++) {
                            arrayList4.add(o.valueOf(parcel.readString()));
                        }
                        return new Personal(uuid, string, string2, bVarValueOf, jVarValueOf, arrayList, arrayList2, dVarValueOf, cVarValueOf, arrayList3, limitCreateFromParcel, arrayList4, Beneficiary.CREATOR.createFromParcel(parcel));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Personal[i];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Personal(UUID id10, String accountHolderId, String globalPersonalAccountId, cfl.b state, j accountHolderType, ArrayList tradingProducts, ArrayList portfolios, cfl.d allowedTrades, cfl.c allowedCashOperations, ArrayList holdingCurrencies, Limit limit, ArrayList permittedActions, Beneficiary beneficiary) {
                    super(0);
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
                    Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
                    Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
                    Intrinsics.checkNotNullParameter(portfolios, "portfolios");
                    Intrinsics.checkNotNullParameter(allowedTrades, "allowedTrades");
                    Intrinsics.checkNotNullParameter(allowedCashOperations, "allowedCashOperations");
                    Intrinsics.checkNotNullParameter(holdingCurrencies, "holdingCurrencies");
                    Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
                    Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                    this.f105238b = id10;
                    this.f105239c = accountHolderId;
                    this.d = globalPersonalAccountId;
                    this.e = state;
                    this.f = accountHolderType;
                    this.f105240g = tradingProducts;
                    this.f105241h = portfolios;
                    this.i = allowedTrades;
                    this.f105242j = allowedCashOperations;
                    this.k = holdingCurrencies;
                    this.f105243l = limit;
                    this.f105244m = permittedActions;
                    this.f105245n = beneficiary;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                public final List J() {
                    return this.f105241h;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                /* JADX INFO: renamed from: T, reason: from getter */
                public final cfl.b getD() {
                    return this.e;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getF105259c() {
                    return this.f105239c;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                /* JADX INFO: renamed from: b, reason: from getter */
                public final cfl.c getF105254j() {
                    return this.f105242j;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                /* JADX INFO: renamed from: b8, reason: from getter */
                public final j getE() {
                    return this.f;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                /* JADX INFO: renamed from: c, reason: from getter */
                public final cfl.d getI() {
                    return this.i;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                public final List c0() {
                    return this.f105240g;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                /* JADX INFO: renamed from: d, reason: from getter */
                public final String getF105264c() {
                    return this.d;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                public final List e() {
                    return this.k;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof Personal)) {
                        return false;
                    }
                    Personal personal = (Personal) obj2;
                    return Intrinsics.f(this.f105238b, personal.f105238b) && Intrinsics.f(this.f105239c, personal.f105239c) && Intrinsics.f(this.d, personal.d) && this.e == personal.e && this.f == personal.f && this.f105240g.equals(personal.f105240g) && this.f105241h.equals(personal.f105241h) && this.i == personal.i && this.f105242j == personal.f105242j && this.k.equals(personal.k) && Intrinsics.f(this.f105243l, personal.f105243l) && this.f105244m.equals(personal.f105244m) && Intrinsics.f(this.f105245n, personal.f105245n);
                }

                public final int hashCode() {
                    int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, (this.f105242j.hashCode() + ((this.i.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105241h, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105240g, v7.f(this.f, (this.e.hashCode() + p.a.c(p.a.c(this.f105238b.hashCode() * 31, 31, this.f105239c), 31, this.d)) * 31, 31), 31), 31)) * 31)) * 31, 31);
                    Limit limit = this.f105243l;
                    return this.f105245n.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105244m, (iB + (limit == null ? 0 : limit.hashCode())) * 31, 31);
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                /* JADX INFO: renamed from: j, reason: from getter */
                public final UUID getF105262a() {
                    return this.f105238b;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                /* JADX INFO: renamed from: s, reason: from getter */
                public final Beneficiary getF() {
                    return this.f105245n;
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage
                /* JADX INFO: renamed from: w, reason: from getter */
                public final Limit getF105255l() {
                    return this.f105243l;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f105238b);
                    dest.writeString(this.f105239c);
                    dest.writeString(this.d);
                    dest.writeString(this.e.name());
                    dest.writeString(this.f.name());
                    Iterator itY = j6.a.y(this.f105240g, dest);
                    while (itY.hasNext()) {
                        ((TradingProduct) itY.next()).writeToParcel(dest, i);
                    }
                    Iterator itY2 = j6.a.y(this.f105241h, dest);
                    while (itY2.hasNext()) {
                        ((Portfolio) itY2.next()).writeToParcel(dest, i);
                    }
                    dest.writeString(this.i.name());
                    dest.writeString(this.f105242j.name());
                    Iterator itY3 = j6.a.y(this.k, dest);
                    while (itY3.hasNext()) {
                        dest.writeSerializable((Serializable) itY3.next());
                    }
                    Limit limit = this.f105243l;
                    if (limit == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        limit.writeToParcel(dest, i);
                    }
                    Iterator itY4 = j6.a.y(this.f105244m, dest);
                    while (itY4.hasNext()) {
                        dest.writeString(((o) itY4.next()).name());
                    }
                    this.f105245n.writeToParcel(dest, i);
                }

                @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
                public final List z() {
                    return this.f105244m;
                }
            }

            private JIsa() {
                super(0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage$Limit;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "TopUpLimit", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Limit implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Limit> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TopUpLimit f105246a;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage$Limit$TopUpLimit;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class TopUpLimit implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<TopUpLimit> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final dj0.d f105247a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final dj0.d f105248b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final dj0.d f105249c;
                public final Long d;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new TopUpLimit((dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new TopUpLimit[i];
                    }
                }

                public TopUpLimit(dj0.d allowance, dj0.d used, dj0.d remaining, Long l2) {
                    Intrinsics.checkNotNullParameter(allowance, "allowance");
                    Intrinsics.checkNotNullParameter(used, "used");
                    Intrinsics.checkNotNullParameter(remaining, "remaining");
                    this.f105247a = allowance;
                    this.f105248b = used;
                    this.f105249c = remaining;
                    this.d = l2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof TopUpLimit)) {
                        return false;
                    }
                    TopUpLimit topUpLimit = (TopUpLimit) obj2;
                    return Intrinsics.f(this.f105247a, topUpLimit.f105247a) && Intrinsics.f(this.f105248b, topUpLimit.f105248b) && Intrinsics.f(this.f105249c, topUpLimit.f105249c) && Intrinsics.f(this.d, topUpLimit.d);
                }

                public final int hashCode() {
                    int iC = v7.c(v7.c(this.f105247a.hashCode() * 31, 31, this.f105248b), 31, this.f105249c);
                    Long l2 = this.d;
                    return iC + (l2 == null ? 0 : l2.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f105247a);
                    dest.writeSerializable(this.f105248b);
                    dest.writeSerializable(this.f105249c);
                    Long l2 = this.d;
                    if (l2 == null) {
                        dest.writeInt(0);
                    } else {
                        m72.b.A(dest, 1, l2);
                    }
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Limit(parcel.readInt() == 0 ? null : TopUpLimit.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Limit[i];
                }
            }

            public Limit(TopUpLimit topUpLimit) {
                this.f105246a = topUpLimit;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Limit) && Intrinsics.f(this.f105246a, ((Limit) obj2).f105246a);
            }

            public final int hashCode() {
                TopUpLimit topUpLimit = this.f105246a;
                if (topUpLimit == null) {
                    return 0;
                }
                return topUpLimit.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                TopUpLimit topUpLimit = this.f105246a;
                if (topUpLimit == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    topUpLimit.writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage$Pea;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Pea extends TaxAdvantage {

            @NotNull
            public static final Parcelable.Creator<Pea> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UUID f105250b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105251c;
            public final String d;
            public final cfl.b e;
            public final j f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final ArrayList f105252g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final ArrayList f105253h;
            public final cfl.d i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final cfl.c f105254j;
            public final ArrayList k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final Limit f105255l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final ArrayList f105256m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final Beneficiary f105257n;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    UUID uuid = (UUID) parcel.readSerializable();
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    cfl.b bVarValueOf = cfl.b.valueOf(parcel.readString());
                    j jVarValueOf = j.valueOf(parcel.readString());
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(TradingProduct.CREATOR, parcel, arrayList, iA, 1);
                    }
                    int i2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i2);
                    int iA2 = 0;
                    while (iA2 != i2) {
                        iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Portfolio.CREATOR, parcel, arrayList2, iA2, 1);
                    }
                    cfl.d dVarValueOf = cfl.d.valueOf(parcel.readString());
                    cfl.c cVarValueOf = cfl.c.valueOf(parcel.readString());
                    int i3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i3);
                    int iC = 0;
                    while (iC != i3) {
                        iC = ch.qos.logback.core.util.a.c(parcel, arrayList3, iC, 1);
                    }
                    Limit limitCreateFromParcel = parcel.readInt() == 0 ? null : Limit.CREATOR.createFromParcel(parcel);
                    int i5 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i5);
                    for (int i6 = 0; i6 != i5; i6++) {
                        arrayList4.add(o.valueOf(parcel.readString()));
                    }
                    return new Pea(uuid, string, string2, bVarValueOf, jVarValueOf, arrayList, arrayList2, dVarValueOf, cVarValueOf, arrayList3, limitCreateFromParcel, arrayList4, Beneficiary.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Pea[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Pea(UUID id10, String accountHolderId, String globalPersonalAccountId, cfl.b state, j accountHolderType, ArrayList tradingProducts, ArrayList portfolios, cfl.d allowedTrades, cfl.c allowedCashOperations, ArrayList holdingCurrencies, Limit limit, ArrayList permittedActions, Beneficiary beneficiary) {
                super(0);
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
                Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
                Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
                Intrinsics.checkNotNullParameter(portfolios, "portfolios");
                Intrinsics.checkNotNullParameter(allowedTrades, "allowedTrades");
                Intrinsics.checkNotNullParameter(allowedCashOperations, "allowedCashOperations");
                Intrinsics.checkNotNullParameter(holdingCurrencies, "holdingCurrencies");
                Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                this.f105250b = id10;
                this.f105251c = accountHolderId;
                this.d = globalPersonalAccountId;
                this.e = state;
                this.f = accountHolderType;
                this.f105252g = tradingProducts;
                this.f105253h = portfolios;
                this.i = allowedTrades;
                this.f105254j = allowedCashOperations;
                this.k = holdingCurrencies;
                this.f105255l = limit;
                this.f105256m = permittedActions;
                this.f105257n = beneficiary;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            public final List J() {
                return this.f105253h;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: T, reason: from getter */
            public final cfl.b getD() {
                return this.e;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF105259c() {
                return this.f105251c;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: b, reason: from getter */
            public final cfl.c getF105254j() {
                return this.f105254j;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: b8, reason: from getter */
            public final j getE() {
                return this.f;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: c, reason: from getter */
            public final cfl.d getI() {
                return this.i;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            public final List c0() {
                return this.f105252g;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getF105264c() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            public final List e() {
                return this.k;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Pea)) {
                    return false;
                }
                Pea pea2 = (Pea) obj2;
                return Intrinsics.f(this.f105250b, pea2.f105250b) && Intrinsics.f(this.f105251c, pea2.f105251c) && Intrinsics.f(this.d, pea2.d) && this.e == pea2.e && this.f == pea2.f && this.f105252g.equals(pea2.f105252g) && this.f105253h.equals(pea2.f105253h) && this.i == pea2.i && this.f105254j == pea2.f105254j && this.k.equals(pea2.k) && Intrinsics.f(this.f105255l, pea2.f105255l) && this.f105256m.equals(pea2.f105256m) && Intrinsics.f(this.f105257n, pea2.f105257n);
            }

            public final int hashCode() {
                int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, (this.f105254j.hashCode() + ((this.i.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105253h, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105252g, v7.f(this.f, (this.e.hashCode() + p.a.c(p.a.c(this.f105250b.hashCode() * 31, 31, this.f105251c), 31, this.d)) * 31, 31), 31), 31)) * 31)) * 31, 31);
                Limit limit = this.f105255l;
                return this.f105257n.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105256m, (iB + (limit == null ? 0 : limit.hashCode())) * 31, 31);
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: j, reason: from getter */
            public final UUID getF105262a() {
                return this.f105250b;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: s, reason: from getter */
            public final Beneficiary getF() {
                return this.f105257n;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage
            /* JADX INFO: renamed from: w, reason: from getter */
            public final Limit getF105255l() {
                return this.f105255l;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f105250b);
                dest.writeString(this.f105251c);
                dest.writeString(this.d);
                dest.writeString(this.e.name());
                dest.writeString(this.f.name());
                Iterator itY = j6.a.y(this.f105252g, dest);
                while (itY.hasNext()) {
                    ((TradingProduct) itY.next()).writeToParcel(dest, i);
                }
                Iterator itY2 = j6.a.y(this.f105253h, dest);
                while (itY2.hasNext()) {
                    ((Portfolio) itY2.next()).writeToParcel(dest, i);
                }
                dest.writeString(this.i.name());
                dest.writeString(this.f105254j.name());
                Iterator itY3 = j6.a.y(this.k, dest);
                while (itY3.hasNext()) {
                    dest.writeSerializable((Serializable) itY3.next());
                }
                Limit limit = this.f105255l;
                if (limit == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    limit.writeToParcel(dest, i);
                }
                Iterator itY4 = j6.a.y(this.f105256m, dest);
                while (itY4.hasNext()) {
                    dest.writeString(((o) itY4.next()).name());
                }
                this.f105257n.writeToParcel(dest, i);
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            public final List z() {
                return this.f105256m;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage$Unknown;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$TaxAdvantage;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Unknown extends TaxAdvantage {

            @NotNull
            public static final Parcelable.Creator<Unknown> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UUID f105258b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105259c;
            public final String d;
            public final cfl.b e;
            public final j f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final ArrayList f105260g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final Beneficiary f105261h;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    UUID uuid = (UUID) parcel.readSerializable();
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    cfl.b bVarValueOf = cfl.b.valueOf(parcel.readString());
                    j jVarValueOf = j.valueOf(parcel.readString());
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(TradingProduct.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new Unknown(uuid, string, string2, bVarValueOf, jVarValueOf, arrayList, Beneficiary.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Unknown[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unknown(UUID id10, String accountHolderId, String globalPersonalAccountId, cfl.b state, j accountHolderType, ArrayList tradingProducts, Beneficiary beneficiary) {
                super(0);
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
                Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
                Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                this.f105258b = id10;
                this.f105259c = accountHolderId;
                this.d = globalPersonalAccountId;
                this.e = state;
                this.f = accountHolderType;
                this.f105260g = tradingProducts;
                this.f105261h = beneficiary;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            public final List J() {
                return f0.f322471a;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: T, reason: from getter */
            public final cfl.b getD() {
                return this.e;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF105259c() {
                return this.f105259c;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: b */
            public final cfl.c getF105254j() {
                return cfl.c.NONE;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: b8, reason: from getter */
            public final j getE() {
                return this.f;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: c */
            public final cfl.d getI() {
                return cfl.d.NONE;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            public final List c0() {
                return this.f105260g;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getF105264c() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            public final List e() {
                return f0.f322471a;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Unknown)) {
                    return false;
                }
                Unknown unknown = (Unknown) obj2;
                return Intrinsics.f(this.f105258b, unknown.f105258b) && Intrinsics.f(this.f105259c, unknown.f105259c) && Intrinsics.f(this.d, unknown.d) && this.e == unknown.e && this.f == unknown.f && this.f105260g.equals(unknown.f105260g) && Intrinsics.f(this.f105261h, unknown.f105261h);
            }

            public final int hashCode() {
                return this.f105261h.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105260g, v7.f(this.f, (this.e.hashCode() + p.a.c(p.a.c(this.f105258b.hashCode() * 31, 31, this.f105259c), 31, this.d)) * 31, 31), 31);
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: j, reason: from getter */
            public final UUID getF105262a() {
                return this.f105258b;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            /* JADX INFO: renamed from: s, reason: from getter */
            public final Beneficiary getF() {
                return this.f105261h;
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage
            /* JADX INFO: renamed from: w */
            public final Limit getF105255l() {
                return null;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f105258b);
                dest.writeString(this.f105259c);
                dest.writeString(this.d);
                dest.writeString(this.e.name());
                dest.writeString(this.f.name());
                Iterator itY = j6.a.y(this.f105260g, dest);
                while (itY.hasNext()) {
                    ((TradingProduct) itY.next()).writeToParcel(dest, i);
                }
                this.f105261h.writeToParcel(dest, i);
            }

            @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
            public final List z() {
                return f0.f322471a;
            }
        }

        public /* synthetic */ TaxAdvantage(int i) {
            this();
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final TradingAccountType W() {
            return this.f105221a;
        }

        /* JADX INFO: renamed from: w */
        public abstract Limit getF105255l();

        private TaxAdvantage() {
            this.f105221a = TradingAccountType.Taa.f105275a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount$Unknown;", "Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccount;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unknown extends TradingAccount {

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f105262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105264c;
        public final cfl.b d;
        public final j e;
        public final Beneficiary f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Unknown((UUID) parcel.readSerializable(), parcel.readString(), parcel.readString(), cfl.b.valueOf(parcel.readString()), j.valueOf(parcel.readString()), Beneficiary.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        public Unknown(UUID id10, String accountHolderId, String globalPersonalAccountId, cfl.b state, j accountHolderType, Beneficiary beneficiary) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
            Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f105262a = id10;
            this.f105263b = accountHolderId;
            this.f105264c = globalPersonalAccountId;
            this.d = state;
            this.e = accountHolderType;
            this.f = beneficiary;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List J() {
            return f0.f322471a;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: T, reason: from getter */
        public final cfl.b getD() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final TradingAccountType W() {
            return TradingAccountType.Unknown.f105276a;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: a */
        public final String getF105259c() {
            throw null;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: b */
        public final cfl.c getF105254j() {
            return cfl.c.NONE;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: b8, reason: from getter */
        public final j getE() {
            return this.e;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: c */
        public final cfl.d getI() {
            return cfl.d.NONE;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List c0() {
            return f0.f322471a;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF105264c() {
            return this.f105264c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List e() {
            return f0.f322471a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Unknown)) {
                return false;
            }
            Unknown unknown = (Unknown) obj2;
            return Intrinsics.f(this.f105262a, unknown.f105262a) && Intrinsics.f(this.f105263b, unknown.f105263b) && Intrinsics.f(this.f105264c, unknown.f105264c) && this.d == unknown.d && this.e == unknown.e && Intrinsics.f(this.f, unknown.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + v7.f(this.e, (this.d.hashCode() + p.a.c(p.a.c(this.f105262a.hashCode() * 31, 31, this.f105263b), 31, this.f105264c)) * 31, 31);
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: j, reason: from getter */
        public final UUID getF105262a() {
            return this.f105262a;
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        /* JADX INFO: renamed from: s, reason: from getter */
        public final Beneficiary getF() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f105262a);
            dest.writeString(this.f105263b);
            dest.writeString(this.f105264c);
            dest.writeString(this.d.name());
            dest.writeString(this.e.name());
            this.f.writeToParcel(dest, i);
        }

        @Override // com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount
        public final List z() {
            return f0.f322471a;
        }
    }

    private TradingAccount() {
    }

    public abstract List J();

    /* JADX INFO: renamed from: T */
    public abstract cfl.b getD();

    public abstract TradingAccountType W();

    /* JADX INFO: renamed from: a */
    public abstract String getF105259c();

    /* JADX INFO: renamed from: b */
    public abstract cfl.c getF105254j();

    /* JADX INFO: renamed from: b8 */
    public abstract j getE();

    /* JADX INFO: renamed from: c */
    public abstract cfl.d getI();

    public abstract List c0();

    /* JADX INFO: renamed from: d */
    public abstract String getF105264c();

    public abstract List e();

    /* JADX INFO: renamed from: j */
    public abstract UUID getF105262a();

    /* JADX INFO: renamed from: s */
    public abstract Beneficiary getF();

    public abstract List z();
}
