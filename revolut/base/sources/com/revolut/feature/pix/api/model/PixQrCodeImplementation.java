package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixQrCodeImplementation;", "Landroid/os/Parcelable;", "", "PIX", "PIX_RECURRING", "PIX_INSTANT_RECURRING", "PIX_LATER_ACCEPTANCE", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixQrCodeImplementation implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PixQrCodeImplementation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PixQrCodeImplementation> CREATOR;
    public static final PixQrCodeImplementation PIX;
    public static final PixQrCodeImplementation PIX_INSTANT_RECURRING;
    public static final PixQrCodeImplementation PIX_LATER_ACCEPTANCE;
    public static final PixQrCodeImplementation PIX_RECURRING;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PixQrCodeImplementation.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrCodeImplementation[i];
        }
    }

    static {
        PixQrCodeImplementation pixQrCodeImplementation = new PixQrCodeImplementation("PIX", 0);
        PIX = pixQrCodeImplementation;
        PixQrCodeImplementation pixQrCodeImplementation2 = new PixQrCodeImplementation("PIX_RECURRING", 1);
        PIX_RECURRING = pixQrCodeImplementation2;
        PixQrCodeImplementation pixQrCodeImplementation3 = new PixQrCodeImplementation("PIX_INSTANT_RECURRING", 2);
        PIX_INSTANT_RECURRING = pixQrCodeImplementation3;
        PixQrCodeImplementation pixQrCodeImplementation4 = new PixQrCodeImplementation("PIX_LATER_ACCEPTANCE", 3);
        PIX_LATER_ACCEPTANCE = pixQrCodeImplementation4;
        PixQrCodeImplementation[] pixQrCodeImplementationArr = {pixQrCodeImplementation, pixQrCodeImplementation2, pixQrCodeImplementation3, pixQrCodeImplementation4};
        $VALUES = pixQrCodeImplementationArr;
        $ENTRIES = s.n(pixQrCodeImplementationArr);
        CREATOR = new a();
    }

    public static PixQrCodeImplementation valueOf(String str) {
        return (PixQrCodeImplementation) Enum.valueOf(PixQrCodeImplementation.class, str);
    }

    public static PixQrCodeImplementation[] values() {
        return (PixQrCodeImplementation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
