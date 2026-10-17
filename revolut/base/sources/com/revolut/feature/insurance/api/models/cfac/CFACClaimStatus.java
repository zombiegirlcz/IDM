package com.revolut.feature.insurance.api.models.cfac;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/insurance/api/models/cfac/CFACClaimStatus;", "Landroid/os/Parcelable;", "", "SUBMITTING", "SUBMITTED", "IN_REVIEW", "PAID", "DECLINED", "SUBMISSION_FAILED", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACClaimStatus implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CFACClaimStatus[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<CFACClaimStatus> CREATOR;
    public static final CFACClaimStatus DECLINED;
    public static final CFACClaimStatus IN_REVIEW;
    public static final CFACClaimStatus PAID;
    public static final CFACClaimStatus SUBMISSION_FAILED;
    public static final CFACClaimStatus SUBMITTED;
    public static final CFACClaimStatus SUBMITTING;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return CFACClaimStatus.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACClaimStatus[i];
        }
    }

    static {
        CFACClaimStatus cFACClaimStatus = new CFACClaimStatus("SUBMITTING", 0);
        SUBMITTING = cFACClaimStatus;
        CFACClaimStatus cFACClaimStatus2 = new CFACClaimStatus("SUBMITTED", 1);
        SUBMITTED = cFACClaimStatus2;
        CFACClaimStatus cFACClaimStatus3 = new CFACClaimStatus("IN_REVIEW", 2);
        IN_REVIEW = cFACClaimStatus3;
        CFACClaimStatus cFACClaimStatus4 = new CFACClaimStatus("PAID", 3);
        PAID = cFACClaimStatus4;
        CFACClaimStatus cFACClaimStatus5 = new CFACClaimStatus("DECLINED", 4);
        DECLINED = cFACClaimStatus5;
        CFACClaimStatus cFACClaimStatus6 = new CFACClaimStatus("SUBMISSION_FAILED", 5);
        SUBMISSION_FAILED = cFACClaimStatus6;
        CFACClaimStatus[] cFACClaimStatusArr = {cFACClaimStatus, cFACClaimStatus2, cFACClaimStatus3, cFACClaimStatus4, cFACClaimStatus5, cFACClaimStatus6};
        $VALUES = cFACClaimStatusArr;
        $ENTRIES = s.n(cFACClaimStatusArr);
        CREATOR = new a();
    }

    public static CFACClaimStatus valueOf(String str) {
        return (CFACClaimStatus) Enum.valueOf(CFACClaimStatus.class, str);
    }

    public static CFACClaimStatus[] values() {
        return (CFACClaimStatus[]) $VALUES.clone();
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
