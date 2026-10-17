package com.revolut.feature.credit.loan.api.models.rev10;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q35.f0;
import q35.g0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/loan/api/models/rev10/LoanRepaymentConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "q35/g0", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanRepaymentConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoanRepaymentConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f70177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f70178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f70179c;
    public final List d;
    public final f0 e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f70180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f70181h;
    public final List i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            dj0.d dVar = (dj0.d) parcel.readSerializable();
            dj0.d dVar2 = (dj0.d) parcel.readSerializable();
            dj0.d dVar3 = (dj0.d) parcel.readSerializable();
            int iA = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(g0.valueOf(parcel.readString()));
                }
            }
            f0 f0Var = (f0) parcel.readSerializable();
            dj0.d dVar4 = (dj0.d) parcel.readSerializable();
            dj0.d dVar5 = (dj0.d) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i3);
                int iA2 = 0;
                while (iA2 != i3) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(RepaymentSuggestion.CREATOR, parcel, arrayList4, iA2, 1);
                }
                arrayList2 = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i5);
                while (iA != i5) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(ExcludedAmountRange.CREATOR, parcel, arrayList5, iA, 1);
                }
                arrayList3 = arrayList5;
            }
            return new LoanRepaymentConfig(dVar, dVar2, dVar3, arrayList, f0Var, dVar4, dVar5, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoanRepaymentConfig[i];
        }
    }

    public LoanRepaymentConfig(dj0.d dVar, dj0.d minAmount, dj0.d maxAmount, ArrayList arrayList, f0 repaymentAccountsConfig, dj0.d dVar2, dj0.d dVar3, ArrayList arrayList2, ArrayList arrayList3) {
        Intrinsics.checkNotNullParameter(minAmount, "minAmount");
        Intrinsics.checkNotNullParameter(maxAmount, "maxAmount");
        Intrinsics.checkNotNullParameter(repaymentAccountsConfig, "repaymentAccountsConfig");
        this.f70177a = dVar;
        this.f70178b = minAmount;
        this.f70179c = maxAmount;
        this.d = arrayList;
        this.e = repaymentAccountsConfig;
        this.f = dVar2;
        this.f70180g = dVar3;
        this.f70181h = arrayList2;
        this.i = arrayList3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoanRepaymentConfig)) {
            return false;
        }
        LoanRepaymentConfig loanRepaymentConfig = (LoanRepaymentConfig) obj2;
        return Intrinsics.f(this.f70177a, loanRepaymentConfig.f70177a) && Intrinsics.f(this.f70178b, loanRepaymentConfig.f70178b) && Intrinsics.f(this.f70179c, loanRepaymentConfig.f70179c) && Intrinsics.f(this.d, loanRepaymentConfig.d) && Intrinsics.f(this.e, loanRepaymentConfig.e) && Intrinsics.f(this.f, loanRepaymentConfig.f) && Intrinsics.f(this.f70180g, loanRepaymentConfig.f70180g) && Intrinsics.f(this.f70181h, loanRepaymentConfig.f70181h) && Intrinsics.f(this.i, loanRepaymentConfig.i);
    }

    public final int hashCode() {
        dj0.d dVar = this.f70177a;
        int iC = v7.c(v7.c((dVar == null ? 0 : dVar.hashCode()) * 31, 31, this.f70178b), 31, this.f70179c);
        List list = this.d;
        int iHashCode = (this.e.hashCode() + ((iC + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        dj0.d dVar2 = this.f;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f70180g;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        List list2 = this.f70181h;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.i;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f70177a);
        dest.writeSerializable(this.f70178b);
        dest.writeSerializable(this.f70179c);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeString(((g0) itQ.next()).name());
            }
        }
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f70180g);
        List list2 = this.f70181h;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                ((RepaymentSuggestion) itQ2.next()).writeToParcel(dest, i);
            }
        }
        List list3 = this.i;
        if (list3 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ3 = v0.a.q(dest, 1, list3);
        while (itQ3.hasNext()) {
            ((ExcludedAmountRange) itQ3.next()).writeToParcel(dest, i);
        }
    }
}
