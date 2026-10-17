package com.revolut.feature.feedback.impl.ui.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yo6.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/feedback/impl/ui/screen/FeedbackContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_feedback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeedbackContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FeedbackContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f73155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParcelableDestination f73156c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeedbackContract$InputData(parcel.readString(), d.valueOf(parcel.readString()), (ParcelableDestination) parcel.readParcelable(FeedbackContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FeedbackContract$InputData[i];
        }
    }

    public FeedbackContract$InputData(String referenceId, d referenceType, ParcelableDestination parcelableDestination) {
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
        this.f73154a = referenceId;
        this.f73155b = referenceType;
        this.f73156c = parcelableDestination;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FeedbackContract$InputData)) {
            return false;
        }
        FeedbackContract$InputData feedbackContract$InputData = (FeedbackContract$InputData) obj2;
        return Intrinsics.f(this.f73154a, feedbackContract$InputData.f73154a) && this.f73155b == feedbackContract$InputData.f73155b && Intrinsics.f(this.f73156c, feedbackContract$InputData.f73156c);
    }

    public final int hashCode() {
        int iHashCode = (this.f73155b.hashCode() + (this.f73154a.hashCode() * 31)) * 31;
        ParcelableDestination parcelableDestination = this.f73156c;
        return iHashCode + (parcelableDestination == null ? 0 : parcelableDestination.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73154a);
        dest.writeString(this.f73155b.name());
        dest.writeParcelable(this.f73156c, i);
    }
}
