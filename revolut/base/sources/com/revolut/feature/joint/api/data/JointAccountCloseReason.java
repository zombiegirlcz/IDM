package com.revolut.feature.joint.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/joint/api/data/JointAccountCloseReason;", "Landroid/os/Parcelable;", "<init>", "()V", "UserIntention", "ForceOffBoarding", "Lcom/revolut/feature/joint/api/data/JointAccountCloseReason$ForceOffBoarding;", "Lcom/revolut/feature/joint/api/data/JointAccountCloseReason$UserIntention;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JointAccountCloseReason implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/joint/api/data/JointAccountCloseReason$ForceOffBoarding;", "Lcom/revolut/feature/joint/api/data/JointAccountCloseReason;", "<init>", "()V", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ForceOffBoarding extends JointAccountCloseReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ForceOffBoarding f76465a = new ForceOffBoarding();

        @NotNull
        public static final Parcelable.Creator<ForceOffBoarding> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ForceOffBoarding.f76465a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ForceOffBoarding[i];
            }
        }

        private ForceOffBoarding() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/joint/api/data/JointAccountCloseReason$UserIntention;", "Lcom/revolut/feature/joint/api/data/JointAccountCloseReason;", "<init>", "()V", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UserIntention extends JointAccountCloseReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UserIntention f76466a = new UserIntention();

        @NotNull
        public static final Parcelable.Creator<UserIntention> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UserIntention.f76466a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UserIntention[i];
            }
        }

        private UserIntention() {
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

    private JointAccountCloseReason() {
    }
}
