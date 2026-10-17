package com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.core.api.model.BillTransferDataV2;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_bills_taxes/impl/ui_payment/form/review/FormReviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FormReviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FormReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f78787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillTransferDataV2 f78788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PaymentData f78789c;
    public final ArrayList d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            g gVarValueOf = g.valueOf(parcel.readString());
            BillTransferDataV2 billTransferDataV2 = (BillTransferDataV2) parcel.readParcelable(FormReviewScreenContract$InputData.class.getClassLoader());
            PaymentData paymentDataCreateFromParcel = PaymentData.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(FormReviewScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new FormReviewScreenContract$InputData(gVarValueOf, billTransferDataV2, paymentDataCreateFromParcel, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FormReviewScreenContract$InputData[i];
        }
    }

    public FormReviewScreenContract$InputData(g paymentMethod, BillTransferDataV2 transferData, PaymentData paymentData, ArrayList fields, String str) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f78787a = paymentMethod;
        this.f78788b = transferData;
        this.f78789c = paymentData;
        this.d = fields;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FormReviewScreenContract$InputData)) {
            return false;
        }
        FormReviewScreenContract$InputData formReviewScreenContract$InputData = (FormReviewScreenContract$InputData) obj2;
        return this.f78787a == formReviewScreenContract$InputData.f78787a && Intrinsics.f(this.f78788b, formReviewScreenContract$InputData.f78788b) && Intrinsics.f(this.f78789c, formReviewScreenContract$InputData.f78789c) && this.d.equals(formReviewScreenContract$InputData.d) && Intrinsics.f(this.e, formReviewScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (this.f78789c.hashCode() + ((this.f78788b.hashCode() + (this.f78787a.hashCode() * 31)) * 31)) * 31, 31);
        String str = this.e;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78787a.name());
        dest.writeParcelable(this.f78788b, i);
        this.f78789c.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeString(this.e);
    }
}
