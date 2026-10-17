package com.revolut.feature.pay_bills_taxes.impl.ui.screen.error;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pay_bills_taxes.impl.ui.errors.FormServerError;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.BillFormFieldControllerModelExtensionV2$BillData;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui/screen/error/FormErrorsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormErrorsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FormErrorsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f78707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillFormFieldControllerModelExtensionV2$BillData f78708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FormServerError f78709c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(FormErrorsScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new FormErrorsScreenContract$InputData(arrayList, BillFormFieldControllerModelExtensionV2$BillData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FormServerError.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FormErrorsScreenContract$InputData[i];
        }
    }

    public FormErrorsScreenContract$InputData(ArrayList formFields, BillFormFieldControllerModelExtensionV2$BillData billData, FormServerError formServerError) {
        Intrinsics.checkNotNullParameter(formFields, "formFields");
        Intrinsics.checkNotNullParameter(billData, "billData");
        this.f78707a = formFields;
        this.f78708b = billData;
        this.f78709c = formServerError;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FormErrorsScreenContract$InputData)) {
            return false;
        }
        FormErrorsScreenContract$InputData formErrorsScreenContract$InputData = (FormErrorsScreenContract$InputData) obj2;
        return this.f78707a.equals(formErrorsScreenContract$InputData.f78707a) && Intrinsics.f(this.f78708b, formErrorsScreenContract$InputData.f78708b) && Intrinsics.f(this.f78709c, formErrorsScreenContract$InputData.f78709c);
    }

    public final int hashCode() {
        int iHashCode = (this.f78708b.hashCode() + (this.f78707a.hashCode() * 31)) * 31;
        FormServerError formServerError = this.f78709c;
        return iHashCode + (formServerError == null ? 0 : formServerError.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f78707a, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        this.f78708b.writeToParcel(dest, i);
        FormServerError formServerError = this.f78709c;
        if (formServerError == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            formServerError.writeToParcel(dest, i);
        }
    }
}
