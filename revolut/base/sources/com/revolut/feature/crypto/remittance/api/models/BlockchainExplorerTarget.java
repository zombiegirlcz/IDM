package com.revolut.feature.crypto.remittance.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/models/BlockchainExplorerTarget;", "Landroid/os/Parcelable;", "DirectUrl", "Config", "Lcom/revolut/feature/crypto/remittance/api/models/BlockchainExplorerTarget$Config;", "Lcom/revolut/feature/crypto/remittance/api/models/BlockchainExplorerTarget$DirectUrl;", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BlockchainExplorerTarget extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/models/BlockchainExplorerTarget$Config;", "Lcom/revolut/feature/crypto/remittance/api/models/BlockchainExplorerTarget;", "", "toString", "()Ljava/lang/String;", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Config implements BlockchainExplorerTarget {

        @NotNull
        public static final Parcelable.Creator<Config> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f70928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wk5.a f70929b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Config(wk5.a.valueOf(parcel.readString()), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Config[i];
            }
        }

        public Config(wk5.a blockchain, b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(blockchain, "blockchain");
            this.f70928a = currency;
            this.f70929b = blockchain;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Config)) {
                return false;
            }
            Config config = (Config) obj2;
            return Intrinsics.f(this.f70928a, config.f70928a) && this.f70929b == config.f70929b;
        }

        public final int hashCode() {
            return this.f70929b.hashCode() + (this.f70928a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70928a);
            dest.writeString(this.f70929b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/remittance/api/models/BlockchainExplorerTarget$DirectUrl;", "Lcom/revolut/feature/crypto/remittance/api/models/BlockchainExplorerTarget;", "", "toString", "()Ljava/lang/String;", "feature_crypto_remittance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DirectUrl implements BlockchainExplorerTarget {

        @NotNull
        public static final Parcelable.Creator<DirectUrl> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70930a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectUrl(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DirectUrl[i];
            }
        }

        public DirectUrl(String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f70930a = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DirectUrl) && Intrinsics.f(this.f70930a, ((DirectUrl) obj2).f70930a);
        }

        public final int hashCode() {
            return this.f70930a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70930a);
        }
    }
}
