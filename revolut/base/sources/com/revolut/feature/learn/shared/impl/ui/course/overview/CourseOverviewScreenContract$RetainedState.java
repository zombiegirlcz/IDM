package com.revolut.feature.learn.shared.impl.ui.course.overview;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/screen/ScreenStates$RetainedDomain;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CourseOverviewScreenContract$RetainedState implements ScreenStates$RetainedDomain {

    @NotNull
    public static final Parcelable.Creator<CourseOverviewScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f77993a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CourseOverviewScreenContract$RetainedState(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CourseOverviewScreenContract$RetainedState[i];
        }
    }

    public CourseOverviewScreenContract$RetainedState(boolean z) {
        this.f77993a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CourseOverviewScreenContract$RetainedState) && this.f77993a == ((CourseOverviewScreenContract$RetainedState) obj2).f77993a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77993a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f77993a ? 1 : 0);
    }
}
