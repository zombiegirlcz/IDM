package com.revolut.feature.learn.shared.impl.ui.lesson;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u09.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/learn/shared/impl/ui/lesson/LessonScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LessonScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LessonScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f78017b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LessonScreenContract$InputData(parcel.readString(), v.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LessonScreenContract$InputData[i];
        }
    }

    public LessonScreenContract$InputData(String lessonId, v domain) {
        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.f78016a = lessonId;
        this.f78017b = domain;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LessonScreenContract$InputData)) {
            return false;
        }
        LessonScreenContract$InputData lessonScreenContract$InputData = (LessonScreenContract$InputData) obj2;
        return Intrinsics.f(this.f78016a, lessonScreenContract$InputData.f78016a) && this.f78017b == lessonScreenContract$InputData.f78017b;
    }

    public final int hashCode() {
        return this.f78017b.hashCode() + (this.f78016a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78016a);
        dest.writeString(this.f78017b.name());
    }
}
