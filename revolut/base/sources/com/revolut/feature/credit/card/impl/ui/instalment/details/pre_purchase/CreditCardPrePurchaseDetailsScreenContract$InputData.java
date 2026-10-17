package com.revolut.feature.credit.card.impl.ui.instalment.details.pre_purchase;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/details/pre_purchase/CreditCardPrePurchaseDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardPrePurchaseDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardPrePurchaseDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f69385c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardPrePurchaseDetailsScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardPrePurchaseDetailsScreenContract$InputData[i];
        }
    }

    public CreditCardPrePurchaseDetailsScreenContract$InputData(String facilityId, String planId, boolean z) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f69383a = facilityId;
        this.f69384b = planId;
        this.f69385c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardPrePurchaseDetailsScreenContract$InputData)) {
            return false;
        }
        CreditCardPrePurchaseDetailsScreenContract$InputData creditCardPrePurchaseDetailsScreenContract$InputData = (CreditCardPrePurchaseDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69383a, creditCardPrePurchaseDetailsScreenContract$InputData.f69383a) && Intrinsics.f(this.f69384b, creditCardPrePurchaseDetailsScreenContract$InputData.f69384b) && this.f69385c == creditCardPrePurchaseDetailsScreenContract$InputData.f69385c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69385c) + p.a.c(this.f69383a.hashCode() * 31, 31, this.f69384b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69383a);
        dest.writeString(this.f69384b);
        dest.writeInt(this.f69385c ? 1 : 0);
    }
}
