package com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$BottomSheet;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$ProductIntro;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pricing_plans/waitlist/impl/ui/screen/invitation/WaitlistInvitationScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "BottomSheet", "Benefits", "Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/ui/screen/invitation/WaitlistInvitationScreenContract$ModalStep$Benefits;", "Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/ui/screen/invitation/WaitlistInvitationScreenContract$ModalStep$BottomSheet;", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WaitlistInvitationScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/ui/screen/invitation/WaitlistInvitationScreenContract$ModalStep$Benefits;", "Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/ui/screen/invitation/WaitlistInvitationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Benefits implements WaitlistInvitationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Benefits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanWaitlistLayout$ProductIntro f103701a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Benefits((PricingPlanWaitlistLayout$ProductIntro) parcel.readParcelable(Benefits.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Benefits[i];
            }
        }

        public Benefits(PricingPlanWaitlistLayout$ProductIntro productIntro) {
            Intrinsics.checkNotNullParameter(productIntro, "productIntro");
            this.f103701a = productIntro;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Benefits) && Intrinsics.f(this.f103701a, ((Benefits) obj2).f103701a);
        }

        public final int hashCode() {
            return this.f103701a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103701a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/ui/screen/invitation/WaitlistInvitationScreenContract$ModalStep$BottomSheet;", "Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/ui/screen/invitation/WaitlistInvitationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BottomSheet implements WaitlistInvitationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PricingPlanWaitlistLayout$BottomSheet f103702a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BottomSheet((PricingPlanWaitlistLayout$BottomSheet) parcel.readParcelable(BottomSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BottomSheet[i];
            }
        }

        public BottomSheet(PricingPlanWaitlistLayout$BottomSheet data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f103702a = data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BottomSheet) && Intrinsics.f(this.f103702a, ((BottomSheet) obj2).f103702a);
        }

        public final int hashCode() {
            return this.f103702a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103702a, i);
        }
    }
}
