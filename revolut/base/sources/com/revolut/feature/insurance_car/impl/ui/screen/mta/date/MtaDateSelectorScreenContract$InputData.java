package com.revolut.feature.insurance_car.impl.ui.screen.mta.date;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.ZonedDateTime;
import kl7.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/mta/date/MtaDateSelectorScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MtaDateSelectorScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MtaDateSelectorScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f75530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f75532c;
    public final ZonedDateTime d;
    public final ZonedDateTime e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MtaDateSelectorScreenContract$InputData(a1.valueOf(parcel.readString()), parcel.readInt() != 0, (ZonedDateTime) parcel.readSerializable(), (ZonedDateTime) parcel.readSerializable(), (ZonedDateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MtaDateSelectorScreenContract$InputData[i];
        }
    }

    public MtaDateSelectorScreenContract$InputData(a1 mtaType, boolean z, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, ZonedDateTime zonedDateTime3) {
        Intrinsics.checkNotNullParameter(mtaType, "mtaType");
        this.f75530a = mtaType;
        this.f75531b = z;
        this.f75532c = zonedDateTime;
        this.d = zonedDateTime2;
        this.e = zonedDateTime3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MtaDateSelectorScreenContract$InputData)) {
            return false;
        }
        MtaDateSelectorScreenContract$InputData mtaDateSelectorScreenContract$InputData = (MtaDateSelectorScreenContract$InputData) obj2;
        return this.f75530a == mtaDateSelectorScreenContract$InputData.f75530a && this.f75531b == mtaDateSelectorScreenContract$InputData.f75531b && Intrinsics.f(this.f75532c, mtaDateSelectorScreenContract$InputData.f75532c) && Intrinsics.f(this.d, mtaDateSelectorScreenContract$InputData.d) && Intrinsics.f(this.e, mtaDateSelectorScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f75530a.hashCode() * 31, 31, this.f75531b);
        ZonedDateTime zonedDateTime = this.f75532c;
        int iHashCode = (iC + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.d;
        int iHashCode2 = (iHashCode + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        ZonedDateTime zonedDateTime3 = this.e;
        return iHashCode2 + (zonedDateTime3 != null ? zonedDateTime3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75530a.name());
        dest.writeInt(this.f75531b ? 1 : 0);
        dest.writeSerializable(this.f75532c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
