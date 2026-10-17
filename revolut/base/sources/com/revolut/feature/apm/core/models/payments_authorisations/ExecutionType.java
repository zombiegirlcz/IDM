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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/ExecutionType;", "Landroid/os/Parcelable;", "", "ON_DEMAND", "RECURRING", "ONE_TIME", "OTP", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExecutionType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExecutionType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<ExecutionType> CREATOR;
    public static final ExecutionType ONE_TIME;
    public static final ExecutionType ON_DEMAND;
    public static final ExecutionType OTP;
    public static final ExecutionType RECURRING;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return ExecutionType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExecutionType[i];
        }
    }

    static {
        ExecutionType executionType = new ExecutionType("ON_DEMAND", 0);
        ON_DEMAND = executionType;
        ExecutionType executionType2 = new ExecutionType("RECURRING", 1);
        RECURRING = executionType2;
        ExecutionType executionType3 = new ExecutionType("ONE_TIME", 2);
        ONE_TIME = executionType3;
        ExecutionType executionType4 = new ExecutionType("OTP", 3);
        OTP = executionType4;
        ExecutionType[] executionTypeArr = {executionType, executionType2, executionType3, executionType4};
        $VALUES = executionTypeArr;
        $ENTRIES = s.n(executionTypeArr);
        CREATOR = new a();
    }

    public static ExecutionType valueOf(String str) {
        return (ExecutionType) Enum.valueOf(ExecutionType.class, str);
    }

    public static ExecutionType[] values() {
        return (ExecutionType[]) $VALUES.clone();
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
