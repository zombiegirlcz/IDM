package com.revolut.feature.settings.preview.displayAmount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/settings/preview/displayAmount/DisplayAmountToggleControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_settings_preview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DisplayAmountToggleControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DisplayAmountToggleControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f86026b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DisplayAmountToggleControllerContract$InputData(parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DisplayAmountToggleControllerContract$InputData[i];
        }
    }

    public DisplayAmountToggleControllerContract$InputData(String facilityId, b currency) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f86025a = facilityId;
        this.f86026b = currency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DisplayAmountToggleControllerContract$InputData)) {
            return false;
        }
        DisplayAmountToggleControllerContract$InputData displayAmountToggleControllerContract$InputData = (DisplayAmountToggleControllerContract$InputData) obj2;
        return Intrinsics.f(this.f86025a, displayAmountToggleControllerContract$InputData.f86025a) && Intrinsics.f(this.f86026b, displayAmountToggleControllerContract$InputData.f86026b);
    }

    public final int hashCode() {
        return this.f86026b.hashCode() + (this.f86025a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86025a);
        dest.writeSerializable(this.f86026b);
    }
}
