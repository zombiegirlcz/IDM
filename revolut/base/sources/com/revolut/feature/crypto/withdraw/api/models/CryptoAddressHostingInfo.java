package com.revolut.feature.crypto.withdraw.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wk5.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/models/CryptoAddressHostingInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoAddressHostingInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoAddressHostingInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f71078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoAddressRecipientDetails f71080c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoAddressHostingInfo(h.valueOf(parcel.readString()), parcel.readString(), (CryptoAddressRecipientDetails) parcel.readParcelable(CryptoAddressHostingInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoAddressHostingInfo[i];
        }
    }

    public CryptoAddressHostingInfo(h hostingType, String hostingPlatform, CryptoAddressRecipientDetails details) {
        Intrinsics.checkNotNullParameter(hostingType, "hostingType");
        Intrinsics.checkNotNullParameter(hostingPlatform, "hostingPlatform");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f71078a = hostingType;
        this.f71079b = hostingPlatform;
        this.f71080c = details;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoAddressHostingInfo)) {
            return false;
        }
        CryptoAddressHostingInfo cryptoAddressHostingInfo = (CryptoAddressHostingInfo) obj2;
        return this.f71078a == cryptoAddressHostingInfo.f71078a && Intrinsics.f(this.f71079b, cryptoAddressHostingInfo.f71079b) && Intrinsics.f(this.f71080c, cryptoAddressHostingInfo.f71080c);
    }

    public final int hashCode() {
        return this.f71080c.hashCode() + p.a.c(this.f71078a.hashCode() * 31, 31, this.f71079b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71078a.name());
        dest.writeString(this.f71079b);
        dest.writeParcelable(this.f71080c, i);
    }
}
