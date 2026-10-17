package com.revolut.feature.apm.services.ideal.impl.ui.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/services/ideal/impl/ui/confirmation/IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint", "Landroid/os/Parcelable;", "Desktop", "Mobile", "Lcom/revolut/feature/apm/services/ideal/impl/ui/confirmation/IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint$Desktop;", "Lcom/revolut/feature/apm/services/ideal/impl/ui/confirmation/IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint$Mobile;", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/impl/ui/confirmation/IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint$Desktop;", "Lcom/revolut/feature/apm/services/ideal/impl/ui/confirmation/IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint;", "<init>", "()V", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Desktop implements IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Desktop f62842a = new Desktop();

        @NotNull
        public static final Parcelable.Creator<Desktop> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Desktop.f62842a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Desktop[i];
            }
        }

        private Desktop() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/impl/ui/confirmation/IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint$Mobile;", "Lcom/revolut/feature/apm/services/ideal/impl/ui/confirmation/IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint;", "", "toString", "()Ljava/lang/String;", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Mobile implements IDealPaymentConfirmedScreenContract$PaymentFlowEntryPoint {

        @NotNull
        public static final Parcelable.Creator<Mobile> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62843a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Mobile(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Mobile[i];
            }
        }

        public Mobile(String redirectUrl) {
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            this.f62843a = redirectUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Mobile) && Intrinsics.f(this.f62843a, ((Mobile) obj2).f62843a);
        }

        public final int hashCode() {
            return this.f62843a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62843a);
        }
    }
}
