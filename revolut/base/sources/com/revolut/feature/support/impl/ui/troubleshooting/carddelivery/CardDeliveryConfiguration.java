package com.revolut.feature.support.impl.ui.troubleshooting.carddelivery;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uce.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/support/impl/ui/troubleshooting/carddelivery/CardDeliveryConfiguration;", "", "", "toString", "()Ljava/lang/String;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDeliveryConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardDeliveryConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89428c;
    public final AccountId d;
    public final c e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardDeliveryConfiguration(parcel.readString(), parcel.readString(), parcel.readString(), (AccountId) parcel.readParcelable(CardDeliveryConfiguration.class.getClassLoader()), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDeliveryConfiguration[i];
        }
    }

    public CardDeliveryConfiguration(String cardId, String flowName, String walletId, AccountId accountId, c neverReceivedCardMode) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(neverReceivedCardMode, "neverReceivedCardMode");
        this.f89426a = cardId;
        this.f89427b = flowName;
        this.f89428c = walletId;
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
        if (!(obj2 instanceof CardDeliveryConfiguration)) {
            return false;
        }
        CardDeliveryConfiguration cardDeliveryConfiguration = (CardDeliveryConfiguration) obj2;
        return Intrinsics.f(this.f89426a, cardDeliveryConfiguration.f89426a) && Intrinsics.f(this.f89427b, cardDeliveryConfiguration.f89427b) && Intrinsics.f(this.f89428c, cardDeliveryConfiguration.f89428c) && Intrinsics.f(this.d, cardDeliveryConfiguration.d) && this.e == cardDeliveryConfiguration.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + l.b(this.d, p.a.c(p.a.c(this.f89426a.hashCode() * 31, 31, this.f89427b), 31, this.f89428c), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89426a);
        dest.writeString(this.f89427b);
        dest.writeString(this.f89428c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
    }
}
