package com.revolut.feature.apm.core.models.payments_authorisations;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/DeactivationReason;", "Landroid/os/Parcelable;", "", "CANCELED", "DECLINED", "ENDED", "EXPIRED", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeactivationReason implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeactivationReason[] $VALUES;
    public static final DeactivationReason CANCELED;

    @NotNull
    public static final Parcelable.Creator<DeactivationReason> CREATOR;
    public static final DeactivationReason DECLINED;
    public static final DeactivationReason ENDED;
    public static final DeactivationReason EXPIRED;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return DeactivationReason.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeactivationReason[i];
        }
    }

    static {
        DeactivationReason deactivationReason = new DeactivationReason("CANCELED", 0);
        CANCELED = deactivationReason;
        DeactivationReason deactivationReason2 = new DeactivationReason("DECLINED", 1);
        DECLINED = deactivationReason2;
        DeactivationReason deactivationReason3 = new DeactivationReason("ENDED", 2);
        ENDED = deactivationReason3;
        DeactivationReason deactivationReason4 = new DeactivationReason("EXPIRED", 3);
        EXPIRED = deactivationReason4;
        DeactivationReason[] deactivationReasonArr = {deactivationReason, deactivationReason2, deactivationReason3, deactivationReason4};
        $VALUES = deactivationReasonArr;
        $ENTRIES = s.n(deactivationReasonArr);
        CREATOR = new a();
    }

    public static DeactivationReason valueOf(String str) {
        return (DeactivationReason) Enum.valueOf(DeactivationReason.class, str);
    }

    public static DeactivationReason[] values() {
        return (DeactivationReason[]) $VALUES.clone();
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
