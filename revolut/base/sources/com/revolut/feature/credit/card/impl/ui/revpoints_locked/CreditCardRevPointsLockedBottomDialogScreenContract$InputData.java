package com.revolut.feature.credit.card.impl.ui.revpoints_locked;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/revpoints_locked/CreditCardRevPointsLockedBottomDialogScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardRevPointsLockedBottomDialogScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardRevPointsLockedBottomDialogScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f69629b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardRevPointsLockedBottomDialogScreenContract$InputData((d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardRevPointsLockedBottomDialogScreenContract$InputData[i];
        }
    }

    public CreditCardRevPointsLockedBottomDialogScreenContract$InputData(d overdueMoney, String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(overdueMoney, "overdueMoney");
        this.f69628a = facilityId;
        this.f69629b = overdueMoney;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardRevPointsLockedBottomDialogScreenContract$InputData)) {
            return false;
        }
        CreditCardRevPointsLockedBottomDialogScreenContract$InputData creditCardRevPointsLockedBottomDialogScreenContract$InputData = (CreditCardRevPointsLockedBottomDialogScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69628a, creditCardRevPointsLockedBottomDialogScreenContract$InputData.f69628a) && Intrinsics.f(this.f69629b, creditCardRevPointsLockedBottomDialogScreenContract$InputData.f69629b);
    }

    public final int hashCode() {
        return this.f69629b.hashCode() + (this.f69628a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69628a);
        dest.writeSerializable(this.f69629b);
    }
}
