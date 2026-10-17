package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanStampDuty;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanStampDuty implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<LoanStampDuty> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f70182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f70183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f70184c;
    public final dj0.d d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LoanStampDuty((dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanStampDuty[i];
        }
    }

    public LoanStampDuty(dj0.d dVar, dj0.d dVar2, dj0.d dVar3, dj0.d total) {
        Intrinsics.checkNotNullParameter(total, "total");
        this.f70182a = dVar;
        this.f70183b = dVar2;
        this.f70184c = dVar3;
        this.d = total;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanStampDuty)) {
            return false;
        }
        LoanStampDuty loanStampDuty = (LoanStampDuty) obj2;
        return Intrinsics.f(this.f70182a, loanStampDuty.f70182a) && Intrinsics.f(this.f70183b, loanStampDuty.f70183b) && Intrinsics.f(this.f70184c, loanStampDuty.f70184c) && Intrinsics.f(this.d, loanStampDuty.d);
    }

    public final int hashCode() {
        dj0.d dVar = this.f70182a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        dj0.d dVar2 = this.f70183b;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f70184c;
        return this.d.hashCode() + ((iHashCode2 + (dVar3 != null ? dVar3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f70182a);
        dest.writeSerializable(this.f70183b);
        dest.writeSerializable(this.f70184c);
        dest.writeSerializable(this.d);
    }

    public /* synthetic */ LoanStampDuty(dj0.d dVar, dj0.d dVar2, dj0.d dVar3, int i) {
        this((i & 1) != 0 ? null : dVar, (i & 2) != 0 ? null : dVar2, (dj0.d) null, dVar3);
    }
}
