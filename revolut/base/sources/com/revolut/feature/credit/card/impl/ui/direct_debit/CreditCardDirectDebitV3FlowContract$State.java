package com.revolut.feature.credit.card.impl.ui.direct_debit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/direct_debit/CreditCardDirectDebitV3FlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardDirectDebitV3FlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<CreditCardDirectDebitV3FlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardAutopayType.DirectDebit f69265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69266c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardDirectDebitV3FlowContract$State(parcel.readString(), (CreditCardAutopayType.DirectDebit) parcel.readParcelable(CreditCardDirectDebitV3FlowContract$State.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardDirectDebitV3FlowContract$State[i];
        }
    }

    public CreditCardDirectDebitV3FlowContract$State(String facilityId, CreditCardAutopayType.DirectDebit directDebitType, String str) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(directDebitType, "directDebitType");
        this.f69264a = facilityId;
        this.f69265b = directDebitType;
        this.f69266c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardDirectDebitV3FlowContract$State)) {
            return false;
        }
        CreditCardDirectDebitV3FlowContract$State creditCardDirectDebitV3FlowContract$State = (CreditCardDirectDebitV3FlowContract$State) obj2;
        return Intrinsics.f(this.f69264a, creditCardDirectDebitV3FlowContract$State.f69264a) && Intrinsics.f(this.f69265b, creditCardDirectDebitV3FlowContract$State.f69265b) && Intrinsics.f(this.f69266c, creditCardDirectDebitV3FlowContract$State.f69266c);
    }

    public final int hashCode() {
        int iHashCode = (this.f69265b.hashCode() + (this.f69264a.hashCode() * 31)) * 31;
        String str = this.f69266c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69264a);
        dest.writeParcelable(this.f69265b, i);
        dest.writeString(this.f69266c);
    }
}
