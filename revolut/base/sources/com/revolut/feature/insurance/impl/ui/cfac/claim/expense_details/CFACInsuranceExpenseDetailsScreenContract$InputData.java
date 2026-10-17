package com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance.api.models.details.CFACClaimProperties;
import com.revolut.feature.insurance.api.models.details.CFACPaymentCanceller;
import com.revolut.feature.insurance.api.models.details.CFACPaymentPurpose;
import com.revolut.kompot.common.IOData$Input;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance/impl/ui/cfac/claim/expense_details/CFACInsuranceExpenseDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACInsuranceExpenseDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CFACInsuranceExpenseDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f75074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CFACClaimProperties f75075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f75076c;
    public final CFACPaymentPurpose d;
    public final Long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CFACPaymentCanceller f75077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f75078h;
    public final boolean i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            a3 a3Var = (a3) parcel.readSerializable();
            CFACClaimProperties cFACClaimProperties = (CFACClaimProperties) parcel.readParcelable(CFACInsuranceExpenseDetailsScreenContract$InputData.class.getClassLoader());
            d dVar = (d) parcel.readSerializable();
            CFACPaymentPurpose cFACPaymentPurpose = (CFACPaymentPurpose) parcel.readParcelable(CFACInsuranceExpenseDetailsScreenContract$InputData.class.getClassLoader());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            CFACPaymentCanceller cFACPaymentCanceller = (CFACPaymentCanceller) parcel.readParcelable(CFACInsuranceExpenseDetailsScreenContract$InputData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new CFACInsuranceExpenseDetailsScreenContract$InputData(a3Var, cFACClaimProperties, dVar, cFACPaymentPurpose, lValueOf, lValueOf2, cFACPaymentCanceller, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACInsuranceExpenseDetailsScreenContract$InputData[i];
        }
    }

    public CFACInsuranceExpenseDetailsScreenContract$InputData(a3 transaction, CFACClaimProperties claimProperties, d dVar, CFACPaymentPurpose cFACPaymentPurpose, Long l2, Long l3, CFACPaymentCanceller cFACPaymentCanceller, List documents, boolean z) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(claimProperties, "claimProperties");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f75074a = transaction;
        this.f75075b = claimProperties;
        this.f75076c = dVar;
        this.d = cFACPaymentPurpose;
        this.e = l2;
        this.f = l3;
        this.f75077g = cFACPaymentCanceller;
        this.f75078h = documents;
        this.i = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACInsuranceExpenseDetailsScreenContract$InputData)) {
            return false;
        }
        CFACInsuranceExpenseDetailsScreenContract$InputData cFACInsuranceExpenseDetailsScreenContract$InputData = (CFACInsuranceExpenseDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75074a, cFACInsuranceExpenseDetailsScreenContract$InputData.f75074a) && Intrinsics.f(this.f75075b, cFACInsuranceExpenseDetailsScreenContract$InputData.f75075b) && Intrinsics.f(this.f75076c, cFACInsuranceExpenseDetailsScreenContract$InputData.f75076c) && Intrinsics.f(this.d, cFACInsuranceExpenseDetailsScreenContract$InputData.d) && Intrinsics.f(this.e, cFACInsuranceExpenseDetailsScreenContract$InputData.e) && Intrinsics.f(this.f, cFACInsuranceExpenseDetailsScreenContract$InputData.f) && Intrinsics.f(this.f75077g, cFACInsuranceExpenseDetailsScreenContract$InputData.f75077g) && Intrinsics.f(this.f75078h, cFACInsuranceExpenseDetailsScreenContract$InputData.f75078h) && this.i == cFACInsuranceExpenseDetailsScreenContract$InputData.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f75075b.hashCode() + (this.f75074a.hashCode() * 31)) * 31;
        d dVar = this.f75076c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        CFACPaymentPurpose cFACPaymentPurpose = this.d;
        int iHashCode3 = (iHashCode2 + (cFACPaymentPurpose == null ? 0 : cFACPaymentPurpose.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        CFACPaymentCanceller cFACPaymentCanceller = this.f75077g;
        return Boolean.hashCode(this.i) + p.a.d((iHashCode5 + (cFACPaymentCanceller != null ? cFACPaymentCanceller.hashCode() : 0)) * 31, 31, this.f75078h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f75074a);
        dest.writeParcelable(this.f75075b, i);
        dest.writeSerializable(this.f75076c);
        dest.writeParcelable(this.d, i);
        Long l2 = this.e;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        Long l3 = this.f;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l3);
        }
        dest.writeParcelable(this.f75077g, i);
        Iterator itV = p.a.v(this.f75078h, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeInt(this.i ? 1 : 0);
    }
}
