package com.revolut.feature.devicemanagement.api.model;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import h86.b;
import h86.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/devicemanagement/api/model/UserDevice;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_device_management_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserDevice implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserDevice> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h86.a f71915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f71916c;
    public final b d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f71917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f71918h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f71919j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f71920l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f71921m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f71922n;
    public final long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f71923p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final UserDeviceAddress f71924q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f71925r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f71926s;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            h86.a aVarValueOf = h86.a.valueOf(parcel.readString());
            c cVarValueOf = c.valueOf(parcel.readString());
            b bVarValueOf = b.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            String string9 = parcel.readString();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            UserDeviceAddress userDeviceAddressCreateFromParcel = UserDeviceAddress.CREATOR.createFromParcel(parcel);
            boolean z4 = parcel.readInt() != 0;
            int i = parcel.readInt();
            boolean z6 = z;
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (true) {
                String str = string;
                if (iA == i) {
                    return new UserDevice(string, aVarValueOf, cVarValueOf, bVarValueOf, string2, string3, string4, string5, string6, string7, string8, z6, z3, string9, j2, j3, userDeviceAddressCreateFromParcel, z4, arrayList);
                }
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ConnectedApp.CREATOR, parcel, arrayList, iA, 1);
                string = str;
                aVarValueOf = aVarValueOf;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserDevice[i];
        }
    }

    public UserDevice(String id10, h86.a brand, c type, b os4, String model, String browserModel, String appVersion, String lastIpAddress, String locale, String systemVersion, String timeZoneId, boolean z, boolean z3, String osVersion, long j2, long j3, UserDeviceAddress address, boolean z4, List connectedApps) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(os4, "os");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(browserModel, "browserModel");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(lastIpAddress, "lastIpAddress");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(systemVersion, "systemVersion");
        Intrinsics.checkNotNullParameter(timeZoneId, "timeZoneId");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(connectedApps, "connectedApps");
        this.f71914a = id10;
        this.f71915b = brand;
        this.f71916c = type;
        this.d = os4;
        this.e = model;
        this.f = browserModel;
        this.f71917g = appVersion;
        this.f71918h = lastIpAddress;
        this.i = locale;
        this.f71919j = systemVersion;
        this.k = timeZoneId;
        this.f71920l = z;
        this.f71921m = z3;
        this.f71922n = osVersion;
        this.o = j2;
        this.f71923p = j3;
        this.f71924q = address;
        this.f71925r = z4;
        this.f71926s = connectedApps;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserDevice)) {
            return false;
        }
        UserDevice userDevice = (UserDevice) obj2;
        return Intrinsics.f(this.f71914a, userDevice.f71914a) && this.f71915b == userDevice.f71915b && this.f71916c == userDevice.f71916c && this.d == userDevice.d && Intrinsics.f(this.e, userDevice.e) && Intrinsics.f(this.f, userDevice.f) && Intrinsics.f(this.f71917g, userDevice.f71917g) && Intrinsics.f(this.f71918h, userDevice.f71918h) && Intrinsics.f(this.i, userDevice.i) && Intrinsics.f(this.f71919j, userDevice.f71919j) && Intrinsics.f(this.k, userDevice.k) && this.f71920l == userDevice.f71920l && this.f71921m == userDevice.f71921m && Intrinsics.f(this.f71922n, userDevice.f71922n) && this.o == userDevice.o && this.f71923p == userDevice.f71923p && Intrinsics.f(this.f71924q, userDevice.f71924q) && this.f71925r == userDevice.f71925r && Intrinsics.f(this.f71926s, userDevice.f71926s);
    }

    public final int hashCode() {
        return this.f71926s.hashCode() + j6.a.c((this.f71924q.hashCode() + d.c(d.c(p.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c((this.d.hashCode() + ((this.f71916c.hashCode() + ((this.f71915b.hashCode() + (this.f71914a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.f71917g), 31, this.f71918h), 31, this.i), 31, this.f71919j), 31, this.k), 31, this.f71920l), 31, this.f71921m), 31, this.f71922n), 31, this.o), 31, this.f71923p)) * 31, 31, this.f71925r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71914a);
        dest.writeString(this.f71915b.name());
        dest.writeString(this.f71916c.name());
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f71917g);
        dest.writeString(this.f71918h);
        dest.writeString(this.i);
        dest.writeString(this.f71919j);
        dest.writeString(this.k);
        dest.writeInt(this.f71920l ? 1 : 0);
        dest.writeInt(this.f71921m ? 1 : 0);
        dest.writeString(this.f71922n);
        dest.writeLong(this.o);
        dest.writeLong(this.f71923p);
        this.f71924q.writeToParcel(dest, i);
        dest.writeInt(this.f71925r ? 1 : 0);
        Iterator itV = p.a.v(this.f71926s, dest);
        while (itV.hasNext()) {
            ((ConnectedApp) itV.next()).writeToParcel(dest, i);
        }
    }
}
