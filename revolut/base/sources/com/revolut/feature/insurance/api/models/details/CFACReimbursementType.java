package com.revolut.feature.insurance.api.models.details;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/details/CFACReimbursementType;", "Landroid/os/Parcelable;", "", "DOC_PROOF_REIMBURSEMENT", "NO_PROOF_REIMBURSEMENT", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACReimbursementType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CFACReimbursementType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<CFACReimbursementType> CREATOR;
    public static final CFACReimbursementType DOC_PROOF_REIMBURSEMENT;
    public static final CFACReimbursementType NO_PROOF_REIMBURSEMENT;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return CFACReimbursementType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACReimbursementType[i];
        }
    }

    static {
        CFACReimbursementType cFACReimbursementType = new CFACReimbursementType("DOC_PROOF_REIMBURSEMENT", 0);
        DOC_PROOF_REIMBURSEMENT = cFACReimbursementType;
        CFACReimbursementType cFACReimbursementType2 = new CFACReimbursementType("NO_PROOF_REIMBURSEMENT", 1);
        NO_PROOF_REIMBURSEMENT = cFACReimbursementType2;
        CFACReimbursementType[] cFACReimbursementTypeArr = {cFACReimbursementType, cFACReimbursementType2};
        $VALUES = cFACReimbursementTypeArr;
        $ENTRIES = s.n(cFACReimbursementTypeArr);
        CREATOR = new a();
    }

    public static CFACReimbursementType valueOf(String str) {
        return (CFACReimbursementType) Enum.valueOf(CFACReimbursementType.class, str);
    }

    public static CFACReimbursementType[] values() {
        return (CFACReimbursementType[]) $VALUES.clone();
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
