package com.revolut.feature.tax_residency.api.stamp_duty.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tax_residency/api/stamp_duty/models/StampDutyAccount;", "Landroid/os/Parcelable;", "Personal", "Joint", "Pro", "Lcom/revolut/feature/tax_residency/api/stamp_duty/models/StampDutyAccount$Joint;", "Lcom/revolut/feature/tax_residency/api/stamp_duty/models/StampDutyAccount$Personal;", "Lcom/revolut/feature/tax_residency/api/stamp_duty/models/StampDutyAccount$Pro;", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StampDutyAccount extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/api/stamp_duty/models/StampDutyAccount$Joint;", "Lcom/revolut/feature/tax_residency/api/stamp_duty/models/StampDutyAccount;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Joint implements StampDutyAccount {

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89991a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Joint(((WalletId) parcel.readParcelable(Joint.class.getClassLoader())).f66106a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        public Joint(String walletId) {
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f89991a = walletId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Joint) && Intrinsics.f(this.f89991a, ((Joint) obj2).f89991a);
        }

        public final int hashCode() {
            return this.f89991a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new WalletId(this.f89991a), i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/api/stamp_duty/models/StampDutyAccount$Personal;", "Lcom/revolut/feature/tax_residency/api/stamp_duty/models/StampDutyAccount;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Personal implements StampDutyAccount {

        @NotNull
        public static final Parcelable.Creator<Personal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89992a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Personal(((WalletId) parcel.readParcelable(Personal.class.getClassLoader())).f66106a);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personal[i];
            }
        }

        public Personal(String walletId) {
            Intrinsics.checkNotNullParameter(walletId, "walletId");
            this.f89992a = walletId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Personal) && Intrinsics.f(this.f89992a, ((Personal) obj2).f89992a);
        }

        public final int hashCode() {
            return this.f89992a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(new WalletId(this.f89992a), i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/api/stamp_duty/models/StampDutyAccount$Pro;", "Lcom/revolut/feature/tax_residency/api/stamp_duty/models/StampDutyAccount;", "<init>", "()V", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pro implements StampDutyAccount {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pro f89993a = new Pro();

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pro.f89993a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        private Pro() {
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
