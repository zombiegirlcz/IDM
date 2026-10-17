package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.ArrayMap;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import ch.qos.logback.core.util.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import kotlin.Unit;

/* JADX INFO: loaded from: classes16.dex */
public final class zzlw extends zzg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected zzlv f47395zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final zzx f47396zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    protected boolean f47397zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private zzkb f47398zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final Set f47399zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private boolean f47400zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final AtomicReference f47401zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final Object f47402zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private boolean f47403zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private int f47404zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private zzaz f47405zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private zzaz f47406zzl;
    private PriorityQueue zzm;
    private boolean zzn;
    private zzjx zzo;
    private final AtomicLong zzp;
    private long zzq;
    private zzaz zzr;
    private SharedPreferences.OnSharedPreferenceChangeListener zzs;
    private zzaz zzt;
    private final zzqe zzv;

    public zzlw(zzio zzioVar) {
        super(zzioVar);
        this.f47399zze = new CopyOnWriteArraySet();
        this.f47402zzh = new Object();
        this.f47403zzi = false;
        this.f47404zzj = 1;
        this.f47397zzc = true;
        this.zzv = new zzlk(this);
        this.f47401zzg = new AtomicReference();
        this.zzo = zzjx.f47268zza;
        this.zzq = -1L;
        this.zzp = new AtomicLong(0L);
        this.f47396zzb = new zzx(zzioVar);
    }

    public static /* synthetic */ void zzA(zzlw zzlwVar, SharedPreferences sharedPreferences, String str) {
        zzio zzioVar = zzlwVar.zzu;
        if (!zzioVar.zzf().zzx(null, zzgi.zzbj)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                zzioVar.zzaW().zzj().zza("IABTCF_TCString change picked up in listener.");
                ((zzaz) Preconditions.checkNotNull(zzlwVar.zzt)).zzd(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            zzioVar.zzaW().zzj().zza("IABTCF_TCString change picked up in listener.");
            ((zzaz) Preconditions.checkNotNull(zzlwVar.zzt)).zzd(500L);
        }
    }

    public static /* synthetic */ void zzD(zzlw zzlwVar, zzjx zzjxVar, long j2, boolean z, boolean z3) {
        zzlwVar.zzg();
        zzlwVar.zza();
        zzio zzioVar = zzlwVar.zzu;
        zzjx zzjxVarZzh = zzioVar.zzm().zzh();
        if (j2 <= zzlwVar.zzq && zzjx.zzs(zzjxVarZzh.zzb(), zzjxVar.zzb())) {
            zzioVar.zzaW().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzjxVar);
            return;
        }
        zzht zzhtVarZzm = zzioVar.zzm();
        zzio zzioVar2 = zzhtVarZzm.zzu;
        zzhtVarZzm.zzg();
        int iZzb = zzjxVar.zzb();
        if (!zzhtVarZzm.zzq(iZzb)) {
            zzioVar.zzaW().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzjxVar.zzb()));
            return;
        }
        zzio zzioVar3 = zzlwVar.zzu;
        SharedPreferences.Editor editorEdit = zzhtVarZzm.zzb().edit();
        editorEdit.putString("consent_settings", zzjxVar.zzq());
        editorEdit.putInt("consent_source", iZzb);
        editorEdit.apply();
        zzioVar.zzaW().zzj().zzb("Setting storage consent(FE)", zzjxVar);
        zzlwVar.zzq = j2;
        if (zzioVar3.zzu().zzac()) {
            zzioVar3.zzu().zzX(z);
        } else {
            zzioVar3.zzu().zzR(z);
        }
        if (z3) {
            zzioVar3.zzu().zzE(new AtomicReference());
        }
    }

    public static /* bridge */ /* synthetic */ void zzF(zzlw zzlwVar, int i) {
        if (zzlwVar.f47405zzk == null) {
            zzlwVar.f47405zzk = new zzku(zzlwVar, zzlwVar.zzu);
        }
        zzlwVar.f47405zzk.zzd(((long) i) * 1000);
    }

    public static /* bridge */ /* synthetic */ int zzaq(zzlw zzlwVar, Throwable th10) {
        String message = th10.getMessage();
        zzlwVar.zzn = false;
        if (message == null) {
            return 2;
        }
        if (!(th10 instanceof IllegalStateException) && !message.contains("garbage collected") && !th10.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th10 instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        zzlwVar.zzn = true;
        return 1;
    }

    private final zzme zzar(final zzpa zzpaVar) {
        try {
            URL url2 = new URI(zzpaVar.f47644zzc).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strZzn = this.zzu.zzh().zzn();
            zzio zzioVar = this.zzu;
            zzhc zzhcVarZzj = zzioVar.zzaW().zzj();
            Long lValueOf = Long.valueOf(zzpaVar.f47642zza);
            zzhcVarZzj.zzd("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzpaVar.f47644zzc, Integer.valueOf(zzpaVar.f47643zzb.length));
            if (!TextUtils.isEmpty(zzpaVar.f47648zzg)) {
                zzioVar.zzaW().zzj().zzc("[sgtm] Uploading data from app. row_id", lValueOf, zzpaVar.f47648zzg);
            }
            HashMap map = new HashMap();
            Bundle bundle = zzpaVar.f47645zzd;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            zzmb zzmbVarZzr = zzioVar.zzr();
            byte[] bArr = zzpaVar.f47643zzb;
            zzly zzlyVar = new zzly() { // from class: com.google.android.gms.measurement.internal.zzkn
                /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
                @Override // com.google.android.gms.measurement.internal.zzly
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void zza(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
                    /*
                        r6 = this;
                        com.google.android.gms.measurement.internal.zzlw r7 = r6.f47309zza
                        r7.zzg()
                        com.google.android.gms.measurement.internal.zzpa r10 = r3
                        r11 = 200(0xc8, float:2.8E-43)
                        if (r8 == r11) goto L14
                        r11 = 204(0xcc, float:2.86E-43)
                        if (r8 == r11) goto L14
                        r11 = 304(0x130, float:4.26E-43)
                        if (r8 != r11) goto L2e
                        r8 = r11
                    L14:
                        if (r9 != 0) goto L2e
                        com.google.android.gms.measurement.internal.zzio r8 = r7.zzu
                        com.google.android.gms.measurement.internal.zzhe r8 = r8.zzaW()
                        com.google.android.gms.measurement.internal.zzhc r8 = r8.zzj()
                        long r0 = r10.f47642zza
                        java.lang.Long r9 = java.lang.Long.valueOf(r0)
                        java.lang.String r11 = "[sgtm] Upload succeeded for row_id"
                        r8.zzb(r11, r9)
                        com.google.android.gms.measurement.internal.zzme r8 = com.google.android.gms.measurement.internal.zzme.SUCCESS
                        goto L69
                    L2e:
                        com.google.android.gms.measurement.internal.zzio r11 = r7.zzu
                        com.google.android.gms.measurement.internal.zzhe r11 = r11.zzaW()
                        com.google.android.gms.measurement.internal.zzhc r11 = r11.zzk()
                        long r0 = r10.f47642zza
                        java.lang.Long r0 = java.lang.Long.valueOf(r0)
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                        java.lang.String r2 = "[sgtm] Upload failed for row_id. response, exception"
                        r11.zzd(r2, r0, r1, r9)
                        com.google.android.gms.measurement.internal.zzgg r9 = com.google.android.gms.measurement.internal.zzgi.zzt
                        r11 = 0
                        java.lang.Object r9 = r9.zza(r11)
                        java.lang.String r9 = (java.lang.String) r9
                        java.lang.String r11 = ","
                        java.lang.String[] r9 = r9.split(r11)
                        java.util.List r9 = java.util.Arrays.asList(r9)
                        java.lang.String r8 = java.lang.String.valueOf(r8)
                        boolean r8 = r9.contains(r8)
                        if (r8 == 0) goto L67
                        com.google.android.gms.measurement.internal.zzme r8 = com.google.android.gms.measurement.internal.zzme.BACKOFF
                        goto L69
                    L67:
                        com.google.android.gms.measurement.internal.zzme r8 = com.google.android.gms.measurement.internal.zzme.FAILURE
                    L69:
                        java.util.concurrent.atomic.AtomicReference r9 = r2
                        com.google.android.gms.measurement.internal.zzio r11 = r7.zzu
                        com.google.android.gms.measurement.internal.zzny r11 = r11.zzu()
                        com.google.android.gms.measurement.internal.zzag r0 = new com.google.android.gms.measurement.internal.zzag
                        long r1 = r10.f47642zza
                        int r3 = r8.zza()
                        long r4 = r10.f47647zzf
                        r0.<init>(r1, r3, r4)
                        r11.zzZ(r0)
                        com.google.android.gms.measurement.internal.zzio r7 = r7.zzu
                        com.google.android.gms.measurement.internal.zzhe r7 = r7.zzaW()
                        com.google.android.gms.measurement.internal.zzhc r7 = r7.zzj()
                        java.lang.Long r10 = java.lang.Long.valueOf(r1)
                        java.lang.String r11 = "[sgtm] Updated status for row_id"
                        r7.zzc(r11, r10, r8)
                        monitor-enter(r9)
                        r9.set(r8)     // Catch: java.lang.Throwable -> L9d
                        r9.notifyAll()     // Catch: java.lang.Throwable -> L9d
                        monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
                        return
                    L9d:
                        r0 = move-exception
                        r7 = r0
                        monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkn.zza(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
                }
            };
            zzmbVarZzr.zzv();
            Preconditions.checkNotNull(url2);
            Preconditions.checkNotNull(bArr);
            Preconditions.checkNotNull(zzlyVar);
            zzmbVarZzr.zzu.zzaX().zzp(new zzma(zzmbVarZzr, strZzn, url2, bArr, map, zzlyVar));
            try {
                zzio zzioVar2 = zzioVar.zzw().zzu;
                long jCurrentTimeMillis = zzioVar2.zzaU().currentTimeMillis() + 60000;
                synchronized (atomicReference) {
                    for (long jCurrentTimeMillis2 = 60000; atomicReference.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - zzioVar2.zzaU().currentTimeMillis()) {
                        try {
                            atomicReference.wait(jCurrentTimeMillis2);
                        } finally {
                        }
                    }
                }
            } catch (InterruptedException unused) {
                a.C(this.zzu, "[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? zzme.UNKNOWN : (zzme) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e) {
            this.zzu.zzaW().zze().zzd("[sgtm] Bad upload url for row_id", zzpaVar.f47644zzc, Long.valueOf(zzpaVar.f47642zza), e);
            return zzme.FAILURE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzas(Boolean bool, boolean z) {
        zzg();
        zza();
        zzio zzioVar = this.zzu;
        zzioVar.zzaW().zzd().zzb("Setting app measurement enabled (FE)", bool);
        zzioVar.zzm().zzm(bool);
        if (z) {
            zzht zzhtVarZzm = zzioVar.zzm();
            zzio zzioVar2 = zzhtVarZzm.zzu;
            zzhtVarZzm.zzg();
            SharedPreferences.Editor editorEdit = zzhtVarZzm.zzb().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.zzu.zzK() || !(bool == null || bool.booleanValue())) {
            zzat();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzat() {
        zzlw zzlwVar;
        zzg();
        zzio zzioVar = this.zzu;
        String strZza = zzioVar.zzm().f47097zzh.zza();
        if (strZza == null) {
            zzlwVar = this;
        } else if ("unset".equals(strZza)) {
            zzlwVar = this;
            zzlwVar.zzan("app", "_npa", null, zzioVar.zzaU().currentTimeMillis());
        } else {
            zzan("app", "_npa", Long.valueOf(true != "true".equals(strZza) ? 0L : 1L), zzioVar.zzaU().currentTimeMillis());
            zzlwVar = this;
        }
        if (!zzlwVar.zzu.zzJ() || !zzlwVar.f47397zzc) {
            zzioVar.zzaW().zzd().zza("Updating Scion state (FE)");
            zzlwVar.zzu.zzu().zzV();
        } else {
            zzioVar.zzaW().zzd().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzH();
            zzlwVar.zzu.zzv().f47617zza.zza();
            zzioVar.zzaX().zzq(new zzkw(this));
        }
    }

    public static /* synthetic */ void zzz(zzlw zzlwVar, Bundle bundle) {
        Bundle bundle2;
        int i;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            zzio zzioVar = zzlwVar.zzu;
            bundle2 = new Bundle(zzioVar.zzm().zzt.zza());
            Iterator<String> it8 = bundle.keySet().iterator();
            while (true) {
                i = 0;
                if (!it8.hasNext()) {
                    break;
                }
                String next = it8.next();
                Object obj2 = bundle.get(next);
                if (obj2 != null && !(obj2 instanceof String) && !(obj2 instanceof Long) && !(obj2 instanceof Double)) {
                    if (zzioVar.zzw().zzal(obj2)) {
                        zzioVar.zzw().zzR(zzlwVar.zzv, null, 27, null, null, 0);
                    }
                    zzioVar.zzaW().zzl().zzc("Invalid default event parameter type. Name, value", next, obj2);
                } else if (zzqf.zzap(next)) {
                    zzioVar.zzaW().zzl().zzb("Invalid default event parameter name. Name", next);
                } else if (obj2 == null) {
                    bundle2.remove(next);
                } else if (zzioVar.zzw().zzaf("param", next, zzioVar.zzf().zzc(null, false), obj2)) {
                    zzioVar.zzw().zzS(bundle2, next, obj2);
                }
            }
            zzioVar.zzw();
            int iZze = zzioVar.zzf().zze();
            if (bundle2.size() > iZze) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i++;
                    if (i > iZze) {
                        bundle2.remove(str);
                    }
                }
                zzioVar.zzw().zzR(zzlwVar.zzv, null, 26, null, null, 0);
                zzioVar.zzaW().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        zzio zzioVar2 = zzlwVar.zzu;
        zzioVar2.zzm().zzt.zzb(bundle2);
        if (!bundle.isEmpty() || zzioVar2.zzf().zzx(null, zzgi.zzbd)) {
            zzlwVar.zzu.zzu().zzT(bundle2);
        }
    }

    public final void zzH() {
        zzg();
        zza();
        if (this.zzu.zzM()) {
            zzio zzioVar = this.zzu;
            zzam zzamVarZzf = zzioVar.zzf();
            zzamVarZzf.zzu.zzaV();
            Boolean boolZzn = zzamVarZzf.zzn("google_analytics_deferred_deep_link_enabled");
            if (boolZzn != null && boolZzn.booleanValue()) {
                zzioVar.zzaW().zzd().zza("Deferred Deep Link feature enabled.");
                zzioVar.zzaX().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzko
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47312zza.zzM();
                    }
                });
            }
            this.zzu.zzu().zzA();
            this.f47397zzc = false;
            zzht zzhtVarZzm = zzioVar.zzm();
            zzhtVarZzm.zzg();
            String string = zzhtVarZzm.zzb().getString("previous_os_version", null);
            zzhtVarZzm.zzu.zzg().zzv();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = zzhtVarZzm.zzb().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            zzioVar.zzg().zzv();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzR("auto", "_ou", bundle);
        }
    }

    public final void zzI() {
        zzg();
        zzaz zzazVar = this.f47406zzl;
        if (zzazVar != null) {
            zzazVar.zzb();
        }
    }

    public final void zzJ(String str, String str2, Bundle bundle) {
        zzio zzioVar = this.zzu;
        long jCurrentTimeMillis = zzioVar.zzaU().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzioVar.zzaX().zzq(new zzlg(this, bundle2));
    }

    public final void zzK() {
        zzio zzioVar = this.zzu;
        if (!(zzioVar.zzaT().getApplicationContext() instanceof Application) || this.f47395zza == null) {
            return;
        }
        ((Application) zzioVar.zzaT().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f47395zza);
    }

    public final void zzL() {
        zzqr.zzb();
        zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, zzgi.zzaW)) {
            if (zzioVar.zzaX().zzu()) {
                a.w(zzioVar, "Cannot get trigger URIs from analytics worker thread");
                return;
            }
            zzioVar.zzaV();
            if (zzaf.zza()) {
                a.w(zzioVar, "Cannot get trigger URIs from main thread");
                return;
            }
            zza();
            zzioVar.zzaW().zzj().zza("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzioVar.zzaX().zze(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzki
                @Override // java.lang.Runnable
                public final void run() {
                    zzlw zzlwVar = this.f47298zza;
                    zzlwVar.zzu.zzu().zzH(atomicReference, zzlwVar.zzu.zzm().f47098zzi.zza());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                a.w(zzioVar, "Timed out waiting for get trigger URIs");
            } else {
                zzioVar.zzaX().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzlw zzlwVar = this.f47300zza;
                        zzlwVar.zzg();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<zzov> list2 = list;
                        SparseArray sparseArrayZze = zzlwVar.zzu.zzm().zze();
                        for (zzov zzovVar : list2) {
                            int i = zzovVar.f47634zzc;
                            if (!sparseArrayZze.contains(i) || ((Long) sparseArrayZze.get(i)).longValue() < zzovVar.f47633zzb) {
                                zzlwVar.zzy().add(zzovVar);
                            }
                        }
                        zzlwVar.zzU();
                    }
                });
            }
        }
    }

    public final void zzM() {
        zzg();
        zzio zzioVar = this.zzu;
        if (zzioVar.zzm().zzo.zzb()) {
            zzioVar.zzaW().zzd().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jZza = zzioVar.zzm().zzp.zza();
        zzioVar.zzm().zzp.zzb(1 + jZza);
        zzioVar.zzf();
        if (jZza >= 5) {
            zzioVar.zzaW().zzk().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzioVar.zzm().zzo.zza(true);
        } else {
            if (this.zzr == null) {
                this.zzr = new zzld(this, this.zzu);
            }
            this.zzr.zzd(0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzN() {
        zzio zzioVar;
        zzoq zzoqVar;
        zzoq zzoqVar2;
        com.google.android.gms.internal.measurement.zzkm zzkmVar;
        zzg();
        zzio zzioVar2 = this.zzu;
        zzioVar2.zzaW().zzd().zza("Handle tcf update.");
        SharedPreferences sharedPreferencesZza = zzioVar2.zzm().zza();
        HashMap map = new HashMap();
        zzgg zzggVar = zzgi.zzbj;
        if (((Boolean) zzggVar.zza(null)).booleanValue()) {
            int i = zzot.f47629zzb;
            com.google.android.gms.internal.measurement.zzkl zzklVar = com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            zzos zzosVar = zzos.CONSENT;
            Map.Entry entryZza = zzor.zza(zzklVar, zzosVar);
            int i2 = 2;
            com.google.android.gms.internal.measurement.zzkl zzklVar2 = com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            int i3 = 1;
            zzos zzosVar2 = zzos.FLEXIBLE_LEGITIMATE_INTEREST;
            zzioVar = zzioVar2;
            ImmutableMap immutableMapOfEntries = ImmutableMap.ofEntries(entryZza, zzor.zza(zzklVar2, zzosVar2), zzor.zza(com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, zzosVar), zzor.zza(com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, zzosVar), zzor.zza(com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, zzosVar2), zzor.zza(com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, zzosVar2), zzor.zza(com.google.android.gms.internal.measurement.zzkl.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, zzosVar2));
            ImmutableSet immutableSetOf = ImmutableSet.of("CH");
            char[] cArr = new char[5];
            int iZza = zzot.zza(sharedPreferencesZza, "IABTCF_CmpSdkID");
            int iZza2 = zzot.zza(sharedPreferencesZza, "IABTCF_PolicyVersion");
            int iZza3 = zzot.zza(sharedPreferencesZza, "IABTCF_gdprApplies");
            int iZza4 = zzot.zza(sharedPreferencesZza, "IABTCF_PurposeOneTreatment");
            int iZza5 = zzot.zza(sharedPreferencesZza, "IABTCF_EnableAdvertiserConsentMode");
            String strZzb = zzot.zzb(sharedPreferencesZza, "IABTCF_PublisherCC");
            ImmutableMap.Builder builder = ImmutableMap.builder();
            UnmodifiableIterator it8 = immutableMapOfEntries.keySet().iterator();
            while (it8.hasNext()) {
                com.google.android.gms.internal.measurement.zzkl zzklVar3 = (com.google.android.gms.internal.measurement.zzkl) it8.next();
                String strZzb2 = zzot.zzb(sharedPreferencesZza, "IABTCF_PublisherRestrictions" + zzklVar3.zza());
                if (TextUtils.isEmpty(strZzb2) || strZzb2.length() < 755) {
                    zzkmVar = com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strZzb2.charAt(754), 10);
                    zzkmVar = (iDigit < 0 || iDigit > com.google.android.gms.internal.measurement.zzkm.values().length || iDigit == 0) ? com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_NOT_ALLOWED : iDigit != i3 ? iDigit != i2 ? com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_UNDEFINED : com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST : com.google.android.gms.internal.measurement.zzkm.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
                builder.put(zzklVar3, zzkmVar);
                i2 = 2;
                i3 = 1;
            }
            ImmutableMap immutableMapBuildOrThrow = builder.buildOrThrow();
            String strZzb3 = zzot.zzb(sharedPreferencesZza, "IABTCF_PurposeConsents");
            String strZzb4 = zzot.zzb(sharedPreferencesZza, "IABTCF_VendorConsents");
            boolean z = !TextUtils.isEmpty(strZzb4) && strZzb4.length() >= 755 && strZzb4.charAt(754) == '1';
            String strZzb5 = zzot.zzb(sharedPreferencesZza, "IABTCF_PurposeLegitimateInterests");
            String strZzb6 = zzot.zzb(sharedPreferencesZza, "IABTCF_VendorLegitimateInterests");
            boolean z3 = !TextUtils.isEmpty(strZzb6) && strZzb6.length() >= 755 && strZzb6.charAt(754) == '1';
            cArr[0] = '2';
            zzoqVar = new zzoq(zzot.zzc(immutableMapOfEntries, immutableMapBuildOrThrow, immutableSetOf, cArr, iZza, iZza5, iZza3, iZza2, iZza4, strZzb, strZzb3, strZzb5, z, z3));
        } else {
            zzioVar = zzioVar2;
            String strZzb7 = zzot.zzb(sharedPreferencesZza, "IABTCF_VendorConsents");
            if (!"".equals(strZzb7) && strZzb7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strZzb7.charAt(754)));
            }
            int iZza6 = zzot.zza(sharedPreferencesZza, "IABTCF_gdprApplies");
            if (iZza6 != -1) {
                map.put("gdprApplies", String.valueOf(iZza6));
            }
            int iZza7 = zzot.zza(sharedPreferencesZza, "IABTCF_EnableAdvertiserConsentMode");
            if (iZza7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iZza7));
            }
            int iZza8 = zzot.zza(sharedPreferencesZza, "IABTCF_PolicyVersion");
            if (iZza8 != -1) {
                map.put("PolicyVersion", String.valueOf(iZza8));
            }
            String strZzb8 = zzot.zzb(sharedPreferencesZza, "IABTCF_PurposeConsents");
            if (!"".equals(strZzb8)) {
                map.put("PurposeConsents", strZzb8);
            }
            int iZza9 = zzot.zza(sharedPreferencesZza, "IABTCF_CmpSdkID");
            if (iZza9 != -1) {
                map.put("CmpSdkID", String.valueOf(iZza9));
            }
            zzoqVar = new zzoq(map);
        }
        zzioVar.zzaW().zzj().zzb("Tcf preferences read", zzoqVar);
        if (!zzioVar.zzf().zzx(null, zzggVar)) {
            if (zzioVar.zzm().zzr(zzoqVar)) {
                Bundle bundleZza = zzoqVar.zza();
                zzioVar.zzaW().zzj().zzb("Consent generated from Tcf", bundleZza);
                if (bundleZza != Bundle.EMPTY) {
                    zzaf(bundleZza, -30, zzioVar.zzaU().currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", zzoqVar.zzd());
                zzR("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        zzht zzhtVarZzm = zzioVar.zzm();
        zzhtVarZzm.zzg();
        String string = zzhtVarZzm.zzb().getString("stored_tcf_param", "");
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            zzoqVar2 = new zzoq(map2);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length >= 2 && zzot.f47628zza.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            zzoqVar2 = new zzoq(map2);
        }
        if (zzioVar.zzm().zzr(zzoqVar)) {
            Bundle bundleZza2 = zzoqVar.zza();
            zzioVar.zzaW().zzj().zzb("Consent generated from Tcf", bundleZza2);
            if (bundleZza2 != Bundle.EMPTY) {
                zzaf(bundleZza2, -30, zzioVar.zzaU().currentTimeMillis());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", zzoqVar.zzc(zzoqVar2));
            bundle2.putString("_tcfd2", zzoqVar.zzb());
            bundle2.putString("_tcfd", zzoqVar.zzd());
            zzR("auto", "_tcf", bundle2);
        }
    }

    public final void zzO(String str, String str2, Bundle bundle) {
        zzP(str, str2, bundle, true, true, this.zzu.zzaU().currentTimeMillis());
    }

    public final void zzP(String str, String str2, Bundle bundle, boolean z, boolean z3, long j2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.zzu.zzt().zzy(bundle2, j2);
            return;
        }
        boolean z4 = true;
        if (z3 && this.f47398zzd != null && !zzqf.zzap(str2)) {
            z4 = false;
        }
        boolean z6 = z4;
        if (str == null) {
            str = "app";
        }
        zzZ(str, str2, j2, bundle2, z3, z6, z, null);
    }

    public final void zzQ(String str, String str2, Bundle bundle, String str3) {
        zzio.zzP();
        zzZ("auto", str2, this.zzu.zzaU().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void zzR(String str, String str2, Bundle bundle) {
        zzg();
        zzS(str, str2, this.zzu.zzaU().currentTimeMillis(), bundle);
    }

    public final void zzS(String str, String str2, long j2, Bundle bundle) {
        zzg();
        boolean z = true;
        if (this.f47398zzd != null && !zzqf.zzap(str2)) {
            z = false;
        }
        zzT(str, str2, j2, bundle, true, z, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzT(String str, String str2, long j2, Bundle bundle, boolean z, boolean z3, boolean z4, String str3) {
        boolean z6;
        int i;
        zzio zzioVar;
        long j3;
        long j5;
        String str4;
        long j16;
        Bundle[] bundleArr;
        String str5 = str;
        Preconditions.checkNotEmpty(str5);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        zzio zzioVar2 = this.zzu;
        if (!zzioVar2.zzJ()) {
            this.zzu.zzaW().zzd().zza("Event not sent since app measurement is disabled");
            return;
        }
        List listZzp = this.zzu.zzh().zzp();
        if (listZzp != null && !listZzp.contains(str2)) {
            this.zzu.zzaW().zzd().zzc("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f47400zzf) {
            this.f47400zzf = true;
            try {
                try {
                    (!zzioVar2.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzu.zzaT().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzu.zzaT());
                } catch (Exception e) {
                    this.zzu.zzaW().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                this.zzu.zzaW().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            zzio zzioVar3 = this.zzu;
            zzioVar3.zzaV();
            zzan("auto", "_lgclid", bundle.getString("gclid"), zzioVar3.zzaU().currentTimeMillis());
        }
        zzlw zzlwVar = this;
        zzio zzioVar4 = zzlwVar.zzu;
        zzioVar4.zzaV();
        if (z && zzqf.zzau(str2)) {
            zzioVar4.zzw().zzO(bundle, zzioVar4.zzm().zzt.zza());
        }
        if (!z4) {
            zzioVar4.zzaV();
            if (!"_iap".equals(str2)) {
                zzio zzioVar5 = zzlwVar.zzu;
                zzqf zzqfVarZzw = zzioVar5.zzw();
                int i2 = 2;
                if (zzqfVarZzw.zzah("event", str2)) {
                    if (zzqfVarZzw.zzae("event", zzjy.f47271zza, zzjy.f47272zzb, str2)) {
                        zzqfVarZzw.zzu.zzf();
                        if (zzqfVarZzw.zzad("event", 40, str2)) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 13;
                    }
                }
                if (i2 != 0) {
                    zzioVar4.zzaW().zzf().zzb("Invalid public event name. Event will not be logged (FE)", zzioVar4.zzj().zzd(str2));
                    zzqf zzqfVarZzw2 = zzioVar5.zzw();
                    zzioVar5.zzf();
                    zzioVar5.zzw().zzR(zzlwVar.zzv, null, i2, "_ev", zzqfVarZzw2.zzG(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzioVar4.zzaV();
        zzio zzioVar6 = zzlwVar.zzu;
        zzmh zzmhVarZzj = zzioVar6.zzt().zzj(false);
        if (zzmhVarZzj != null && !bundle.containsKey("_sc")) {
            zzmhVarZzj.f47438zzd = true;
        }
        zzqf.zzN(zzmhVarZzj, bundle, z && !z4);
        boolean zEquals = "am".equals(str5);
        boolean zZzap = zzqf.zzap(str2);
        if (!z || zzlwVar.f47398zzd == null || zZzap) {
            z6 = zEquals;
        } else {
            if (!zEquals) {
                zzioVar4.zzaW().zzd().zzc("Passing event to registered event handler (FE)", zzioVar4.zzj().zzd(str2), zzioVar4.zzj().zzb(bundle));
                Preconditions.checkNotNull(zzlwVar.f47398zzd);
                zzlwVar.f47398zzd.interceptEvent(str5, str2, bundle, j2);
                return;
            }
            z6 = true;
        }
        zzio zzioVar7 = zzlwVar.zzu;
        if (zzioVar7.zzM()) {
            int iZzf = zzioVar4.zzw().zzf(str2);
            if (iZzf != 0) {
                zzioVar4.zzaW().zzf().zzb("Invalid event name. Event will not be logged (FE)", zzioVar4.zzj().zzd(str2));
                zzqf zzqfVarZzw3 = zzioVar4.zzw();
                zzioVar4.zzf();
                zzioVar7.zzw().zzR(zzlwVar.zzv, str3, iZzf, "_ev", zzqfVarZzw3.zzG(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleZzA = zzioVar4.zzw().zzA(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z4);
            Preconditions.checkNotNull(bundleZzA);
            zzioVar4.zzaV();
            if (zzioVar6.zzt().zzj(false) == null || !"_ae".equals(str2)) {
                i = 0;
                zzioVar = zzioVar6;
                j3 = 0;
            } else {
                zzon zzonVar = zzioVar6.zzv().f47618zzb;
                j3 = 0;
                long jElapsedRealtime = zzonVar.f47614zzc.zzu.zzaU().elapsedRealtime();
                i = 0;
                zzioVar = zzioVar6;
                long j22 = jElapsedRealtime - zzonVar.f47613zzb;
                zzonVar.f47613zzb = jElapsedRealtime;
                if (j22 > 0) {
                    zzioVar4.zzw().zzL(bundleZzA, j22);
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                zzqf zzqfVarZzw4 = zzioVar4.zzw();
                String string = bundleZzA.getString("_ffr");
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                zzio zzioVar8 = zzqfVarZzw4.zzu;
                if (Objects.equals(string, zzioVar8.zzm().zzq.zza())) {
                    zzioVar8.zzaW().zzd().zza("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                zzioVar8.zzm().zzq.zzb(string);
            } else if ("_ae".equals(str2)) {
                String strZza = zzioVar4.zzw().zzu.zzm().zzq.zza();
                if (!TextUtils.isEmpty(strZza)) {
                    bundleZzA.putString("_ffr", strZza);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleZzA);
            boolean zZzp = zzioVar4.zzf().zzx(null, zzgi.zzba) ? zzioVar.zzv().zzp() : zzioVar4.zzm().zzn.zzb();
            if (zzioVar4.zzm().f47100zzk.zza() > j3 && zzioVar4.zzm().zzp(j2) && zZzp) {
                zzioVar4.zzaW().zzj().zza("Current session is expired, remove the session number, ID, and engagement time");
                str4 = "_ae";
                j5 = j3;
                zzan("auto", "_sid", null, zzioVar4.zzaU().currentTimeMillis());
                zzan("auto", "_sno", null, zzioVar4.zzaU().currentTimeMillis());
                zzan("auto", "_se", null, zzioVar4.zzaU().currentTimeMillis());
                zzlwVar = this;
                zzioVar4.zzm().f47101zzl.zzb(j5);
            } else {
                j5 = j3;
                str4 = "_ae";
            }
            if (bundleZzA.getLong("extend_session", j5) == 1) {
                zzioVar4.zzaW().zzj().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j16 = j2;
                zzioVar7.zzv().f47617zza.zzb(j16, true);
            } else {
                j16 = j2;
            }
            ArrayList arrayList2 = new ArrayList(bundleZzA.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i3 = i; i3 < size; i3++) {
                String str6 = (String) arrayList2.get(i3);
                if (str6 != null) {
                    zzioVar4.zzw();
                    Object obj2 = bundleZzA.get(str6);
                    if (obj2 instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[i] = (Bundle) obj2;
                    } else if (obj2 instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj2;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj2 instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj2;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleZzA.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i5 = i;
            while (i5 < arrayList.size()) {
                Bundle bundleZzz = (Bundle) arrayList.get(i5);
                String str7 = i5 != 0 ? "_ep" : str2;
                bundleZzz.putString("_o", str5);
                if (z3) {
                    bundleZzz = zzioVar4.zzw().zzz(bundleZzz, null);
                }
                Bundle bundle2 = bundleZzz;
                zzioVar.zzu().zzM(new zzbh(str7, new zzbf(bundle2), str5, j16), str3);
                if (!z6) {
                    Iterator it8 = zzlwVar.f47399zze.iterator();
                    while (it8.hasNext()) {
                        ((zzkc) it8.next()).onEvent(str, str2, new Bundle(bundle2), j2);
                    }
                }
                i5++;
                str5 = str;
                j16 = j2;
            }
            zzioVar4.zzaV();
            if (zzioVar.zzt().zzj(i) == null || !str4.equals(str2)) {
                return;
            }
            zzioVar.zzv().f47618zzb.zzd(true, true, zzioVar4.zzaU().elapsedRealtime());
        }
    }

    public final void zzU() {
        zzov zzovVar;
        zzg();
        this.zzn = false;
        if (zzy().isEmpty() || this.f47403zzi || (zzovVar = (zzov) zzy().poll()) == null) {
            return;
        }
        zzio zzioVar = this.zzu;
        MeasurementManagerFutures measurementManagerFuturesZzB = zzioVar.zzw().zzB();
        if (measurementManagerFuturesZzB != null) {
            this.f47403zzi = true;
            zzhc zzhcVarZzj = zzioVar.zzaW().zzj();
            String str = zzovVar.f47632zza;
            zzhcVarZzj.zzb("Registering trigger URI", str);
            ListenableFuture<Unit> listenableFutureRegisterTriggerAsync = measurementManagerFuturesZzB.registerTriggerAsync(Uri.parse(str));
            if (listenableFutureRegisterTriggerAsync != null) {
                Futures.addCallback(listenableFutureRegisterTriggerAsync, new zzkt(this, zzovVar), new zzks(this));
            } else {
                this.f47403zzi = false;
                zzy().add(zzovVar);
            }
        }
    }

    public final void zzV(zzkc zzkcVar) {
        zza();
        Preconditions.checkNotNull(zzkcVar);
        if (this.f47399zze.add(zzkcVar)) {
            return;
        }
        a.C(this.zzu, "OnEventListener already registered");
    }

    public final void zzW() {
        zzg();
        zzio zzioVar = this.zzu;
        zzioVar.zzaW().zzd().zza("Register tcfPrefChangeListener.");
        if (this.zzs == null) {
            this.zzt = new zzky(this, this.zzu);
            this.zzs = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzkp
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    zzlw.zzA(this.f47313zza, sharedPreferences, str);
                }
            };
        }
        zzioVar.zzm().zza().registerOnSharedPreferenceChangeListener(this.zzs);
    }

    public final void zzX(long j2) {
        this.f47401zzg.set(null);
        this.zzu.zzaX().zzq(new zzle(this, j2));
    }

    public final void zzY(Runnable runnable) {
        zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, zzgi.zzaR)) {
            zza();
            if (zzioVar.zzaX().zzu()) {
                a.w(zzioVar, "Cannot retrieve and upload batches from analytics worker thread");
                return;
            }
            if (zzioVar.zzaX().zzt()) {
                a.w(zzioVar, "Cannot retrieve and upload batches from analytics network thread");
                return;
            }
            zzioVar.zzaV();
            if (zzaf.zza()) {
                a.w(zzioVar, "Cannot retrieve and upload batches from main thread");
                return;
            }
            zzioVar.zzaW().zzj().zza("[sgtm] Started client-side batch upload work.");
            boolean z = false;
            int size = 0;
            int i = 0;
            while (!z) {
                zzioVar.zzaW().zzj().zza("[sgtm] Getting upload batches from service (FE)");
                final AtomicReference atomicReference = new AtomicReference();
                zzioVar.zzaX().zze(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47304zza.zzu.zzu().zzI(atomicReference, zzpc.zza(zzmf.SGTM_CLIENT));
                    }
                });
                zzpe zzpeVar = (zzpe) atomicReference.get();
                if (zzpeVar == null) {
                    break;
                }
                List list = zzpeVar.f47650zza;
                if (!list.isEmpty()) {
                    zzioVar.zzaW().zzj().zzb("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                    size += list.size();
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            z = false;
                            break;
                        }
                        zzme zzmeVarZzar = zzar((zzpa) it8.next());
                        if (zzmeVarZzar == zzme.SUCCESS) {
                            i++;
                        } else if (zzmeVarZzar == zzme.BACKOFF) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            zzioVar.zzaW().zzj().zzc("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i));
            runnable.run();
        }
    }

    public final void zzZ(String str, String str2, long j2, Bundle bundle, boolean z, boolean z3, boolean z4, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj2 = bundle2.get(str4);
            if (obj2 instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj2));
            } else {
                int i = 0;
                if (obj2 instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj2;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj2 instanceof List) {
                    List list = (List) obj2;
                    while (i < list.size()) {
                        Object obj3 = list.get(i);
                        if (obj3 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj3));
                        }
                        i++;
                    }
                }
            }
        }
        this.zzu.zzaX().zzq(new zzkz(this, str, str2, j2, bundle2, z, z3, z4, str3));
    }

    public final void zzaa(String str, String str2, long j2, Object obj2) {
        this.zzu.zzaX().zzq(new zzla(this, str, str2, obj2, j2));
    }

    public final void zzab(long j2) {
        zzg();
        if (this.f47406zzl == null) {
            this.f47406zzl = new zzkr(this, this.zzu);
        }
        this.f47406zzl.zzd(j2);
    }

    public final void zzac(String str) {
        this.f47401zzg.set(str);
    }

    public final void zzad(Bundle bundle) {
        zzae(bundle, this.zzu.zzaU().currentTimeMillis());
    }

    public final void zzae(Bundle bundle, long j2) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            a.C(this.zzu, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzjt.zza(bundle2, "app_id", String.class, null);
        zzjt.zza(bundle2, "origin", String.class, null);
        zzjt.zza(bundle2, "name", String.class, null);
        zzjt.zza(bundle2, "value", Object.class, null);
        zzjt.zza(bundle2, "trigger_event_name", String.class, null);
        zzjt.zza(bundle2, "trigger_timeout", Long.class, 0L);
        zzjt.zza(bundle2, "timed_out_event_name", String.class, null);
        zzjt.zza(bundle2, "timed_out_event_params", Bundle.class, null);
        zzjt.zza(bundle2, "triggered_event_name", String.class, null);
        zzjt.zza(bundle2, "triggered_event_params", Bundle.class, null);
        zzjt.zza(bundle2, "time_to_live", Long.class, 0L);
        zzjt.zza(bundle2, "expired_event_name", String.class, null);
        zzjt.zza(bundle2, "expired_event_params", Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j2);
        String string = bundle2.getString("name");
        Object obj2 = bundle2.get("value");
        zzio zzioVar = this.zzu;
        if (zzioVar.zzw().zzj(string) != 0) {
            zzioVar.zzaW().zze().zzb("Invalid conditional user property name", zzioVar.zzj().zzf(string));
            return;
        }
        if (zzioVar.zzw().zzd(string, obj2) != 0) {
            zzioVar.zzaW().zze().zzc("Invalid conditional user property value", zzioVar.zzj().zzf(string), obj2);
            return;
        }
        Object objZzE = zzioVar.zzw().zzE(string, obj2);
        if (objZzE == null) {
            zzioVar.zzaW().zze().zzc("Unable to normalize conditional user property value", zzioVar.zzj().zzf(string), obj2);
            return;
        }
        zzjt.zzb(bundle2, objZzE);
        long j3 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            zzioVar.zzf();
            if (j3 > 15552000000L || j3 < 1) {
                zzioVar.zzaW().zze().zzc("Invalid conditional user property timeout", zzioVar.zzj().zzf(string), Long.valueOf(j3));
                return;
            }
        }
        long j5 = bundle2.getLong("time_to_live");
        zzioVar.zzf();
        if (j5 > 15552000000L || j5 < 1) {
            zzioVar.zzaW().zze().zzc("Invalid conditional user property time to live", zzioVar.zzj().zzf(string), Long.valueOf(j5));
        } else {
            zzioVar.zzaX().zzq(new zzlf(this, bundle2));
        }
    }

    public final void zzaf(Bundle bundle, int i, long j2) {
        Object obj2;
        String string;
        zza();
        zzjx zzjxVar = zzjx.f47268zza;
        zzjw[] zzjwVarArr = zzjv.STORAGE.f47261zzd;
        int length = zzjwVarArr.length;
        int i2 = 0;
        while (true) {
            obj2 = null;
            if (i2 >= length) {
                break;
            }
            String str = zzjwVarArr[i2].f47267zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj2 = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj2 = Boolean.FALSE;
                }
                if (obj2 == null) {
                    obj2 = string;
                    break;
                }
            }
            i2++;
        }
        if (obj2 != null) {
            zzio zzioVar = this.zzu;
            zzioVar.zzaW().zzl().zzb("Ignoring invalid consent setting", obj2);
            zzioVar.zzaW().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        boolean zZzu = this.zzu.zzaX().zzu();
        zzjx zzjxVarZzi = zzjx.zzi(bundle, i);
        if (zzjxVarZzi.zzt()) {
            zzak(zzjxVarZzi, zZzu);
        }
        zzba zzbaVarZzc = zzba.zzc(bundle, i);
        if (zzbaVarZzc.zzk()) {
            zzag(zzbaVarZzc, zZzu);
        }
        Boolean boolZzg = zzba.zzg(bundle);
        if (boolZzg != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zZzu) {
                zzan(str2, "allow_personalized_ads", boolZzg.toString(), j2);
            } else {
                zzam(str2, "allow_personalized_ads", boolZzg.toString(), false, j2);
            }
        }
    }

    public final void zzag(zzba zzbaVar, boolean z) {
        zzlq zzlqVar = new zzlq(this, zzbaVar);
        if (!z) {
            this.zzu.zzaX().zzq(zzlqVar);
        } else {
            zzg();
            zzlqVar.run();
        }
    }

    public final void zzah(zzkb zzkbVar) {
        zzkb zzkbVar2;
        zzg();
        zza();
        if (zzkbVar != null && zzkbVar != (zzkbVar2 = this.f47398zzd)) {
            Preconditions.checkState(zzkbVar2 == null, "EventInterceptor already set.");
        }
        this.f47398zzd = zzkbVar;
    }

    public final void zzai(Boolean bool) {
        zza();
        this.zzu.zzaX().zzq(new zzlp(this, bool));
    }

    public final void zzaj(zzjx zzjxVar) {
        zzg();
        boolean z = (zzjxVar.zzr(zzjw.ANALYTICS_STORAGE) && zzjxVar.zzr(zzjw.AD_STORAGE)) || this.zzu.zzu().zzab();
        zzio zzioVar = this.zzu;
        if (z != zzioVar.zzK()) {
            zzioVar.zzG(z);
            zzht zzhtVarZzm = this.zzu.zzm();
            zzio zzioVar2 = zzhtVarZzm.zzu;
            zzhtVarZzm.zzg();
            Boolean boolValueOf = zzhtVarZzm.zzb().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzhtVarZzm.zzb().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                zzas(Boolean.valueOf(z), false);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void zzak(com.google.android.gms.measurement.internal.zzjx r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlw.zzak(com.google.android.gms.measurement.internal.zzjx, boolean):void");
    }

    public final void zzal(String str, String str2, Object obj2, boolean z) {
        zzam(str, str2, obj2, z, this.zzu.zzaU().currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzam(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) {
        /*
            r16 = this;
            r0 = r16
            r2 = r18
            r1 = r19
            r3 = 0
            r4 = 24
            if (r20 == 0) goto L17
            com.google.android.gms.measurement.internal.zzio r5 = r0.zzu
            com.google.android.gms.measurement.internal.zzqf r5 = r5.zzw()
            int r5 = r5.zzj(r2)
        L15:
            r12 = r5
            goto L41
        L17:
            com.google.android.gms.measurement.internal.zzio r5 = r0.zzu
            com.google.android.gms.measurement.internal.zzqf r5 = r5.zzw()
            java.lang.String r6 = "user property"
            boolean r7 = r5.zzah(r6, r2)
            r8 = 6
            if (r7 != 0) goto L28
        L26:
            r12 = r8
            goto L41
        L28:
            java.lang.String[] r7 = com.google.android.gms.measurement.internal.zzka.f47283zza
            r9 = 0
            boolean r7 = r5.zzae(r6, r7, r9, r2)
            if (r7 != 0) goto L34
            r5 = 15
            goto L15
        L34:
            com.google.android.gms.measurement.internal.zzio r7 = r5.zzu
            r7.zzf()
            boolean r5 = r5.zzad(r6, r4, r2)
            if (r5 != 0) goto L40
            goto L26
        L40:
            r12 = r3
        L41:
            r5 = 1
            if (r12 == 0) goto L67
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzqf r6 = r1.zzw()
            r1.zzf()
            java.lang.String r14 = r6.zzG(r2, r4, r5)
            if (r2 == 0) goto L57
            int r3 = r2.length()
        L57:
            r15 = r3
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzqe r10 = r0.zzv
            com.google.android.gms.measurement.internal.zzqf r9 = r1.zzw()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.zzR(r10, r11, r12, r13, r14, r15)
            return
        L67:
            if (r17 != 0) goto L6c
            java.lang.String r6 = "app"
            goto L6e
        L6c:
            r6 = r17
        L6e:
            if (r1 == 0) goto Lbb
            com.google.android.gms.measurement.internal.zzio r7 = r0.zzu
            com.google.android.gms.measurement.internal.zzqf r8 = r7.zzw()
            int r12 = r8.zzd(r2, r1)
            if (r12 == 0) goto Laa
            com.google.android.gms.measurement.internal.zzqf r6 = r7.zzw()
            r7.zzf()
            java.lang.String r14 = r6.zzG(r2, r4, r5)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 != 0) goto L92
            boolean r2 = r1 instanceof java.lang.CharSequence
            if (r2 == 0) goto L90
            goto L92
        L90:
            r15 = r3
            goto L9b
        L92:
            java.lang.String r1 = r1.toString()
            int r3 = r1.length()
            goto L90
        L9b:
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu
            com.google.android.gms.measurement.internal.zzqe r10 = r0.zzv
            com.google.android.gms.measurement.internal.zzqf r9 = r1.zzw()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.zzR(r10, r11, r12, r13, r14, r15)
            return
        Laa:
            com.google.android.gms.measurement.internal.zzqf r3 = r7.zzw()
            java.lang.Object r5 = r3.zzE(r2, r1)
            if (r5 == 0) goto Lba
            r3 = r21
            r1 = r6
            r0.zzaa(r1, r2, r3, r5)
        Lba:
            return
        Lbb:
            r1 = r6
            r5 = 0
            r0 = r16
            r2 = r18
            r3 = r21
            r0.zzaa(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlw.zzam(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzan(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r11)
            r9.zzg()
            r9.zza()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L74
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L53
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L53
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            r12 = 1
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r12 == r11) goto L37
            r11 = 0
            goto L38
        L37:
            r11 = r2
        L38:
            com.google.android.gms.measurement.internal.zzio r4 = r9.zzu
            java.lang.Long r12 = java.lang.Long.valueOf(r11)
            com.google.android.gms.measurement.internal.zzht r11 = r4.zzm()
            com.google.android.gms.measurement.internal.zzhr r11 = r11.f47097zzh
            long r4 = r12.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r11.zzb(r0)
        L51:
            r11 = r1
            goto L63
        L53:
            if (r12 != 0) goto L63
            com.google.android.gms.measurement.internal.zzio r11 = r9.zzu
            com.google.android.gms.measurement.internal.zzht r11 = r11.zzm()
            com.google.android.gms.measurement.internal.zzhr r11 = r11.f47097zzh
            java.lang.String r0 = "unset"
            r11.zzb(r0)
            goto L51
        L63:
            com.google.android.gms.measurement.internal.zzio r0 = r9.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzj()
            java.lang.String r1 = "Setting user property(FE)"
            java.lang.String r2 = "non_personalized_ads(_npa)"
            r0.zzc(r1, r2, r12)
        L74:
            r4 = r11
            r7 = r12
            com.google.android.gms.measurement.internal.zzio r11 = r9.zzu
            boolean r12 = r11.zzJ()
            if (r12 != 0) goto L8e
            com.google.android.gms.measurement.internal.zzio r10 = r9.zzu
            com.google.android.gms.measurement.internal.zzhe r10 = r10.zzaW()
            com.google.android.gms.measurement.internal.zzhc r10 = r10.zzj()
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.zza(r11)
            return
        L8e:
            boolean r11 = r11.zzM()
            if (r11 != 0) goto L95
            return
        L95:
            com.google.android.gms.measurement.internal.zzio r11 = r9.zzu
            com.google.android.gms.measurement.internal.zzqb r3 = new com.google.android.gms.measurement.internal.zzqb
            r8 = r10
            r5 = r13
            r3.<init>(r4, r5, r7, r8)
            com.google.android.gms.measurement.internal.zzny r10 = r11.zzu()
            r10.zzY(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlw.zzan(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void zzao(zzkc zzkcVar) {
        zza();
        Preconditions.checkNotNull(zzkcVar);
        if (this.f47399zze.remove(zzkcVar)) {
            return;
        }
        a.C(this.zzu, "OnEventListener had not been registered");
    }

    public final boolean zzap() {
        return this.zzn;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zzf() {
        return false;
    }

    public final int zzi(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzu.zzf();
        return 25;
    }

    public final Boolean zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzu.zzaX().zze(atomicReference, MotionCaptureViewModelImpl.MAX_RECORDING_TIME_MILLISECONDS, "boolean test flag value", new zzlb(this, atomicReference));
    }

    public final Double zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzu.zzaX().zze(atomicReference, MotionCaptureViewModelImpl.MAX_RECORDING_TIME_MILLISECONDS, "double test flag value", new zzlo(this, atomicReference));
    }

    public final Integer zzp() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzu.zzaX().zze(atomicReference, MotionCaptureViewModelImpl.MAX_RECORDING_TIME_MILLISECONDS, "int test flag value", new zzln(this, atomicReference));
    }

    public final Long zzq() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzu.zzaX().zze(atomicReference, MotionCaptureViewModelImpl.MAX_RECORDING_TIME_MILLISECONDS, "long test flag value", new zzlm(this, atomicReference));
    }

    public final String zzr() {
        return (String) this.f47401zzg.get();
    }

    public final String zzs() {
        zzmh zzmhVarZzi = this.zzu.zzt().zzi();
        if (zzmhVarZzi != null) {
            return zzmhVarZzi.f47436zzb;
        }
        return null;
    }

    public final String zzt() {
        zzmh zzmhVarZzi = this.zzu.zzt().zzi();
        if (zzmhVarZzi != null) {
            return zzmhVarZzi.f47435zza;
        }
        return null;
    }

    public final String zzu() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzu.zzaX().zze(atomicReference, MotionCaptureViewModelImpl.MAX_RECORDING_TIME_MILLISECONDS, "String test flag value", new zzll(this, atomicReference));
    }

    public final ArrayList zzv(String str, String str2) {
        zzio zzioVar = this.zzu;
        if (zzioVar.zzaX().zzu()) {
            zzioVar.zzaW().zze().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        zzioVar.zzaV();
        if (zzaf.zza()) {
            zzioVar.zzaW().zze().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaX().zze(atomicReference, 5000L, "get conditional user properties", new zzlh(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzqf.zzK(list);
        }
        zzioVar.zzaW().zze().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final List zzw(boolean z) {
        zza();
        zzio zzioVar = this.zzu;
        zzioVar.zzaW().zzj().zza("Getting user properties (FE)");
        if (zzioVar.zzaX().zzu()) {
            a.w(zzioVar, "Cannot get all user properties from analytics worker thread");
            return Collections.EMPTY_LIST;
        }
        zzioVar.zzaV();
        if (zzaf.zza()) {
            a.w(zzioVar, "Cannot get all user properties from main thread");
            return Collections.EMPTY_LIST;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaX().zze(atomicReference, 5000L, "get user properties", new zzlc(this, atomicReference, z));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzioVar.zzaW().zze().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
        return Collections.EMPTY_LIST;
    }

    public final Map zzx(String str, String str2, boolean z) {
        zzio zzioVar = this.zzu;
        if (zzioVar.zzaX().zzu()) {
            a.w(zzioVar, "Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        zzioVar.zzaV();
        if (zzaf.zza()) {
            a.w(zzioVar, "Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaX().zze(atomicReference, 5000L, "get user properties", new zzli(this, atomicReference, null, str, str2, z));
        List<zzqb> list = (List) atomicReference.get();
        if (list == null) {
            zzioVar.zzaW().zze().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.EMPTY_MAP;
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zzqb zzqbVar : list) {
            Object objZza = zzqbVar.zza();
            if (objZza != null) {
                arrayMap.put(zzqbVar.f47716zzb, objZza);
            }
        }
        return arrayMap;
    }

    public final PriorityQueue zzy() {
        if (this.zzm == null) {
            this.zzm = new PriorityQueue(Comparator.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.zzkf
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return Long.valueOf(((zzov) obj2).f47633zzb);
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.zzkh
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return Long.compare(((Long) obj2).longValue(), ((Long) obj3).longValue());
                }
            }));
        }
        return this.zzm;
    }
}
