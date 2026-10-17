package com.revolut.retail.feature.payments.peer_to_peer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PeerToPeerTransferWithPreloadDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PeerToPeerTransferWithPreloadDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PeerToPeerTransferWithPreloadDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreloadScenario f102296a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PeerToPeerTransferWithPreloadDestination((PreloadScenario) parcel.readParcelable(PeerToPeerTransferWithPreloadDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PeerToPeerTransferWithPreloadDestination[i];
        }
    }

    public PeerToPeerTransferWithPreloadDestination(PreloadScenario preloadScenario) {
        Intrinsics.checkNotNullParameter(preloadScenario, "preloadScenario");
        this.f102296a = preloadScenario;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PreloadScenario getF102296a() {
        return this.f102296a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PeerToPeerTransferWithPreloadDestination) && Intrinsics.f(this.f102296a, ((PeerToPeerTransferWithPreloadDestination) obj2).f102296a);
    }

    public final int hashCode() {
        return this.f102296a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f102296a, i);
    }
}
