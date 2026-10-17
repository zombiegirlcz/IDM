package com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_credit.impl.data.model.coverages.CoverageDetailsLayout;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_credit/impl/ui/screen/coverage_details/CoverageDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CoverageDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CoverageDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoverageDetailsLayout f75826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75827c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CoverageDetailsScreenContract$InputData(parcel.readString(), CoverageDetailsLayout.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CoverageDetailsScreenContract$InputData[i];
        }
    }

    public CoverageDetailsScreenContract$InputData(String policyId, CoverageDetailsLayout layout, String str) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f75825a = policyId;
        this.f75826b = layout;
        this.f75827c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CoverageDetailsScreenContract$InputData)) {
            return false;
        }
        CoverageDetailsScreenContract$InputData coverageDetailsScreenContract$InputData = (CoverageDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75825a, coverageDetailsScreenContract$InputData.f75825a) && Intrinsics.f(this.f75826b, coverageDetailsScreenContract$InputData.f75826b) && Intrinsics.f(this.f75827c, coverageDetailsScreenContract$InputData.f75827c);
    }

    public final int hashCode() {
        int iHashCode = (this.f75826b.hashCode() + (this.f75825a.hashCode() * 31)) * 31;
        String str = this.f75827c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75825a);
        this.f75826b.writeToParcel(dest, i);
        dest.writeString(this.f75827c);
    }
}
