package com.revolut.feature.security_hub.impl.interactor;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/interactor/ConnectedWifi;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConnectedWifi implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ConnectedWifi> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f85468b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConnectedWifi(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConnectedWifi[i];
        }
    }

    public ConnectedWifi(String ssid, boolean z) {
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        this.f85467a = ssid;
        this.f85468b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConnectedWifi)) {
            return false;
        }
        ConnectedWifi connectedWifi = (ConnectedWifi) obj2;
        return Intrinsics.f(this.f85467a, connectedWifi.f85467a) && this.f85468b == connectedWifi.f85468b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85468b) + (this.f85467a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85467a);
        dest.writeInt(this.f85468b ? 1 : 0);
    }
}
