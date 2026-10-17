package com.revolut.retail.feature.payments.peer_to_peer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.ContactTargetAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerRecipient;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PeerToPeerRecipient implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PeerToPeerRecipient> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f102270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContactTargetAccount f102271b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PeerToPeerRecipient((zm3.a) parcel.readSerializable(), (ContactTargetAccount) parcel.readParcelable(PeerToPeerRecipient.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PeerToPeerRecipient[i];
        }
    }

    public PeerToPeerRecipient(zm3.a contact, ContactTargetAccount contactTargetAccount) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(contactTargetAccount, "contactTargetAccount");
        this.f102270a = contact;
        this.f102271b = contactTargetAccount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PeerToPeerRecipient)) {
            return false;
        }
        PeerToPeerRecipient peerToPeerRecipient = (PeerToPeerRecipient) obj2;
        return Intrinsics.f(this.f102270a, peerToPeerRecipient.f102270a) && Intrinsics.f(this.f102271b, peerToPeerRecipient.f102271b);
    }

    public final int hashCode() {
        return this.f102271b.hashCode() + (this.f102270a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f102270a);
        dest.writeParcelable(this.f102271b, i);
    }

    public /* synthetic */ PeerToPeerRecipient(zm3.a aVar) {
        this(aVar, ContactTargetAccount.PersonalAccount.f102259a);
    }
}
