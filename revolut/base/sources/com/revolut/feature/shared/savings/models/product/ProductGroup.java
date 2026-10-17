package com.revolut.feature.shared.savings.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ncd.f;
import ncd.g;
import ncd.h;
import ncd.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001:\u001a\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001eJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u001f"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "InterestRatesConfig", "RateConfig", "BreakdownConfig", "BreakdownDisclaimer", "BreakdownItem", "ncd/e", "UpsellConfig", "CurrencySelectionScreen", "SelectionScreens", "RiskConfig", "CapitalAtRiskInformation", "Action", "SafetyInformation", "RiskIndicator", "TextWithExplanation", "ExplanationWithLabel", "ProductArticle", "Tax", "TaxBand", "TransfersConfig", "InterestPayoutConfig", "DocumentsConfig", "InfoItemConfig", "Explanation", "ncd/d", "ncd/f", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductGroup implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProductGroup> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f86521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f86522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f86523c;
    public final InterestRatesConfig d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f86524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UpsellConfig f86525h;
    public final CurrencySelectionScreen i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ProductArticle f86526j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f86527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TransfersConfig f86528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterestPayoutConfig f86529n;
    public final InterestPayoutConfig o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Action f86530p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DocumentsConfig f86531q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Action f86532r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RiskConfig f86533s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InfoItemConfig f86534t;
    public final InfoItemConfig u;
    public final SelectionScreens v;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$Action;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86536b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Action(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Action[i];
            }
        }

        public Action(String title, String deeplink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f86535a = title;
            this.f86536b = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Action)) {
                return false;
            }
            Action action = (Action) obj2;
            return Intrinsics.f(this.f86535a, action.f86535a) && Intrinsics.f(this.f86536b, action.f86536b);
        }

        public final int hashCode() {
            return this.f86536b.hashCode() + (this.f86535a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86535a);
            dest.writeString(this.f86536b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$BreakdownConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BreakdownConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<BreakdownConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BreakdownDisclaimer f86537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f86538b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BreakdownDisclaimer breakdownDisclaimerCreateFromParcel = BreakdownDisclaimer.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(BreakdownConfig.class, parcel, arrayList, iE, 1);
                }
                return new BreakdownConfig(breakdownDisclaimerCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BreakdownConfig[i];
            }
        }

        public BreakdownConfig(BreakdownDisclaimer disclaimer, ArrayList items) {
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f86537a = disclaimer;
            this.f86538b = items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BreakdownConfig)) {
                return false;
            }
            BreakdownConfig breakdownConfig = (BreakdownConfig) obj2;
            return Intrinsics.f(this.f86537a, breakdownConfig.f86537a) && this.f86538b.equals(breakdownConfig.f86538b);
        }

        public final int hashCode() {
            return this.f86538b.hashCode() + (this.f86537a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f86537a.writeToParcel(dest, i);
            Iterator itY = j6.a.y(this.f86538b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$BreakdownDisclaimer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BreakdownDisclaimer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<BreakdownDisclaimer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86540b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BreakdownDisclaimer(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BreakdownDisclaimer[i];
            }
        }

        public BreakdownDisclaimer(String title, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f86539a = title;
            this.f86540b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BreakdownDisclaimer)) {
                return false;
            }
            BreakdownDisclaimer breakdownDisclaimer = (BreakdownDisclaimer) obj2;
            return Intrinsics.f(this.f86539a, breakdownDisclaimer.f86539a) && Intrinsics.f(this.f86540b, breakdownDisclaimer.f86540b);
        }

        public final int hashCode() {
            int iHashCode = this.f86539a.hashCode() * 31;
            String str = this.f86540b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86539a);
            dest.writeString(this.f86540b);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$BreakdownItem;", "Landroid/os/Parcelable;", "InterestRate", "Taxes", "Fees", "Lcom/revolut/feature/shared/savings/models/product/ProductGroup$BreakdownItem$Fees;", "Lcom/revolut/feature/shared/savings/models/product/ProductGroup$BreakdownItem$InterestRate;", "Lcom/revolut/feature/shared/savings/models/product/ProductGroup$BreakdownItem$Taxes;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface BreakdownItem extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$BreakdownItem$Fees;", "Lcom/revolut/feature/shared/savings/models/product/ProductGroup$BreakdownItem;", "<init>", "()V", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Fees implements BreakdownItem {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Fees f86541a = new Fees();

            @NotNull
            public static final Parcelable.Creator<Fees> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Fees.f86541a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Fees[i];
                }
            }

            private Fees() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$BreakdownItem$InterestRate;", "Lcom/revolut/feature/shared/savings/models/product/ProductGroup$BreakdownItem;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InterestRate implements BreakdownItem {

            @NotNull
            public static final Parcelable.Creator<InterestRate> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final k f86542a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InterestRate(k.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InterestRate[i];
                }
            }

            public InterestRate(k rateType) {
                Intrinsics.checkNotNullParameter(rateType, "rateType");
                this.f86542a = rateType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof InterestRate) && this.f86542a == ((InterestRate) obj2).f86542a;
            }

            public final int hashCode() {
                return this.f86542a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f86542a.name());
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$BreakdownItem$Taxes;", "Lcom/revolut/feature/shared/savings/models/product/ProductGroup$BreakdownItem;", "<init>", "()V", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Taxes implements BreakdownItem {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Taxes f86543a = new Taxes();

            @NotNull
            public static final Parcelable.Creator<Taxes> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Taxes.f86543a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Taxes[i];
                }
            }

            private Taxes() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$CapitalAtRiskInformation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CapitalAtRiskInformation implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CapitalAtRiskInformation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Action f86545b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CapitalAtRiskInformation(parcel.readString(), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CapitalAtRiskInformation[i];
            }
        }

        public CapitalAtRiskInformation(String description, Action action) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.f86544a = description;
            this.f86545b = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CapitalAtRiskInformation)) {
                return false;
            }
            CapitalAtRiskInformation capitalAtRiskInformation = (CapitalAtRiskInformation) obj2;
            return Intrinsics.f(this.f86544a, capitalAtRiskInformation.f86544a) && Intrinsics.f(this.f86545b, capitalAtRiskInformation.f86545b);
        }

        public final int hashCode() {
            int iHashCode = this.f86544a.hashCode() * 31;
            Action action = this.f86545b;
            return iHashCode + (action == null ? 0 : action.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86544a);
            Action action = this.f86545b;
            if (action == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                action.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$CurrencySelectionScreen;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencySelectionScreen implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CurrencySelectionScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86547b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrencySelectionScreen(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencySelectionScreen[i];
            }
        }

        public CurrencySelectionScreen(String str, String str2) {
            this.f86546a = str;
            this.f86547b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrencySelectionScreen)) {
                return false;
            }
            CurrencySelectionScreen currencySelectionScreen = (CurrencySelectionScreen) obj2;
            return Intrinsics.f(this.f86546a, currencySelectionScreen.f86546a) && Intrinsics.f(this.f86547b, currencySelectionScreen.f86547b);
        }

        public final int hashCode() {
            String str = this.f86546a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f86547b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86546a);
            dest.writeString(this.f86547b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$DocumentsConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentsConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentsConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86549b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentsConfig(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsConfig[i];
            }
        }

        public DocumentsConfig(String title, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f86548a = title;
            this.f86549b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentsConfig)) {
                return false;
            }
            DocumentsConfig documentsConfig = (DocumentsConfig) obj2;
            return Intrinsics.f(this.f86548a, documentsConfig.f86548a) && Intrinsics.f(this.f86549b, documentsConfig.f86549b);
        }

        public final int hashCode() {
            int iHashCode = this.f86548a.hashCode() * 31;
            String str = this.f86549b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86548a);
            dest.writeString(this.f86549b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$Explanation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Explanation implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Explanation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86551b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Explanation(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Explanation[i];
            }
        }

        public Explanation(String title, String description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.f86550a = title;
            this.f86551b = description;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Explanation)) {
                return false;
            }
            Explanation explanation = (Explanation) obj2;
            return Intrinsics.f(this.f86550a, explanation.f86550a) && Intrinsics.f(this.f86551b, explanation.f86551b);
        }

        public final int hashCode() {
            return this.f86551b.hashCode() + (this.f86550a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86550a);
            dest.writeString(this.f86551b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$ExplanationWithLabel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExplanationWithLabel implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ExplanationWithLabel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86554c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExplanationWithLabel(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExplanationWithLabel[i];
            }
        }

        public ExplanationWithLabel(String title, String description, String actionLabel) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
            this.f86552a = title;
            this.f86553b = description;
            this.f86554c = actionLabel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExplanationWithLabel)) {
                return false;
            }
            ExplanationWithLabel explanationWithLabel = (ExplanationWithLabel) obj2;
            return Intrinsics.f(this.f86552a, explanationWithLabel.f86552a) && Intrinsics.f(this.f86553b, explanationWithLabel.f86553b) && Intrinsics.f(this.f86554c, explanationWithLabel.f86554c);
        }

        public final int hashCode() {
            return this.f86554c.hashCode() + p.a.c(this.f86552a.hashCode() * 31, 31, this.f86553b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86552a);
            dest.writeString(this.f86553b);
            dest.writeString(this.f86554c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$InfoItemConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InfoItemConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InfoItemConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86557c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InfoItemConfig(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InfoItemConfig[i];
            }
        }

        public InfoItemConfig(String title, String str, String str2) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f86555a = title;
            this.f86556b = str;
            this.f86557c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InfoItemConfig)) {
                return false;
            }
            InfoItemConfig infoItemConfig = (InfoItemConfig) obj2;
            return Intrinsics.f(this.f86555a, infoItemConfig.f86555a) && Intrinsics.f(this.f86556b, infoItemConfig.f86556b) && Intrinsics.f(this.f86557c, infoItemConfig.f86557c);
        }

        public final int hashCode() {
            int iHashCode = this.f86555a.hashCode() * 31;
            String str = this.f86556b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f86557c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86555a);
            dest.writeString(this.f86556b);
            dest.writeString(this.f86557c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$InterestPayoutConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InterestPayoutConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InterestPayoutConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86560c;
        public final Explanation d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InterestPayoutConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Explanation.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InterestPayoutConfig[i];
            }
        }

        public InterestPayoutConfig(String title, String str, String str2, Explanation explanation) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f86558a = title;
            this.f86559b = str;
            this.f86560c = str2;
            this.d = explanation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InterestPayoutConfig)) {
                return false;
            }
            InterestPayoutConfig interestPayoutConfig = (InterestPayoutConfig) obj2;
            return Intrinsics.f(this.f86558a, interestPayoutConfig.f86558a) && Intrinsics.f(this.f86559b, interestPayoutConfig.f86559b) && Intrinsics.f(this.f86560c, interestPayoutConfig.f86560c) && Intrinsics.f(this.d, interestPayoutConfig.d);
        }

        public final int hashCode() {
            int iHashCode = this.f86558a.hashCode() * 31;
            String str = this.f86559b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f86560c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Explanation explanation = this.d;
            return iHashCode3 + (explanation != null ? explanation.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86558a);
            dest.writeString(this.f86559b);
            dest.writeString(this.f86560c);
            Explanation explanation = this.d;
            if (explanation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                explanation.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$InterestRatesConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InterestRatesConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InterestRatesConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RateConfig f86561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RateConfig f86562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RateConfig f86563c;
        public final RateConfig d;
        public final RateConfig e;
        public final BreakdownDisclaimer f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final k f86564g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ncd.d f86565h;
        public final BreakdownConfig i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f86566j;
        public final ncd.e k;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InterestRatesConfig(parcel.readInt() == 0 ? null : RateConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RateConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RateConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RateConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RateConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BreakdownDisclaimer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? k.valueOf(parcel.readString()) : null, ncd.d.valueOf(parcel.readString()), BreakdownConfig.CREATOR.createFromParcel(parcel), parcel.readString(), ncd.e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InterestRatesConfig[i];
            }
        }

        public InterestRatesConfig(RateConfig rateConfig, RateConfig rateConfig2, RateConfig rateConfig3, RateConfig rateConfig4, RateConfig rateConfig5, BreakdownDisclaimer breakdownDisclaimer, k kVar, ncd.d interestAliasVariant, BreakdownConfig breakdownConfig, String str, ncd.e rateDisplayStyle) {
            Intrinsics.checkNotNullParameter(interestAliasVariant, "interestAliasVariant");
            Intrinsics.checkNotNullParameter(breakdownConfig, "breakdownConfig");
            Intrinsics.checkNotNullParameter(rateDisplayStyle, "rateDisplayStyle");
            this.f86561a = rateConfig;
            this.f86562b = rateConfig2;
            this.f86563c = rateConfig3;
            this.d = rateConfig4;
            this.e = rateConfig5;
            this.f = breakdownDisclaimer;
            this.f86564g = kVar;
            this.f86565h = interestAliasVariant;
            this.i = breakdownConfig;
            this.f86566j = str;
            this.k = rateDisplayStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InterestRatesConfig)) {
                return false;
            }
            InterestRatesConfig interestRatesConfig = (InterestRatesConfig) obj2;
            return Intrinsics.f(this.f86561a, interestRatesConfig.f86561a) && Intrinsics.f(this.f86562b, interestRatesConfig.f86562b) && Intrinsics.f(this.f86563c, interestRatesConfig.f86563c) && Intrinsics.f(this.d, interestRatesConfig.d) && Intrinsics.f(this.e, interestRatesConfig.e) && Intrinsics.f(this.f, interestRatesConfig.f) && this.f86564g == interestRatesConfig.f86564g && this.f86565h == interestRatesConfig.f86565h && Intrinsics.f(this.i, interestRatesConfig.i) && Intrinsics.f(this.f86566j, interestRatesConfig.f86566j) && this.k == interestRatesConfig.k;
        }

        public final int hashCode() {
            RateConfig rateConfig = this.f86561a;
            int iHashCode = (rateConfig == null ? 0 : rateConfig.hashCode()) * 31;
            RateConfig rateConfig2 = this.f86562b;
            int iHashCode2 = (iHashCode + (rateConfig2 == null ? 0 : rateConfig2.hashCode())) * 31;
            RateConfig rateConfig3 = this.f86563c;
            int iHashCode3 = (iHashCode2 + (rateConfig3 == null ? 0 : rateConfig3.hashCode())) * 31;
            RateConfig rateConfig4 = this.d;
            int iHashCode4 = (iHashCode3 + (rateConfig4 == null ? 0 : rateConfig4.hashCode())) * 31;
            RateConfig rateConfig5 = this.e;
            int iHashCode5 = (iHashCode4 + (rateConfig5 == null ? 0 : rateConfig5.hashCode())) * 31;
            BreakdownDisclaimer breakdownDisclaimer = this.f;
            int iHashCode6 = (iHashCode5 + (breakdownDisclaimer == null ? 0 : breakdownDisclaimer.hashCode())) * 31;
            k kVar = this.f86564g;
            int iHashCode7 = (this.i.hashCode() + ((this.f86565h.hashCode() + ((iHashCode6 + (kVar == null ? 0 : kVar.hashCode())) * 31)) * 31)) * 31;
            String str = this.f86566j;
            return this.k.hashCode() + ((iHashCode7 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            RateConfig rateConfig = this.f86561a;
            if (rateConfig == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rateConfig.writeToParcel(dest, i);
            }
            RateConfig rateConfig2 = this.f86562b;
            if (rateConfig2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rateConfig2.writeToParcel(dest, i);
            }
            RateConfig rateConfig3 = this.f86563c;
            if (rateConfig3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rateConfig3.writeToParcel(dest, i);
            }
            RateConfig rateConfig4 = this.d;
            if (rateConfig4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rateConfig4.writeToParcel(dest, i);
            }
            RateConfig rateConfig5 = this.e;
            if (rateConfig5 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                rateConfig5.writeToParcel(dest, i);
            }
            BreakdownDisclaimer breakdownDisclaimer = this.f;
            if (breakdownDisclaimer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                breakdownDisclaimer.writeToParcel(dest, i);
            }
            k kVar = this.f86564g;
            if (kVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(kVar.name());
            }
            dest.writeString(this.f86565h.name());
            this.i.writeToParcel(dest, i);
            dest.writeString(this.f86566j);
            dest.writeString(this.k.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$ProductArticle;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedHashMap f86568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f86569c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new ProductArticle(string, linkedHashMap, parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(String templateId, LinkedHashMap substitutions, boolean z, String str) {
            Intrinsics.checkNotNullParameter(templateId, "templateId");
            Intrinsics.checkNotNullParameter(substitutions, "substitutions");
            this.f86567a = templateId;
            this.f86568b = substitutions;
            this.f86569c = z;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductArticle)) {
                return false;
            }
            ProductArticle productArticle = (ProductArticle) obj2;
            return Intrinsics.f(this.f86567a, productArticle.f86567a) && this.f86568b.equals(productArticle.f86568b) && this.f86569c == productArticle.f86569c && Intrinsics.f(this.d, productArticle.d);
        }

        public final int hashCode() {
            int iC = j6.a.c(r6.b.e(this.f86568b, this.f86567a.hashCode() * 31, 31), 31, this.f86569c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86567a);
            LinkedHashMap linkedHashMap = this.f86568b;
            dest.writeInt(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
            dest.writeInt(this.f86569c ? 1 : 0);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$RateConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RateConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RateConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86572c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RateConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RateConfig[i];
            }
        }

        public RateConfig(String suffix, String displayName, String str, String str2) {
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            this.f86570a = suffix;
            this.f86571b = displayName;
            this.f86572c = str;
            this.d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RateConfig)) {
                return false;
            }
            RateConfig rateConfig = (RateConfig) obj2;
            return Intrinsics.f(this.f86570a, rateConfig.f86570a) && Intrinsics.f(this.f86571b, rateConfig.f86571b) && Intrinsics.f(this.f86572c, rateConfig.f86572c) && Intrinsics.f(this.d, rateConfig.d);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f86570a.hashCode() * 31, 31, this.f86571b);
            String str = this.f86572c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86570a);
            dest.writeString(this.f86571b);
            dest.writeString(this.f86572c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$RiskConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RiskConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RiskConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86575c;
        public final CapitalAtRiskInformation d;
        public final SafetyInformation e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RiskConfig(parcel.readString(), parcel.readString(), parcel.readString(), CapitalAtRiskInformation.CREATOR.createFromParcel(parcel), SafetyInformation.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RiskConfig[i];
            }
        }

        public RiskConfig(String title, String str, String str2, CapitalAtRiskInformation capitalAtRiskInformation, SafetyInformation safetyInformation) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(capitalAtRiskInformation, "capitalAtRiskInformation");
            Intrinsics.checkNotNullParameter(safetyInformation, "safetyInformation");
            this.f86573a = title;
            this.f86574b = str;
            this.f86575c = str2;
            this.d = capitalAtRiskInformation;
            this.e = safetyInformation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RiskConfig)) {
                return false;
            }
            RiskConfig riskConfig = (RiskConfig) obj2;
            return Intrinsics.f(this.f86573a, riskConfig.f86573a) && Intrinsics.f(this.f86574b, riskConfig.f86574b) && Intrinsics.f(this.f86575c, riskConfig.f86575c) && Intrinsics.f(this.d, riskConfig.d) && Intrinsics.f(this.e, riskConfig.e);
        }

        public final int hashCode() {
            int iHashCode = this.f86573a.hashCode() * 31;
            String str = this.f86574b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f86575c;
            return this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86573a);
            dest.writeString(this.f86574b);
            dest.writeString(this.f86575c);
            this.d.writeToParcel(dest, i);
            this.e.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$RiskIndicator;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RiskIndicator implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RiskIndicator> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f86578c;
        public final int d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RiskIndicator(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RiskIndicator[i];
            }
        }

        public RiskIndicator(String title, String explanation, int i, int i2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(explanation, "explanation");
            this.f86576a = title;
            this.f86577b = explanation;
            this.f86578c = i;
            this.d = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RiskIndicator)) {
                return false;
            }
            RiskIndicator riskIndicator = (RiskIndicator) obj2;
            return Intrinsics.f(this.f86576a, riskIndicator.f86576a) && Intrinsics.f(this.f86577b, riskIndicator.f86577b) && this.f86578c == riskIndicator.f86578c && this.d == riskIndicator.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + j6.a.b(this.f86578c, p.a.c(this.f86576a.hashCode() * 31, 31, this.f86577b), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86576a);
            dest.writeString(this.f86577b);
            dest.writeInt(this.f86578c);
            dest.writeInt(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$SafetyInformation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SafetyInformation implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SafetyInformation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RiskIndicator f86580b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SafetyInformation(parcel.readString(), parcel.readInt() == 0 ? null : RiskIndicator.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SafetyInformation[i];
            }
        }

        public SafetyInformation(String description, RiskIndicator riskIndicator) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.f86579a = description;
            this.f86580b = riskIndicator;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SafetyInformation)) {
                return false;
            }
            SafetyInformation safetyInformation = (SafetyInformation) obj2;
            return Intrinsics.f(this.f86579a, safetyInformation.f86579a) && Intrinsics.f(this.f86580b, safetyInformation.f86580b);
        }

        public final int hashCode() {
            int iHashCode = this.f86579a.hashCode() * 31;
            RiskIndicator riskIndicator = this.f86580b;
            return iHashCode + (riskIndicator == null ? 0 : riskIndicator.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86579a);
            RiskIndicator riskIndicator = this.f86580b;
            if (riskIndicator == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                riskIndicator.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$SelectionScreens;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectionScreens implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelectionScreens> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86581a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectionScreens(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectionScreens[i];
            }
        }

        public SelectionScreens(String str) {
            this.f86581a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectionScreens) && Intrinsics.f(this.f86581a, ((SelectionScreens) obj2).f86581a);
        }

        public final int hashCode() {
            String str = this.f86581a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86581a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$Tax;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tax implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Tax> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f86584c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TaxBand.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Tax(string, string2, parcel.readString(), parcel.readString(), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tax[i];
            }
        }

        public Tax(String displayName, String str, String str2, String str3, List bands) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(bands, "bands");
            this.f86582a = displayName;
            this.f86583b = str;
            this.f86584c = bands;
            this.d = str2;
            this.e = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Tax)) {
                return false;
            }
            Tax tax = (Tax) obj2;
            return Intrinsics.f(this.f86582a, tax.f86582a) && Intrinsics.f(this.f86583b, tax.f86583b) && Intrinsics.f(this.f86584c, tax.f86584c) && Intrinsics.f(this.d, tax.d) && Intrinsics.f(this.e, tax.e);
        }

        public final int hashCode() {
            int iHashCode = this.f86582a.hashCode() * 31;
            String str = this.f86583b;
            int iD = p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f86584c);
            String str2 = this.d;
            int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86582a);
            dest.writeString(this.f86583b);
            Iterator itV = p.a.v(this.f86584c, dest);
            while (itV.hasNext()) {
                ((TaxBand) itV.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$TaxBand;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxBand implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TaxBand> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f86586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f86587c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxBand(parcel.readString(), parcel.readDouble(), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxBand[i];
            }
        }

        public TaxBand(String title, double d, double d5) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f86585a = title;
            this.f86586b = d;
            this.f86587c = d5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxBand)) {
                return false;
            }
            TaxBand taxBand = (TaxBand) obj2;
            return Intrinsics.f(this.f86585a, taxBand.f86585a) && Double.compare(this.f86586b, taxBand.f86586b) == 0 && Double.compare(this.f86587c, taxBand.f86587c) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f86587c) + m72.b.c(this.f86585a.hashCode() * 31, this.f86586b, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86585a);
            dest.writeDouble(this.f86586b);
            dest.writeDouble(this.f86587c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$TextWithExplanation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TextWithExplanation implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TextWithExplanation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExplanationWithLabel f86589b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TextWithExplanation(parcel.readString(), parcel.readInt() == 0 ? null : ExplanationWithLabel.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TextWithExplanation[i];
            }
        }

        public TextWithExplanation(String text, ExplanationWithLabel explanationWithLabel) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f86588a = text;
            this.f86589b = explanationWithLabel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TextWithExplanation)) {
                return false;
            }
            TextWithExplanation textWithExplanation = (TextWithExplanation) obj2;
            return Intrinsics.f(this.f86588a, textWithExplanation.f86588a) && Intrinsics.f(this.f86589b, textWithExplanation.f86589b);
        }

        public final int hashCode() {
            int iHashCode = this.f86588a.hashCode() * 31;
            ExplanationWithLabel explanationWithLabel = this.f86589b;
            return iHashCode + (explanationWithLabel == null ? 0 : explanationWithLabel.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86588a);
            ExplanationWithLabel explanationWithLabel = this.f86589b;
            if (explanationWithLabel == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                explanationWithLabel.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$TransfersConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransfersConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TransfersConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86591b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransfersConfig(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransfersConfig[i];
            }
        }

        public TransfersConfig(String title, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f86590a = title;
            this.f86591b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransfersConfig)) {
                return false;
            }
            TransfersConfig transfersConfig = (TransfersConfig) obj2;
            return Intrinsics.f(this.f86590a, transfersConfig.f86590a) && Intrinsics.f(this.f86591b, transfersConfig.f86591b);
        }

        public final int hashCode() {
            int iHashCode = this.f86590a.hashCode() * 31;
            String str = this.f86591b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86590a);
            dest.writeString(this.f86591b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/savings/models/product/ProductGroup$UpsellConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_savings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpsellConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UpsellConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextWithExplanation f86592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextWithExplanation f86593b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpsellConfig(parcel.readInt() == 0 ? null : TextWithExplanation.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TextWithExplanation.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpsellConfig[i];
            }
        }

        public UpsellConfig(TextWithExplanation textWithExplanation, TextWithExplanation textWithExplanation2) {
            this.f86592a = textWithExplanation;
            this.f86593b = textWithExplanation2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpsellConfig)) {
                return false;
            }
            UpsellConfig upsellConfig = (UpsellConfig) obj2;
            return Intrinsics.f(this.f86592a, upsellConfig.f86592a) && Intrinsics.f(this.f86593b, upsellConfig.f86593b);
        }

        public final int hashCode() {
            TextWithExplanation textWithExplanation = this.f86592a;
            int iHashCode = (textWithExplanation == null ? 0 : textWithExplanation.hashCode()) * 31;
            TextWithExplanation textWithExplanation2 = this.f86593b;
            return iHashCode + (textWithExplanation2 != null ? textWithExplanation2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            TextWithExplanation textWithExplanation = this.f86592a;
            if (textWithExplanation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                textWithExplanation.writeToParcel(dest, i);
            }
            TextWithExplanation textWithExplanation2 = this.f86593b;
            if (textWithExplanation2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                textWithExplanation2.writeToParcel(dest, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            g gVarValueOf = g.valueOf(parcel.readString());
            h hVarValueOf = h.valueOf(parcel.readString());
            xi0.b bVar = (xi0.b) parcel.readSerializable();
            InterestRatesConfig interestRatesConfigCreateFromParcel = InterestRatesConfig.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            UpsellConfig upsellConfigCreateFromParcel = UpsellConfig.CREATOR.createFromParcel(parcel);
            CurrencySelectionScreen currencySelectionScreenCreateFromParcel = CurrencySelectionScreen.CREATOR.createFromParcel(parcel);
            ProductArticle productArticleCreateFromParcel = parcel.readInt() == 0 ? null : ProductArticle.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Tax.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ProductGroup(gVarValueOf, hVarValueOf, bVar, interestRatesConfigCreateFromParcel, string, string2, string3, upsellConfigCreateFromParcel, currencySelectionScreenCreateFromParcel, productArticleCreateFromParcel, arrayList, f.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : TransfersConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InterestPayoutConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InterestPayoutConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentsConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RiskConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InfoItemConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InfoItemConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelectionScreens.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductGroup[i];
        }
    }

    public ProductGroup(g type, h accountType, xi0.b defaultCurrency, InterestRatesConfig interestRatesConfig, String str, String str2, String str3, UpsellConfig upsellConfig, CurrencySelectionScreen currencySelectionScreen, ProductArticle productArticle, List taxes, f settlementType, TransfersConfig transfersConfig, InterestPayoutConfig interestPayoutConfig, InterestPayoutConfig interestPayoutConfig2, Action action, DocumentsConfig documentsConfig, Action action2, RiskConfig riskConfig, InfoItemConfig infoItemConfig, InfoItemConfig infoItemConfig2, SelectionScreens selectionScreens) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(defaultCurrency, "defaultCurrency");
        Intrinsics.checkNotNullParameter(interestRatesConfig, "interestRatesConfig");
        Intrinsics.checkNotNullParameter(upsellConfig, "upsellConfig");
        Intrinsics.checkNotNullParameter(currencySelectionScreen, "currencySelectionScreen");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        Intrinsics.checkNotNullParameter(settlementType, "settlementType");
        this.f86521a = type;
        this.f86522b = accountType;
        this.f86523c = defaultCurrency;
        this.d = interestRatesConfig;
        this.e = str;
        this.f = str2;
        this.f86524g = str3;
        this.f86525h = upsellConfig;
        this.i = currencySelectionScreen;
        this.f86526j = productArticle;
        this.k = taxes;
        this.f86527l = settlementType;
        this.f86528m = transfersConfig;
        this.f86529n = interestPayoutConfig;
        this.o = interestPayoutConfig2;
        this.f86530p = action;
        this.f86531q = documentsConfig;
        this.f86532r = action2;
        this.f86533s = riskConfig;
        this.f86534t = infoItemConfig;
        this.u = infoItemConfig2;
        this.v = selectionScreens;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductGroup)) {
            return false;
        }
        ProductGroup productGroup = (ProductGroup) obj2;
        return this.f86521a == productGroup.f86521a && this.f86522b == productGroup.f86522b && Intrinsics.f(this.f86523c, productGroup.f86523c) && Intrinsics.f(this.d, productGroup.d) && Intrinsics.f(this.e, productGroup.e) && Intrinsics.f(this.f, productGroup.f) && Intrinsics.f(this.f86524g, productGroup.f86524g) && Intrinsics.f(this.f86525h, productGroup.f86525h) && Intrinsics.f(this.i, productGroup.i) && Intrinsics.f(this.f86526j, productGroup.f86526j) && Intrinsics.f(this.k, productGroup.k) && this.f86527l == productGroup.f86527l && Intrinsics.f(this.f86528m, productGroup.f86528m) && Intrinsics.f(this.f86529n, productGroup.f86529n) && Intrinsics.f(this.o, productGroup.o) && Intrinsics.f(this.f86530p, productGroup.f86530p) && Intrinsics.f(this.f86531q, productGroup.f86531q) && Intrinsics.f(this.f86532r, productGroup.f86532r) && Intrinsics.f(this.f86533s, productGroup.f86533s) && Intrinsics.f(this.f86534t, productGroup.f86534t) && Intrinsics.f(this.u, productGroup.u) && Intrinsics.f(this.v, productGroup.v);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + l.j(this.f86523c, (this.f86522b.hashCode() + (this.f86521a.hashCode() * 31)) * 31, 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f86524g;
        int iHashCode4 = (this.i.hashCode() + ((this.f86525h.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31;
        ProductArticle productArticle = this.f86526j;
        int iHashCode5 = (this.f86527l.hashCode() + p.a.d((iHashCode4 + (productArticle == null ? 0 : productArticle.hashCode())) * 31, 31, this.k)) * 31;
        TransfersConfig transfersConfig = this.f86528m;
        int iHashCode6 = (iHashCode5 + (transfersConfig == null ? 0 : transfersConfig.hashCode())) * 31;
        InterestPayoutConfig interestPayoutConfig = this.f86529n;
        int iHashCode7 = (iHashCode6 + (interestPayoutConfig == null ? 0 : interestPayoutConfig.hashCode())) * 31;
        InterestPayoutConfig interestPayoutConfig2 = this.o;
        int iHashCode8 = (iHashCode7 + (interestPayoutConfig2 == null ? 0 : interestPayoutConfig2.hashCode())) * 31;
        Action action = this.f86530p;
        int iHashCode9 = (iHashCode8 + (action == null ? 0 : action.hashCode())) * 31;
        DocumentsConfig documentsConfig = this.f86531q;
        int iHashCode10 = (iHashCode9 + (documentsConfig == null ? 0 : documentsConfig.hashCode())) * 31;
        Action action2 = this.f86532r;
        int iHashCode11 = (iHashCode10 + (action2 == null ? 0 : action2.hashCode())) * 31;
        RiskConfig riskConfig = this.f86533s;
        int iHashCode12 = (iHashCode11 + (riskConfig == null ? 0 : riskConfig.hashCode())) * 31;
        InfoItemConfig infoItemConfig = this.f86534t;
        int iHashCode13 = (iHashCode12 + (infoItemConfig == null ? 0 : infoItemConfig.hashCode())) * 31;
        InfoItemConfig infoItemConfig2 = this.u;
        int iHashCode14 = (iHashCode13 + (infoItemConfig2 == null ? 0 : infoItemConfig2.hashCode())) * 31;
        SelectionScreens selectionScreens = this.v;
        return iHashCode14 + (selectionScreens != null ? selectionScreens.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86521a.name());
        dest.writeString(this.f86522b.name());
        dest.writeSerializable(this.f86523c);
        this.d.writeToParcel(dest, i);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f86524g);
        this.f86525h.writeToParcel(dest, i);
        this.i.writeToParcel(dest, i);
        ProductArticle productArticle = this.f86526j;
        if (productArticle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            productArticle.writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.k, dest);
        while (itV.hasNext()) {
            ((Tax) itV.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f86527l.name());
        TransfersConfig transfersConfig = this.f86528m;
        if (transfersConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            transfersConfig.writeToParcel(dest, i);
        }
        InterestPayoutConfig interestPayoutConfig = this.f86529n;
        if (interestPayoutConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            interestPayoutConfig.writeToParcel(dest, i);
        }
        InterestPayoutConfig interestPayoutConfig2 = this.o;
        if (interestPayoutConfig2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            interestPayoutConfig2.writeToParcel(dest, i);
        }
        Action action = this.f86530p;
        if (action == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            action.writeToParcel(dest, i);
        }
        DocumentsConfig documentsConfig = this.f86531q;
        if (documentsConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            documentsConfig.writeToParcel(dest, i);
        }
        Action action2 = this.f86532r;
        if (action2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            action2.writeToParcel(dest, i);
        }
        RiskConfig riskConfig = this.f86533s;
        if (riskConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            riskConfig.writeToParcel(dest, i);
        }
        InfoItemConfig infoItemConfig = this.f86534t;
        if (infoItemConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            infoItemConfig.writeToParcel(dest, i);
        }
        InfoItemConfig infoItemConfig2 = this.u;
        if (infoItemConfig2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            infoItemConfig2.writeToParcel(dest, i);
        }
        SelectionScreens selectionScreens = this.v;
        if (selectionScreens == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            selectionScreens.writeToParcel(dest, i);
        }
    }
}
