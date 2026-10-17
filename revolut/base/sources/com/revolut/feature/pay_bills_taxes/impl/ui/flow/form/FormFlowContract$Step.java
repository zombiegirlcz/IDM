package com.revolut.feature.pay_bills_taxes.impl.ui.flow.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormV2;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui/flow/form/FormFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Form", "Lcom/revolut/feature/pay_bills_taxes/impl/ui/flow/form/FormFlowContract$Step$Form;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FormFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/flow/form/FormFlowContract$Step$Form;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui/flow/form/FormFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Form extends FormFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Form> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f78698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BillFormV2 f78699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bill f78700c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Form(g.valueOf(parcel.readString()), (BillFormV2) parcel.readParcelable(Form.class.getClassLoader()), (Bill) parcel.readParcelable(Form.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Form[i];
            }
        }

        public Form(g paymentMethod, BillFormV2 form, Bill bill) {
            Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
            Intrinsics.checkNotNullParameter(form, "form");
            this.f78698a = paymentMethod;
            this.f78699b = form;
            this.f78700c = bill;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Form)) {
                return false;
            }
            Form form = (Form) obj2;
            return this.f78698a == form.f78698a && Intrinsics.f(this.f78699b, form.f78699b) && Intrinsics.f(this.f78700c, form.f78700c);
        }

        public final int hashCode() {
            int iHashCode = (this.f78699b.hashCode() + (this.f78698a.hashCode() * 31)) * 31;
            Bill bill = this.f78700c;
            return iHashCode + (bill == null ? 0 : bill.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78698a.name());
            dest.writeParcelable(this.f78699b, i);
            dest.writeParcelable(this.f78700c, i);
        }
    }

    private FormFlowContract$Step() {
    }
}
