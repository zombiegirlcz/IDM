package com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.PlanSelectionCoreFlowContract$PlanSelectionParams;
import hha.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lha.g;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SwitchToIndividualPromptControllerModelExtension extends n {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/switch_to_individual/SwitchToIndividualPromptControllerModelExtension$SwitchToIndividualPromptState;", "Landroid/os/Parcelable;", "<init>", "()V", "Loading", "NotRequired", "RequiredForUpgrade", "ShownAndConfirmed", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/switch_to_individual/SwitchToIndividualPromptControllerModelExtension$SwitchToIndividualPromptState$Loading;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/switch_to_individual/SwitchToIndividualPromptControllerModelExtension$SwitchToIndividualPromptState$NotRequired;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/switch_to_individual/SwitchToIndividualPromptControllerModelExtension$SwitchToIndividualPromptState$RequiredForUpgrade;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/switch_to_individual/SwitchToIndividualPromptControllerModelExtension$SwitchToIndividualPromptState$ShownAndConfirmed;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class SwitchToIndividualPromptState implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/switch_to_individual/SwitchToIndividualPromptControllerModelExtension$SwitchToIndividualPromptState$Loading;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/switch_to_individual/SwitchToIndividualPromptControllerModelExtension$SwitchToIndividualPromptState;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Loading extends SwitchToIndividualPromptState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Loading f103099a = new Loading();

            @NotNull
            public static final Parcelable.Creator<Loading> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Loading.f103099a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Loading[i];
                }
            }

            private Loading() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/switch_to_individual/SwitchToIndividualPromptControllerModelExtension$SwitchToIndividualPromptState$NotRequired;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/switch_to_individual/SwitchToIndividualPromptControllerModelExtension$SwitchToIndividualPromptState;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class NotRequired extends SwitchToIndividualPromptState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final NotRequired f103100a = new NotRequired();

            @NotNull
            public static final Parcelable.Creator<NotRequired> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NotRequired.f103100a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NotRequired[i];
                }
            }

            private NotRequired() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/switch_to_individual/SwitchToIndividualPromptControllerModelExtension$SwitchToIndividualPromptState$RequiredForUpgrade;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/switch_to_individual/SwitchToIndividualPromptControllerModelExtension$SwitchToIndividualPromptState;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RequiredForUpgrade extends SwitchToIndividualPromptState {

            @NotNull
            public static final Parcelable.Creator<RequiredForUpgrade> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f103101a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RequiredForUpgrade((g) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RequiredForUpgrade[i];
                }
            }

            public RequiredForUpgrade(g info) {
                Intrinsics.checkNotNullParameter(info, "info");
                this.f103101a = info;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof RequiredForUpgrade) && Intrinsics.f(this.f103101a, ((RequiredForUpgrade) obj2).f103101a);
            }

            public final int hashCode() {
                return this.f103101a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f103101a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/switch_to_individual/SwitchToIndividualPromptControllerModelExtension$SwitchToIndividualPromptState$ShownAndConfirmed;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_selection/switch_to_individual/SwitchToIndividualPromptControllerModelExtension$SwitchToIndividualPromptState;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ShownAndConfirmed extends SwitchToIndividualPromptState {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ShownAndConfirmed f103102a = new ShownAndConfirmed();

            @NotNull
            public static final Parcelable.Creator<ShownAndConfirmed> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShownAndConfirmed.f103102a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ShownAndConfirmed[i];
                }
            }

            private ShownAndConfirmed() {
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

        private SwitchToIndividualPromptState() {
        }
    }

    public abstract Object Z2(gim.c cVar);

    public abstract void b3(d dVar, PlanSelectionCoreFlowContract$PlanSelectionParams planSelectionCoreFlowContract$PlanSelectionParams, g gVar, je2.d dVar2);
}
