package com.revolut.feature.vaults.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/vaults/common/SavingAccountType;", "Landroid/os/Parcelable;", "<init>", "()V", "Personal", "Junior", "Joint", "Lcom/revolut/feature/vaults/common/SavingAccountType$Joint;", "Lcom/revolut/feature/vaults/common/SavingAccountType$Junior;", "Lcom/revolut/feature/vaults/common/SavingAccountType$Personal;", "feature_vaults_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SavingAccountType implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/common/SavingAccountType$Joint;", "Lcom/revolut/feature/vaults/common/SavingAccountType;", "", "toString", "()Ljava/lang/String;", "feature_vaults_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Joint extends SavingAccountType {

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94738a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Joint(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        public Joint(String jointId) {
            Intrinsics.checkNotNullParameter(jointId, "jointId");
            this.f94738a = jointId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Joint) && Intrinsics.f(this.f94738a, ((Joint) obj2).f94738a);
        }

        public final int hashCode() {
            return this.f94738a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94738a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/vaults/common/SavingAccountType$Junior;", "Lcom/revolut/feature/vaults/common/SavingAccountType;", "", "toString", "()Ljava/lang/String;", "feature_vaults_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Junior extends SavingAccountType {

        @NotNull
        public static final Parcelable.Creator<Junior> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94739a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Junior(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Junior[i];
            }
        }

        public Junior(String juniorId) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            this.f94739a = juniorId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Junior) && Intrinsics.f(this.f94739a, ((Junior) obj2).f94739a);
        }

        public final int hashCode() {
            return this.f94739a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94739a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/vaults/common/SavingAccountType$Personal;", "Lcom/revolut/feature/vaults/common/SavingAccountType;", "<init>", "()V", "feature_vaults_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Personal extends SavingAccountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Personal f94740a = new Personal();

        @NotNull
        public static final Parcelable.Creator<Personal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Personal.f94740a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personal[i];
            }
        }

        private Personal() {
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

    private SavingAccountType() {
    }
}
