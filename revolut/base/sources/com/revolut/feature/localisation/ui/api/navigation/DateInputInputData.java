package com.revolut.feature.localisation.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/localisation/ui/api/navigation/DateInputInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_localisation_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DateInputInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DateInputInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f78064b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DateInputInputData(parcel.readString(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DateInputInputData[i];
        }
    }

    public DateInputInputData(String title, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f78063a = title;
        this.f78064b = localDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DateInputInputData)) {
            return false;
        }
        DateInputInputData dateInputInputData = (DateInputInputData) obj2;
        return Intrinsics.f(this.f78063a, dateInputInputData.f78063a) && Intrinsics.f(this.f78064b, dateInputInputData.f78064b);
    }

    public final int hashCode() {
        int iHashCode = this.f78063a.hashCode() * 31;
        LocalDate localDate = this.f78064b;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78063a);
        dest.writeSerializable(this.f78064b);
    }
}
