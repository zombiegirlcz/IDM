package com.revolut.feature.credit.card.impl.ui.topup;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/topup/CreditCardTopupScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardTopupScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardTopupScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f69782b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardTopupScreenContract$InputData((d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardTopupScreenContract$InputData[i];
        }
    }

    public CreditCardTopupScreenContract$InputData(d dVar, String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f69781a = facilityId;
        this.f69782b = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardTopupScreenContract$InputData)) {
            return false;
        }
        CreditCardTopupScreenContract$InputData creditCardTopupScreenContract$InputData = (CreditCardTopupScreenContract$InputData) obj2;
        return Intrinsics.f(this.f69781a, creditCardTopupScreenContract$InputData.f69781a) && Intrinsics.f(this.f69782b, creditCardTopupScreenContract$InputData.f69782b);
    }

    public final int hashCode() {
        int iHashCode = this.f69781a.hashCode() * 31;
        d dVar = this.f69782b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69781a);
        dest.writeSerializable(this.f69782b);
    }
}
