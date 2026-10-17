package com.revolut.feature.feedback.impl.ui.screen.comment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/feedback/impl/ui/screen/comment/FeedbackCommentContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_feedback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeedbackCommentContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FeedbackCommentContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f73159c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeedbackCommentContract$InputData(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FeedbackCommentContract$InputData[i];
        }
    }

    public FeedbackCommentContract$InputData(int i, String feedbackId, Integer num) {
        Intrinsics.checkNotNullParameter(feedbackId, "feedbackId");
        this.f73157a = feedbackId;
        this.f73158b = i;
        this.f73159c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FeedbackCommentContract$InputData)) {
            return false;
        }
        FeedbackCommentContract$InputData feedbackCommentContract$InputData = (FeedbackCommentContract$InputData) obj2;
        return Intrinsics.f(this.f73157a, feedbackCommentContract$InputData.f73157a) && this.f73158b == feedbackCommentContract$InputData.f73158b && Intrinsics.f(this.f73159c, feedbackCommentContract$InputData.f73159c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f73158b, this.f73157a.hashCode() * 31, 31);
        Integer num = this.f73159c;
        return iB + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73157a);
        dest.writeInt(this.f73158b);
        Integer num = this.f73159c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
