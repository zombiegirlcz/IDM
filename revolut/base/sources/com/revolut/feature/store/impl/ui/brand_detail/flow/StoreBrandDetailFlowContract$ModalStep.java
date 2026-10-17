package com.revolut.feature.store.impl.ui.brand_detail.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/store/impl/ui/brand_detail/flow/StoreBrandDetailFlowContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Checkout", "Lcom/revolut/feature/store/impl/ui/brand_detail/flow/StoreBrandDetailFlowContract$ModalStep$Checkout;", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StoreBrandDetailFlowContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/impl/ui/brand_detail/flow/StoreBrandDetailFlowContract$ModalStep$Checkout;", "Lcom/revolut/feature/store/impl/ui/brand_detail/flow/StoreBrandDetailFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout extends StoreBrandDetailFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RevPoints f88656c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checkout(parcel.readString(), parcel.readString(), (RevPoints) parcel.readParcelable(Checkout.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public Checkout(String voucherGroupId, String selectedVoucherId, RevPoints selectedVoucherPointsAmount) {
            Intrinsics.checkNotNullParameter(voucherGroupId, "voucherGroupId");
            Intrinsics.checkNotNullParameter(selectedVoucherId, "selectedVoucherId");
            Intrinsics.checkNotNullParameter(selectedVoucherPointsAmount, "selectedVoucherPointsAmount");
            this.f88654a = voucherGroupId;
            this.f88655b = selectedVoucherId;
            this.f88656c = selectedVoucherPointsAmount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Checkout)) {
                return false;
            }
            Checkout checkout = (Checkout) obj2;
            return Intrinsics.f(this.f88654a, checkout.f88654a) && Intrinsics.f(this.f88655b, checkout.f88655b) && Intrinsics.f(this.f88656c, checkout.f88656c);
        }

        public final int hashCode() {
            return this.f88656c.f83960a.hashCode() + p.a.c(this.f88654a.hashCode() * 31, 31, this.f88655b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88654a);
            dest.writeString(this.f88655b);
            dest.writeParcelable(this.f88656c, i);
        }
    }

    private StoreBrandDetailFlowContract$ModalStep() {
    }
}
