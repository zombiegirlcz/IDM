package com.revolut.feature.crypto.config.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/config/api/models/CryptoPeggedPair;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoPeggedPair implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoPeggedPair> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f70777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f70778b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoPeggedPair((b) parcel.readSerializable(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoPeggedPair[i];
        }
    }

    public CryptoPeggedPair(b from, b to6) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f70777a = from;
        this.f70778b = to6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoPeggedPair)) {
            return false;
        }
        CryptoPeggedPair cryptoPeggedPair = (CryptoPeggedPair) obj2;
        return Intrinsics.f(this.f70777a, cryptoPeggedPair.f70777a) && Intrinsics.f(this.f70778b, cryptoPeggedPair.f70778b);
    }

    public final int hashCode() {
        return this.f70778b.hashCode() + (this.f70777a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f70777a);
        dest.writeSerializable(this.f70778b);
    }
}
