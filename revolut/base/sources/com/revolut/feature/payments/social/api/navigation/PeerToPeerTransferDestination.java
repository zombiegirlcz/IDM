package com.revolut.feature.payments.social.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/api/navigation/PeerToPeerTransferDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PeerToPeerTransferDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PeerToPeerTransferDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f79731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferMoneyPocket f79732b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PeerToPeerTransferDestination((zm3.a) parcel.readSerializable(), (TransferMoneyPocket) parcel.readParcelable(PeerToPeerTransferDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PeerToPeerTransferDestination[i];
        }
    }

    public PeerToPeerTransferDestination(zm3.a contact, TransferMoneyPocket transferMoneyPocket) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(transferMoneyPocket, "transferMoneyPocket");
        this.f79731a = contact;
        this.f79732b = transferMoneyPocket;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final zm3.a getF79731a() {
        return this.f79731a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TransferMoneyPocket getF79732b() {
        return this.f79732b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PeerToPeerTransferDestination)) {
            return false;
        }
        PeerToPeerTransferDestination peerToPeerTransferDestination = (PeerToPeerTransferDestination) obj2;
        return Intrinsics.f(this.f79731a, peerToPeerTransferDestination.f79731a) && Intrinsics.f(this.f79732b, peerToPeerTransferDestination.f79732b);
    }

    public final int hashCode() {
        return this.f79732b.hashCode() + (this.f79731a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f79731a);
        dest.writeParcelable(this.f79732b, i);
    }
}
