package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "UnsubscribeRequestCreator")
public final class zzcg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcg> CREATOR = new zzch();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    final int f48186zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMessageListenerAsBinder", id = 2, type = "android.os.IBinder")
    public final zzo f48187zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCallbackAsBinder", id = 3, type = "android.os.IBinder")
    public final zzr f48188zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public final PendingIntent f48189zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    @Deprecated
    public final int f48190zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    @Deprecated
    public final String f48191zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    @Deprecated
    public final String f48192zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    @Deprecated
    public final boolean f48193zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    @Deprecated
    public final ClientAppContext f48194zzi;

    @SafeParcelable.Constructor
    public zzcg(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) IBinder iBinder2, @SafeParcelable.Param(id = 4) PendingIntent pendingIntent, @SafeParcelable.Param(id = 5) int i2, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) ClientAppContext clientAppContext) {
        zzo zzmVar;
        this.f48186zza = i;
        zzr zzpVar = null;
        if (iBinder == null) {
            zzmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            zzmVar = iInterfaceQueryLocalInterface instanceof zzo ? (zzo) iInterfaceQueryLocalInterface : new zzm(iBinder);
        }
        this.f48187zzb = zzmVar;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzpVar = iInterfaceQueryLocalInterface2 instanceof zzr ? (zzr) iInterfaceQueryLocalInterface2 : new zzp(iBinder2);
        }
        this.f48188zzc = zzpVar;
        this.f48189zzd = pendingIntent;
        this.f48190zze = i2;
        this.f48191zzf = str;
        this.f48192zzg = str2;
        this.f48193zzh = z;
        this.f48194zzi = ClientAppContext.zza(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f48186zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        zzo zzoVar = this.f48187zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, zzoVar == null ? null : zzoVar.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.f48188zzc.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48189zzd, i, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f48190zze);
        SafeParcelWriter.writeString(parcel, 6, this.f48191zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.f48192zzg, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f48193zzh);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f48194zzi, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzcg(IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent) {
        this(1, iBinder, iBinder2, pendingIntent, 0, null, null, false, null);
    }
}
