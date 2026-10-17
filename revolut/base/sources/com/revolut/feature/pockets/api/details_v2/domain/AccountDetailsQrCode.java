package com.revolut.feature.pockets.api.details_v2.domain;

import android.os.Parcel;
import android.os.Parcelable;
import dda.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pockets/api/details_v2/domain/AccountDetailsQrCode;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "dda/j", "feature_pockets_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountDetailsQrCode implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountDetailsQrCode> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f80767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80768b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountDetailsQrCode(j.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountDetailsQrCode[i];
        }
    }

    public AccountDetailsQrCode(j provider, String qrCode) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        this.f80767a = provider;
        this.f80768b = qrCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountDetailsQrCode)) {
            return false;
        }
        AccountDetailsQrCode accountDetailsQrCode = (AccountDetailsQrCode) obj2;
        return this.f80767a == accountDetailsQrCode.f80767a && Intrinsics.f(this.f80768b, accountDetailsQrCode.f80768b);
    }

    public final int hashCode() {
        return this.f80768b.hashCode() + (this.f80767a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80767a.name());
        dest.writeString(this.f80768b);
    }
}
