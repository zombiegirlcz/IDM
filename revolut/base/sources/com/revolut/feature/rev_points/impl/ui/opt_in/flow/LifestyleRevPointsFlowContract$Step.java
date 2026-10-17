package com.revolut.feature.rev_points.impl.ui.opt_in.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "OptIn", "SpareChangeFullMultiplier", "SpareChangeFullGrid", "SpareChangeFullBannerGrid", "SpareChangeBottomSheet", "Lcom/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlowContract$Step$OptIn;", "Lcom/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlowContract$Step$SpareChangeBottomSheet;", "Lcom/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlowContract$Step$SpareChangeFullBannerGrid;", "Lcom/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlowContract$Step$SpareChangeFullGrid;", "Lcom/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlowContract$Step$SpareChangeFullMultiplier;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LifestyleRevPointsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlowContract$Step$OptIn;", "Lcom/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlowContract$Step;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OptIn extends LifestyleRevPointsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OptIn f83808a = new OptIn();

        @NotNull
        public static final Parcelable.Creator<OptIn> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OptIn.f83808a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptIn[i];
            }
        }

        private OptIn() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlowContract$Step$SpareChangeBottomSheet;", "Lcom/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlowContract$Step;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SpareChangeBottomSheet extends LifestyleRevPointsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SpareChangeBottomSheet f83809a = new SpareChangeBottomSheet();

        @NotNull
        public static final Parcelable.Creator<SpareChangeBottomSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SpareChangeBottomSheet.f83809a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpareChangeBottomSheet[i];
            }
        }

        private SpareChangeBottomSheet() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlowContract$Step$SpareChangeFullBannerGrid;", "Lcom/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlowContract$Step;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SpareChangeFullBannerGrid extends LifestyleRevPointsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SpareChangeFullBannerGrid f83810a = new SpareChangeFullBannerGrid();

        @NotNull
        public static final Parcelable.Creator<SpareChangeFullBannerGrid> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SpareChangeFullBannerGrid.f83810a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpareChangeFullBannerGrid[i];
            }
        }

        private SpareChangeFullBannerGrid() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlowContract$Step$SpareChangeFullGrid;", "Lcom/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlowContract$Step;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SpareChangeFullGrid extends LifestyleRevPointsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SpareChangeFullGrid f83811a = new SpareChangeFullGrid();

        @NotNull
        public static final Parcelable.Creator<SpareChangeFullGrid> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SpareChangeFullGrid.f83811a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpareChangeFullGrid[i];
            }
        }

        private SpareChangeFullGrid() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlowContract$Step$SpareChangeFullMultiplier;", "Lcom/revolut/feature/rev_points/impl/ui/opt_in/flow/LifestyleRevPointsFlowContract$Step;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SpareChangeFullMultiplier extends LifestyleRevPointsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SpareChangeFullMultiplier f83812a = new SpareChangeFullMultiplier();

        @NotNull
        public static final Parcelable.Creator<SpareChangeFullMultiplier> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SpareChangeFullMultiplier.f83812a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpareChangeFullMultiplier[i];
            }
        }

        private SpareChangeFullMultiplier() {
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

    private LifestyleRevPointsFlowContract$Step() {
    }
}
