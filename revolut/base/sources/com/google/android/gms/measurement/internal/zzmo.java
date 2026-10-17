package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes16.dex */
public final class zzmo extends zzg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected zzmh f47458zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private volatile zzmh f47459zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private volatile zzmh f47460zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Map f47461zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.zzdj f47462zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private volatile boolean f47463zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private volatile zzmh f47464zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private zzmh f47465zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private boolean f47466zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private final Object f47467zzj;

    public zzmo(zzio zzioVar) {
        super(zzioVar);
        this.f47467zzj = new Object();
        this.f47461zzd = new ConcurrentHashMap();
    }

    private final void zzA(String str, zzmh zzmhVar, boolean z) {
        zzmh zzmhVar2;
        zzmh zzmhVar3 = this.f47459zzb == null ? this.f47460zzc : this.f47459zzb;
        if (zzmhVar.f47436zzb == null) {
            zzmhVar2 = new zzmh(zzmhVar.f47435zza, str != null ? zzl(str, "Activity") : null, zzmhVar.f47437zzc, zzmhVar.f47439zze, zzmhVar.f47440zzf);
        } else {
            zzmhVar2 = zzmhVar;
        }
        this.f47460zzc = this.f47459zzb;
        this.f47459zzb = zzmhVar2;
        zzio zzioVar = this.zzu;
        zzioVar.zzaX().zzq(new zzmj(this, zzmhVar2, zzmhVar3, zzioVar.zzaU().elapsedRealtime(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzB(com.google.android.gms.measurement.internal.zzmh r15, com.google.android.gms.measurement.internal.zzmh r16, long r17, boolean r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmo.zzB(com.google.android.gms.measurement.internal.zzmh, com.google.android.gms.measurement.internal.zzmh, long, boolean, android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzC(zzmh zzmhVar, boolean z, long j2) {
        zzio zzioVar = this.zzu;
        zzioVar.zzd().zzf(zzioVar.zzaU().elapsedRealtime());
        if (!zzioVar.zzv().f47618zzb.zzd(zzmhVar != null && zzmhVar.f47438zzd, z, j2) || zzmhVar == null) {
            return;
        }
        zzmhVar.f47438zzd = false;
    }

    public static /* bridge */ /* synthetic */ void zzq(zzmo zzmoVar, Bundle bundle, zzmh zzmhVar, zzmh zzmhVar2, long j2) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zzmoVar.zzB(zzmhVar, zzmhVar2, j2, true, zzmoVar.zzu.zzw().zzA(null, "screen_view", bundle, null, false));
    }

    private final zzmh zzz(@NonNull com.google.android.gms.internal.measurement.zzdj zzdjVar) {
        Preconditions.checkNotNull(zzdjVar);
        Integer numValueOf = Integer.valueOf(zzdjVar.f39914zza);
        Map map = this.f47461zzd;
        zzmh zzmhVar = (zzmh) map.get(numValueOf);
        if (zzmhVar == null) {
            zzmh zzmhVar2 = new zzmh(null, zzl(zzdjVar.f39915zzb, "Activity"), this.zzu.zzw().zzs());
            map.put(numValueOf, zzmhVar2);
            zzmhVar = zzmhVar2;
        }
        return this.f47464zzg != null ? this.f47464zzg : zzmhVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zzf() {
        return false;
    }

    public final zzmh zzi() {
        return this.f47459zzb;
    }

    public final zzmh zzj(boolean z) {
        zza();
        zzg();
        if (!z) {
            return this.f47458zza;
        }
        zzmh zzmhVar = this.f47458zza;
        return zzmhVar != null ? zzmhVar : this.f47465zzh;
    }

    public final String zzl(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : "";
        zzio zzioVar = this.zzu;
        return str3.length() > zzioVar.zzf().zzc(null, false) ? str3.substring(0, zzioVar.zzf().zzc(null, false)) : str3;
    }

    public final void zzs(com.google.android.gms.internal.measurement.zzdj zzdjVar, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzu.zzf().zzz() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f47461zzd.put(Integer.valueOf(zzdjVar.f39914zza), new zzmh(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void zzt(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
        synchronized (this.f47467zzj) {
            try {
                if (Objects.equals(this.f47462zze, zzdjVar)) {
                    this.f47462zze = null;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (this.zzu.zzf().zzz()) {
            this.f47461zzd.remove(Integer.valueOf(zzdjVar.f39914zza));
        }
    }

    public final void zzu(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
        synchronized (this.f47467zzj) {
            this.f47466zzi = false;
            this.f47463zzf = true;
        }
        zzio zzioVar = this.zzu;
        long jElapsedRealtime = zzioVar.zzaU().elapsedRealtime();
        if (!zzioVar.zzf().zzz()) {
            this.f47459zzb = null;
            zzioVar.zzaX().zzq(new zzml(this, jElapsedRealtime));
        } else {
            zzmh zzmhVarZzz = zzz(zzdjVar);
            this.f47460zzc = this.f47459zzb;
            this.f47459zzb = null;
            zzioVar.zzaX().zzq(new zzmm(this, zzmhVarZzz, jElapsedRealtime));
        }
    }

    public final void zzv(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
        Object obj2 = this.f47467zzj;
        synchronized (obj2) {
            this.f47466zzi = true;
            if (!Objects.equals(zzdjVar, this.f47462zze)) {
                synchronized (obj2) {
                    this.f47462zze = zzdjVar;
                    this.f47463zzf = false;
                    zzio zzioVar = this.zzu;
                    if (zzioVar.zzf().zzz()) {
                        this.f47464zzg = null;
                        zzioVar.zzaX().zzq(new zzmn(this));
                    }
                }
            }
        }
        zzio zzioVar2 = this.zzu;
        if (!zzioVar2.zzf().zzz()) {
            this.f47459zzb = this.f47464zzg;
            zzioVar2.zzaX().zzq(new zzmk(this));
            return;
        }
        zzA(zzdjVar.f39915zzb, zzz(zzdjVar), false);
        zzd zzdVarZzd = this.zzu.zzd();
        zzio zzioVar3 = zzdVarZzd.zzu;
        zzioVar3.zzaX().zzq(new zzc(zzdVarZzd, zzioVar3.zzaU().elapsedRealtime()));
    }

    public final void zzw(com.google.android.gms.internal.measurement.zzdj zzdjVar, Bundle bundle) {
        zzmh zzmhVar;
        if (!this.zzu.zzf().zzz() || bundle == null || (zzmhVar = (zzmh) this.f47461zzd.get(Integer.valueOf(zzdjVar.f39914zza))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzmhVar.f47437zzc);
        bundle2.putString("name", zzmhVar.f47435zza);
        bundle2.putString("referrer_name", zzmhVar.f47436zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Deprecated
    public final void zzx(@NonNull com.google.android.gms.internal.measurement.zzdj zzdjVar, String str, String str2) {
        zzio zzioVar = this.zzu;
        if (!zzioVar.zzf().zzz()) {
            zzioVar.zzaW().zzl().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzmh zzmhVar = this.f47459zzb;
        if (zzmhVar == null) {
            zzioVar.zzaW().zzl().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f47461zzd;
        Integer numValueOf = Integer.valueOf(zzdjVar.f39914zza);
        if (map.get(numValueOf) == null) {
            zzioVar.zzaW().zzl().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzl(zzdjVar.f39915zzb, "Activity");
        }
        String str3 = zzmhVar.f47436zzb;
        String str4 = zzmhVar.f47435zza;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            zzioVar.zzaW().zzl().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > zzioVar.zzf().zzc(null, false))) {
            zzioVar.zzaW().zzl().zzb("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > zzioVar.zzf().zzc(null, false))) {
            zzioVar.zzaW().zzl().zzb("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzioVar.zzaW().zzj().zzc("Setting current screen to name, class", str == null ? "null" : str, str2);
        zzmh zzmhVar2 = new zzmh(str, str2, zzioVar.zzw().zzs());
        map.put(numValueOf, zzmhVar2);
        zzA(zzdjVar.f39915zzb, zzmhVar2, true);
    }

    public final void zzy(Bundle bundle, long j2) {
        synchronized (this.f47467zzj) {
            try {
                if (!this.f47466zzi) {
                    this.zzu.zzaW().zzl().zza("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.zzu.zzf().zzc(null, false))) {
                    this.zzu.zzaW().zzl().zzb("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.zzu.zzf().zzc(null, false))) {
                    this.zzu.zzaW().zzl().zzb("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.zzdj zzdjVar = this.f47462zze;
                    string2 = zzdjVar != null ? zzl(zzdjVar.f39915zzb, "Activity") : "Activity";
                }
                zzmh zzmhVar = this.f47459zzb;
                if (this.f47463zzf && zzmhVar != null) {
                    this.f47463zzf = false;
                    boolean zEquals = Objects.equals(zzmhVar.f47436zzb, string2);
                    boolean zEquals2 = Objects.equals(zzmhVar.f47435zza, string);
                    if (zEquals && zEquals2) {
                        this.zzu.zzaW().zzl().zza("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                zzio zzioVar = this.zzu;
                zzioVar.zzaW().zzj().zzc("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                zzmh zzmhVar2 = this.f47459zzb == null ? this.f47460zzc : this.f47459zzb;
                zzmh zzmhVar3 = new zzmh(string, string2, zzioVar.zzw().zzs(), true, j2);
                this.f47459zzb = zzmhVar3;
                this.f47460zzc = zzmhVar2;
                this.f47464zzg = zzmhVar3;
                zzioVar.zzaX().zzq(new zzmi(this, bundle, zzmhVar3, zzmhVar2, zzioVar.zzaU().elapsedRealtime()));
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
