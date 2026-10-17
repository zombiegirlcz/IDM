package com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/social/impl/presentation/p2p_kompot/flow/PeerToPeerChatFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PeerToPeerChatFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PeerToPeerChatFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f79750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferMoneyPocket f79751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f79752c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PeerToPeerChatFlowContract$InputData((zm3.a) parcel.readSerializable(), (TransferMoneyPocket) parcel.readParcelable(PeerToPeerChatFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PeerToPeerChatFlowContract$InputData[i];
        }
    }

    public PeerToPeerChatFlowContract$InputData(zm3.a contact, TransferMoneyPocket transferMoneyPocket, boolean z) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f79750a = contact;
        this.f79751b = transferMoneyPocket;
        this.f79752c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PeerToPeerChatFlowContract$InputData)) {
            return false;
        }
        PeerToPeerChatFlowContract$InputData peerToPeerChatFlowContract$InputData = (PeerToPeerChatFlowContract$InputData) obj2;
        return Intrinsics.f(this.f79750a, peerToPeerChatFlowContract$InputData.f79750a) && Intrinsics.f(this.f79751b, peerToPeerChatFlowContract$InputData.f79751b) && this.f79752c == peerToPeerChatFlowContract$InputData.f79752c;
    }

    public final int hashCode() {
        int iHashCode = this.f79750a.hashCode() * 31;
        TransferMoneyPocket transferMoneyPocket = this.f79751b;
        return Boolean.hashCode(this.f79752c) + ((iHashCode + (transferMoneyPocket == null ? 0 : transferMoneyPocket.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f79750a);
        dest.writeParcelable(this.f79751b, i);
        dest.writeInt(this.f79752c ? 1 : 0);
    }
}
