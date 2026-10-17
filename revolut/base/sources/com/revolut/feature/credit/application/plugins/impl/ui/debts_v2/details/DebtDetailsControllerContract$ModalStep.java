package com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DebtDetailsControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ValuePicker", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DebtDetailsControllerContract$ModalStep$ValuePicker;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DebtDetailsControllerContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DebtDetailsControllerContract$ModalStep$ValuePicker;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DebtDetailsControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ValuePicker extends DebtDetailsControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ValuePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DetailsInputForm.DetailsInputField.DropdownField f67472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f67473b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ValuePicker(DetailsInputForm.DetailsInputField.DropdownField.CREATOR.createFromParcel(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ValuePicker[i];
            }
        }

        public ValuePicker(DetailsInputForm.DetailsInputField.DropdownField field, int i) {
            Intrinsics.checkNotNullParameter(field, "field");
            this.f67472a = field;
            this.f67473b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ValuePicker)) {
                return false;
            }
            ValuePicker valuePicker = (ValuePicker) obj2;
            return Intrinsics.f(this.f67472a, valuePicker.f67472a) && this.f67473b == valuePicker.f67473b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f67473b) + (this.f67472a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f67472a.writeToParcel(dest, i);
            dest.writeInt(this.f67473b);
        }
    }

    private DebtDetailsControllerContract$ModalStep() {
    }
}
