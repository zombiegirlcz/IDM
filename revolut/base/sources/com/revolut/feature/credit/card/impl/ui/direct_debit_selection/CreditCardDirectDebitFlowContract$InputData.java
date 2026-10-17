package com.revolut.feature.credit.card.impl.ui.direct_debit_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit_card.autopay.api.models.AutoPayRequest;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/direct_debit_selection/CreditCardDirectDebitFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardDirectDebitFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardDirectDebitFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AutoPayRequest f69277b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardDirectDebitFlowContract$InputData(parcel.readString(), (AutoPayRequest) parcel.readParcelable(CreditCardDirectDebitFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardDirectDebitFlowContract$InputData[i];
        }
    }

    public CreditCardDirectDebitFlowContract$InputData(String facilityId, AutoPayRequest autoPayRequest) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(autoPayRequest, "autoPayRequest");
        this.f69276a = facilityId;
        this.f69277b = autoPayRequest;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardDirectDebitFlowContract$InputData)) {
            return false;
        }
        CreditCardDirectDebitFlowContract$InputData creditCardDirectDebitFlowContract$InputData = (CreditCardDirectDebitFlowContract$InputData) obj2;
        return Intrinsics.f(this.f69276a, creditCardDirectDebitFlowContract$InputData.f69276a) && Intrinsics.f(this.f69277b, creditCardDirectDebitFlowContract$InputData.f69277b);
    }

    public final int hashCode() {
        return this.f69277b.hashCode() + (this.f69276a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69276a);
        dest.writeParcelable(this.f69277b, i);
    }
}
