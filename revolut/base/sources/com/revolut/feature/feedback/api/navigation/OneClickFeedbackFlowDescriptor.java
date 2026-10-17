package com.revolut.feature.feedback.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.feedback.api.flow.OneClickFeedbackFlowContract$InputData;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import cp6.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/feedback/api/navigation/OneClickFeedbackFlowDescriptor;", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Lcp6/e;", "", "toString", "()Ljava/lang/String;", "feature_feedback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OneClickFeedbackFlowDescriptor implements ParcelableControllerDescriptor<e> {

    @NotNull
    public static final Parcelable.Creator<OneClickFeedbackFlowDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OneClickFeedbackFlowContract$InputData f73153a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneClickFeedbackFlowDescriptor((OneClickFeedbackFlowContract$InputData) parcel.readParcelable(OneClickFeedbackFlowDescriptor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OneClickFeedbackFlowDescriptor[i];
        }
    }

    public OneClickFeedbackFlowDescriptor(OneClickFeedbackFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f73153a = inputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof OneClickFeedbackFlowDescriptor) && Intrinsics.f(this.f73153a, ((OneClickFeedbackFlowDescriptor) obj2).f73153a);
    }

    public final int hashCode() {
        return this.f73153a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f73153a, i);
    }
}
