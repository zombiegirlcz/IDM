package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import j6.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "CapCreator")
@SafeParcelable.Reserved({1})
public class Cap extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int f46630zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWrappedBitmapDescriptorImplBinder", id = 3, type = "android.os.IBinder")
    private final BitmapDescriptor f46631zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBitmapRefWidth", id = 4)
    private final Float f46632zzd;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final String f46629zza = "Cap";

    @NonNull
    public static final Parcelable.Creator<Cap> CREATOR = new zzb();

    public Cap(int i) {
        this(i, (BitmapDescriptor) null, (Float) null);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj2;
        return this.f46630zzb == cap.f46630zzb && Objects.equal(this.f46631zzc, cap.f46631zzc) && Objects.equal(this.f46632zzd, cap.f46632zzd);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f46630zzb), this.f46631zzc, this.f46632zzd);
    }

    @NonNull
    public String toString() {
        return a.v(new StringBuilder("[Cap: type="), "]", this.f46630zzb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.f46630zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i2);
        BitmapDescriptor bitmapDescriptor = this.f46631zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.f46632zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Cap zza() {
        int i = this.f46630zzb;
        if (i == 0) {
            return new ButtCap();
        }
        if (i == 1) {
            return new SquareCap();
        }
        if (i == 2) {
            return new RoundCap();
        }
        if (i == 3) {
            Preconditions.checkState(this.f46631zzc != null, "bitmapDescriptor must not be null");
            Preconditions.checkState(this.f46632zzd != null, "bitmapRefWidth must not be null");
            return new CustomCap(this.f46631zzc, this.f46632zzd.floatValue());
        }
        String str = f46629zza;
        String str2 = "Unknown Cap type: " + i;
        return this;
    }

    @SafeParcelable.Constructor
    public Cap(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) Float f) {
        this(i, iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder)), f);
    }

    private Cap(int i, BitmapDescriptor bitmapDescriptor, Float f) {
        boolean z = f != null && f.floatValue() > BitmapDescriptorFactory.HUE_RED;
        if (i == 3) {
            z = bitmapDescriptor != null && z;
            i = 3;
        }
        Preconditions.checkArgument(z, "Invalid Cap: type=" + i + " bitmapDescriptor=" + bitmapDescriptor + " bitmapRefWidth=" + f);
        this.f46630zzb = i;
        this.f46631zzc = bitmapDescriptor;
        this.f46632zzd = f;
    }

    public Cap(@NonNull BitmapDescriptor bitmapDescriptor, float f) {
        this(3, bitmapDescriptor, Float.valueOf(f));
    }
}
