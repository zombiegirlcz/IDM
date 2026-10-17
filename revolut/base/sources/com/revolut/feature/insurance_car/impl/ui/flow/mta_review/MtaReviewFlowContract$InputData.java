package com.revolut.feature.insurance_car.impl.ui.flow.mta_review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.MtaContent;
import com.revolut.feature.insurance_car.impl.data.model.MtaCreateResult;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/mta_review/MtaReviewFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MtaReviewFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MtaReviewFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MtaContent f75383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MtaCreateResult f75384c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MtaReviewFlowContract$InputData(parcel.readString(), MtaContent.CREATOR.createFromParcel(parcel), (MtaCreateResult) parcel.readParcelable(MtaReviewFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MtaReviewFlowContract$InputData[i];
        }
    }

    public MtaReviewFlowContract$InputData(String policyId, MtaContent mtaContent, MtaCreateResult mtaCreateResult) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(mtaContent, "mtaContent");
        Intrinsics.checkNotNullParameter(mtaCreateResult, "mtaCreateResult");
        this.f75382a = policyId;
        this.f75383b = mtaContent;
        this.f75384c = mtaCreateResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MtaReviewFlowContract$InputData)) {
            return false;
        }
        MtaReviewFlowContract$InputData mtaReviewFlowContract$InputData = (MtaReviewFlowContract$InputData) obj2;
        return Intrinsics.f(this.f75382a, mtaReviewFlowContract$InputData.f75382a) && Intrinsics.f(this.f75383b, mtaReviewFlowContract$InputData.f75383b) && Intrinsics.f(this.f75384c, mtaReviewFlowContract$InputData.f75384c);
    }

    public final int hashCode() {
        return this.f75384c.hashCode() + ((this.f75383b.hashCode() + (this.f75382a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75382a);
        this.f75383b.writeToParcel(dest, i);
        dest.writeParcelable(this.f75384c, i);
    }
}
