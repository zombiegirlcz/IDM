package com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_review_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/student_review_prompt/StudentReviewPromptScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StudentReviewPromptScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<StudentReviewPromptScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromptMarketingScreenContract$InputData f103641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f103642b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StudentReviewPromptScreenContract$InputData((PromptMarketingScreenContract$InputData) parcel.readParcelable(StudentReviewPromptScreenContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StudentReviewPromptScreenContract$InputData[i];
        }
    }

    public StudentReviewPromptScreenContract$InputData(PromptMarketingScreenContract$InputData promptData, String str) {
        Intrinsics.checkNotNullParameter(promptData, "promptData");
        this.f103641a = promptData;
        this.f103642b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StudentReviewPromptScreenContract$InputData)) {
            return false;
        }
        StudentReviewPromptScreenContract$InputData studentReviewPromptScreenContract$InputData = (StudentReviewPromptScreenContract$InputData) obj2;
        return Intrinsics.f(this.f103641a, studentReviewPromptScreenContract$InputData.f103641a) && Intrinsics.f(this.f103642b, studentReviewPromptScreenContract$InputData.f103642b);
    }

    public final int hashCode() {
        int iHashCode = this.f103641a.hashCode() * 31;
        String str = this.f103642b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f103641a, i);
        dest.writeString(this.f103642b);
    }
}
