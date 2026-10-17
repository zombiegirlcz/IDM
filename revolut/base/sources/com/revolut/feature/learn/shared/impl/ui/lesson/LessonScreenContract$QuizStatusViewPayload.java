package com.revolut.feature.learn.shared.impl.ui.lesson;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.learn.shared.models.domain.LearnShareReward;
import com.revolut.feature.learn.shared.models.domain.LearnSubmitQuizNextStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u09.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/learn/shared/impl/ui/lesson/LessonScreenContract$QuizStatusViewPayload", "Landroid/os/Parcelable;", "", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LessonScreenContract$QuizStatusViewPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LessonScreenContract$QuizStatusViewPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LearnSubmitQuizNextStep f78018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f78020c;
    public final LearnShareReward d;
    public final List e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LearnSubmitQuizNextStep learnSubmitQuizNextStep = (LearnSubmitQuizNextStep) j6.a.f(parcel, "parcel", LessonScreenContract$QuizStatusViewPayload.class);
            String string = parcel.readString();
            v vVarValueOf = v.valueOf(parcel.readString());
            LearnShareReward learnShareReward = (LearnShareReward) parcel.readParcelable(LessonScreenContract$QuizStatusViewPayload.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(LessonScreenContract$QuizStatusViewPayload.class, parcel, arrayList2, iE, 1);
                }
                arrayList = arrayList2;
            }
            return new LessonScreenContract$QuizStatusViewPayload(learnSubmitQuizNextStep, string, vVarValueOf, learnShareReward, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LessonScreenContract$QuizStatusViewPayload[i];
        }
    }

    public LessonScreenContract$QuizStatusViewPayload(LearnSubmitQuizNextStep nextStep, String originalLessonId, v domain, LearnShareReward learnShareReward, List list) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        Intrinsics.checkNotNullParameter(originalLessonId, "originalLessonId");
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.f78018a = nextStep;
        this.f78019b = originalLessonId;
        this.f78020c = domain;
        this.d = learnShareReward;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LessonScreenContract$QuizStatusViewPayload)) {
            return false;
        }
        LessonScreenContract$QuizStatusViewPayload lessonScreenContract$QuizStatusViewPayload = (LessonScreenContract$QuizStatusViewPayload) obj2;
        return Intrinsics.f(this.f78018a, lessonScreenContract$QuizStatusViewPayload.f78018a) && Intrinsics.f(this.f78019b, lessonScreenContract$QuizStatusViewPayload.f78019b) && this.f78020c == lessonScreenContract$QuizStatusViewPayload.f78020c && Intrinsics.f(this.d, lessonScreenContract$QuizStatusViewPayload.d) && Intrinsics.f(this.e, lessonScreenContract$QuizStatusViewPayload.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f78020c.hashCode() + p.a.c(this.f78018a.hashCode() * 31, 31, this.f78019b)) * 31;
        LearnShareReward learnShareReward = this.d;
        int iHashCode2 = (iHashCode + (learnShareReward == null ? 0 : learnShareReward.hashCode())) * 31;
        List list = this.e;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78018a, i);
        dest.writeString(this.f78019b);
        dest.writeString(this.f78020c.name());
        dest.writeParcelable(this.d, i);
        List list = this.e;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeParcelable((Parcelable) itQ.next(), i);
        }
    }
}
