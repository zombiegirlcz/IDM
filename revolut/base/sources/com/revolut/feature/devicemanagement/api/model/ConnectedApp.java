package com.revolut.feature.devicemanagement.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/devicemanagement/api/model/ConnectedApp;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_device_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConnectedApp implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ConnectedApp> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71913b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConnectedApp(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConnectedApp[i];
        }
    }

    public ConnectedApp(String name, String iconUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.f71912a = name;
        this.f71913b = iconUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConnectedApp)) {
            return false;
        }
        ConnectedApp connectedApp = (ConnectedApp) obj2;
        return Intrinsics.f(this.f71912a, connectedApp.f71912a) && Intrinsics.f(this.f71913b, connectedApp.f71913b);
    }

    public final int hashCode() {
        return this.f71913b.hashCode() + (this.f71912a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71912a);
        dest.writeString(this.f71913b);
    }
}
