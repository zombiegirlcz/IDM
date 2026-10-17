package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction", "Landroid/os/Parcelable;", "Select", "Upgrade", "Expand", "OpenUrl", "Skip", "CancelDowngrade", "ShowPriceBreakdown", "CreditCardOrderCheckout", "OpenOnboardingPlanDashboard", "ShowBottomSheet", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$CancelDowngrade;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$CreditCardOrderCheckout;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$Expand;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$OpenOnboardingPlanDashboard;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$OpenUrl;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$Select;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$ShowBottomSheet;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$ShowPriceBreakdown;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$Skip;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$Upgrade;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlansDashboardLayout$ClickAction extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$CancelDowngrade;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CancelDowngrade implements PlansDashboardLayout$ClickAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancelDowngrade f102735a = new CancelDowngrade();

        @NotNull
        public static final Parcelable.Creator<CancelDowngrade> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CancelDowngrade.f102735a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelDowngrade[i];
            }
        }

        private CancelDowngrade() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$CreditCardOrderCheckout;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditCardOrderCheckout implements PlansDashboardLayout$ClickAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreditCardOrderCheckout f102736a = new CreditCardOrderCheckout();

        @NotNull
        public static final Parcelable.Creator<CreditCardOrderCheckout> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditCardOrderCheckout.f102736a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCardOrderCheckout[i];
            }
        }

        private CreditCardOrderCheckout() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$Expand;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Expand implements PlansDashboardLayout$ClickAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Expand f102737a = new Expand();

        @NotNull
        public static final Parcelable.Creator<Expand> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Expand.f102737a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Expand[i];
            }
        }

        private Expand() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$OpenOnboardingPlanDashboard;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OpenOnboardingPlanDashboard implements PlansDashboardLayout$ClickAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OpenOnboardingPlanDashboard f102738a = new OpenOnboardingPlanDashboard();

        @NotNull
        public static final Parcelable.Creator<OpenOnboardingPlanDashboard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OpenOnboardingPlanDashboard.f102738a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenOnboardingPlanDashboard[i];
            }
        }

        private OpenOnboardingPlanDashboard() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$OpenUrl;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenUrl implements PlansDashboardLayout$ClickAction {

        @NotNull
        public static final Parcelable.Creator<OpenUrl> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102739a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenUrl(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenUrl[i];
            }
        }

        public OpenUrl(String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f102739a = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenUrl) && Intrinsics.f(this.f102739a, ((OpenUrl) obj2).f102739a);
        }

        public final int hashCode() {
            return this.f102739a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102739a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$Select;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Select implements PlansDashboardLayout$ClickAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Select f102740a = new Select();

        @NotNull
        public static final Parcelable.Creator<Select> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Select.f102740a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Select[i];
            }
        }

        private Select() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$ShowBottomSheet;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowBottomSheet implements PlansDashboardLayout$ClickAction {

        @NotNull
        public static final Parcelable.Creator<ShowBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlansDashboardLayout$PlanPageLayout$InfoBottomSheet f102741a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowBottomSheet(PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowBottomSheet[i];
            }
        }

        public ShowBottomSheet(PlansDashboardLayout$PlanPageLayout$InfoBottomSheet payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.f102741a = payload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowBottomSheet) && Intrinsics.f(this.f102741a, ((ShowBottomSheet) obj2).f102741a);
        }

        public final int hashCode() {
            return this.f102741a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f102741a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$ShowPriceBreakdown;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowPriceBreakdown implements PlansDashboardLayout$ClickAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowPriceBreakdown f102742a = new ShowPriceBreakdown();

        @NotNull
        public static final Parcelable.Creator<ShowPriceBreakdown> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowPriceBreakdown.f102742a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowPriceBreakdown[i];
            }
        }

        private ShowPriceBreakdown() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$Skip;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Skip implements PlansDashboardLayout$ClickAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Skip f102743a = new Skip();

        @NotNull
        public static final Parcelable.Creator<Skip> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Skip.f102743a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Skip[i];
            }
        }

        private Skip() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction$Upgrade;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$ClickAction;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Upgrade implements PlansDashboardLayout$ClickAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Upgrade f102744a = new Upgrade();

        @NotNull
        public static final Parcelable.Creator<Upgrade> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Upgrade.f102744a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Upgrade[i];
            }
        }

        private Upgrade() {
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
