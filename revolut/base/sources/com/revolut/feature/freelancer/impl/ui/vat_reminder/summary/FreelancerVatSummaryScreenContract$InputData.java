package com.revolut.feature.freelancer.impl.ui.vat_reminder.summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubVatSummary;
import com.revolut.kompot.common.IOData$Input;
import es6.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/vat_reminder/summary/FreelancerVatSummaryScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerVatSummaryScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FreelancerVatSummaryScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f74446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaxHubVatSummary f74447b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerVatSummaryScreenContract$InputData(b.valueOf(parcel.readString()), (TaxHubVatSummary) parcel.readParcelable(FreelancerVatSummaryScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerVatSummaryScreenContract$InputData[i];
        }
    }

    public FreelancerVatSummaryScreenContract$InputData(b taxAllocationMode, TaxHubVatSummary vatSummary) {
        Intrinsics.checkNotNullParameter(taxAllocationMode, "taxAllocationMode");
        Intrinsics.checkNotNullParameter(vatSummary, "vatSummary");
        this.f74446a = taxAllocationMode;
        this.f74447b = vatSummary;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerVatSummaryScreenContract$InputData)) {
            return false;
        }
        FreelancerVatSummaryScreenContract$InputData freelancerVatSummaryScreenContract$InputData = (FreelancerVatSummaryScreenContract$InputData) obj2;
        return this.f74446a == freelancerVatSummaryScreenContract$InputData.f74446a && Intrinsics.f(this.f74447b, freelancerVatSummaryScreenContract$InputData.f74447b);
    }

    public final int hashCode() {
        return this.f74447b.hashCode() + (this.f74446a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74446a.name());
        dest.writeParcelable(this.f74447b, i);
    }
}
