package com.revolut.feature.wealth.api.domain.model.instruments_collection.filters;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId;", "Landroid/os/Parcelable;", "BondsIssuerGovernment", "BondsIssuerCorporate", "BondsCreditQualityInvestmentGrade", "BondsCreditQualityHighYield", "BondsMaturityTypeFixed", "BondsMaturityTypeCallable", "BondsMaturityTypePerpetual", "BondsCouponTypeFixed", "BondsCouponTypeFloating", "BondsCouponTypeZero", "BondsIssuerCountry", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsCouponTypeFixed;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsCouponTypeFloating;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsCouponTypeZero;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsCreditQualityHighYield;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsCreditQualityInvestmentGrade;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsIssuerCorporate;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsIssuerCountry;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsIssuerGovernment;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsMaturityTypeCallable;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsMaturityTypeFixed;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsMaturityTypePerpetual;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstrumentsCollectionFilterValueId extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsCouponTypeFixed;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BondsCouponTypeFixed implements InstrumentsCollectionFilterValueId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BondsCouponTypeFixed f95299a = new BondsCouponTypeFixed();

        @NotNull
        public static final Parcelable.Creator<BondsCouponTypeFixed> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BondsCouponTypeFixed.f95299a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondsCouponTypeFixed[i];
            }
        }

        private BondsCouponTypeFixed() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsCouponTypeFloating;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BondsCouponTypeFloating implements InstrumentsCollectionFilterValueId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BondsCouponTypeFloating f95300a = new BondsCouponTypeFloating();

        @NotNull
        public static final Parcelable.Creator<BondsCouponTypeFloating> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BondsCouponTypeFloating.f95300a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondsCouponTypeFloating[i];
            }
        }

        private BondsCouponTypeFloating() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsCouponTypeZero;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BondsCouponTypeZero implements InstrumentsCollectionFilterValueId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BondsCouponTypeZero f95301a = new BondsCouponTypeZero();

        @NotNull
        public static final Parcelable.Creator<BondsCouponTypeZero> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BondsCouponTypeZero.f95301a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondsCouponTypeZero[i];
            }
        }

        private BondsCouponTypeZero() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsCreditQualityHighYield;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BondsCreditQualityHighYield implements InstrumentsCollectionFilterValueId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BondsCreditQualityHighYield f95302a = new BondsCreditQualityHighYield();

        @NotNull
        public static final Parcelable.Creator<BondsCreditQualityHighYield> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BondsCreditQualityHighYield.f95302a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondsCreditQualityHighYield[i];
            }
        }

        private BondsCreditQualityHighYield() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsCreditQualityInvestmentGrade;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BondsCreditQualityInvestmentGrade implements InstrumentsCollectionFilterValueId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BondsCreditQualityInvestmentGrade f95303a = new BondsCreditQualityInvestmentGrade();

        @NotNull
        public static final Parcelable.Creator<BondsCreditQualityInvestmentGrade> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BondsCreditQualityInvestmentGrade.f95303a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondsCreditQualityInvestmentGrade[i];
            }
        }

        private BondsCreditQualityInvestmentGrade() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsIssuerCorporate;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BondsIssuerCorporate implements InstrumentsCollectionFilterValueId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BondsIssuerCorporate f95304a = new BondsIssuerCorporate();

        @NotNull
        public static final Parcelable.Creator<BondsIssuerCorporate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BondsIssuerCorporate.f95304a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondsIssuerCorporate[i];
            }
        }

        private BondsIssuerCorporate() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsIssuerCountry;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BondsIssuerCountry implements InstrumentsCollectionFilterValueId {

        @NotNull
        public static final Parcelable.Creator<BondsIssuerCountry> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95305a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BondsIssuerCountry((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondsIssuerCountry[i];
            }
        }

        public BondsIssuerCountry(b code) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.f95305a = code;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BondsIssuerCountry) && Intrinsics.f(this.f95305a, ((BondsIssuerCountry) obj2).f95305a);
        }

        public final int hashCode() {
            return this.f95305a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f95305a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsIssuerGovernment;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BondsIssuerGovernment implements InstrumentsCollectionFilterValueId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BondsIssuerGovernment f95306a = new BondsIssuerGovernment();

        @NotNull
        public static final Parcelable.Creator<BondsIssuerGovernment> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BondsIssuerGovernment.f95306a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondsIssuerGovernment[i];
            }
        }

        private BondsIssuerGovernment() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsMaturityTypeCallable;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BondsMaturityTypeCallable implements InstrumentsCollectionFilterValueId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BondsMaturityTypeCallable f95307a = new BondsMaturityTypeCallable();

        @NotNull
        public static final Parcelable.Creator<BondsMaturityTypeCallable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BondsMaturityTypeCallable.f95307a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondsMaturityTypeCallable[i];
            }
        }

        private BondsMaturityTypeCallable() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsMaturityTypeFixed;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BondsMaturityTypeFixed implements InstrumentsCollectionFilterValueId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BondsMaturityTypeFixed f95308a = new BondsMaturityTypeFixed();

        @NotNull
        public static final Parcelable.Creator<BondsMaturityTypeFixed> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BondsMaturityTypeFixed.f95308a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondsMaturityTypeFixed[i];
            }
        }

        private BondsMaturityTypeFixed() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId$BondsMaturityTypePerpetual;", "Lcom/revolut/feature/wealth/api/domain/model/instruments_collection/filters/InstrumentsCollectionFilterValueId;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BondsMaturityTypePerpetual implements InstrumentsCollectionFilterValueId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BondsMaturityTypePerpetual f95309a = new BondsMaturityTypePerpetual();

        @NotNull
        public static final Parcelable.Creator<BondsMaturityTypePerpetual> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BondsMaturityTypePerpetual.f95309a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondsMaturityTypePerpetual[i];
            }
        }

        private BondsMaturityTypePerpetual() {
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
}
