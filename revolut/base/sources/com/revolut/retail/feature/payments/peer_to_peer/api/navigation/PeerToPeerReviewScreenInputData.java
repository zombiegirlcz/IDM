package com.revolut.retail.feature.payments.peer_to_peer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerReviewScreenInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "AdditionalConfig", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PeerToPeerReviewScreenInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PeerToPeerReviewScreenInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PeerToPeerRecipient f102272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferFlowType f102273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PeerToPeerTransferData f102274c;
    public final p d;
    public final Set e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerReviewScreenInputData$AdditionalConfig;", "Landroid/os/Parcelable;", "ContinueMode", "DisableReference", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerReviewScreenInputData$AdditionalConfig$ContinueMode;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerReviewScreenInputData$AdditionalConfig$DisableReference;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface AdditionalConfig extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerReviewScreenInputData$AdditionalConfig$ContinueMode;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerReviewScreenInputData$AdditionalConfig;", "<init>", "()V", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ContinueMode implements AdditionalConfig {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ContinueMode f102275a = new ContinueMode();

            @NotNull
            public static final Parcelable.Creator<ContinueMode> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ContinueMode.f102275a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ContinueMode[i];
                }
            }

            private ContinueMode() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerReviewScreenInputData$AdditionalConfig$DisableReference;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerReviewScreenInputData$AdditionalConfig;", "<init>", "()V", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class DisableReference implements AdditionalConfig {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final DisableReference f102276a = new DisableReference();

            @NotNull
            public static final Parcelable.Creator<DisableReference> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return DisableReference.f102276a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DisableReference[i];
                }
            }

            private DisableReference() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            PeerToPeerRecipient peerToPeerRecipientCreateFromParcel = PeerToPeerRecipient.CREATOR.createFromParcel(parcel);
            TransferFlowType transferFlowType = (TransferFlowType) parcel.readParcelable(PeerToPeerReviewScreenInputData.class.getClassLoader());
            PeerToPeerTransferData peerToPeerTransferDataCreateFromParcel = PeerToPeerTransferData.CREATOR.createFromParcel(parcel);
            p pVar = (p) parcel.readSerializable();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(PeerToPeerReviewScreenInputData.class, parcel, linkedHashSet, iE, 1);
            }
            return new PeerToPeerReviewScreenInputData(peerToPeerRecipientCreateFromParcel, transferFlowType, peerToPeerTransferDataCreateFromParcel, pVar, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PeerToPeerReviewScreenInputData[i];
        }
    }

    public PeerToPeerReviewScreenInputData(PeerToPeerRecipient recipient, TransferFlowType flowType, PeerToPeerTransferData transferData, p pVar, Set additionalConfiguration) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(additionalConfiguration, "additionalConfiguration");
        this.f102272a = recipient;
        this.f102273b = flowType;
        this.f102274c = transferData;
        this.d = pVar;
        this.e = additionalConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PeerToPeerReviewScreenInputData)) {
            return false;
        }
        PeerToPeerReviewScreenInputData peerToPeerReviewScreenInputData = (PeerToPeerReviewScreenInputData) obj2;
        return Intrinsics.f(this.f102272a, peerToPeerReviewScreenInputData.f102272a) && Intrinsics.f(this.f102273b, peerToPeerReviewScreenInputData.f102273b) && Intrinsics.f(this.f102274c, peerToPeerReviewScreenInputData.f102274c) && Intrinsics.f(this.d, peerToPeerReviewScreenInputData.d) && Intrinsics.f(this.e, peerToPeerReviewScreenInputData.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f102274c.hashCode() + d.c(this.f102273b, this.f102272a.hashCode() * 31, 31)) * 31;
        p pVar = this.d;
        return this.e.hashCode() + ((iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f102272a.writeToParcel(dest, i);
        dest.writeParcelable(this.f102273b, i);
        this.f102274c.writeToParcel(dest, i);
        dest.writeSerializable(this.d);
        Iterator itV = n.v(this.e, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
