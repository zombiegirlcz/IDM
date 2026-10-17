package com.revolut.feature.transport.impl.ui.transit_checkout.date_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transport/impl/ui/transit_checkout/date_input/DateInputScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DateInputScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DateInputScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f92568b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DateInputScreenContract$InputData(parcel.readString(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DateInputScreenContract$InputData[i];
        }
    }

    public DateInputScreenContract$InputData(String title, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f92567a = title;
        this.f92568b = localDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DateInputScreenContract$InputData)) {
            return false;
        }
        DateInputScreenContract$InputData dateInputScreenContract$InputData = (DateInputScreenContract$InputData) obj2;
        return Intrinsics.f(this.f92567a, dateInputScreenContract$InputData.f92567a) && Intrinsics.f(this.f92568b, dateInputScreenContract$InputData.f92568b);
    }

    public final int hashCode() {
        int iHashCode = this.f92567a.hashCode() * 31;
        LocalDate localDate = this.f92568b;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92567a);
        dest.writeSerializable(this.f92568b);
    }
}
