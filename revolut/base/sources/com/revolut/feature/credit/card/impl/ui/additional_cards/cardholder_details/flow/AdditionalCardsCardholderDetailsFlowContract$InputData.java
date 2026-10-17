package com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/additional_cards/cardholder_details/flow/AdditionalCardsCardholderDetailsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalCardsCardholderDetailsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AdditionalCardsCardholderDetailsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69010c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdditionalCardsCardholderDetailsFlowContract$InputData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalCardsCardholderDetailsFlowContract$InputData[i];
        }
    }

    public AdditionalCardsCardholderDetailsFlowContract$InputData(String facilityId, String cardholderId, String userName) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        this.f69008a = facilityId;
        this.f69009b = cardholderId;
        this.f69010c = userName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalCardsCardholderDetailsFlowContract$InputData)) {
            return false;
        }
        AdditionalCardsCardholderDetailsFlowContract$InputData additionalCardsCardholderDetailsFlowContract$InputData = (AdditionalCardsCardholderDetailsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f69008a, additionalCardsCardholderDetailsFlowContract$InputData.f69008a) && Intrinsics.f(this.f69009b, additionalCardsCardholderDetailsFlowContract$InputData.f69009b) && Intrinsics.f(this.f69010c, additionalCardsCardholderDetailsFlowContract$InputData.f69010c);
    }

    public final int hashCode() {
        return this.f69010c.hashCode() + p.a.c(this.f69008a.hashCode() * 31, 31, this.f69009b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69008a);
        dest.writeString(this.f69009b);
        dest.writeString(this.f69010c);
    }
}
