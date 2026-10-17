package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q35.i0;
import q35.j0;
import q35.k0;
import q35.l0;
import q35.m0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanUnavailableFeatures;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "q35/j0", "q35/l0", "q35/m0", "q35/k0", "q35/i0", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanUnavailableFeatures implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanUnavailableFeatures> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f70201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f70202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f70203c;
    public final k0 d;
    public final i0 e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanUnavailableFeatures(parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : l0.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : m0.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : k0.valueOf(parcel.readString()), parcel.readInt() != 0 ? i0.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanUnavailableFeatures[i];
        }
    }

    public LoanUnavailableFeatures(j0 j0Var, l0 l0Var, m0 m0Var, k0 k0Var, i0 i0Var) {
        this.f70201a = j0Var;
        this.f70202b = l0Var;
        this.f70203c = m0Var;
        this.d = k0Var;
        this.e = i0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanUnavailableFeatures)) {
            return false;
        }
        LoanUnavailableFeatures loanUnavailableFeatures = (LoanUnavailableFeatures) obj2;
        return this.f70201a == loanUnavailableFeatures.f70201a && this.f70202b == loanUnavailableFeatures.f70202b && this.f70203c == loanUnavailableFeatures.f70203c && this.d == loanUnavailableFeatures.d && this.e == loanUnavailableFeatures.e;
    }

    public final int hashCode() {
        j0 j0Var = this.f70201a;
        int iHashCode = (j0Var == null ? 0 : j0Var.hashCode()) * 31;
        l0 l0Var = this.f70202b;
        int iHashCode2 = (iHashCode + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        m0 m0Var = this.f70203c;
        int iHashCode3 = (iHashCode2 + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        k0 k0Var = this.d;
        int iHashCode4 = (iHashCode3 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        i0 i0Var = this.e;
        return iHashCode4 + (i0Var != null ? i0Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        j0 j0Var = this.f70201a;
        if (j0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(j0Var.name());
        }
        l0 l0Var = this.f70202b;
        if (l0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(l0Var.name());
        }
        m0 m0Var = this.f70203c;
        if (m0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(m0Var.name());
        }
        k0 k0Var = this.d;
        if (k0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(k0Var.name());
        }
        i0 i0Var = this.e;
        if (i0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(i0Var.name());
        }
    }
}
