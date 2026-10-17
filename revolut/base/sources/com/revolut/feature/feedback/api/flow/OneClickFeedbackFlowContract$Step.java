package com.revolut.feature.feedback.api.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/feedback/api/flow/OneClickFeedbackFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "OneClickFeedback", "Comment", "Lcom/revolut/feature/feedback/api/flow/OneClickFeedbackFlowContract$Step$Comment;", "Lcom/revolut/feature/feedback/api/flow/OneClickFeedbackFlowContract$Step$OneClickFeedback;", "feature_feedback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OneClickFeedbackFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/feedback/api/flow/OneClickFeedbackFlowContract$Step$Comment;", "Lcom/revolut/feature/feedback/api/flow/OneClickFeedbackFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_feedback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Comment extends OneClickFeedbackFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Comment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f73144c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Comment(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Comment[i];
            }
        }

        public Comment(int i, String feedbackId, Integer num) {
            Intrinsics.checkNotNullParameter(feedbackId, "feedbackId");
            this.f73142a = feedbackId;
            this.f73143b = i;
            this.f73144c = num;
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
            return Intrinsics.f(this.f73142a, comment.f73142a) && this.f73143b == comment.f73143b && Intrinsics.f(this.f73144c, comment.f73144c);
        }

        public final int hashCode() {
            int iB = j6.a.b(this.f73143b, this.f73142a.hashCode() * 31, 31);
            Integer num = this.f73144c;
            return iB + (num == null ? 0 : num.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73142a);
            dest.writeInt(this.f73143b);
            Integer num = this.f73144c;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/feedback/api/flow/OneClickFeedbackFlowContract$Step$OneClickFeedback;", "Lcom/revolut/feature/feedback/api/flow/OneClickFeedbackFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_feedback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OneClickFeedback extends OneClickFeedbackFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OneClickFeedback> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73145a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OneClickFeedback(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OneClickFeedback[i];
            }
        }

        public OneClickFeedback(String referenceId) {
            Intrinsics.checkNotNullParameter(referenceId, "referenceId");
            this.f73145a = referenceId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OneClickFeedback) && Intrinsics.f(this.f73145a, ((OneClickFeedback) obj2).f73145a);
        }

        public final int hashCode() {
            return this.f73145a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73145a);
        }
    }

    private OneClickFeedbackFlowContract$Step() {
    }
}
