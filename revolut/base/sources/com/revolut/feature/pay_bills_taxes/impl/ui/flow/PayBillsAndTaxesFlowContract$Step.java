package com.revolut.feature.pay_bills_taxes.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui/flow/PayBillsAndTaxesFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Registration", "Screen", "Lcom/revolut/feature/pay_bills_taxes/impl/ui/flow/PayBillsAndTaxesFlowContract$Step$Registration;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui/flow/PayBillsAndTaxesFlowContract$Step$Screen;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayBillsAndTaxesFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/flow/PayBillsAndTaxesFlowContract$Step$Registration;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui/flow/PayBillsAndTaxesFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Registration implements PayBillsAndTaxesFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Registration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nf9.a f78692a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Registration(nf9.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Registration[i];
            }
        }

        public Registration(nf9.a setup) {
            Intrinsics.checkNotNullParameter(setup, "setup");
            this.f78692a = setup;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Registration) && this.f78692a == ((Registration) obj2).f78692a;
        }

        public final int hashCode() {
            return this.f78692a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78692a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/flow/PayBillsAndTaxesFlowContract$Step$Screen;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui/flow/PayBillsAndTaxesFlowContract$Step;", "<init>", "()V", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Screen implements PayBillsAndTaxesFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Screen f78693a = new Screen();

        @NotNull
        public static final Parcelable.Creator<Screen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Screen.f78693a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Screen[i];
            }
        }

        private Screen() {
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
