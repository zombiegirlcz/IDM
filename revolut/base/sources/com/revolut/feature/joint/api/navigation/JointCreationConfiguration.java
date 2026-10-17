package com.revolut.feature.joint.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/joint/api/navigation/JointCreationConfiguration;", "Landroid/os/Parcelable;", "Account", "Pocket", "Lcom/revolut/feature/joint/api/navigation/JointCreationConfiguration$Account;", "Lcom/revolut/feature/joint/api/navigation/JointCreationConfiguration$Pocket;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JointCreationConfiguration extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/joint/api/navigation/JointCreationConfiguration$Account;", "Lcom/revolut/feature/joint/api/navigation/JointCreationConfiguration;", "<init>", "()V", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Account implements JointCreationConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Account f76500a = new Account();

        @NotNull
        public static final Parcelable.Creator<Account> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Account.f76500a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Account[i];
            }
        }

        private Account() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/joint/api/navigation/JointCreationConfiguration$Pocket;", "Lcom/revolut/feature/joint/api/navigation/JointCreationConfiguration;", "<init>", "()V", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pocket implements JointCreationConfiguration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pocket f76501a = new Pocket();

        @NotNull
        public static final Parcelable.Creator<Pocket> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pocket.f76501a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pocket[i];
            }
        }

        private Pocket() {
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
