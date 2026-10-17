package com.revolut.feature.freelancer.impl.ui.invoice.templates.override;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplateOverride;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/invoice/templates/override/InvoiceTemplateOverrideScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvoiceTemplateOverrideScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InvoiceTemplateOverrideScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoiceTemplate f73969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvoiceTemplateOverride f73970b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvoiceTemplateOverrideScreenContract$InputData((InvoiceTemplate) parcel.readParcelable(InvoiceTemplateOverrideScreenContract$InputData.class.getClassLoader()), (InvoiceTemplateOverride) parcel.readParcelable(InvoiceTemplateOverrideScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvoiceTemplateOverrideScreenContract$InputData[i];
        }
    }

    public InvoiceTemplateOverrideScreenContract$InputData(InvoiceTemplate template, InvoiceTemplateOverride invoiceTemplateOverride) {
        Intrinsics.checkNotNullParameter(template, "template");
        this.f73969a = template;
        this.f73970b = invoiceTemplateOverride;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvoiceTemplateOverrideScreenContract$InputData)) {
            return false;
        }
        InvoiceTemplateOverrideScreenContract$InputData invoiceTemplateOverrideScreenContract$InputData = (InvoiceTemplateOverrideScreenContract$InputData) obj2;
        return Intrinsics.f(this.f73969a, invoiceTemplateOverrideScreenContract$InputData.f73969a) && Intrinsics.f(this.f73970b, invoiceTemplateOverrideScreenContract$InputData.f73970b);
    }

    public final int hashCode() {
        int iHashCode = this.f73969a.hashCode() * 31;
        InvoiceTemplateOverride invoiceTemplateOverride = this.f73970b;
        return iHashCode + (invoiceTemplateOverride == null ? 0 : invoiceTemplateOverride.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f73969a, i);
        dest.writeParcelable(this.f73970b, i);
    }
}
