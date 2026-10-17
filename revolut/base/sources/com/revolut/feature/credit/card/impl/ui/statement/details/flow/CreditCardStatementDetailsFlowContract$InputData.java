package com.revolut.feature.credit.card.impl.ui.statement.details.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/statement/details/flow/CreditCardStatementDetailsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardStatementDetailsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardStatementDetailsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f69675b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardStatementDetailsFlowContract$InputData(parcel.readString(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardStatementDetailsFlowContract$InputData[i];
        }
    }

    public CreditCardStatementDetailsFlowContract$InputData(String facilityId, LocalDate startDate) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f69674a = facilityId;
        this.f69675b = startDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardStatementDetailsFlowContract$InputData)) {
            return false;
        }
        CreditCardStatementDetailsFlowContract$InputData creditCardStatementDetailsFlowContract$InputData = (CreditCardStatementDetailsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f69674a, creditCardStatementDetailsFlowContract$InputData.f69674a) && Intrinsics.f(this.f69675b, creditCardStatementDetailsFlowContract$InputData.f69675b);
    }

    public final int hashCode() {
        return this.f69675b.hashCode() + (this.f69674a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69674a);
        dest.writeSerializable(this.f69675b);
    }
}
