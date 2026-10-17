package com.revolut.feature.crypto.convert.disclaimer.api.footer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto/convert/disclaimer/api/footer/CryptoConvertFooterDisclaimerDelegate$ClickTextParcel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_convert_disclaimer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoConvertFooterDisclaimerDelegate$ClickTextParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoConvertFooterDisclaimerDelegate$ClickTextParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70781a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoConvertFooterDisclaimerDelegate$ClickTextParcel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoConvertFooterDisclaimerDelegate$ClickTextParcel[i];
        }
    }

    public CryptoConvertFooterDisclaimerDelegate$ClickTextParcel(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f70781a = id10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CryptoConvertFooterDisclaimerDelegate$ClickTextParcel) && Intrinsics.f(this.f70781a, ((CryptoConvertFooterDisclaimerDelegate$ClickTextParcel) obj2).f70781a);
    }

    public final int hashCode() {
        return this.f70781a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70781a);
    }
}
