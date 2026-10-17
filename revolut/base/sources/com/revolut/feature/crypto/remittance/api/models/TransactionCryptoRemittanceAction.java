package com.revolut.feature.crypto.remittance.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/models/TransactionCryptoRemittanceAction;", "Landroid/os/Parcelable;", "TransactionHashAction", "AddressAction", "pj5/b", "Lcom/revolut/feature/crypto/remittance/api/models/TransactionCryptoRemittanceAction$AddressAction;", "Lcom/revolut/feature/crypto/remittance/api/models/TransactionCryptoRemittanceAction$TransactionHashAction;", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransactionCryptoRemittanceAction implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockchainExplorerTarget f70931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70932b;

    public TransactionCryptoRemittanceAction(BlockchainExplorerTarget blockchainExplorerTarget, String str) {
        this.f70931a = blockchainExplorerTarget;
        this.f70932b = str;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/models/TransactionCryptoRemittanceAction$AddressAction;", "Lcom/revolut/feature/crypto/remittance/api/models/TransactionCryptoRemittanceAction;", "", "toString", "()Ljava/lang/String;", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressAction extends TransactionCryptoRemittanceAction {

        @NotNull
        public static final Parcelable.Creator<AddressAction> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f70933c;
        public final BlockchainExplorerTarget d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddressAction((BlockchainExplorerTarget) parcel.readParcelable(AddressAction.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressAction[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddressAction(BlockchainExplorerTarget explorerTarget, String address) {
            super(explorerTarget, address);
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(explorerTarget, "explorerTarget");
            this.f70933c = address;
            this.d = explorerTarget;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddressAction)) {
                return false;
            }
            AddressAction addressAction = (AddressAction) obj2;
            return Intrinsics.f(this.f70933c, addressAction.f70933c) && Intrinsics.f(this.d, addressAction.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.f70933c.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70933c);
            dest.writeParcelable(this.d, i);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AddressAction(b currency, wk5.a blockchain, String address) {
            this(new BlockchainExplorerTarget.Config(blockchain, currency), address);
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(blockchain, "blockchain");
            Intrinsics.checkNotNullParameter(address, "address");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/models/TransactionCryptoRemittanceAction$TransactionHashAction;", "Lcom/revolut/feature/crypto/remittance/api/models/TransactionCryptoRemittanceAction;", "", "toString", "()Ljava/lang/String;", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionHashAction extends TransactionCryptoRemittanceAction {

        @NotNull
        public static final Parcelable.Creator<TransactionHashAction> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f70934c;
        public final BlockchainExplorerTarget d;
        public final pj5.b e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionHashAction(parcel.readString(), (BlockchainExplorerTarget) parcel.readParcelable(TransactionHashAction.class.getClassLoader()), pj5.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionHashAction[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionHashAction(String transactionHash, BlockchainExplorerTarget explorerTarget, pj5.b action) {
            super(explorerTarget, transactionHash);
            Intrinsics.checkNotNullParameter(transactionHash, "transactionHash");
            Intrinsics.checkNotNullParameter(explorerTarget, "explorerTarget");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f70934c = transactionHash;
            this.d = explorerTarget;
            this.e = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionHashAction)) {
                return false;
            }
            TransactionHashAction transactionHashAction = (TransactionHashAction) obj2;
            return Intrinsics.f(this.f70934c, transactionHashAction.f70934c) && Intrinsics.f(this.d, transactionHashAction.d) && this.e == transactionHashAction.e;
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + (this.f70934c.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70934c);
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e.name());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TransactionHashAction(b currency, wk5.a blockchain, String transactionHash) {
            pj5.b action = pj5.b.DIALOG;
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(blockchain, "blockchain");
            Intrinsics.checkNotNullParameter(transactionHash, "transactionHash");
            Intrinsics.checkNotNullParameter(action, "action");
            this(transactionHash, new BlockchainExplorerTarget.Config(blockchain, currency), action);
        }
    }
}
