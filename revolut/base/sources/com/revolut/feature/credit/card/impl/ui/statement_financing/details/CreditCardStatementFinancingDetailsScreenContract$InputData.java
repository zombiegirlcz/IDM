package com.revolut.feature.credit.card.impl.ui.statement_financing.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardStatementFinancingDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardStatementFinancingDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f69748c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardStatementFinancingDetailsScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardStatementFinancingDetailsScreenContract$InputData[i];
        }
    }

    public CreditCardStatementFinancingDetailsScreenContract$InputData(String facilityId, String planId, boolean z) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f69746a = facilityId;
        this.f69747b = planId;
        this.f69748c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardStatementFinancingDetailsScreenContract$InputData)) {
            return false;
        }
        CreditCardStatementFinancingDetailsScreenContract$InputData creditCardStatementFinancingDetailsScreenContract$InputData = (CreditCardStatementFinancingDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69746a, creditCardStatementFinancingDetailsScreenContract$InputData.f69746a) && Intrinsics.f(this.f69747b, creditCardStatementFinancingDetailsScreenContract$InputData.f69747b) && this.f69748c == creditCardStatementFinancingDetailsScreenContract$InputData.f69748c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69748c) + p.a.c(this.f69746a.hashCode() * 31, 31, this.f69747b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69746a);
        dest.writeString(this.f69747b);
        dest.writeInt(this.f69748c ? 1 : 0);
    }
}
