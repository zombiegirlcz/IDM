package com.revolut.camerakit.ui.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/ui/models/QrCodeMaskModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "camera_kit_ui_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QrCodeMaskModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<QrCodeMaskModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f50850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f50851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f50852c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QrCodeMaskModel(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QrCodeMaskModel[i];
        }
    }

    public QrCodeMaskModel(float f, float f4, float f5) {
        this.f50850a = f;
        this.f50851b = f4;
        this.f50852c = f5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof QrCodeMaskModel)) {
            return false;
        }
        QrCodeMaskModel qrCodeMaskModel = (QrCodeMaskModel) obj2;
        return Float.compare(this.f50850a, qrCodeMaskModel.f50850a) == 0 && Float.compare(this.f50851b, qrCodeMaskModel.f50851b) == 0 && Float.compare(this.f50852c, qrCodeMaskModel.f50852c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f50852c) + b.b(this.f50851b, Float.hashCode(this.f50850a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeFloat(this.f50850a);
        dest.writeFloat(this.f50851b);
        dest.writeFloat(this.f50852c);
    }
}
