package com.google.android.gms.measurement.internal;

import android.app.BroadcastOptions;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzra;
import com.youTransactor.uCube.rpc.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes16.dex */
public final class zzpv implements zzjs {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static volatile zzpv f47683zzb;
    private List zzA;
    private long zzB;
    private final Map zzC;
    private final Map zzD;
    private final Map zzE;
    private zzmh zzG;
    private String zzH;
    private zzaz zzI;
    private long zzJ;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    long f47684zza;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zzif f47685zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzhk f47686zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private zzaw f47687zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private zzhm f47688zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private zzoy f47689zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private zzae f47690zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final zzqa f47691zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private zzmc f47692zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private zzoa f47693zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private final zzpi f47694zzl;
    private zzhw zzm;
    private final zzio zzn;
    private boolean zzp;
    private List zzq;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private FileLock zzx;
    private FileChannel zzy;
    private List zzz;
    private final AtomicBoolean zzo = new AtomicBoolean(false);
    private final Deque zzr = new LinkedList();
    private final Map zzF = new HashMap();
    private final zzqe zzK = new zzpq(this);

    public zzpv(zzpw zzpwVar, zzio zzioVar) {
        Preconditions.checkNotNull(zzpwVar);
        this.zzn = zzio.zzp(zzpwVar.f47695zza, null, null);
        this.zzB = -1L;
        this.f47694zzl = new zzpi(this);
        zzqa zzqaVar = new zzqa(this);
        zzqaVar.zzaw();
        this.f47691zzi = zzqaVar;
        zzhk zzhkVar = new zzhk(this);
        zzhkVar.zzaw();
        this.f47686zzd = zzhkVar;
        zzif zzifVar = new zzif(this);
        zzifVar.zzaw();
        this.f47685zzc = zzifVar;
        this.zzC = new HashMap();
        this.zzD = new HashMap();
        this.zzE = new HashMap();
        zzaX().zzq(new zzpk(this, zzpwVar));
    }

    public static /* bridge */ /* synthetic */ void zzH(zzpv zzpvVar, zzpw zzpwVar) {
        zzpvVar.zzaX().zzg();
        zzpvVar.zzm = new zzhw(zzpvVar);
        zzaw zzawVar = new zzaw(zzpvVar);
        zzawVar.zzaw();
        zzpvVar.f47687zze = zzawVar;
        zzpvVar.zzi().zzu((zzal) Preconditions.checkNotNull(zzpvVar.f47685zzc));
        zzoa zzoaVar = new zzoa(zzpvVar);
        zzoaVar.zzaw();
        zzpvVar.f47693zzk = zzoaVar;
        zzae zzaeVar = new zzae(zzpvVar);
        zzaeVar.zzaw();
        zzpvVar.f47690zzh = zzaeVar;
        zzmc zzmcVar = new zzmc(zzpvVar);
        zzmcVar.zzaw();
        zzpvVar.f47692zzj = zzmcVar;
        zzoy zzoyVar = new zzoy(zzpvVar);
        zzoyVar.zzaw();
        zzpvVar.f47689zzg = zzoyVar;
        zzpvVar.f47688zzf = new zzhm(zzpvVar);
        if (zzpvVar.zzs != zzpvVar.zzt) {
            zzpvVar.zzaW().zze().zzc("Not all upload components initialized", Integer.valueOf(zzpvVar.zzs), Integer.valueOf(zzpvVar.zzt));
        }
        zzpvVar.zzo.set(true);
        zzpvVar.zzaW().zzj().zza("UploadController is now fully initialized");
    }

    public static final void zzaA(com.google.android.gms.internal.measurement.zzhl zzhlVar, int i, String str) {
        List listZzp = zzhlVar.zzp();
        for (int i2 = 0; i2 < listZzp.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzhq) listZzp.get(i2)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzhp zzhpVarZze = com.google.android.gms.internal.measurement.zzhq.zze();
        zzhpVarZze.zzj("_err");
        zzhpVarZze.zzi(i);
        com.google.android.gms.internal.measurement.zzhq zzhqVar = (com.google.android.gms.internal.measurement.zzhq) zzhpVarZze.zzba();
        com.google.android.gms.internal.measurement.zzhp zzhpVarZze2 = com.google.android.gms.internal.measurement.zzhq.zze();
        zzhpVarZze2.zzj("_ev");
        zzhpVarZze2.zzk(str);
        com.google.android.gms.internal.measurement.zzhq zzhqVar2 = (com.google.android.gms.internal.measurement.zzhq) zzhpVarZze2.zzba();
        zzhlVar.zzf(zzhqVar);
        zzhlVar.zzf(zzhqVar2);
    }

