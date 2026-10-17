package com.revolut.retail.feature.pricing_plans.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import b93.f;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import e93.d;
import ggk.g;
import grl.k9;
import h30.l;
import hha.u;
import hha.w0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v1.c;
import xfa.b;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "DashboardByFeature", "DashboardByAnyFeature", "DashboardByPlanTier", "DashboardFromPlanTier", "UpgradeToAnyPlan", "DashboardByPlans", "DashboardForCheckout", "PlanChange", "PlanSelection", "UltraDashboard", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$DashboardByAnyFeature;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$DashboardByFeature;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$DashboardByPlanTier;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$DashboardByPlans;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$DashboardForCheckout;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$DashboardFromPlanTier;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$PlanChange;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$PlanSelection;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$UltraDashboard;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$UpgradeToAnyPlan;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PricingPlanFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$DashboardByPlanTier;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DashboardByPlanTier extends PricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<DashboardByPlanTier> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w0 f102932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f102933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PlanChangeSuccessActionStrategy f102934c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DashboardByPlanTier(w0.valueOf(parcel.readString()), b.valueOf(parcel.readString()), (PlanChangeSuccessActionStrategy) parcel.readParcelable(DashboardByPlanTier.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DashboardByPlanTier[i];
            }
        }

        public DashboardByPlanTier(w0 planTier, b source, PlanChangeSuccessActionStrategy successActionStrategy) {
            Intrinsics.checkNotNullParameter(planTier, "planTier");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(successActionStrategy, "successActionStrategy");
            this.f102932a = planTier;
            this.f102933b = source;
            this.f102934c = successActionStrategy;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DashboardByPlanTier)) {
                return false;
            }
            DashboardByPlanTier dashboardByPlanTier = (DashboardByPlanTier) obj2;
            return this.f102932a == dashboardByPlanTier.f102932a && this.f102933b == dashboardByPlanTier.f102933b && Intrinsics.f(this.f102934c, dashboardByPlanTier.f102934c);
        }

        public final int hashCode() {
            return this.f102934c.hashCode() + c.c(this.f102933b, this.f102932a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102932a.name());
            dest.writeString(this.f102933b.name());
            dest.writeParcelable(this.f102934c, i);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$DashboardFromPlanTier;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DashboardFromPlanTier extends PricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<DashboardFromPlanTier> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w0 f102945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f102946b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DashboardFromPlanTier(w0.valueOf(parcel.readString()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DashboardFromPlanTier[i];
            }
        }

        public DashboardFromPlanTier(w0 planTier, b source) {
            Intrinsics.checkNotNullParameter(planTier, "planTier");
            Intrinsics.checkNotNullParameter(source, "source");
            this.f102945a = planTier;
            this.f102946b = source;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DashboardFromPlanTier)) {
                return false;
            }
            DashboardFromPlanTier dashboardFromPlanTier = (DashboardFromPlanTier) obj2;
            return this.f102945a == dashboardFromPlanTier.f102945a && this.f102946b == dashboardFromPlanTier.f102946b;
        }

        public final int hashCode() {
            return this.f102946b.hashCode() + (this.f102945a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102945a.name());
            dest.writeString(this.f102946b.name());
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$PlanChange;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanChange extends PricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PlanChange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f102947a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanChange(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanChange[i];
            }
        }

        public PlanChange(b source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f102947a = source;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanChange) && this.f102947a == ((PlanChange) obj2).f102947a;
        }

        public final int hashCode() {
            return this.f102947a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102947a.name());
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$PlanSelection;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanSelection extends PricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PlanSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f102948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnalyticsProduct f102949b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanSelection(parcel.readInt() != 0, (AnalyticsProduct) parcel.readParcelable(PlanSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanSelection[i];
            }
        }

        public PlanSelection(boolean z, AnalyticsProduct automaticEventProduct) {
            Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
            this.f102948a = z;
            this.f102949b = automaticEventProduct;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanSelection)) {
                return false;
            }
            PlanSelection planSelection = (PlanSelection) obj2;
            return this.f102948a == planSelection.f102948a && Intrinsics.f(this.f102949b, planSelection.f102949b);
        }

        public final int hashCode() {
            return this.f102949b.hashCode() + (Boolean.hashCode(this.f102948a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f102948a ? 1 : 0);
            dest.writeParcelable(this.f102949b, i);
        }
    }

    private PricingPlanFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$UltraDashboard;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UltraDashboard extends PricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<UltraDashboard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f102950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f102951b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UltraDashboard((u) parcel.readSerializable(), (AccountId) parcel.readParcelable(UltraDashboard.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UltraDashboard[i];
            }
        }

        public UltraDashboard(u uVar, AccountId accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f102950a = uVar;
            this.f102951b = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UltraDashboard)) {
                return false;
            }
            UltraDashboard ultraDashboard = (UltraDashboard) obj2;
            return Intrinsics.f(this.f102950a, ultraDashboard.f102950a) && Intrinsics.f(this.f102951b, ultraDashboard.f102951b);
        }

        public final int hashCode() {
            u uVar = this.f102950a;
            return this.f102951b.hashCode() + ((uVar == null ? 0 : uVar.f152366a.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102950a);
            dest.writeParcelable(this.f102951b, i);
        }

        public /* synthetic */ UltraDashboard(u uVar) {
            this(uVar, AccountId.Personal.f51414a);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$UpgradeToAnyPlan;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpgradeToAnyPlan extends PricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<UpgradeToAnyPlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f102952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f102953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AccountId f102954c;
        public final PlanChangeSuccessActionStrategy d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpgradeToAnyPlan(b.valueOf(parcel.readString()), g.valueOf(parcel.readString()), (AccountId) parcel.readParcelable(UpgradeToAnyPlan.class.getClassLoader()), (PlanChangeSuccessActionStrategy) parcel.readParcelable(UpgradeToAnyPlan.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpgradeToAnyPlan[i];
            }
        }

        public UpgradeToAnyPlan(b startedFrom, g partnerOffersStyle, AccountId accountId, PlanChangeSuccessActionStrategy successActionStrategy) {
            Intrinsics.checkNotNullParameter(startedFrom, "startedFrom");
            Intrinsics.checkNotNullParameter(partnerOffersStyle, "partnerOffersStyle");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(successActionStrategy, "successActionStrategy");
            this.f102952a = startedFrom;
            this.f102953b = partnerOffersStyle;
            this.f102954c = accountId;
            this.d = successActionStrategy;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpgradeToAnyPlan)) {
                return false;
            }
            UpgradeToAnyPlan upgradeToAnyPlan = (UpgradeToAnyPlan) obj2;
            return this.f102952a == upgradeToAnyPlan.f102952a && this.f102953b == upgradeToAnyPlan.f102953b && Intrinsics.f(this.f102954c, upgradeToAnyPlan.f102954c) && Intrinsics.f(this.d, upgradeToAnyPlan.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + l.b(this.f102954c, (this.f102953b.hashCode() + (this.f102952a.hashCode() * 31)) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102952a.name());
            dest.writeString(this.f102953b.name());
            dest.writeParcelable(this.f102954c, i);
            dest.writeParcelable(this.d, i);
        }

        public /* synthetic */ UpgradeToAnyPlan(b bVar, PlanChangeSuccessActionStrategy.CardOrderIfNeeded cardOrderIfNeeded, int i) {
            this(bVar, g.GRID, AccountId.Personal.f51414a, (i & 8) != 0 ? PlanChangeSuccessActionStrategy.Quit.f102917a : cardOrderIfNeeded);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$DashboardByAnyFeature;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DashboardByAnyFeature extends PricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<DashboardByAnyFeature> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f102922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f102923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f102924c;
        public final AccountId d;
        public final boolean e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f102925g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                u uVar = (u) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new DashboardByAnyFeature(uVar, arrayList, b.valueOf(parcel.readString()), (AccountId) parcel.readParcelable(DashboardByAnyFeature.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DashboardByAnyFeature[i];
            }
        }

        public DashboardByAnyFeature(u sourceFeature, List features, b startedFrom, AccountId accountId, boolean z, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(sourceFeature, "sourceFeature");
            Intrinsics.checkNotNullParameter(features, "features");
            Intrinsics.checkNotNullParameter(startedFrom, "startedFrom");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f102922a = sourceFeature;
            this.f102923b = features;
            this.f102924c = startedFrom;
            this.d = accountId;
            this.e = z;
            this.f = z3;
            this.f102925g = z4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DashboardByAnyFeature)) {
                return false;
            }
            DashboardByAnyFeature dashboardByAnyFeature = (DashboardByAnyFeature) obj2;
            return Intrinsics.f(this.f102922a, dashboardByAnyFeature.f102922a) && Intrinsics.f(this.f102923b, dashboardByAnyFeature.f102923b) && this.f102924c == dashboardByAnyFeature.f102924c && Intrinsics.f(this.d, dashboardByAnyFeature.d) && this.e == dashboardByAnyFeature.e && this.f == dashboardByAnyFeature.f && this.f102925g == dashboardByAnyFeature.f102925g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102925g) + j6.a.c(j6.a.c(l.b(this.d, c.c(this.f102924c, p.a.d(this.f102922a.f152366a.hashCode() * 31, 31, this.f102923b), 31), 31), 31, this.e), 31, this.f);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102922a);
            Iterator itV = p.a.v(this.f102923b, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeString(this.f102924c.name());
            dest.writeParcelable(this.d, i);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeInt(this.f ? 1 : 0);
            dest.writeInt(this.f102925g ? 1 : 0);
        }

        public /* synthetic */ DashboardByAnyFeature(u uVar, List list, b bVar) {
            this(uVar, list, bVar, AccountId.Personal.f51414a, false, false, false);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$DashboardByPlans;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DashboardByPlans extends PricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<DashboardByPlans> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f102935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f102936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f102937c;
        public final PlanChangeSuccessActionStrategy d;
        public final boolean e;
        public final AccountId f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f102938g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final g f102939h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DashboardByPlans((u) parcel.readSerializable(), parcel.createStringArrayList(), parcel.readString(), (PlanChangeSuccessActionStrategy) parcel.readParcelable(DashboardByPlans.class.getClassLoader()), parcel.readInt() != 0, (AccountId) parcel.readParcelable(DashboardByPlans.class.getClassLoader()), b.valueOf(parcel.readString()), g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DashboardByPlans[i];
            }
        }

        public DashboardByPlans(u feature, List plans, String str, PlanChangeSuccessActionStrategy successActionStrategy, boolean z, AccountId accountId, b startedFrom, g partnerOffersStyle) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            Intrinsics.checkNotNullParameter(plans, "plans");
            Intrinsics.checkNotNullParameter(successActionStrategy, "successActionStrategy");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(startedFrom, "startedFrom");
            Intrinsics.checkNotNullParameter(partnerOffersStyle, "partnerOffersStyle");
            this.f102935a = feature;
            this.f102936b = plans;
            this.f102937c = str;
            this.d = successActionStrategy;
            this.e = z;
            this.f = accountId;
            this.f102938g = startedFrom;
            this.f102939h = partnerOffersStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DashboardByPlans)) {
                return false;
            }
            DashboardByPlans dashboardByPlans = (DashboardByPlans) obj2;
            return Intrinsics.f(this.f102935a, dashboardByPlans.f102935a) && Intrinsics.f(this.f102936b, dashboardByPlans.f102936b) && Intrinsics.f(this.f102937c, dashboardByPlans.f102937c) && Intrinsics.f(this.d, dashboardByPlans.d) && this.e == dashboardByPlans.e && Intrinsics.f(this.f, dashboardByPlans.f) && this.f102938g == dashboardByPlans.f102938g && this.f102939h == dashboardByPlans.f102939h;
        }

        public final int hashCode() {
            int iD = p.a.d(this.f102935a.f152366a.hashCode() * 31, 31, this.f102936b);
            String str = this.f102937c;
            return this.f102939h.hashCode() + c.c(this.f102938g, l.b(this.f, j6.a.c((this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.e), 31), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102935a);
            dest.writeStringList(this.f102936b);
            dest.writeString(this.f102937c);
            dest.writeParcelable(this.d, i);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeParcelable(this.f, i);
            dest.writeString(this.f102938g.name());
            dest.writeString(this.f102939h.name());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DashboardByPlans(u uVar, List list, String str, PlanChangeSuccessActionStrategy.NavigateNext navigateNext, boolean z, b bVar, int i) {
            if ((i & 1) != 0) {
                u.Companion.getClass();
                uVar = u.F;
            }
            this(uVar, list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? PlanChangeSuccessActionStrategy.Quit.f102917a : navigateNext, (i & 16) != 0 ? false : z, AccountId.Personal.f51414a, bVar, g.GRID);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$DashboardForCheckout;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DashboardForCheckout extends PricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<DashboardForCheckout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f102940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f102941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f102942c;
        public final NaviCommand d;
        public final b e;
        public final AccountId f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final d f102943g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f102944h;
        public final AnalyticsProduct i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DashboardForCheckout((f) parcel.readSerializable(), (u) parcel.readSerializable(), parcel.createStringArrayList(), (NaviCommand) parcel.readParcelable(DashboardForCheckout.class.getClassLoader()), b.valueOf(parcel.readString()), (AccountId) parcel.readParcelable(DashboardForCheckout.class.getClassLoader()), (d) parcel.readSerializable(), parcel.readInt() != 0, (AnalyticsProduct) parcel.readParcelable(DashboardForCheckout.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DashboardForCheckout[i];
            }
        }

        public DashboardForCheckout(f createCheckoutOrderCardParams, u feature, List availablePlans, NaviCommand naviCommand, b startedFrom, AccountId accountId, d dVar, boolean z, AnalyticsProduct automaticEventProduct) {
            Intrinsics.checkNotNullParameter(createCheckoutOrderCardParams, "createCheckoutOrderCardParams");
            Intrinsics.checkNotNullParameter(feature, "feature");
            Intrinsics.checkNotNullParameter(availablePlans, "availablePlans");
            Intrinsics.checkNotNullParameter(startedFrom, "startedFrom");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
            this.f102940a = createCheckoutOrderCardParams;
            this.f102941b = feature;
            this.f102942c = availablePlans;
            this.d = naviCommand;
            this.e = startedFrom;
            this.f = accountId;
            this.f102943g = dVar;
            this.f102944h = z;
            this.i = automaticEventProduct;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DashboardForCheckout)) {
                return false;
            }
            DashboardForCheckout dashboardForCheckout = (DashboardForCheckout) obj2;
            return Intrinsics.f(this.f102940a, dashboardForCheckout.f102940a) && Intrinsics.f(this.f102941b, dashboardForCheckout.f102941b) && Intrinsics.f(this.f102942c, dashboardForCheckout.f102942c) && Intrinsics.f(this.d, dashboardForCheckout.d) && this.e == dashboardForCheckout.e && Intrinsics.f(this.f, dashboardForCheckout.f) && Intrinsics.f(this.f102943g, dashboardForCheckout.f102943g) && this.f102944h == dashboardForCheckout.f102944h && Intrinsics.f(this.i, dashboardForCheckout.i);
        }

        public final int hashCode() {
            int iD = p.a.d(p.a.c(this.f102940a.hashCode() * 31, 31, this.f102941b.f152366a), 31, this.f102942c);
            NaviCommand naviCommand = this.d;
            int iB = l.b(this.f, c.c(this.e, (iD + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31, 31), 31);
            d dVar = this.f102943g;
            return this.i.hashCode() + j6.a.c((iB + (dVar != null ? dVar.hashCode() : 0)) * 31, 31, this.f102944h);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102940a);
            dest.writeSerializable(this.f102941b);
            dest.writeStringList(this.f102942c);
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e.name());
            dest.writeParcelable(this.f, i);
            dest.writeSerializable(this.f102943g);
            dest.writeInt(this.f102944h ? 1 : 0);
            dest.writeParcelable(this.i, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DashboardForCheckout(f fVar, u uVar, ArrayList arrayList, FeatureCommand featureCommand, b bVar, AccountId accountId, d dVar, AnalyticsProduct analyticsProduct, int i) {
            AnalyticsProduct analyticsProductG;
            List list = (i & 4) != 0 ? f0.f322471a : arrayList;
            FeatureCommand featureCommand2 = (i & 8) != 0 ? null : featureCommand;
            AccountId accountId2 = (i & 32) != 0 ? AccountId.Personal.f51414a : accountId;
            d dVar2 = (i & 64) != 0 ? null : dVar;
            boolean z = (i & 128) == 0;
            if ((i & 256) != 0) {
                AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                k9 k9Var = frl.a.f137501m;
                analyticsProductG = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
            } else {
                analyticsProductG = analyticsProduct;
            }
            this(fVar, uVar, list, featureCommand2, bVar, accountId2, dVar2, z, analyticsProductG);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig$DashboardByFeature;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DashboardByFeature extends PricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<DashboardByFeature> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f102926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f102927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PlanChangeSuccessActionStrategy f102928c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f102929g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AccountId f102930h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f102931j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                u uVar = (u) parcel.readSerializable();
                b bVarValueOf = b.valueOf(parcel.readString());
                PlanChangeSuccessActionStrategy planChangeSuccessActionStrategy = (PlanChangeSuccessActionStrategy) parcel.readParcelable(DashboardByFeature.class.getClassLoader());
                boolean z6 = false;
                boolean z11 = true;
                boolean z12 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z11 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z;
                    z = z3;
                } else {
                    z4 = z;
                }
                AccountId accountId = (AccountId) parcel.readParcelable(DashboardByFeature.class.getClassLoader());
                boolean z29 = z4;
                int i = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z29 = z3;
                }
                return new DashboardByFeature(uVar, bVarValueOf, planChangeSuccessActionStrategy, z12, z6, z11, z, accountId, i, z29);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DashboardByFeature[i];
            }
        }

        public DashboardByFeature(u feature, b startedFrom, PlanChangeSuccessActionStrategy successActionStrategy, boolean z, boolean z3, boolean z4, boolean z6, AccountId accountId, int i, boolean z11) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            Intrinsics.checkNotNullParameter(startedFrom, "startedFrom");
            Intrinsics.checkNotNullParameter(successActionStrategy, "successActionStrategy");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f102926a = feature;
            this.f102927b = startedFrom;
            this.f102928c = successActionStrategy;
            this.d = z;
            this.e = z3;
            this.f = z4;
            this.f102929g = z6;
            this.f102930h = accountId;
            this.i = i;
            this.f102931j = z11;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DashboardByFeature)) {
                return false;
            }
            DashboardByFeature dashboardByFeature = (DashboardByFeature) obj2;
            return Intrinsics.f(this.f102926a, dashboardByFeature.f102926a) && this.f102927b == dashboardByFeature.f102927b && Intrinsics.f(this.f102928c, dashboardByFeature.f102928c) && this.d == dashboardByFeature.d && this.e == dashboardByFeature.e && this.f == dashboardByFeature.f && this.f102929g == dashboardByFeature.f102929g && Intrinsics.f(this.f102930h, dashboardByFeature.f102930h) && this.i == dashboardByFeature.i && this.f102931j == dashboardByFeature.f102931j;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102931j) + j6.a.b(this.i, l.b(this.f102930h, j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.f102928c.hashCode() + c.c(this.f102927b, this.f102926a.f152366a.hashCode() * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f102929g), 31), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102926a);
            dest.writeString(this.f102927b.name());
            dest.writeParcelable(this.f102928c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeInt(this.f ? 1 : 0);
            dest.writeInt(this.f102929g ? 1 : 0);
            dest.writeParcelable(this.f102930h, i);
            dest.writeInt(this.i);
            dest.writeInt(this.f102931j ? 1 : 0);
        }

        public /* synthetic */ DashboardByFeature(u uVar, b bVar, PlanChangeSuccessActionStrategy planChangeSuccessActionStrategy, boolean z, int i) {
            this(uVar, bVar, (i & 4) != 0 ? PlanChangeSuccessActionStrategy.Quit.f102917a : planChangeSuccessActionStrategy, (i & 8) == 0, true, (i & 32) == 0, false, AccountId.Personal.f51414a, -1, (i & 512) != 0 ? false : z);
        }
    }
}
