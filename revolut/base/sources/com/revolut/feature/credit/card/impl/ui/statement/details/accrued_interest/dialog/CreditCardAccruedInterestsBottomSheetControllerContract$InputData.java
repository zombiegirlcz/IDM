package com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$AccruedInterest;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/statement/details/accrued_interest/dialog/CreditCardAccruedInterestsBottomSheetControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardAccruedInterestsBottomSheetControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardAccruedInterestsBottomSheetControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditCardInAppStatement$AccruedInterest f69673b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardAccruedInterestsBottomSheetControllerContract$InputData(parcel.readString(), (CreditCardInAppStatement$AccruedInterest) parcel.readParcelable(CreditCardAccruedInterestsBottomSheetControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardAccruedInterestsBottomSheetControllerContract$InputData[i];
        }
    }

    public CreditCardAccruedInterestsBottomSheetControllerContract$InputData(String facilityId, CreditCardInAppStatement$AccruedInterest interest) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(interest, "interest");
        this.f69672a = facilityId;
        this.f69673b = interest;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardAccruedInterestsBottomSheetControllerContract$InputData)) {
            return false;
        }
        CreditCardAccruedInterestsBottomSheetControllerContract$InputData creditCardAccruedInterestsBottomSheetControllerContract$InputData = (CreditCardAccruedInterestsBottomSheetControllerContract$InputData) obj2;
        return Intrinsics.f(this.f69672a, creditCardAccruedInterestsBottomSheetControllerContract$InputData.f69672a) && Intrinsics.f(this.f69673b, creditCardAccruedInterestsBottomSheetControllerContract$InputData.f69673b);
    }

    public final int hashCode() {
        return this.f69673b.hashCode() + (this.f69672a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69672a);
        dest.writeParcelable(this.f69673b, i);
    }
}
