package com.revolut.feature.tab.crypto.impl.ui.settings.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/crypto/impl/ui/settings/models/CryptoSpareChangeInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoSpareChangeInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoSpareChangeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f89809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f89810b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoSpareChangeInfo((b) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoSpareChangeInfo[i];
        }
    }

    public CryptoSpareChangeInfo(b bVar, Integer num) {
        this.f89809a = bVar;
        this.f89810b = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoSpareChangeInfo)) {
            return false;
        }
        CryptoSpareChangeInfo cryptoSpareChangeInfo = (CryptoSpareChangeInfo) obj2;
        return Intrinsics.f(this.f89809a, cryptoSpareChangeInfo.f89809a) && Intrinsics.f(this.f89810b, cryptoSpareChangeInfo.f89810b);
    }

    public final int hashCode() {
        b bVar = this.f89809a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        Integer num = this.f89810b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f89809a);
        Integer num = this.f89810b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }

    public CryptoSpareChangeInfo() {
        this(null, null);
    }
}
