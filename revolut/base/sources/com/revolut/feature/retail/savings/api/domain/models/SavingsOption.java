package com.revolut.feature.retail.savings.api.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import ncd.g;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001b\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/feature/retail/savings/api/domain/models/SavingsOption;", "Landroid/os/Parcelable;", "", "Lncd/g;", "Lcom/revolut/feature/vaults/common/ProductGroupType;", "groupType", "Lncd/g;", "a", "()Lncd/g;", "", "priority", "I", "b", "()I", "BANK_SAVINGS", "FUND_SAVINGS", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsOption implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SavingsOption[] $VALUES;
    public static final SavingsOption BANK_SAVINGS;

    @NotNull
    public static final Parcelable.Creator<SavingsOption> CREATOR;
    public static final SavingsOption FUND_SAVINGS;

    @NotNull
    private final g groupType;
    private final int priority;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return SavingsOption.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsOption[i];
        }
    }

    static {
        SavingsOption savingsOption = new SavingsOption("BANK_SAVINGS", 0, g.SAVINGS_DEPOSITS, 1);
        BANK_SAVINGS = savingsOption;
        SavingsOption savingsOption2 = new SavingsOption("FUND_SAVINGS", 1, g.SAVINGS_MMF, 2);
        FUND_SAVINGS = savingsOption2;
        SavingsOption[] savingsOptionArr = {savingsOption, savingsOption2};
        $VALUES = savingsOptionArr;
        $ENTRIES = s.n(savingsOptionArr);
        CREATOR = new a();
    }

    public SavingsOption(String str, int i, g gVar, int i2) {
        this.groupType = gVar;
        this.priority = i2;
    }

    public static SavingsOption valueOf(String str) {
        return (SavingsOption) Enum.valueOf(SavingsOption.class, str);
    }

    public static SavingsOption[] values() {
        return (SavingsOption[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g getGroupType() {
        return this.groupType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPriority() {
        return this.priority;
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
