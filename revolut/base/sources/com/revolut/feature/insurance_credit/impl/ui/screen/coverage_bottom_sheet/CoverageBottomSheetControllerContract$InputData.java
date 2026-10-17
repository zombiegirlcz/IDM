package com.revolut.feature.insurance_credit.impl.ui.screen.coverage_bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_credit.impl.data.model.action.ShowCoverageDetailsAction;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_credit/impl/ui/screen/coverage_bottom_sheet/CoverageBottomSheetControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CoverageBottomSheetControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CoverageBottomSheetControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShowCoverageDetailsAction.BottomSheetContent f75824b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CoverageBottomSheetControllerContract$InputData(parcel.readString(), ShowCoverageDetailsAction.BottomSheetContent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CoverageBottomSheetControllerContract$InputData[i];
        }
    }

    public CoverageBottomSheetControllerContract$InputData(String policyId, ShowCoverageDetailsAction.BottomSheetContent model) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f75823a = policyId;
        this.f75824b = model;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CoverageBottomSheetControllerContract$InputData)) {
            return false;
        }
        CoverageBottomSheetControllerContract$InputData coverageBottomSheetControllerContract$InputData = (CoverageBottomSheetControllerContract$InputData) obj2;
        return Intrinsics.f(this.f75823a, coverageBottomSheetControllerContract$InputData.f75823a) && Intrinsics.f(this.f75824b, coverageBottomSheetControllerContract$InputData.f75824b);
    }

    public final int hashCode() {
        return this.f75824b.hashCode() + (this.f75823a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75823a);
        this.f75824b.writeToParcel(dest, i);
    }
}
