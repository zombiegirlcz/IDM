package com.revolut.feature.learn.shared.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/learn/shared/models/domain/LearnSubmitQuizNextStep;", "Landroid/os/Parcelable;", "<init>", "()V", "Lesson", "Course", "None", "Lcom/revolut/feature/learn/shared/models/domain/LearnSubmitQuizNextStep$Course;", "Lcom/revolut/feature/learn/shared/models/domain/LearnSubmitQuizNextStep$Lesson;", "Lcom/revolut/feature/learn/shared/models/domain/LearnSubmitQuizNextStep$None;", "feature_learn_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LearnSubmitQuizNextStep implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/learn/shared/models/domain/LearnSubmitQuizNextStep$Course;", "Lcom/revolut/feature/learn/shared/models/domain/LearnSubmitQuizNextStep;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Course extends LearnSubmitQuizNextStep {

        @NotNull
        public static final Parcelable.Creator<Course> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78036a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Course(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Course[i];
            }
        }

        public Course(String courseId) {
            Intrinsics.checkNotNullParameter(courseId, "courseId");
            this.f78036a = courseId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Course) && Intrinsics.f(this.f78036a, ((Course) obj2).f78036a);
        }

        public final int hashCode() {
            return this.f78036a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78036a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/learn/shared/models/domain/LearnSubmitQuizNextStep$Lesson;", "Lcom/revolut/feature/learn/shared/models/domain/LearnSubmitQuizNextStep;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Lesson extends LearnSubmitQuizNextStep {

        @NotNull
        public static final Parcelable.Creator<Lesson> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78037a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Lesson(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Lesson[i];
            }
        }

        public Lesson(String lessonId) {
            Intrinsics.checkNotNullParameter(lessonId, "lessonId");
            this.f78037a = lessonId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Lesson) && Intrinsics.f(this.f78037a, ((Lesson) obj2).f78037a);
        }

        public final int hashCode() {
            return this.f78037a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78037a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/learn/shared/models/domain/LearnSubmitQuizNextStep$None;", "Lcom/revolut/feature/learn/shared/models/domain/LearnSubmitQuizNextStep;", "<init>", "()V", "feature_learn_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class None extends LearnSubmitQuizNextStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f78038a = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.f78038a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new None[i];
            }
        }

        private None() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private LearnSubmitQuizNextStep() {
    }
}
