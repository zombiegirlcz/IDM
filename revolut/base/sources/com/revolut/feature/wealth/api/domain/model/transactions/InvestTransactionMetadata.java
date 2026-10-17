package com.revolut.feature.wealth.api.domain.model.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/transactions/InvestTransactionMetadata;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestTransactionMetadata implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InvestTransactionMetadata> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TradingLegalEntityInformation f95318b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestTransactionMetadata(parcel.readString(), (TradingLegalEntityInformation) parcel.readParcelable(InvestTransactionMetadata.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestTransactionMetadata[i];
        }
    }

    public InvestTransactionMetadata(String currentUserId, TradingLegalEntityInformation tradingLegalEntityInformation) {
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        this.f95317a = currentUserId;
        this.f95318b = tradingLegalEntityInformation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestTransactionMetadata)) {
            return false;
        }
        InvestTransactionMetadata investTransactionMetadata = (InvestTransactionMetadata) obj2;
        return Intrinsics.f(this.f95317a, investTransactionMetadata.f95317a) && Intrinsics.f(this.f95318b, investTransactionMetadata.f95318b);
    }

    public final int hashCode() {
        int iHashCode = this.f95317a.hashCode() * 31;
        TradingLegalEntityInformation tradingLegalEntityInformation = this.f95318b;
        return iHashCode + (tradingLegalEntityInformation == null ? 0 : tradingLegalEntityInformation.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95317a);
        dest.writeParcelable(this.f95318b, i);
    }
}
