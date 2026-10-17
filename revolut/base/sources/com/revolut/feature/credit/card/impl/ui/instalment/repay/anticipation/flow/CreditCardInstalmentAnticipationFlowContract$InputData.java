package com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ql4.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/repay/anticipation/flow/CreditCardInstalmentAnticipationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardInstalmentAnticipationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardInstalmentAnticipationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f69451c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardInstalmentAnticipationFlowContract$InputData(parcel.readString(), parcel.readString(), v.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardInstalmentAnticipationFlowContract$InputData[i];
        }
    }

    public CreditCardInstalmentAnticipationFlowContract$InputData(String facilityId, String planId, v instalmentType) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(instalmentType, "instalmentType");
        this.f69449a = facilityId;
        this.f69450b = planId;
        this.f69451c = instalmentType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardInstalmentAnticipationFlowContract$InputData)) {
            return false;
        }
        CreditCardInstalmentAnticipationFlowContract$InputData creditCardInstalmentAnticipationFlowContract$InputData = (CreditCardInstalmentAnticipationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f69449a, creditCardInstalmentAnticipationFlowContract$InputData.f69449a) && Intrinsics.f(this.f69450b, creditCardInstalmentAnticipationFlowContract$InputData.f69450b) && this.f69451c == creditCardInstalmentAnticipationFlowContract$InputData.f69451c;
    }

    public final int hashCode() {
        return this.f69451c.hashCode() + p.a.c(this.f69449a.hashCode() * 31, 31, this.f69450b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69449a);
        dest.writeString(this.f69450b);
        dest.writeString(this.f69451c.name());
    }
}
