package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class zzio implements zzjs {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static volatile zzio f47156zzb;
    private Boolean zzB;
    private long zzC;
    private volatile Boolean zzD;
    private volatile boolean zzE;
    private int zzF;
    private int zzG;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final long f47157zza;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Context f47158zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final String f47159zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final String f47160zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final String f47161zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final boolean f47162zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final zzaf f47163zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final zzam f47164zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private final zzht f47165zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private final zzhe f47166zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final zzil f47167zzl;
    private final zzop zzm;
    private final zzqf zzn;
    private final zzgx zzo;
    private final Clock zzp;
    private final zzmo zzq;
    private final zzlw zzr;
    private final zzd zzs;
    private final zzmb zzt;
    private final String zzu;
    private zzgv zzv;
    private zzny zzw;
    private zzbb zzx;
    private zzgs zzy;
    private zzmd zzz;
    private boolean zzA = false;
    private final AtomicInteger zzH = new AtomicInteger(0);

    public zzio(zzke zzkeVar) {
        Preconditions.checkNotNull(zzkeVar);
        Context context = zzkeVar.f47286zza;
        zzaf zzafVar = new zzaf(context);
        this.f47163zzh = zzafVar;
        zzgf.f46962zza = zzafVar;
        this.f47158zzc = context;
        this.f47159zzd = zzkeVar.f47287zzb;
        this.f47160zze = zzkeVar.f47288zzc;
        this.f47161zzf = zzkeVar.f47289zzd;
        this.f47162zzg = zzkeVar.f47293zzh;
        this.zzD = zzkeVar.f47290zze;
        this.zzu = zzkeVar.f47295zzj;
        this.zzE = true;
        com.google.android.gms.internal.measurement.zzki.zzd(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzp = defaultClock;
        Long l2 = zzkeVar.f47294zzi;
        this.f47157zza = l2 != null ? l2.longValue() : defaultClock.currentTimeMillis();
        this.f47164zzi = new zzam(this);
        zzht zzhtVar = new zzht(this);
        zzhtVar.zzw();
        this.f47165zzj = zzhtVar;
        zzhe zzheVar = new zzhe(this);
        zzheVar.zzw();
        this.f47166zzk = zzheVar;
        zzqf zzqfVar = new zzqf(this);
        zzqfVar.zzw();
        this.zzn = zzqfVar;
        this.zzo = new zzgx(new zzkd(zzkeVar, this));
        this.zzs = new zzd(this);
        zzmo zzmoVar = new zzmo(this);
        zzmoVar.zzb();
        this.zzq = zzmoVar;
        zzlw zzlwVar = new zzlw(this);
        zzlwVar.zzb();
        this.zzr = zzlwVar;
        zzop zzopVar = new zzop(this);
        zzopVar.zzb();
        this.zzm = zzopVar;
        zzmb zzmbVar = new zzmb(this);
        zzmbVar.zzw();
        this.zzt = zzmbVar;
        zzil zzilVar = new zzil(this);
        zzilVar.zzw();
        this.f47167zzl = zzilVar;
        com.google.android.gms.internal.measurement.zzdh zzdhVar = zzkeVar.f47292zzg;
        boolean z = zzdhVar == null || zzdhVar.f39907zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            zzS(zzlwVar);
            if (zzlwVar.zzu.f47158zzc.getApplicationContext() instanceof Application) {
                Application application = (Application) zzlwVar.zzu.f47158zzc.getApplicationContext();
                if (zzlwVar.f47395zza == null) {
                    zzlwVar.f47395zza = new zzlv(zzlwVar);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(zzlwVar.f47395zza);
                    application.registerActivityLifecycleCallbacks(zzlwVar.f47395zza);
                    zzhe zzheVar2 = zzlwVar.zzu.f47166zzk;
                    zzT(zzheVar2);
                    zzheVar2.zzj().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzT(zzheVar);
            zzheVar.zzk().zza("Application context is not an Application");
        }
        zzilVar.zzq(new zzin(this, zzkeVar));
    }

    public static /* synthetic */ void zzB(zzio zzioVar, String str, int i, Throwable th10, byte[] bArr, Map map) {
        int i2;
        if (i != 200 && i != 204) {
            i2 = 304;
            if (i != 304) {
                i2 = i;
            }
            zzhe zzheVar = zzioVar.f47166zzk;
            zzT(zzheVar);
            zzheVar.zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th10);
        }
        i2 = i;
        if (th10 == null) {
            zzht zzhtVar = zzioVar.f47165zzj;
            zzR(zzhtVar);
            zzhtVar.zzo.zza(true);
            if (bArr == null || bArr.length == 0) {
                zzhe zzheVar2 = zzioVar.f47166zzk;
                zzT(zzheVar2);
                zzheVar2.zzd().zza("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(strOptString)) {
                    zzhe zzheVar3 = zzioVar.f47166zzk;
                    zzT(zzheVar3);
                    zzheVar3.zzd().zza("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                zzqf zzqfVar = zzioVar.zzn;
                zzR(zzqfVar);
                zzio zzioVar2 = zzqfVar.zzu;
                if (!TextUtils.isEmpty(strOptString)) {
                    Context context = zzioVar2.f47158zzc;
                    List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                    if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                        if (!TextUtils.isEmpty(strOptString3)) {
                            bundle.putString("gbraid", strOptString3);
                        }
                        if (!TextUtils.isEmpty(strOptString4)) {
                            bundle.putString("gad_source", strOptString4);
                        }
                        bundle.putString("gclid", strOptString2);
                        bundle.putString("_cis", "ddp");
                        zzioVar.zzr.zzR("auto", "_cmp", bundle);
                        zzR(zzqfVar);
                        if (TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            editorEdit.putString("deeplink", strOptString);
                            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                            if (editorEdit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = zzqfVar.zzu.f47158zzc;
                                if (Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                } else {
                                    context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                    return;
                                }
                            }
                            return;
                        } catch (RuntimeException e) {
                            zzhe zzheVar4 = zzqfVar.zzu.f47166zzk;
                            zzT(zzheVar4);
                            zzheVar4.zze().zzb("Failed to persist Deferred Deep Link. exception", e);
                            return;
                        }
                    }
                }
                zzhe zzheVar5 = zzioVar.f47166zzk;
                zzT(zzheVar5);
                zzheVar5.zzk().zzd("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                return;
            } catch (JSONException e2) {
                zzhe zzheVar6 = zzioVar.f47166zzk;
                zzT(zzheVar6);
                zzheVar6.zze().zzb("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        zzhe zzheVar7 = zzioVar.f47166zzk;
        zzT(zzheVar7);
        zzheVar7.zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th10);
    }

    public static /* synthetic */ void zzC(zzio zzioVar, zzke zzkeVar) {
        zzil zzilVar = zzioVar.f47167zzl;
        zzT(zzilVar);
        zzilVar.zzg();
        zzam zzamVar = zzioVar.f47164zzi;
        zzamVar.zzq();
        zzbb zzbbVar = new zzbb(zzioVar);
        zzbbVar.zzw();
        zzioVar.zzx = zzbbVar;
        com.google.android.gms.internal.measurement.zzdh zzdhVar = zzkeVar.f47292zzg;
        zzgs zzgsVar = new zzgs(zzioVar, zzkeVar.f47291zzf, zzdhVar == null ? 0L : zzdhVar.f39906zza);
        zzgsVar.zzb();
        zzioVar.zzy = zzgsVar;
        zzgv zzgvVar = new zzgv(zzioVar);
        zzgvVar.zzb();
        zzioVar.zzv = zzgvVar;
        zzny zznyVar = new zzny(zzioVar);
        zznyVar.zzb();
        zzioVar.zzw = zznyVar;
        zzqf zzqfVar = zzioVar.zzn;
        zzqfVar.zzx();
        zzioVar.f47165zzj.zzx();
        zzioVar.zzy.zzc();
        zzmd zzmdVar = new zzmd(zzioVar);
        zzmdVar.zzb();
        zzioVar.zzz = zzmdVar;
        zzmdVar.zzc();
        zzhe zzheVar = zzioVar.f47166zzk;
        zzT(zzheVar);
        zzhc zzhcVarZzi = zzheVar.zzi();
        zzamVar.zzj();
        zzhcVarZzi.zzb("App measurement initialized, version", 119002L);
        zzT(zzheVar);
        zzheVar.zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strZzm = zzgsVar.zzm();
        if (TextUtils.isEmpty(zzioVar.f47159zzd)) {
            zzR(zzqfVar);
            if (zzqfVar.zzak(strZzm, zzamVar.zzs())) {
                zzT(zzheVar);
                zzheVar.zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzT(zzheVar);
                zzheVar.zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strZzm)));
            }
        }
        zzT(zzheVar);
        zzheVar.zzd().zza("Debug-level message logging enabled");
        int i = zzioVar.zzF;
        AtomicInteger atomicInteger = zzioVar.zzH;
        if (i != atomicInteger.get()) {
            zzT(zzheVar);
            zzheVar.zze().zzc("Not all components initialized", Integer.valueOf(zzioVar.zzF), Integer.valueOf(atomicInteger.get()));
        }
        zzioVar.zzA = true;
    }

    public static final void zzP() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void zzQ(zzf zzfVar) {
        if (zzfVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void zzR(zzjq zzjqVar) {
        if (zzjqVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void zzS(zzg zzgVar) {
        if (zzgVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!zzgVar.zze()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzgVar.getClass())));
        }
    }

    private static final void zzT(zzjr zzjrVar) {
        if (zzjrVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!zzjrVar.zzy()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzjrVar.getClass())));
        }
    }

    public static zzio zzp(Context context, com.google.android.gms.internal.measurement.zzdh zzdhVar, Long l2) {
        Bundle bundle;
        if (zzdhVar != null && (zzdhVar.f39910zze == null || zzdhVar.f39911zzf == null)) {
            zzdhVar = new com.google.android.gms.internal.measurement.zzdh(zzdhVar.f39906zza, zzdhVar.f39907zzb, zzdhVar.f39908zzc, zzdhVar.f39909zzd, null, null, zzdhVar.f39912zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f47156zzb == null) {
            synchronized (zzio.class) {
                try {
                    if (f47156zzb == null) {
                        f47156zzb = new zzio(new zzke(context, zzdhVar, l2));
                    }
                } finally {
                }
            }
        } else if (zzdhVar != null && (bundle = zzdhVar.f39912zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(f47156zzb);
            f47156zzb.zzD = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(f47156zzb);
        return f47156zzb;
    }

    public final String zzA() {
        return this.zzu;
    }

    public final void zzD() {
        this.zzH.incrementAndGet();
    }

    public final void zzE() {
        this.zzF++;
    }

    public final void zzF(boolean z) {
        this.zzD = Boolean.valueOf(z);
    }

    public final void zzG(boolean z) {
        zzil zzilVar = this.f47167zzl;
        zzT(zzilVar);
        zzilVar.zzg();
        this.zzE = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzH(com.google.android.gms.internal.measurement.zzdh r14) {
        /*
            Method dump skipped, instruction units count: 1285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzio.zzH(com.google.android.gms.internal.measurement.zzdh):void");
    }

    public final boolean zzI() {
        return this.zzD != null && this.zzD.booleanValue();
    }

    public final boolean zzJ() {
        return zza() == 0;
    }

    public final boolean zzK() {
        zzil zzilVar = this.f47167zzl;
        zzT(zzilVar);
        zzilVar.zzg();
        return this.zzE;
    }

    public final boolean zzL() {
        return TextUtils.isEmpty(this.f47159zzd);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzM() {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzio.zzM():boolean");
    }

    public final boolean zzN() {
        return this.f47162zzg;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzO() {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzio.zzO():boolean");
    }

    public final int zza() {
        zzil zzilVar = this.f47167zzl;
        zzT(zzilVar);
        zzilVar.zzg();
        zzam zzamVar = this.f47164zzi;
        if (zzamVar.zzA()) {
            return 1;
        }
        zzT(zzilVar);
        zzilVar.zzg();
        if (!this.zzE) {
            return 8;
        }
        zzht zzhtVar = this.f47165zzj;
        zzR(zzhtVar);
        Boolean boolZzi = zzhtVar.zzi();
        if (boolZzi != null) {
            return boolZzi.booleanValue() ? 0 : 3;
        }
        zzaf zzafVar = zzamVar.zzu.f47163zzh;
        Boolean boolZzn = zzamVar.zzn("firebase_analytics_collection_enabled");
        return boolZzn != null ? boolZzn.booleanValue() ? 0 : 4 : (this.zzD == null || this.zzD.booleanValue()) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final Context zzaT() {
        return this.f47158zzc;
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final Clock zzaU() {
        return this.zzp;
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final zzaf zzaV() {
        return this.f47163zzh;
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final zzhe zzaW() {
        zzhe zzheVar = this.f47166zzk;
        zzT(zzheVar);
        return zzheVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final zzil zzaX() {
        zzil zzilVar = this.f47167zzl;
        zzT(zzilVar);
        return zzilVar;
    }

    public final zzd zzd() {
        zzd zzdVar = this.zzs;
        zzQ(zzdVar);
        return zzdVar;
    }

    public final zzam zzf() {
        return this.f47164zzi;
    }

    public final zzbb zzg() {
        zzT(this.zzx);
        return this.zzx;
    }

    public final zzgs zzh() {
        zzS(this.zzy);
        return this.zzy;
    }

    public final zzgv zzi() {
        zzS(this.zzv);
        return this.zzv;
    }

    public final zzgx zzj() {
        return this.zzo;
    }

    public final zzhe zzl() {
        zzhe zzheVar = this.f47166zzk;
        if (zzheVar == null || !zzheVar.zzy()) {
            return null;
        }
        return zzheVar;
    }

    public final zzht zzm() {
        zzht zzhtVar = this.f47165zzj;
        zzR(zzhtVar);
        return zzhtVar;
    }

    public final zzil zzo() {
        return this.f47167zzl;
    }

    public final zzlw zzq() {
        zzlw zzlwVar = this.zzr;
        zzS(zzlwVar);
        return zzlwVar;
    }

    public final zzmb zzr() {
        zzmb zzmbVar = this.zzt;
        zzT(zzmbVar);
        return zzmbVar;
    }

    public final zzmd zzs() {
        zzQ(this.zzz);
        return this.zzz;
    }

    public final zzmo zzt() {
        zzmo zzmoVar = this.zzq;
        zzS(zzmoVar);
        return zzmoVar;
    }

    public final zzny zzu() {
        zzS(this.zzw);
        return this.zzw;
    }

    public final zzop zzv() {
        zzop zzopVar = this.zzm;
        zzS(zzopVar);
        return zzopVar;
    }

    public final zzqf zzw() {
        zzqf zzqfVar = this.zzn;
        zzR(zzqfVar);
        return zzqfVar;
    }

    public final String zzx() {
        if (this.f47164zzi.zzx(null, zzgi.zzbp)) {
            return null;
        }
        return this.f47159zzd;
    }

    public final String zzy() {
        if (this.f47164zzi.zzx(null, zzgi.zzbp)) {
            return null;
        }
        return this.f47160zze;
    }

    public final String zzz() {
        return this.f47161zzf;
    }
}
