package com.revolut.feature.tab.crypto.impl.ui.settings;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tab/crypto/impl/ui/settings/CryptoSettingsScreenContract$Parcel$AutoEarn", "", "", "toString", "()Ljava/lang/String;", "feature_tab_crypto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoSettingsScreenContract$Parcel$AutoEarn implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoSettingsScreenContract$Parcel$AutoEarn> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f89800a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoSettingsScreenContract$Parcel$AutoEarn(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoSettingsScreenContract$Parcel$AutoEarn[i];
        }
    }

    public CryptoSettingsScreenContract$Parcel$AutoEarn(boolean z) {
        this.f89800a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CryptoSettingsScreenContract$Parcel$AutoEarn) && this.f89800a == ((CryptoSettingsScreenContract$Parcel$AutoEarn) obj2).f89800a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f89800a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f89800a ? 1 : 0);
    }
}
