package com.revolut.feature.feedback.api.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/feedback/api/flow/OneClickFeedbackFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "OneClickFeedback", "Comment", "Lcom/revolut/feature/feedback/api/flow/OneClickFeedbackFlowContract$InputData$Comment;", "Lcom/revolut/feature/feedback/api/flow/OneClickFeedbackFlowContract$InputData$OneClickFeedback;", "feature_feedback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OneClickFeedbackFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/feedback/api/flow/OneClickFeedbackFlowContract$InputData$Comment;", "Lcom/revolut/feature/feedback/api/flow/OneClickFeedbackFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_feedback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Comment extends OneClickFeedbackFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Comment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73139b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Comment(parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Comment[i];
            }
        }

        public Comment(String feedbackId, int i) {
            Intrinsics.checkNotNullParameter(feedbackId, "feedbackId");
            this.f73138a = feedbackId;
            this.f73139b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Comment)) {
                return false;
            }
            Comment comment = (Comment) obj2;
            return Intrinsics.f(this.f73138a, comment.f73138a) && this.f73139b == comment.f73139b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f73139b) + (this.f73138a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73138a);
            dest.writeInt(this.f73139b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/feedback/api/flow/OneClickFeedbackFlowContract$InputData$OneClickFeedback;", "Lcom/revolut/feature/feedback/api/flow/OneClickFeedbackFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_feedback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OneClickFeedback extends OneClickFeedbackFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<OneClickFeedback> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ParcelableDestination f73141b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OneClickFeedback((ParcelableDestination) parcel.readParcelable(OneClickFeedback.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OneClickFeedback[i];
            }
        }

        public OneClickFeedback(ParcelableDestination parcelableDestination, String referenceId) {
            Intrinsics.checkNotNullParameter(referenceId, "referenceId");
            this.f73140a = referenceId;
            this.f73141b = parcelableDestination;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OneClickFeedback)) {
                return false;
            }
            OneClickFeedback oneClickFeedback = (OneClickFeedback) obj2;
            return Intrinsics.f(this.f73140a, oneClickFeedback.f73140a) && Intrinsics.f(this.f73141b, oneClickFeedback.f73141b);
        }

        public final int hashCode() {
            int iHashCode = this.f73140a.hashCode() * 31;
            ParcelableDestination parcelableDestination = this.f73141b;
            return iHashCode + (parcelableDestination == null ? 0 : parcelableDestination.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73140a);
            dest.writeParcelable(this.f73141b, i);
        }
    }

    private OneClickFeedbackFlowContract$InputData() {
    }
}
