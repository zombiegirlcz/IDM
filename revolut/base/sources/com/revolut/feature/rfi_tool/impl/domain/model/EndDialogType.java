package com.revolut.feature.rfi_tool.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/rfi_tool/impl/domain/model/EndDialogType;", "Landroid/os/Parcelable;", "", "SUCCESS", "PENDING", "UNKNOWN", "feature_rfi_tool_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EndDialogType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EndDialogType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<EndDialogType> CREATOR;
    public static final EndDialogType PENDING;
    public static final EndDialogType SUCCESS;
    public static final EndDialogType UNKNOWN;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return EndDialogType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EndDialogType[i];
        }
    }

    static {
        EndDialogType endDialogType = new EndDialogType("SUCCESS", 0);
        SUCCESS = endDialogType;
        EndDialogType endDialogType2 = new EndDialogType("PENDING", 1);
        PENDING = endDialogType2;
        EndDialogType endDialogType3 = new EndDialogType("UNKNOWN", 2);
        UNKNOWN = endDialogType3;
        EndDialogType[] endDialogTypeArr = {endDialogType, endDialogType2, endDialogType3};
        $VALUES = endDialogTypeArr;
        $ENTRIES = s.n(endDialogTypeArr);
        CREATOR = new a();
    }

    public static EndDialogType valueOf(String str) {
        return (EndDialogType) Enum.valueOf(EndDialogType.class, str);
    }

    public static EndDialogType[] values() {
        return (EndDialogType[]) $VALUES.clone();
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
