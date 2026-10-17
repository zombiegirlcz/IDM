package com.revolut.camerakit.revolut.ui.barcodeqr.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.camerakit.ui.models.Mask;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/barcodeqr/models/BarcodeQrReaderScreenSettings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ButtonConfiguration", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BarcodeQrReaderScreenSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BarcodeQrReaderScreenSettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f50771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f50772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Mask f50773c;
    public final ButtonConfiguration d;
    public final ButtonConfiguration e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/camerakit/revolut/ui/barcodeqr/models/BarcodeQrReaderScreenSettings$ButtonConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "camera_kit_revolut_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ButtonConfiguration implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ButtonConfiguration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f50774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f50775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LargeActionButton.ButtonStyle f50776c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ButtonConfiguration((Clause) parcel.readParcelable(ButtonConfiguration.class.getClassLoader()), (Image) parcel.readParcelable(ButtonConfiguration.class.getClassLoader()), (LargeActionButton.ButtonStyle) parcel.readParcelable(ButtonConfiguration.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ButtonConfiguration[i];
            }
        }

        public ButtonConfiguration(Clause label, Image image, LargeActionButton.ButtonStyle style, String str) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f50774a = label;
            this.f50775b = image;
            this.f50776c = style;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ButtonConfiguration)) {
                return false;
            }
            ButtonConfiguration buttonConfiguration = (ButtonConfiguration) obj2;
            return Intrinsics.f(this.f50774a, buttonConfiguration.f50774a) && Intrinsics.f(this.f50775b, buttonConfiguration.f50775b) && Intrinsics.f(this.f50776c, buttonConfiguration.f50776c) && Intrinsics.f(this.d, buttonConfiguration.d);
        }

        public final int hashCode() {
            int iHashCode = this.f50774a.hashCode() * 31;
            Image image = this.f50775b;
            int iD = b.d(this.f50776c, (iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31);
            String str = this.d;
            return iD + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50774a, i);
            dest.writeParcelable(this.f50775b, i);
            dest.writeParcelable(this.f50776c, i);
            dest.writeString(this.d);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BarcodeQrReaderScreenSettings((Clause) parcel.readParcelable(BarcodeQrReaderScreenSettings.class.getClassLoader()), (Clause) parcel.readParcelable(BarcodeQrReaderScreenSettings.class.getClassLoader()), (Mask) parcel.readParcelable(BarcodeQrReaderScreenSettings.class.getClassLoader()), parcel.readInt() == 0 ? null : ButtonConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ButtonConfiguration.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BarcodeQrReaderScreenSettings[i];
        }
    }

    public BarcodeQrReaderScreenSettings(Clause title, Clause clause, Mask mask, ButtonConfiguration buttonConfiguration, ButtonConfiguration buttonConfiguration2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.f50771a = title;
        this.f50772b = clause;
        this.f50773c = mask;
        this.d = buttonConfiguration;
        this.e = buttonConfiguration2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BarcodeQrReaderScreenSettings)) {
            return false;
        }
        BarcodeQrReaderScreenSettings barcodeQrReaderScreenSettings = (BarcodeQrReaderScreenSettings) obj2;
        return Intrinsics.f(this.f50771a, barcodeQrReaderScreenSettings.f50771a) && Intrinsics.f(this.f50772b, barcodeQrReaderScreenSettings.f50772b) && Intrinsics.f(this.f50773c, barcodeQrReaderScreenSettings.f50773c) && Intrinsics.f(this.d, barcodeQrReaderScreenSettings.d) && Intrinsics.f(this.e, barcodeQrReaderScreenSettings.e);
    }

    public final int hashCode() {
        int iHashCode = this.f50771a.hashCode() * 31;
        Clause clause = this.f50772b;
        int iHashCode2 = (this.f50773c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
        ButtonConfiguration buttonConfiguration = this.d;
        int iHashCode3 = (iHashCode2 + (buttonConfiguration == null ? 0 : buttonConfiguration.hashCode())) * 31;
        ButtonConfiguration buttonConfiguration2 = this.e;
        return iHashCode3 + (buttonConfiguration2 != null ? buttonConfiguration2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f50771a, i);
        dest.writeParcelable(this.f50772b, i);
        dest.writeParcelable(this.f50773c, i);
        ButtonConfiguration buttonConfiguration = this.d;
        if (buttonConfiguration == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonConfiguration.writeToParcel(dest, i);
        }
        ButtonConfiguration buttonConfiguration2 = this.e;
        if (buttonConfiguration2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonConfiguration2.writeToParcel(dest, i);
        }
    }
}
