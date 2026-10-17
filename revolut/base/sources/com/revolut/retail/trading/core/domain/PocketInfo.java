package com.revolut.retail.trading.core.domain;

import a10.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/trading/core/domain/PocketInfo;", "Landroid/os/Parcelable;", "CurrencyPocket", "CommodityPocket", "InvestPocket", "CryptoPocket", "Vault", "Saving", "Joint", "Pro", "CreditCard", "Lcom/revolut/retail/trading/core/domain/PocketInfo$CommodityPocket;", "Lcom/revolut/retail/trading/core/domain/PocketInfo$CreditCard;", "Lcom/revolut/retail/trading/core/domain/PocketInfo$CryptoPocket;", "Lcom/revolut/retail/trading/core/domain/PocketInfo$CurrencyPocket;", "Lcom/revolut/retail/trading/core/domain/PocketInfo$InvestPocket;", "Lcom/revolut/retail/trading/core/domain/PocketInfo$Joint;", "Lcom/revolut/retail/trading/core/domain/PocketInfo$Pro;", "Lcom/revolut/retail/trading/core/domain/PocketInfo$Saving;", "Lcom/revolut/retail/trading/core/domain/PocketInfo$Vault;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PocketInfo extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/PocketInfo$CommodityPocket;", "Lcom/revolut/retail/trading/core/domain/PocketInfo;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CommodityPocket implements PocketInfo {

        @NotNull
        public static final Parcelable.Creator<CommodityPocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f104453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f104454c;
        public final PocketOwnerInfo d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CommodityPocket(parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : PocketOwnerInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CommodityPocket[i];
            }
        }

        public CommodityPocket(String pocketId, d balance, d dVar, PocketOwnerInfo pocketOwnerInfo) {
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(balance, "balance");
            this.f104452a = pocketId;
            this.f104453b = balance;
            this.f104454c = dVar;
            this.d = pocketOwnerInfo;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: A7, reason: from getter */
        public final PocketOwnerInfo getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CommodityPocket)) {
                return false;
            }
            CommodityPocket commodityPocket = (CommodityPocket) obj2;
            return Intrinsics.f(this.f104452a, commodityPocket.f104452a) && Intrinsics.f(this.f104453b, commodityPocket.f104453b) && Intrinsics.f(this.f104454c, commodityPocket.f104454c) && Intrinsics.f(this.d, commodityPocket.d);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getBalance, reason: from getter */
        public final d getF104478b() {
            return this.f104453b;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF104477a() {
            return this.f104452a;
        }

        public final int hashCode() {
            int iC = v7.c(this.f104452a.hashCode() * 31, 31, this.f104453b);
            d dVar = this.f104454c;
            int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
            PocketOwnerInfo pocketOwnerInfo = this.d;
            return iHashCode + (pocketOwnerInfo != null ? pocketOwnerInfo.hashCode() : 0);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: j6, reason: from getter */
        public final d getF104479c() {
            return this.f104454c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104452a);
            dest.writeSerializable(this.f104453b);
            dest.writeSerializable(this.f104454c);
            PocketOwnerInfo pocketOwnerInfo = this.d;
            if (pocketOwnerInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                pocketOwnerInfo.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/PocketInfo$CreditCard;", "Lcom/revolut/retail/trading/core/domain/PocketInfo;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditCard implements PocketInfo {

        @NotNull
        public static final Parcelable.Creator<CreditCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f104456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f104457c;
        public final PocketOwnerInfo d;
        public final Image e;
        public final Clause f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditCard(parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : PocketOwnerInfo.CREATOR.createFromParcel(parcel), (Image) parcel.readParcelable(CreditCard.class.getClassLoader()), (Clause) parcel.readParcelable(CreditCard.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCard[i];
            }
        }

        public CreditCard(String pocketId, d balance, d dVar, PocketOwnerInfo pocketOwnerInfo, Image icon, Clause displayName) {
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(balance, "balance");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            this.f104455a = pocketId;
            this.f104456b = balance;
            this.f104457c = dVar;
            this.d = pocketOwnerInfo;
            this.e = icon;
            this.f = displayName;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: A7, reason: from getter */
        public final PocketOwnerInfo getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditCard)) {
                return false;
            }
            CreditCard creditCard = (CreditCard) obj2;
            return Intrinsics.f(this.f104455a, creditCard.f104455a) && Intrinsics.f(this.f104456b, creditCard.f104456b) && Intrinsics.f(this.f104457c, creditCard.f104457c) && Intrinsics.f(this.d, creditCard.d) && Intrinsics.f(this.e, creditCard.e) && Intrinsics.f(this.f, creditCard.f);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getBalance, reason: from getter */
        public final d getF104478b() {
            return this.f104456b;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF104477a() {
            return this.f104455a;
        }

        public final int hashCode() {
            int iC = v7.c(this.f104455a.hashCode() * 31, 31, this.f104456b);
            d dVar = this.f104457c;
            int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
            PocketOwnerInfo pocketOwnerInfo = this.d;
            return this.f.hashCode() + b.c(this.e, (iHashCode + (pocketOwnerInfo != null ? pocketOwnerInfo.hashCode() : 0)) * 31, 31);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: j6, reason: from getter */
        public final d getF104479c() {
            return this.f104457c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104455a);
            dest.writeSerializable(this.f104456b);
            dest.writeSerializable(this.f104457c);
            PocketOwnerInfo pocketOwnerInfo = this.d;
            if (pocketOwnerInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                pocketOwnerInfo.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.e, i);
            dest.writeParcelable(this.f, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/PocketInfo$CryptoPocket;", "Lcom/revolut/retail/trading/core/domain/PocketInfo;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoPocket implements PocketInfo {

        @NotNull
        public static final Parcelable.Creator<CryptoPocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f104459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f104460c;
        public final PocketOwnerInfo d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoPocket(parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : PocketOwnerInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoPocket[i];
            }
        }

        public CryptoPocket(String pocketId, d balance, d dVar, PocketOwnerInfo pocketOwnerInfo) {
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(balance, "balance");
            this.f104458a = pocketId;
            this.f104459b = balance;
            this.f104460c = dVar;
            this.d = pocketOwnerInfo;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: A7, reason: from getter */
        public final PocketOwnerInfo getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CryptoPocket)) {
                return false;
            }
            CryptoPocket cryptoPocket = (CryptoPocket) obj2;
            return Intrinsics.f(this.f104458a, cryptoPocket.f104458a) && Intrinsics.f(this.f104459b, cryptoPocket.f104459b) && Intrinsics.f(this.f104460c, cryptoPocket.f104460c) && Intrinsics.f(this.d, cryptoPocket.d);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getBalance, reason: from getter */
        public final d getF104478b() {
            return this.f104459b;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF104477a() {
            return this.f104458a;
        }

        public final int hashCode() {
            int iC = v7.c(this.f104458a.hashCode() * 31, 31, this.f104459b);
            d dVar = this.f104460c;
            int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
            PocketOwnerInfo pocketOwnerInfo = this.d;
            return iHashCode + (pocketOwnerInfo != null ? pocketOwnerInfo.hashCode() : 0);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: j6, reason: from getter */
        public final d getF104479c() {
            return this.f104460c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104458a);
            dest.writeSerializable(this.f104459b);
            dest.writeSerializable(this.f104460c);
            PocketOwnerInfo pocketOwnerInfo = this.d;
            if (pocketOwnerInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                pocketOwnerInfo.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/PocketInfo$CurrencyPocket;", "Lcom/revolut/retail/trading/core/domain/PocketInfo;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyPocket implements PocketInfo {

        @NotNull
        public static final Parcelable.Creator<CurrencyPocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f104462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f104463c;
        public final PocketOwnerInfo d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrencyPocket(parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : PocketOwnerInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyPocket[i];
            }
        }

        public CurrencyPocket(String pocketId, d balance, d dVar, PocketOwnerInfo pocketOwnerInfo) {
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(balance, "balance");
            this.f104461a = pocketId;
            this.f104462b = balance;
            this.f104463c = dVar;
            this.d = pocketOwnerInfo;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: A7, reason: from getter */
        public final PocketOwnerInfo getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrencyPocket)) {
                return false;
            }
            CurrencyPocket currencyPocket = (CurrencyPocket) obj2;
            return Intrinsics.f(this.f104461a, currencyPocket.f104461a) && Intrinsics.f(this.f104462b, currencyPocket.f104462b) && Intrinsics.f(this.f104463c, currencyPocket.f104463c) && Intrinsics.f(this.d, currencyPocket.d);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getBalance, reason: from getter */
        public final d getF104478b() {
            return this.f104462b;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF104477a() {
            return this.f104461a;
        }

        public final int hashCode() {
            int iC = v7.c(this.f104461a.hashCode() * 31, 31, this.f104462b);
            d dVar = this.f104463c;
            int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
            PocketOwnerInfo pocketOwnerInfo = this.d;
            return iHashCode + (pocketOwnerInfo != null ? pocketOwnerInfo.hashCode() : 0);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: j6, reason: from getter */
        public final d getF104479c() {
            return this.f104463c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104461a);
            dest.writeSerializable(this.f104462b);
            dest.writeSerializable(this.f104463c);
            PocketOwnerInfo pocketOwnerInfo = this.d;
            if (pocketOwnerInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                pocketOwnerInfo.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/PocketInfo$InvestPocket;", "Lcom/revolut/retail/trading/core/domain/PocketInfo;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvestPocket implements PocketInfo {

        @NotNull
        public static final Parcelable.Creator<InvestPocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f104465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f104466c;
        public final PocketOwnerInfo d;
        public final String e;
        public final Clause f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Image f104467g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvestPocket(parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : PocketOwnerInfo.CREATOR.createFromParcel(parcel), parcel.readString(), (Clause) parcel.readParcelable(InvestPocket.class.getClassLoader()), (Image) parcel.readParcelable(InvestPocket.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvestPocket[i];
            }
        }

        public InvestPocket(String pocketId, d balance, d dVar, PocketOwnerInfo pocketOwnerInfo, String portfolioId, Clause displayName, Image icon) {
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(balance, "balance");
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.f104464a = pocketId;
            this.f104465b = balance;
            this.f104466c = dVar;
            this.d = pocketOwnerInfo;
            this.e = portfolioId;
            this.f = displayName;
            this.f104467g = icon;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: A7, reason: from getter */
        public final PocketOwnerInfo getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InvestPocket)) {
                return false;
            }
            InvestPocket investPocket = (InvestPocket) obj2;
            return Intrinsics.f(this.f104464a, investPocket.f104464a) && Intrinsics.f(this.f104465b, investPocket.f104465b) && Intrinsics.f(this.f104466c, investPocket.f104466c) && Intrinsics.f(this.d, investPocket.d) && Intrinsics.f(this.e, investPocket.e) && Intrinsics.f(this.f, investPocket.f) && Intrinsics.f(this.f104467g, investPocket.f104467g);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getBalance, reason: from getter */
        public final d getF104478b() {
            return this.f104465b;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF104477a() {
            return this.f104464a;
        }

        public final int hashCode() {
            int iC = v7.c(this.f104464a.hashCode() * 31, 31, this.f104465b);
            d dVar = this.f104466c;
            int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
            PocketOwnerInfo pocketOwnerInfo = this.d;
            return this.f104467g.hashCode() + p.a.a(p.a.c((iHashCode + (pocketOwnerInfo != null ? pocketOwnerInfo.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: j6, reason: from getter */
        public final d getF104479c() {
            return this.f104466c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104464a);
            dest.writeSerializable(this.f104465b);
            dest.writeSerializable(this.f104466c);
            PocketOwnerInfo pocketOwnerInfo = this.d;
            if (pocketOwnerInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                pocketOwnerInfo.writeToParcel(dest, i);
            }
            dest.writeString(this.e);
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f104467g, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/PocketInfo$Joint;", "Lcom/revolut/retail/trading/core/domain/PocketInfo;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Joint implements PocketInfo {

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f104469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f104470c;
        public final PocketOwnerInfo d;
        public final AccountId.Joint e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Joint(parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : PocketOwnerInfo.CREATOR.createFromParcel(parcel), (AccountId.Joint) parcel.readParcelable(Joint.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        public Joint(String pocketId, d balance, d dVar, PocketOwnerInfo pocketOwnerInfo, AccountId.Joint jointAccountId) {
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(balance, "balance");
            Intrinsics.checkNotNullParameter(jointAccountId, "jointAccountId");
            this.f104468a = pocketId;
            this.f104469b = balance;
            this.f104470c = dVar;
            this.d = pocketOwnerInfo;
            this.e = jointAccountId;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: A7, reason: from getter */
        public final PocketOwnerInfo getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Joint)) {
                return false;
            }
            Joint joint = (Joint) obj2;
            return Intrinsics.f(this.f104468a, joint.f104468a) && Intrinsics.f(this.f104469b, joint.f104469b) && Intrinsics.f(this.f104470c, joint.f104470c) && Intrinsics.f(this.d, joint.d) && Intrinsics.f(this.e, joint.e);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getBalance, reason: from getter */
        public final d getF104478b() {
            return this.f104469b;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF104477a() {
            return this.f104468a;
        }

        public final int hashCode() {
            int iC = v7.c(this.f104468a.hashCode() * 31, 31, this.f104469b);
            d dVar = this.f104470c;
            int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
            PocketOwnerInfo pocketOwnerInfo = this.d;
            return this.e.hashCode() + ((iHashCode + (pocketOwnerInfo != null ? pocketOwnerInfo.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: j6, reason: from getter */
        public final d getF104479c() {
            return this.f104470c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104468a);
            dest.writeSerializable(this.f104469b);
            dest.writeSerializable(this.f104470c);
            PocketOwnerInfo pocketOwnerInfo = this.d;
            if (pocketOwnerInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                pocketOwnerInfo.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/PocketInfo$Pro;", "Lcom/revolut/retail/trading/core/domain/PocketInfo;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pro implements PocketInfo {

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f104472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f104473c;
        public final PocketOwnerInfo d;
        public final Clause e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pro(parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : PocketOwnerInfo.CREATOR.createFromParcel(parcel), (Clause) parcel.readParcelable(Pro.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        public Pro(String pocketId, d balance, d dVar, PocketOwnerInfo pocketOwnerInfo, Clause displayName) {
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(balance, "balance");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            this.f104471a = pocketId;
            this.f104472b = balance;
            this.f104473c = dVar;
            this.d = pocketOwnerInfo;
            this.e = displayName;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: A7, reason: from getter */
        public final PocketOwnerInfo getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pro)) {
                return false;
            }
            Pro pro = (Pro) obj2;
            return Intrinsics.f(this.f104471a, pro.f104471a) && Intrinsics.f(this.f104472b, pro.f104472b) && Intrinsics.f(this.f104473c, pro.f104473c) && Intrinsics.f(this.d, pro.d) && Intrinsics.f(this.e, pro.e);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getBalance, reason: from getter */
        public final d getF104478b() {
            return this.f104472b;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF104477a() {
            return this.f104471a;
        }

        public final int hashCode() {
            int iC = v7.c(this.f104471a.hashCode() * 31, 31, this.f104472b);
            d dVar = this.f104473c;
            int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
            PocketOwnerInfo pocketOwnerInfo = this.d;
            return this.e.hashCode() + ((iHashCode + (pocketOwnerInfo != null ? pocketOwnerInfo.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: j6, reason: from getter */
        public final d getF104479c() {
            return this.f104473c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104471a);
            dest.writeSerializable(this.f104472b);
            dest.writeSerializable(this.f104473c);
            PocketOwnerInfo pocketOwnerInfo = this.d;
            if (pocketOwnerInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                pocketOwnerInfo.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/PocketInfo$Saving;", "Lcom/revolut/retail/trading/core/domain/PocketInfo;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Saving implements PocketInfo {

        @NotNull
        public static final Parcelable.Creator<Saving> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f104475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f104476c;
        public final PocketOwnerInfo d;
        public final String e;
        public final Image f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Saving(parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : PocketOwnerInfo.CREATOR.createFromParcel(parcel), parcel.readString(), (Image) parcel.readParcelable(Saving.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Saving[i];
            }
        }

        public Saving(String pocketId, d balance, d dVar, PocketOwnerInfo pocketOwnerInfo, String displayName, Image icon) {
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(balance, "balance");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.f104474a = pocketId;
            this.f104475b = balance;
            this.f104476c = dVar;
            this.d = pocketOwnerInfo;
            this.e = displayName;
            this.f = icon;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: A7, reason: from getter */
        public final PocketOwnerInfo getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Saving)) {
                return false;
            }
            Saving saving = (Saving) obj2;
            return Intrinsics.f(this.f104474a, saving.f104474a) && Intrinsics.f(this.f104475b, saving.f104475b) && Intrinsics.f(this.f104476c, saving.f104476c) && Intrinsics.f(this.d, saving.d) && Intrinsics.f(this.e, saving.e) && Intrinsics.f(this.f, saving.f);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getBalance, reason: from getter */
        public final d getF104478b() {
            return this.f104475b;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF104477a() {
            return this.f104474a;
        }

        public final int hashCode() {
            int iC = v7.c(this.f104474a.hashCode() * 31, 31, this.f104475b);
            d dVar = this.f104476c;
            int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
            PocketOwnerInfo pocketOwnerInfo = this.d;
            return this.f.hashCode() + p.a.c((iHashCode + (pocketOwnerInfo != null ? pocketOwnerInfo.hashCode() : 0)) * 31, 31, this.e);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: j6, reason: from getter */
        public final d getF104479c() {
            return this.f104476c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104474a);
            dest.writeSerializable(this.f104475b);
            dest.writeSerializable(this.f104476c);
            PocketOwnerInfo pocketOwnerInfo = this.d;
            if (pocketOwnerInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                pocketOwnerInfo.writeToParcel(dest, i);
            }
            dest.writeString(this.e);
            dest.writeParcelable(this.f, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/PocketInfo$Vault;", "Lcom/revolut/retail/trading/core/domain/PocketInfo;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Vault implements PocketInfo {

        @NotNull
        public static final Parcelable.Creator<Vault> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f104478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f104479c;
        public final PocketOwnerInfo d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Vault(parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : PocketOwnerInfo.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Vault[i];
            }
        }

        public Vault(String pocketId, d balance, d dVar, PocketOwnerInfo pocketOwnerInfo, String displayName) {
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(balance, "balance");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            this.f104477a = pocketId;
            this.f104478b = balance;
            this.f104479c = dVar;
            this.d = pocketOwnerInfo;
            this.e = displayName;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: A7, reason: from getter */
        public final PocketOwnerInfo getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Vault)) {
                return false;
            }
            Vault vault = (Vault) obj2;
            return Intrinsics.f(this.f104477a, vault.f104477a) && Intrinsics.f(this.f104478b, vault.f104478b) && Intrinsics.f(this.f104479c, vault.f104479c) && Intrinsics.f(this.d, vault.d) && Intrinsics.f(this.e, vault.e);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getBalance, reason: from getter */
        public final d getF104478b() {
            return this.f104478b;
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: getPocketId, reason: from getter */
        public final String getF104477a() {
            return this.f104477a;
        }

        public final int hashCode() {
            int iC = v7.c(this.f104477a.hashCode() * 31, 31, this.f104478b);
            d dVar = this.f104479c;
            int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
            PocketOwnerInfo pocketOwnerInfo = this.d;
            return this.e.hashCode() + ((iHashCode + (pocketOwnerInfo != null ? pocketOwnerInfo.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.retail.trading.core.domain.PocketInfo
        /* JADX INFO: renamed from: j6, reason: from getter */
        public final d getF104479c() {
            return this.f104479c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104477a);
            dest.writeSerializable(this.f104478b);
            dest.writeSerializable(this.f104479c);
            PocketOwnerInfo pocketOwnerInfo = this.d;
            if (pocketOwnerInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                pocketOwnerInfo.writeToParcel(dest, i);
            }
            dest.writeString(this.e);
        }
    }

    /* JADX INFO: renamed from: A7 */
    PocketOwnerInfo getD();

    /* JADX INFO: renamed from: getBalance */
    d getF104478b();

    /* JADX INFO: renamed from: getPocketId */
    String getF104477a();

    /* JADX INFO: renamed from: j6 */
    d getF104479c();
}
