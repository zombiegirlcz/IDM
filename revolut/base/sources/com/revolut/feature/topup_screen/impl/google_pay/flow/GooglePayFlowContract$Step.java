package com.revolut.feature.topup_screen.impl.google_pay.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee;
import com.revolut.feature.topup_screen.api.topup_limits.TopUpLimitUiModel;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xze.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/topup_screen/impl/google_pay/flow/GooglePayFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "FeeOmittedDialog", "FeeRequiredDialog", "UnverifiedOwnerLimitValueDialog", "Lcom/revolut/feature/topup_screen/impl/google_pay/flow/GooglePayFlowContract$Step$FeeOmittedDialog;", "Lcom/revolut/feature/topup_screen/impl/google_pay/flow/GooglePayFlowContract$Step$FeeRequiredDialog;", "Lcom/revolut/feature/topup_screen/impl/google_pay/flow/GooglePayFlowContract$Step$UnverifiedOwnerLimitValueDialog;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GooglePayFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/google_pay/flow/GooglePayFlowContract$Step$FeeOmittedDialog;", "Lcom/revolut/feature/topup_screen/impl/google_pay/flow/GooglePayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeeOmittedDialog implements GooglePayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FeeOmittedDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GooglePayFee.FeeOmitted f91031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f91032b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeeOmittedDialog((GooglePayFee.FeeOmitted) parcel.readParcelable(FeeOmittedDialog.class.getClassLoader()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeeOmittedDialog[i];
            }
        }

        public FeeOmittedDialog(GooglePayFee.FeeOmitted fee2, d wallet) {
            Intrinsics.checkNotNullParameter(fee2, "fee");
            Intrinsics.checkNotNullParameter(wallet, "wallet");
            this.f91031a = fee2;
            this.f91032b = wallet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FeeOmittedDialog)) {
                return false;
            }
            FeeOmittedDialog feeOmittedDialog = (FeeOmittedDialog) obj2;
            return Intrinsics.f(this.f91031a, feeOmittedDialog.f91031a) && Intrinsics.f(this.f91032b, feeOmittedDialog.f91032b);
        }

        public final int hashCode() {
            return this.f91032b.hashCode() + (this.f91031a.f90518a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91031a, i);
            dest.writeSerializable(this.f91032b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/google_pay/flow/GooglePayFlowContract$Step$FeeRequiredDialog;", "Lcom/revolut/feature/topup_screen/impl/google_pay/flow/GooglePayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeeRequiredDialog implements GooglePayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FeeRequiredDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GooglePayFee.FeeRequired f91033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f91034b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeeRequiredDialog((GooglePayFee.FeeRequired) parcel.readParcelable(FeeRequiredDialog.class.getClassLoader()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeeRequiredDialog[i];
            }
        }

        public FeeRequiredDialog(GooglePayFee.FeeRequired fee2, d wallet) {
            Intrinsics.checkNotNullParameter(fee2, "fee");
            Intrinsics.checkNotNullParameter(wallet, "wallet");
            this.f91033a = fee2;
            this.f91034b = wallet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FeeRequiredDialog)) {
                return false;
            }
            FeeRequiredDialog feeRequiredDialog = (FeeRequiredDialog) obj2;
            return Intrinsics.f(this.f91033a, feeRequiredDialog.f91033a) && Intrinsics.f(this.f91034b, feeRequiredDialog.f91034b);
        }

        public final int hashCode() {
            return this.f91034b.hashCode() + (this.f91033a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91033a, i);
            dest.writeSerializable(this.f91034b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/google_pay/flow/GooglePayFlowContract$Step$UnverifiedOwnerLimitValueDialog;", "Lcom/revolut/feature/topup_screen/impl/google_pay/flow/GooglePayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnverifiedOwnerLimitValueDialog implements GooglePayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UnverifiedOwnerLimitValueDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopUpLimitUiModel f91035a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnverifiedOwnerLimitValueDialog((TopUpLimitUiModel) parcel.readParcelable(UnverifiedOwnerLimitValueDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnverifiedOwnerLimitValueDialog[i];
            }
        }

        public UnverifiedOwnerLimitValueDialog(TopUpLimitUiModel limit) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            this.f91035a = limit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UnverifiedOwnerLimitValueDialog) && Intrinsics.f(this.f91035a, ((UnverifiedOwnerLimitValueDialog) obj2).f91035a);
        }

        public final int hashCode() {
            return this.f91035a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91035a, i);
        }
    }
}
