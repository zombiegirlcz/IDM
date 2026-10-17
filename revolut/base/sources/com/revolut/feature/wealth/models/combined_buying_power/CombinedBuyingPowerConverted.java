package com.revolut.feature.wealth.models.combined_buying_power;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/models/combined_buying_power/CombinedBuyingPowerConverted;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Breakdown", "MarginBorrowingLimit", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CombinedBuyingPowerConverted implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CombinedBuyingPowerConverted> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MarginBorrowingLimit f95658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f95659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Breakdown f95660c;
    public final d d;
    public final d e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/models/combined_buying_power/CombinedBuyingPowerConverted$Breakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Breakdown implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Breakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f95661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f95662b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                d dVar = (d) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new Breakdown(dVar, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Breakdown[i];
            }
        }

        public Breakdown(d total, ArrayList cashBreakdown) {
            Intrinsics.checkNotNullParameter(total, "total");
            Intrinsics.checkNotNullParameter(cashBreakdown, "cashBreakdown");
            this.f95661a = total;
            this.f95662b = cashBreakdown;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Breakdown)) {
                return false;
            }
            Breakdown breakdown = (Breakdown) obj2;
            return Intrinsics.f(this.f95661a, breakdown.f95661a) && this.f95662b.equals(breakdown.f95662b);
        }

        public final int hashCode() {
            return this.f95662b.hashCode() + (this.f95661a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f95661a);
            Iterator itY = j6.a.y(this.f95662b, dest);
            while (itY.hasNext()) {
                dest.writeSerializable((Serializable) itY.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/models/combined_buying_power/CombinedBuyingPowerConverted$MarginBorrowingLimit;", "Landroid/os/Parcelable;", "InstrumentMarginBorrowingLimit", "AccountMarginBorrowingLimit", "Lcom/revolut/feature/wealth/models/combined_buying_power/CombinedBuyingPowerConverted$MarginBorrowingLimit$AccountMarginBorrowingLimit;", "Lcom/revolut/feature/wealth/models/combined_buying_power/CombinedBuyingPowerConverted$MarginBorrowingLimit$InstrumentMarginBorrowingLimit;", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface MarginBorrowingLimit extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/models/combined_buying_power/CombinedBuyingPowerConverted$MarginBorrowingLimit$AccountMarginBorrowingLimit;", "Lcom/revolut/feature/wealth/models/combined_buying_power/CombinedBuyingPowerConverted$MarginBorrowingLimit;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AccountMarginBorrowingLimit implements MarginBorrowingLimit {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f95663a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final udh.a f95664b;

            @NotNull
            public static final Parcelable.Creator<AccountMarginBorrowingLimit> CREATOR = new b();

            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AccountMarginBorrowingLimit((d) parcel.readSerializable(), parcel.readInt() == 0 ? null : udh.a.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AccountMarginBorrowingLimit[i];
                }
            }

            public AccountMarginBorrowingLimit(d limit, udh.a aVar) {
                Intrinsics.checkNotNullParameter(limit, "limit");
                this.f95663a = limit;
                this.f95664b = aVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AccountMarginBorrowingLimit)) {
                    return false;
                }
                AccountMarginBorrowingLimit accountMarginBorrowingLimit = (AccountMarginBorrowingLimit) obj2;
                return Intrinsics.f(this.f95663a, accountMarginBorrowingLimit.f95663a) && this.f95664b == accountMarginBorrowingLimit.f95664b;
            }

            public final int hashCode() {
                int iHashCode = this.f95663a.hashCode() * 31;
                udh.a aVar = this.f95664b;
                return iHashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            @Override // com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted.MarginBorrowingLimit
            /* JADX INFO: renamed from: k6, reason: from getter */
            public final udh.a getF95666b() {
                return this.f95664b;
            }

            @Override // com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted.MarginBorrowingLimit
            /* JADX INFO: renamed from: w, reason: from getter */
            public final d getF95665a() {
                return this.f95663a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f95663a);
                udh.a aVar = this.f95664b;
                if (aVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(aVar.name());
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/models/combined_buying_power/CombinedBuyingPowerConverted$MarginBorrowingLimit$InstrumentMarginBorrowingLimit;", "Lcom/revolut/feature/wealth/models/combined_buying_power/CombinedBuyingPowerConverted$MarginBorrowingLimit;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InstrumentMarginBorrowingLimit implements MarginBorrowingLimit {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f95665a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final udh.a f95666b;

            @NotNull
            public static final Parcelable.Creator<InstrumentMarginBorrowingLimit> CREATOR = new b();

            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InstrumentMarginBorrowingLimit((d) parcel.readSerializable(), parcel.readInt() == 0 ? null : udh.a.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InstrumentMarginBorrowingLimit[i];
                }
            }

            public InstrumentMarginBorrowingLimit(d limit, udh.a aVar) {
                Intrinsics.checkNotNullParameter(limit, "limit");
                this.f95665a = limit;
                this.f95666b = aVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof InstrumentMarginBorrowingLimit)) {
                    return false;
                }
                InstrumentMarginBorrowingLimit instrumentMarginBorrowingLimit = (InstrumentMarginBorrowingLimit) obj2;
                return Intrinsics.f(this.f95665a, instrumentMarginBorrowingLimit.f95665a) && this.f95666b == instrumentMarginBorrowingLimit.f95666b;
            }

            public final int hashCode() {
                int iHashCode = this.f95665a.hashCode() * 31;
                udh.a aVar = this.f95666b;
                return iHashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            @Override // com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted.MarginBorrowingLimit
            /* JADX INFO: renamed from: k6, reason: from getter */
            public final udh.a getF95666b() {
                return this.f95666b;
            }

            @Override // com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted.MarginBorrowingLimit
            /* JADX INFO: renamed from: w, reason: from getter */
            public final d getF95665a() {
                return this.f95665a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f95665a);
                udh.a aVar = this.f95666b;
                if (aVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(aVar.name());
                }
            }
        }

        /* JADX INFO: renamed from: k6 */
        udh.a getF95666b();

        /* JADX INFO: renamed from: w */
        d getF95665a();
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            MarginBorrowingLimit marginBorrowingLimit = (MarginBorrowingLimit) j6.a.f(parcel, "parcel", CombinedBuyingPowerConverted.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new CombinedBuyingPowerConverted(marginBorrowingLimit, arrayList, Breakdown.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CombinedBuyingPowerConverted[i];
        }
    }

    public CombinedBuyingPowerConverted(MarginBorrowingLimit marginBorrowingLimit, List cashHoldings, Breakdown availableToInvestForInstrumentInCurrency, d totalCashInSelectedCurrency, d totalInSelectedCurrency) {
        Intrinsics.checkNotNullParameter(cashHoldings, "cashHoldings");
        Intrinsics.checkNotNullParameter(availableToInvestForInstrumentInCurrency, "availableToInvestForInstrumentInCurrency");
        Intrinsics.checkNotNullParameter(totalCashInSelectedCurrency, "totalCashInSelectedCurrency");
        Intrinsics.checkNotNullParameter(totalInSelectedCurrency, "totalInSelectedCurrency");
        this.f95658a = marginBorrowingLimit;
        this.f95659b = cashHoldings;
        this.f95660c = availableToInvestForInstrumentInCurrency;
        this.d = totalCashInSelectedCurrency;
        this.e = totalInSelectedCurrency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CombinedBuyingPowerConverted)) {
            return false;
        }
        CombinedBuyingPowerConverted combinedBuyingPowerConverted = (CombinedBuyingPowerConverted) obj2;
        return Intrinsics.f(this.f95658a, combinedBuyingPowerConverted.f95658a) && Intrinsics.f(this.f95659b, combinedBuyingPowerConverted.f95659b) && Intrinsics.f(this.f95660c, combinedBuyingPowerConverted.f95660c) && Intrinsics.f(this.d, combinedBuyingPowerConverted.d) && Intrinsics.f(this.e, combinedBuyingPowerConverted.e);
    }

    public final int hashCode() {
        MarginBorrowingLimit marginBorrowingLimit = this.f95658a;
        return this.e.hashCode() + v7.c((this.f95660c.hashCode() + p.a.d((marginBorrowingLimit == null ? 0 : marginBorrowingLimit.hashCode()) * 31, 31, this.f95659b)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95658a, i);
        Iterator itV = p.a.v(this.f95659b, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        this.f95660c.writeToParcel(dest, i);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
