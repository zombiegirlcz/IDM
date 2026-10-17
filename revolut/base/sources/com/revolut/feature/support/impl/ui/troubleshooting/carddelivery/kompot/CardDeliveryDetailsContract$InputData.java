package com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.support.api.navigation.CardDeliveryTroubleshootingFeatureFlow;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uce.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/support/impl/ui/troubleshooting/carddelivery/kompot/CardDeliveryDetailsContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDeliveryDetailsContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardDeliveryDetailsContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardDeliveryTroubleshootingFeatureFlow f89434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89435c;
    public final AccountId d;
    public final c e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardDeliveryDetailsContract$InputData(parcel.readString(), (CardDeliveryTroubleshootingFeatureFlow) parcel.readParcelable(CardDeliveryDetailsContract$InputData.class.getClassLoader()), parcel.readString(), (AccountId) parcel.readParcelable(CardDeliveryDetailsContract$InputData.class.getClassLoader()), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDeliveryDetailsContract$InputData[i];
        }
    }

    public CardDeliveryDetailsContract$InputData(String cardId, CardDeliveryTroubleshootingFeatureFlow flow, String walletId, AccountId accountId, c neverReceivedCardMode) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(neverReceivedCardMode, "neverReceivedCardMode");
        this.f89433a = cardId;
        this.f89434b = flow;
        this.f89435c = walletId;
        this.d = accountId;
        this.e = neverReceivedCardMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardDeliveryDetailsContract$InputData)) {
            return false;
        }
        CardDeliveryDetailsContract$InputData cardDeliveryDetailsContract$InputData = (CardDeliveryDetailsContract$InputData) obj2;
        return Intrinsics.f(this.f89433a, cardDeliveryDetailsContract$InputData.f89433a) && this.f89434b == cardDeliveryDetailsContract$InputData.f89434b && Intrinsics.f(this.f89435c, cardDeliveryDetailsContract$InputData.f89435c) && Intrinsics.f(this.d, cardDeliveryDetailsContract$InputData.d) && this.e == cardDeliveryDetailsContract$InputData.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + l.b(this.d, p.a.c((this.f89434b.hashCode() + (this.f89433a.hashCode() * 31)) * 31, 31, this.f89435c), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89433a);
        dest.writeParcelable(this.f89434b, i);
        dest.writeString(this.f89435c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
    }
}
