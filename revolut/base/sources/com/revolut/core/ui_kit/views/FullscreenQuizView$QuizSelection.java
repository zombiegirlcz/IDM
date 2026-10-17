package com.revolut.core.ui_kit.views;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.h7;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/core/ui_kit/views/FullscreenQuizView$QuizSelection", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FullscreenQuizView$QuizSelection implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FullscreenQuizView$QuizSelection> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h7 f58624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f58625c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FullscreenQuizView$QuizSelection(parcel.readString(), h7.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FullscreenQuizView$QuizSelection[i];
        }
    }

    public FullscreenQuizView$QuizSelection(String questionId, h7 answerType, String answerId) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(answerType, "answerType");
        Intrinsics.checkNotNullParameter(answerId, "answerId");
        this.f58623a = questionId;
        this.f58624b = answerType;
        this.f58625c = answerId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FullscreenQuizView$QuizSelection)) {
            return false;
        }
        FullscreenQuizView$QuizSelection fullscreenQuizView$QuizSelection = (FullscreenQuizView$QuizSelection) obj2;
        return Intrinsics.f(this.f58623a, fullscreenQuizView$QuizSelection.f58623a) && this.f58624b == fullscreenQuizView$QuizSelection.f58624b && Intrinsics.f(this.f58625c, fullscreenQuizView$QuizSelection.f58625c);
    }

    public final int hashCode() {
        return this.f58625c.hashCode() + ((this.f58624b.hashCode() + (this.f58623a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f58623a);
        dest.writeString(this.f58624b.name());
        dest.writeString(this.f58625c);
    }
}
