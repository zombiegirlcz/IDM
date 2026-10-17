package com.revolut.feature.tax_residency.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tax_residency/api/BackNavigationType;", "Landroid/os/Parcelable;", "", "BACK", "CROSS", "NONE", "feature_tax_residency_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BackNavigationType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BackNavigationType[] $VALUES;
    public static final BackNavigationType BACK;

    @NotNull
    public static final Parcelable.Creator<BackNavigationType> CREATOR;
    public static final BackNavigationType CROSS;
    public static final BackNavigationType NONE;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return BackNavigationType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BackNavigationType[i];
        }
    }

    static {
        BackNavigationType backNavigationType = new BackNavigationType("BACK", 0);
        BACK = backNavigationType;
        BackNavigationType backNavigationType2 = new BackNavigationType("CROSS", 1);
        CROSS = backNavigationType2;
        BackNavigationType backNavigationType3 = new BackNavigationType("NONE", 2);
        NONE = backNavigationType3;
        BackNavigationType[] backNavigationTypeArr = {backNavigationType, backNavigationType2, backNavigationType3};
        $VALUES = backNavigationTypeArr;
        $ENTRIES = s.n(backNavigationTypeArr);
        CREATOR = new a();
    }

    public static BackNavigationType valueOf(String str) {
        return (BackNavigationType) Enum.valueOf(BackNavigationType.class, str);
    }

    public static BackNavigationType[] values() {
        return (BackNavigationType[]) $VALUES.clone();
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
