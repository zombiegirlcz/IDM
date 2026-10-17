package com.revolut.retail.feature.payments.peer_to_peer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PreloadScenario;", "Landroid/os/Parcelable;", "TransferToSubaccount", "TransferToAnonymousSplitLink", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PreloadScenario$TransferToAnonymousSplitLink;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PreloadScenario$TransferToSubaccount;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PreloadScenario extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PreloadScenario$TransferToAnonymousSplitLink;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PreloadScenario;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferToAnonymousSplitLink implements PreloadScenario {

        @NotNull
        public static final Parcelable.Creator<TransferToAnonymousSplitLink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102297a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferToAnonymousSplitLink(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferToAnonymousSplitLink[i];
            }
        }

        public TransferToAnonymousSplitLink(String splitBillLinkDetailsCode) {
            Intrinsics.checkNotNullParameter(splitBillLinkDetailsCode, "splitBillLinkDetailsCode");
            this.f102297a = splitBillLinkDetailsCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransferToAnonymousSplitLink) && Intrinsics.f(this.f102297a, ((TransferToAnonymousSplitLink) obj2).f102297a);
        }

        public final int hashCode() {
            return this.f102297a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102297a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PreloadScenario$TransferToSubaccount;", "Lcom/revolut/retail/feature/payments/peer_to_peer/api/navigation/PreloadScenario;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransferToSubaccount implements PreloadScenario {

        @NotNull
        public static final Parcelable.Creator<TransferToSubaccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102299b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransferToSubaccount(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferToSubaccount[i];
            }
        }

        public TransferToSubaccount(String username, String subaccountLink) {
            Intrinsics.checkNotNullParameter(username, "username");
            Intrinsics.checkNotNullParameter(subaccountLink, "subaccountLink");
            this.f102298a = username;
            this.f102299b = subaccountLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransferToSubaccount)) {
                return false;
            }
            TransferToSubaccount transferToSubaccount = (TransferToSubaccount) obj2;
            return Intrinsics.f(this.f102298a, transferToSubaccount.f102298a) && Intrinsics.f(this.f102299b, transferToSubaccount.f102299b);
        }

        public final int hashCode() {
            return this.f102299b.hashCode() + (this.f102298a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102298a);
            dest.writeString(this.f102299b);
        }
    }
}
