package com.revolut.feature.learn.shared.impl.ui.course.overview;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u09.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CourseOverviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CourseOverviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f77981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77982c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CourseOverviewScreenContract$InputData(parcel.readString(), v.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CourseOverviewScreenContract$InputData[i];
        }
    }

    public CourseOverviewScreenContract$InputData(String courseId, v domain, String str) {
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.f77980a = courseId;
        this.f77981b = domain;
        this.f77982c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CourseOverviewScreenContract$InputData)) {
            return false;
        }
        CourseOverviewScreenContract$InputData courseOverviewScreenContract$InputData = (CourseOverviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f77980a, courseOverviewScreenContract$InputData.f77980a) && this.f77981b == courseOverviewScreenContract$InputData.f77981b && Intrinsics.f(this.f77982c, courseOverviewScreenContract$InputData.f77982c);
    }

    public final int hashCode() {
        int iHashCode = (this.f77981b.hashCode() + (this.f77980a.hashCode() * 31)) * 31;
        String str = this.f77982c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77980a);
        dest.writeString(this.f77981b.name());
        dest.writeString(this.f77982c);
    }
}
