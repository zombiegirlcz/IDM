package com.revolut.feature.freelancer.impl.ui.invoice.templates.flow;

import android.os.Parcel;
import android.os.Parcelable;
import bz6.d;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/invoice/templates/flow/InvoiceTemplatesFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvoiceTemplatesFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InvoiceTemplatesFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f73962b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvoiceTemplatesFlowContract$InputData(parcel.readString(), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvoiceTemplatesFlowContract$InputData[i];
        }
    }

    public InvoiceTemplatesFlowContract$InputData(String str, d templateMode) {
        Intrinsics.checkNotNullParameter(templateMode, "templateMode");
        this.f73961a = str;
        this.f73962b = templateMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvoiceTemplatesFlowContract$InputData)) {
            return false;
        }
        InvoiceTemplatesFlowContract$InputData invoiceTemplatesFlowContract$InputData = (InvoiceTemplatesFlowContract$InputData) obj2;
        return Intrinsics.f(this.f73961a, invoiceTemplatesFlowContract$InputData.f73961a) && this.f73962b == invoiceTemplatesFlowContract$InputData.f73962b;
    }

    public final int hashCode() {
        String str = this.f73961a;
        return this.f73962b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73961a);
        dest.writeString(this.f73962b.name());
    }
}
