package com.revolut.retail.feature.pricing_plans.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.pricingplans.models.PricingPlanUpdateSource;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetDescriptor;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanScreenId;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanBottomSheetDeeplinkNavigation;
import ggk.c0;
import hha.d;
import hha.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;
import xfa.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0082\u0001\t\u001e\u001f !\"#$%&¨\u0006'"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "PlanSettings", "PlanSettingsDestination", "WhatsNewInPlan", "WhatsNewInPlanDestination", "PlanTemplateScreen", "PlanTemplateScreenDestination", "BottomSheetDestination", "SavingsAccountsBottomSheetDestination", "PlanCancel", "PlanCancelDestination", "PlanPartners", "PlanPartnersDestination", "FamilyPlanDestination", "FamilyPlanAddMemberDestination", "FamilyPlanInvitation", "FamilyPlanInvitationDestination", "KeepPlanDestination", "PlanDowngradeFlow", "PlanDowngradeDestination", "SwitchToAnnualBillingFlow", "PlanSwitchToAnnualEntryDestination", "PlanHubV2", "PlanHubV2Destination", "Student", "StudentDestination", "StudentGraduateActionDestination", "StudentCancelActionDestination", "OutOfAppNavigation", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$FamilyPlanInvitation;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanCancel;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanDowngradeFlow;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanHubV2;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanPartners;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanSettings;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanTemplateScreen;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$Student;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$WhatsNewInPlan;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class KompotPricingPlanFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$BottomSheetDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BottomSheetDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<BottomSheetDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanBottomSheetDescriptor f102861a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BottomSheetDestination((PricingPlanBottomSheetDescriptor) parcel.readParcelable(BottomSheetDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BottomSheetDestination[i];
            }
        }

        public BottomSheetDestination(PricingPlanBottomSheetDescriptor bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            this.f102861a = bottomSheet;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PricingPlanBottomSheetDescriptor getF102861a() {
            return this.f102861a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BottomSheetDestination) && Intrinsics.f(this.f102861a, ((BottomSheetDestination) obj2).f102861a);
        }

        public final int hashCode() {
            return this.f102861a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102861a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$FamilyPlanAddMemberDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FamilyPlanAddMemberDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<FamilyPlanAddMemberDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f102862a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FamilyPlanAddMemberDestination(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FamilyPlanAddMemberDestination[i];
            }
        }

        public FamilyPlanAddMemberDestination(b source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f102862a = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getF102862a() {
            return this.f102862a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FamilyPlanAddMemberDestination) && this.f102862a == ((FamilyPlanAddMemberDestination) obj2).f102862a;
        }

        public final int hashCode() {
            return this.f102862a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102862a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$FamilyPlanDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FamilyPlanDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<FamilyPlanDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f102863a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FamilyPlanDestination(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FamilyPlanDestination[i];
            }
        }

        public FamilyPlanDestination(b source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f102863a = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getF102863a() {
            return this.f102863a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FamilyPlanDestination) && this.f102863a == ((FamilyPlanDestination) obj2).f102863a;
        }

        public final int hashCode() {
            return this.f102863a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102863a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$FamilyPlanInvitation;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FamilyPlanInvitation extends KompotPricingPlanFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f102864g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f102865h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FamilyPlanInvitation(String familyId, String invitationId) {
            super(null, new FamilyPlanInvitationDestination(familyId, invitationId), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(familyId, "familyId");
            Intrinsics.checkNotNullParameter(invitationId, "invitationId");
            this.f102864g = familyId;
            this.f102865h = invitationId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a */
        public final ActivityAnimation getF102903g() {
            return null;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FamilyPlanInvitation)) {
                return false;
            }
            FamilyPlanInvitation familyPlanInvitation = (FamilyPlanInvitation) obj2;
            return Intrinsics.f(this.f102864g, familyPlanInvitation.f102864g) && Intrinsics.f(this.f102865h, familyPlanInvitation.f102865h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f102865h.hashCode() + (this.f102864g.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$FamilyPlanInvitationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FamilyPlanInvitationDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<FamilyPlanInvitationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102867b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FamilyPlanInvitationDestination(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FamilyPlanInvitationDestination[i];
            }
        }

        public FamilyPlanInvitationDestination(String familyId, String invitationId) {
            Intrinsics.checkNotNullParameter(familyId, "familyId");
            Intrinsics.checkNotNullParameter(invitationId, "invitationId");
            this.f102866a = familyId;
            this.f102867b = invitationId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF102866a() {
            return this.f102866a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF102867b() {
            return this.f102867b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FamilyPlanInvitationDestination)) {
                return false;
            }
            FamilyPlanInvitationDestination familyPlanInvitationDestination = (FamilyPlanInvitationDestination) obj2;
            return Intrinsics.f(this.f102866a, familyPlanInvitationDestination.f102866a) && Intrinsics.f(this.f102867b, familyPlanInvitationDestination.f102867b);
        }

        public final int hashCode() {
            return this.f102867b.hashCode() + (this.f102866a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102866a);
            dest.writeString(this.f102867b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$KeepPlanDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class KeepPlanDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<KeepPlanDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f102868a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new KeepPlanDestination(c0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KeepPlanDestination[i];
            }
        }

        public KeepPlanDestination(c0 mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f102868a = mode;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c0 getF102868a() {
            return this.f102868a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof KeepPlanDestination) && this.f102868a == ((KeepPlanDestination) obj2).f102868a;
        }

        public final int hashCode() {
            return this.f102868a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102868a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$OutOfAppNavigation;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OutOfAppNavigation implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnalyticsProduct f102869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f102871c;

        @NotNull
        public static final Parcelable.Creator<OutOfAppNavigation> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OutOfAppNavigation((AnalyticsProduct) parcel.readParcelable(OutOfAppNavigation.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OutOfAppNavigation[i];
            }
        }

        public OutOfAppNavigation(AnalyticsProduct analyticsProduct, String url2, boolean z) {
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f102869a = analyticsProduct;
            this.f102870b = url2;
            this.f102871c = z;
        }

        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getF102869a() {
            return this.f102869a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OutOfAppNavigation)) {
                return false;
            }
            OutOfAppNavigation outOfAppNavigation = (OutOfAppNavigation) obj2;
            return Intrinsics.f(this.f102869a, outOfAppNavigation.f102869a) && Intrinsics.f(this.f102870b, outOfAppNavigation.f102870b) && this.f102871c == outOfAppNavigation.f102871c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102871c) + a.c(this.f102869a.hashCode() * 31, 31, this.f102870b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102869a, i);
            dest.writeString(this.f102870b);
            dest.writeInt(this.f102871c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanCancel;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanCancel extends KompotPricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PlanCancel> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f102872g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final PricingPlanUpdateSource f102873h;
        public final boolean i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanCancel((ActivityAnimation) parcel.readParcelable(PlanCancel.class.getClassLoader()), (PricingPlanUpdateSource) parcel.readParcelable(PlanCancel.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanCancel[i];
            }
        }

        public PlanCancel() {
            this(null, 7);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF102903g() {
            return this.f102872g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanCancel)) {
                return false;
            }
            PlanCancel planCancel = (PlanCancel) obj2;
            return Intrinsics.f(this.f102872g, planCancel.f102872g) && Intrinsics.f(this.f102873h, planCancel.f102873h) && this.i == planCancel.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f102872g;
            int iHashCode = (activityAnimation == null ? 0 : activityAnimation.hashCode()) * 31;
            PricingPlanUpdateSource pricingPlanUpdateSource = this.f102873h;
            return Boolean.hashCode(this.i) + ((iHashCode + (pricingPlanUpdateSource != null ? pricingPlanUpdateSource.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102872g, i);
            dest.writeParcelable(this.f102873h, i);
            dest.writeInt(this.i ? 1 : 0);
        }

        public /* synthetic */ PlanCancel(PricingPlanUpdateSource.Dynamic dynamic, int i) {
            this(null, (i & 2) != 0 ? null : dynamic, true);
        }

        public PlanCancel(ActivityAnimation activityAnimation, PricingPlanUpdateSource pricingPlanUpdateSource, boolean z) {
            super(activityAnimation, new PlanCancelDestination(z, pricingPlanUpdateSource, 4), false, null, 0, 60);
            this.f102872g = activityAnimation;
            this.f102873h = pricingPlanUpdateSource;
            this.i = z;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanCancelDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanCancelDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<PlanCancelDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f102874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PricingPlanUpdateSource f102875c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanCancelDestination(parcel.readInt() != 0, (PricingPlanUpdateSource) parcel.readParcelable(PlanCancelDestination.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanCancelDestination[i];
            }
        }

        public PlanCancelDestination() {
            this(false, (PricingPlanUpdateSource) null, 7);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getF102874b() {
            return this.f102874b;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final PricingPlanUpdateSource getF102875c() {
            return this.f102875c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanCancelDestination)) {
                return false;
            }
            PlanCancelDestination planCancelDestination = (PlanCancelDestination) obj2;
            return this.f102874b == planCancelDestination.f102874b && Intrinsics.f(this.f102875c, planCancelDestination.f102875c) && this.d == planCancelDestination.d;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f102874b) * 31;
            PricingPlanUpdateSource pricingPlanUpdateSource = this.f102875c;
            return Boolean.hashCode(this.d) + ((iHashCode + (pricingPlanUpdateSource == null ? 0 : pricingPlanUpdateSource.hashCode())) * 31);
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: n1, reason: from getter */
        public final boolean getF102904b() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f102874b ? 1 : 0);
            dest.writeParcelable(this.f102875c, i);
            dest.writeInt(this.d ? 1 : 0);
        }

        public /* synthetic */ PlanCancelDestination(boolean z, PricingPlanUpdateSource pricingPlanUpdateSource, int i) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : pricingPlanUpdateSource, true);
        }

        public PlanCancelDestination(boolean z, PricingPlanUpdateSource pricingPlanUpdateSource, boolean z3) {
            super(IOData$EmptyInput.f98299a);
            this.f102874b = z;
            this.f102875c = pricingPlanUpdateSource;
            this.d = z3;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanDowngradeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanDowngradeDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<PlanDowngradeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f102877b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanDowngradeDestination(parcel.readString(), i.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanDowngradeDestination[i];
            }
        }

        public PlanDowngradeDestination(String selectedPlanId, i selectedBilling) {
            Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
            Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
            this.f102876a = selectedPlanId;
            this.f102877b = selectedBilling;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final i getF102877b() {
            return this.f102877b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF102876a() {
            return this.f102876a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanDowngradeDestination)) {
                return false;
            }
            PlanDowngradeDestination planDowngradeDestination = (PlanDowngradeDestination) obj2;
            return Intrinsics.f(this.f102876a, planDowngradeDestination.f102876a) && this.f102877b == planDowngradeDestination.f102877b;
        }

        public final int hashCode() {
            return this.f102877b.hashCode() + (this.f102876a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102876a);
            dest.writeString(this.f102877b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanDowngradeFlow;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanDowngradeFlow extends KompotPricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PlanDowngradeFlow> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f102878g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final i f102879h;
        public final ActivityAnimation i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanDowngradeFlow(parcel.readString(), i.valueOf(parcel.readString()), (ActivityAnimation) parcel.readParcelable(PlanDowngradeFlow.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanDowngradeFlow[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlanDowngradeFlow(String selectedPlanId, i selectedBilling, ActivityAnimation activityAnimation) {
            super(activityAnimation, new PlanDowngradeDestination(selectedPlanId, selectedBilling), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
            Intrinsics.checkNotNullParameter(selectedBilling, "selectedBilling");
            this.f102878g = selectedPlanId;
            this.f102879h = selectedBilling;
            this.i = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF102903g() {
            return this.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanDowngradeFlow)) {
                return false;
            }
            PlanDowngradeFlow planDowngradeFlow = (PlanDowngradeFlow) obj2;
            return Intrinsics.f(this.f102878g, planDowngradeFlow.f102878g) && this.f102879h == planDowngradeFlow.f102879h && Intrinsics.f(this.i, planDowngradeFlow.i);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = (this.f102879h.hashCode() + (this.f102878g.hashCode() * 31)) * 31;
            ActivityAnimation activityAnimation = this.i;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102878g);
            dest.writeString(this.f102879h.name());
            dest.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanHubV2Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanHubV2Destination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlanHubV2Destination f102881a = new PlanHubV2Destination();

        @NotNull
        public static final Parcelable.Creator<PlanHubV2Destination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlanHubV2Destination.f102881a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanHubV2Destination[i];
            }
        }

        private PlanHubV2Destination() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanPartnersDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanPartnersDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlanPartnersDestination f102883a = new PlanPartnersDestination();

        @NotNull
        public static final Parcelable.Creator<PlanPartnersDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlanPartnersDestination.f102883a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanPartnersDestination[i];
            }
        }

        private PlanPartnersDestination() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanSettingsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanSettingsDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlanSettingsDestination f102885a = new PlanSettingsDestination();

        @NotNull
        public static final Parcelable.Creator<PlanSettingsDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlanSettingsDestination.f102885a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanSettingsDestination[i];
            }
        }

        private PlanSettingsDestination() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanSwitchToAnnualEntryDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanSwitchToAnnualEntryDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlanSwitchToAnnualEntryDestination f102886a = new PlanSwitchToAnnualEntryDestination();

        @NotNull
        public static final Parcelable.Creator<PlanSwitchToAnnualEntryDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlanSwitchToAnnualEntryDestination.f102886a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanSwitchToAnnualEntryDestination[i];
            }
        }

        private PlanSwitchToAnnualEntryDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanTemplateScreen;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanTemplateScreen extends KompotPricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PlanTemplateScreen> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final PricingPlanScreenId f102887g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f102888h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanTemplateScreen(PricingPlanScreenId.CREATOR.createFromParcel(parcel), (ActivityAnimation) parcel.readParcelable(PlanTemplateScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanTemplateScreen[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlanTemplateScreen(PricingPlanScreenId screenId, ActivityAnimation activityAnimation) {
            super(activityAnimation, new PlanTemplateScreenDestination(screenId), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.f102887g = screenId;
            this.f102888h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF102903g() {
            return this.f102888h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlanTemplateScreen)) {
                return false;
            }
            PlanTemplateScreen planTemplateScreen = (PlanTemplateScreen) obj2;
            return Intrinsics.f(this.f102887g, planTemplateScreen.f102887g) && Intrinsics.f(this.f102888h, planTemplateScreen.f102888h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f102887g.f102855a.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f102888h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f102887g.writeToParcel(dest, i);
            dest.writeParcelable(this.f102888h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanTemplateScreenDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanTemplateScreenDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<PlanTemplateScreenDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanScreenId f102889a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanTemplateScreenDestination(PricingPlanScreenId.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanTemplateScreenDestination[i];
            }
        }

        public PlanTemplateScreenDestination(PricingPlanScreenId screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.f102889a = screenId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PricingPlanScreenId getF102889a() {
            return this.f102889a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanTemplateScreenDestination) && Intrinsics.f(this.f102889a, ((PlanTemplateScreenDestination) obj2).f102889a);
        }

        public final int hashCode() {
            return this.f102889a.f102855a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f102889a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$SavingsAccountsBottomSheetDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SavingsAccountsBottomSheetDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<SavingsAccountsBottomSheetDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlanBottomSheetDeeplinkNavigation.SavingsAccounts f102890a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavingsAccountsBottomSheetDestination((PlanBottomSheetDeeplinkNavigation.SavingsAccounts) parcel.readParcelable(SavingsAccountsBottomSheetDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingsAccountsBottomSheetDestination[i];
            }
        }

        public SavingsAccountsBottomSheetDestination(PlanBottomSheetDeeplinkNavigation.SavingsAccounts navigation) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            this.f102890a = navigation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PlanBottomSheetDeeplinkNavigation.SavingsAccounts getF102890a() {
            return this.f102890a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SavingsAccountsBottomSheetDestination) && Intrinsics.f(this.f102890a, ((SavingsAccountsBottomSheetDestination) obj2).f102890a);
        }

        public final int hashCode() {
            return this.f102890a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102890a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$Student;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Student extends KompotPricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Student> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final StudentDestination.Mode f102891g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f102892h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Student((StudentDestination.Mode) parcel.readParcelable(Student.class.getClassLoader()), (ActivityAnimation) parcel.readParcelable(Student.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Student[i];
            }
        }

        public Student() {
            this(0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF102903g() {
            return this.f102892h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Student)) {
                return false;
            }
            Student student = (Student) obj2;
            return Intrinsics.f(this.f102891g, student.f102891g) && Intrinsics.f(this.f102892h, student.f102892h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f102891g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f102892h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102891g, i);
            dest.writeParcelable(this.f102892h, i);
        }

        public /* synthetic */ Student(int i) {
            this(StudentDestination.Mode.Default.f102895a, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Student(StudentDestination.Mode mode, ActivityAnimation activityAnimation) {
            super(activityAnimation, new StudentDestination(mode), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f102891g = mode;
            this.f102892h = activityAnimation;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$StudentCancelActionDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StudentCancelActionDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StudentCancelActionDestination f102893a = new StudentCancelActionDestination();

        @NotNull
        public static final Parcelable.Creator<StudentCancelActionDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StudentCancelActionDestination.f102893a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StudentCancelActionDestination[i];
            }
        }

        private StudentCancelActionDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$StudentDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "Mode", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StudentDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<StudentDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Mode f102894a;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$StudentDestination$Mode;", "Landroid/os/Parcelable;", "VerificationCode", "Verification", "Default", "Status", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$StudentDestination$Mode$Default;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$StudentDestination$Mode$Status;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$StudentDestination$Mode$Verification;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$StudentDestination$Mode$VerificationCode;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface Mode extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$StudentDestination$Mode$Default;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$StudentDestination$Mode;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Default implements Mode {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Default f102895a = new Default();

                @NotNull
                public static final Parcelable.Creator<Default> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Default.f102895a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Default[i];
                    }
                }

                private Default() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$StudentDestination$Mode$Status;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$StudentDestination$Mode;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Status implements Mode {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Status f102896a = new Status();

                @NotNull
                public static final Parcelable.Creator<Status> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Status.f102896a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Status[i];
                    }
                }

                private Status() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$StudentDestination$Mode$Verification;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$StudentDestination$Mode;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Verification implements Mode {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Verification f102897a = new Verification();

                @NotNull
                public static final Parcelable.Creator<Verification> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Verification.f102897a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Verification[i];
                    }
                }

                private Verification() {
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

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$StudentDestination$Mode$VerificationCode;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$StudentDestination$Mode;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class VerificationCode implements Mode {

                @NotNull
                public static final Parcelable.Creator<VerificationCode> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f102898a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new VerificationCode(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new VerificationCode[i];
                    }
                }

                public VerificationCode(String verificationCode) {
                    Intrinsics.checkNotNullParameter(verificationCode, "verificationCode");
                    this.f102898a = verificationCode;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getF102898a() {
                    return this.f102898a;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof VerificationCode) && Intrinsics.f(this.f102898a, ((VerificationCode) obj2).f102898a);
                }

                public final int hashCode() {
                    return this.f102898a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f102898a);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StudentDestination((Mode) parcel.readParcelable(StudentDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StudentDestination[i];
            }
        }

        public StudentDestination() {
            this(0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Mode getF102894a() {
            return this.f102894a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StudentDestination) && Intrinsics.f(this.f102894a, ((StudentDestination) obj2).f102894a);
        }

        public final int hashCode() {
            return this.f102894a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102894a, i);
        }

        public StudentDestination(Mode mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f102894a = mode;
        }

        public /* synthetic */ StudentDestination(int i) {
            this(Mode.Default.f102895a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$StudentGraduateActionDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StudentGraduateActionDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StudentGraduateActionDestination f102899a = new StudentGraduateActionDestination();

        @NotNull
        public static final Parcelable.Creator<StudentGraduateActionDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StudentGraduateActionDestination.f102899a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StudentGraduateActionDestination[i];
            }
        }

        private StudentGraduateActionDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$SwitchToAnnualBillingFlow;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwitchToAnnualBillingFlow implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<SwitchToAnnualBillingFlow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f102900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f102901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f102902c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SwitchToAnnualBillingFlow((d) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwitchToAnnualBillingFlow[i];
            }
        }

        public SwitchToAnnualBillingFlow(d plan, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            this.f102900a = plan;
            this.f102901b = z;
            this.f102902c = z3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF102900a() {
            return this.f102900a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF102902c() {
            return this.f102902c;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getF102901b() {
            return this.f102901b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SwitchToAnnualBillingFlow)) {
                return false;
            }
            SwitchToAnnualBillingFlow switchToAnnualBillingFlow = (SwitchToAnnualBillingFlow) obj2;
            return Intrinsics.f(this.f102900a, switchToAnnualBillingFlow.f102900a) && this.f102901b == switchToAnnualBillingFlow.f102901b && this.f102902c == switchToAnnualBillingFlow.f102902c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102902c) + j6.a.c(this.f102900a.hashCode() * 31, 31, this.f102901b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102900a);
            dest.writeInt(this.f102901b ? 1 : 0);
            dest.writeInt(this.f102902c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$WhatsNewInPlan;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WhatsNewInPlan extends KompotPricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<WhatsNewInPlan> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f102903g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WhatsNewInPlan((ActivityAnimation) parcel.readParcelable(WhatsNewInPlan.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WhatsNewInPlan[i];
            }
        }

        public WhatsNewInPlan() {
            this(null);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF102903g() {
            return this.f102903g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WhatsNewInPlan) && Intrinsics.f(this.f102903g, ((WhatsNewInPlan) obj2).f102903g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f102903g;
            if (activityAnimation == null) {
                return 0;
            }
            return activityAnimation.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102903g, i);
        }

        public WhatsNewInPlan(ActivityAnimation activityAnimation) {
            super(activityAnimation, new WhatsNewInPlanDestination(true), false, null, 0, 60);
            this.f102903g = activityAnimation;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$WhatsNewInPlanDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WhatsNewInPlanDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<WhatsNewInPlanDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f102904b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WhatsNewInPlanDestination(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WhatsNewInPlanDestination[i];
            }
        }

        public WhatsNewInPlanDestination() {
            this(true);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WhatsNewInPlanDestination) && this.f102904b == ((WhatsNewInPlanDestination) obj2).f102904b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102904b);
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: n1, reason: from getter */
        public final boolean getF102904b() {
            return this.f102904b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f102904b ? 1 : 0);
        }

        public WhatsNewInPlanDestination(boolean z) {
            super(IOData$EmptyInput.f98299a);
            this.f102904b = z;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanHubV2;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanHubV2 extends KompotPricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PlanHubV2> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f102880g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanHubV2((ActivityAnimation) parcel.readParcelable(PlanHubV2.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanHubV2[i];
            }
        }

        public PlanHubV2(ActivityAnimation activityAnimation) {
            super(activityAnimation, PlanHubV2Destination.f102881a, false, null, 0, 60);
            this.f102880g = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF102903g() {
            return this.f102880g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanHubV2) && Intrinsics.f(this.f102880g, ((PlanHubV2) obj2).f102880g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f102880g;
            if (activityAnimation == null) {
                return 0;
            }
            return activityAnimation.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102880g, i);
        }

        public PlanHubV2() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanPartners;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanPartners extends KompotPricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PlanPartners> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f102882g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanPartners((ActivityAnimation) parcel.readParcelable(PlanPartners.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanPartners[i];
            }
        }

        public PlanPartners(ActivityAnimation activityAnimation) {
            super(activityAnimation, PlanPartnersDestination.f102883a, false, null, 0, 60);
            this.f102882g = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF102903g() {
            return this.f102882g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanPartners) && Intrinsics.f(this.f102882g, ((PlanPartners) obj2).f102882g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f102882g;
            if (activityAnimation == null) {
                return 0;
            }
            return activityAnimation.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102882g, i);
        }

        public PlanPartners() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig$PlanSettings;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/KompotPricingPlanFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanSettings extends KompotPricingPlanFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PlanSettings> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f102884g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanSettings((ActivityAnimation) parcel.readParcelable(PlanSettings.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanSettings[i];
            }
        }

        public PlanSettings(ActivityAnimation activityAnimation) {
            super(activityAnimation, PlanSettingsDestination.f102885a, false, null, 0, 60);
            this.f102884g = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF102903g() {
            return this.f102884g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanSettings) && Intrinsics.f(this.f102884g, ((PlanSettings) obj2).f102884g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f102884g;
            if (activityAnimation == null) {
                return 0;
            }
            return activityAnimation.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102884g, i);
        }

        public PlanSettings() {
            this(null);
        }
    }
}
