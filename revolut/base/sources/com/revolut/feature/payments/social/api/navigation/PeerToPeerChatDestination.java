package com.revolut.feature.payments.social.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/api/navigation/PeerToPeerChatDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PeerToPeerChatDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PeerToPeerChatDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f79728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferMoneyPocket f79729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f79730c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PeerToPeerChatDestination((zm3.a) parcel.readSerializable(), (TransferMoneyPocket) parcel.readParcelable(PeerToPeerChatDestination.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PeerToPeerChatDestination[i];
        }
    }

    public PeerToPeerChatDestination(zm3.a contact, TransferMoneyPocket transferMoneyPocket, boolean z) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f79728a = contact;
        this.f79729b = transferMoneyPocket;
        this.f79730c = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final zm3.a getF79728a() {
        return this.f79728a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TransferMoneyPocket getF79729b() {
        return this.f79729b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getF79730c() {
        return this.f79730c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PeerToPeerChatDestination)) {
            return false;
        }
        PeerToPeerChatDestination peerToPeerChatDestination = (PeerToPeerChatDestination) obj2;
        return Intrinsics.f(this.f79728a, peerToPeerChatDestination.f79728a) && Intrinsics.f(this.f79729b, peerToPeerChatDestination.f79729b) && this.f79730c == peerToPeerChatDestination.f79730c;
    }

    public final int hashCode() {
        int iHashCode = this.f79728a.hashCode() * 31;
        TransferMoneyPocket transferMoneyPocket = this.f79729b;
        return Boolean.hashCode(this.f79730c) + ((iHashCode + (transferMoneyPocket == null ? 0 : transferMoneyPocket.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f79728a);
        dest.writeParcelable(this.f79729b, i);
        dest.writeInt(this.f79730c ? 1 : 0);
    }
}
