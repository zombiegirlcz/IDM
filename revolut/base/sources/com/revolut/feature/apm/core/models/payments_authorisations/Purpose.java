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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/Purpose;", "Landroid/os/Parcelable;", "", "MORTGAGE", "UTILITY", "LOAN", "DEPENDANT_SUPPORT", "GAMBLING", "RETAIL", "SALARY", "PERSONAL", "GOVERNMENT", "PENSION", "TAX", "OTHER_SERVICES", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Purpose implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Purpose[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<Purpose> CREATOR;
    public static final Purpose DEPENDANT_SUPPORT;
    public static final Purpose GAMBLING;
    public static final Purpose GOVERNMENT;
    public static final Purpose LOAN;
    public static final Purpose MORTGAGE;
    public static final Purpose OTHER_SERVICES;
    public static final Purpose PENSION;
    public static final Purpose PERSONAL;
    public static final Purpose RETAIL;
    public static final Purpose SALARY;
    public static final Purpose TAX;
    public static final Purpose UTILITY;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return Purpose.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Purpose[i];
        }
    }

    static {
        Purpose purpose = new Purpose("MORTGAGE", 0);
        MORTGAGE = purpose;
        Purpose purpose2 = new Purpose("UTILITY", 1);
        UTILITY = purpose2;
        Purpose purpose3 = new Purpose("LOAN", 2);
        LOAN = purpose3;
        Purpose purpose4 = new Purpose("DEPENDANT_SUPPORT", 3);
        DEPENDANT_SUPPORT = purpose4;
        Purpose purpose5 = new Purpose("GAMBLING", 4);
        GAMBLING = purpose5;
        Purpose purpose6 = new Purpose("RETAIL", 5);
        RETAIL = purpose6;
        Purpose purpose7 = new Purpose("SALARY", 6);
        SALARY = purpose7;
        Purpose purpose8 = new Purpose("PERSONAL", 7);
        PERSONAL = purpose8;
        Purpose purpose9 = new Purpose("GOVERNMENT", 8);
        GOVERNMENT = purpose9;
        Purpose purpose10 = new Purpose("PENSION", 9);
        PENSION = purpose10;
        Purpose purpose11 = new Purpose("TAX", 10);
        TAX = purpose11;
        Purpose purpose12 = new Purpose("OTHER_SERVICES", 11);
        OTHER_SERVICES = purpose12;
        Purpose[] purposeArr = {purpose, purpose2, purpose3, purpose4, purpose5, purpose6, purpose7, purpose8, purpose9, purpose10, purpose11, purpose12};
        $VALUES = purposeArr;
        $ENTRIES = s.n(purposeArr);
        CREATOR = new a();
    }

    public static Purpose valueOf(String str) {
        return (Purpose) Enum.valueOf(Purpose.class, str);
    }

    public static Purpose[] values() {
        return (Purpose[]) $VALUES.clone();
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
