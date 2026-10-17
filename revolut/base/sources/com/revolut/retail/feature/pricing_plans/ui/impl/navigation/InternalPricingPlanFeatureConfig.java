package com.revolut.retail.feature.pricing_plans.ui.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import b93.f;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$RevPointsCardType;
import e93.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v1.c;
import xfa.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "PlanUpgrade", "InternalCheckoutPlanSelection", "InternalPlanChange", "RevPointsCardsBottomSheetDestination", "CancelPlanDowngradeDestination", "PlanTerms", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig$InternalCheckoutPlanSelection;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig$InternalPlanChange;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig$PlanUpgrade;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InternalPricingPlanFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig$CancelPlanDowngradeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CancelPlanDowngradeDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancelPlanDowngradeDestination f103317a = new CancelPlanDowngradeDestination();

        @NotNull
        public static final Parcelable.Creator<CancelPlanDowngradeDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CancelPlanDowngradeDestination.f103317a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelPlanDowngradeDestination[i];
            }
        }

        private CancelPlanDowngradeDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig$InternalCheckoutPlanSelection;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InternalCheckoutPlanSelection extends InternalPricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<InternalCheckoutPlanSelection> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final PlanUpgradePurpose f103318g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final b f103319h;
        public final f i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d f103320j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final NaviCommand f103321l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final AccountId f103322m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AnalyticsProduct f103323n;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig$InternalCheckoutPlanSelection$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlanUpgradePurpose f103324a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f103325b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final f f103326c;
            public final d d;
            public final boolean e;
            public final NaviCommand f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final AccountId f103327g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final AnalyticsProduct f103328h;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination((PlanUpgradePurpose) parcel.readParcelable(Destination.class.getClassLoader()), b.valueOf(parcel.readString()), (f) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() != 0, (NaviCommand) parcel.readParcelable(Destination.class.getClassLoader()), (AccountId) parcel.readParcelable(Destination.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(PlanUpgradePurpose purpose, b source, f checkoutCardParams, d dVar, boolean z, NaviCommand naviCommand, AccountId accountId, AnalyticsProduct analyticsProduct) {
                Intrinsics.checkNotNullParameter(purpose, "purpose");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(checkoutCardParams, "checkoutCardParams");
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
                this.f103324a = purpose;
                this.f103325b = source;
                this.f103326c = checkoutCardParams;
                this.d = dVar;
                this.e = z;
                this.f = naviCommand;
                this.f103327g = accountId;
                this.f103328h = analyticsProduct;
            }

            /* JADX INFO: renamed from: P, reason: from getter */
            public final AnalyticsProduct getF103328h() {
                return this.f103328h;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final d getD() {
                return this.d;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final f getF103326c() {
                return this.f103326c;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final NaviCommand getF() {
                return this.f;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final PlanUpgradePurpose getF103324a() {
                return this.f103324a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final b getF103325b() {
                return this.f103325b;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return Intrinsics.f(this.f103324a, destination.f103324a) && this.f103325b == destination.f103325b && Intrinsics.f(this.f103326c, destination.f103326c) && Intrinsics.f(this.d, destination.d) && this.e == destination.e && Intrinsics.f(this.f, destination.f) && Intrinsics.f(this.f103327g, destination.f103327g) && Intrinsics.f(this.f103328h, destination.f103328h);
            }

            /* JADX INFO: renamed from: getAccountId, reason: from getter */
            public final AccountId getF103327g() {
                return this.f103327g;
            }

            public final int hashCode() {
                int iHashCode = (this.f103326c.hashCode() + c.c(this.f103325b, this.f103324a.hashCode() * 31, 31)) * 31;
                d dVar = this.d;
                int iC = j6.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.e);
                NaviCommand naviCommand = this.f;
                return this.f103328h.hashCode() + l.b(this.f103327g, (iC + (naviCommand != null ? naviCommand.hashCode() : 0)) * 31, 31);
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final boolean getE() {
                return this.e;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f103324a, i);
                dest.writeString(this.f103325b.name());
                dest.writeSerializable(this.f103326c);
                dest.writeSerializable(this.d);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeParcelable(this.f, i);
                dest.writeParcelable(this.f103327g, i);
                dest.writeParcelable(this.f103328h, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InternalCheckoutPlanSelection((PlanUpgradePurpose) parcel.readParcelable(InternalCheckoutPlanSelection.class.getClassLoader()), b.valueOf(parcel.readString()), (f) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() != 0, (NaviCommand) parcel.readParcelable(InternalCheckoutPlanSelection.class.getClassLoader()), (AccountId) parcel.readParcelable(InternalCheckoutPlanSelection.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(InternalCheckoutPlanSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InternalCheckoutPlanSelection[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalCheckoutPlanSelection(PlanUpgradePurpose purpose, b source, f checkoutCardParams, d dVar, boolean z, NaviCommand naviCommand, AccountId accountId, AnalyticsProduct analyticsProduct) {
            super(new Destination(purpose, source, checkoutCardParams, dVar, z, naviCommand, accountId, analyticsProduct));
            Intrinsics.checkNotNullParameter(purpose, "purpose");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(checkoutCardParams, "checkoutCardParams");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f103318g = purpose;
            this.f103319h = source;
            this.i = checkoutCardParams;
            this.f103320j = dVar;
            this.k = z;
            this.f103321l = naviCommand;
            this.f103322m = accountId;
            this.f103323n = analyticsProduct;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InternalCheckoutPlanSelection)) {
                return false;
            }
            InternalCheckoutPlanSelection internalCheckoutPlanSelection = (InternalCheckoutPlanSelection) obj2;
            return Intrinsics.f(this.f103318g, internalCheckoutPlanSelection.f103318g) && this.f103319h == internalCheckoutPlanSelection.f103319h && Intrinsics.f(this.i, internalCheckoutPlanSelection.i) && Intrinsics.f(this.f103320j, internalCheckoutPlanSelection.f103320j) && this.k == internalCheckoutPlanSelection.k && Intrinsics.f(this.f103321l, internalCheckoutPlanSelection.f103321l) && Intrinsics.f(this.f103322m, internalCheckoutPlanSelection.f103322m) && Intrinsics.f(this.f103323n, internalCheckoutPlanSelection.f103323n);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.i.hashCode() + c.c(this.f103319h, this.f103318g.hashCode() * 31, 31)) * 31;
            d dVar = this.f103320j;
            int iC = j6.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.k);
            NaviCommand naviCommand = this.f103321l;
            return this.f103323n.hashCode() + l.b(this.f103322m, (iC + (naviCommand != null ? naviCommand.hashCode() : 0)) * 31, 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103318g, i);
            dest.writeString(this.f103319h.name());
            dest.writeSerializable(this.i);
            dest.writeSerializable(this.f103320j);
            dest.writeInt(this.k ? 1 : 0);
            dest.writeParcelable(this.f103321l, i);
            dest.writeParcelable(this.f103322m, i);
            dest.writeParcelable(this.f103323n, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig$InternalPlanChange;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InternalPlanChange extends InternalPricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<InternalPlanChange> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f103332g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final PlanSelection f103333h;
        public final PlanChangeSuccessActionStrategy i;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig$InternalPlanChange$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f103334a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PlanSelection f103335b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final PlanChangeSuccessActionStrategy f103336c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination(b.valueOf(parcel.readString()), (PlanSelection) parcel.readParcelable(Destination.class.getClassLoader()), (PlanChangeSuccessActionStrategy) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(b source, PlanSelection planSelection, PlanChangeSuccessActionStrategy successActionStrategy) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(planSelection, "planSelection");
                Intrinsics.checkNotNullParameter(successActionStrategy, "successActionStrategy");
                this.f103334a = source;
                this.f103335b = planSelection;
                this.f103336c = successActionStrategy;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final PlanSelection getF103335b() {
                return this.f103335b;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final b getF103334a() {
                return this.f103334a;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final PlanChangeSuccessActionStrategy getF103336c() {
                return this.f103336c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return this.f103334a == destination.f103334a && Intrinsics.f(this.f103335b, destination.f103335b) && Intrinsics.f(this.f103336c, destination.f103336c);
            }

            public final int hashCode() {
                return this.f103336c.hashCode() + ((this.f103335b.hashCode() + (this.f103334a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f103334a.name());
                dest.writeParcelable(this.f103335b, i);
                dest.writeParcelable(this.f103336c, i);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InternalPlanChange(b.valueOf(parcel.readString()), (PlanSelection) parcel.readParcelable(InternalPlanChange.class.getClassLoader()), (PlanChangeSuccessActionStrategy) parcel.readParcelable(InternalPlanChange.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InternalPlanChange[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalPlanChange(b source, PlanSelection planSelection, PlanChangeSuccessActionStrategy successActionStrategy) {
            super(new Destination(source, planSelection, successActionStrategy));
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(planSelection, "planSelection");
            Intrinsics.checkNotNullParameter(successActionStrategy, "successActionStrategy");
            this.f103332g = source;
            this.f103333h = planSelection;
            this.i = successActionStrategy;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InternalPlanChange)) {
                return false;
            }
            InternalPlanChange internalPlanChange = (InternalPlanChange) obj2;
            return this.f103332g == internalPlanChange.f103332g && Intrinsics.f(this.f103333h, internalPlanChange.f103333h) && Intrinsics.f(this.i, internalPlanChange.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.i.hashCode() + ((this.f103333h.hashCode() + (this.f103332g.hashCode() * 31)) * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103332g.name());
            dest.writeParcelable(this.f103333h, i);
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig$PlanTerms;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanTerms implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<PlanTerms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f103342b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanTerms(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanTerms[i];
            }
        }

        public PlanTerms(String planId, boolean z) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f103341a = planId;
            this.f103342b = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF103342b() {
            return this.f103342b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanTerms)) {
                return false;
            }
            PlanTerms planTerms = (PlanTerms) obj2;
            return Intrinsics.f(this.f103341a, planTerms.f103341a) && this.f103342b == planTerms.f103342b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f103342b) + (this.f103341a.hashCode() * 31);
        }

        /* JADX INFO: renamed from: n0, reason: from getter */
        public final String getF103341a() {
            return this.f103341a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103341a);
            dest.writeInt(this.f103342b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig$RevPointsCardsBottomSheetDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsCardsBottomSheetDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<RevPointsCardsBottomSheetDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlanRevPointsCardsScreenContract$RevPointsCardType f103349a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPointsCardsBottomSheetDestination((PlanRevPointsCardsScreenContract$RevPointsCardType) parcel.readParcelable(RevPointsCardsBottomSheetDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsCardsBottomSheetDestination[i];
            }
        }

        public RevPointsCardsBottomSheetDestination(PlanRevPointsCardsScreenContract$RevPointsCardType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f103349a = type;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PlanRevPointsCardsScreenContract$RevPointsCardType getF103349a() {
            return this.f103349a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPointsCardsBottomSheetDestination) && Intrinsics.f(this.f103349a, ((RevPointsCardsBottomSheetDestination) obj2).f103349a);
        }

        public final int hashCode() {
            return this.f103349a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103349a, i);
        }
    }

    public InternalPricingPlanFeatureConfig(KompotDestination kompotDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (Integer) null, 0, 60);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig$PlanUpgrade;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanUpgrade extends InternalPricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PlanUpgrade> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final PlanUpgradePurpose f103343g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final PlanSelection f103344h;
        public final b i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final PlanChangeSuccessActionStrategy f103345j;
        public final boolean k;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/InternalPricingPlanFeatureConfig$PlanUpgrade$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlanUpgradePurpose f103346a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PlanSelection f103347b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final b f103348c;
            public final PlanChangeSuccessActionStrategy d;
            public final boolean e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination((PlanUpgradePurpose) parcel.readParcelable(Destination.class.getClassLoader()), (PlanSelection) parcel.readParcelable(Destination.class.getClassLoader()), b.valueOf(parcel.readString()), (PlanChangeSuccessActionStrategy) parcel.readParcelable(Destination.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(PlanUpgradePurpose purpose, PlanSelection planSelection, b source, PlanChangeSuccessActionStrategy successActionStrategy, boolean z) {
                Intrinsics.checkNotNullParameter(purpose, "purpose");
                Intrinsics.checkNotNullParameter(planSelection, "planSelection");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(successActionStrategy, "successActionStrategy");
                this.f103346a = purpose;
                this.f103347b = planSelection;
                this.f103348c = source;
                this.d = successActionStrategy;
                this.e = z;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final PlanSelection getF103347b() {
                return this.f103347b;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final PlanUpgradePurpose getF103346a() {
                return this.f103346a;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getE() {
                return this.e;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final b getF103348c() {
                return this.f103348c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final PlanChangeSuccessActionStrategy getD() {
                return this.d;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return Intrinsics.f(this.f103346a, destination.f103346a) && Intrinsics.f(this.f103347b, destination.f103347b) && this.f103348c == destination.f103348c && Intrinsics.f(this.d, destination.d) && this.e == destination.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + ((this.d.hashCode() + c.c(this.f103348c, (this.f103347b.hashCode() + (this.f103346a.hashCode() * 31)) * 31, 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f103346a, i);
                dest.writeParcelable(this.f103347b, i);
                dest.writeString(this.f103348c.name());
                dest.writeParcelable(this.d, i);
                dest.writeInt(this.e ? 1 : 0);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanUpgrade((PlanUpgradePurpose) parcel.readParcelable(PlanUpgrade.class.getClassLoader()), (PlanSelection) parcel.readParcelable(PlanUpgrade.class.getClassLoader()), b.valueOf(parcel.readString()), (PlanChangeSuccessActionStrategy) parcel.readParcelable(PlanUpgrade.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanUpgrade[i];
            }
        }

        public /* synthetic */ PlanUpgrade(PlanUpgradePurpose planUpgradePurpose, PlanSelection planSelection, b bVar, PlanChangeSuccessActionStrategy planChangeSuccessActionStrategy, int i) {
            this(planUpgradePurpose, (i & 2) != 0 ? PlanSelection.Default.f103355a : planSelection, bVar, planChangeSuccessActionStrategy, false);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanUpgrade)) {
                return false;
            }
            PlanUpgrade planUpgrade = (PlanUpgrade) obj2;
            return Intrinsics.f(this.f103343g, planUpgrade.f103343g) && Intrinsics.f(this.f103344h, planUpgrade.f103344h) && this.i == planUpgrade.i && Intrinsics.f(this.f103345j, planUpgrade.f103345j) && this.k == planUpgrade.k;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return Boolean.hashCode(this.k) + ((this.f103345j.hashCode() + c.c(this.i, (this.f103344h.hashCode() + (this.f103343g.hashCode() * 31)) * 31, 31)) * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103343g, i);
            dest.writeParcelable(this.f103344h, i);
            dest.writeString(this.i.name());
            dest.writeParcelable(this.f103345j, i);
            dest.writeInt(this.k ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlanUpgrade(PlanUpgradePurpose purpose, PlanSelection planSelection, b source, PlanChangeSuccessActionStrategy successActionStrategy, boolean z) {
            super(new Destination(purpose, planSelection, source, successActionStrategy, z));
            Intrinsics.checkNotNullParameter(purpose, "purpose");
            Intrinsics.checkNotNullParameter(planSelection, "planSelection");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(successActionStrategy, "successActionStrategy");
            this.f103343g = purpose;
            this.f103344h = planSelection;
            this.i = source;
            this.f103345j = successActionStrategy;
            this.k = z;
        }
    }
}