    public static final void zzaB(com.google.android.gms.internal.measurement.zzhl zzhlVar, @NonNull String str) {
        List listZzp = zzhlVar.zzp();
        for (int i = 0; i < listZzp.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzhq) listZzp.get(i)).zzg())) {
                zzhlVar.zzh(i);
                return;
            }
        }
    }

    private final int zzaC(String str, zzao zzaoVar) {
        zzjw zzjwVar;
        zzju zzjuVarZzf;
        zzif zzifVar = this.f47685zzc;
        if (zzifVar.zzi(str) == null) {
            zzaoVar.zzd(zzjw.AD_PERSONALIZATION, zzan.FAILSAFE);
            return 1;
        }
        zzh zzhVarZzl = zzj().zzl(str);
        if (zzhVarZzl != null && zze.zza(zzhVarZzl.zzK()).zzb() == zzju.POLICY && (zzjuVarZzf = zzifVar.zzf(str, (zzjwVar = zzjw.AD_PERSONALIZATION))) != zzju.UNINITIALIZED) {
            zzaoVar.zzd(zzjwVar, zzan.REMOTE_ENFORCED_DEFAULT);
            return zzjuVarZzf == zzju.GRANTED ? 0 : 1;
        }
        zzjw zzjwVar2 = zzjw.AD_PERSONALIZATION;
        zzaoVar.zzd(zzjwVar2, zzan.REMOTE_DEFAULT);
        return zzifVar.zzu(str, zzjwVar2) ? 0 : 1;
    }

    private final zzr zzaD(String str) {
        zzh zzhVarZzl = zzj().zzl(str);
        if (zzhVarZzl == null || TextUtils.isEmpty(zzhVarZzl.zzF())) {
            zzaW().zzd().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean boolZzaF = zzaF(zzhVarZzl);
        if (boolZzaF == null || boolZzaF.booleanValue()) {
            return new zzr(str, zzhVarZzl.zzH(), zzhVarZzl.zzF(), zzhVarZzl.zze(), zzhVarZzl.zzE(), zzhVarZzl.zzq(), zzhVarZzl.zzn(), (String) null, zzhVarZzl.zzaJ(), false, zzhVarZzl.zzG(), 0L, 0, zzhVarZzl.zzaI(), false, zzhVarZzl.zzA(), zzhVarZzl.zzx(), zzhVarZzl.zzo(), zzhVarZzl.zzN(), (String) null, zzu(str).zzq(), "", (String) null, zzhVarZzl.zzaL(), zzhVarZzl.zzw(), zzu(str).zzb(), zzm(str).zzj(), zzhVarZzl.zza(), zzhVarZzl.zzf(), zzhVarZzl.zzM(), zzhVarZzl.zzK(), 0L, zzhVarZzl.zzb());
        }
        zzaW().zze().zzb("App version does not match; dropping. appId", zzhe.zzn(str));
        return null;
    }

    private final zzaz zzaE() {
        if (this.zzI == null) {
            this.zzI = new zzpn(this, this.zzn);
        }
        return this.zzI;
    }

    private final Boolean zzaF(zzh zzhVar) {
        try {
            if (zzhVar.zze() != -2147483648L) {
                if (zzhVar.zze() == Wrappers.packageManager(this.zzn.zzaT()).getPackageInfo(zzhVar.zzC(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzaT()).getPackageInfo(zzhVar.zzC(), 0).versionName;
                String strZzF = zzhVar.zzF();
                if (strZzF != null && strZzF.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static String zzaG(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    private final void zzaH() {
        zzaX().zzg();
        if (this.zzu || this.zzv || this.zzw) {
            zzaW().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
            return;
        }
        zzaW().zzj().zza("Stopping uploading service(s)");
        List list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            ((Runnable) it8.next()).run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    private final void zzaI(com.google.android.gms.internal.measurement.zzhw zzhwVar, long j2, boolean z) {
        Object obj2;
        String str = true != z ? "_lte" : "_se";
        zzqd zzqdVarZzy = zzj().zzy(zzhwVar.zzaF(), str);
        zzqd zzqdVar = (zzqdVarZzy == null || (obj2 = zzqdVarZzy.f47726zze) == null) ? new zzqd(zzhwVar.zzaF(), "auto", str, zzaU().currentTimeMillis(), Long.valueOf(j2)) : new zzqd(zzhwVar.zzaF(), "auto", str, zzaU().currentTimeMillis(), Long.valueOf(((Long) obj2).longValue() + j2));
        com.google.android.gms.internal.measurement.zzin zzinVarZze = com.google.android.gms.internal.measurement.zzio.zze();
        zzinVarZze.zzf(str);
        zzinVarZze.zzg(zzaU().currentTimeMillis());
        Object obj3 = zzqdVar.f47726zze;
        zzinVarZze.zze(((Long) obj3).longValue());
        com.google.android.gms.internal.measurement.zzio zzioVar = (com.google.android.gms.internal.measurement.zzio) zzinVarZze.zzba();
        int iZza = zzqa.zza(zzhwVar, str);
        if (iZza >= 0) {
            zzhwVar.zzaC(iZza, zzioVar);
        } else {
            zzhwVar.zzp(zzioVar);
        }
        if (j2 > 0) {
            zzj().zzai(zzqdVar);
            zzaW().zzj().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", obj3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaJ() {
        zzaX().zzg();
        if (this.zzr.isEmpty() || zzaE().zze()) {
            return;
        }
        long jMax = Math.max(0L, ((long) ((Integer) zzgi.zzaA.zza(null)).intValue()) - (zzaU().elapsedRealtime() - this.zzJ));
        zzaW().zzj().zzb("Scheduling notify next app runnable, delay in ms", Long.valueOf(jMax));
        zzaE().zzd(jMax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzaK(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    private final void zzaL() {
        long jMax;
        long jMax2;
        zzaX().zzg();
        zzM();
        if (this.f47684zza > 0) {
            long jAbs = CoreConstants.MILLIS_IN_ONE_HOUR - Math.abs(zzaU().elapsedRealtime() - this.f47684zza);
            if (jAbs > 0) {
                zzaW().zzj().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                zzq().zzc();
                zzx().zza();
                return;
            }
            this.f47684zza = 0L;
        }
        if (!this.zzn.zzM() || !zzaN()) {
            zzaW().zzj().zza("Nothing to upload or uploading impossible");
            zzq().zzc();
            zzx().zza();
            return;
        }
        long jCurrentTimeMillis = zzaU().currentTimeMillis();
        zzi();
        long jMax3 = Math.max(0L, ((Long) zzgi.zzN.zza(null)).longValue());
        boolean z = true;
        if (!zzj().zzac() && !zzj().zzab()) {
            z = false;
        }
        if (z) {
            String strZzo = zzi().zzo();
            if (TextUtils.isEmpty(strZzo) || ".none.".equals(strZzo)) {
                zzi();
                jMax = Math.max(0L, ((Long) zzgi.zzH.zza(null)).longValue());
            } else {
                zzi();
                jMax = Math.max(0L, ((Long) zzgi.zzI.zza(null)).longValue());
            }
        } else {
            zzi();
            jMax = Math.max(0L, ((Long) zzgi.zzG.zza(null)).longValue());
        }
        long jZza = this.f47693zzk.f47585zzd.zza();
        long jZza2 = this.f47693zzk.f47586zze.zza();
        long j2 = 0;
        boolean z3 = z;
        long jMax4 = Math.max(zzj().zzf(), zzj().zzh());
        if (jMax4 == 0) {
            jMax2 = 0;
        } else {
            long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
            long jAbs3 = jCurrentTimeMillis - Math.abs(jZza - jCurrentTimeMillis);
            long jAbs4 = jCurrentTimeMillis - Math.abs(jZza2 - jCurrentTimeMillis);
            jMax2 = jMax3 + jAbs2;
            long jMax5 = Math.max(jAbs3, jAbs4);
            if (z3 && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + jMax;
            }
            if (!zzA().zzz(jMax5, jMax)) {
                jMax2 = jMax5 + jMax;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i = 0;
                while (true) {
                    zzi();
                    if (i >= Math.min(20, Math.max(0, ((Integer) zzgi.zzP.zza(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    zzi();
                    jMax2 += Math.max(j2, ((Long) zzgi.zzO.zza(null)).longValue()) * (1 << i);
                    if (jMax2 > jAbs4) {
                        break;
                    }
                    i++;
                    j2 = 0;
                }
            }
            j2 = 0;
        }
        if (jMax2 == j2) {
            zzaW().zzj().zza("Next upload time is 0");
            zzq().zzc();
            zzx().zza();
            return;
        }
        if (!zzp().zzd()) {
            zzaW().zzj().zza("No network");
            zzq().zzb();
            zzx().zza();
            return;
        }
        long jZza3 = this.f47693zzk.f47584zzc.zza();
        zzi();
        long jMax6 = Math.max(0L, ((Long) zzgi.zzE.zza(null)).longValue());
        if (!zzA().zzz(jZza3, jMax6)) {
            jMax2 = Math.max(jMax2, jZza3 + jMax6);
        }
        zzq().zzc();
        long jCurrentTimeMillis2 = jMax2 - zzaU().currentTimeMillis();
        if (jCurrentTimeMillis2 <= 0) {
            zzi();
            jCurrentTimeMillis2 = Math.max(0L, ((Long) zzgi.zzJ.zza(null)).longValue());
            this.f47693zzk.f47585zzd.zzb(zzaU().currentTimeMillis());
        }
        zzaW().zzj().zzb("Upload scheduled in approximately ms", Long.valueOf(jCurrentTimeMillis2));
        zzx().zzd(jCurrentTimeMillis2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03d8 A[Catch: all -> 0x00f2, TryCatch #1 {all -> 0x00f2, blocks: (B:3:0x0015, B:5:0x002c, B:8:0x0036, B:9:0x004c, B:12:0x005c, B:15:0x0086, B:17:0x00bb, B:20:0x00cc, B:22:0x00d6, B:213:0x0693, B:27:0x0106, B:29:0x0118, B:32:0x0128, B:34:0x012e, B:38:0x0138, B:40:0x0145, B:42:0x0151, B:44:0x0157, B:48:0x0162, B:49:0x0170, B:51:0x017e, B:54:0x019e, B:56:0x01a4, B:58:0x01b4, B:60:0x01c2, B:62:0x01d2, B:63:0x01df, B:64:0x01e2, B:67:0x01f8, B:76:0x022b, B:79:0x0235, B:81:0x0243, B:87:0x0298, B:82:0x0264, B:84:0x0276, B:91:0x02ab, B:93:0x02d7, B:94:0x0301, B:96:0x0338, B:98:0x0340, B:101:0x034c, B:103:0x0383, B:104:0x039e, B:106:0x03a4, B:108:0x03b4, B:112:0x03ca, B:109:0x03be, B:115:0x03d1, B:118:0x03d8, B:119:0x03f0, B:121:0x0409, B:122:0x0415, B:125:0x0422, B:131:0x0445, B:128:0x0434, B:154:0x04c9, B:156:0x04d5, B:159:0x04e6, B:161:0x04f7, B:163:0x0503, B:179:0x056d, B:181:0x0573, B:182:0x057f, B:184:0x0585, B:186:0x0595, B:188:0x059f, B:189:0x05b0, B:191:0x05b6, B:192:0x05cf, B:194:0x05d5, B:195:0x05f3, B:196:0x0601, B:200:0x0626, B:197:0x0607, B:199:0x0613, B:201:0x062d, B:202:0x0643, B:204:0x0649, B:206:0x065c, B:207:0x0669, B:208:0x066d, B:210:0x0673, B:212:0x067f, B:167:0x0521, B:169:0x0531, B:172:0x0544, B:174:0x0556, B:176:0x0562, B:135:0x044f, B:137:0x045b, B:139:0x0467, B:152:0x04ad, B:144:0x0485, B:147:0x0497, B:149:0x049d, B:151:0x04a7, B:216:0x06b2, B:218:0x06c0, B:220:0x06c9, B:231:0x06f9, B:221:0x06d1, B:223:0x06da, B:225:0x06e0, B:228:0x06ec, B:230:0x06f4, B:232:0x06fc, B:233:0x0708, B:236:0x0710, B:238:0x0722, B:239:0x072d, B:241:0x0735, B:245:0x075b, B:247:0x0775, B:249:0x078a, B:251:0x07a4, B:253:0x07b9, B:254:0x07c7, B:256:0x07cd, B:258:0x07dd, B:259:0x07e4, B:261:0x07f0, B:262:0x07f7, B:263:0x07fa, B:265:0x083c, B:267:0x0842, B:273:0x0869, B:275:0x0871, B:276:0x087a, B:278:0x0880, B:279:0x0886, B:281:0x089b, B:283:0x08ab, B:285:0x08bb, B:287:0x08c3, B:288:0x08c6, B:296:0x0942, B:298:0x095b, B:300:0x0971, B:302:0x0976, B:304:0x097a, B:306:0x097e, B:308:0x0988, B:310:0x0991, B:312:0x0995, B:314:0x099b, B:316:0x09a6, B:318:0x09b4, B:323:0x09d6, B:330:0x0a0f, B:331:0x0a17, B:333:0x0a1d, B:335:0x0a2f, B:343:0x0a59, B:326:0x09dc, B:268:0x0850, B:270:0x0856, B:272:0x085c, B:252:0x07b6, B:248:0x0787, B:242:0x073b, B:244:0x0741), top: B:468:0x0015, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03f0 A[Catch: all -> 0x00f2, TryCatch #1 {all -> 0x00f2, blocks: (B:3:0x0015, B:5:0x002c, B:8:0x0036, B:9:0x004c, B:12:0x005c, B:15:0x0086, B:17:0x00bb, B:20:0x00cc, B:22:0x00d6, B:213:0x0693, B:27:0x0106, B:29:0x0118, B:32:0x0128, B:34:0x012e, B:38:0x0138, B:40:0x0145, B:42:0x0151, B:44:0x0157, B:48:0x0162, B:49:0x0170, B:51:0x017e, B:54:0x019e, B:56:0x01a4, B:58:0x01b4, B:60:0x01c2, B:62:0x01d2, B:63:0x01df, B:64:0x01e2, B:67:0x01f8, B:76:0x022b, B:79:0x0235, B:81:0x0243, B:87:0x0298, B:82:0x0264, B:84:0x0276, B:91:0x02ab, B:93:0x02d7, B:94:0x0301, B:96:0x0338, B:98:0x0340, B:101:0x034c, B:103:0x0383, B:104:0x039e, B:106:0x03a4, B:108:0x03b4, B:112:0x03ca, B:109:0x03be, B:115:0x03d1, B:118:0x03d8, B:119:0x03f0, B:121:0x0409, B:122:0x0415, B:125:0x0422, B:131:0x0445, B:128:0x0434, B:154:0x04c9, B:156:0x04d5, B:159:0x04e6, B:161:0x04f7, B:163:0x0503, B:179:0x056d, B:181:0x0573, B:182:0x057f, B:184:0x0585, B:186:0x0595, B:188:0x059f, B:189:0x05b0, B:191:0x05b6, B:192:0x05cf, B:194:0x05d5, B:195:0x05f3, B:196:0x0601, B:200:0x0626, B:197:0x0607, B:199:0x0613, B:201:0x062d, B:202:0x0643, B:204:0x0649, B:206:0x065c, B:207:0x0669, B:208:0x066d, B:210:0x0673, B:212:0x067f, B:167:0x0521, B:169:0x0531, B:172:0x0544, B:174:0x0556, B:176:0x0562, B:135:0x044f, B:137:0x045b, B:139:0x0467, B:152:0x04ad, B:144:0x0485, B:147:0x0497, B:149:0x049d, B:151:0x04a7, B:216:0x06b2, B:218:0x06c0, B:220:0x06c9, B:231:0x06f9, B:221:0x06d1, B:223:0x06da, B:225:0x06e0, B:228:0x06ec, B:230:0x06f4, B:232:0x06fc, B:233:0x0708, B:236:0x0710, B:238:0x0722, B:239:0x072d, B:241:0x0735, B:245:0x075b, B:247:0x0775, B:249:0x078a, B:251:0x07a4, B:253:0x07b9, B:254:0x07c7, B:256:0x07cd, B:258:0x07dd, B:259:0x07e4, B:261:0x07f0, B:262:0x07f7, B:263:0x07fa, B:265:0x083c, B:267:0x0842, B:273:0x0869, B:275:0x0871, B:276:0x087a, B:278:0x0880, B:279:0x0886, B:281:0x089b, B:283:0x08ab, B:285:0x08bb, B:287:0x08c3, B:288:0x08c6, B:296:0x0942, B:298:0x095b, B:300:0x0971, B:302:0x0976, B:304:0x097a, B:306:0x097e, B:308:0x0988, B:310:0x0991, B:312:0x0995, B:314:0x099b, B:316:0x09a6, B:318:0x09b4, B:323:0x09d6, B:330:0x0a0f, B:331:0x0a17, B:333:0x0a1d, B:335:0x0a2f, B:343:0x0a59, B:326:0x09dc, B:268:0x0850, B:270:0x0856, B:272:0x085c, B:252:0x07b6, B:248:0x0787, B:242:0x073b, B:244:0x0741), top: B:468:0x0015, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0409 A[Catch: all -> 0x00f2, TryCatch #1 {all -> 0x00f2, blocks: (B:3:0x0015, B:5:0x002c, B:8:0x0036, B:9:0x004c, B:12:0x005c, B:15:0x0086, B:17:0x00bb, B:20:0x00cc, B:22:0x00d6, B:213:0x0693, B:27:0x0106, B:29:0x0118, B:32:0x0128, B:34:0x012e, B:38:0x0138, B:40:0x0145, B:42:0x0151, B:44:0x0157, B:48:0x0162, B:49:0x0170, B:51:0x017e, B:54:0x019e, B:56:0x01a4, B:58:0x01b4, B:60:0x01c2, B:62:0x01d2, B:63:0x01df, B:64:0x01e2, B:67:0x01f8, B:76:0x022b, B:79:0x0235, B:81:0x0243, B:87:0x0298, B:82:0x0264, B:84:0x0276, B:91:0x02ab, B:93:0x02d7, B:94:0x0301, B:96:0x0338, B:98:0x0340, B:101:0x034c, B:103:0x0383, B:104:0x039e, B:106:0x03a4, B:108:0x03b4, B:112:0x03ca, B:109:0x03be, B:115:0x03d1, B:118:0x03d8, B:119:0x03f0, B:121:0x0409, B:122:0x0415, B:125:0x0422, B:131:0x0445, B:128:0x0434, B:154:0x04c9, B:156:0x04d5, B:159:0x04e6, B:161:0x04f7, B:163:0x0503, B:179:0x056d, B:181:0x0573, B:182:0x057f, B:184:0x0585, B:186:0x0595, B:188:0x059f, B:189:0x05b0, B:191:0x05b6, B:192:0x05cf, B:194:0x05d5, B:195:0x05f3, B:196:0x0601, B:200:0x0626, B:197:0x0607, B:199:0x0613, B:201:0x062d, B:202:0x0643, B:204:0x0649, B:206:0x065c, B:207:0x0669, B:208:0x066d, B:210:0x0673, B:212:0x067f, B:167:0x0521, B:169:0x0531, B:172:0x0544, B:174:0x0556, B:176:0x0562, B:135:0x044f, B:137:0x045b, B:139:0x0467, B:152:0x04ad, B:144:0x0485, B:147:0x0497, B:149:0x049d, B:151:0x04a7, B:216:0x06b2, B:218:0x06c0, B:220:0x06c9, B:231:0x06f9, B:221:0x06d1, B:223:0x06da, B:225:0x06e0, B:228:0x06ec, B:230:0x06f4, B:232:0x06fc, B:233:0x0708, B:236:0x0710, B:238:0x0722, B:239:0x072d, B:241:0x0735, B:245:0x075b, B:247:0x0775, B:249:0x078a, B:251:0x07a4, B:253:0x07b9, B:254:0x07c7, B:256:0x07cd, B:258:0x07dd, B:259:0x07e4, B:261:0x07f0, B:262:0x07f7, B:263:0x07fa, B:265:0x083c, B:267:0x0842, B:273:0x0869, B:275:0x0871, B:276:0x087a, B:278:0x0880, B:279:0x0886, B:281:0x089b, B:283:0x08ab, B:285:0x08bb, B:287:0x08c3, B:288:0x08c6, B:296:0x0942, B:298:0x095b, B:300:0x0971, B:302:0x0976, B:304:0x097a, B:306:0x097e, B:308:0x0988, B:310:0x0991, B:312:0x0995, B:314:0x099b, B:316:0x09a6, B:318:0x09b4, B:323:0x09d6, B:330:0x0a0f, B:331:0x0a17, B:333:0x0a1d, B:335:0x0a2f, B:343:0x0a59, B:326:0x09dc, B:268:0x0850, B:270:0x0856, B:272:0x085c, B:252:0x07b6, B:248:0x0787, B:242:0x073b, B:244:0x0741), top: B:468:0x0015, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04d5 A[Catch: all -> 0x00f2, TryCatch #1 {all -> 0x00f2, blocks: (B:3:0x0015, B:5:0x002c, B:8:0x0036, B:9:0x004c, B:12:0x005c, B:15:0x0086, B:17:0x00bb, B:20:0x00cc, B:22:0x00d6, B:213:0x0693, B:27:0x0106, B:29:0x0118, B:32:0x0128, B:34:0x012e, B:38:0x0138, B:40:0x0145, B:42:0x0151, B:44:0x0157, B:48:0x0162, B:49:0x0170, B:51:0x017e, B:54:0x019e, B:56:0x01a4, B:58:0x01b4, B:60:0x01c2, B:62:0x01d2, B:63:0x01df, B:64:0x01e2, B:67:0x01f8, B:76:0x022b, B:79:0x0235, B:81:0x0243, B:87:0x0298, B:82:0x0264, B:84:0x0276, B:91:0x02ab, B:93:0x02d7, B:94:0x0301, B:96:0x0338, B:98:0x0340, B:101:0x034c, B:103:0x0383, B:104:0x039e, B:106:0x03a4, B:108:0x03b4, B:112:0x03ca, B:109:0x03be, B:115:0x03d1, B:118:0x03d8, B:119:0x03f0, B:121:0x0409, B:122:0x0415, B:125:0x0422, B:131:0x0445, B:128:0x0434, B:154:0x04c9, B:156:0x04d5, B:159:0x04e6, B:161:0x04f7, B:163:0x0503, B:179:0x056d, B:181:0x0573, B:182:0x057f, B:184:0x0585, B:186:0x0595, B:188:0x059f, B:189:0x05b0, B:191:0x05b6, B:192:0x05cf, B:194:0x05d5, B:195:0x05f3, B:196:0x0601, B:200:0x0626, B:197:0x0607, B:199:0x0613, B:201:0x062d, B:202:0x0643, B:204:0x0649, B:206:0x065c, B:207:0x0669, B:208:0x066d, B:210:0x0673, B:212:0x067f, B:167:0x0521, B:169:0x0531, B:172:0x0544, B:174:0x0556, B:176:0x0562, B:135:0x044f, B:137:0x045b, B:139:0x0467, B:152:0x04ad, B:144:0x0485, B:147:0x0497, B:149:0x049d, B:151:0x04a7, B:216:0x06b2, B:218:0x06c0, B:220:0x06c9, B:231:0x06f9, B:221:0x06d1, B:223:0x06da, B:225:0x06e0, B:228:0x06ec, B:230:0x06f4, B:232:0x06fc, B:233:0x0708, B:236:0x0710, B:238:0x0722, B:239:0x072d, B:241:0x0735, B:245:0x075b, B:247:0x0775, B:249:0x078a, B:251:0x07a4, B:253:0x07b9, B:254:0x07c7, B:256:0x07cd, B:258:0x07dd, B:259:0x07e4, B:261:0x07f0, B:262:0x07f7, B:263:0x07fa, B:265:0x083c, B:267:0x0842, B:273:0x0869, B:275:0x0871, B:276:0x087a, B:278:0x0880, B:279:0x0886, B:281:0x089b, B:283:0x08ab, B:285:0x08bb, B:287:0x08c3, B:288:0x08c6, B:296:0x0942, B:298:0x095b, B:300:0x0971, B:302:0x0976, B:304:0x097a, B:306:0x097e, B:308:0x0988, B:310:0x0991, B:312:0x0995, B:314:0x099b, B:316:0x09a6, B:318:0x09b4, B:323:0x09d6, B:330:0x0a0f, B:331:0x0a17, B:333:0x0a1d, B:335:0x0a2f, B:343:0x0a59, B:326:0x09dc, B:268:0x0850, B:270:0x0856, B:272:0x085c, B:252:0x07b6, B:248:0x0787, B:242:0x073b, B:244:0x0741), top: B:468:0x0015, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0521 A[Catch: all -> 0x00f2, TryCatch #1 {all -> 0x00f2, blocks: (B:3:0x0015, B:5:0x002c, B:8:0x0036, B:9:0x004c, B:12:0x005c, B:15:0x0086, B:17:0x00bb, B:20:0x00cc, B:22:0x00d6, B:213:0x0693, B:27:0x0106, B:29:0x0118, B:32:0x0128, B:34:0x012e, B:38:0x0138, B:40:0x0145, B:42:0x0151, B:44:0x0157, B:48:0x0162, B:49:0x0170, B:51:0x017e, B:54:0x019e, B:56:0x01a4, B:58:0x01b4, B:60:0x01c2, B:62:0x01d2, B:63:0x01df, B:64:0x01e2, B:67:0x01f8, B:76:0x022b, B:79:0x0235, B:81:0x0243, B:87:0x0298, B:82:0x0264, B:84:0x0276, B:91:0x02ab, B:93:0x02d7, B:94:0x0301, B:96:0x0338, B:98:0x0340, B:101:0x034c, B:103:0x0383, B:104:0x039e, B:106:0x03a4, B:108:0x03b4, B:112:0x03ca, B:109:0x03be, B:115:0x03d1, B:118:0x03d8, B:119:0x03f0, B:121:0x0409, B:122:0x0415, B:125:0x0422, B:131:0x0445, B:128:0x0434, B:154:0x04c9, B:156:0x04d5, B:159:0x04e6, B:161:0x04f7, B:163:0x0503, B:179:0x056d, B:181:0x0573, B:182:0x057f, B:184:0x0585, B:186:0x0595, B:188:0x059f, B:189:0x05b0, B:191:0x05b6, B:192:0x05cf, B:194:0x05d5, B:195:0x05f3, B:196:0x0601, B:200:0x0626, B:197:0x0607, B:199:0x0613, B:201:0x062d, B:202:0x0643, B:204:0x0649, B:206:0x065c, B:207:0x0669, B:208:0x066d, B:210:0x0673, B:212:0x067f, B:167:0x0521, B:169:0x0531, B:172:0x0544, B:174:0x0556, B:176:0x0562, B:135:0x044f, B:137:0x045b, B:139:0x0467, B:152:0x04ad, B:144:0x0485, B:147:0x0497, B:149:0x049d, B:151:0x04a7, B:216:0x06b2, B:218:0x06c0, B:220:0x06c9, B:231:0x06f9, B:221:0x06d1, B:223:0x06da, B:225:0x06e0, B:228:0x06ec, B:230:0x06f4, B:232:0x06fc, B:233:0x0708, B:236:0x0710, B:238:0x0722, B:239:0x072d, B:241:0x0735, B:245:0x075b, B:247:0x0775, B:249:0x078a, B:251:0x07a4, B:253:0x07b9, B:254:0x07c7, B:256:0x07cd, B:258:0x07dd, B:259:0x07e4, B:261:0x07f0, B:262:0x07f7, B:263:0x07fa, B:265:0x083c, B:267:0x0842, B:273:0x0869, B:275:0x0871, B:276:0x087a, B:278:0x0880, B:279:0x0886, B:281:0x089b, B:283:0x08ab, B:285:0x08bb, B:287:0x08c3, B:288:0x08c6, B:296:0x0942, B:298:0x095b, B:300:0x0971, B:302:0x0976, B:304:0x097a, B:306:0x097e, B:308:0x0988, B:310:0x0991, B:312:0x0995, B:314:0x099b, B:316:0x09a6, B:318:0x09b4, B:323:0x09d6, B:330:0x0a0f, B:331:0x0a17, B:333:0x0a1d, B:335:0x0a2f, B:343:0x0a59, B:326:0x09dc, B:268:0x0850, B:270:0x0856, B:272:0x085c, B:252:0x07b6, B:248:0x0787, B:242:0x073b, B:244:0x0741), top: B:468:0x0015, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x056b A[PHI: r4 r9
      0x056b: PHI (r4v61 int) = (r4v60 int), (r4v60 int), (r4v75 int) binds: [B:168:0x052f, B:170:0x0540, B:166:0x051c] A[DONT_GENERATE, DONT_INLINE]
      0x056b: PHI (r9v23 com.google.android.gms.internal.measurement.zzhw) = 
      (r9v22 com.google.android.gms.internal.measurement.zzhw)
      (r9v22 com.google.android.gms.internal.measurement.zzhw)
      (r9v26 com.google.android.gms.internal.measurement.zzhw)
     binds: [B:168:0x052f, B:170:0x0540, B:166:0x051c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0573 A[Catch: all -> 0x00f2, TryCatch #1 {all -> 0x00f2, blocks: (B:3:0x0015, B:5:0x002c, B:8:0x0036, B:9:0x004c, B:12:0x005c, B:15:0x0086, B:17:0x00bb, B:20:0x00cc, B:22:0x00d6, B:213:0x0693, B:27:0x0106, B:29:0x0118, B:32:0x0128, B:34:0x012e, B:38:0x0138, B:40:0x0145, B:42:0x0151, B:44:0x0157, B:48:0x0162, B:49:0x0170, B:51:0x017e, B:54:0x019e, B:56:0x01a4, B:58:0x01b4, B:60:0x01c2, B:62:0x01d2, B:63:0x01df, B:64:0x01e2, B:67:0x01f8, B:76:0x022b, B:79:0x0235, B:81:0x0243, B:87:0x0298, B:82:0x0264, B:84:0x0276, B:91:0x02ab, B:93:0x02d7, B:94:0x0301, B:96:0x0338, B:98:0x0340, B:101:0x034c, B:103:0x0383, B:104:0x039e, B:106:0x03a4, B:108:0x03b4, B:112:0x03ca, B:109:0x03be, B:115:0x03d1, B:118:0x03d8, B:119:0x03f0, B:121:0x0409, B:122:0x0415, B:125:0x0422, B:131:0x0445, B:128:0x0434, B:154:0x04c9, B:156:0x04d5, B:159:0x04e6, B:161:0x04f7, B:163:0x0503, B:179:0x056d, B:181:0x0573, B:182:0x057f, B:184:0x0585, B:186:0x0595, B:188:0x059f, B:189:0x05b0, B:191:0x05b6, B:192:0x05cf, B:194:0x05d5, B:195:0x05f3, B:196:0x0601, B:200:0x0626, B:197:0x0607, B:199:0x0613, B:201:0x062d, B:202:0x0643, B:204:0x0649, B:206:0x065c, B:207:0x0669, B:208:0x066d, B:210:0x0673, B:212:0x067f, B:167:0x0521, B:169:0x0531, B:172:0x0544, B:174:0x0556, B:176:0x0562, B:135:0x044f, B:137:0x045b, B:139:0x0467, B:152:0x04ad, B:144:0x0485, B:147:0x0497, B:149:0x049d, B:151:0x04a7, B:216:0x06b2, B:218:0x06c0, B:220:0x06c9, B:231:0x06f9, B:221:0x06d1, B:223:0x06da, B:225:0x06e0, B:228:0x06ec, B:230:0x06f4, B:232:0x06fc, B:233:0x0708, B:236:0x0710, B:238:0x0722, B:239:0x072d, B:241:0x0735, B:245:0x075b, B:247:0x0775, B:249:0x078a, B:251:0x07a4, B:253:0x07b9, B:254:0x07c7, B:256:0x07cd, B:258:0x07dd, B:259:0x07e4, B:261:0x07f0, B:262:0x07f7, B:263:0x07fa, B:265:0x083c, B:267:0x0842, B:273:0x0869, B:275:0x0871, B:276:0x087a, B:278:0x0880, B:279:0x0886, B:281:0x089b, B:283:0x08ab, B:285:0x08bb, B:287:0x08c3, B:288:0x08c6, B:296:0x0942, B:298:0x095b, B:300:0x0971, B:302:0x0976, B:304:0x097a, B:306:0x097e, B:308:0x0988, B:310:0x0991, B:312:0x0995, B:314:0x099b, B:316:0x09a6, B:318:0x09b4, B:323:0x09d6, B:330:0x0a0f, B:331:0x0a17, B:333:0x0a1d, B:335:0x0a2f, B:343:0x0a59, B:326:0x09dc, B:268:0x0850, B:270:0x0856, B:272:0x085c, B:252:0x07b6, B:248:0x0787, B:242:0x073b, B:244:0x0741), top: B:468:0x0015, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06d1 A[Catch: all -> 0x00f2, TryCatch #1 {all -> 0x00f2, blocks: (B:3:0x0015, B:5:0x002c, B:8:0x0036, B:9:0x004c, B:12:0x005c, B:15:0x0086, B:17:0x00bb, B:20:0x00cc, B:22:0x00d6, B:213:0x0693, B:27:0x0106, B:29:0x0118, B:32:0x0128, B:34:0x012e, B:38:0x0138, B:40:0x0145, B:42:0x0151, B:44:0x0157, B:48:0x0162, B:49:0x0170, B:51:0x017e, B:54:0x019e, B:56:0x01a4, B:58:0x01b4, B:60:0x01c2, B:62:0x01d2, B:63:0x01df, B:64:0x01e2, B:67:0x01f8, B:76:0x022b, B:79:0x0235, B:81:0x0243, B:87:0x0298, B:82:0x0264, B:84:0x0276, B:91:0x02ab, B:93:0x02d7, B:94:0x0301, B:96:0x0338, B:98:0x0340, B:101:0x034c, B:103:0x0383, B:104:0x039e, B:106:0x03a4, B:108:0x03b4, B:112:0x03ca, B:109:0x03be, B:115:0x03d1, B:118:0x03d8, B:119:0x03f0, B:121:0x0409, B:122:0x0415, B:125:0x0422, B:131:0x0445, B:128:0x0434, B:154:0x04c9, B:156:0x04d5, B:159:0x04e6, B:161:0x04f7, B:163:0x0503, B:179:0x056d, B:181:0x0573, B:182:0x057f, B:184:0x0585, B:186:0x0595, B:188:0x059f, B:189:0x05b0, B:191:0x05b6, B:192:0x05cf, B:194:0x05d5, B:195:0x05f3, B:196:0x0601, B:200:0x0626, B:197:0x0607, B:199:0x0613, B:201:0x062d, B:202:0x0643, B:204:0x0649, B:206:0x065c, B:207:0x0669, B:208:0x066d, B:210:0x0673, B:212:0x067f, B:167:0x0521, B:169:0x0531, B:172:0x0544, B:174:0x0556, B:176:0x0562, B:135:0x044f, B:137:0x045b, B:139:0x0467, B:152:0x04ad, B:144:0x0485, B:147:0x0497, B:149:0x049d, B:151:0x04a7, B:216:0x06b2, B:218:0x06c0, B:220:0x06c9, B:231:0x06f9, B:221:0x06d1, B:223:0x06da, B:225:0x06e0, B:228:0x06ec, B:230:0x06f4, B:232:0x06fc, B:233:0x0708, B:236:0x0710, B:238:0x0722, B:239:0x072d, B:241:0x0735, B:245:0x075b, B:247:0x0775, B:249:0x078a, B:251:0x07a4, B:253:0x07b9, B:254:0x07c7, B:256:0x07cd, B:258:0x07dd, B:259:0x07e4, B:261:0x07f0, B:262:0x07f7, B:263:0x07fa, B:265:0x083c, B:267:0x0842, B:273:0x0869, B:275:0x0871, B:276:0x087a, B:278:0x0880, B:279:0x0886, B:281:0x089b, B:283:0x08ab, B:285:0x08bb, B:287:0x08c3, B:288:0x08c6, B:296:0x0942, B:298:0x095b, B:300:0x0971, B:302:0x0976, B:304:0x097a, B:306:0x097e, B:308:0x0988, B:310:0x0991, B:312:0x0995, B:314:0x099b, B:316:0x09a6, B:318:0x09b4, B:323:0x09d6, B:330:0x0a0f, B:331:0x0a17, B:333:0x0a1d, B:335:0x0a2f, B:343:0x0a59, B:326:0x09dc, B:268:0x0850, B:270:0x0856, B:272:0x085c, B:252:0x07b6, B:248:0x0787, B:242:0x073b, B:244:0x0741), top: B:468:0x0015, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0a0f A[Catch: all -> 0x00f2, TRY_ENTER, TryCatch #1 {all -> 0x00f2, blocks: (B:3:0x0015, B:5:0x002c, B:8:0x0036, B:9:0x004c, B:12:0x005c, B:15:0x0086, B:17:0x00bb, B:20:0x00cc, B:22:0x00d6, B:213:0x0693, B:27:0x0106, B:29:0x0118, B:32:0x0128, B:34:0x012e, B:38:0x0138, B:40:0x0145, B:42:0x0151, B:44:0x0157, B:48:0x0162, B:49:0x0170, B:51:0x017e, B:54:0x019e, B:56:0x01a4, B:58:0x01b4, B:60:0x01c2, B:62:0x01d2, B:63:0x01df, B:64:0x01e2, B:67:0x01f8, B:76:0x022b, B:79:0x0235, B:81:0x0243, B:87:0x0298, B:82:0x0264, B:84:0x0276, B:91:0x02ab, B:93:0x02d7, B:94:0x0301, B:96:0x0338, B:98:0x0340, B:101:0x034c, B:103:0x0383, B:104:0x039e, B:106:0x03a4, B:108:0x03b4, B:112:0x03ca, B:109:0x03be, B:115:0x03d1, B:118:0x03d8, B:119:0x03f0, B:121:0x0409, B:122:0x0415, B:125:0x0422, B:131:0x0445, B:128:0x0434, B:154:0x04c9, B:156:0x04d5, B:159:0x04e6, B:161:0x04f7, B:163:0x0503, B:179:0x056d, B:181:0x0573, B:182:0x057f, B:184:0x0585, B:186:0x0595, B:188:0x059f, B:189:0x05b0, B:191:0x05b6, B:192:0x05cf, B:194:0x05d5, B:195:0x05f3, B:196:0x0601, B:200:0x0626, B:197:0x0607, B:199:0x0613, B:201:0x062d, B:202:0x0643, B:204:0x0649, B:206:0x065c, B:207:0x0669, B:208:0x066d, B:210:0x0673, B:212:0x067f, B:167:0x0521, B:169:0x0531, B:172:0x0544, B:174:0x0556, B:176:0x0562, B:135:0x044f, B:137:0x045b, B:139:0x0467, B:152:0x04ad, B:144:0x0485, B:147:0x0497, B:149:0x049d, B:151:0x04a7, B:216:0x06b2, B:218:0x06c0, B:220:0x06c9, B:231:0x06f9, B:221:0x06d1, B:223:0x06da, B:225:0x06e0, B:228:0x06ec, B:230:0x06f4, B:232:0x06fc, B:233:0x0708, B:236:0x0710, B:238:0x0722, B:239:0x072d, B:241:0x0735, B:245:0x075b, B:247:0x0775, B:249:0x078a, B:251:0x07a4, B:253:0x07b9, B:254:0x07c7, B:256:0x07cd, B:258:0x07dd, B:259:0x07e4, B:261:0x07f0, B:262:0x07f7, B:263:0x07fa, B:265:0x083c, B:267:0x0842, B:273:0x0869, B:275:0x0871, B:276:0x087a, B:278:0x0880, B:279:0x0886, B:281:0x089b, B:283:0x08ab, B:285:0x08bb, B:287:0x08c3, B:288:0x08c6, B:296:0x0942, B:298:0x095b, B:300:0x0971, B:302:0x0976, B:304:0x097a, B:306:0x097e, B:308:0x0988, B:310:0x0991, B:312:0x0995, B:314:0x099b, B:316:0x09a6, B:318:0x09b4, B:323:0x09d6, B:330:0x0a0f, B:331:0x0a17, B:333:0x0a1d, B:335:0x0a2f, B:343:0x0a59, B:326:0x09dc, B:268:0x0850, B:270:0x0856, B:272:0x085c, B:252:0x07b6, B:248:0x0787, B:242:0x073b, B:244:0x0741), top: B:468:0x0015, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0a43 A[PHI: r15
      0x0a43: PHI (r15v3 java.lang.String) = (r15v2 java.lang.String), (r15v12 java.lang.String) binds: [B:329:0x0a0d, B:526:0x0a43] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0a59 A[Catch: all -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00f2, blocks: (B:3:0x0015, B:5:0x002c, B:8:0x0036, B:9:0x004c, B:12:0x005c, B:15:0x0086, B:17:0x00bb, B:20:0x00cc, B:22:0x00d6, B:213:0x0693, B:27:0x0106, B:29:0x0118, B:32:0x0128, B:34:0x012e, B:38:0x0138, B:40:0x0145, B:42:0x0151, B:44:0x0157, B:48:0x0162, B:49:0x0170, B:51:0x017e, B:54:0x019e, B:56:0x01a4, B:58:0x01b4, B:60:0x01c2, B:62:0x01d2, B:63:0x01df, B:64:0x01e2, B:67:0x01f8, B:76:0x022b, B:79:0x0235, B:81:0x0243, B:87:0x0298, B:82:0x0264, B:84:0x0276, B:91:0x02ab, B:93:0x02d7, B:94:0x0301, B:96:0x0338, B:98:0x0340, B:101:0x034c, B:103:0x0383, B:104:0x039e, B:106:0x03a4, B:108:0x03b4, B:112:0x03ca, B:109:0x03be, B:115:0x03d1, B:118:0x03d8, B:119:0x03f0, B:121:0x0409, B:122:0x0415, B:125:0x0422, B:131:0x0445, B:128:0x0434, B:154:0x04c9, B:156:0x04d5, B:159:0x04e6, B:161:0x04f7, B:163:0x0503, B:179:0x056d, B:181:0x0573, B:182:0x057f, B:184:0x0585, B:186:0x0595, B:188:0x059f, B:189:0x05b0, B:191:0x05b6, B:192:0x05cf, B:194:0x05d5, B:195:0x05f3, B:196:0x0601, B:200:0x0626, B:197:0x0607, B:199:0x0613, B:201:0x062d, B:202:0x0643, B:204:0x0649, B:206:0x065c, B:207:0x0669, B:208:0x066d, B:210:0x0673, B:212:0x067f, B:167:0x0521, B:169:0x0531, B:172:0x0544, B:174:0x0556, B:176:0x0562, B:135:0x044f, B:137:0x045b, B:139:0x0467, B:152:0x04ad, B:144:0x0485, B:147:0x0497, B:149:0x049d, B:151:0x04a7, B:216:0x06b2, B:218:0x06c0, B:220:0x06c9, B:231:0x06f9, B:221:0x06d1, B:223:0x06da, B:225:0x06e0, B:228:0x06ec, B:230:0x06f4, B:232:0x06fc, B:233:0x0708, B:236:0x0710, B:238:0x0722, B:239:0x072d, B:241:0x0735, B:245:0x075b, B:247:0x0775, B:249:0x078a, B:251:0x07a4, B:253:0x07b9, B:254:0x07c7, B:256:0x07cd, B:258:0x07dd, B:259:0x07e4, B:261:0x07f0, B:262:0x07f7, B:263:0x07fa, B:265:0x083c, B:267:0x0842, B:273:0x0869, B:275:0x0871, B:276:0x087a, B:278:0x0880, B:279:0x0886, B:281:0x089b, B:283:0x08ab, B:285:0x08bb, B:287:0x08c3, B:288:0x08c6, B:296:0x0942, B:298:0x095b, B:300:0x0971, B:302:0x0976, B:304:0x097a, B:306:0x097e, B:308:0x0988, B:310:0x0991, B:312:0x0995, B:314:0x099b, B:316:0x09a6, B:318:0x09b4, B:323:0x09d6, B:330:0x0a0f, B:331:0x0a17, B:333:0x0a1d, B:335:0x0a2f, B:343:0x0a59, B:326:0x09dc, B:268:0x0850, B:270:0x0856, B:272:0x085c, B:252:0x07b6, B:248:0x0787, B:242:0x073b, B:244:0x0741), top: B:468:0x0015, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0a7c A[Catch: all -> 0x0adb, TRY_ENTER, TryCatch #5 {all -> 0x0adb, blocks: (B:290:0x090e, B:291:0x0921, B:293:0x0927, B:390:0x0bd4, B:321:0x09c0, B:328:0x09f1, B:345:0x0a7c, B:347:0x0a88, B:349:0x0a9c, B:353:0x0ae2, B:359:0x0afe, B:361:0x0b09, B:363:0x0b0d, B:365:0x0b11, B:367:0x0b15, B:368:0x0b21, B:369:0x0b2b, B:371:0x0b31, B:373:0x0b49, B:374:0x0b4e, B:389:0x0bd1, B:375:0x0b64, B:377:0x0b6a, B:381:0x0b87, B:383:0x0ba7, B:384:0x0bae, B:388:0x0bc4, B:378:0x0b73, B:341:0x0a45, B:391:0x0bde, B:393:0x0be8, B:394:0x0bee, B:395:0x0bf6, B:397:0x0bfc, B:398:0x0c10, B:400:0x0c20, B:420:0x0c9d, B:401:0x0c38, B:403:0x0c3e, B:405:0x0c46, B:407:0x0c4d, B:413:0x0c5b, B:415:0x0c62, B:417:0x0c8e, B:419:0x0c95, B:418:0x0c92, B:414:0x0c5f, B:406:0x0c4a), top: B:475:0x090e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0d45 A[Catch: all -> 0x0ccb, TryCatch #4 {all -> 0x0ccb, blocks: (B:423:0x0ca5, B:425:0x0cbc, B:428:0x0cc3, B:435:0x0cf5, B:437:0x0d35, B:440:0x0d66, B:441:0x0d6a, B:442:0x0d74, B:444:0x0db7, B:445:0x0dc4, B:447:0x0dd3, B:454:0x0e1d, B:455:0x0e2e, B:459:0x0e4c, B:458:0x0e39, B:450:0x0dea, B:452:0x0e03, B:439:0x0d45, B:431:0x0cce, B:433:0x0cda, B:434:0x0cde, B:460:0x0e55), top: B:474:0x002a, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0160  */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.measurement.internal.zzpv] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.measurement.internal.zzpv] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v13 */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v15 */
    /* JADX WARN: Type inference failed for: r26v16 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v136 */
    /* JADX WARN: Type inference failed for: r2v137 */
    /* JADX WARN: Type inference failed for: r2v138 */
    /* JADX WARN: Type inference failed for: r2v139 */
    /* JADX WARN: Type inference failed for: r2v140 */
    /* JADX WARN: Type inference failed for: r2v141 */
    /* JADX WARN: Type inference failed for: r2v142 */
    /* JADX WARN: Type inference failed for: r2v143 */
    /* JADX WARN: Type inference failed for: r2v144 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.measurement.internal.zzpv] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.measurement.internal.zzpv] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [com.google.android.gms.measurement.internal.zzpv] */
    /* JADX WARN: Type inference failed for: r2v48, types: [com.google.android.gms.measurement.internal.zzpv] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.measurement.internal.zzpv] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzaM(java.lang.String r43, long r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpv.zzaM(java.lang.String, long):boolean");
    }

    private final boolean zzaN() {
        zzaX().zzg();
        zzM();
        return zzj().zzaa() || !TextUtils.isEmpty(zzj().zzA());
    }

    private final boolean zzaO(String str, String str2) {
        zzbd zzbdVarZzs = zzj().zzs(str, str2);
        return zzbdVarZzs == null || zzbdVarZzs.f46939zzc < 1;
    }

    private final boolean zzaP(com.google.android.gms.internal.measurement.zzhl zzhlVar, com.google.android.gms.internal.measurement.zzhl zzhlVar2) {
        Preconditions.checkArgument("_e".equals(zzhlVar.zzo()));
        zzA();
        com.google.android.gms.internal.measurement.zzhq zzhqVarZzG = zzqa.zzG((com.google.android.gms.internal.measurement.zzhm) zzhlVar.zzba(), "_sc");
        String strZzh = zzhqVarZzG == null ? null : zzhqVarZzG.zzh();
        zzA();
        com.google.android.gms.internal.measurement.zzhq zzhqVarZzG2 = zzqa.zzG((com.google.android.gms.internal.measurement.zzhm) zzhlVar2.zzba(), "_pc");
        String strZzh2 = zzhqVarZzG2 != null ? zzhqVarZzG2.zzh() : null;
        if (strZzh2 == null || !strZzh2.equals(strZzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzhlVar.zzo()));
        zzA();
        com.google.android.gms.internal.measurement.zzhq zzhqVarZzG3 = zzqa.zzG((com.google.android.gms.internal.measurement.zzhm) zzhlVar.zzba(), "_et");
        if (zzhqVarZzG3 == null || !zzhqVarZzG3.zzw() || zzhqVarZzG3.zzd() <= 0) {
            return true;
        }
        long jZzd = zzhqVarZzG3.zzd();
        zzA();
        com.google.android.gms.internal.measurement.zzhq zzhqVarZzG4 = zzqa.zzG((com.google.android.gms.internal.measurement.zzhm) zzhlVar2.zzba(), "_et");
        if (zzhqVarZzG4 != null && zzhqVarZzG4.zzd() > 0) {
            jZzd += zzhqVarZzG4.zzd();
        }
        zzA();
        zzqa.zzD(zzhlVar2, "_et", Long.valueOf(jZzd));
        zzA();
        zzqa.zzD(zzhlVar, "_fr", 1L);
        return true;
    }

    private static final boolean zzaQ(zzr zzrVar) {
        return (TextUtils.isEmpty(zzrVar.f47737zzb) && TextUtils.isEmpty(zzrVar.zzp)) ? false : true;
    }

    private static final zzpg zzaR(zzpg zzpgVar) {
        if (zzpgVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzpgVar.zzax()) {
            return zzpgVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzpgVar.getClass())));
    }

    private static final Boolean zzaS(zzr zzrVar) {
        Boolean bool = zzrVar.zzq;
        String str = zzrVar.zzE;
        if (!TextUtils.isEmpty(str)) {
            zzju zzjuVarZzb = zze.zza(str).zzb();
            zzju zzjuVar = zzju.UNINITIALIZED;
            int iOrdinal = zzjuVarZzb.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    public static zzpv zzz(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f47683zzb == null) {
            synchronized (zzpv.class) {
                try {
                    if (f47683zzb == null) {
                        f47683zzb = new zzpv((zzpw) Preconditions.checkNotNull(new zzpw(context)), null);
                    }
                } finally {
                }
            }
        }
        return f47683zzb;
    }

    public final zzqa zzA() {
        zzqa zzqaVar = this.f47691zzi;
        zzaR(zzqaVar);
        return zzqaVar;
    }

    public final zzqf zzB() {
        return ((zzio) Preconditions.checkNotNull(this.zzn)).zzw();
    }

    public final String zzC(zzjx zzjxVar) {
        if (!zzjxVar.zzr(zzjw.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzB().zzJ().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String zzD(zzr zzrVar) {
        try {
            return (String) zzaX().zzf(new zzpo(this, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzaW().zze().zzc("Failed to get app instance id. appId", zzhe.zzn(zzrVar.f47736zza), e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public final List zzF(zzr zzrVar, Bundle bundle) {
        zzaX().zzg();
        zzqr.zzb();
        zzam zzamVarZzi = zzi();
        String str = zzrVar.f47736zza;
        if (!zzamVarZzi.zzx(str, zzgi.zzaV) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    zzaW().zze().zza("Uri sources and timestamps do not match");
                } else {
                    for (int i = 0; i < intArray.length; i++) {
                        zzaw zzawVarZzj = zzj();
                        int i2 = intArray[i];
                        long j2 = longArray[i];
                        Preconditions.checkNotEmpty(str);
                        zzawVarZzj.zzg();
                        zzawVarZzj.zzav();
                        try {
                            int iDelete = zzawVarZzj.zzj().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j2)});
                            zzawVarZzj.zzu.zzaW().zzj().zzd("Pruned " + iDelete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i2), Long.valueOf(j2));
                        } catch (SQLiteException e) {
                            zzawVarZzj.zzu.zzaW().zze().zzc("Error pruning trigger URIs. appId", zzhe.zzn(str), e);
                        }
                    }
                }
            }
        }
        zzaw zzawVarZzj2 = zzj();
        String str2 = zzrVar.f47736zza;
        Preconditions.checkNotEmpty(str2);
        zzawVarZzj2.zzg();
        zzawVarZzj2.zzav();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = zzawVarZzj2.zzj().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzov(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e2) {
                zzawVarZzj2.zzu.zzaW().zze().zzc("Error querying trigger uris. appId", zzhe.zzn(str2), e2);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } finally {
        }
    }

    public final void zzK(Runnable runnable) {
        zzaX().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }

    public final void zzL() {
        zzaX().zzg();
        zzM();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzaz()) {
            FileChannel fileChannel = this.zzy;
            zzaX().zzg();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzaW().zze().zza("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i2 = fileChannel.read(byteBufferAllocate);
                    if (i2 == 4) {
                        byteBufferAllocate.flip();
                        i = byteBufferAllocate.getInt();
                    } else if (i2 != -1) {
                        zzaW().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(i2));
                    }
                } catch (IOException e) {
                    zzaW().zze().zzb("Failed to read from channel", e);
                }
            }
            int iZzi = this.zzn.zzh().zzi();
            zzaX().zzg();
            if (i > iZzi) {
                zzaW().zze().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzi));
                return;
            }
            if (i < iZzi) {
                FileChannel fileChannel2 = this.zzy;
                zzaX().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzaW().zze().zza("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iZzi);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzaW().zze().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzaW().zzj().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzi));
                        return;
                    } catch (IOException e2) {
                        zzaW().zze().zzb("Failed to write to channel", e2);
                    }
                }
                zzaW().zze().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(iZzi));
            }
        }
    }

    public final void zzM() {
        if (!this.zzo.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzN(java.lang.String r7, com.google.android.gms.internal.measurement.zzhw r8) {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.zzif r0 = r6.zzr()
            java.util.Set r0 = r0.zzo(r7)
            if (r0 == 0) goto Ld
            r8.zzl(r0)
        Ld:
            com.google.android.gms.measurement.internal.zzif r0 = r6.zzr()
            boolean r0 = r0.zzB(r7)
            if (r0 == 0) goto L1a
            r8.zzs()
        L1a:
            com.google.android.gms.measurement.internal.zzif r0 = r6.zzr()
            boolean r0 = r0.zzE(r7)
            r1 = -1
            if (r0 == 0) goto L3f
            java.lang.String r0 = r8.zzaK()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L3f
            java.lang.String r2 = "."
            int r2 = r0.indexOf(r2)
            if (r2 == r1) goto L3f
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r2)
            r8.zzam(r0)
        L3f:
            com.google.android.gms.measurement.internal.zzif r0 = r6.zzr()
            boolean r0 = r0.zzF(r7)
            if (r0 == 0) goto L54
            java.lang.String r0 = "_id"
            int r0 = com.google.android.gms.measurement.internal.zzqa.zza(r8, r0)
            if (r0 == r1) goto L54
            r8.zzE(r0)
        L54:
            com.google.android.gms.measurement.internal.zzif r0 = r6.zzr()
            boolean r0 = r0.zzD(r7)
            if (r0 == 0) goto L61
            r8.zzt()
        L61:
            com.google.android.gms.measurement.internal.zzif r0 = r6.zzr()
            boolean r0 = r0.zzA(r7)
            if (r0 == 0) goto Lab
            r8.zzq()
            com.google.android.gms.measurement.internal.zzjx r0 = r6.zzu(r7)
            com.google.android.gms.measurement.internal.zzjw r1 = com.google.android.gms.measurement.internal.zzjw.ANALYTICS_STORAGE
            boolean r0 = r0.zzr(r1)
            if (r0 == 0) goto Lab
            java.util.Map r0 = r6.zzE
            java.lang.Object r1 = r0.get(r7)
            com.google.android.gms.measurement.internal.zzps r1 = (com.google.android.gms.measurement.internal.zzps) r1
            if (r1 == 0) goto L9d
            long r2 = r1.f47679zzb
            com.google.android.gms.measurement.internal.zzam r4 = r6.zzi()
            com.google.android.gms.measurement.internal.zzgg r5 = com.google.android.gms.measurement.internal.zzgi.zzaj
            long r4 = r4.zzk(r7, r5)
            long r4 = r4 + r2
            com.google.android.gms.common.util.Clock r2 = r6.zzaU()
            long r2 = r2.elapsedRealtime()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto La6
        L9d:
            com.google.android.gms.measurement.internal.zzps r1 = new com.google.android.gms.measurement.internal.zzps
            r2 = 0
            r1.<init>(r6)
            r0.put(r7, r1)
        La6:
            java.lang.String r0 = r1.f47678zza
            r8.zzac(r0)
        Lab:
            com.google.android.gms.measurement.internal.zzif r0 = r6.zzr()
            boolean r7 = r0.zzC(r7)
            if (r7 == 0) goto Lb8
            r8.zzA()
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpv.zzN(java.lang.String, com.google.android.gms.internal.measurement.zzhw):void");
    }

    public final void zzO(zzh zzhVar) {
        zzaX().zzg();
        if (TextUtils.isEmpty(zzhVar.zzH()) && TextUtils.isEmpty(zzhVar.zzA())) {
            zzW((String) Preconditions.checkNotNull(zzhVar.zzC()), Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2, null, null, null);
            return;
        }
        String str = (String) Preconditions.checkNotNull(zzhVar.zzC());
        zzaW().zzj().zzb("Fetching remote configuration", str);
        com.google.android.gms.internal.measurement.zzgo zzgoVarZzj = zzr().zzj(str);
        String strZzl = zzr().zzl(str);
        ArrayMap arrayMap = null;
        if (zzgoVarZzj != null) {
            if (!TextUtils.isEmpty(strZzl)) {
                arrayMap = new ArrayMap();
                arrayMap.put("If-Modified-Since", strZzl);
            }
            String strZzk = zzr().zzk(str);
            if (!TextUtils.isEmpty(strZzk)) {
                if (arrayMap == null) {
                    arrayMap = new ArrayMap();
                }
                arrayMap.put("If-None-Match", strZzk);
            }
        }
        this.zzu = true;
        zzp().zza(zzhVar, arrayMap, new zzhg() { // from class: com.google.android.gms.measurement.internal.zzpj
            @Override // com.google.android.gms.measurement.internal.zzhg
            public final void zza(String str2, int i, Throwable th10, byte[] bArr, Map map) {
                this.f47656zza.zzW(str2, i, th10, bArr, map);
            }
        });
    }

    public final void zzP(zzr zzrVar, long j2) {
        zzh zzhVarZzl = zzj().zzl((String) Preconditions.checkNotNull(zzrVar.f47736zza));
        if (zzhVarZzl != null && zzB().zzaw(zzrVar.f47737zzb, zzhVarZzl.zzH(), zzrVar.zzp, zzhVarZzl.zzA())) {
            zzaW().zzk().zzb("New GMP App Id passed in. Removing cached database data. appId", zzhe.zzn(zzhVarZzl.zzC()));
            zzaw zzawVarZzj = zzj();
            String strZzC = zzhVarZzl.zzC();
            zzawVarZzj.zzav();
            zzawVarZzj.zzg();
            Preconditions.checkNotEmpty(strZzC);
            try {
                SQLiteDatabase sQLiteDatabaseZzj = zzawVarZzj.zzj();
                String[] strArr = {strZzC};
                int iDelete = sQLiteDatabaseZzj.delete("events", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("trigger_uris", "app_id=?", strArr);
                if (iDelete > 0) {
                    zzawVarZzj.zzu.zzaW().zzj().zzc("Deleted application data. app, records", strZzC, Integer.valueOf(iDelete));
                }
            } catch (SQLiteException e) {
                zzawVarZzj.zzu.zzaW().zze().zzc("Error deleting application data. appId, error", zzhe.zzn(strZzC), e);
            }
            zzhVarZzl = null;
        }
        if (zzhVarZzl != null) {
            boolean z = (zzhVarZzl.zze() == -2147483648L || zzhVarZzl.zze() == zzrVar.f47745zzj) ? false : true;
            String strZzF = zzhVarZzl.zzF();
            if (z || ((zzhVarZzl.zze() != -2147483648L || strZzF == null || strZzF.equals(zzrVar.f47738zzc)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strZzF);
                zzbh zzbhVar = new zzbh("_au", new zzbf(bundle), "auto", j2);
                if (zzi().zzx(null, zzgi.zzbm)) {
                    zzU(zzbhVar, zzrVar);
                } else {
                    zzS(zzbhVar, zzrVar);
                }
            }
        }
    }

    public final void zzQ(zzh zzhVar, com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        com.google.android.gms.internal.measurement.zzio zzioVar;
        zzaX().zzg();
        zzM();
        zzao zzaoVarZzb = zzao.zzb(zzhwVar.zzaH());
        String strZzC = zzhVar.zzC();
        zzaX().zzg();
        zzM();
        zzjx zzjxVarZzu = zzu(strZzC);
        zzju zzjuVar = zzju.UNINITIALIZED;
        int iOrdinal = zzjxVarZzu.zze().ordinal();
        if (iOrdinal == 1) {
            zzaoVarZzb.zzd(zzjw.AD_STORAGE, zzan.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            zzaoVarZzb.zzc(zzjw.AD_STORAGE, zzjxVarZzu.zzb());
        } else {
            zzaoVarZzb.zzd(zzjw.AD_STORAGE, zzan.FAILSAFE);
        }
        int iOrdinal2 = zzjxVarZzu.zzf().ordinal();
        if (iOrdinal2 == 1) {
            zzaoVarZzb.zzd(zzjw.ANALYTICS_STORAGE, zzan.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            zzaoVarZzb.zzc(zzjw.ANALYTICS_STORAGE, zzjxVarZzu.zzb());
        } else {
            zzaoVarZzb.zzd(zzjw.ANALYTICS_STORAGE, zzan.FAILSAFE);
        }
        String strZzC2 = zzhVar.zzC();
        zzaX().zzg();
        zzM();
        zzba zzbaVarZzl = zzl(strZzC2, zzm(strZzC2), zzu(strZzC2), zzaoVarZzb);
        zzhwVar.zzak(((Boolean) Preconditions.checkNotNull(zzbaVarZzl.zzh())).booleanValue());
        if (!TextUtils.isEmpty(zzbaVarZzl.zzi())) {
            zzhwVar.zzU(zzbaVarZzl.zzi());
        }
        zzaX().zzg();
        zzM();
        Iterator it8 = zzhwVar.zzaN().iterator();
        while (true) {
            if (it8.hasNext()) {
                zzioVar = (com.google.android.gms.internal.measurement.zzio) it8.next();
                if ("_npa".equals(zzioVar.zzg())) {
                    break;
                }
            } else {
                zzioVar = null;
                break;
            }
        }
        if (zzioVar != null) {
            zzjw zzjwVar = zzjw.AD_PERSONALIZATION;
            if (zzaoVarZzb.zza(zzjwVar) == zzan.UNSET) {
                zzqd zzqdVarZzy = zzj().zzy(zzhVar.zzC(), "_npa");
                if (zzqdVarZzy != null) {
                    String str = zzqdVarZzy.f47723zzb;
                    if ("tcf".equals(str)) {
                        zzaoVarZzb.zzd(zzjwVar, zzan.TCF);
                    } else if ("app".equals(str)) {
                        zzaoVarZzb.zzd(zzjwVar, zzan.API);
                    } else {
                        zzaoVarZzb.zzd(zzjwVar, zzan.MANIFEST);
                    }
                } else {
                    Boolean boolZzx = zzhVar.zzx();
                    if (boolZzx == null || ((boolZzx.booleanValue() && zzioVar.zzc() != 1) || !(boolZzx.booleanValue() || zzioVar.zzc() == 0))) {
                        zzaoVarZzb.zzd(zzjwVar, zzan.API);
                    } else {
                        zzaoVarZzb.zzd(zzjwVar, zzan.MANIFEST);
                    }
                }
            }
        } else {
            int iZzaC = zzaC(zzhVar.zzC(), zzaoVarZzb);
            com.google.android.gms.internal.measurement.zzin zzinVarZze = com.google.android.gms.internal.measurement.zzio.zze();
            zzinVarZze.zzf("_npa");
            zzinVarZze.zzg(zzaU().currentTimeMillis());
            zzinVarZze.zze(iZzaC);
            zzhwVar.zzp((com.google.android.gms.internal.measurement.zzio) zzinVarZze.zzba());
            zzaW().zzj().zzc("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(iZzaC));
        }
        zzhwVar.zzS(zzaoVarZzb.toString());
        boolean zZzv = this.f47685zzc.zzv(zzhVar.zzC());
        List listZzaM = zzhwVar.zzaM();
        int i = 0;
        for (int i2 = 0; i2 < listZzaM.size(); i2++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.zzhm) listZzaM.get(i2)).zzh())) {
                com.google.android.gms.internal.measurement.zzhl zzhlVar = (com.google.android.gms.internal.measurement.zzhl) ((com.google.android.gms.internal.measurement.zzhm) listZzaM.get(i2)).zzch();
                List listZzp = zzhlVar.zzp();
                int i3 = 0;
                while (true) {
                    if (i3 >= listZzp.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.zzhq) listZzp.get(i3)).zzg())) {
                        String strZzh = ((com.google.android.gms.internal.measurement.zzhq) listZzp.get(i3)).zzh();
                        if (zZzv && strZzh.length() > 4) {
                            char[] charArray = strZzh.toCharArray();
                            int i5 = 1;
                            while (true) {
                                if (i5 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i5)) {
                                    i = i5;
                                    break;
                                }
                                i5++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i | 1);
                            strZzh = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.zzhp zzhpVarZze = com.google.android.gms.internal.measurement.zzhq.zze();
                        zzhpVarZze.zzj("_tcfd");
                        zzhpVarZze.zzk(strZzh);
                        zzhlVar.zzj(i3, zzhpVarZze);
                    } else {
                        i3++;
                    }
                }
                zzhwVar.zzad(i2, zzhlVar);
                return;
            }
        }
    }

    public final void zzR(com.google.android.gms.internal.measurement.zzhw zzhwVar, zzpr zzprVar) {
        for (int i = 0; i < zzhwVar.zzc(); i++) {
            com.google.android.gms.internal.measurement.zzhl zzhlVar = (com.google.android.gms.internal.measurement.zzhl) zzhwVar.zzh(i).zzch();
            Iterator it8 = zzhlVar.zzp().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.zzhq) it8.next()).zzg())) {
                    if (zzprVar.f47673zza.zza() >= zzi().zzh(zzprVar.f47673zza.zzF(), zzgi.zzak)) {
                        int iZzh = zzi().zzh(zzprVar.f47673zza.zzF(), zzgi.zzax);
                        String strZzF = null;
                        if (iZzh <= 0) {
                            if (zzi().zzx(zzprVar.f47673zza.zzF(), zzgi.zzaX)) {
                                strZzF = zzB().zzF();
                                com.google.android.gms.internal.measurement.zzhp zzhpVarZze = com.google.android.gms.internal.measurement.zzhq.zze();
                                zzhpVarZze.zzj("_tu");
                                zzhpVarZze.zzk(strZzF);
                                zzhlVar.zzf((com.google.android.gms.internal.measurement.zzhq) zzhpVarZze.zzba());
                            }
                            com.google.android.gms.internal.measurement.zzhp zzhpVarZze2 = com.google.android.gms.internal.measurement.zzhq.zze();
                            zzhpVarZze2.zzj("_tr");
                            zzhpVarZze2.zzi(1L);
                            zzhlVar.zzf((com.google.android.gms.internal.measurement.zzhq) zzhpVarZze2.zzba());
                            zzov zzovVarZzl = zzA().zzl(zzprVar.f47673zza.zzF(), zzhwVar, zzhlVar, strZzF);
                            if (zzovVarZzl != null) {
                                zzaW().zzj().zzc("Generated trigger URI. appId, uri", zzprVar.f47673zza.zzF(), zzovVarZzl.f47632zza);
                                zzj().zzad(zzprVar.f47673zza.zzF(), zzovVarZzl);
                                Deque deque = this.zzr;
                                if (!deque.contains(zzprVar.f47673zza.zzF())) {
                                    deque.add(zzprVar.f47673zza.zzF());
                                }
                            }
                        } else if (zzj().zzo(zza(), zzprVar.f47673zza.zzF(), false, false, false, false, false, false, true).f46894zzg > iZzh) {
                            com.google.android.gms.internal.measurement.zzhp zzhpVarZze3 = com.google.android.gms.internal.measurement.zzhq.zze();
                            zzhpVarZze3.zzj("_tnr");
                            zzhpVarZze3.zzi(1L);
                            zzhlVar.zzf((com.google.android.gms.internal.measurement.zzhq) zzhpVarZze3.zzba());
                        } else {
                            if (zzi().zzx(zzprVar.f47673zza.zzF(), zzgi.zzaX)) {
                                strZzF = zzB().zzF();
                                com.google.android.gms.internal.measurement.zzhp zzhpVarZze4 = com.google.android.gms.internal.measurement.zzhq.zze();
                                zzhpVarZze4.zzj("_tu");
                                zzhpVarZze4.zzk(strZzF);
                                zzhlVar.zzf((com.google.android.gms.internal.measurement.zzhq) zzhpVarZze4.zzba());
                            }
                            com.google.android.gms.internal.measurement.zzhp zzhpVarZze5 = com.google.android.gms.internal.measurement.zzhq.zze();
                            zzhpVarZze5.zzj("_tr");
                            zzhpVarZze5.zzi(1L);
                            zzhlVar.zzf((com.google.android.gms.internal.measurement.zzhq) zzhpVarZze5.zzba());
                            zzov zzovVarZzl2 = zzA().zzl(zzprVar.f47673zza.zzF(), zzhwVar, zzhlVar, strZzF);
                            if (zzovVarZzl2 != null) {
                                zzaW().zzj().zzc("Generated trigger URI. appId, uri", zzprVar.f47673zza.zzF(), zzovVarZzl2.f47632zza);
                                zzj().zzad(zzprVar.f47673zza.zzF(), zzovVarZzl2);
                                Deque deque2 = this.zzr;
                                if (!deque2.contains(zzprVar.f47673zza.zzF())) {
                                    deque2.add(zzprVar.f47673zza.zzF());
                                }
                            }
                        }
                    }
                    zzhwVar.zzae(i, (com.google.android.gms.internal.measurement.zzhm) zzhlVar.zzba());
                }
            }
        }
    }

    public final void zzS(zzbh zzbhVar, zzr zzrVar) {
        zzbh zzbhVar2;
        List<zzai> listZzC;
        List<zzai> listZzC2;
        List<zzai> listZzC3;
        String str;
        Preconditions.checkNotNull(zzrVar);
        String str2 = zzrVar.f47736zza;
        Preconditions.checkNotEmpty(str2);
        zzaX().zzg();
        zzM();
        long j2 = zzbhVar.f46954zzd;
        zzhf zzhfVarZzb = zzhf.zzb(zzbhVar);
        zzaX().zzg();
        zzqf.zzN((this.zzG == null || (str = this.zzH) == null || !str.equals(str2)) ? null : this.zzG, zzhfVarZzb.f47049zzd, false);
        zzbh zzbhVarZza = zzhfVarZzb.zza();
        zzA();
        if (zzqa.zzE(zzbhVarZza, zzrVar)) {
            if (!zzrVar.f47743zzh) {
                zzg(zzrVar);
                return;
            }
            List list = zzrVar.zzs;
            if (list != null) {
                String str3 = zzbhVarZza.f46951zza;
                if (!list.contains(str3)) {
                    zzaW().zzd().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zzbhVarZza.f46951zza, zzbhVarZza.f46953zzc);
                    return;
                } else {
                    Bundle bundleZzc = zzbhVarZza.f46952zzb.zzc();
                    bundleZzc.putLong("ga_safelisted", 1L);
                    zzbhVar2 = new zzbh(str3, new zzbf(bundleZzc), zzbhVarZza.f46953zzc, zzbhVarZza.f46954zzd);
                }
            } else {
                zzbhVar2 = zzbhVarZza;
            }
            zzj().zzH();
            try {
                zzra.zzb();
                if (zzi().zzx(null, zzgi.zzbi) && "_s".equals(zzbhVar2.f46951zza) && !zzj().zzZ(str2, "_s") && zzbhVar2.f46952zzb.zze("_sid").longValue() != 0) {
                    if (zzj().zzZ(str2, "_f") || zzj().zzZ(str2, "_v")) {
                        zzj().zzG(str2, null, "_sid", zzf(str2, zzbhVar2));
                    } else {
                        zzj().zzG(str2, Long.valueOf(zzaU().currentTimeMillis() - 15000), "_sid", zzf(str2, zzbhVar2));
                    }
                }
                zzaw zzawVarZzj = zzj();
                Preconditions.checkNotEmpty(str2);
                zzawVarZzj.zzg();
                zzawVarZzj.zzav();
                if (j2 < 0) {
                    zzawVarZzj.zzu.zzaW().zzk().zzc("Invalid time querying timed out conditional properties", zzhe.zzn(str2), Long.valueOf(j2));
                    listZzC = Collections.EMPTY_LIST;
                } else {
                    listZzC = zzawVarZzj.zzC("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j2)});
                }
                for (zzai zzaiVar : listZzC) {
                    if (zzaiVar != null) {
                        zzaW().zzj().zzd("User property timed out", zzaiVar.f46856zza, this.zzn.zzj().zzf(zzaiVar.f46858zzc.f47716zzb), zzaiVar.f46858zzc.zza());
                        zzbh zzbhVar3 = zzaiVar.f46862zzg;
                        if (zzbhVar3 != null) {
                            zzax(new zzbh(zzbhVar3, j2), zzrVar);
                        }
                        zzj().zza(str2, zzaiVar.f46858zzc.f47716zzb);
                    }
                }
                zzaw zzawVarZzj2 = zzj();
                Preconditions.checkNotEmpty(str2);
                zzawVarZzj2.zzg();
                zzawVarZzj2.zzav();
                if (j2 < 0) {
                    zzawVarZzj2.zzu.zzaW().zzk().zzc("Invalid time querying expired conditional properties", zzhe.zzn(str2), Long.valueOf(j2));
                    listZzC2 = Collections.EMPTY_LIST;
                } else {
                    listZzC2 = zzawVarZzj2.zzC("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(listZzC2.size());
                for (zzai zzaiVar2 : listZzC2) {
                    if (zzaiVar2 != null) {
                        zzaW().zzj().zzd("User property expired", zzaiVar2.f46856zza, this.zzn.zzj().zzf(zzaiVar2.f46858zzc.f47716zzb), zzaiVar2.f46858zzc.zza());
                        zzj().zzP(str2, zzaiVar2.f46858zzc.f47716zzb);
                        zzbh zzbhVar4 = zzaiVar2.f46866zzk;
                        if (zzbhVar4 != null) {
                            arrayList.add(zzbhVar4);
                        }
                        zzj().zza(str2, zzaiVar2.f46858zzc.f47716zzb);
                    }
                }
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    zzax(new zzbh((zzbh) it8.next(), j2), zzrVar);
                }
                zzaw zzawVarZzj3 = zzj();
                String str4 = zzbhVar2.f46951zza;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str4);
                zzawVarZzj3.zzg();
                zzawVarZzj3.zzav();
                if (j2 < 0) {
                    zzio zzioVar = zzawVarZzj3.zzu;
                    zzioVar.zzaW().zzk().zzd("Invalid time querying triggered conditional properties", zzhe.zzn(str2), zzioVar.zzj().zzd(str4), Long.valueOf(j2));
                    listZzC3 = Collections.EMPTY_LIST;
                } else {
                    listZzC3 = zzawVarZzj3.zzC("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j2)});
                }
                ArrayList arrayList2 = new ArrayList(listZzC3.size());
                for (zzai zzaiVar3 : listZzC3) {
                    if (zzaiVar3 != null) {
                        zzqb zzqbVar = zzaiVar3.f46858zzc;
                        zzqd zzqdVar = new zzqd((String) Preconditions.checkNotNull(zzaiVar3.f46856zza), zzaiVar3.f46857zzb, zzqbVar.f47716zzb, j2, Preconditions.checkNotNull(zzqbVar.zza()));
                        if (zzj().zzai(zzqdVar)) {
                            zzaW().zzj().zzd("User property triggered", zzaiVar3.f46856zza, this.zzn.zzj().zzf(zzqdVar.f47724zzc), zzqdVar.f47726zze);
                        } else {
                            zzaW().zze().zzd("Too many active user properties, ignoring", zzhe.zzn(zzaiVar3.f46856zza), this.zzn.zzj().zzf(zzqdVar.f47724zzc), zzqdVar.f47726zze);
                        }
                        zzbh zzbhVar5 = zzaiVar3.f46864zzi;
                        if (zzbhVar5 != null) {
                            arrayList2.add(zzbhVar5);
                        }
                        zzaiVar3.f46858zzc = new zzqb(zzqdVar);
                        zzaiVar3.f46860zze = true;
                        zzj().zzah(zzaiVar3);
                    }
                }
                zzax(zzbhVar2, zzrVar);
                Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    zzax(new zzbh((zzbh) it9.next(), j2), zzrVar);
                }
                zzj().zzS();
                zzj().zzL();
            } catch (Throwable th10) {
                zzj().zzL();
                throw th10;
            }
        }
    }

    public final void zzT(zzbh zzbhVar, String str) {
        zzh zzhVarZzl = zzj().zzl(str);
        if (zzhVarZzl == null || TextUtils.isEmpty(zzhVarZzl.zzF())) {
            zzaW().zzd().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean boolZzaF = zzaF(zzhVarZzl);
        if (boolZzaF == null) {
            if (!"_ui".equals(zzbhVar.f46951zza)) {
                zzaW().zzk().zzb("Could not find package. appId", zzhe.zzn(str));
            }
        } else if (!boolZzaF.booleanValue()) {
            zzaW().zze().zzb("App version does not match; dropping event. appId", zzhe.zzn(str));
            return;
        }
        zzU(zzbhVar, new zzr(str, zzhVarZzl.zzH(), zzhVarZzl.zzF(), zzhVarZzl.zze(), zzhVarZzl.zzE(), zzhVarZzl.zzq(), zzhVarZzl.zzn(), (String) null, zzhVarZzl.zzaJ(), false, zzhVarZzl.zzG(), 0L, 0, zzhVarZzl.zzaI(), false, zzhVarZzl.zzA(), zzhVarZzl.zzx(), zzhVarZzl.zzo(), zzhVarZzl.zzN(), (String) null, zzu(str).zzq(), "", (String) null, zzhVarZzl.zzaL(), zzhVarZzl.zzw(), zzu(str).zzb(), zzm(str).zzj(), zzhVarZzl.zza(), zzhVarZzl.zzf(), zzhVarZzl.zzM(), zzhVarZzl.zzK(), 0L, zzhVarZzl.zzb()));
    }

    public final void zzU(zzbh zzbhVar, zzr zzrVar) {
        String str = zzrVar.f47736zza;
        Preconditions.checkNotEmpty(str);
        zzhf zzhfVarZzb = zzhf.zzb(zzbhVar);
        zzB().zzO(zzhfVarZzb.f47049zzd, zzj().zzk(str));
        zzB().zzQ(zzhfVarZzb, zzi().zzf(str));
        zzbh zzbhVarZza = zzhfVarZzb.zza();
        if ("_cmp".equals(zzbhVarZza.f46951zza)) {
            zzbf zzbfVar = zzbhVarZza.f46952zzb;
            if ("referrer API v2".equals(zzbfVar.zzg("_cis"))) {
                String strZzg = zzbfVar.zzg("gclid");
                if (!TextUtils.isEmpty(strZzg)) {
                    zzas(new zzqb("_lgclid", zzbhVarZza.f46954zzd, strZzg, "auto"), zzrVar);
                }
            }
        }
        zzS(zzbhVarZza, zzrVar);
    }

    public final void zzV() {
        this.zzt++;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzW(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpv.zzW(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void zzX(boolean z) {
        zzaL();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[Catch: all -> 0x0016, TryCatch #2 {all -> 0x0016, blocks: (B:4:0x0013, B:8:0x001b, B:16:0x0034, B:21:0x0080, B:20:0x0071, B:22:0x008c, B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:82:0x0244, B:84:0x0259, B:86:0x0263, B:88:0x026d, B:95:0x028a, B:89:0x0271, B:91:0x027b, B:93:0x0281, B:94:0x0285, B:96:0x028d, B:97:0x0294, B:30:0x00d7, B:98:0x0295), top: B:105:0x0013, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c A[Catch: all -> 0x0016, PHI: r0
      0x008c: PHI (r0v2 int) = (r0v0 int), (r0v36 int) binds: [B:9:0x0027, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0016, blocks: (B:4:0x0013, B:8:0x001b, B:16:0x0034, B:21:0x0080, B:20:0x0071, B:22:0x008c, B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:82:0x0244, B:84:0x0259, B:86:0x0263, B:88:0x026d, B:95:0x028a, B:89:0x0271, B:91:0x027b, B:93:0x0281, B:94:0x0285, B:96:0x028d, B:97:0x0294, B:30:0x00d7, B:98:0x0295), top: B:105:0x0013, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #0 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:82:0x0244, B:84:0x0259, B:86:0x0263, B:88:0x026d, B:95:0x028a, B:89:0x0271, B:91:0x027b, B:93:0x0281, B:94:0x0285, B:96:0x028d, B:97:0x0294, B:30:0x00d7), top: B:103:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #0 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:82:0x0244, B:84:0x0259, B:86:0x0263, B:88:0x026d, B:95:0x028a, B:89:0x0271, B:91:0x027b, B:93:0x0281, B:94:0x0285, B:96:0x028d, B:97:0x0294, B:30:0x00d7), top: B:103:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9 A[Catch: all -> 0x0166, TryCatch #1 {all -> 0x0166, blocks: (B:32:0x00eb, B:34:0x00f9, B:36:0x0105, B:37:0x010e, B:39:0x0114, B:41:0x012d, B:45:0x0150, B:47:0x015a, B:50:0x0169, B:51:0x016d, B:53:0x0173, B:55:0x018a, B:57:0x01af, B:58:0x01b3, B:60:0x01b9, B:61:0x01e0, B:62:0x01e4, B:64:0x01ea, B:65:0x01f1, B:66:0x020b, B:69:0x0217, B:70:0x021e, B:72:0x0220, B:73:0x022f, B:75:0x0231, B:77:0x0235, B:80:0x023c, B:81:0x023d), top: B:104:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ea A[Catch: all -> 0x0166, TRY_LEAVE, TryCatch #1 {all -> 0x0166, blocks: (B:32:0x00eb, B:34:0x00f9, B:36:0x0105, B:37:0x010e, B:39:0x0114, B:41:0x012d, B:45:0x0150, B:47:0x015a, B:50:0x0169, B:51:0x016d, B:53:0x0173, B:55:0x018a, B:57:0x01af, B:58:0x01b3, B:60:0x01b9, B:61:0x01e0, B:62:0x01e4, B:64:0x01ea, B:65:0x01f1, B:66:0x020b, B:69:0x0217, B:70:0x021e, B:72:0x0220, B:73:0x022f, B:75:0x0231, B:77:0x0235, B:80:0x023c, B:81:0x023d), top: B:104:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0271 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #0 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:82:0x0244, B:84:0x0259, B:86:0x0263, B:88:0x026d, B:95:0x028a, B:89:0x0271, B:91:0x027b, B:93:0x0281, B:94:0x0285, B:96:0x028d, B:97:0x0294, B:30:0x00d7), top: B:103:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0285 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #0 {SQLiteException -> 0x00b3, blocks: (B:24:0x00a3, B:27:0x00b6, B:29:0x00c4, B:31:0x00e4, B:82:0x0244, B:84:0x0259, B:86:0x0263, B:88:0x026d, B:95:0x028a, B:89:0x0271, B:91:0x027b, B:93:0x0281, B:94:0x0285, B:96:0x028d, B:97:0x0294, B:30:0x00d7), top: B:103:0x00a3, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzY(boolean r19, int r20, java.lang.Throwable r21, byte[] r22, java.lang.String r23, java.util.List r24) {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpv.zzY(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000d, B:21:0x0067, B:24:0x008d, B:13:0x001e, B:15:0x004b, B:17:0x0055, B:19:0x005f, B:20:0x0063), top: B:29:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzZ(@androidx.annotation.NonNull java.lang.String r4, int r5, java.lang.Throwable r6, byte[] r7, com.google.android.gms.measurement.internal.zzpz r8) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.zzil r0 = r3.zzaX()
            r0.zzg()
            r3.zzM()
            r0 = 0
            if (r7 != 0) goto L13
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r4 = move-exception
            goto La8
        L13:
            r1 = 200(0xc8, float:2.8E-43)
            if (r5 == r1) goto L1c
            r1 = 204(0xcc, float:2.86E-43)
            if (r5 != r1) goto L67
            r5 = r1
        L1c:
            if (r6 != 0) goto L67
            com.google.android.gms.measurement.internal.zzaw r6 = r3.zzj()     // Catch: java.lang.Throwable -> L10
            long r7 = r8.zzc()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L10
            r6.zzK(r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzhe r6 = r3.zzaW()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzj()     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r6.zzc(r7, r4, r5)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzam r5 = r3.zzi()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzgg r6 = com.google.android.gms.measurement.internal.zzgi.zzaM     // Catch: java.lang.Throwable -> L10
            r7 = 0
            boolean r5 = r5.zzx(r7, r6)     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L63
            com.google.android.gms.measurement.internal.zzhk r5 = r3.zzp()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.zzd()     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L63
            com.google.android.gms.measurement.internal.zzaw r5 = r3.zzj()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.zzY(r4)     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L63
            r3.zzav(r4)     // Catch: java.lang.Throwable -> L10
            goto La2
        L63:
            r3.zzaL()     // Catch: java.lang.Throwable -> L10
            goto La2
        L67:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L10
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L10
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L10
            int r7 = r1.length()     // Catch: java.lang.Throwable -> L10
            r2 = 32
            int r7 = java.lang.Math.min(r2, r7)     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = r1.substring(r0, r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzhe r1 = r3.zzaW()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzl()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            if (r6 != 0) goto L8d
            r6 = r7
        L8d:
            r1.zzd(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.zzaw r4 = r3.zzj()     // Catch: java.lang.Throwable -> L10
            long r5 = r8.zzc()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r4.zzN(r5)     // Catch: java.lang.Throwable -> L10
            r3.zzaL()     // Catch: java.lang.Throwable -> L10
        La2:
            r3.zzv = r0
            r3.zzaH()
            return
        La8:
            r3.zzv = r0
            r3.zzaH()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpv.zzZ(java.lang.String, int, java.lang.Throwable, byte[], com.google.android.gms.measurement.internal.zzpz):void");
    }

    public final long zza() {
        long jCurrentTimeMillis = zzaU().currentTimeMillis();
        zzoa zzoaVar = this.f47693zzk;
        zzoaVar.zzav();
        zzoaVar.zzg();
        zzhp zzhpVar = zzoaVar.f47587zzf;
        long jZza = zzhpVar.zza();
        if (jZza == 0) {
            jZza = ((long) zzoaVar.zzu.zzw().zzJ().nextInt(DateTimeConstants.MILLIS_PER_DAY)) + 1;
            zzhpVar.zzb(jZza);
        }
        return ((((jCurrentTimeMillis + jZza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final Context zzaT() {
        return this.zzn.zzaT();
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final Clock zzaU() {
        return ((zzio) Preconditions.checkNotNull(this.zzn)).zzaU();
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final zzaf zzaV() {
        return this.zzn.zzaV();
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final zzhe zzaW() {
        return ((zzio) Preconditions.checkNotNull(this.zzn)).zzaW();
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final zzil zzaX() {
        return ((zzio) Preconditions.checkNotNull(this.zzn)).zzaX();
    }

    public final void zzaa(zzh zzhVar, com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        zzaX().zzg();
        zzM();
        com.google.android.gms.internal.measurement.zzhb zzhbVarZzc = com.google.android.gms.internal.measurement.zzhc.zzc();
        byte[] bArrZzaN = zzhVar.zzaN();
        if (bArrZzaN != null) {
            try {
                zzhbVarZzc = (com.google.android.gms.internal.measurement.zzhb) zzqa.zzp(zzhbVarZzc, bArrZzaN);
            } catch (com.google.android.gms.internal.measurement.zzmm unused) {
                zzaW().zzk().zzb("Failed to parse locally stored ad campaign info. appId", zzhe.zzn(zzhVar.zzC()));
            }
        }
        for (com.google.android.gms.internal.measurement.zzhm zzhmVar : zzhwVar.zzaM()) {
            if (zzhmVar.zzh().equals("_cmp")) {
                String str = (String) zzqa.zzI(zzhmVar, "gclid", "");
                String str2 = (String) zzqa.zzI(zzhmVar, "gbraid", "");
                String str3 = (String) zzqa.zzI(zzhmVar, "gad_source", "");
                if (!str.isEmpty() || !str2.isEmpty()) {
                    long jLongValue = ((Long) zzqa.zzI(zzhmVar, "click_timestamp", 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = zzhmVar.zzd();
                    }
                    if ("referrer API v2".equals(zzqa.zzH(zzhmVar, "_cis"))) {
                        if (jLongValue > zzhbVarZzc.zzb()) {
                            if (str.isEmpty()) {
                                zzhbVarZzc.zzh();
                            } else {
                                zzhbVarZzc.zzp(str);
                            }
                            if (str2.isEmpty()) {
                                zzhbVarZzc.zzg();
                            } else {
                                zzhbVarZzc.zzo(str2);
                            }
                            if (str3.isEmpty()) {
                                zzhbVarZzc.zzf();
                            } else {
                                zzhbVarZzc.zzn(str3);
                            }
                            zzhbVarZzc.zzm(jLongValue);
                        }
                    } else if (jLongValue > zzhbVarZzc.zza()) {
                        if (str.isEmpty()) {
                            zzhbVarZzc.zze();
                        } else {
                            zzhbVarZzc.zzk(str);
                        }
                        if (str2.isEmpty()) {
                            zzhbVarZzc.zzd();
                        } else {
                            zzhbVarZzc.zzj(str2);
                        }
                        if (str3.isEmpty()) {
                            zzhbVarZzc.zzc();
                        } else {
                            zzhbVarZzc.zzi(str3);
                        }
                        zzhbVarZzc.zzl(jLongValue);
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.zzhc) zzhbVarZzc.zzba()).equals(com.google.android.gms.internal.measurement.zzhc.zze())) {
            zzhwVar.zzF((com.google.android.gms.internal.measurement.zzhc) zzhbVarZzc.zzba());
        }
        zzhVar.zzR(((com.google.android.gms.internal.measurement.zzhc) zzhbVarZzc.zzba()).zzcd());
        if (zzhVar.zzaK()) {
            zzj().zzT(zzhVar, false, false);
        }
    }

    public final void zzab(zzr zzrVar) throws Throwable {
        zzaX().zzg();
        zzM();
        Preconditions.checkNotNull(zzrVar);
        String str = zzrVar.f47736zza;
        Preconditions.checkNotEmpty(str);
        int i = 0;
        if (zzi().zzx(null, zzgi.zzay)) {
            long jCurrentTimeMillis = zzaU().currentTimeMillis();
            int iZzh = zzi().zzh(null, zzgi.zzah);
            zzi();
            long jZzF = jCurrentTimeMillis - zzam.zzF();
            while (i < iZzh && zzaM(null, jZzF)) {
                i++;
            }
        } else {
            zzi();
            long jZzH = zzam.zzH();
            while (i < jZzH && zzaM(str, 0L)) {
                i++;
            }
        }
        if (zzi().zzx(null, zzgi.zzaz)) {
            zzaX().zzg();
            zzaJ();
        }
        if (zzi().zzx(null, zzgi.zzaQ) && this.f47694zzl.zzd(str, com.google.android.gms.internal.measurement.zzih.zzb(zzrVar.zzG))) {
            zzaW().zzj().zzb("[sgtm] Going background, trigger client side upload. appId", str);
            zzau(str, zzaU().currentTimeMillis());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0331  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzac(com.google.android.gms.measurement.internal.zzr r27) {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpv.zzac(com.google.android.gms.measurement.internal.zzr):void");
    }

    public final void zzad() {
        this.zzs++;
    }

    public final void zzae(zzai zzaiVar) {
        zzr zzrVarZzaD = zzaD((String) Preconditions.checkNotNull(zzaiVar.f46856zza));
        if (zzrVarZzaD != null) {
            zzaf(zzaiVar, zzrVarZzaD);
        }
    }

    public final void zzaf(zzai zzaiVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzaiVar);
        Preconditions.checkNotEmpty(zzaiVar.f46856zza);
        Preconditions.checkNotNull(zzaiVar.f46858zzc);
        Preconditions.checkNotEmpty(zzaiVar.f46858zzc.f47716zzb);
        zzaX().zzg();
        zzM();
        if (zzaQ(zzrVar)) {
            if (!zzrVar.f47743zzh) {
                zzg(zzrVar);
                return;
            }
            zzj().zzH();
            try {
                zzg(zzrVar);
                String str = (String) Preconditions.checkNotNull(zzaiVar.f46856zza);
                zzai zzaiVarZzm = zzj().zzm(str, zzaiVar.f46858zzc.f47716zzb);
                if (zzaiVarZzm != null) {
                    zzaW().zzd().zzc("Removing conditional user property", zzaiVar.f46856zza, this.zzn.zzj().zzf(zzaiVar.f46858zzc.f47716zzb));
                    zzj().zza(str, zzaiVar.f46858zzc.f47716zzb);
                    if (zzaiVarZzm.f46860zze) {
                        zzj().zzP(str, zzaiVar.f46858zzc.f47716zzb);
                    }
                    zzbh zzbhVar = zzaiVar.f46866zzk;
                    if (zzbhVar != null) {
                        zzbf zzbfVar = zzbhVar.f46952zzb;
                        zzax((zzbh) Preconditions.checkNotNull(zzB().zzC(str, ((zzbh) Preconditions.checkNotNull(zzbhVar)).f46951zza, zzbfVar != null ? zzbfVar.zzc() : null, zzaiVarZzm.f46857zzb, zzbhVar.f46954zzd, true, true)), zzrVar);
                    }
                } else {
                    zzaW().zzk().zzc("Conditional user property doesn't exist", zzhe.zzn(zzaiVar.f46856zza), this.zzn.zzj().zzf(zzaiVar.f46858zzc.f47716zzb));
                }
                zzj().zzS();
                zzj().zzL();
            } catch (Throwable th10) {
                zzj().zzL();
                throw th10;
            }
        }
    }

    public final void zzag(String str, zzr zzrVar) {
        zzaX().zzg();
        zzM();
        if (zzaQ(zzrVar)) {
            if (!zzrVar.f47743zzh) {
                zzg(zzrVar);
                return;
            }
            Boolean boolZzaS = zzaS(zzrVar);
            if ("_npa".equals(str) && boolZzaS != null) {
                zzaW().zzd().zza("Falling back to manifest metadata value for ad personalization");
                zzas(new zzqb("_npa", zzaU().currentTimeMillis(), Long.valueOf(true != boolZzaS.booleanValue() ? 0L : 1L), "auto"), zzrVar);
                return;
            }
            zzhc zzhcVarZzd = zzaW().zzd();
            zzio zzioVar = this.zzn;
            zzhcVarZzd.zzb("Removing user property", zzioVar.zzj().zzf(str));
            zzj().zzH();
            try {
                zzg(zzrVar);
                if ("_id".equals(str)) {
                    zzj().zzP((String) Preconditions.checkNotNull(zzrVar.f47736zza), "_lair");
                }
                zzj().zzP((String) Preconditions.checkNotNull(zzrVar.f47736zza), str);
                zzj().zzS();
                zzaW().zzd().zzb("User property removed", zzioVar.zzj().zzf(str));
                zzj().zzL();
            } catch (Throwable th10) {
                zzj().zzL();
                throw th10;
            }
        }
    }

    public final void zzah(zzr zzrVar) {
        if (this.zzz != null) {
            ArrayList arrayList = new ArrayList();
            this.zzA = arrayList;
            arrayList.addAll(this.zzz);
        }
        zzaw zzawVarZzj = zzj();
        String str = (String) Preconditions.checkNotNull(zzrVar.f47736zza);
        Preconditions.checkNotEmpty(str);
        zzawVarZzj.zzg();
        zzawVarZzj.zzav();
        try {
            SQLiteDatabase sQLiteDatabaseZzj = zzawVarZzj.zzj();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseZzj.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("events", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("queue", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseZzj.delete("upload_queue", "app_id=?", strArr);
            if (iDelete > 0) {
                zzawVarZzj.zzu.zzaW().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            zzawVarZzj.zzu.zzaW().zze().zzc("Error resetting analytics data. appId, error", zzhe.zzn(str), e);
        }
        if (zzrVar.f47743zzh) {
            zzac(zzrVar);
        }
    }

    public final void zzai(zzr zzrVar) {
        zzaX().zzg();
        zzM();
        String str = zzrVar.f47736zza;
        Preconditions.checkNotEmpty(str);
        zzba zzbaVarZze = zzba.zze(zzrVar.zzA);
        zzaW().zzj().zzc("Setting DMA consent for package", str, zzbaVarZze);
        zzaX().zzg();
        zzM();
        zzju zzjuVarZzf = zzba.zzc(zzd(str), 100).zzf();
        this.zzD.put(str, zzbaVarZze);
        zzj().zzU(str, zzbaVarZze);
        zzju zzjuVarZzf2 = zzba.zzc(zzd(str), 100).zzf();
        zzaX().zzg();
        zzM();
        zzju zzjuVar = zzju.DENIED;
        boolean z = zzjuVarZzf == zzjuVar && zzjuVarZzf2 == zzju.GRANTED;
        boolean z3 = zzjuVarZzf == zzju.GRANTED && zzjuVarZzf2 == zzjuVar;
        if (z || z3) {
            zzaW().zzj().zzb("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (zzj().zzo(zza(), str, false, false, false, false, false, false, false).f46893zzf < zzi().zzh(str, zzgi.zzal)) {
                bundle.putLong("_r", 1L);
                zzaW().zzj().zzc("_dcu realtime event count", str, Long.valueOf(zzj().zzo(zza(), str, false, false, false, false, false, true, false).f46893zzf));
            }
            this.zzK.zza(str, "_dcu", bundle);
        }
    }

    public final void zzaj(String str, zzmh zzmhVar) {
        zzaX().zzg();
        String str2 = this.zzH;
        if (str2 == null || str2.equals(str) || zzmhVar != null) {
            this.zzH = str;
            this.zzG = zzmhVar;
        }
    }

    public final void zzak(zzr zzrVar) {
        zzaX().zzg();
        zzM();
        String str = zzrVar.f47736zza;
        Preconditions.checkNotEmpty(str);
        zzjx zzjxVarZzk = zzjx.zzk(zzrVar.zzu, zzrVar.zzz);
        zzu(str);
        zzaW().zzj().zzc("Setting storage consent for package", str, zzjxVarZzk);
        zzaq(str, zzjxVarZzk);
    }

    public final void zzal(List list) {
        Preconditions.checkArgument(!list.isEmpty());
        if (this.zzz != null) {
            zzaW().zze().zza("Set uploading progress before finishing the previous upload");
        } else {
            this.zzz = new ArrayList(list);
        }
    }

    public final void zzam() {
        zzaX().zzg();
        zzj().zzO();
        zzaw zzawVarZzj = zzj();
        zzawVarZzj.zzg();
        zzawVarZzj.zzav();
        if (zzawVarZzj.zzae()) {
            zzgg zzggVar = zzgi.zzau;
            if (((Long) zzggVar.zza(null)).longValue() != 0) {
                SQLiteDatabase sQLiteDatabaseZzj = zzawVarZzj.zzj();
                zzio zzioVar = zzawVarZzj.zzu;
                int iDelete = sQLiteDatabaseZzj.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(zzioVar.zzaU().currentTimeMillis()), String.valueOf(zzggVar.zza(null))});
                if (iDelete > 0) {
                    zzioVar.zzaW().zzj().zzb("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        if (this.f47693zzk.f47585zzd.zza() == 0) {
            this.f47693zzk.f47585zzd.zzb(zzaU().currentTimeMillis());
        }
        zzaL();
    }

    public final void zzan(zzai zzaiVar) {
        zzr zzrVarZzaD = zzaD((String) Preconditions.checkNotNull(zzaiVar.f46856zza));
        if (zzrVarZzaD != null) {
            zzao(zzaiVar, zzrVarZzaD);
        }
    }

    public final void zzao(zzai zzaiVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzaiVar);
        Preconditions.checkNotEmpty(zzaiVar.f46856zza);
        Preconditions.checkNotNull(zzaiVar.f46857zzb);
        Preconditions.checkNotNull(zzaiVar.f46858zzc);
        Preconditions.checkNotEmpty(zzaiVar.f46858zzc.f47716zzb);
        zzaX().zzg();
        zzM();
        if (zzaQ(zzrVar)) {
            if (!zzrVar.f47743zzh) {
                zzg(zzrVar);
                return;
            }
            zzai zzaiVar2 = new zzai(zzaiVar);
            boolean z = false;
            zzaiVar2.f46860zze = false;
            zzj().zzH();
            try {
                zzai zzaiVarZzm = zzj().zzm((String) Preconditions.checkNotNull(zzaiVar2.f46856zza), zzaiVar2.f46858zzc.f47716zzb);
                if (zzaiVarZzm != null && !zzaiVarZzm.f46857zzb.equals(zzaiVar2.f46857zzb)) {
                    zzaW().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzaiVar2.f46858zzc.f47716zzb), zzaiVar2.f46857zzb, zzaiVarZzm.f46857zzb);
                }
                if (zzaiVarZzm != null && zzaiVarZzm.f46860zze) {
                    zzaiVar2.f46857zzb = zzaiVarZzm.f46857zzb;
                    zzaiVar2.f46859zzd = zzaiVarZzm.f46859zzd;
                    zzaiVar2.f46863zzh = zzaiVarZzm.f46863zzh;
                    zzaiVar2.f46861zzf = zzaiVarZzm.f46861zzf;
                    zzaiVar2.f46864zzi = zzaiVarZzm.f46864zzi;
                    zzaiVar2.f46860zze = true;
                    zzqb zzqbVar = zzaiVar2.f46858zzc;
                    zzaiVar2.f46858zzc = new zzqb(zzqbVar.f47716zzb, zzaiVarZzm.f46858zzc.f47717zzc, zzqbVar.zza(), zzaiVarZzm.f46858zzc.f47720zzf);
                } else if (TextUtils.isEmpty(zzaiVar2.f46861zzf)) {
                    zzqb zzqbVar2 = zzaiVar2.f46858zzc;
                    zzaiVar2.f46858zzc = new zzqb(zzqbVar2.f47716zzb, zzaiVar2.f46859zzd, zzqbVar2.zza(), zzaiVar2.f46858zzc.f47720zzf);
                    zzaiVar2.f46860zze = true;
                    z = true;
                }
                if (zzaiVar2.f46860zze) {
                    zzqb zzqbVar3 = zzaiVar2.f46858zzc;
                    zzqd zzqdVar = new zzqd((String) Preconditions.checkNotNull(zzaiVar2.f46856zza), zzaiVar2.f46857zzb, zzqbVar3.f47716zzb, zzqbVar3.f47717zzc, Preconditions.checkNotNull(zzqbVar3.zza()));
                    if (zzj().zzai(zzqdVar)) {
                        zzaW().zzd().zzd("User property updated immediately", zzaiVar2.f46856zza, this.zzn.zzj().zzf(zzqdVar.f47724zzc), zzqdVar.f47726zze);
                    } else {
                        zzaW().zze().zzd("(2)Too many active user properties, ignoring", zzhe.zzn(zzaiVar2.f46856zza), this.zzn.zzj().zzf(zzqdVar.f47724zzc), zzqdVar.f47726zze);
                    }
                    if (z && zzaiVar2.f46864zzi != null) {
                        zzax(new zzbh(zzaiVar2.f46864zzi, zzaiVar2.f46859zzd), zzrVar);
                    }
                }
                if (zzj().zzah(zzaiVar2)) {
                    zzaW().zzd().zzd("Conditional property added", zzaiVar2.f46856zza, this.zzn.zzj().zzf(zzaiVar2.f46858zzc.f47716zzb), zzaiVar2.f46858zzc.zza());
                } else {
                    zzaW().zze().zzd("Too many conditional properties, ignoring", zzhe.zzn(zzaiVar2.f46856zza), this.zzn.zzj().zzf(zzaiVar2.f46858zzc.f47716zzb), zzaiVar2.f46858zzc.zza());
                }
                zzj().zzS();
                zzj().zzL();
            } catch (Throwable th10) {
                zzj().zzL();
                throw th10;
            }
        }
    }

    public final void zzap(String str, zzag zzagVar) {
        zzam zzamVarZzi = zzi();
        zzgg zzggVar = zzgi.zzaP;
        if (zzamVarZzi.zzx(null, zzggVar)) {
            zzaX().zzg();
            zzM();
            zzaw zzawVarZzj = zzj();
            long j2 = zzagVar.f46853zza;
            zzpz zzpzVarZzx = zzawVarZzj.zzx(j2);
            if (zzpzVarZzx == null) {
                zzaW().zzk().zzc("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j2));
                return;
            }
            String strZzh = zzpzVarZzx.zzh();
            if (zzagVar.f46854zzb != zzme.SUCCESS.zza()) {
                if (zzagVar.f46854zzb == zzme.BACKOFF.zza()) {
                    Map map = this.zzF;
                    zzpt zzptVar = (zzpt) map.get(strZzh);
                    if (zzptVar == null) {
                        zzptVar = new zzpt(this);
                        map.put(strZzh, zzptVar);
                    } else {
                        zzptVar.zzb();
                    }
                    zzaW().zzj().zzd("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, strZzh, Long.valueOf((zzptVar.f47682zzc - zzaU().currentTimeMillis()) / 1000));
                }
                zzaw zzawVarZzj2 = zzj();
                Long lValueOf = Long.valueOf(zzagVar.f46853zza);
                zzawVarZzj2.zzN(lValueOf);
                zzaW().zzj().zzc("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, lValueOf);
                return;
            }
            Map map2 = this.zzF;
            if (map2.containsKey(strZzh)) {
                map2.remove(strZzh);
            }
            zzaw zzawVarZzj3 = zzj();
            Long lValueOf2 = Long.valueOf(j2);
            zzawVarZzj3.zzK(lValueOf2);
            zzaW().zzj().zzc("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, lValueOf2);
            long j3 = zzagVar.f46855zzc;
            if (j3 > 0) {
                zzaw zzawVarZzj4 = zzj();
                zzio zzioVar = zzawVarZzj4.zzu;
                if (zzioVar.zzf().zzx(null, zzggVar)) {
                    zzawVarZzj4.zzg();
                    zzawVarZzj4.zzav();
                    Long lValueOf3 = Long.valueOf(j3);
                    Preconditions.checkNotNull(lValueOf3);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("upload_type", Integer.valueOf(zzmf.GOOGLE_SIGNAL.zza()));
                    contentValues.put("creation_timestamp", Long.valueOf(zzioVar.zzaU().currentTimeMillis()));
                    try {
                        if (zzawVarZzj4.zzj().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j3), str, String.valueOf(zzmf.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                            zzioVar.zzaW().zzk().zzc("Google Signal pending batch not updated. appId, rowId", str, lValueOf3);
                        }
                    } catch (SQLiteException e) {
                        zzawVarZzj4.zzu.zzaW().zze().zzd("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j3), e);
                        throw e;
                    }
                }
                zzaW().zzj().zzc("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(zzagVar.f46855zzc));
                zzav(str);
            }
        }
    }

    public final void zzaq(String str, zzjx zzjxVar) {
        zzaX().zzg();
        zzM();
        this.zzC.put(str, zzjxVar);
        zzj().zzX(str, zzjxVar);
    }

    public final void zzar(String str, boolean z, Long l2, Long l3) {
        zzh zzhVarZzl = zzj().zzl(str);
        if (zzhVarZzl != null) {
            zzhVarZzl.zzaF(z);
            zzhVarZzl.zzaG(l2);
            zzhVarZzl.zzaH(l3);
            if (zzhVarZzl.zzaK()) {
                zzj().zzT(zzhVarZzl, false, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzas(com.google.android.gms.measurement.internal.zzqb r22, com.google.android.gms.measurement.internal.zzr r23) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpv.zzas(com.google.android.gms.measurement.internal.zzqb, com.google.android.gms.measurement.internal.zzr):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.zzpv] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    public final void zzat() {
        zzaw zzawVarZzj;
        long jZzF;
        SQLiteException e;
        zzh zzhVarZzl;
        zzaX().zzg();
        zzM();
        this.zzw = true;
        try {
            zzio zzioVar = this.zzn;
            zzioVar.zzaV();
            Boolean boolZzl = zzioVar.zzu().zzl();
            if (boolZzl == null) {
                zzaW().zzk().zza("Upload data called on the client side before use of service was decided");
            } else if (boolZzl.booleanValue()) {
                zzaW().zze().zza("Upload called in the client side when service should be used");
            } else if (this.f47684zza > 0) {
                zzaL();
            } else {
                zzaX().zzg();
                if (this.zzz != null) {
                    zzaW().zzj().zza("Uploading requested multiple times");
                } else if (zzp().zzd()) {
                    ?? CurrentTimeMillis = zzaU().currentTimeMillis();
                    ?? r72 = 0;
                    cursorRawQuery = null;
                    Cursor cursorRawQuery = null;
                    string = null;
                    string = null;
                    String string = null;
                    int iZzh = zzi().zzh(null, zzgi.zzah);
                    zzi();
                    long jZzF2 = CurrentTimeMillis - zzam.zzF();
                    for (int i = 0; i < iZzh && zzaM(null, jZzF2); i++) {
                    }
                    zzqr.zzb();
                    zzaX().zzg();
                    zzaJ();
                    long jZza = this.f47693zzk.f47585zzd.zza();
                    if (jZza != 0) {
                        zzaW().zzd().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(CurrentTimeMillis - jZza)));
                    }
                    String strZzA = zzj().zzA();
                    long j2 = -1;
                    if (TextUtils.isEmpty(strZzA)) {
                        try {
                            this.zzB = -1L;
                            zzawVarZzj = zzj();
                            zzi();
                            jZzF = CurrentTimeMillis - zzam.zzF();
                            zzawVarZzj.zzg();
                            zzawVarZzj.zzav();
                        } catch (Throwable th10) {
                            th = th10;
                            r72 = CurrentTimeMillis;
                        }
                        try {
                            CurrentTimeMillis = zzawVarZzj.zzj().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jZzF)});
                            try {
                                if (CurrentTimeMillis.moveToFirst()) {
                                    string = CurrentTimeMillis.getString(0);
                                } else {
                                    zzawVarZzj.zzu.zzaW().zzj().zza("No expired configs for apps with pending events");
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                CurrentTimeMillis = CurrentTimeMillis;
                                zzawVarZzj.zzu.zzaW().zze().zzb("Error selecting expired configs", e);
                                if (CurrentTimeMillis != 0) {
                                }
                                if (!TextUtils.isEmpty(string)) {
                                    zzO(zzhVarZzl);
                                }
                                this.zzw = false;
                                zzaH();
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            CurrentTimeMillis = 0;
                        } catch (Throwable th11) {
                            th = th11;
                            if (r72 == 0) {
                                throw th;
                            }
                            throw th;
                        }
                        CurrentTimeMillis.close();
                        if (!TextUtils.isEmpty(string) && (zzhVarZzl = zzj().zzl(string)) != null) {
                            zzO(zzhVarZzl);
                        }
                    } else {
                        if (this.zzB == -1) {
                            zzaw zzawVarZzj2 = zzj();
                            try {
                                try {
                                    cursorRawQuery = zzawVarZzj2.zzj().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        j2 = cursorRawQuery.getLong(0);
                                    }
                                } catch (SQLiteException e5) {
                                    zzawVarZzj2.zzu.zzaW().zze().zzb("Error querying raw events", e5);
                                    if (cursorRawQuery != null) {
                                    }
                                    this.zzB = j2;
                                    zzau(strZzA, CurrentTimeMillis);
                                    this.zzw = false;
                                    zzaH();
                                }
                                cursorRawQuery.close();
                                this.zzB = j2;
                            } finally {
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                            }
                        }
                        zzau(strZzA, CurrentTimeMillis);
                    }
                } else {
                    zzaW().zzj().zza("Network not connected, ignoring upload request");
                    zzaL();
                }
            }
            this.zzw = false;
            zzaH();
        } catch (Throwable th12) {
            this.zzw = false;
            zzaH();
            throw th12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        r21 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:328:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzau(java.lang.String r30, long r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpv.zzau(java.lang.String, long):void");
    }

    public final void zzav(String str) {
        com.google.android.gms.internal.measurement.zzhv zzhvVarZzg;
        zzaX().zzg();
        zzM();
        this.zzw = true;
        try {
            zzio zzioVar = this.zzn;
            zzioVar.zzaV();
            Boolean boolZzl = zzioVar.zzu().zzl();
            if (boolZzl == null) {
                zzaW().zzk().zza("Upload data called on the client side before use of service was decided");
            } else if (boolZzl.booleanValue()) {
                zzaW().zze().zza("Upload called in the client side when service should be used");
            } else if (this.f47684zza > 0) {
                zzaL();
            } else if (!zzp().zzd()) {
                zzaW().zzj().zza("Network not connected, ignoring upload request");
                zzaL();
            } else if (zzj().zzY(str)) {
                zzpz zzpzVarZzw = zzj().zzw(str);
                if (zzpzVarZzw != null && (zzhvVarZzg = zzpzVarZzw.zzg()) != null) {
                    zzaW().zzj().zzd("[sgtm] Uploading data from upload queue. appId, type, url", str, zzpzVarZzw.zzd(), zzpzVarZzw.zzh());
                    byte[] bArrZzcd = zzhvVarZzg.zzcd();
                    if (Log.isLoggable(zzaW().zzr(), 2)) {
                        zzaW().zzj().zzd("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrZzcd.length), zzA().zzq(zzhvVarZzg));
                    }
                    this.zzv = true;
                    zzp().zzc(str, zzpzVarZzw.zzf(), zzhvVarZzg, new zzpm(this, str, zzpzVarZzw));
                }
            } else {
                zzaW().zzj().zzb("[sgtm] Upload queue has no batches for appId", str);
            }
            this.zzw = false;
            zzaH();
        } catch (Throwable th10) {
            this.zzw = false;
            zzaH();
            throw th10;
        }
    }

    public final void zzaw(String str, com.google.android.gms.internal.measurement.zzhp zzhpVar, Bundle bundle, String str2) {
        List listListOf = CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"});
        long jZzd = (zzqf.zzap(zzhpVar.zzl()) || zzqf.zzap(str)) ? zzi().zzd(str2, true) : zzi().zzc(str2, true);
        long jCodePointCount = zzhpVar.zzm().codePointCount(0, zzhpVar.zzm().length());
        zzqf zzqfVarZzB = zzB();
        String strZzl = zzhpVar.zzl();
        zzi();
        String strZzG = zzqfVarZzB.zzG(strZzl, 40, true);
        if (jCodePointCount <= jZzd || listListOf.contains(zzhpVar.zzl())) {
            return;
        }
        if ("_ev".equals(zzhpVar.zzl())) {
            bundle.putString("_ev", zzB().zzG(zzhpVar.zzm(), zzi().zzd(str2, true), true));
            return;
        }
        zzaW().zzl().zzc("Param value is too long; discarded. Name, value length", strZzG, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strZzG);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(zzhpVar.zzl());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0373 A[Catch: all -> 0x0176, TryCatch #6 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:90:0x02f3, B:100:0x032b, B:102:0x0373, B:104:0x0378, B:105:0x038f, B:107:0x039a, B:109:0x03b2, B:111:0x03b7, B:112:0x03ce, B:115:0x03ec, B:119:0x040d, B:120:0x0424, B:121:0x042d, B:124:0x044a, B:125:0x045e, B:127:0x0466, B:129:0x0472, B:131:0x0478, B:132:0x047f, B:134:0x048b, B:136:0x0493, B:138:0x049b, B:140:0x04a1, B:142:0x04a5, B:143:0x04b1, B:144:0x04be, B:146:0x04e3, B:155:0x0507, B:156:0x051c, B:158:0x0542, B:161:0x0559, B:165:0x0596, B:167:0x05bf, B:169:0x05f6, B:170:0x05f9, B:172:0x0601, B:173:0x0604, B:175:0x060c, B:176:0x060f, B:178:0x0617, B:179:0x061a, B:181:0x0623, B:182:0x0627, B:184:0x0634, B:185:0x0637, B:187:0x065e, B:189:0x0666, B:190:0x0669, B:192:0x0678, B:194:0x0682, B:198:0x0697, B:203:0x06a3, B:206:0x06ac, B:210:0x06b9, B:214:0x06c7, B:218:0x06d5, B:222:0x06e3, B:226:0x06f1, B:230:0x06fc, B:234:0x0709, B:235:0x0715, B:237:0x071b, B:238:0x071e, B:240:0x0744, B:243:0x074d, B:246:0x0756, B:247:0x076f, B:249:0x0775, B:251:0x0789, B:253:0x0795, B:255:0x07a2, B:258:0x07bb, B:259:0x07cb, B:263:0x07d4, B:264:0x07d7, B:266:0x07e3, B:267:0x07e8, B:269:0x0806, B:271:0x080a, B:273:0x081a, B:275:0x0825, B:276:0x082e, B:278:0x0838, B:280:0x0844, B:282:0x084e, B:284:0x0854, B:286:0x0863, B:288:0x087d, B:290:0x0883, B:291:0x088c, B:293:0x089a, B:295:0x08d6, B:297:0x08df, B:298:0x08e2, B:300:0x08ec, B:302:0x0908, B:303:0x0913, B:305:0x094b, B:307:0x0953, B:309:0x095d, B:310:0x096a, B:312:0x0974, B:313:0x0981, B:314:0x098a, B:316:0x0990, B:318:0x09cc, B:320:0x09d6, B:322:0x09e8, B:324:0x09ee, B:325:0x0a33, B:326:0x0a3d, B:327:0x0a4a, B:329:0x0a50, B:338:0x0a9d, B:339:0x0ae8, B:341:0x0af6, B:355:0x0b57, B:346:0x0b0e, B:347:0x0b11, B:332:0x0a5d, B:334:0x0a89, B:352:0x0b2a, B:353:0x0b41, B:354:0x0b42, B:241:0x0747, B:166:0x05b1, B:152:0x04ee, B:93:0x030a, B:94:0x0311, B:96:0x0317, B:98:0x0323, B:54:0x0194, B:56:0x019e, B:58:0x01b3, B:64:0x01cf, B:69:0x0203, B:71:0x0209, B:73:0x0217, B:75:0x0227, B:78:0x0234, B:86:0x02b6, B:88:0x02c0, B:80:0x025b, B:81:0x0274, B:85:0x029c, B:84:0x0288, B:67:0x01db, B:68:0x01f9), top: B:372:0x0155, inners: #0, #1, #2, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x042d A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #6 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:90:0x02f3, B:100:0x032b, B:102:0x0373, B:104:0x0378, B:105:0x038f, B:107:0x039a, B:109:0x03b2, B:111:0x03b7, B:112:0x03ce, B:115:0x03ec, B:119:0x040d, B:120:0x0424, B:121:0x042d, B:124:0x044a, B:125:0x045e, B:127:0x0466, B:129:0x0472, B:131:0x0478, B:132:0x047f, B:134:0x048b, B:136:0x0493, B:138:0x049b, B:140:0x04a1, B:142:0x04a5, B:143:0x04b1, B:144:0x04be, B:146:0x04e3, B:155:0x0507, B:156:0x051c, B:158:0x0542, B:161:0x0559, B:165:0x0596, B:167:0x05bf, B:169:0x05f6, B:170:0x05f9, B:172:0x0601, B:173:0x0604, B:175:0x060c, B:176:0x060f, B:178:0x0617, B:179:0x061a, B:181:0x0623, B:182:0x0627, B:184:0x0634, B:185:0x0637, B:187:0x065e, B:189:0x0666, B:190:0x0669, B:192:0x0678, B:194:0x0682, B:198:0x0697, B:203:0x06a3, B:206:0x06ac, B:210:0x06b9, B:214:0x06c7, B:218:0x06d5, B:222:0x06e3, B:226:0x06f1, B:230:0x06fc, B:234:0x0709, B:235:0x0715, B:237:0x071b, B:238:0x071e, B:240:0x0744, B:243:0x074d, B:246:0x0756, B:247:0x076f, B:249:0x0775, B:251:0x0789, B:253:0x0795, B:255:0x07a2, B:258:0x07bb, B:259:0x07cb, B:263:0x07d4, B:264:0x07d7, B:266:0x07e3, B:267:0x07e8, B:269:0x0806, B:271:0x080a, B:273:0x081a, B:275:0x0825, B:276:0x082e, B:278:0x0838, B:280:0x0844, B:282:0x084e, B:284:0x0854, B:286:0x0863, B:288:0x087d, B:290:0x0883, B:291:0x088c, B:293:0x089a, B:295:0x08d6, B:297:0x08df, B:298:0x08e2, B:300:0x08ec, B:302:0x0908, B:303:0x0913, B:305:0x094b, B:307:0x0953, B:309:0x095d, B:310:0x096a, B:312:0x0974, B:313:0x0981, B:314:0x098a, B:316:0x0990, B:318:0x09cc, B:320:0x09d6, B:322:0x09e8, B:324:0x09ee, B:325:0x0a33, B:326:0x0a3d, B:327:0x0a4a, B:329:0x0a50, B:338:0x0a9d, B:339:0x0ae8, B:341:0x0af6, B:355:0x0b57, B:346:0x0b0e, B:347:0x0b11, B:332:0x0a5d, B:334:0x0a89, B:352:0x0b2a, B:353:0x0b41, B:354:0x0b42, B:241:0x0747, B:166:0x05b1, B:152:0x04ee, B:93:0x030a, B:94:0x0311, B:96:0x0317, B:98:0x0323, B:54:0x0194, B:56:0x019e, B:58:0x01b3, B:64:0x01cf, B:69:0x0203, B:71:0x0209, B:73:0x0217, B:75:0x0227, B:78:0x0234, B:86:0x02b6, B:88:0x02c0, B:80:0x025b, B:81:0x0274, B:85:0x029c, B:84:0x0288, B:67:0x01db, B:68:0x01f9), top: B:372:0x0155, inners: #0, #1, #2, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019e A[Catch: all -> 0x0176, TryCatch #6 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:90:0x02f3, B:100:0x032b, B:102:0x0373, B:104:0x0378, B:105:0x038f, B:107:0x039a, B:109:0x03b2, B:111:0x03b7, B:112:0x03ce, B:115:0x03ec, B:119:0x040d, B:120:0x0424, B:121:0x042d, B:124:0x044a, B:125:0x045e, B:127:0x0466, B:129:0x0472, B:131:0x0478, B:132:0x047f, B:134:0x048b, B:136:0x0493, B:138:0x049b, B:140:0x04a1, B:142:0x04a5, B:143:0x04b1, B:144:0x04be, B:146:0x04e3, B:155:0x0507, B:156:0x051c, B:158:0x0542, B:161:0x0559, B:165:0x0596, B:167:0x05bf, B:169:0x05f6, B:170:0x05f9, B:172:0x0601, B:173:0x0604, B:175:0x060c, B:176:0x060f, B:178:0x0617, B:179:0x061a, B:181:0x0623, B:182:0x0627, B:184:0x0634, B:185:0x0637, B:187:0x065e, B:189:0x0666, B:190:0x0669, B:192:0x0678, B:194:0x0682, B:198:0x0697, B:203:0x06a3, B:206:0x06ac, B:210:0x06b9, B:214:0x06c7, B:218:0x06d5, B:222:0x06e3, B:226:0x06f1, B:230:0x06fc, B:234:0x0709, B:235:0x0715, B:237:0x071b, B:238:0x071e, B:240:0x0744, B:243:0x074d, B:246:0x0756, B:247:0x076f, B:249:0x0775, B:251:0x0789, B:253:0x0795, B:255:0x07a2, B:258:0x07bb, B:259:0x07cb, B:263:0x07d4, B:264:0x07d7, B:266:0x07e3, B:267:0x07e8, B:269:0x0806, B:271:0x080a, B:273:0x081a, B:275:0x0825, B:276:0x082e, B:278:0x0838, B:280:0x0844, B:282:0x084e, B:284:0x0854, B:286:0x0863, B:288:0x087d, B:290:0x0883, B:291:0x088c, B:293:0x089a, B:295:0x08d6, B:297:0x08df, B:298:0x08e2, B:300:0x08ec, B:302:0x0908, B:303:0x0913, B:305:0x094b, B:307:0x0953, B:309:0x095d, B:310:0x096a, B:312:0x0974, B:313:0x0981, B:314:0x098a, B:316:0x0990, B:318:0x09cc, B:320:0x09d6, B:322:0x09e8, B:324:0x09ee, B:325:0x0a33, B:326:0x0a3d, B:327:0x0a4a, B:329:0x0a50, B:338:0x0a9d, B:339:0x0ae8, B:341:0x0af6, B:355:0x0b57, B:346:0x0b0e, B:347:0x0b11, B:332:0x0a5d, B:334:0x0a89, B:352:0x0b2a, B:353:0x0b41, B:354:0x0b42, B:241:0x0747, B:166:0x05b1, B:152:0x04ee, B:93:0x030a, B:94:0x0311, B:96:0x0317, B:98:0x0323, B:54:0x0194, B:56:0x019e, B:58:0x01b3, B:64:0x01cf, B:69:0x0203, B:71:0x0209, B:73:0x0217, B:75:0x0227, B:78:0x0234, B:86:0x02b6, B:88:0x02c0, B:80:0x025b, B:81:0x0274, B:85:0x029c, B:84:0x0288, B:67:0x01db, B:68:0x01f9), top: B:372:0x0155, inners: #0, #1, #2, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f9 A[Catch: all -> 0x0176, TryCatch #6 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:90:0x02f3, B:100:0x032b, B:102:0x0373, B:104:0x0378, B:105:0x038f, B:107:0x039a, B:109:0x03b2, B:111:0x03b7, B:112:0x03ce, B:115:0x03ec, B:119:0x040d, B:120:0x0424, B:121:0x042d, B:124:0x044a, B:125:0x045e, B:127:0x0466, B:129:0x0472, B:131:0x0478, B:132:0x047f, B:134:0x048b, B:136:0x0493, B:138:0x049b, B:140:0x04a1, B:142:0x04a5, B:143:0x04b1, B:144:0x04be, B:146:0x04e3, B:155:0x0507, B:156:0x051c, B:158:0x0542, B:161:0x0559, B:165:0x0596, B:167:0x05bf, B:169:0x05f6, B:170:0x05f9, B:172:0x0601, B:173:0x0604, B:175:0x060c, B:176:0x060f, B:178:0x0617, B:179:0x061a, B:181:0x0623, B:182:0x0627, B:184:0x0634, B:185:0x0637, B:187:0x065e, B:189:0x0666, B:190:0x0669, B:192:0x0678, B:194:0x0682, B:198:0x0697, B:203:0x06a3, B:206:0x06ac, B:210:0x06b9, B:214:0x06c7, B:218:0x06d5, B:222:0x06e3, B:226:0x06f1, B:230:0x06fc, B:234:0x0709, B:235:0x0715, B:237:0x071b, B:238:0x071e, B:240:0x0744, B:243:0x074d, B:246:0x0756, B:247:0x076f, B:249:0x0775, B:251:0x0789, B:253:0x0795, B:255:0x07a2, B:258:0x07bb, B:259:0x07cb, B:263:0x07d4, B:264:0x07d7, B:266:0x07e3, B:267:0x07e8, B:269:0x0806, B:271:0x080a, B:273:0x081a, B:275:0x0825, B:276:0x082e, B:278:0x0838, B:280:0x0844, B:282:0x084e, B:284:0x0854, B:286:0x0863, B:288:0x087d, B:290:0x0883, B:291:0x088c, B:293:0x089a, B:295:0x08d6, B:297:0x08df, B:298:0x08e2, B:300:0x08ec, B:302:0x0908, B:303:0x0913, B:305:0x094b, B:307:0x0953, B:309:0x095d, B:310:0x096a, B:312:0x0974, B:313:0x0981, B:314:0x098a, B:316:0x0990, B:318:0x09cc, B:320:0x09d6, B:322:0x09e8, B:324:0x09ee, B:325:0x0a33, B:326:0x0a3d, B:327:0x0a4a, B:329:0x0a50, B:338:0x0a9d, B:339:0x0ae8, B:341:0x0af6, B:355:0x0b57, B:346:0x0b0e, B:347:0x0b11, B:332:0x0a5d, B:334:0x0a89, B:352:0x0b2a, B:353:0x0b41, B:354:0x0b42, B:241:0x0747, B:166:0x05b1, B:152:0x04ee, B:93:0x030a, B:94:0x0311, B:96:0x0317, B:98:0x0323, B:54:0x0194, B:56:0x019e, B:58:0x01b3, B:64:0x01cf, B:69:0x0203, B:71:0x0209, B:73:0x0217, B:75:0x0227, B:78:0x0234, B:86:0x02b6, B:88:0x02c0, B:80:0x025b, B:81:0x0274, B:85:0x029c, B:84:0x0288, B:67:0x01db, B:68:0x01f9), top: B:372:0x0155, inners: #0, #1, #2, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0209 A[Catch: all -> 0x0176, TryCatch #6 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:90:0x02f3, B:100:0x032b, B:102:0x0373, B:104:0x0378, B:105:0x038f, B:107:0x039a, B:109:0x03b2, B:111:0x03b7, B:112:0x03ce, B:115:0x03ec, B:119:0x040d, B:120:0x0424, B:121:0x042d, B:124:0x044a, B:125:0x045e, B:127:0x0466, B:129:0x0472, B:131:0x0478, B:132:0x047f, B:134:0x048b, B:136:0x0493, B:138:0x049b, B:140:0x04a1, B:142:0x04a5, B:143:0x04b1, B:144:0x04be, B:146:0x04e3, B:155:0x0507, B:156:0x051c, B:158:0x0542, B:161:0x0559, B:165:0x0596, B:167:0x05bf, B:169:0x05f6, B:170:0x05f9, B:172:0x0601, B:173:0x0604, B:175:0x060c, B:176:0x060f, B:178:0x0617, B:179:0x061a, B:181:0x0623, B:182:0x0627, B:184:0x0634, B:185:0x0637, B:187:0x065e, B:189:0x0666, B:190:0x0669, B:192:0x0678, B:194:0x0682, B:198:0x0697, B:203:0x06a3, B:206:0x06ac, B:210:0x06b9, B:214:0x06c7, B:218:0x06d5, B:222:0x06e3, B:226:0x06f1, B:230:0x06fc, B:234:0x0709, B:235:0x0715, B:237:0x071b, B:238:0x071e, B:240:0x0744, B:243:0x074d, B:246:0x0756, B:247:0x076f, B:249:0x0775, B:251:0x0789, B:253:0x0795, B:255:0x07a2, B:258:0x07bb, B:259:0x07cb, B:263:0x07d4, B:264:0x07d7, B:266:0x07e3, B:267:0x07e8, B:269:0x0806, B:271:0x080a, B:273:0x081a, B:275:0x0825, B:276:0x082e, B:278:0x0838, B:280:0x0844, B:282:0x084e, B:284:0x0854, B:286:0x0863, B:288:0x087d, B:290:0x0883, B:291:0x088c, B:293:0x089a, B:295:0x08d6, B:297:0x08df, B:298:0x08e2, B:300:0x08ec, B:302:0x0908, B:303:0x0913, B:305:0x094b, B:307:0x0953, B:309:0x095d, B:310:0x096a, B:312:0x0974, B:313:0x0981, B:314:0x098a, B:316:0x0990, B:318:0x09cc, B:320:0x09d6, B:322:0x09e8, B:324:0x09ee, B:325:0x0a33, B:326:0x0a3d, B:327:0x0a4a, B:329:0x0a50, B:338:0x0a9d, B:339:0x0ae8, B:341:0x0af6, B:355:0x0b57, B:346:0x0b0e, B:347:0x0b11, B:332:0x0a5d, B:334:0x0a89, B:352:0x0b2a, B:353:0x0b41, B:354:0x0b42, B:241:0x0747, B:166:0x05b1, B:152:0x04ee, B:93:0x030a, B:94:0x0311, B:96:0x0317, B:98:0x0323, B:54:0x0194, B:56:0x019e, B:58:0x01b3, B:64:0x01cf, B:69:0x0203, B:71:0x0209, B:73:0x0217, B:75:0x0227, B:78:0x0234, B:86:0x02b6, B:88:0x02c0, B:80:0x025b, B:81:0x0274, B:85:0x029c, B:84:0x0288, B:67:0x01db, B:68:0x01f9), top: B:372:0x0155, inners: #0, #1, #2, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x030a A[Catch: all -> 0x0176, TryCatch #6 {all -> 0x0176, blocks: (B:36:0x0155, B:39:0x0164, B:41:0x016c, B:47:0x0179, B:90:0x02f3, B:100:0x032b, B:102:0x0373, B:104:0x0378, B:105:0x038f, B:107:0x039a, B:109:0x03b2, B:111:0x03b7, B:112:0x03ce, B:115:0x03ec, B:119:0x040d, B:120:0x0424, B:121:0x042d, B:124:0x044a, B:125:0x045e, B:127:0x0466, B:129:0x0472, B:131:0x0478, B:132:0x047f, B:134:0x048b, B:136:0x0493, B:138:0x049b, B:140:0x04a1, B:142:0x04a5, B:143:0x04b1, B:144:0x04be, B:146:0x04e3, B:155:0x0507, B:156:0x051c, B:158:0x0542, B:161:0x0559, B:165:0x0596, B:167:0x05bf, B:169:0x05f6, B:170:0x05f9, B:172:0x0601, B:173:0x0604, B:175:0x060c, B:176:0x060f, B:178:0x0617, B:179:0x061a, B:181:0x0623, B:182:0x0627, B:184:0x0634, B:185:0x0637, B:187:0x065e, B:189:0x0666, B:190:0x0669, B:192:0x0678, B:194:0x0682, B:198:0x0697, B:203:0x06a3, B:206:0x06ac, B:210:0x06b9, B:214:0x06c7, B:218:0x06d5, B:222:0x06e3, B:226:0x06f1, B:230:0x06fc, B:234:0x0709, B:235:0x0715, B:237:0x071b, B:238:0x071e, B:240:0x0744, B:243:0x074d, B:246:0x0756, B:247:0x076f, B:249:0x0775, B:251:0x0789, B:253:0x0795, B:255:0x07a2, B:258:0x07bb, B:259:0x07cb, B:263:0x07d4, B:264:0x07d7, B:266:0x07e3, B:267:0x07e8, B:269:0x0806, B:271:0x080a, B:273:0x081a, B:275:0x0825, B:276:0x082e, B:278:0x0838, B:280:0x0844, B:282:0x084e, B:284:0x0854, B:286:0x0863, B:288:0x087d, B:290:0x0883, B:291:0x088c, B:293:0x089a, B:295:0x08d6, B:297:0x08df, B:298:0x08e2, B:300:0x08ec, B:302:0x0908, B:303:0x0913, B:305:0x094b, B:307:0x0953, B:309:0x095d, B:310:0x096a, B:312:0x0974, B:313:0x0981, B:314:0x098a, B:316:0x0990, B:318:0x09cc, B:320:0x09d6, B:322:0x09e8, B:324:0x09ee, B:325:0x0a33, B:326:0x0a3d, B:327:0x0a4a, B:329:0x0a50, B:338:0x0a9d, B:339:0x0ae8, B:341:0x0af6, B:355:0x0b57, B:346:0x0b0e, B:347:0x0b11, B:332:0x0a5d, B:334:0x0a89, B:352:0x0b2a, B:353:0x0b41, B:354:0x0b42, B:241:0x0747, B:166:0x05b1, B:152:0x04ee, B:93:0x030a, B:94:0x0311, B:96:0x0317, B:98:0x0323, B:54:0x0194, B:56:0x019e, B:58:0x01b3, B:64:0x01cf, B:69:0x0203, B:71:0x0209, B:73:0x0217, B:75:0x0227, B:78:0x0234, B:86:0x02b6, B:88:0x02c0, B:80:0x025b, B:81:0x0274, B:85:0x029c, B:84:0x0288, B:67:0x01db, B:68:0x01f9), top: B:372:0x0155, inners: #0, #1, #2, #7 }] */
    /* JADX WARN: Type inference failed for: r0v73, types: [com.google.android.gms.measurement.internal.zzam] */
    /* JADX WARN: Type inference failed for: r0v86, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r12v42, types: [com.google.android.gms.measurement.internal.zzgg] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.CharSequence, java.lang.Long, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r43v0, types: [com.google.android.gms.measurement.internal.zzpv] */
    /* JADX WARN: Type inference failed for: r4v24, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.measurement.internal.zzam] */
    /* JADX WARN: Type inference failed for: r9v25, types: [com.google.android.gms.internal.measurement.zzhw, com.google.android.gms.internal.measurement.zzlz] */
    /* JADX WARN: Type inference failed for: r9v34, types: [com.google.android.gms.measurement.internal.zzgg] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzax(com.google.android.gms.measurement.internal.zzbh r44, com.google.android.gms.measurement.internal.zzr r45) {
        /*
            Method dump skipped, instruction units count: 2960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpv.zzax(com.google.android.gms.measurement.internal.zzbh, com.google.android.gms.measurement.internal.zzr):void");
    }

    public final boolean zzay(String str, String str2) {
        zzh zzhVarZzl = zzj().zzl(str);
        if (zzhVarZzl != null && zzB().zzak(str, zzhVarZzl.zzM())) {
            this.zzF.remove(str2);
            return true;
        }
        zzpt zzptVar = (zzpt) this.zzF.get(str2);
        if (zzptVar == null) {
            return true;
        }
        return zzptVar.zzc();
    }

    public final boolean zzaz() {
        zzaX().zzg();
        FileLock fileLock = this.zzx;
        if (fileLock != null && fileLock.isValid()) {
            zzaW().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.f47687zze.zzu.zzf();
        File filesDir = this.zzn.zzaT().getFilesDir();
        com.google.android.gms.internal.measurement.zzbx.zza();
        int i = com.google.android.gms.internal.measurement.zzcc.f39888zzb;
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.zzy = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.zzx = fileLockTryLock;
            if (fileLockTryLock != null) {
                zzaW().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzaW().zze().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            zzaW().zze().zzb("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            zzaW().zze().zzb("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e4) {
            zzaW().zzk().zzb("Storage lock already acquired", e4);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Bundle zzd(String str) {
        zzaX().zzg();
        zzM();
        if (zzr().zzi(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        zzjx zzjxVarZzu = zzu(str);
        bundle.putAll(zzjxVarZzu.zzc());
        bundle.putAll(zzl(str, zzm(str), zzjxVarZzu, new zzao()).zzb());
        zzqd zzqdVarZzy = zzj().zzy(str, "_npa");
        bundle.putString("ad_personalization", 1 != (zzqdVarZzy != null ? zzqdVarZzy.f47726zze.equals(1L) : zzaC(str, new zzao())) ? "granted" : "denied");
        return bundle;
    }

    public final Bundle zzf(String str, zzbh zzbhVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbhVar.f46952zzb.zze("_sid").longValue());
        zzqd zzqdVarZzy = zzj().zzy(str, "_sno");
        if (zzqdVarZzy != null) {
            Object obj2 = zzqdVarZzy.f47726zze;
            if (obj2 instanceof Long) {
                bundle.putLong("_sno", ((Long) obj2).longValue());
            }
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzh zzg(com.google.android.gms.measurement.internal.zzr r13) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpv.zzg(com.google.android.gms.measurement.internal.zzr):com.google.android.gms.measurement.internal.zzh");
    }

    public final zzae zzh() {
        zzae zzaeVar = this.f47690zzh;
        zzaR(zzaeVar);
        return zzaeVar;
    }

    public final zzam zzi() {
        return ((zzio) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    public final zzaw zzj() {
        zzaw zzawVar = this.f47687zze;
        zzaR(zzawVar);
        return zzawVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzba zzl(java.lang.String r10, com.google.android.gms.measurement.internal.zzba r11, com.google.android.gms.measurement.internal.zzjx r12, com.google.android.gms.measurement.internal.zzao r13) {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.zzif r0 = r9.zzr()
            com.google.android.gms.internal.measurement.zzgi r0 = r0.zzi(r10)
            java.lang.String r1 = "-"
            r2 = 90
            if (r0 != 0) goto L31
            com.google.android.gms.measurement.internal.zzju r10 = r11.zzf()
            com.google.android.gms.measurement.internal.zzju r12 = com.google.android.gms.measurement.internal.zzju.DENIED
            if (r10 != r12) goto L20
            int r2 = r11.zza()
            com.google.android.gms.measurement.internal.zzjw r10 = com.google.android.gms.measurement.internal.zzjw.AD_USER_DATA
            r13.zzc(r10, r2)
            goto L27
        L20:
            com.google.android.gms.measurement.internal.zzjw r10 = com.google.android.gms.measurement.internal.zzjw.AD_USER_DATA
            com.google.android.gms.measurement.internal.zzan r11 = com.google.android.gms.measurement.internal.zzan.FAILSAFE
            r13.zzd(r10, r11)
        L27:
            com.google.android.gms.measurement.internal.zzba r10 = new com.google.android.gms.measurement.internal.zzba
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r10.<init>(r11, r2, r12, r1)
            return r10
        L31:
            com.google.android.gms.measurement.internal.zzju r0 = r11.zzf()
            com.google.android.gms.measurement.internal.zzju r3 = com.google.android.gms.measurement.internal.zzju.GRANTED
            if (r0 == r3) goto L85
            com.google.android.gms.measurement.internal.zzju r4 = com.google.android.gms.measurement.internal.zzju.DENIED
            if (r0 != r4) goto L3e
            goto L85
        L3e:
            com.google.android.gms.measurement.internal.zzju r11 = com.google.android.gms.measurement.internal.zzju.POLICY
            if (r0 != r11) goto L55
            com.google.android.gms.measurement.internal.zzif r11 = r9.f47685zzc
            com.google.android.gms.measurement.internal.zzjw r0 = com.google.android.gms.measurement.internal.zzjw.AD_USER_DATA
            com.google.android.gms.measurement.internal.zzju r11 = r11.zzf(r10, r0)
            com.google.android.gms.measurement.internal.zzju r5 = com.google.android.gms.measurement.internal.zzju.UNINITIALIZED
            if (r11 == r5) goto L55
            com.google.android.gms.measurement.internal.zzan r12 = com.google.android.gms.measurement.internal.zzan.REMOTE_ENFORCED_DEFAULT
            r13.zzd(r0, r12)
            r0 = r11
            goto L8e
        L55:
            com.google.android.gms.measurement.internal.zzif r11 = r9.f47685zzc
            com.google.android.gms.measurement.internal.zzjw r0 = com.google.android.gms.measurement.internal.zzjw.AD_USER_DATA
            com.google.android.gms.measurement.internal.zzjw r5 = r11.zzh(r10, r0)
            com.google.android.gms.measurement.internal.zzju r12 = r12.zze()
            r6 = 1
            if (r12 == r3) goto L66
            if (r12 != r4) goto L68
        L66:
            r7 = r6
            goto L69
        L68:
            r7 = 0
        L69:
            com.google.android.gms.measurement.internal.zzjw r8 = com.google.android.gms.measurement.internal.zzjw.AD_STORAGE
            if (r5 != r8) goto L76
            if (r7 == 0) goto L76
            com.google.android.gms.measurement.internal.zzan r11 = com.google.android.gms.measurement.internal.zzan.REMOTE_DELEGATION
            r13.zzd(r0, r11)
            r0 = r12
            goto L8e
        L76:
            com.google.android.gms.measurement.internal.zzan r12 = com.google.android.gms.measurement.internal.zzan.REMOTE_DEFAULT
            r13.zzd(r0, r12)
            boolean r11 = r11.zzu(r10, r0)
            if (r6 == r11) goto L83
            r0 = r4
            goto L8e
        L83:
            r0 = r3
            goto L8e
        L85:
            int r2 = r11.zza()
            com.google.android.gms.measurement.internal.zzjw r11 = com.google.android.gms.measurement.internal.zzjw.AD_USER_DATA
            r13.zzc(r11, r2)
        L8e:
            com.google.android.gms.measurement.internal.zzif r11 = r9.f47685zzc
            boolean r11 = r11.zzv(r10)
            com.google.android.gms.measurement.internal.zzif r12 = r9.zzr()
            java.util.SortedSet r10 = r12.zzp(r10)
            com.google.android.gms.measurement.internal.zzju r12 = com.google.android.gms.measurement.internal.zzju.DENIED
            if (r0 == r12) goto Lbb
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto La7
            goto Lbb
        La7:
            com.google.android.gms.measurement.internal.zzba r12 = new com.google.android.gms.measurement.internal.zzba
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            java.lang.String r1 = ""
            if (r11 == 0) goto Lb7
            java.lang.String r1 = android.text.TextUtils.join(r1, r10)
        Lb7:
            r12.<init>(r13, r2, r0, r1)
            return r12
        Lbb:
            com.google.android.gms.measurement.internal.zzba r10 = new com.google.android.gms.measurement.internal.zzba
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10.<init>(r12, r2, r11, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpv.zzl(java.lang.String, com.google.android.gms.measurement.internal.zzba, com.google.android.gms.measurement.internal.zzjx, com.google.android.gms.measurement.internal.zzao):com.google.android.gms.measurement.internal.zzba");
    }

    public final zzba zzm(String str) {
        zzaX().zzg();
        zzM();
        Map map = this.zzD;
        zzba zzbaVar = (zzba) map.get(str);
        if (zzbaVar != null) {
            return zzbaVar;
        }
        zzba zzbaVarZzq = zzj().zzq(str);
        map.put(str, zzbaVarZzq);
        return zzbaVarZzq;
    }

    public final zzgx zzo() {
        return this.zzn.zzj();
    }

    public final zzhk zzp() {
        zzhk zzhkVar = this.f47686zzd;
        zzaR(zzhkVar);
        return zzhkVar;
    }

    public final zzhm zzq() {
        zzhm zzhmVar = this.f47688zzf;
        if (zzhmVar != null) {
            return zzhmVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzif zzr() {
        zzif zzifVar = this.f47685zzc;
        zzaR(zzifVar);
        return zzifVar;
    }

    public final zzio zzt() {
        return this.zzn;
    }

    public final zzjx zzu(String str) {
        zzjx zzjxVar = zzjx.f47268zza;
        zzaX().zzg();
        zzM();
        zzjx zzjxVarZzu = (zzjx) this.zzC.get(str);
        if (zzjxVarZzu == null) {
            zzjxVarZzu = zzj().zzu(str);
            if (zzjxVarZzu == null) {
                zzjxVarZzu = zzjx.f47268zza;
            }
            zzaq(str, zzjxVarZzu);
        }
        return zzjxVarZzu;
    }

    public final zzmc zzv() {
        zzmc zzmcVar = this.f47692zzj;
        zzaR(zzmcVar);
        return zzmcVar;
    }

    public final zzoa zzw() {
        return this.f47693zzk;
    }

    public final zzoy zzx() {
        zzoy zzoyVar = this.f47689zzg;
        zzaR(zzoyVar);
        return zzoyVar;
    }

    public final zzpi zzy() {
        return this.f47694zzl;
    }
}
