package com.revolut.feature.insurance.impl.ui.cfac.claim.select_expenses;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance.api.models.details.CFACClaimProperties;
import com.revolut.feature.insurance.api.models.details.CFACClaimTransactions;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance/impl/ui/cfac/claim/select_expenses/CFACInsuranceSelectExpensesScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CFACInsuranceSelectExpensesScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CFACInsuranceSelectExpensesScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACClaimTransactions f75109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CFACClaimProperties f75110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f75111c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            CFACClaimTransactions cFACClaimTransactions = (CFACClaimTransactions) j6.a.f(parcel, "parcel", CFACInsuranceSelectExpensesScreenContract$InputData.class);
            CFACClaimProperties cFACClaimProperties = (CFACClaimProperties) parcel.readParcelable(CFACInsuranceSelectExpensesScreenContract$InputData.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new CFACInsuranceSelectExpensesScreenContract$InputData(cFACClaimTransactions, cFACClaimProperties, linkedHashSet, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CFACInsuranceSelectExpensesScreenContract$InputData[i];
        }
    }

    public CFACInsuranceSelectExpensesScreenContract$InputData(CFACClaimTransactions claimTransactions, CFACClaimProperties claimProperties, Set transactionIdsToExclude, boolean z) {
        Intrinsics.checkNotNullParameter(claimTransactions, "claimTransactions");
        Intrinsics.checkNotNullParameter(claimProperties, "claimProperties");
        Intrinsics.checkNotNullParameter(transactionIdsToExclude, "transactionIdsToExclude");
        this.f75109a = claimTransactions;
        this.f75110b = claimProperties;
        this.f75111c = transactionIdsToExclude;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CFACInsuranceSelectExpensesScreenContract$InputData)) {
            return false;
        }
        CFACInsuranceSelectExpensesScreenContract$InputData cFACInsuranceSelectExpensesScreenContract$InputData = (CFACInsuranceSelectExpensesScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75109a, cFACInsuranceSelectExpensesScreenContract$InputData.f75109a) && Intrinsics.f(this.f75110b, cFACInsuranceSelectExpensesScreenContract$InputData.f75110b) && Intrinsics.f(this.f75111c, cFACInsuranceSelectExpensesScreenContract$InputData.f75111c) && this.d == cFACInsuranceSelectExpensesScreenContract$InputData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.f((this.f75110b.hashCode() + (this.f75109a.hashCode() * 31)) * 31, 31, this.f75111c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f75109a, i);
        dest.writeParcelable(this.f75110b, i);
        Iterator itV = n.v(this.f75111c, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        dest.writeInt(this.d ? 1 : 0);
    }
}
