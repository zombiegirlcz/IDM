package com.revolut.retail.feature.payments.peer_to_peer.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/models/PeerToPeerCustomization;", "Landroid/os/Parcelable;", "Gif", "Personalisation", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/models/PeerToPeerCustomization$Gif;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/models/PeerToPeerCustomization$Personalisation;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PeerToPeerCustomization extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/models/PeerToPeerCustomization$Gif;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/models/PeerToPeerCustomization;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Gif implements PeerToPeerCustomization {

        @NotNull
        public static final Parcelable.Creator<Gif> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102242a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Gif(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gif[i];
            }
        }

        public Gif(String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f102242a = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Gif) && Intrinsics.f(this.f102242a, ((Gif) obj2).f102242a);
        }

        public final int hashCode() {
            return this.f102242a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102242a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/models/PeerToPeerCustomization$Personalisation;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/models/PeerToPeerCustomization;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Personalisation implements PeerToPeerCustomization {

        @NotNull
        public static final Parcelable.Creator<Personalisation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final P2pPersonalisation f102243a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Personalisation((P2pPersonalisation) parcel.readParcelable(Personalisation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personalisation[i];
            }
        }

        public Personalisation(P2pPersonalisation personalisation) {
            Intrinsics.checkNotNullParameter(personalisation, "personalisation");
            this.f102243a = personalisation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Personalisation) && Intrinsics.f(this.f102243a, ((Personalisation) obj2).f102243a);
        }

        public final int hashCode() {
            return this.f102243a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102243a, i);
        }
    }
}
