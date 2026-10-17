package com.revolut.camerakit.revolut.ui.barcode.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.camerakit.ui.models.Mask;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/barcode/models/BarcodeReaderScreenSettings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BarcodeReaderScreenSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BarcodeReaderScreenSettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f50762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f50763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Mask f50764c;
    public final Regex d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BarcodeReaderScreenSettings((Clause) parcel.readParcelable(BarcodeReaderScreenSettings.class.getClassLoader()), (Clause) parcel.readParcelable(BarcodeReaderScreenSettings.class.getClassLoader()), (Mask) parcel.readParcelable(BarcodeReaderScreenSettings.class.getClassLoader()), (Regex) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BarcodeReaderScreenSettings[i];
        }
    }

    public BarcodeReaderScreenSettings(Clause title, Clause clause, Mask mask, Regex regex) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.f50762a = title;
        this.f50763b = clause;
        this.f50764c = mask;
        this.d = regex;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BarcodeReaderScreenSettings)) {
            return false;
        }
        BarcodeReaderScreenSettings barcodeReaderScreenSettings = (BarcodeReaderScreenSettings) obj2;
        return Intrinsics.f(this.f50762a, barcodeReaderScreenSettings.f50762a) && Intrinsics.f(this.f50763b, barcodeReaderScreenSettings.f50763b) && Intrinsics.f(this.f50764c, barcodeReaderScreenSettings.f50764c) && Intrinsics.f(this.d, barcodeReaderScreenSettings.d);
    }

    public final int hashCode() {
        int iHashCode = this.f50762a.hashCode() * 31;
        Clause clause = this.f50763b;
        int iHashCode2 = (this.f50764c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
        Regex regex = this.d;
        return iHashCode2 + (regex != null ? regex.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f50762a, i);
        dest.writeParcelable(this.f50763b, i);
        dest.writeParcelable(this.f50764c, i);
        dest.writeSerializable(this.d);
    }
}
