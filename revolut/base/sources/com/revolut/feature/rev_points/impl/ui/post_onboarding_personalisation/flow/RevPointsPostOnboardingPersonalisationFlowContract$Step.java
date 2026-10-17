package com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/rev_points/impl/ui/post_onboarding_personalisation/flow/RevPointsPostOnboardingPersonalisationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Categories", "Brands", "Lcom/revolut/feature/rev_points/impl/ui/post_onboarding_personalisation/flow/RevPointsPostOnboardingPersonalisationFlowContract$Step$Brands;", "Lcom/revolut/feature/rev_points/impl/ui/post_onboarding_personalisation/flow/RevPointsPostOnboardingPersonalisationFlowContract$Step$Categories;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsPostOnboardingPersonalisationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/post_onboarding_personalisation/flow/RevPointsPostOnboardingPersonalisationFlowContract$Step$Brands;", "Lcom/revolut/feature/rev_points/impl/ui/post_onboarding_personalisation/flow/RevPointsPostOnboardingPersonalisationFlowContract$Step;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Brands extends RevPointsPostOnboardingPersonalisationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Brands f83837a = new Brands();

        @NotNull
        public static final Parcelable.Creator<Brands> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Brands.f83837a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Brands[i];
            }
        }

        private Brands() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/post_onboarding_personalisation/flow/RevPointsPostOnboardingPersonalisationFlowContract$Step$Categories;", "Lcom/revolut/feature/rev_points/impl/ui/post_onboarding_personalisation/flow/RevPointsPostOnboardingPersonalisationFlowContract$Step;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Categories extends RevPointsPostOnboardingPersonalisationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Categories f83838a = new Categories();

        @NotNull
        public static final Parcelable.Creator<Categories> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Categories.f83838a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Categories[i];
            }
        }

        private Categories() {
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

    private RevPointsPostOnboardingPersonalisationFlowContract$Step() {
    }
}
