package com.revolut.core.mobile_services.api.mlkit.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/mobile_services/api/mlkit/vision/barcode/MsBarcodeDetectorSettings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "mobile_services_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MsBarcodeDetectorSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MsBarcodeDetectorSettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bh0.a f51393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f51394b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            bh0.a aVarValueOf = bh0.a.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(bh0.a.valueOf(parcel.readString()));
            }
            return new MsBarcodeDetectorSettings(aVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsBarcodeDetectorSettings[i];
        }
    }

    public MsBarcodeDetectorSettings(bh0.a mainFormat, List additionalFormats) {
        Intrinsics.checkNotNullParameter(mainFormat, "mainFormat");
        Intrinsics.checkNotNullParameter(additionalFormats, "additionalFormats");
        this.f51393a = mainFormat;
        this.f51394b = additionalFormats;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MsBarcodeDetectorSettings)) {
            return false;
        }
        MsBarcodeDetectorSettings msBarcodeDetectorSettings = (MsBarcodeDetectorSettings) obj2;
        return this.f51393a == msBarcodeDetectorSettings.f51393a && Intrinsics.f(this.f51394b, msBarcodeDetectorSettings.f51394b);
    }

    public final int hashCode() {
        return this.f51394b.hashCode() + (this.f51393a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51393a.name());
        Iterator itV = p.a.v(this.f51394b, dest);
        while (itV.hasNext()) {
            dest.writeString(((bh0.a) itV.next()).name());
        }
    }

    public MsBarcodeDetectorSettings(bh0.a aVar) {
        this(aVar, f0.f322471a);
    }
}
