package com.revolut.feature.credit.card.impl.ui.repay.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardRepayFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardRepayFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f69572b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardRepayFlowContract$InputData((d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardRepayFlowContract$InputData[i];
        }
    }

    public CreditCardRepayFlowContract$InputData(d dVar, String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f69571a = facilityId;
        this.f69572b = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardRepayFlowContract$InputData)) {
            return false;
        }
        CreditCardRepayFlowContract$InputData creditCardRepayFlowContract$InputData = (CreditCardRepayFlowContract$InputData) obj2;
        return Intrinsics.f(this.f69571a, creditCardRepayFlowContract$InputData.f69571a) && Intrinsics.f(this.f69572b, creditCardRepayFlowContract$InputData.f69572b);
    }

    public final int hashCode() {
        int iHashCode = this.f69571a.hashCode() * 31;
        d dVar = this.f69572b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69571a);
        dest.writeSerializable(this.f69572b);
    }
}
