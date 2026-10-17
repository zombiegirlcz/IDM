package com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import k4l.c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/impl/ui/screens/composite_add_money/schedule/ScheduleScreenContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScheduleScreenContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ScheduleScreenContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f95599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f95600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f95601c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScheduleScreenContract$Input((LocalDate) parcel.readSerializable(), c0.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScheduleScreenContract$Input[i];
        }
    }

    public ScheduleScreenContract$Input(LocalDate date, c0 period, boolean z) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f95599a = date;
        this.f95600b = period;
        this.f95601c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScheduleScreenContract$Input)) {
            return false;
        }
        ScheduleScreenContract$Input scheduleScreenContract$Input = (ScheduleScreenContract$Input) obj2;
        return Intrinsics.f(this.f95599a, scheduleScreenContract$Input.f95599a) && this.f95600b == scheduleScreenContract$Input.f95600b && this.f95601c == scheduleScreenContract$Input.f95601c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f95601c) + ((this.f95600b.hashCode() + (this.f95599a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f95599a);
        dest.writeString(this.f95600b.name());
        dest.writeInt(this.f95601c ? 1 : 0);
    }
}
