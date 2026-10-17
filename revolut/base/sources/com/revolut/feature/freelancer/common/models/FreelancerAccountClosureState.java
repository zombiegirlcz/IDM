package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerAccountClosureState;", "Landroid/os/Parcelable;", "NotClosed", "Closed", "Lcom/revolut/feature/freelancer/common/models/FreelancerAccountClosureState$Closed;", "Lcom/revolut/feature/freelancer/common/models/FreelancerAccountClosureState$NotClosed;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerAccountClosureState extends Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerAccountClosureState$Closed;", "Lcom/revolut/feature/freelancer/common/models/FreelancerAccountClosureState;", "Manually", "Unknown", "Lcom/revolut/feature/freelancer/common/models/FreelancerAccountClosureState$Closed$Manually;", "Lcom/revolut/feature/freelancer/common/models/FreelancerAccountClosureState$Closed$Unknown;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Closed extends FreelancerAccountClosureState {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerAccountClosureState$Closed$Manually;", "Lcom/revolut/feature/freelancer/common/models/FreelancerAccountClosureState$Closed;", "<init>", "()V", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Manually implements Closed {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Manually f73266a = new Manually();

            @NotNull
            public static final Parcelable.Creator<Manually> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Manually.f73266a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Manually[i];
                }
            }

            private Manually() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerAccountClosureState$Closed$Unknown;", "Lcom/revolut/feature/freelancer/common/models/FreelancerAccountClosureState$Closed;", "<init>", "()V", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Unknown implements Closed {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Unknown f73267a = new Unknown();

            @NotNull
            public static final Parcelable.Creator<Unknown> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Unknown.f73267a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerAccountClosureState$NotClosed;", "Lcom/revolut/feature/freelancer/common/models/FreelancerAccountClosureState;", "<init>", "()V", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotClosed implements FreelancerAccountClosureState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotClosed f73268a = new NotClosed();

        @NotNull
        public static final Parcelable.Creator<NotClosed> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotClosed.f73268a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotClosed[i];
            }
        }

        private NotClosed() {
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
