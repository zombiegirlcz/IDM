package com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.cancellation.PayoffBreakdown;
import com.revolut.feature.credit.card.api.models.cancellation.RepaymentDeferral;
import com.revolut.feature.credit.card.api.navigation.CreditCardCancellationDestination;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import hl4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/cancellation/flow/cancellation/CreditCardCancellationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardCancellationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardCancellationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardCancellationDestination.CancellationType f69115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f69116c;
    public final d d;
    public final RepaymentDeferral e;
    public final PayoffBreakdown f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f69117g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardCancellationFlowContract$InputData(parcel.readString(), (CreditCardCancellationDestination.CancellationType) parcel.readParcelable(CreditCardCancellationFlowContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : g.valueOf(parcel.readString()), (d) parcel.readSerializable(), (RepaymentDeferral) parcel.readParcelable(CreditCardCancellationFlowContract$InputData.class.getClassLoader()), (PayoffBreakdown) parcel.readParcelable(CreditCardCancellationFlowContract$InputData.class.getClassLoader()), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardCancellationFlowContract$InputData[i];
        }
    }

    public CreditCardCancellationFlowContract$InputData(String facilityId, CreditCardCancellationDestination.CancellationType cancellationType, g gVar, d dVar, RepaymentDeferral repaymentDeferral, PayoffBreakdown payoffBreakdown, b bVar) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(cancellationType, "cancellationType");
        this.f69114a = facilityId;
        this.f69115b = cancellationType;
        this.f69116c = gVar;
        this.d = dVar;
        this.e = repaymentDeferral;
        this.f = payoffBreakdown;
        this.f69117g = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardCancellationFlowContract$InputData)) {
            return false;
        }
        CreditCardCancellationFlowContract$InputData creditCardCancellationFlowContract$InputData = (CreditCardCancellationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f69114a, creditCardCancellationFlowContract$InputData.f69114a) && Intrinsics.f(this.f69115b, creditCardCancellationFlowContract$InputData.f69115b) && this.f69116c == creditCardCancellationFlowContract$InputData.f69116c && Intrinsics.f(this.d, creditCardCancellationFlowContract$InputData.d) && Intrinsics.f(this.e, creditCardCancellationFlowContract$InputData.e) && Intrinsics.f(this.f, creditCardCancellationFlowContract$InputData.f) && Intrinsics.f(this.f69117g, creditCardCancellationFlowContract$InputData.f69117g);
    }

    public final int hashCode() {
        int iHashCode = (this.f69115b.hashCode() + (this.f69114a.hashCode() * 31)) * 31;
        g gVar = this.f69116c;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        d dVar = this.d;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        RepaymentDeferral repaymentDeferral = this.e;
        int iHashCode4 = (iHashCode3 + (repaymentDeferral == null ? 0 : repaymentDeferral.hashCode())) * 31;
        PayoffBreakdown payoffBreakdown = this.f;
        int iHashCode5 = (iHashCode4 + (payoffBreakdown == null ? 0 : payoffBreakdown.hashCode())) * 31;
        b bVar = this.f69117g;
        return iHashCode5 + (bVar != null ? bVar.f297794a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69114a);
        dest.writeParcelable(this.f69115b, i);
        g gVar = this.f69116c;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gVar.name());
        }
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeSerializable(this.f69117g);
    }
}
