package com.revolut.feature.rev_points.extensions;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rev_points/extensions/RevPointsTabAction;", "Landroid/os/Parcelable;", "<init>", "()V", "ShowRewardsActivatedMessage", "ShowSpareChangeUpsell", "Lcom/revolut/feature/rev_points/extensions/RevPointsTabAction$ShowRewardsActivatedMessage;", "Lcom/revolut/feature/rev_points/extensions/RevPointsTabAction$ShowSpareChangeUpsell;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsTabAction implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/extensions/RevPointsTabAction$ShowRewardsActivatedMessage;", "Lcom/revolut/feature/rev_points/extensions/RevPointsTabAction;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowRewardsActivatedMessage extends RevPointsTabAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowRewardsActivatedMessage f83614a = new ShowRewardsActivatedMessage();

        @NotNull
        public static final Parcelable.Creator<ShowRewardsActivatedMessage> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowRewardsActivatedMessage.f83614a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowRewardsActivatedMessage[i];
            }
        }

        private ShowRewardsActivatedMessage() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/extensions/RevPointsTabAction$ShowSpareChangeUpsell;", "Lcom/revolut/feature/rev_points/extensions/RevPointsTabAction;", "<init>", "()V", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ShowSpareChangeUpsell extends RevPointsTabAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowSpareChangeUpsell f83615a = new ShowSpareChangeUpsell();

        @NotNull
        public static final Parcelable.Creator<ShowSpareChangeUpsell> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ShowSpareChangeUpsell.f83615a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowSpareChangeUpsell[i];
            }
        }

        private ShowSpareChangeUpsell() {
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

    private RevPointsTabAction() {
    }
}
