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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixAuthorisationFrequency;", "Landroid/os/Parcelable;", "", "DAILY", "WEEKLY", "FORTNIGHTLY", "MONTHLY", "QUARTERLY", "SEMIANNUAL", "ANNUAL", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixAuthorisationFrequency implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PixAuthorisationFrequency[] $VALUES;
    public static final PixAuthorisationFrequency ANNUAL;

    @NotNull
    public static final Parcelable.Creator<PixAuthorisationFrequency> CREATOR;
    public static final PixAuthorisationFrequency DAILY;
    public static final PixAuthorisationFrequency FORTNIGHTLY;
    public static final PixAuthorisationFrequency MONTHLY;
    public static final PixAuthorisationFrequency QUARTERLY;
    public static final PixAuthorisationFrequency SEMIANNUAL;
    public static final PixAuthorisationFrequency WEEKLY;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PixAuthorisationFrequency.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixAuthorisationFrequency[i];
        }
    }

    static {
        PixAuthorisationFrequency pixAuthorisationFrequency = new PixAuthorisationFrequency("DAILY", 0);
        DAILY = pixAuthorisationFrequency;
        PixAuthorisationFrequency pixAuthorisationFrequency2 = new PixAuthorisationFrequency("WEEKLY", 1);
        WEEKLY = pixAuthorisationFrequency2;
        PixAuthorisationFrequency pixAuthorisationFrequency3 = new PixAuthorisationFrequency("FORTNIGHTLY", 2);
        FORTNIGHTLY = pixAuthorisationFrequency3;
        PixAuthorisationFrequency pixAuthorisationFrequency4 = new PixAuthorisationFrequency("MONTHLY", 3);
        MONTHLY = pixAuthorisationFrequency4;
        PixAuthorisationFrequency pixAuthorisationFrequency5 = new PixAuthorisationFrequency("QUARTERLY", 4);
        QUARTERLY = pixAuthorisationFrequency5;
        PixAuthorisationFrequency pixAuthorisationFrequency6 = new PixAuthorisationFrequency("SEMIANNUAL", 5);
        SEMIANNUAL = pixAuthorisationFrequency6;
        PixAuthorisationFrequency pixAuthorisationFrequency7 = new PixAuthorisationFrequency("ANNUAL", 6);
        ANNUAL = pixAuthorisationFrequency7;
        PixAuthorisationFrequency[] pixAuthorisationFrequencyArr = {pixAuthorisationFrequency, pixAuthorisationFrequency2, pixAuthorisationFrequency3, pixAuthorisationFrequency4, pixAuthorisationFrequency5, pixAuthorisationFrequency6, pixAuthorisationFrequency7};
        $VALUES = pixAuthorisationFrequencyArr;
        $ENTRIES = s.n(pixAuthorisationFrequencyArr);
        CREATOR = new a();
    }

    public static PixAuthorisationFrequency valueOf(String str) {
        return (PixAuthorisationFrequency) Enum.valueOf(PixAuthorisationFrequency.class, str);
    }

    public static PixAuthorisationFrequency[] values() {
        return (PixAuthorisationFrequency[]) $VALUES.clone();
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
