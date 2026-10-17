package com.revolut.shared.feature.market_data.models.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.models.quotes.CreditCardInterest;
import com.revolut.feature.transfer.models.quotes.TransferAvailability;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplit;
import dj0.d;
import f8l.e;
import ip0.v7;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0005\u0006\u0007\b\t\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/OrderQuote;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Slippage", "PriceLevel", "LastTrade", "SettlementDelay", "a", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderQuote implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f8l.b f104752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f8l.b f104753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Amount f104754c;
    public final Amount d;
    public final Amount e;
    public final Amount f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Charges f104755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f104756h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final OrderRate f104757j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BigDecimal f104758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SettlementDelay f104759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TransferAvailability f104760n;
    public final TransferQuoteSplit o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditCardInterest f104761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f104762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f104763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f104764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f104765t;
    public final Amount u;
    public final Amount v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Amount f104766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Slippage f104767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final LastTrade f104768y;

    @NotNull
    public static final Parcelable.Creator<OrderQuote> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/OrderQuote$LastTrade;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LastTrade implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<LastTrade> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f104769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f104770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Instant f104771c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LastTrade((d) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (Instant) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LastTrade[i];
            }
        }

        public LastTrade(d price, BigDecimal bigDecimal, Instant tradedAt) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(tradedAt, "tradedAt");
            this.f104769a = price;
            this.f104770b = bigDecimal;
            this.f104771c = tradedAt;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LastTrade)) {
                return false;
            }
            LastTrade lastTrade = (LastTrade) obj2;
            return Intrinsics.f(this.f104769a, lastTrade.f104769a) && Intrinsics.f(this.f104770b, lastTrade.f104770b) && Intrinsics.f(this.f104771c, lastTrade.f104771c);
        }

        public final int hashCode() {
            int iHashCode = this.f104769a.hashCode() * 31;
            BigDecimal bigDecimal = this.f104770b;
            return this.f104771c.hashCode() + ((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f104769a);
            dest.writeSerializable(this.f104770b);
            dest.writeSerializable(this.f104771c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/OrderQuote$PriceLevel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PriceLevel implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PriceLevel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f104772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f104773b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PriceLevel((d) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PriceLevel[i];
            }
        }

        public PriceLevel(d price, BigDecimal quantity) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            this.f104772a = price;
            this.f104773b = quantity;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PriceLevel)) {
                return false;
            }
            PriceLevel priceLevel = (PriceLevel) obj2;
            return Intrinsics.f(this.f104772a, priceLevel.f104772a) && Intrinsics.f(this.f104773b, priceLevel.f104773b);
        }

        public final int hashCode() {
            return this.f104773b.hashCode() + (this.f104772a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f104772a);
            dest.writeSerializable(this.f104773b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/OrderQuote$SettlementDelay;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SettlementDelay implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SettlementDelay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Instant f104774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f104775b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SettlementDelay((Instant) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SettlementDelay[i];
            }
        }

        public SettlementDelay(Instant instant, boolean z) {
            this.f104774a = instant;
            this.f104775b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SettlementDelay)) {
                return false;
            }
            SettlementDelay settlementDelay = (SettlementDelay) obj2;
            return Intrinsics.f(this.f104774a, settlementDelay.f104774a) && this.f104775b == settlementDelay.f104775b;
        }

        public final int hashCode() {
            Instant instant = this.f104774a;
            return Boolean.hashCode(this.f104775b) + ((instant == null ? 0 : instant.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f104774a);
            dest.writeInt(this.f104775b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/OrderQuote$Slippage;", "Landroid/os/Parcelable;", "Available", "Unavailable", "com/revolut/shared/feature/market_data/models/domain/models/a", "com/revolut/shared/feature/market_data/models/domain/models/b", "Lcom/revolut/shared/feature/market_data/models/domain/models/OrderQuote$Slippage$Available;", "Lcom/revolut/shared/feature/market_data/models/domain/models/OrderQuote$Slippage$Unavailable;", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Slippage extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/OrderQuote$Slippage$Available;", "Lcom/revolut/shared/feature/market_data/models/domain/models/OrderQuote$Slippage;", "", "toString", "()Ljava/lang/String;", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Available implements Slippage {

            @NotNull
            public static final Parcelable.Creator<Available> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.revolut.shared.feature.market_data.models.domain.models.a f104776a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f104777b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final BigDecimal f104778c;
            public final BigDecimal d;
            public final d e;
            public final BigDecimal f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Instant f104779g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final PriceLevel f104780h;
            public final PriceLevel i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final com.revolut.shared.feature.market_data.models.domain.models.b f104781j;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    com.revolut.shared.feature.market_data.models.domain.models.a aVarValueOf = com.revolut.shared.feature.market_data.models.domain.models.a.valueOf(parcel.readString());
                    d dVar = (d) parcel.readSerializable();
                    BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                    BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
                    d dVar2 = (d) parcel.readSerializable();
                    BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
                    Instant instant = (Instant) parcel.readSerializable();
                    Parcelable.Creator<PriceLevel> creator = PriceLevel.CREATOR;
                    return new Available(aVarValueOf, dVar, bigDecimal, bigDecimal2, dVar2, bigDecimal3, instant, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : com.revolut.shared.feature.market_data.models.domain.models.b.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Available[i];
                }
            }

            public Available(com.revolut.shared.feature.market_data.models.domain.models.a side, d bestPrice, BigDecimal quantityAtBestPrice, BigDecimal evaluatedQuantity, d estimatedExecutionPrice, BigDecimal ratio, Instant asOf, PriceLevel bid2, PriceLevel ask2, com.revolut.shared.feature.market_data.models.domain.models.b bVar) {
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(bestPrice, "bestPrice");
                Intrinsics.checkNotNullParameter(quantityAtBestPrice, "quantityAtBestPrice");
                Intrinsics.checkNotNullParameter(evaluatedQuantity, "evaluatedQuantity");
                Intrinsics.checkNotNullParameter(estimatedExecutionPrice, "estimatedExecutionPrice");
                Intrinsics.checkNotNullParameter(ratio, "ratio");
                Intrinsics.checkNotNullParameter(asOf, "asOf");
                Intrinsics.checkNotNullParameter(bid2, "bid");
                Intrinsics.checkNotNullParameter(ask2, "ask");
                this.f104776a = side;
                this.f104777b = bestPrice;
                this.f104778c = quantityAtBestPrice;
                this.d = evaluatedQuantity;
                this.e = estimatedExecutionPrice;
                this.f = ratio;
                this.f104779g = asOf;
                this.f104780h = bid2;
                this.i = ask2;
                this.f104781j = bVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Available)) {
                    return false;
                }
                Available available = (Available) obj2;
                return this.f104776a == available.f104776a && Intrinsics.f(this.f104777b, available.f104777b) && Intrinsics.f(this.f104778c, available.f104778c) && Intrinsics.f(this.d, available.d) && Intrinsics.f(this.e, available.e) && Intrinsics.f(this.f, available.f) && Intrinsics.f(this.f104779g, available.f104779g) && Intrinsics.f(this.f104780h, available.f104780h) && Intrinsics.f(this.i, available.i) && this.f104781j == available.f104781j;
            }

            public final int hashCode() {
                int iHashCode = (this.i.hashCode() + ((this.f104780h.hashCode() + r6.b.c(t61.a.d(this.f, v7.c(t61.a.d(this.d, t61.a.d(this.f104778c, v7.c(this.f104776a.hashCode() * 31, 31, this.f104777b), 31), 31), 31, this.e), 31), 31, this.f104779g)) * 31)) * 31;
                com.revolut.shared.feature.market_data.models.domain.models.b bVar = this.f104781j;
                return iHashCode + (bVar == null ? 0 : bVar.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f104776a.name());
                dest.writeSerializable(this.f104777b);
                dest.writeSerializable(this.f104778c);
                dest.writeSerializable(this.d);
                dest.writeSerializable(this.e);
                dest.writeSerializable(this.f);
                dest.writeSerializable(this.f104779g);
                this.f104780h.writeToParcel(dest, i);
                this.i.writeToParcel(dest, i);
                com.revolut.shared.feature.market_data.models.domain.models.b bVar = this.f104781j;
                if (bVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(bVar.name());
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/feature/market_data/models/domain/models/OrderQuote$Slippage$Unavailable;", "Lcom/revolut/shared/feature/market_data/models/domain/models/OrderQuote$Slippage;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Unavailable implements Slippage {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Unavailable f104782a = new Unavailable();

            @NotNull
            public static final Parcelable.Creator<Unavailable> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Unavailable.f104782a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Unavailable[i];
                }
            }

            private Unavailable() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof Unavailable);
            }

            public final int hashCode() {
                return 1246691065;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            CreditCardInterest creditCardInterest;
            Amount amountCreateFromParcel;
            Amount amount;
            Amount amountCreateFromParcel2;
            Amount amount2;
            Amount amountCreateFromParcel3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            f8l.b bVarValueOf = f8l.b.valueOf(parcel.readString());
            f8l.b bVarValueOf2 = f8l.b.valueOf(parcel.readString());
            Parcelable.Creator<Amount> creator = Amount.CREATOR;
            Amount amountCreateFromParcel4 = creator.createFromParcel(parcel);
            Amount amountCreateFromParcel5 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            Amount amountCreateFromParcel6 = creator.createFromParcel(parcel);
            Amount amountCreateFromParcel7 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            Charges chargesCreateFromParcel = Charges.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(OrderQuote.class, parcel, arrayList, iE, 1);
            }
            long j2 = parcel.readLong();
            OrderRate orderRateCreateFromParcel = OrderRate.CREATOR.createFromParcel(parcel);
            e eVarValueOf = e.valueOf(parcel.readString());
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            SettlementDelay settlementDelayCreateFromParcel = parcel.readInt() == 0 ? null : SettlementDelay.CREATOR.createFromParcel(parcel);
            TransferAvailability transferAvailability = (TransferAvailability) parcel.readParcelable(OrderQuote.class.getClassLoader());
            TransferQuoteSplit transferQuoteSplit = (TransferQuoteSplit) parcel.readParcelable(OrderQuote.class.getClassLoader());
            CreditCardInterest creditCardInterest2 = (CreditCardInterest) parcel.readParcelable(OrderQuote.class.getClassLoader());
            String string = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                creditCardInterest = creditCardInterest2;
                amountCreateFromParcel = null;
            } else {
                creditCardInterest = creditCardInterest2;
                amountCreateFromParcel = Amount.CREATOR.createFromParcel(parcel);
            }
            Amount amount3 = amountCreateFromParcel;
            if (parcel.readInt() == 0) {
                amount = amount3;
                amountCreateFromParcel2 = null;
            } else {
                amount = amount3;
                amountCreateFromParcel2 = Amount.CREATOR.createFromParcel(parcel);
            }
            Amount amount4 = amountCreateFromParcel2;
            if (parcel.readInt() == 0) {
                amount2 = amount4;
                amountCreateFromParcel3 = null;
            } else {
                amount2 = amount4;
                amountCreateFromParcel3 = Amount.CREATOR.createFromParcel(parcel);
            }
            return new OrderQuote(bVarValueOf, bVarValueOf2, amountCreateFromParcel4, amountCreateFromParcel5, amountCreateFromParcel6, amountCreateFromParcel7, chargesCreateFromParcel, arrayList, j2, orderRateCreateFromParcel, eVarValueOf, bigDecimal, settlementDelayCreateFromParcel, transferAvailability, transferQuoteSplit, creditCardInterest, string, z, string2, string3, amount, amount2, amountCreateFromParcel3, (Slippage) parcel.readParcelable(OrderQuote.class.getClassLoader()), parcel.readInt() == 0 ? null : LastTrade.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderQuote[i];
        }
    }

    public OrderQuote(f8l.b amountRequestedIn, f8l.b baseRateAsset, Amount fromAmount, Amount amount, Amount toAmount, Amount amount2, Charges charges, List limits, long j2, OrderRate rate, e orderType, BigDecimal bigDecimal, SettlementDelay settlementDelay, TransferAvailability transferAvailability, TransferQuoteSplit transferQuoteSplit, CreditCardInterest creditCardInterest, String str, boolean z, String str2, String str3, Amount amount3, Amount amount4, Amount amount5, Slippage slippage, LastTrade lastTrade) {
        Intrinsics.checkNotNullParameter(amountRequestedIn, "amountRequestedIn");
        Intrinsics.checkNotNullParameter(baseRateAsset, "baseRateAsset");
        Intrinsics.checkNotNullParameter(fromAmount, "fromAmount");
        Intrinsics.checkNotNullParameter(toAmount, "toAmount");
        Intrinsics.checkNotNullParameter(charges, "charges");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f104752a = amountRequestedIn;
        this.f104753b = baseRateAsset;
        this.f104754c = fromAmount;
        this.d = amount;
        this.e = toAmount;
        this.f = amount2;
        this.f104755g = charges;
        this.f104756h = limits;
        this.i = j2;
        this.f104757j = rate;
        this.k = orderType;
        this.f104758l = bigDecimal;
        this.f104759m = settlementDelay;
        this.f104760n = transferAvailability;
        this.o = transferQuoteSplit;
        this.f104761p = creditCardInterest;
        this.f104762q = str;
        this.f104763r = z;
        this.f104764s = str2;
        this.f104765t = str3;
        this.u = amount3;
        this.v = amount4;
        this.f104766w = amount5;
        this.f104767x = slippage;
        this.f104768y = lastTrade;
    }

    public static OrderQuote a(OrderQuote orderQuote, Amount amount, Amount amount2, Amount amount3, Amount amount4, Charges charges, int i) {
        f8l.b amountRequestedIn = orderQuote.f104752a;
        f8l.b baseRateAsset = orderQuote.f104753b;
        Amount fromAmount = (i & 4) != 0 ? orderQuote.f104754c : amount;
        Amount amount5 = (i & 8) != 0 ? orderQuote.d : amount2;
        Amount toAmount = (i & 16) != 0 ? orderQuote.e : amount3;
        Amount amount6 = (i & 32) != 0 ? orderQuote.f : amount4;
        Charges charges2 = (i & 64) != 0 ? orderQuote.f104755g : charges;
        List limits = orderQuote.f104756h;
        long j2 = orderQuote.i;
        OrderRate rate = orderQuote.f104757j;
        e orderType = orderQuote.k;
        BigDecimal bigDecimal = orderQuote.f104758l;
        SettlementDelay settlementDelay = orderQuote.f104759m;
        TransferAvailability transferAvailability = orderQuote.f104760n;
        Amount amount7 = amount5;
        TransferQuoteSplit transferQuoteSplit = orderQuote.o;
        CreditCardInterest creditCardInterest = orderQuote.f104761p;
        String str = orderQuote.f104762q;
        boolean z = orderQuote.f104763r;
        String str2 = orderQuote.f104764s;
        String str3 = orderQuote.f104765t;
        Amount amount8 = orderQuote.u;
        Amount amount9 = orderQuote.v;
        Amount amount10 = orderQuote.f104766w;
        Slippage slippage = orderQuote.f104767x;
        LastTrade lastTrade = orderQuote.f104768y;
        orderQuote.getClass();
        Intrinsics.checkNotNullParameter(amountRequestedIn, "amountRequestedIn");
        Intrinsics.checkNotNullParameter(baseRateAsset, "baseRateAsset");
        Intrinsics.checkNotNullParameter(fromAmount, "fromAmount");
        Intrinsics.checkNotNullParameter(toAmount, "toAmount");
        Intrinsics.checkNotNullParameter(charges2, "charges");
        Intrinsics.checkNotNullParameter(limits, "limits");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return new OrderQuote(amountRequestedIn, baseRateAsset, fromAmount, amount7, toAmount, amount6, charges2, limits, j2, rate, orderType, bigDecimal, settlementDelay, transferAvailability, transferQuoteSplit, creditCardInterest, str, z, str2, str3, amount8, amount9, amount10, slippage, lastTrade);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderQuote)) {
            return false;
        }
        OrderQuote orderQuote = (OrderQuote) obj2;
        return this.f104752a == orderQuote.f104752a && this.f104753b == orderQuote.f104753b && Intrinsics.f(this.f104754c, orderQuote.f104754c) && Intrinsics.f(this.d, orderQuote.d) && Intrinsics.f(this.e, orderQuote.e) && Intrinsics.f(this.f, orderQuote.f) && Intrinsics.f(this.f104755g, orderQuote.f104755g) && Intrinsics.f(this.f104756h, orderQuote.f104756h) && this.i == orderQuote.i && Intrinsics.f(this.f104757j, orderQuote.f104757j) && this.k == orderQuote.k && Intrinsics.f(this.f104758l, orderQuote.f104758l) && Intrinsics.f(this.f104759m, orderQuote.f104759m) && Intrinsics.f(this.f104760n, orderQuote.f104760n) && Intrinsics.f(this.o, orderQuote.o) && Intrinsics.f(this.f104761p, orderQuote.f104761p) && Intrinsics.f(this.f104762q, orderQuote.f104762q) && this.f104763r == orderQuote.f104763r && Intrinsics.f(this.f104764s, orderQuote.f104764s) && Intrinsics.f(this.f104765t, orderQuote.f104765t) && Intrinsics.f(this.u, orderQuote.u) && Intrinsics.f(this.v, orderQuote.v) && Intrinsics.f(this.f104766w, orderQuote.f104766w) && Intrinsics.f(this.f104767x, orderQuote.f104767x) && Intrinsics.f(this.f104768y, orderQuote.f104768y);
    }

    public final int hashCode() {
        int iD = y.d(this.f104754c, (this.f104753b.hashCode() + (this.f104752a.hashCode() * 31)) * 31, 31);
        Amount amount = this.d;
        int iD2 = y.d(this.e, (iD + (amount == null ? 0 : amount.hashCode())) * 31, 31);
        Amount amount2 = this.f;
        int iHashCode = (this.k.hashCode() + ((this.f104757j.hashCode() + a0.d.c(p.a.d((this.f104755g.hashCode() + ((iD2 + (amount2 == null ? 0 : amount2.hashCode())) * 31)) * 31, 31, this.f104756h), 31, this.i)) * 31)) * 31;
        BigDecimal bigDecimal = this.f104758l;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        SettlementDelay settlementDelay = this.f104759m;
        int iHashCode3 = (iHashCode2 + (settlementDelay == null ? 0 : settlementDelay.hashCode())) * 31;
        TransferAvailability transferAvailability = this.f104760n;
        int iHashCode4 = (iHashCode3 + (transferAvailability == null ? 0 : transferAvailability.hashCode())) * 31;
        TransferQuoteSplit transferQuoteSplit = this.o;
        int iHashCode5 = (iHashCode4 + (transferQuoteSplit == null ? 0 : transferQuoteSplit.f92287a.hashCode())) * 31;
        CreditCardInterest creditCardInterest = this.f104761p;
        int iHashCode6 = (iHashCode5 + (creditCardInterest == null ? 0 : creditCardInterest.hashCode())) * 31;
        String str = this.f104762q;
        int iC = j6.a.c((iHashCode6 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f104763r);
        String str2 = this.f104764s;
        int iHashCode7 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f104765t;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Amount amount3 = this.u;
        int iHashCode9 = (iHashCode8 + (amount3 == null ? 0 : amount3.hashCode())) * 31;
        Amount amount4 = this.v;
        int iHashCode10 = (iHashCode9 + (amount4 == null ? 0 : amount4.hashCode())) * 31;
        Amount amount5 = this.f104766w;
        int iHashCode11 = (iHashCode10 + (amount5 == null ? 0 : amount5.hashCode())) * 31;
        Slippage slippage = this.f104767x;
        int iHashCode12 = (iHashCode11 + (slippage == null ? 0 : slippage.hashCode())) * 31;
        LastTrade lastTrade = this.f104768y;
        return iHashCode12 + (lastTrade != null ? lastTrade.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104752a.name());
        dest.writeString(this.f104753b.name());
        this.f104754c.writeToParcel(dest, i);
        Amount amount = this.d;
        if (amount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            amount.writeToParcel(dest, i);
        }
        this.e.writeToParcel(dest, i);
        Amount amount2 = this.f;
        if (amount2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            amount2.writeToParcel(dest, i);
        }
        this.f104755g.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.f104756h, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeLong(this.i);
        this.f104757j.writeToParcel(dest, i);
        dest.writeString(this.k.name());
        dest.writeSerializable(this.f104758l);
        SettlementDelay settlementDelay = this.f104759m;
        if (settlementDelay == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            settlementDelay.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f104760n, i);
        dest.writeParcelable(this.o, i);
        dest.writeParcelable(this.f104761p, i);
        dest.writeString(this.f104762q);
        dest.writeInt(this.f104763r ? 1 : 0);
        dest.writeString(this.f104764s);
        dest.writeString(this.f104765t);
        Amount amount3 = this.u;
        if (amount3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            amount3.writeToParcel(dest, i);
        }
        Amount amount4 = this.v;
        if (amount4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            amount4.writeToParcel(dest, i);
        }
        Amount amount5 = this.f104766w;
        if (amount5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            amount5.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f104767x, i);
        LastTrade lastTrade = this.f104768y;
        if (lastTrade == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            lastTrade.writeToParcel(dest, i);
        }
    }

    public /* synthetic */ OrderQuote(f8l.b bVar, f8l.b bVar2, Amount amount, Amount amount2, Amount amount3, Amount amount4, Charges charges, f0 f0Var, long j2, OrderRate orderRate, e eVar, String str, int i) {
        this(bVar, bVar2, amount, amount2, amount3, amount4, charges, f0Var, j2, orderRate, eVar, null, null, null, null, null, (i & 65536) != 0 ? null : str, false, null, null, null, null, null, null, null);
    }
}
