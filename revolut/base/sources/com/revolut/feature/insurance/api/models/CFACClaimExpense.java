package com.revolut.feature.insurance.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance.api.models.details.CFACPaymentCanceller;
import com.revolut.feature.insurance.api.models.details.CFACPaymentPurpose;
import dj0.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/api/models/CFACClaimExpense;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACClaimExpense implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CFACClaimExpense> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f74926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f74927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CFACPaymentPurpose f74928c;
    public final long d;
    public final long e;
    public final CFACPaymentCanceller f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f74929g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            a3 a3Var = (a3) parcel.readSerializable();
            d dVar = (d) parcel.readSerializable();
            CFACPaymentPurpose cFACPaymentPurposeCreateFromParcel = CFACPaymentPurpose.CREATOR.createFromParcel(parcel);
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            CFACPaymentCanceller cFACPaymentCancellerCreateFromParcel = CFACPaymentCanceller.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new CFACClaimExpense(a3Var, dVar, cFACPaymentPurposeCreateFromParcel, j2, j3, cFACPaymentCancellerCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACClaimExpense[i];
        }
    }

    public CFACClaimExpense(a3 transaction, d dVar, CFACPaymentPurpose selectedPaymentPurpose, long j2, long j3, CFACPaymentCanceller selectedCanceller, List documents) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(selectedPaymentPurpose, "selectedPaymentPurpose");
        Intrinsics.checkNotNullParameter(selectedCanceller, "selectedCanceller");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f74926a = transaction;
        this.f74927b = dVar;
        this.f74928c = selectedPaymentPurpose;
        this.d = j2;
        this.e = j3;
        this.f = selectedCanceller;
        this.f74929g = documents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACClaimExpense)) {
            return false;
        }
        CFACClaimExpense cFACClaimExpense = (CFACClaimExpense) obj2;
        return Intrinsics.f(this.f74926a, cFACClaimExpense.f74926a) && Intrinsics.f(this.f74927b, cFACClaimExpense.f74927b) && Intrinsics.f(this.f74928c, cFACClaimExpense.f74928c) && this.d == cFACClaimExpense.d && this.e == cFACClaimExpense.e && Intrinsics.f(this.f, cFACClaimExpense.f) && Intrinsics.f(this.f74929g, cFACClaimExpense.f74929g);
    }

    public final int hashCode() {
        int iHashCode = this.f74926a.hashCode() * 31;
        d dVar = this.f74927b;
        return this.f74929g.hashCode() + ((this.f.hashCode() + a0.d.c(a0.d.c((this.f74928c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31, 31, this.d), 31, this.e)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f74926a);
        dest.writeSerializable(this.f74927b);
        this.f74928c.writeToParcel(dest, i);
        dest.writeLong(this.d);
        dest.writeLong(this.e);
        this.f.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.f74929g, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
