package com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ds6.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/assessment/assessment/TaxHubAssessmentScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxHubAssessmentScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxHubAssessmentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f74236b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxHubAssessmentScreenContract$InputData(j.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxHubAssessmentScreenContract$InputData[i];
        }
    }

    public TaxHubAssessmentScreenContract$InputData(j taxType, String taxCalendarEventId) {
        Intrinsics.checkNotNullParameter(taxCalendarEventId, "taxCalendarEventId");
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        this.f74235a = taxCalendarEventId;
        this.f74236b = taxType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxHubAssessmentScreenContract$InputData)) {
            return false;
        }
        TaxHubAssessmentScreenContract$InputData taxHubAssessmentScreenContract$InputData = (TaxHubAssessmentScreenContract$InputData) obj2;
        return Intrinsics.f(this.f74235a, taxHubAssessmentScreenContract$InputData.f74235a) && this.f74236b == taxHubAssessmentScreenContract$InputData.f74236b;
    }

    public final int hashCode() {
        return this.f74236b.hashCode() + (this.f74235a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74235a);
        dest.writeString(this.f74236b.name());
    }
}
