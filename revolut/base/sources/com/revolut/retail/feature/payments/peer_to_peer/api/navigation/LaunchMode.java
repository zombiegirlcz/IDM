package com.revolut.retail.feature.payments.peer_to_peer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/LaunchMode;", "Landroid/os/Parcelable;", "AsController", "AsDestination", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/LaunchMode$AsController;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/LaunchMode$AsDestination;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LaunchMode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/LaunchMode$AsController;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/LaunchMode;", "", "toString", "()Ljava/lang/String;", "com/revolut/retail/feature/payments/peer_to_peer/api/navigation/a", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AsController implements LaunchMode {

        @NotNull
        public static final Parcelable.Creator<AsController> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.retail.feature.payments.peer_to_peer.api.navigation.a f102266a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AsController(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AsController[i];
            }
        }

        public AsController() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AsController) && this.f102266a == ((AsController) obj2).f102266a;
        }

        public final int hashCode() {
            return this.f102266a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102266a.name());
        }

        public AsController(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.a successType) {
            Intrinsics.checkNotNullParameter(successType, "successType");
            this.f102266a = successType;
        }

        public /* synthetic */ AsController(int i) {
            this(com.revolut.retail.feature.payments.peer_to_peer.api.navigation.a.ANIMATION_WITH_STATUS_FALLBACK);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/LaunchMode$AsDestination;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/LaunchMode;", "<init>", "()V", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AsDestination implements LaunchMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AsDestination f102267a = new AsDestination();

        @NotNull
        public static final Parcelable.Creator<AsDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AsDestination.f102267a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AsDestination[i];
            }
        }

        private AsDestination() {
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
