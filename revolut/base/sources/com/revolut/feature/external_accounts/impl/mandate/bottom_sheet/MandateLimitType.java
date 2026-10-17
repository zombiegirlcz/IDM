package com.revolut.feature.external_accounts.impl.mandate.bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/mandate/bottom_sheet/MandateLimitType;", "Landroid/os/Parcelable;", "", "MAX_PER_TRANSFER", "MAX_PER_MONTH", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MandateLimitType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MandateLimitType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<MandateLimitType> CREATOR;
    public static final MandateLimitType MAX_PER_MONTH;
    public static final MandateLimitType MAX_PER_TRANSFER;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return MandateLimitType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MandateLimitType[i];
        }
    }

    static {
        MandateLimitType mandateLimitType = new MandateLimitType("MAX_PER_TRANSFER", 0);
        MAX_PER_TRANSFER = mandateLimitType;
        MandateLimitType mandateLimitType2 = new MandateLimitType("MAX_PER_MONTH", 1);
        MAX_PER_MONTH = mandateLimitType2;
        MandateLimitType[] mandateLimitTypeArr = {mandateLimitType, mandateLimitType2};
        $VALUES = mandateLimitTypeArr;
        $ENTRIES = s.n(mandateLimitTypeArr);
        CREATOR = new a();
    }

    public static MandateLimitType valueOf(String str) {
        return (MandateLimitType) Enum.valueOf(MandateLimitType.class, str);
    }

    public static MandateLimitType[] values() {
        return (MandateLimitType[]) $VALUES.clone();
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
