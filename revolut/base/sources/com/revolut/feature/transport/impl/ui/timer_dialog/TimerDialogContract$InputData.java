package com.revolut.feature.transport.impl.ui.timer_dialog;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transport/impl/ui/timer_dialog/TimerDialogContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TimerDialogContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TimerDialogContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f92557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f92558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f92559c;
    public final Clause d;
    public final Clause e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TimerDialogContract$InputData(parcel.readLong(), parcel.readLong(), (Clause) parcel.readParcelable(TimerDialogContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(TimerDialogContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(TimerDialogContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TimerDialogContract$InputData[i];
        }
    }

    public TimerDialogContract$InputData(long j2, long j3, Clause headerTitle, Clause headerDescription, Clause buttonText) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(headerDescription, "headerDescription");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f92557a = j2;
        this.f92558b = j3;
        this.f92559c = headerTitle;
        this.d = headerDescription;
        this.e = buttonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TimerDialogContract$InputData)) {
            return false;
        }
        TimerDialogContract$InputData timerDialogContract$InputData = (TimerDialogContract$InputData) obj2;
        return this.f92557a == timerDialogContract$InputData.f92557a && this.f92558b == timerDialogContract$InputData.f92558b && Intrinsics.f(this.f92559c, timerDialogContract$InputData.f92559c) && Intrinsics.f(this.d, timerDialogContract$InputData.d) && Intrinsics.f(this.e, timerDialogContract$InputData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.a(p.a.a(d.c(Long.hashCode(this.f92557a) * 31, 31, this.f92558b), 31, this.f92559c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f92557a);
        dest.writeLong(this.f92558b);
        dest.writeParcelable(this.f92559c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
