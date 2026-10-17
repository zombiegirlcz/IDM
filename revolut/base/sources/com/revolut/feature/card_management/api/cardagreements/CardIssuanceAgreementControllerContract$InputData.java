package com.revolut.feature.card_management.api.cardagreements;

import android.os.Parcel;
import android.os.Parcelable;
import c93.e;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_management/api/cardagreements/CardIssuanceAgreementControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardIssuanceAgreementControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardIssuanceAgreementControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f64799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f64800b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardIssuanceAgreementControllerContract$InputData((b) parcel.readSerializable(), e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardIssuanceAgreementControllerContract$InputData[i];
        }
    }

    public CardIssuanceAgreementControllerContract$InputData(b userCountryCode, e cardType) {
        Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        this.f64799a = userCountryCode;
        this.f64800b = cardType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardIssuanceAgreementControllerContract$InputData)) {
            return false;
        }
        CardIssuanceAgreementControllerContract$InputData cardIssuanceAgreementControllerContract$InputData = (CardIssuanceAgreementControllerContract$InputData) obj2;
        return Intrinsics.f(this.f64799a, cardIssuanceAgreementControllerContract$InputData.f64799a) && this.f64800b == cardIssuanceAgreementControllerContract$InputData.f64800b;
    }

    public final int hashCode() {
        return this.f64800b.hashCode() + (this.f64799a.f297794a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f64799a);
        dest.writeString(this.f64800b.name());
    }
}
