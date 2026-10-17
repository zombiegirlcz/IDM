package com.revolut.core.ui_kit.internal.views.timer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/timer/TimerViewLabels;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TimerViewLabels implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TimerViewLabels> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f57676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f57677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f57678c;
    public final Clause d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TimerViewLabels((Clause) parcel.readParcelable(TimerViewLabels.class.getClassLoader()), (Clause) parcel.readParcelable(TimerViewLabels.class.getClassLoader()), (Clause) parcel.readParcelable(TimerViewLabels.class.getClassLoader()), (Clause) parcel.readParcelable(TimerViewLabels.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TimerViewLabels[i];
        }
    }

    public TimerViewLabels(Clause clause, Clause clause2, Clause clause3, Clause clause4) {
        this.f57676a = clause;
        this.f57677b = clause2;
        this.f57678c = clause3;
        this.d = clause4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TimerViewLabels)) {
            return false;
        }
        TimerViewLabels timerViewLabels = (TimerViewLabels) obj2;
        return Intrinsics.f(this.f57676a, timerViewLabels.f57676a) && Intrinsics.f(this.f57677b, timerViewLabels.f57677b) && Intrinsics.f(this.f57678c, timerViewLabels.f57678c) && Intrinsics.f(this.d, timerViewLabels.d);
    }

    public final int hashCode() {
        Clause clause = this.f57676a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f57677b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.f57678c;
        int iHashCode3 = (iHashCode2 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Clause clause4 = this.d;
        return iHashCode3 + (clause4 != null ? clause4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f57676a, i);
        dest.writeParcelable(this.f57677b, i);
        dest.writeParcelable(this.f57678c, i);
        dest.writeParcelable(this.d, i);
    }

    public TimerViewLabels() {
        this(null, null, null, null);
    }
}
