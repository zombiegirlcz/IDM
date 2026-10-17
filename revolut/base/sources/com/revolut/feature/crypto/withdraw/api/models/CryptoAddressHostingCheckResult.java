package com.revolut.feature.crypto.withdraw.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wk5.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/models/CryptoAddressHostingCheckResult;", "Landroid/os/Parcelable;", "Found", "NotFound", "Lcom/revolut/feature/crypto/withdraw/api/models/CryptoAddressHostingCheckResult$Found;", "Lcom/revolut/feature/crypto/withdraw/api/models/CryptoAddressHostingCheckResult$NotFound;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoAddressHostingCheckResult extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/models/CryptoAddressHostingCheckResult$Found;", "Lcom/revolut/feature/crypto/withdraw/api/models/CryptoAddressHostingCheckResult;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Found implements CryptoAddressHostingCheckResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f71073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f71074c;
        public final boolean d;

        @NotNull
        public static final Parcelable.Creator<Found> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Found(parcel.readString(), h.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Found[i];
            }
        }

        public Found(String hostingPlatform, h hostingType, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(hostingPlatform, "hostingPlatform");
            Intrinsics.checkNotNullParameter(hostingType, "hostingType");
            this.f71072a = hostingPlatform;
            this.f71073b = hostingType;
            this.f71074c = z;
            this.d = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Found)) {
                return false;
            }
            Found found = (Found) obj2;
            return Intrinsics.f(this.f71072a, found.f71072a) && this.f71073b == found.f71073b && this.f71074c == found.f71074c && this.d == found.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c((this.f71073b.hashCode() + (this.f71072a.hashCode() * 31)) * 31, 31, this.f71074c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71072a);
            dest.writeString(this.f71073b.name());
            dest.writeInt(this.f71074c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/models/CryptoAddressHostingCheckResult$NotFound;", "Lcom/revolut/feature/crypto/withdraw/api/models/CryptoAddressHostingCheckResult;", "<init>", "()V", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotFound implements CryptoAddressHostingCheckResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotFound f71075a = new NotFound();

        @NotNull
        public static final Parcelable.Creator<NotFound> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotFound.f71075a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotFound[i];
            }
        }

        private NotFound() {
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
