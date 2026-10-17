package com.revolut.feature.pay_bills_taxes.impl.ui.screen.form;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pay_bills_taxes.impl.ui.errors.FormServerError;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui/screen/form/FormScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Errors", "Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/form/FormScreenContract$ModalStep$Errors;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FormScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/form/FormScreenContract$ModalStep$Errors;", "Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/form/FormScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Errors implements FormScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Errors> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f78719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FormServerError f78720b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Errors.class, parcel, arrayList, iE, 1);
                }
                return new Errors(arrayList, parcel.readInt() == 0 ? null : FormServerError.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Errors[i];
            }
        }

        public Errors(ArrayList formFields, FormServerError formServerError) {
            Intrinsics.checkNotNullParameter(formFields, "formFields");
            this.f78719a = formFields;
            this.f78720b = formServerError;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Errors)) {
                return false;
            }
            Errors errors = (Errors) obj2;
            return this.f78719a.equals(errors.f78719a) && Intrinsics.f(this.f78720b, errors.f78720b);
        }

        public final int hashCode() {
            int iHashCode = this.f78719a.hashCode() * 31;
            FormServerError formServerError = this.f78720b;
            return iHashCode + (formServerError == null ? 0 : formServerError.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f78719a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            FormServerError formServerError = this.f78720b;
            if (formServerError == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                formServerError.writeToParcel(dest, i);
            }
        }
    }
}
