package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PublishRequestCreator")
public final class zzbz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbz> CREATOR = new zzca();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    final int f48160zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final zzae f48161zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final Strategy f48162zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCallbackAsBinder", id = 4, type = "android.os.IBinder")
    public final zzr f48163zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    @Deprecated
    public final String f48164zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    @Deprecated
    public final String f48165zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    @Deprecated
    public final boolean f48166zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPublishCallbackAsBinder", id = 8, type = "android.os.IBinder")
    public final zzv f48167zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    @Deprecated
    public final boolean f48168zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    @Deprecated
    public final ClientAppContext f48169zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(id = 11)
    public final int f48170zzk;

    @SafeParcelable.Constructor
    public zzbz(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) zzae zzaeVar, @SafeParcelable.Param(id = 3) Strategy strategy, @SafeParcelable.Param(id = 4) IBinder iBinder, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) String str2, @SafeParcelable.Param(id = 7) boolean z, @SafeParcelable.Param(id = 8) IBinder iBinder2, @SafeParcelable.Param(id = 9) boolean z3, @SafeParcelable.Param(id = 10) ClientAppContext clientAppContext, @SafeParcelable.Param(id = 11) int i2) {
        zzr zzpVar;
        this.f48160zza = i;
        this.f48161zzb = zzaeVar;
        this.f48162zzc = strategy;
        zzv zztVar = null;
        if (iBinder == null) {
            zzpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzpVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzp(iBinder);
        }
        this.f48163zzd = zzpVar;
        this.f48164zze = str;
        this.f48165zzf = str2;
        this.f48166zzg = z;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            zztVar = iInterfaceQueryLocalInterface2 instanceof zzv ? (zzv) iInterfaceQueryLocalInterface2 : new zzt(iBinder2);
        }
        this.f48167zzh = zztVar;
        this.f48168zzi = z3;
        this.f48169zzj = ClientAppContext.zza(clientAppContext, str2, str, z3);
        this.f48170zzk = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f48160zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f48161zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48162zzc, i, false);
        SafeParcelWriter.writeIBinder(parcel, 4, this.f48163zzd.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 5, this.f48164zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.f48165zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f48166zzg);
        zzv zzvVar = this.f48167zzh;
        SafeParcelWriter.writeIBinder(parcel, 8, zzvVar == null ? null : zzvVar.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f48168zzi);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f48169zzj, i, false);
        SafeParcelWriter.writeInt(parcel, 11, this.f48170zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
