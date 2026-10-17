package com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.prepay_schedule;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/repay/anticipation/prepay_schedule/CreditCardAnticipationPrepayScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardAnticipationPrepayScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardAnticipationPrepayScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f69457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f69458b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CreditCardAnticipationPrepayScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new CreditCardAnticipationPrepayScreenContract$InputData((LocalDate) parcel.readSerializable(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardAnticipationPrepayScreenContract$InputData[i];
        }
    }

    public CreditCardAnticipationPrepayScreenContract$InputData(LocalDate currentCycleDueDate, ArrayList discounts) {
        Intrinsics.checkNotNullParameter(discounts, "discounts");
        Intrinsics.checkNotNullParameter(currentCycleDueDate, "currentCycleDueDate");
        this.f69457a = discounts;
        this.f69458b = currentCycleDueDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardAnticipationPrepayScreenContract$InputData)) {
            return false;
        }
        CreditCardAnticipationPrepayScreenContract$InputData creditCardAnticipationPrepayScreenContract$InputData = (CreditCardAnticipationPrepayScreenContract$InputData) obj2;
        return this.f69457a.equals(creditCardAnticipationPrepayScreenContract$InputData.f69457a) && Intrinsics.f(this.f69458b, creditCardAnticipationPrepayScreenContract$InputData.f69458b);
    }

    public final int hashCode() {
        return this.f69458b.hashCode() + (this.f69457a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f69457a, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeSerializable(this.f69458b);
    }
}
