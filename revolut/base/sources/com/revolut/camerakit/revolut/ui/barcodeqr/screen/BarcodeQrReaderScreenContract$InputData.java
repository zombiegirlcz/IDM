package com.revolut.camerakit.revolut.ui.barcodeqr.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.camerakit.revolut.ui.barcodeqr.models.BarcodeQrReaderScreenSettings;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/camerakit/revolut/ui/barcodeqr/screen/BarcodeQrReaderScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BarcodeQrReaderScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BarcodeQrReaderScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarcodeQrReaderScreenSettings f50777a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BarcodeQrReaderScreenContract$InputData(BarcodeQrReaderScreenSettings.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BarcodeQrReaderScreenContract$InputData[i];
        }
    }

    public BarcodeQrReaderScreenContract$InputData(BarcodeQrReaderScreenSettings screenSettings) {
        Intrinsics.checkNotNullParameter(screenSettings, "screenSettings");
        this.f50777a = screenSettings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BarcodeQrReaderScreenContract$InputData) && Intrinsics.f(this.f50777a, ((BarcodeQrReaderScreenContract$InputData) obj2).f50777a);
    }

    public final int hashCode() {
        return this.f50777a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f50777a.writeToParcel(dest, i);
    }
}
