package com.revolut.feature.tax_residency.impl.v2.models;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/models/ExemptionReason;", "Landroid/os/Parcelable;", "", "STUDENT", "TEACHER", "TEMPORARY_RESIDENT", "US_STUDENT", "US_TEACHER", "DIPLOMAT", "TIN_PENDING", "LOW_INCOME", "NO_LONGER_TAX_RESIDENT", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExemptionReason implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExemptionReason[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<ExemptionReason> CREATOR;
    public static final ExemptionReason DIPLOMAT;
    public static final ExemptionReason LOW_INCOME;
    public static final ExemptionReason NO_LONGER_TAX_RESIDENT;
    public static final ExemptionReason STUDENT;
    public static final ExemptionReason TEACHER;
    public static final ExemptionReason TEMPORARY_RESIDENT;
    public static final ExemptionReason TIN_PENDING;
    public static final ExemptionReason US_STUDENT;
    public static final ExemptionReason US_TEACHER;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return ExemptionReason.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExemptionReason[i];
        }
    }

    static {
        ExemptionReason exemptionReason = new ExemptionReason("STUDENT", 0);
        STUDENT = exemptionReason;
        ExemptionReason exemptionReason2 = new ExemptionReason("TEACHER", 1);
        TEACHER = exemptionReason2;
        ExemptionReason exemptionReason3 = new ExemptionReason("TEMPORARY_RESIDENT", 2);
        TEMPORARY_RESIDENT = exemptionReason3;
        ExemptionReason exemptionReason4 = new ExemptionReason("US_STUDENT", 3);
        US_STUDENT = exemptionReason4;
        ExemptionReason exemptionReason5 = new ExemptionReason("US_TEACHER", 4);
        US_TEACHER = exemptionReason5;
        ExemptionReason exemptionReason6 = new ExemptionReason("DIPLOMAT", 5);
        DIPLOMAT = exemptionReason6;
        ExemptionReason exemptionReason7 = new ExemptionReason("TIN_PENDING", 6);
        TIN_PENDING = exemptionReason7;
        ExemptionReason exemptionReason8 = new ExemptionReason("LOW_INCOME", 7);
        LOW_INCOME = exemptionReason8;
        ExemptionReason exemptionReason9 = new ExemptionReason("NO_LONGER_TAX_RESIDENT", 8);
        NO_LONGER_TAX_RESIDENT = exemptionReason9;
        ExemptionReason[] exemptionReasonArr = {exemptionReason, exemptionReason2, exemptionReason3, exemptionReason4, exemptionReason5, exemptionReason6, exemptionReason7, exemptionReason8, exemptionReason9};
        $VALUES = exemptionReasonArr;
        $ENTRIES = s.n(exemptionReasonArr);
        CREATOR = new a();
    }

    public static ExemptionReason valueOf(String str) {
        return (ExemptionReason) Enum.valueOf(ExemptionReason.class, str);
    }

    public static ExemptionReason[] values() {
        return (ExemptionReason[]) $VALUES.clone();
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
