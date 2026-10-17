package com.revolut.feature.support.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uce.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/support/api/navigation/CardDeliveryTroubleshootingDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_support_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDeliveryTroubleshootingDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CardDeliveryTroubleshootingDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardDeliveryTroubleshootingFeatureFlow f89346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89347c;
    public final AccountId d;
    public final c e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardDeliveryTroubleshootingDestination(parcel.readString(), CardDeliveryTroubleshootingFeatureFlow.CREATOR.createFromParcel(parcel), parcel.readString(), (AccountId) parcel.readParcelable(CardDeliveryTroubleshootingDestination.class.getClassLoader()), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDeliveryTroubleshootingDestination[i];
        }
    }

    public CardDeliveryTroubleshootingDestination(String cardId, CardDeliveryTroubleshootingFeatureFlow flow, String str, AccountId accountId, c neverReceivedCardMode) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(neverReceivedCardMode, "neverReceivedCardMode");
        this.f89345a = cardId;
        this.f89346b = flow;
        this.f89347c = str;
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
        if (!(obj2 instanceof CardDeliveryTroubleshootingDestination)) {
            return false;
        }
        CardDeliveryTroubleshootingDestination cardDeliveryTroubleshootingDestination = (CardDeliveryTroubleshootingDestination) obj2;
        return Intrinsics.f(this.f89345a, cardDeliveryTroubleshootingDestination.f89345a) && this.f89346b == cardDeliveryTroubleshootingDestination.f89346b && Intrinsics.f(this.f89347c, cardDeliveryTroubleshootingDestination.f89347c) && Intrinsics.f(this.d, cardDeliveryTroubleshootingDestination.d) && this.e == cardDeliveryTroubleshootingDestination.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f89346b.hashCode() + (this.f89345a.hashCode() * 31)) * 31;
        String str = this.f89347c;
        return this.e.hashCode() + l.b(this.d, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89345a);
        this.f89346b.writeToParcel(dest, i);
        dest.writeString(this.f89347c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
    }
}
