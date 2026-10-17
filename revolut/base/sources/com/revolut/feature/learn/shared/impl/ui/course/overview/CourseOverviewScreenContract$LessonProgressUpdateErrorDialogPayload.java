package com.revolut.feature.learn.shared.impl.ui.course.overview;

import android.os.Parcel;
import android.os.Parcelable;
import i09.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u09.q;
import u09.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "i09/k", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CourseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CourseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseOverviewScreenContract$LessonProgressUpdateResult f77983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f77984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f77985c;
    public final k d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CourseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload((CourseOverviewScreenContract$LessonProgressUpdateResult) parcel.readParcelable(CourseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload.class.getClassLoader()), v.valueOf(parcel.readString()), (q) parcel.readValue(CourseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload.class.getClassLoader()), parcel.readInt() == 0 ? null : k.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CourseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload[i];
        }
    }

    public CourseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload(CourseOverviewScreenContract$LessonProgressUpdateResult updateResult, v domain, q lesson, k kVar) {
        Intrinsics.checkNotNullParameter(updateResult, "updateResult");
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(lesson, "lesson");
        this.f77983a = updateResult;
        this.f77984b = domain;
        this.f77985c = lesson;
        this.d = kVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CourseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload)) {
            return false;
        }
        CourseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload courseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload = (CourseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload) obj2;
        return Intrinsics.f(this.f77983a, courseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload.f77983a) && this.f77984b == courseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload.f77984b && Intrinsics.f(this.f77985c, courseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload.f77985c) && this.d == courseOverviewScreenContract$LessonProgressUpdateErrorDialogPayload.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f77985c.hashCode() + ((this.f77984b.hashCode() + (this.f77983a.hashCode() * 31)) * 31)) * 31;
        k kVar = this.d;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f77983a, i);
        dest.writeString(this.f77984b.name());
        dest.writeValue(this.f77985c);
        k kVar = this.d;
        if (kVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(kVar.name());
        }
    }
}
