package com.revolut.feature.atm.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/atm/api/model/AtmFees;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_atm_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AtmFees implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AtmFees> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f63135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f63136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtmWithdrawalCommission f63137c;
    public final AtmWithdrawalCommission d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AtmFees(boolValueOf, boolValueOf2, parcel.readInt() == 0 ? null : AtmWithdrawalCommission.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtmWithdrawalCommission.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AtmFees[i];
        }
    }

    public AtmFees(Boolean bool, Boolean bool2, AtmWithdrawalCommission atmWithdrawalCommission, AtmWithdrawalCommission atmWithdrawalCommission2) {
        this.f63135a = bool;
        this.f63136b = bool2;
        this.f63137c = atmWithdrawalCommission;
        this.d = atmWithdrawalCommission2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AtmFees)) {
            return false;
        }
        AtmFees atmFees = (AtmFees) obj2;
        return Intrinsics.f(this.f63135a, atmFees.f63135a) && Intrinsics.f(this.f63136b, atmFees.f63136b) && Intrinsics.f(this.f63137c, atmFees.f63137c) && Intrinsics.f(this.d, atmFees.d);
    }

    public final int hashCode() {
        Boolean bool = this.f63135a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f63136b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AtmWithdrawalCommission atmWithdrawalCommission = this.f63137c;
        int iHashCode3 = (iHashCode2 + (atmWithdrawalCommission == null ? 0 : atmWithdrawalCommission.hashCode())) * 31;
        AtmWithdrawalCommission atmWithdrawalCommission2 = this.d;
        return iHashCode3 + (atmWithdrawalCommission2 != null ? atmWithdrawalCommission2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.f63135a;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        Boolean bool2 = this.f63136b;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool2);
        }
        AtmWithdrawalCommission atmWithdrawalCommission = this.f63137c;
        if (atmWithdrawalCommission == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            atmWithdrawalCommission.writeToParcel(dest, i);
        }
        AtmWithdrawalCommission atmWithdrawalCommission2 = this.d;
        if (atmWithdrawalCommission2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            atmWithdrawalCommission2.writeToParcel(dest, i);
        }
    }
}
