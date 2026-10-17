package com.revolut.feature_retail_user_declarations.risk_assessment.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_retail_user_declarations/risk_assessment/screen/RiskAssessmentScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RiskAssessmentScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RiskAssessmentScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rbl.a f97731a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RiskAssessmentScreenContract$InputData(rbl.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RiskAssessmentScreenContract$InputData[i];
        }
    }

    public RiskAssessmentScreenContract$InputData() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof RiskAssessmentScreenContract$InputData) && this.f97731a == ((RiskAssessmentScreenContract$InputData) obj2).f97731a;
    }

    public final int hashCode() {
        return this.f97731a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97731a.name());
    }

    public RiskAssessmentScreenContract$InputData(rbl.a backNavigationType) {
        Intrinsics.checkNotNullParameter(backNavigationType, "backNavigationType");
        this.f97731a = backNavigationType;
    }

    public /* synthetic */ RiskAssessmentScreenContract$InputData(int i) {
        this(rbl.a.NONE);
    }
}
