package com.revolut.feature.freelancer.impl.ui.tax_hub.payment.recipient_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/payment/recipient_picker/TaxHubPaymentRecipientPickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxHubPaymentRecipientPickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxHubPaymentRecipientPickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f74330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f74331b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new TaxHubPaymentRecipientPickerScreenContract$InputData(arrayList, bVar);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxHubPaymentRecipientPickerScreenContract$InputData[i];
        }
    }

    public TaxHubPaymentRecipientPickerScreenContract$InputData(List taxBeneficiaries, b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(taxBeneficiaries, "taxBeneficiaries");
        this.f74330a = countryCode;
        this.f74331b = taxBeneficiaries;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxHubPaymentRecipientPickerScreenContract$InputData)) {
            return false;
        }
        TaxHubPaymentRecipientPickerScreenContract$InputData taxHubPaymentRecipientPickerScreenContract$InputData = (TaxHubPaymentRecipientPickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f74330a, taxHubPaymentRecipientPickerScreenContract$InputData.f74330a) && Intrinsics.f(this.f74331b, taxHubPaymentRecipientPickerScreenContract$InputData.f74331b);
    }

    public final int hashCode() {
        return this.f74331b.hashCode() + (this.f74330a.f297794a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f74330a);
        Iterator itV = p.a.v(this.f74331b, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
