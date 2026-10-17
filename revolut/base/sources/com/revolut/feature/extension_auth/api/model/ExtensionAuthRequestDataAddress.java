package com.revolut.feature.extension_auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/extension_auth/api/model/ExtensionAuthRequestDataAddress;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_extension_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExtensionAuthRequestDataAddress implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExtensionAuthRequestDataAddress> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72191c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExtensionAuthRequestDataAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExtensionAuthRequestDataAddress[i];
        }
    }

    public ExtensionAuthRequestDataAddress(String country, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.f72189a = country;
        this.f72190b = str;
        this.f72191c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExtensionAuthRequestDataAddress)) {
            return false;
        }
        ExtensionAuthRequestDataAddress extensionAuthRequestDataAddress = (ExtensionAuthRequestDataAddress) obj2;
        return Intrinsics.f(this.f72189a, extensionAuthRequestDataAddress.f72189a) && Intrinsics.f(this.f72190b, extensionAuthRequestDataAddress.f72190b) && Intrinsics.f(this.f72191c, extensionAuthRequestDataAddress.f72191c) && Intrinsics.f(this.d, extensionAuthRequestDataAddress.d);
    }

    public final int hashCode() {
        int iHashCode = this.f72189a.hashCode() * 31;
        String str = this.f72190b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f72191c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72189a);
        dest.writeString(this.f72190b);
        dest.writeString(this.f72191c);
        dest.writeString(this.d);
    }
}
