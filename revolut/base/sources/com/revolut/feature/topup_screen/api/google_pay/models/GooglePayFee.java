package com.revolut.feature.topup_screen.api.google_pay.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/topup_screen/api/google_pay/models/GooglePayFee;", "Landroid/os/Parcelable;", "<init>", "()V", "FeeNotApplicable", "FeeOmitted", "FeeRequired", "Lcom/revolut/feature/topup_screen/api/google_pay/models/GooglePayFee$FeeNotApplicable;", "Lcom/revolut/feature/topup_screen/api/google_pay/models/GooglePayFee$FeeOmitted;", "Lcom/revolut/feature/topup_screen/api/google_pay/models/GooglePayFee$FeeRequired;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GooglePayFee implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/api/google_pay/models/GooglePayFee$FeeNotApplicable;", "Lcom/revolut/feature/topup_screen/api/google_pay/models/GooglePayFee;", "<init>", "()V", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FeeNotApplicable extends GooglePayFee {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FeeNotApplicable f90517a = new FeeNotApplicable();

        @NotNull
        public static final Parcelable.Creator<FeeNotApplicable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FeeNotApplicable.f90517a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeeNotApplicable[i];
            }
        }

        private FeeNotApplicable() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/google_pay/models/GooglePayFee$FeeOmitted;", "Lcom/revolut/feature/topup_screen/api/google_pay/models/GooglePayFee;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeeOmitted extends GooglePayFee {

        @NotNull
        public static final Parcelable.Creator<FeeOmitted> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GooglePayFeeMessage f90518a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeeOmitted(GooglePayFeeMessage.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeeOmitted[i];
            }
        }

        public FeeOmitted(GooglePayFeeMessage message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f90518a = message;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FeeOmitted) && Intrinsics.f(this.f90518a, ((FeeOmitted) obj2).f90518a);
        }

        public final int hashCode() {
            return this.f90518a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f90518a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/api/google_pay/models/GooglePayFee$FeeRequired;", "Lcom/revolut/feature/topup_screen/api/google_pay/models/GooglePayFee;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeeRequired extends GooglePayFee {

        @NotNull
        public static final Parcelable.Creator<FeeRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GooglePayFeeMessage f90519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f90520b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeeRequired(GooglePayFeeMessage.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeeRequired[i];
            }
        }

        public FeeRequired(GooglePayFeeMessage message, d fee2) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(fee2, "fee");
            this.f90519a = message;
            this.f90520b = fee2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FeeRequired)) {
                return false;
            }
            FeeRequired feeRequired = (FeeRequired) obj2;
            return Intrinsics.f(this.f90519a, feeRequired.f90519a) && Intrinsics.f(this.f90520b, feeRequired.f90520b);
        }

        public final int hashCode() {
            return this.f90520b.hashCode() + (this.f90519a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f90519a.writeToParcel(dest, i);
            dest.writeSerializable(this.f90520b);
        }
    }

    private GooglePayFee() {
    }
}
