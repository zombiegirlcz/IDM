package com.revolut.feature.transfer.core.api.ui.throubleshooter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferTroubleshooterType;", "Landroid/os/Parcelable;", "Card", "Bank", "PeerToPeer", "Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferTroubleshooterType$Bank;", "Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferTroubleshooterType$Card;", "Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferTroubleshooterType$PeerToPeer;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferTroubleshooterType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferTroubleshooterType$Bank;", "Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferTroubleshooterType;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/transfer/core/api/ui/throubleshooter/a", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Bank implements TransferTroubleshooterType {

        @NotNull
        public static final Parcelable.Creator<Bank> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.feature.transfer.core.api.ui.throubleshooter.a f92176a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Bank(com.revolut.feature.transfer.core.api.ui.throubleshooter.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Bank[i];
            }
        }

        public Bank(com.revolut.feature.transfer.core.api.ui.throubleshooter.a mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f92176a = mode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Bank) && this.f92176a == ((Bank) obj2).f92176a;
        }

        public final int hashCode() {
            return this.f92176a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92176a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferTroubleshooterType$Card;", "Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferTroubleshooterType;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/transfer/core/api/ui/throubleshooter/b", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Card implements TransferTroubleshooterType {

        @NotNull
        public static final Parcelable.Creator<Card> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f92177a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Card(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Card[i];
            }
        }

        public Card(b mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f92177a = mode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Card) && this.f92177a == ((Card) obj2).f92177a;
        }

        public final int hashCode() {
            return this.f92177a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92177a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferTroubleshooterType$PeerToPeer;", "Lcom/revolut/feature/transfer/core/api/ui/throubleshooter/TransferTroubleshooterType;", "<init>", "()V", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PeerToPeer implements TransferTroubleshooterType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PeerToPeer f92178a = new PeerToPeer();

        @NotNull
        public static final Parcelable.Creator<PeerToPeer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PeerToPeer.f92178a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PeerToPeer[i];
            }
        }

        private PeerToPeer() {
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
