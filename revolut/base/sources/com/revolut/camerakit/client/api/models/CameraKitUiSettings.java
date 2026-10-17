package com.revolut.camerakit.client.api.models;

import android.R;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.camerakit.client.api.models.AnimationType;
import com.revolut.camerakit.ui.models.Mask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/client/api/models/CameraKitUiSettings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "camera_kit_client_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CameraKitUiSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CameraKitUiSettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mask f50709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HintMessage f50711c;
    public final AnimationType d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CameraKitUiSettings((Mask) parcel.readParcelable(CameraKitUiSettings.class.getClassLoader()), parcel.readInt(), (HintMessage) parcel.readParcelable(CameraKitUiSettings.class.getClassLoader()), (AnimationType) parcel.readParcelable(CameraKitUiSettings.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CameraKitUiSettings[i];
        }
    }

    public CameraKitUiSettings(Mask mask, int i, HintMessage hintMessage, AnimationType animationType) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        this.f50709a = mask;
        this.f50710b = i;
        this.f50711c = hintMessage;
        this.d = animationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CameraKitUiSettings)) {
            return false;
        }
        CameraKitUiSettings cameraKitUiSettings = (CameraKitUiSettings) obj2;
        return Intrinsics.f(this.f50709a, cameraKitUiSettings.f50709a) && this.f50710b == cameraKitUiSettings.f50710b && Intrinsics.f(this.f50711c, cameraKitUiSettings.f50711c) && Intrinsics.f(this.d, cameraKitUiSettings.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f50710b, this.f50709a.hashCode() * 31, 31);
        HintMessage hintMessage = this.f50711c;
        return this.d.hashCode() + ((iB + (hintMessage == null ? 0 : hintMessage.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f50709a, i);
        dest.writeInt(this.f50710b);
        dest.writeParcelable(this.f50711c, i);
        dest.writeParcelable(this.d, i);
    }

    public /* synthetic */ CameraKitUiSettings(Mask mask, HintMessage hintMessage, AnimationType animationType, int i) {
        this(mask, R.color.transparent, hintMessage, (i & 8) != 0 ? AnimationType.Scanning.f50691a : animationType);
    }
}
