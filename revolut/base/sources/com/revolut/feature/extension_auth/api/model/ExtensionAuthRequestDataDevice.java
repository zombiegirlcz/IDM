package com.revolut.feature.extension_auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/extension_auth/api/model/ExtensionAuthRequestDataDevice;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_extension_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExtensionAuthRequestDataDevice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExtensionAuthRequestDataDevice> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f72193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f72194c;
    public final ExtensionAuthRequestDataAddress d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExtensionAuthRequestDataDevice(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ExtensionAuthRequestDataAddress.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExtensionAuthRequestDataDevice[i];
        }
    }

    public ExtensionAuthRequestDataDevice(String str, String str2, String str3, ExtensionAuthRequestDataAddress extensionAuthRequestDataAddress) {
        this.f72192a = str;
        this.f72193b = str2;
        this.f72194c = str3;
        this.d = extensionAuthRequestDataAddress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExtensionAuthRequestDataDevice)) {
            return false;
        }
        ExtensionAuthRequestDataDevice extensionAuthRequestDataDevice = (ExtensionAuthRequestDataDevice) obj2;
        return Intrinsics.f(this.f72192a, extensionAuthRequestDataDevice.f72192a) && Intrinsics.f(this.f72193b, extensionAuthRequestDataDevice.f72193b) && Intrinsics.f(this.f72194c, extensionAuthRequestDataDevice.f72194c) && Intrinsics.f(this.d, extensionAuthRequestDataDevice.d);
    }

    public final int hashCode() {
        String str = this.f72192a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f72193b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f72194c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ExtensionAuthRequestDataAddress extensionAuthRequestDataAddress = this.d;
        return iHashCode3 + (extensionAuthRequestDataAddress != null ? extensionAuthRequestDataAddress.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72192a);
        dest.writeString(this.f72193b);
        dest.writeString(this.f72194c);
        ExtensionAuthRequestDataAddress extensionAuthRequestDataAddress = this.d;
        if (extensionAuthRequestDataAddress == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            extensionAuthRequestDataAddress.writeToParcel(dest, i);
        }
    }
}
