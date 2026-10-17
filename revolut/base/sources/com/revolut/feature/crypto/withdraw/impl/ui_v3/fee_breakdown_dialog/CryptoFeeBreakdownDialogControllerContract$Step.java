package com.revolut.feature.crypto.withdraw.impl.ui_v3.fee_breakdown_dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.remittance.models.domain.fees.CryptoWithdrawFeesBreakdownDetail;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui_v3/fee_breakdown_dialog/CryptoFeeBreakdownDialogControllerContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "BreakdownDetail", "NetworkFee", "ServiceFee", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/fee_breakdown_dialog/CryptoFeeBreakdownDialogControllerContract$Step$BreakdownDetail;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/fee_breakdown_dialog/CryptoFeeBreakdownDialogControllerContract$Step$NetworkFee;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/fee_breakdown_dialog/CryptoFeeBreakdownDialogControllerContract$Step$ServiceFee;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoFeeBreakdownDialogControllerContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/fee_breakdown_dialog/CryptoFeeBreakdownDialogControllerContract$Step$BreakdownDetail;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/fee_breakdown_dialog/CryptoFeeBreakdownDialogControllerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BreakdownDetail implements CryptoFeeBreakdownDialogControllerContract$Step {

        @NotNull
        public static final Parcelable.Creator<BreakdownDetail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoWithdrawFeesBreakdownDetail f71300a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BreakdownDetail((CryptoWithdrawFeesBreakdownDetail) parcel.readParcelable(BreakdownDetail.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BreakdownDetail[i];
            }
        }

        public BreakdownDetail(CryptoWithdrawFeesBreakdownDetail detail) {
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.f71300a = detail;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BreakdownDetail) && Intrinsics.f(this.f71300a, ((BreakdownDetail) obj2).f71300a);
        }

        public final int hashCode() {
            return this.f71300a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71300a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/fee_breakdown_dialog/CryptoFeeBreakdownDialogControllerContract$Step$NetworkFee;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/fee_breakdown_dialog/CryptoFeeBreakdownDialogControllerContract$Step;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NetworkFee implements CryptoFeeBreakdownDialogControllerContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NetworkFee f71301a = new NetworkFee();

        @NotNull
        public static final Parcelable.Creator<NetworkFee> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NetworkFee.f71301a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NetworkFee[i];
            }
        }

        private NetworkFee() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/fee_breakdown_dialog/CryptoFeeBreakdownDialogControllerContract$Step$ServiceFee;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/fee_breakdown_dialog/CryptoFeeBreakdownDialogControllerContract$Step;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ServiceFee implements CryptoFeeBreakdownDialogControllerContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ServiceFee f71302a = new ServiceFee();

        @NotNull
        public static final Parcelable.Creator<ServiceFee> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ServiceFee.f71302a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ServiceFee[i];
            }
        }

        private ServiceFee() {
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
