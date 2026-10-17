package com.revolut.feature.kyc.impl;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/kyc/impl/KycScreenContract$KycDocsStatus", "Landroid/os/Parcelable;", "Completed", "FailedUnrecoverable", "FailedRecoverable", "Lcom/revolut/feature/kyc/impl/KycScreenContract$KycDocsStatus$Completed;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$KycDocsStatus$FailedRecoverable;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$KycDocsStatus$FailedUnrecoverable;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface KycScreenContract$KycDocsStatus extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/impl/KycScreenContract$KycDocsStatus$Completed;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$KycDocsStatus;", "<init>", "()V", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Completed implements KycScreenContract$KycDocsStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Completed f77552a = new Completed();

        @NotNull
        public static final Parcelable.Creator<Completed> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Completed.f77552a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Completed[i];
            }
        }

        private Completed() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/impl/KycScreenContract$KycDocsStatus$FailedRecoverable;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$KycDocsStatus;", "<init>", "()V", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FailedRecoverable implements KycScreenContract$KycDocsStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FailedRecoverable f77553a = new FailedRecoverable();

        @NotNull
        public static final Parcelable.Creator<FailedRecoverable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FailedRecoverable.f77553a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FailedRecoverable[i];
            }
        }

        private FailedRecoverable() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/impl/KycScreenContract$KycDocsStatus$FailedUnrecoverable;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$KycDocsStatus;", "<init>", "()V", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FailedUnrecoverable implements KycScreenContract$KycDocsStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FailedUnrecoverable f77554a = new FailedUnrecoverable();

        @NotNull
        public static final Parcelable.Creator<FailedUnrecoverable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FailedUnrecoverable.f77554a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FailedUnrecoverable[i];
            }
        }

        private FailedUnrecoverable() {
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
