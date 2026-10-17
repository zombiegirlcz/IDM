package com.revolut.feature.shared.invoices.impl.ui.invoice_preview;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t9d.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared/invoices/impl/ui/invoice_preview/InvoicePreviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_invoices_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvoicePreviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InvoicePreviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f86423b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(d.valueOf(parcel.readString()));
            }
            return new InvoicePreviewScreenContract$InputData(string, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvoicePreviewScreenContract$InputData[i];
        }
    }

    public InvoicePreviewScreenContract$InputData(String invoiceId, Set visibleTypes) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        Intrinsics.checkNotNullParameter(visibleTypes, "visibleTypes");
        this.f86422a = invoiceId;
        this.f86423b = visibleTypes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvoicePreviewScreenContract$InputData)) {
            return false;
        }
        InvoicePreviewScreenContract$InputData invoicePreviewScreenContract$InputData = (InvoicePreviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f86422a, invoicePreviewScreenContract$InputData.f86422a) && Intrinsics.f(this.f86423b, invoicePreviewScreenContract$InputData.f86423b);
    }

    public final int hashCode() {
        return this.f86423b.hashCode() + (this.f86422a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86422a);
        Iterator itV = n.v(this.f86423b, dest);
        while (itV.hasNext()) {
            dest.writeString(((d) itV.next()).name());
        }
    }
}
