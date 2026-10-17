package com.revolut.core.mobile_services.api.mlkit.vision.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/core/mobile_services/api/mlkit/vision/barcode/MsBarcodeType;", "Landroid/os/Parcelable;", "", "UNKNOWN", "CONTACT_INFO", "EMAIL", "ISBN", "PHONE", "PRODUCT", "SMS", "TEXT", "URL", "WIFI", "GEO", "CALENDAR_EVENT", "DRIVER_LICENSE", "mobile_services_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MsBarcodeType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MsBarcodeType[] $VALUES;
    public static final MsBarcodeType CALENDAR_EVENT;
    public static final MsBarcodeType CONTACT_INFO;

    @NotNull
    public static final Parcelable.Creator<MsBarcodeType> CREATOR;
    public static final MsBarcodeType DRIVER_LICENSE;
    public static final MsBarcodeType EMAIL;
    public static final MsBarcodeType GEO;
    public static final MsBarcodeType ISBN;
    public static final MsBarcodeType PHONE;
    public static final MsBarcodeType PRODUCT;
    public static final MsBarcodeType SMS;
    public static final MsBarcodeType TEXT;
    public static final MsBarcodeType UNKNOWN;
    public static final MsBarcodeType URL;
    public static final MsBarcodeType WIFI;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return MsBarcodeType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MsBarcodeType[i];
        }
    }

    static {
        MsBarcodeType msBarcodeType = new MsBarcodeType("UNKNOWN", 0);
        UNKNOWN = msBarcodeType;
        MsBarcodeType msBarcodeType2 = new MsBarcodeType("CONTACT_INFO", 1);
        CONTACT_INFO = msBarcodeType2;
        MsBarcodeType msBarcodeType3 = new MsBarcodeType("EMAIL", 2);
        EMAIL = msBarcodeType3;
        MsBarcodeType msBarcodeType4 = new MsBarcodeType("ISBN", 3);
        ISBN = msBarcodeType4;
        MsBarcodeType msBarcodeType5 = new MsBarcodeType("PHONE", 4);
        PHONE = msBarcodeType5;
        MsBarcodeType msBarcodeType6 = new MsBarcodeType("PRODUCT", 5);
        PRODUCT = msBarcodeType6;
        MsBarcodeType msBarcodeType7 = new MsBarcodeType("SMS", 6);
        SMS = msBarcodeType7;
        MsBarcodeType msBarcodeType8 = new MsBarcodeType("TEXT", 7);
        TEXT = msBarcodeType8;
        MsBarcodeType msBarcodeType9 = new MsBarcodeType("URL", 8);
        URL = msBarcodeType9;
        MsBarcodeType msBarcodeType10 = new MsBarcodeType("WIFI", 9);
        WIFI = msBarcodeType10;
        MsBarcodeType msBarcodeType11 = new MsBarcodeType("GEO", 10);
        GEO = msBarcodeType11;
        MsBarcodeType msBarcodeType12 = new MsBarcodeType("CALENDAR_EVENT", 11);
        CALENDAR_EVENT = msBarcodeType12;
        MsBarcodeType msBarcodeType13 = new MsBarcodeType("DRIVER_LICENSE", 12);
        DRIVER_LICENSE = msBarcodeType13;
        MsBarcodeType[] msBarcodeTypeArr = {msBarcodeType, msBarcodeType2, msBarcodeType3, msBarcodeType4, msBarcodeType5, msBarcodeType6, msBarcodeType7, msBarcodeType8, msBarcodeType9, msBarcodeType10, msBarcodeType11, msBarcodeType12, msBarcodeType13};
        $VALUES = msBarcodeTypeArr;
        $ENTRIES = s.n(msBarcodeTypeArr);
        CREATOR = new a();
    }

    public static MsBarcodeType valueOf(String str) {
        return (MsBarcodeType) Enum.valueOf(MsBarcodeType.class, str);
    }

    public static MsBarcodeType[] values() {
        return (MsBarcodeType[]) $VALUES.clone();
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
