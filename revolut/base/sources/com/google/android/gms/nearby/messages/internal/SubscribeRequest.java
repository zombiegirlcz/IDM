package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import j6.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "SubscribeRequestCreator")
public final class SubscribeRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SubscribeRequest> CREATOR = new zzcd();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    final int f48065zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMessageListenerAsBinder", id = 2, type = "android.os.IBinder")
    public final zzo f48066zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(id = 3)
    public final Strategy f48067zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCallbackAsBinder", id = 4, type = "android.os.IBinder")
    public final zzr f48068zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(id = 5)
    public final MessageFilter f48069zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    public final PendingIntent f48070zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    @Deprecated
    public final int f48071zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    @Deprecated
    public final String f48072zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    @Deprecated
    public final String f48073zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    public final byte[] f48074zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(id = 11)
    @Deprecated
    public final boolean f48075zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSubscribeCallbackAsBinder", id = 12, type = "android.os.IBinder")
    public final zzab f48076zzl;

    @SafeParcelable.Field(id = 13)
    @Deprecated
    public final boolean zzm;

    @SafeParcelable.Field(id = 14)
    @Deprecated
    public final ClientAppContext zzn;

    @SafeParcelable.Field(id = 15)
    public final boolean zzo;

    @SafeParcelable.Field(id = 16)
    public final int zzp;

    @SafeParcelable.Field(id = 17)
    public final int zzq;

    @SafeParcelable.Constructor
    public SubscribeRequest(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) IBinder iBinder, @NonNull @SafeParcelable.Param(id = 3) Strategy strategy, @NonNull @SafeParcelable.Param(id = 4) IBinder iBinder2, @NonNull @SafeParcelable.Param(id = 5) MessageFilter messageFilter, @SafeParcelable.Param(id = 6) PendingIntent pendingIntent, @SafeParcelable.Param(id = 7) int i2, @SafeParcelable.Param(id = 8) String str, @SafeParcelable.Param(id = 9) String str2, @SafeParcelable.Param(id = 10) byte[] bArr, @SafeParcelable.Param(id = 11) boolean z, @SafeParcelable.Param(id = 12) IBinder iBinder3, @SafeParcelable.Param(id = 13) boolean z3, @SafeParcelable.Param(id = 14) ClientAppContext clientAppContext, @SafeParcelable.Param(id = 15) boolean z4, @SafeParcelable.Param(id = 16) int i3, @SafeParcelable.Param(id = 17) int i5) {
        IBinder iBinder4;
        zzo zzmVar;
        zzr zzpVar;
        this.f48065zza = i;
        zzab zzzVar = null;
        if (iBinder == null || (iBinder4 = (IBinder) Preconditions.checkNotNull(iBinder)) == null) {
            zzmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder4.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            zzmVar = iInterfaceQueryLocalInterface instanceof zzo ? (zzo) iInterfaceQueryLocalInterface : new zzm(iBinder4);
        }
        this.f48066zzb = zzmVar;
        this.f48067zzc = strategy;
        if (iBinder2 == null) {
            zzpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            zzpVar = iInterfaceQueryLocalInterface2 instanceof zzr ? (zzr) iInterfaceQueryLocalInterface2 : new zzp(iBinder2);
        }
        this.f48068zzd = zzpVar;
        this.f48069zze = messageFilter;
        this.f48070zzf = pendingIntent;
        this.f48071zzg = i2;
        this.f48072zzh = str;
        this.f48073zzi = str2;
        this.f48074zzj = bArr;
        this.f48075zzk = z;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
            zzzVar = iInterfaceQueryLocalInterface3 instanceof zzab ? (zzab) iInterfaceQueryLocalInterface3 : new zzz(iBinder3);
        }
        this.f48076zzl = zzzVar;
        this.zzm = z3;
        this.zzn = ClientAppContext.zza(clientAppContext, str2, str, z3);
        this.zzo = z4;
        this.zzp = i3;
        this.zzq = i5;
    }

    @NonNull
    public final String toString() {
        byte[] bArr = this.f48074zzj;
        PendingIntent pendingIntent = this.f48070zzf;
        MessageFilter messageFilter = this.f48069zze;
        zzr zzrVar = this.f48068zzd;
        Strategy strategy = this.f48067zzc;
        String strValueOf = String.valueOf(this.f48066zzb);
        String strValueOf2 = String.valueOf(strategy);
        String strValueOf3 = String.valueOf(zzrVar);
        String strValueOf4 = String.valueOf(messageFilter);
        String strValueOf5 = String.valueOf(pendingIntent);
        String strV = bArr == null ? null : a.v(new StringBuilder("<"), " bytes>", bArr.length);
        zzab zzabVar = this.f48076zzl;
        boolean z = this.zzm;
        ClientAppContext clientAppContext = this.zzn;
        boolean z3 = this.zzo;
        String str = this.f48072zzh;
        String str2 = this.f48073zzi;
        boolean z4 = this.f48075zzk;
        int i = this.zzq;
        String strValueOf6 = String.valueOf(zzabVar);
        String strValueOf7 = String.valueOf(clientAppContext);
        StringBuilder sbM = v0.a.m("SubscribeRequest{messageListener=", strValueOf, ", strategy=", strValueOf2, ", callback=");
        a.D(sbM, strValueOf3, ", filter=", strValueOf4, ", pendingIntent=");
        a.D(sbM, strValueOf5, ", hint=", strV, ", subscribeCallback=");
        sbM.append(strValueOf6);
        sbM.append(", useRealClientApiKey=");
        sbM.append(z);
        sbM.append(", clientAppContext=");
        sbM.append(strValueOf7);
        sbM.append(", isDiscardPendingIntent=");
        sbM.append(z3);
        sbM.append(", zeroPartyPackageName=");
        a.D(sbM, str, ", realClientPackageName=", str2, ", isIgnoreNearbyPermission=");
        sbM.append(z4);
        sbM.append(", callingContext=");
        sbM.append(i);
        sbM.append("}");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.f48065zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        zzo zzoVar = this.f48066zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, zzoVar == null ? null : zzoVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48067zzc, i, false);
        zzr zzrVar = this.f48068zzd;
        SafeParcelWriter.writeIBinder(parcel, 4, zzrVar == null ? null : zzrVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f48069zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f48070zzf, i, false);
        SafeParcelWriter.writeInt(parcel, 7, this.f48071zzg);
        SafeParcelWriter.writeString(parcel, 8, this.f48072zzh, false);
        SafeParcelWriter.writeString(parcel, 9, this.f48073zzi, false);
        SafeParcelWriter.writeByteArray(parcel, 10, this.f48074zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f48075zzk);
        zzab zzabVar = this.f48076zzl;
        SafeParcelWriter.writeIBinder(parcel, 12, zzabVar != null ? zzabVar.asBinder() : null, false);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzm);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzn, i, false);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzo);
        SafeParcelWriter.writeInt(parcel, 16, this.zzp);
        SafeParcelWriter.writeInt(parcel, 17, this.zzq);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public SubscribeRequest(IBinder iBinder, @NonNull Strategy strategy, @NonNull IBinder iBinder2, @NonNull MessageFilter messageFilter, PendingIntent pendingIntent, byte[] bArr, IBinder iBinder3, boolean z, int i, int i2) {
        this(3, iBinder, strategy, iBinder2, messageFilter, pendingIntent, 0, null, null, null, false, iBinder3, false, null, false, 0, i2);
    }
}
