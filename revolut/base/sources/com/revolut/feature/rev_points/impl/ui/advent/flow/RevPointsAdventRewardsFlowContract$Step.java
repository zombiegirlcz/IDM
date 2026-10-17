package com.revolut.feature.rev_points.impl.ui.advent.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/rev_points/impl/ui/advent/flow/RevPointsAdventRewardsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "WrappedArticle", "UnwrappedArticle", "ConfettiDialog", "Lcom/revolut/feature/rev_points/impl/ui/advent/flow/RevPointsAdventRewardsFlowContract$Step$ConfettiDialog;", "Lcom/revolut/feature/rev_points/impl/ui/advent/flow/RevPointsAdventRewardsFlowContract$Step$UnwrappedArticle;", "Lcom/revolut/feature/rev_points/impl/ui/advent/flow/RevPointsAdventRewardsFlowContract$Step$WrappedArticle;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsAdventRewardsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/advent/flow/RevPointsAdventRewardsFlowContract$Step$ConfettiDialog;", "Lcom/revolut/feature/rev_points/impl/ui/advent/flow/RevPointsAdventRewardsFlowContract$Step;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ConfettiDialog extends RevPointsAdventRewardsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfettiDialog f83767a = new ConfettiDialog();

        @NotNull
        public static final Parcelable.Creator<ConfettiDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ConfettiDialog.f83767a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfettiDialog[i];
            }
        }

        private ConfettiDialog() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/advent/flow/RevPointsAdventRewardsFlowContract$Step$UnwrappedArticle;", "Lcom/revolut/feature/rev_points/impl/ui/advent/flow/RevPointsAdventRewardsFlowContract$Step;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnwrappedArticle extends RevPointsAdventRewardsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnwrappedArticle f83768a = new UnwrappedArticle();

        @NotNull
        public static final Parcelable.Creator<UnwrappedArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnwrappedArticle.f83768a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnwrappedArticle[i];
            }
        }

        private UnwrappedArticle() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/impl/ui/advent/flow/RevPointsAdventRewardsFlowContract$Step$WrappedArticle;", "Lcom/revolut/feature/rev_points/impl/ui/advent/flow/RevPointsAdventRewardsFlowContract$Step;", "<init>", "()V", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WrappedArticle extends RevPointsAdventRewardsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WrappedArticle f83769a = new WrappedArticle();

        @NotNull
        public static final Parcelable.Creator<WrappedArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WrappedArticle.f83769a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WrappedArticle[i];
            }
        }

        private WrappedArticle() {
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

    private RevPointsAdventRewardsFlowContract$Step() {
    }
}
