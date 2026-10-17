package com.revolut.feature.security_hub.impl.ui.transactions_limits;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$LimitFlowType", "Landroid/os/Parcelable;", "Singapore", "SepaExtended", "WalletLimits", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$LimitFlowType$SepaExtended;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$LimitFlowType$Singapore;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$LimitFlowType$WalletLimits;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransactionsLimitsScreenContract$LimitFlowType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$LimitFlowType$SepaExtended;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$LimitFlowType;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SepaExtended implements TransactionsLimitsScreenContract$LimitFlowType {

        @NotNull
        public static final Parcelable.Creator<SepaExtended> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f85736a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SepaExtended((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SepaExtended[i];
            }
        }

        public SepaExtended(b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f85736a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SepaExtended) && Intrinsics.f(this.f85736a, ((SepaExtended) obj2).f85736a);
        }

        public final int hashCode() {
            return this.f85736a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f85736a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$LimitFlowType$Singapore;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$LimitFlowType;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Singapore implements TransactionsLimitsScreenContract$LimitFlowType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Singapore f85737a = new Singapore();

        @NotNull
        public static final Parcelable.Creator<Singapore> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Singapore.f85737a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Singapore[i];
            }
        }

        private Singapore() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$LimitFlowType$WalletLimits;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$LimitFlowType;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WalletLimits implements TransactionsLimitsScreenContract$LimitFlowType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WalletLimits f85738a = new WalletLimits();

        @NotNull
        public static final Parcelable.Creator<WalletLimits> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WalletLimits.f85738a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WalletLimits[i];
            }
        }

        private WalletLimits() {
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
