package com.revolut.feature.check_topup.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/check_topup/api/data/SDKScanResult;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_check_topup_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SDKScanResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SDKScanResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65766c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SDKScanResult(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SDKScanResult[i];
        }
    }

    public SDKScanResult(String frontUri, String backUri, String str) {
        Intrinsics.checkNotNullParameter(frontUri, "frontUri");
        Intrinsics.checkNotNullParameter(backUri, "backUri");
        this.f65764a = frontUri;
        this.f65765b = backUri;
        this.f65766c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SDKScanResult)) {
            return false;
        }
        SDKScanResult sDKScanResult = (SDKScanResult) obj2;
        return Intrinsics.f(this.f65764a, sDKScanResult.f65764a) && Intrinsics.f(this.f65765b, sDKScanResult.f65765b) && Intrinsics.f(this.f65766c, sDKScanResult.f65766c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f65764a.hashCode() * 31, 31, this.f65765b);
        String str = this.f65766c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65764a);
        dest.writeString(this.f65765b);
        dest.writeString(this.f65766c);
    }
}
