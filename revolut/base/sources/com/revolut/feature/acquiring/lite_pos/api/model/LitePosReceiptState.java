package com.revolut.feature.acquiring.lite_pos.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/api/model/LitePosReceiptState;", "Landroid/os/Parcelable;", "", "APPROVED", "FAILED", "DECLINED", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LitePosReceiptState implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LitePosReceiptState[] $VALUES;
    public static final LitePosReceiptState APPROVED;

    @NotNull
    public static final Parcelable.Creator<LitePosReceiptState> CREATOR;
    public static final LitePosReceiptState DECLINED;
    public static final LitePosReceiptState FAILED;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return LitePosReceiptState.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LitePosReceiptState[i];
        }
    }

    static {
        LitePosReceiptState litePosReceiptState = new LitePosReceiptState("APPROVED", 0);
        APPROVED = litePosReceiptState;
        LitePosReceiptState litePosReceiptState2 = new LitePosReceiptState("FAILED", 1);
        FAILED = litePosReceiptState2;
        LitePosReceiptState litePosReceiptState3 = new LitePosReceiptState("DECLINED", 2);
        DECLINED = litePosReceiptState3;
        LitePosReceiptState[] litePosReceiptStateArr = {litePosReceiptState, litePosReceiptState2, litePosReceiptState3};
        $VALUES = litePosReceiptStateArr;
        $ENTRIES = s.n(litePosReceiptStateArr);
        CREATOR = new a();
    }

    public static LitePosReceiptState valueOf(String str) {
        return (LitePosReceiptState) Enum.valueOf(LitePosReceiptState.class, str);
    }

    public static LitePosReceiptState[] values() {
        return (LitePosReceiptState[]) $VALUES.clone();
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
