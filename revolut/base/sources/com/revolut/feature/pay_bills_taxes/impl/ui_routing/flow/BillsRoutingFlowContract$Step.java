package com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui_routing/flow/BillsRoutingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PayBillsAndTaxes", "BillsCatalogue", "Lcom/revolut/feature/pay_bills_taxes/impl/ui_routing/flow/BillsRoutingFlowContract$Step$BillsCatalogue;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui_routing/flow/BillsRoutingFlowContract$Step$PayBillsAndTaxes;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BillsRoutingFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui_routing/flow/BillsRoutingFlowContract$Step$BillsCatalogue;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui_routing/flow/BillsRoutingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillsCatalogue implements BillsRoutingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BillsCatalogue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f78799a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillsCatalogue(g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillsCatalogue[i];
            }
        }

        public BillsCatalogue(g paymentMethod) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            this.f78799a = paymentMethod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BillsCatalogue) && this.f78799a == ((BillsCatalogue) obj2).f78799a;
        }

        public final int hashCode() {
            return this.f78799a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78799a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui_routing/flow/BillsRoutingFlowContract$Step$PayBillsAndTaxes;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui_routing/flow/BillsRoutingFlowContract$Step;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PayBillsAndTaxes implements BillsRoutingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayBillsAndTaxes f78800a = new PayBillsAndTaxes();

        @NotNull
        public static final Parcelable.Creator<PayBillsAndTaxes> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PayBillsAndTaxes.f78800a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayBillsAndTaxes[i];
            }
        }

        private PayBillsAndTaxes() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof PayBillsAndTaxes);
        }

        public final int hashCode() {
            return -217461636;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
