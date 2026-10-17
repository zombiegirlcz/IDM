package com.revolut.feature.learn.shared.impl.ui.course.overview;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateResult", "Landroid/os/Parcelable;", "<init>", "()V", "Success", "OfflineError", "OtherError", "BookingWarning", "BookingError", "Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateResult$BookingError;", "Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateResult$BookingWarning;", "Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateResult$OfflineError;", "Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateResult$OtherError;", "Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateResult$Success;", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CourseOverviewScreenContract$LessonProgressUpdateResult implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateResult$BookingError;", "Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateResult;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookingError extends CourseOverviewScreenContract$LessonProgressUpdateResult {

        @NotNull
        public static final Parcelable.Creator<BookingError> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77987b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BookingError(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BookingError[i];
            }
        }

        public BookingError(String str, String str2) {
            this.f77986a = str;
            this.f77987b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BookingError)) {
                return false;
            }
            BookingError bookingError = (BookingError) obj2;
            return Intrinsics.f(this.f77986a, bookingError.f77986a) && Intrinsics.f(this.f77987b, bookingError.f77987b);
        }

        public final int hashCode() {
            String str = this.f77986a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f77987b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77986a);
            dest.writeString(this.f77987b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateResult$BookingWarning;", "Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateResult;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BookingWarning extends CourseOverviewScreenContract$LessonProgressUpdateResult {

        @NotNull
        public static final Parcelable.Creator<BookingWarning> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77989b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BookingWarning(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BookingWarning[i];
            }
        }

        public BookingWarning(String str, String str2) {
            this.f77988a = str;
            this.f77989b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BookingWarning)) {
                return false;
            }
            BookingWarning bookingWarning = (BookingWarning) obj2;
            return Intrinsics.f(this.f77988a, bookingWarning.f77988a) && Intrinsics.f(this.f77989b, bookingWarning.f77989b);
        }

        public final int hashCode() {
            String str = this.f77988a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f77989b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77988a);
            dest.writeString(this.f77989b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateResult$OfflineError;", "Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateResult;", "<init>", "()V", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OfflineError extends CourseOverviewScreenContract$LessonProgressUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OfflineError f77990a = new OfflineError();

        @NotNull
        public static final Parcelable.Creator<OfflineError> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OfflineError.f77990a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OfflineError[i];
            }
        }

        private OfflineError() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateResult$OtherError;", "Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateResult;", "<init>", "()V", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OtherError extends CourseOverviewScreenContract$LessonProgressUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OtherError f77991a = new OtherError();

        @NotNull
        public static final Parcelable.Creator<OtherError> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OtherError.f77991a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OtherError[i];
            }
        }

        private OtherError() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateResult$Success;", "Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateResult;", "<init>", "()V", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Success extends CourseOverviewScreenContract$LessonProgressUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Success f77992a = new Success();

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Success.f77992a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        private Success() {
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

    private CourseOverviewScreenContract$LessonProgressUpdateResult() {
    }
}
