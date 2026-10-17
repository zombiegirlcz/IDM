package com.revolut.retail.feature.stockdetails.impl.ui.screens.glossary;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0015\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0015\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section", "Landroid/os/Parcelable;", "<init>", "()V", "DividendInformation", "Dividends", "ExpenseRatios", "ManagementEfectiveness", "ManagementFees", "MarketCapitalisation", "EeaMarketCapitalisation", "PerShareData", "Price", "BondPrice", "ProfitabilityRatios", "Valuation", "Volume", "DividendsAndCharges", "PriceRange", "YieldRange", "Yield", "Risk", "BondCoupon", "BondIssue", "BondRedemption", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$BondCoupon;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$BondIssue;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$BondPrice;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$BondRedemption;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$DividendInformation;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$Dividends;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$DividendsAndCharges;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$EeaMarketCapitalisation;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$ExpenseRatios;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$ManagementEfectiveness;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$ManagementFees;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$MarketCapitalisation;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$PerShareData;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$Price;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$PriceRange;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$ProfitabilityRatios;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$Risk;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$Valuation;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$Volume;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$Yield;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$YieldRange;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GlossaryContract$Section implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$BondCoupon;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BondCoupon extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BondCoupon f103974a = new BondCoupon();

        @NotNull
        public static final Parcelable.Creator<BondCoupon> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BondCoupon.f103974a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondCoupon[i];
            }
        }

        private BondCoupon() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$BondIssue;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BondIssue extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BondIssue f103975a = new BondIssue();

        @NotNull
        public static final Parcelable.Creator<BondIssue> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BondIssue.f103975a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondIssue[i];
            }
        }

        private BondIssue() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$BondPrice;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BondPrice extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BondPrice f103976a = new BondPrice();

        @NotNull
        public static final Parcelable.Creator<BondPrice> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BondPrice.f103976a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondPrice[i];
            }
        }

        private BondPrice() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$BondRedemption;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BondRedemption extends GlossaryContract$Section {

        @NotNull
        public static final Parcelable.Creator<BondRedemption> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f103977a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BondRedemption(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondRedemption[i];
            }
        }

        public BondRedemption(boolean z) {
            this.f103977a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BondRedemption) && this.f103977a == ((BondRedemption) obj2).f103977a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f103977a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f103977a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$DividendInformation;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DividendInformation extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DividendInformation f103978a = new DividendInformation();

        @NotNull
        public static final Parcelable.Creator<DividendInformation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DividendInformation.f103978a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DividendInformation[i];
            }
        }

        private DividendInformation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$Dividends;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Dividends extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Dividends f103979a = new Dividends();

        @NotNull
        public static final Parcelable.Creator<Dividends> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Dividends.f103979a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dividends[i];
            }
        }

        private Dividends() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$DividendsAndCharges;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DividendsAndCharges extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DividendsAndCharges f103980a = new DividendsAndCharges();

        @NotNull
        public static final Parcelable.Creator<DividendsAndCharges> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DividendsAndCharges.f103980a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DividendsAndCharges[i];
            }
        }

        private DividendsAndCharges() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$EeaMarketCapitalisation;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EeaMarketCapitalisation extends GlossaryContract$Section {

        @NotNull
        public static final Parcelable.Creator<EeaMarketCapitalisation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z f103981a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EeaMarketCapitalisation(z.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EeaMarketCapitalisation[i];
            }
        }

        public EeaMarketCapitalisation(z instrumentType) {
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            this.f103981a = instrumentType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EeaMarketCapitalisation) && this.f103981a == ((EeaMarketCapitalisation) obj2).f103981a;
        }

        public final int hashCode() {
            return this.f103981a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103981a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$ExpenseRatios;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExpenseRatios extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExpenseRatios f103982a = new ExpenseRatios();

        @NotNull
        public static final Parcelable.Creator<ExpenseRatios> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExpenseRatios.f103982a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpenseRatios[i];
            }
        }

        private ExpenseRatios() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$ManagementEfectiveness;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ManagementEfectiveness extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ManagementEfectiveness f103983a = new ManagementEfectiveness();

        @NotNull
        public static final Parcelable.Creator<ManagementEfectiveness> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManagementEfectiveness.f103983a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManagementEfectiveness[i];
            }
        }

        private ManagementEfectiveness() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$ManagementFees;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ManagementFees extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ManagementFees f103984a = new ManagementFees();

        @NotNull
        public static final Parcelable.Creator<ManagementFees> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ManagementFees.f103984a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManagementFees[i];
            }
        }

        private ManagementFees() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$MarketCapitalisation;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MarketCapitalisation extends GlossaryContract$Section {

        @NotNull
        public static final Parcelable.Creator<MarketCapitalisation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z f103985a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarketCapitalisation(z.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarketCapitalisation[i];
            }
        }

        public MarketCapitalisation(z instrumentType) {
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            this.f103985a = instrumentType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MarketCapitalisation) && this.f103985a == ((MarketCapitalisation) obj2).f103985a;
        }

        public final int hashCode() {
            return this.f103985a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103985a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$PerShareData;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PerShareData extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PerShareData f103986a = new PerShareData();

        @NotNull
        public static final Parcelable.Creator<PerShareData> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PerShareData.f103986a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PerShareData[i];
            }
        }

        private PerShareData() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$PriceRange;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PriceRange extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PriceRange f103990a = new PriceRange();

        @NotNull
        public static final Parcelable.Creator<PriceRange> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PriceRange.f103990a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PriceRange[i];
            }
        }

        private PriceRange() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$ProfitabilityRatios;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProfitabilityRatios extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProfitabilityRatios f103991a = new ProfitabilityRatios();

        @NotNull
        public static final Parcelable.Creator<ProfitabilityRatios> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProfitabilityRatios.f103991a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProfitabilityRatios[i];
            }
        }

        private ProfitabilityRatios() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$Risk;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Risk extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Risk f103992a = new Risk();

        @NotNull
        public static final Parcelable.Creator<Risk> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Risk.f103992a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Risk[i];
            }
        }

        private Risk() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$Valuation;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Valuation extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Valuation f103993a = new Valuation();

        @NotNull
        public static final Parcelable.Creator<Valuation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Valuation.f103993a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Valuation[i];
            }
        }

        private Valuation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$Volume;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Volume extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Volume f103994a = new Volume();

        @NotNull
        public static final Parcelable.Creator<Volume> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Volume.f103994a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Volume[i];
            }
        }

        private Volume() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$Yield;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Yield extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Yield f103995a = new Yield();

        @NotNull
        public static final Parcelable.Creator<Yield> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Yield.f103995a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Yield[i];
            }
        }

        private Yield() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$YieldRange;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class YieldRange extends GlossaryContract$Section {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final YieldRange f103996a = new YieldRange();

        @NotNull
        public static final Parcelable.Creator<YieldRange> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return YieldRange.f103996a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new YieldRange[i];
            }
        }

        private YieldRange() {
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

    private GlossaryContract$Section() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section$Price;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/screens/glossary/GlossaryContract$Section;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Price extends GlossaryContract$Section {

        @NotNull
        public static final Parcelable.Creator<Price> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f103987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f103988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f103989c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Price(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Price[i];
            }
        }

        public Price(boolean z, boolean z3, boolean z4) {
            this.f103987a = z;
            this.f103988b = z3;
            this.f103989c = z4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Price)) {
                return false;
            }
            Price price = (Price) obj2;
            return this.f103987a == price.f103987a && this.f103988b == price.f103988b && this.f103989c == price.f103989c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f103989c) + j6.a.c(Boolean.hashCode(this.f103987a) * 31, 31, this.f103988b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f103987a ? 1 : 0);
            dest.writeInt(this.f103988b ? 1 : 0);
            dest.writeInt(this.f103989c ? 1 : 0);
        }

        public Price() {
            this(true, true, true);
        }
    }
}
