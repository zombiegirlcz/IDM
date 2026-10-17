package com.revolut.feature.contacts.core.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/contacts/core/platform/model/DeviceContact;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_contacts_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeviceContact implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<DeviceContact> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f65990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final il3.a f65991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65992c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f65993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f65994h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeviceContact(parcel.readLong(), il3.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeviceContact[i];
        }
    }

    public DeviceContact(long j2, il3.a type, String point, String name, String firstName, String lastName, String str, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f65990a = j2;
        this.f65991b = type;
        this.f65992c = point;
        this.d = name;
        this.e = firstName;
        this.f = lastName;
        this.f65993g = str;
        this.f65994h = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeviceContact)) {
            return false;
        }
        DeviceContact deviceContact = (DeviceContact) obj2;
        return this.f65990a == deviceContact.f65990a && this.f65991b == deviceContact.f65991b && Intrinsics.f(this.f65992c, deviceContact.f65992c) && Intrinsics.f(this.d, deviceContact.d) && Intrinsics.f(this.e, deviceContact.e) && Intrinsics.f(this.f, deviceContact.f) && Intrinsics.f(this.f65993g, deviceContact.f65993g) && this.f65994h == deviceContact.f65994h;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c((this.f65991b.hashCode() + (Long.hashCode(this.f65990a) * 31)) * 31, 31, this.f65992c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f65993g;
        return Boolean.hashCode(this.f65994h) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f65990a);
        dest.writeString(this.f65991b.name());
        dest.writeString(this.f65992c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f65993g);
        dest.writeInt(this.f65994h ? 1 : 0);
    }
}
