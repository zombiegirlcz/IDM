package com.revolut.feature.credit.card.impl.ui.direct_debit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/direct_debit/CreditCardDirectDebitV3FlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardDirectDebitV3FlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardDirectDebitV3FlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardAutopayType.DirectDebit f69263b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardDirectDebitV3FlowContract$InputData(parcel.readString(), (CreditCardAutopayType.DirectDebit) parcel.readParcelable(CreditCardDirectDebitV3FlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardDirectDebitV3FlowContract$InputData[i];
        }
    }

    public CreditCardDirectDebitV3FlowContract$InputData(String facilityId, CreditCardAutopayType.DirectDebit directDebitType) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(directDebitType, "directDebitType");
        this.f69262a = facilityId;
        this.f69263b = directDebitType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardDirectDebitV3FlowContract$InputData)) {
            return false;
        }
        CreditCardDirectDebitV3FlowContract$InputData creditCardDirectDebitV3FlowContract$InputData = (CreditCardDirectDebitV3FlowContract$InputData) obj2;
        return Intrinsics.f(this.f69262a, creditCardDirectDebitV3FlowContract$InputData.f69262a) && Intrinsics.f(this.f69263b, creditCardDirectDebitV3FlowContract$InputData.f69263b);
    }

    public final int hashCode() {
        return this.f69263b.hashCode() + (this.f69262a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69262a);
        dest.writeParcelable(this.f69263b, i);
    }
}
