package com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/social/impl/presentation/p2p_kompot/screen/PeerToPeerChatScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PeerToPeerChatScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PeerToPeerChatScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f79768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferMoneyPocket f79769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f79770c;
    public final NavBarWithContainerBackground d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PeerToPeerChatScreenContract$InputData((zm3.a) parcel.readSerializable(), (TransferMoneyPocket) parcel.readParcelable(PeerToPeerChatScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, (NavBarWithContainerBackground) parcel.readParcelable(PeerToPeerChatScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PeerToPeerChatScreenContract$InputData[i];
        }
    }

    public PeerToPeerChatScreenContract$InputData(zm3.a contact, TransferMoneyPocket transferMoneyPocket, boolean z, NavBarWithContainerBackground navBarWithContainerBackground) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f79768a = contact;
        this.f79769b = transferMoneyPocket;
        this.f79770c = z;
        this.d = navBarWithContainerBackground;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PeerToPeerChatScreenContract$InputData)) {
            return false;
        }
        PeerToPeerChatScreenContract$InputData peerToPeerChatScreenContract$InputData = (PeerToPeerChatScreenContract$InputData) obj2;
        return Intrinsics.f(this.f79768a, peerToPeerChatScreenContract$InputData.f79768a) && Intrinsics.f(this.f79769b, peerToPeerChatScreenContract$InputData.f79769b) && this.f79770c == peerToPeerChatScreenContract$InputData.f79770c && Intrinsics.f(this.d, peerToPeerChatScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f79768a.hashCode() * 31;
        TransferMoneyPocket transferMoneyPocket = this.f79769b;
        int iC = j6.a.c((iHashCode + (transferMoneyPocket == null ? 0 : transferMoneyPocket.hashCode())) * 31, 31, this.f79770c);
        NavBarWithContainerBackground navBarWithContainerBackground = this.d;
        return iC + (navBarWithContainerBackground != null ? navBarWithContainerBackground.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f79768a);
        dest.writeParcelable(this.f79769b, i);
        dest.writeInt(this.f79770c ? 1 : 0);
        dest.writeParcelable(this.d, i);
    }
}
