package com.revolut.retail.feature.pricing_plans.waitlist.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$Button$Action", "Landroid/os/Parcelable;", "AcceptInvite", "ShowBottomSheet", "ShowBenefits", "Unknown", "Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$Button$Action$AcceptInvite;", "Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$Button$Action$ShowBenefits;", "Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$Button$Action$ShowBottomSheet;", "Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$Button$Action$Unknown;", "feature_retail_pricing_plans_waitlist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PricingPlanWaitlistLayout$Button$Action extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$Button$Action$AcceptInvite;", "Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$Button$Action;", "<init>", "()V", "feature_retail_pricing_plans_waitlist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AcceptInvite implements PricingPlanWaitlistLayout$Button$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AcceptInvite f103666a = new AcceptInvite();

        @NotNull
        public static final Parcelable.Creator<AcceptInvite> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AcceptInvite.f103666a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AcceptInvite[i];
            }
        }

        private AcceptInvite() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$Button$Action$ShowBenefits;", "Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$Button$Action;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_waitlist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowBenefits implements PricingPlanWaitlistLayout$Button$Action {

        @NotNull
        public static final Parcelable.Creator<ShowBenefits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanWaitlistLayout$ProductIntro f103667a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowBenefits(PricingPlanWaitlistLayout$ProductIntro.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowBenefits[i];
            }
        }

        public ShowBenefits(PricingPlanWaitlistLayout$ProductIntro productIntro) {
            Intrinsics.checkNotNullParameter(productIntro, "productIntro");
            this.f103667a = productIntro;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowBenefits) && Intrinsics.f(this.f103667a, ((ShowBenefits) obj2).f103667a);
        }

        public final int hashCode() {
            return this.f103667a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f103667a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$Button$Action$ShowBottomSheet;", "Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$Button$Action;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_waitlist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowBottomSheet implements PricingPlanWaitlistLayout$Button$Action {

        @NotNull
        public static final Parcelable.Creator<ShowBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanWaitlistLayout$BottomSheet f103668a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowBottomSheet(PricingPlanWaitlistLayout$BottomSheet.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowBottomSheet[i];
            }
        }

        public ShowBottomSheet(PricingPlanWaitlistLayout$BottomSheet bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            this.f103668a = bottomSheet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowBottomSheet) && Intrinsics.f(this.f103668a, ((ShowBottomSheet) obj2).f103668a);
        }

        public final int hashCode() {
            return this.f103668a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f103668a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$Button$Action$Unknown;", "Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$Button$Action;", "<init>", "()V", "feature_retail_pricing_plans_waitlist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unknown implements PricingPlanWaitlistLayout$Button$Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f103669a = new Unknown();

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.f103669a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        private Unknown() {
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
