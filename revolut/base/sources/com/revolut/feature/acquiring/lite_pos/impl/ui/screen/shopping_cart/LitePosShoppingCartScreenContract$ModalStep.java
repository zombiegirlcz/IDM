package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/acquiring/lite_pos/impl/ui/screen/shopping_cart/LitePosShoppingCartScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ClearCartConfirmation", "AmountExceedsLimit", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/shopping_cart/LitePosShoppingCartScreenContract$ModalStep$AmountExceedsLimit;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/shopping_cart/LitePosShoppingCartScreenContract$ModalStep$ClearCartConfirmation;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LitePosShoppingCartScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/shopping_cart/LitePosShoppingCartScreenContract$ModalStep$AmountExceedsLimit;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/shopping_cart/LitePosShoppingCartScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AmountExceedsLimit implements LitePosShoppingCartScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AmountExceedsLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f60833a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AmountExceedsLimit((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountExceedsLimit[i];
            }
        }

        public AmountExceedsLimit(d pendingTransactionLimit) {
            Intrinsics.checkNotNullParameter(pendingTransactionLimit, "pendingTransactionLimit");
            this.f60833a = pendingTransactionLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AmountExceedsLimit) && Intrinsics.f(this.f60833a, ((AmountExceedsLimit) obj2).f60833a);
        }

        public final int hashCode() {
            return this.f60833a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f60833a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/shopping_cart/LitePosShoppingCartScreenContract$ModalStep$ClearCartConfirmation;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/shopping_cart/LitePosShoppingCartScreenContract$ModalStep;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ClearCartConfirmation implements LitePosShoppingCartScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ClearCartConfirmation f60834a = new ClearCartConfirmation();

        @NotNull
        public static final Parcelable.Creator<ClearCartConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ClearCartConfirmation.f60834a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClearCartConfirmation[i];
            }
        }

        private ClearCartConfirmation() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof ClearCartConfirmation);
        }

        public final int hashCode() {
            return -1966605638;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
