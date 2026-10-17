package com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAnticipationQuote;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ql4.v;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/repay/anticipation/confirmation/CreditCardAnticipationConfirmationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardAnticipationConfirmationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardAnticipationConfirmationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditCardInstalmentAnticipationQuote f69443c;
    public final LocalDate d;
    public final LocalDate e;
    public final v f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardAnticipationConfirmationScreenContract$InputData(parcel.readString(), parcel.readString(), (CreditCardInstalmentAnticipationQuote) parcel.readParcelable(CreditCardAnticipationConfirmationScreenContract$InputData.class.getClassLoader()), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), v.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardAnticipationConfirmationScreenContract$InputData[i];
        }
    }

    public CreditCardAnticipationConfirmationScreenContract$InputData(String facilityId, String planId, CreditCardInstalmentAnticipationQuote quote, LocalDate currentCycleDueDate, LocalDate lastInstalmentOldDueDate, v type) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(currentCycleDueDate, "currentCycleDueDate");
        Intrinsics.checkNotNullParameter(lastInstalmentOldDueDate, "lastInstalmentOldDueDate");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f69441a = facilityId;
        this.f69442b = planId;
        this.f69443c = quote;
        this.d = currentCycleDueDate;
        this.e = lastInstalmentOldDueDate;
        this.f = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardAnticipationConfirmationScreenContract$InputData)) {
            return false;
        }
        CreditCardAnticipationConfirmationScreenContract$InputData creditCardAnticipationConfirmationScreenContract$InputData = (CreditCardAnticipationConfirmationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69441a, creditCardAnticipationConfirmationScreenContract$InputData.f69441a) && Intrinsics.f(this.f69442b, creditCardAnticipationConfirmationScreenContract$InputData.f69442b) && Intrinsics.f(this.f69443c, creditCardAnticipationConfirmationScreenContract$InputData.f69443c) && Intrinsics.f(this.d, creditCardAnticipationConfirmationScreenContract$InputData.d) && Intrinsics.f(this.e, creditCardAnticipationConfirmationScreenContract$InputData.e) && this.f == creditCardAnticipationConfirmationScreenContract$InputData.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + y.a(y.a((this.f69443c.hashCode() + p.a.c(this.f69441a.hashCode() * 31, 31, this.f69442b)) * 31, 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69441a);
        dest.writeString(this.f69442b);
        dest.writeParcelable(this.f69443c, i);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeString(this.f.name());
    }
}
