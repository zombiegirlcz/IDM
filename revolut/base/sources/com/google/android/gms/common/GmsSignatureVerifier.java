package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzah;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@KeepForSdk
public class GmsSignatureVerifier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzab f37662zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzab f37663zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final HashMap f37664zzc;

    static {
        zzaa zzaaVar = new zzaa();
        zzaaVar.zza("com.google.android.gms");
        zzaaVar.zzb(204200000L);
        zzm zzmVar = zzo.f38364zzf;
        zzaaVar.zzc(zzah.zzm(zzmVar.zzc(), zzo.f38362zzd.zzc(), zzo.f38360zzb.zzc()));
        zzm zzmVar2 = zzo.f38363zze;
        byte[] bArrZzc = zzmVar2.zzc();
        zzm zzmVar3 = zzo.f38361zzc;
        zzaaVar.zzd(zzah.zzm(bArrZzc, zzmVar3.zzc(), zzo.f38359zza.zzc()));
        f37662zza = zzaaVar.zze();
        zzaa zzaaVar2 = new zzaa();
        zzaaVar2.zza("com.android.vending");
        zzaaVar2.zzb(82240000L);
        zzaaVar2.zzc(zzah.zzk(zzmVar.zzc()));
        zzaaVar2.zzd(zzah.zzl(zzmVar2.zzc(), zzmVar3.zzc()));
        f37663zzb = zzaaVar2.zze();
        f37664zzc = new HashMap();
    }
}
