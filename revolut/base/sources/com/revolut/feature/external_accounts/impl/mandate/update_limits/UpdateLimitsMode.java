package com.revolut.feature.external_accounts.impl.mandate.update_limits;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/mandate/update_limits/UpdateLimitsMode;", "Landroid/os/Parcelable;", "<init>", "()V", "ReturnNewLimits", "UpdateMandate", "UpdateStoredMethodLimits", "Lcom/revolut/feature/external_accounts/impl/mandate/update_limits/UpdateLimitsMode$ReturnNewLimits;", "Lcom/revolut/feature/external_accounts/impl/mandate/update_limits/UpdateLimitsMode$UpdateMandate;", "Lcom/revolut/feature/external_accounts/impl/mandate/update_limits/UpdateLimitsMode$UpdateStoredMethodLimits;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UpdateLimitsMode implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/mandate/update_limits/UpdateLimitsMode$ReturnNewLimits;", "Lcom/revolut/feature/external_accounts/impl/mandate/update_limits/UpdateLimitsMode;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReturnNewLimits extends UpdateLimitsMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReturnNewLimits f72465a = new ReturnNewLimits();

        @NotNull
        public static final Parcelable.Creator<ReturnNewLimits> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReturnNewLimits.f72465a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReturnNewLimits[i];
            }
        }

        private ReturnNewLimits() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/mandate/update_limits/UpdateLimitsMode$UpdateMandate;", "Lcom/revolut/feature/external_accounts/impl/mandate/update_limits/UpdateLimitsMode;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateMandate extends UpdateLimitsMode {

        @NotNull
        public static final Parcelable.Creator<UpdateMandate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72466a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateMandate(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateMandate[i];
            }
        }

        public UpdateMandate(String institutionId) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            this.f72466a = institutionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UpdateMandate) && Intrinsics.f(this.f72466a, ((UpdateMandate) obj2).f72466a);
        }

        public final int hashCode() {
            return this.f72466a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72466a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/mandate/update_limits/UpdateLimitsMode$UpdateStoredMethodLimits;", "Lcom/revolut/feature/external_accounts/impl/mandate/update_limits/UpdateLimitsMode;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateStoredMethodLimits extends UpdateLimitsMode {

        @NotNull
        public static final Parcelable.Creator<UpdateStoredMethodLimits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72467a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateStoredMethodLimits(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateStoredMethodLimits[i];
            }
        }

        public UpdateStoredMethodLimits(String institutionId) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            this.f72467a = institutionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UpdateStoredMethodLimits) && Intrinsics.f(this.f72467a, ((UpdateStoredMethodLimits) obj2).f72467a);
        }

        public final int hashCode() {
            return this.f72467a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72467a);
        }
    }

    private UpdateLimitsMode() {
    }
}
