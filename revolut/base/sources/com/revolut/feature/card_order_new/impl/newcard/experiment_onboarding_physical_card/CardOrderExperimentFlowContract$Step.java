package com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/card_order_new/impl/newcard/experiment_onboarding_physical_card/CardOrderExperimentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "MarketingPrompt", "PhysicalCatalogue", "VirtualCatalogue", "PushbackSheet", "Lcom/revolut/feature/card_order_new/impl/newcard/experiment_onboarding_physical_card/CardOrderExperimentFlowContract$Step$MarketingPrompt;", "Lcom/revolut/feature/card_order_new/impl/newcard/experiment_onboarding_physical_card/CardOrderExperimentFlowContract$Step$PhysicalCatalogue;", "Lcom/revolut/feature/card_order_new/impl/newcard/experiment_onboarding_physical_card/CardOrderExperimentFlowContract$Step$PushbackSheet;", "Lcom/revolut/feature/card_order_new/impl/newcard/experiment_onboarding_physical_card/CardOrderExperimentFlowContract$Step$VirtualCatalogue;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardOrderExperimentFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/newcard/experiment_onboarding_physical_card/CardOrderExperimentFlowContract$Step$MarketingPrompt;", "Lcom/revolut/feature/card_order_new/impl/newcard/experiment_onboarding_physical_card/CardOrderExperimentFlowContract$Step;", "<init>", "()V", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MarketingPrompt extends CardOrderExperimentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MarketingPrompt f65218a = new MarketingPrompt();

        @NotNull
        public static final Parcelable.Creator<MarketingPrompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MarketingPrompt.f65218a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarketingPrompt[i];
            }
        }

        private MarketingPrompt() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/newcard/experiment_onboarding_physical_card/CardOrderExperimentFlowContract$Step$PhysicalCatalogue;", "Lcom/revolut/feature/card_order_new/impl/newcard/experiment_onboarding_physical_card/CardOrderExperimentFlowContract$Step;", "<init>", "()V", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PhysicalCatalogue extends CardOrderExperimentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PhysicalCatalogue f65219a = new PhysicalCatalogue();

        @NotNull
        public static final Parcelable.Creator<PhysicalCatalogue> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PhysicalCatalogue.f65219a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhysicalCatalogue[i];
            }
        }

        private PhysicalCatalogue() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/newcard/experiment_onboarding_physical_card/CardOrderExperimentFlowContract$Step$PushbackSheet;", "Lcom/revolut/feature/card_order_new/impl/newcard/experiment_onboarding_physical_card/CardOrderExperimentFlowContract$Step;", "<init>", "()V", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PushbackSheet extends CardOrderExperimentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PushbackSheet f65220a = new PushbackSheet();

        @NotNull
        public static final Parcelable.Creator<PushbackSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PushbackSheet.f65220a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PushbackSheet[i];
            }
        }

        private PushbackSheet() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/newcard/experiment_onboarding_physical_card/CardOrderExperimentFlowContract$Step$VirtualCatalogue;", "Lcom/revolut/feature/card_order_new/impl/newcard/experiment_onboarding_physical_card/CardOrderExperimentFlowContract$Step;", "<init>", "()V", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class VirtualCatalogue extends CardOrderExperimentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final VirtualCatalogue f65221a = new VirtualCatalogue();

        @NotNull
        public static final Parcelable.Creator<VirtualCatalogue> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return VirtualCatalogue.f65221a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VirtualCatalogue[i];
            }
        }

        private VirtualCatalogue() {
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

    private CardOrderExperimentFlowContract$Step() {
    }
}
