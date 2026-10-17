package com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/checkout/screen/custom_amount/CheckoutCustomAmountScreenContract$ValidationResult", "Landroid/os/Parcelable;", "<init>", "()V", "MoreThanMaximum", "ZeroAmount", "Valid", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/custom_amount/CheckoutCustomAmountScreenContract$ValidationResult$MoreThanMaximum;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/custom_amount/CheckoutCustomAmountScreenContract$ValidationResult$Valid;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/custom_amount/CheckoutCustomAmountScreenContract$ValidationResult$ZeroAmount;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CheckoutCustomAmountScreenContract$ValidationResult implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/custom_amount/CheckoutCustomAmountScreenContract$ValidationResult$MoreThanMaximum;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/custom_amount/CheckoutCustomAmountScreenContract$ValidationResult;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoreThanMaximum extends CheckoutCustomAmountScreenContract$ValidationResult {

        @NotNull
        public static final Parcelable.Creator<MoreThanMaximum> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f90767a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoreThanMaximum((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoreThanMaximum[i];
            }
        }

        public MoreThanMaximum(d maxAmount) {
            Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
            this.f90767a = maxAmount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MoreThanMaximum) && Intrinsics.f(this.f90767a, ((MoreThanMaximum) obj2).f90767a);
        }

        public final int hashCode() {
            return this.f90767a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f90767a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/custom_amount/CheckoutCustomAmountScreenContract$ValidationResult$Valid;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/custom_amount/CheckoutCustomAmountScreenContract$ValidationResult;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Valid extends CheckoutCustomAmountScreenContract$ValidationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Valid f90768a = new Valid();

        @NotNull
        public static final Parcelable.Creator<Valid> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Valid.f90768a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Valid[i];
            }
        }

        private Valid() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/custom_amount/CheckoutCustomAmountScreenContract$ValidationResult$ZeroAmount;", "Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/custom_amount/CheckoutCustomAmountScreenContract$ValidationResult;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ZeroAmount extends CheckoutCustomAmountScreenContract$ValidationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ZeroAmount f90769a = new ZeroAmount();

        @NotNull
        public static final Parcelable.Creator<ZeroAmount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ZeroAmount.f90769a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ZeroAmount[i];
            }
        }

        private ZeroAmount() {
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

    private CheckoutCustomAmountScreenContract$ValidationResult() {
    }
}
