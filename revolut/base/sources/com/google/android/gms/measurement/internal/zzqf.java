package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import j6.a;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes16.dex */
public final class zzqf extends zzjr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f47727zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final String[] f47728zzb = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final String[] f47729zzc = {"_err"};

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private SecureRandom f47730zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final AtomicLong f47731zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private int f47732zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private MeasurementManagerFutures f47733zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private Boolean f47734zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private Integer f47735zzi;

    public zzqf(zzio zzioVar) {
        super(zzioVar);
        this.f47735zzi = null;
        this.f47731zze = new AtomicLong(0L);
    }

    public static MessageDigest zzI() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList zzK(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            zzai zzaiVar = (zzai) it8.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzaiVar.f46856zza);
            bundle.putString("origin", zzaiVar.f46857zzb);
            bundle.putLong("creation_timestamp", zzaiVar.f46859zzd);
            bundle.putString("name", zzaiVar.f46858zzc.f47716zzb);
            zzjt.zzb(bundle, Preconditions.checkNotNull(zzaiVar.f46858zzc.zza()));
            bundle.putBoolean("active", zzaiVar.f46860zze);
            String str = zzaiVar.f46861zzf;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbh zzbhVar = zzaiVar.f46862zzg;
            if (zzbhVar != null) {
                bundle.putString("timed_out_event_name", zzbhVar.f46951zza);
                zzbf zzbfVar = zzbhVar.f46952zzb;
                if (zzbfVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbfVar.zzc());
                }
            }
            bundle.putLong("trigger_timeout", zzaiVar.f46863zzh);
            zzbh zzbhVar2 = zzaiVar.f46864zzi;
            if (zzbhVar2 != null) {
                bundle.putString("triggered_event_name", zzbhVar2.f46951zza);
                zzbf zzbfVar2 = zzbhVar2.f46952zzb;
                if (zzbfVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbfVar2.zzc());
                }
            }
            bundle.putLong("triggered_timestamp", zzaiVar.f46858zzc.f47717zzc);
            bundle.putLong("time_to_live", zzaiVar.f46865zzj);
            zzbh zzbhVar3 = zzaiVar.f46866zzk;
            if (zzbhVar3 != null) {
                bundle.putString("expired_event_name", zzbhVar3.f46951zza);
                zzbf zzbfVar3 = zzbhVar3.f46952zzb;
                if (zzbfVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbfVar3.zzc());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void zzN(zzmh zzmhVar, Bundle bundle, boolean z) {
        if (bundle != null && zzmhVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = zzmhVar.f47435zza;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzmhVar.f47436zzb;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzmhVar.f47437zzc);
                return;
            }
            z = false;
        }
        if (bundle != null && zzmhVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    private final int zzaA(String str) {
        if ("_ldl".equals(str)) {
            this.zzu.zzf();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.zzu.zzf();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.zzu.zzf();
            return 100;
        }
        this.zzu.zzf();
        return 36;
    }

    private final Object zzaB(int i, Object obj2, boolean z, boolean z3, String str) {
        if (obj2 == null) {
            return null;
        }
        if ((obj2 instanceof Long) || (obj2 instanceof Double)) {
            return obj2;
        }
        if (obj2 instanceof Integer) {
            return Long.valueOf(((Integer) obj2).intValue());
        }
        if (obj2 instanceof Byte) {
            return Long.valueOf(((Byte) obj2).byteValue());
        }
        if (obj2 instanceof Short) {
            return Long.valueOf(((Short) obj2).shortValue());
        }
        if (obj2 instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj2).booleanValue() ? 0L : 1L);
        }
        if (obj2 instanceof Float) {
            return Double.valueOf(((Float) obj2).doubleValue());
        }
        if ((obj2 instanceof String) || (obj2 instanceof Character) || (obj2 instanceof CharSequence)) {
            return zzG(obj2.toString(), i, z);
        }
        if (!z3 || (!(obj2 instanceof Bundle[]) && !(obj2 instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj2) {
            if (parcelable instanceof Bundle) {
                Bundle bundleZzz = zzz((Bundle) parcelable, null);
                if (!bundleZzz.isEmpty()) {
                    arrayList.add(bundleZzz);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private static boolean zzaC(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzap(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean zzaq(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean zzar(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean zzas(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean zzat(Context context, boolean z) {
        Preconditions.checkNotNull(context);
        return zzas(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean zzau(String str) {
        return !f47729zzc[0].equals(str);
    }

    public static final boolean zzaz(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    public static long zzr(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i = 0;
        Preconditions.checkState(length > 0);
        long j2 = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j2 += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j2;
    }

    public final Bundle zzA(String str, String str2, Bundle bundle, List list, boolean z) {
        int iZzi;
        List list2 = list;
        boolean zZzaC = zzaC(str2, zzjy.f47274zzd);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        zzio zzioVar = this.zzu;
        int iZze = zzioVar.zzf().zze();
        int i = 0;
        boolean z3 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str3)) {
                iZzi = !z ? zzi(str3) : 0;
                if (iZzi == 0) {
                    iZzi = zzh(str3);
                }
            } else {
                iZzi = 0;
            }
            if (iZzi != 0) {
                zzM(bundle2, iZzi, str3, iZzi == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int iZza = zza(str, str2, str3, bundle.get(str3), bundle2, list2, z, zZzaC);
                if (iZza == 17) {
                    zzM(bundle2, 17, str3, Boolean.FALSE);
                } else if (iZza != 0 && !"_ev".equals(str3)) {
                    zzM(bundle2, iZza, iZza == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (zzaq(str3) && (i = i + 1) > iZze) {
                    if (!zzioVar.zzf().zzx(null, zzgi.zzbr) || !z3) {
                        zzioVar.zzaW().zzf().zzc(a.l(iZze, "Event can't contain more than ", " params"), zzioVar.zzj().zzd(str2), zzioVar.zzj().zzb(bundle));
                    }
                    zzaz(bundle2, 5);
                    bundle2.remove(str3);
                    z3 = true;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    public final MeasurementManagerFutures zzB() {
        if (this.f47733zzg == null) {
            this.f47733zzg = MeasurementManagerFutures.from(this.zzu.zzaT());
        }
        return this.f47733zzg;
    }

    public final zzbh zzC(String str, String str2, Bundle bundle, String str3, long j2, boolean z, boolean z3) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzf(str2) != 0) {
            zzio zzioVar = this.zzu;
            zzioVar.zzaW().zze().zzb("Invalid conditional property event name", zzioVar.zzj().zzf(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleZzA = zzA(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
        if (z) {
            bundleZzA = zzz(bundleZzA, str);
        }
        Preconditions.checkNotNull(bundleZzA);
        return new zzbh(str2, new zzbf(bundleZzA), str3, j2);
    }

    public final Object zzD(String str, Object obj2) {
        if ("_ev".equals(str)) {
            return zzaB(this.zzu.zzf().zzd(null, false), obj2, true, true, null);
        }
        return zzaB(zzap(str) ? this.zzu.zzf().zzd(null, false) : this.zzu.zzf().zzc(null, false), obj2, false, true, null);
    }

    public final Object zzE(String str, Object obj2) {
        return "_ldl".equals(str) ? zzaB(zzaA(str), obj2, true, false, null) : zzaB(zzaA(str), obj2, false, false, null);
    }

    public final String zzF() {
        byte[] bArr = new byte[16];
        zzJ().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String zzG(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    public final URL zzH(long j2, String str, String str2, long j3, String str3) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v119002." + zzm()) + "&rdid=" + str2 + "&bundleid=" + str + "&retry=" + j3;
            if (str.equals(this.zzu.zzf().zzp())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e) {
            e = e;
            this.zzu.zzaW().zze().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e2) {
            e = e2;
            this.zzu.zzaW().zze().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final SecureRandom zzJ() {
        zzg();
        if (this.f47730zzd == null) {
            this.f47730zzd = new SecureRandom();
        }
        return this.f47730zzd;
    }

    public final void zzL(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            this.zzu.zzaW().zzk().zzb("Params already contained engagement", Long.valueOf(j3));
        } else {
            j3 = 0;
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void zzM(Bundle bundle, int i, String str, Object obj2) {
        if (zzaz(bundle, i)) {
            this.zzu.zzf();
            bundle.putString("_ev", zzG(str, 40, true));
            if (obj2 != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj2 instanceof String) || (obj2 instanceof CharSequence)) {
                    bundle.putLong("_el", obj2.toString().length());
                }
            }
        }
    }

    public final void zzO(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.zzu.zzw().zzS(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void zzP(Parcelable[] parcelableArr, int i) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (zzaq(str) && !zzaC(str, zzjz.f47278zzd) && (i2 = i2 + 1) > i) {
                    zzio zzioVar = this.zzu;
                    if (!zzioVar.zzf().zzx(null, zzgi.zzbr) || !z) {
                        zzioVar.zzaW().zzf().zzc(a.l(i, "Param can't contain more than ", " item-scoped custom parameters"), zzioVar.zzj().zze(str), zzioVar.zzj().zzb(bundle));
                    }
                    zzaz(bundle, 28);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final void zzQ(zzhf zzhfVar, int i) {
        Bundle bundle = zzhfVar.f47049zzd;
        int i2 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (zzaq(str) && (i2 = i2 + 1) > i) {
                zzio zzioVar = this.zzu;
                if (!zzioVar.zzf().zzx(null, zzgi.zzbr) || !z) {
                    zzioVar.zzaW().zzf().zzc(a.l(i, "Event can't contain more than ", " params"), zzioVar.zzj().zzd(zzhfVar.f47046zza), zzioVar.zzj().zzb(bundle));
                    zzaz(bundle, 5);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final void zzR(zzqe zzqeVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        zzaz(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        zzqeVar.zza(str, "_err", bundle);
    }

    public final void zzS(Bundle bundle, String str, Object obj2) {
        if (bundle == null) {
            return;
        }
        if (obj2 instanceof Long) {
            bundle.putLong(str, ((Long) obj2).longValue());
            return;
        }
        if (obj2 instanceof String) {
            bundle.putString(str, String.valueOf(obj2));
            return;
        }
        if (obj2 instanceof Double) {
            bundle.putDouble(str, ((Double) obj2).doubleValue());
            return;
        }
        if (obj2 instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj2);
        } else if (str != null) {
            String simpleName = obj2 != null ? obj2.getClass().getSimpleName() : null;
            zzio zzioVar = this.zzu;
            zzioVar.zzaW().zzl().zzc("Not putting event parameter. Invalid value type. name, type", zzioVar.zzj().zze(str), simpleName);
        }
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzcy zzcyVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzu.zzaW().zzk().zzb("Error returning boolean value to wrapper", e);
        }
    }

    public final void zzU(com.google.android.gms.internal.measurement.zzcy zzcyVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzu.zzaW().zzk().zzb("Error returning bundle list to wrapper", e);
        }
    }

    public final void zzV(com.google.android.gms.internal.measurement.zzcy zzcyVar, Bundle bundle) {
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzu.zzaW().zzk().zzb("Error returning bundle value to wrapper", e);
        }
    }

    public final void zzW(com.google.android.gms.internal.measurement.zzcy zzcyVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzu.zzaW().zzk().zzb("Error returning byte array to wrapper", e);
        }
    }

    public final void zzX(com.google.android.gms.internal.measurement.zzcy zzcyVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzu.zzaW().zzk().zzb("Error returning int value to wrapper", e);
        }
    }

    public final void zzY(com.google.android.gms.internal.measurement.zzcy zzcyVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzu.zzaW().zzk().zzb("Error returning long value to wrapper", e);
        }
    }

    public final void zzZ(com.google.android.gms.internal.measurement.zzcy zzcyVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcyVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzu.zzaW().zzk().zzb("Error returning string value to wrapper", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Object r16, android.os.Bundle r17, java.util.List r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzqf.zza(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    public final void zzaZ() {
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                ch.qos.logback.core.util.a.C(this.zzu, "Utils falling back to Random for random id");
            }
        }
        this.f47731zze.set(jNextLong);
    }

    public final void zzaa(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int iZzi;
        String str4;
        int iZza;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        zzio zzioVar = this.zzu;
        int i = true != zzioVar.zzf().zzu.zzw().zzao(231100000, true) ? 0 : 35;
        int i2 = 0;
        boolean z3 = false;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str5)) {
                iZzi = !z ? zzi(str5) : 0;
                if (iZzi == 0) {
                    iZzi = zzh(str5);
                }
            } else {
                iZzi = 0;
            }
            if (iZzi != 0) {
                zzM(bundle, iZzi, str5, iZzi == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (zzal(bundle.get(str5))) {
                    zzioVar.zzaW().zzl().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iZza = 22;
                    str4 = null;
                } else {
                    str4 = null;
                    iZza = zza(str, str2, str5, bundle.get(str5), bundle, list2, z, false);
                }
                if (iZza != 0 && !"_ev".equals(str5)) {
                    zzM(bundle, iZza, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (zzaq(str5) && !zzaC(str5, zzjz.f47278zzd)) {
                    i2++;
                    if (!zzao(231100000, true)) {
                        zzioVar.zzaW().zzf().zzc("Item array not supported on client's version of Google Play Services (Android Only)", zzioVar.zzj().zzd(str2), zzioVar.zzj().zzb(bundle));
                        zzaz(bundle, 23);
                        bundle.remove(str5);
                    } else if (i2 > i) {
                        if (!zzioVar.zzf().zzx(str4, zzgi.zzbr) || !z3) {
                            zzioVar.zzaW().zzf().zzc(a.l(i, "Item can't contain more than ", " item-scoped custom params"), zzioVar.zzj().zzd(str2), zzioVar.zzj().zzb(bundle));
                        }
                        zzaz(bundle, 28);
                        bundle.remove(str5);
                        list2 = list;
                        z3 = true;
                    }
                }
            }
            list2 = list;
        }
    }

    public final boolean zzab(String str) {
        String str2 = (String) zzgi.zzaq.zza(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public final boolean zzac(String str, String str2) {
        zzio zzioVar = this.zzu;
        if (zzioVar.zzf().zzx(null, zzgi.zzbp)) {
            if (TextUtils.isEmpty(str)) {
                if (!this.zzu.zzL()) {
                    return false;
                }
                zzioVar.zzaW().zzf().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                return false;
            }
            if (zzax(str)) {
                return true;
            }
            if (!this.zzu.zzL()) {
                return false;
            }
            zzioVar.zzaW().zzf().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzhe.zzn(str));
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                if (this.zzu.zzL()) {
                    zzioVar.zzaW().zzf().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            }
            if (!zzax(str2)) {
                zzioVar.zzaW().zzf().zzb("Invalid admob_app_id. Analytics disabled.", zzhe.zzn(str2));
                return false;
            }
        } else if (!zzax(str)) {
            if (this.zzu.zzL()) {
                zzioVar.zzaW().zzf().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzhe.zzn(str));
            }
            return false;
        }
        return true;
    }

    public final boolean zzad(String str, int i, String str2) {
        if (str2 == null) {
            this.zzu.zzaW().zzf().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        this.zzu.zzaW().zzf().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    public final boolean zzae(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.zzu.zzaW().zzf().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = f47728zzb;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.zzu.zzaW().zzf().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zzaC(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && zzaC(str2, strArr2)) {
            return true;
        }
        this.zzu.zzaW().zzf().zzc("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean zzaf(String str, String str2, int i, Object obj2) {
        if (obj2 != null && !(obj2 instanceof Long) && !(obj2 instanceof Float) && !(obj2 instanceof Integer) && !(obj2 instanceof Byte) && !(obj2 instanceof Short) && !(obj2 instanceof Boolean) && !(obj2 instanceof Double)) {
            if (!(obj2 instanceof String) && !(obj2 instanceof Character) && !(obj2 instanceof CharSequence)) {
                return false;
            }
            String string = obj2.toString();
            if (string.codePointCount(0, string.length()) > i) {
                this.zzu.zzaW().zzl().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean zzag(String str, String str2) {
        if (str2 == null) {
            this.zzu.zzaW().zzf().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzu.zzaW().zzf().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.zzu.zzaW().zzf().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.zzu.zzaW().zzf().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean zzah(String str, String str2) {
        if (str2 == null) {
            this.zzu.zzaW().zzf().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.zzu.zzaW().zzf().zzb("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.zzu.zzaW().zzf().zzc("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.zzu.zzaW().zzf().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean zzai() {
        Object e;
        Integer num;
        if (this.f47734zzh == null) {
            MeasurementManagerFutures measurementManagerFuturesZzB = zzB();
            boolean z = false;
            if (measurementManagerFuturesZzB == null) {
                return false;
            }
            try {
                num = measurementManagerFuturesZzB.getMeasurementApiStatusAsync().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z = true;
                        }
                    } catch (InterruptedException e2) {
                        e = e2;
                        this.zzu.zzaW().zzk().zzb("Measurement manager api exception", e);
                        this.f47734zzh = Boolean.FALSE;
                    } catch (CancellationException e4) {
                        e = e4;
                        this.zzu.zzaW().zzk().zzb("Measurement manager api exception", e);
                        this.f47734zzh = Boolean.FALSE;
                    } catch (ExecutionException e5) {
                        e = e5;
                        this.zzu.zzaW().zzk().zzb("Measurement manager api exception", e);
                        this.f47734zzh = Boolean.FALSE;
                    } catch (TimeoutException e6) {
                        e = e6;
                        this.zzu.zzaW().zzk().zzb("Measurement manager api exception", e);
                        this.f47734zzh = Boolean.FALSE;
                    }
                }
                this.f47734zzh = Boolean.valueOf(z);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e22) {
                e = e22;
                num = null;
            }
            this.zzu.zzaW().zzj().zzb("Measurement manager api status result", num);
        }
        return this.f47734zzh.booleanValue();
    }

    public final boolean zzaj(String str) {
        zzg();
        zzio zzioVar = this.zzu;
        if (Wrappers.packageManager(zzioVar.zzaT()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        zzioVar.zzaW().zzd().zzb("Permission not granted", str);
        return false;
    }

    public final boolean zzak(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        zzio zzioVar = this.zzu;
        String strZzo = zzioVar.zzf().zzo();
        zzioVar.zzaV();
        return strZzo.equals(str);
    }

    public final boolean zzal(Object obj2) {
        return (obj2 instanceof Parcelable[]) || (obj2 instanceof ArrayList) || (obj2 instanceof Bundle);
    }

    public final boolean zzam(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            this.zzu.zzaW().zze().zzb("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            this.zzu.zzaW().zze().zzb("Error obtaining certificate", e2);
            return true;
        }
    }

    public final boolean zzan() {
        zzg();
        return zzq() == 1;
    }

    public final boolean zzao(int i, boolean z) {
        Boolean boolZzl = this.zzu.zzu().zzl();
        if (zzm() < i / 1000) {
            return (boolZzl == null || boolZzl.booleanValue()) ? false : true;
        }
        return true;
    }

    public final boolean zzav(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            Preconditions.checkNotNull(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzaw(String str, String str2, String str3, String str4) {
        if (this.zzu.zzf().zzx(null, zzgi.zzbp)) {
            return zzav(str, str2);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public final boolean zzax(String str) {
        Preconditions.checkNotNull(str);
        return str.matches(true != this.zzu.zzf().zzx(null, zzgi.zzbp) ? "^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$" : "^1:\\d+:android:[a-f0-9]+$");
    }

    public final byte[] zzay(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    public final boolean zzc() {
        return true;
    }

    public final int zzd(String str, Object obj2) {
        return "_ldl".equals(str) ? zzaf("user property referrer", str, zzaA(str), obj2) : zzaf("user property", str, zzaA(str), obj2) ? 0 : 7;
    }

    public final int zzf(String str) {
        if (!zzag("event", str)) {
            return 2;
        }
        if (!zzae("event", zzjy.f47271zza, zzjy.f47272zzb, str)) {
            return 13;
        }
        this.zzu.zzf();
        return !zzad("event", 40, str) ? 2 : 0;
    }

    public final int zzh(String str) {
        if (!zzag("event param", str)) {
            return 3;
        }
        if (!zzae("event param", null, null, str)) {
            return 14;
        }
        this.zzu.zzf();
        return !zzad("event param", 40, str) ? 3 : 0;
    }

    public final int zzi(String str) {
        if (!zzah("event param", str)) {
            return 3;
        }
        if (!zzae("event param", null, null, str)) {
            return 14;
        }
        this.zzu.zzf();
        return !zzad("event param", 40, str) ? 3 : 0;
    }

    public final int zzj(String str) {
        if (!zzag("user property", str)) {
            return 6;
        }
        if (!zzae("user property", zzka.f47283zza, null, str)) {
            return 15;
        }
        this.zzu.zzf();
        return !zzad("user property", 24, str) ? 6 : 0;
    }

    public final int zzl() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public final int zzm() {
        if (this.f47735zzi == null) {
            this.f47735zzi = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzu.zzaT()) / 1000);
        }
        return this.f47735zzi.intValue();
    }

    public final int zzp(int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzu.zzaT(), 12451000);
    }

    public final long zzq() {
        long j2;
        zzg();
        if (!zzab(this.zzu.zzh().zzm())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j2 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j2 = 8;
        } else {
            zzio zzioVar = this.zzu;
            int iZzl = zzl();
            zzioVar.zzf();
            j2 = iZzl < ((Integer) zzgi.zzak.zza(null)).intValue() ? 16L : 0L;
        }
        if (!zzaj("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j2 |= 2;
        }
        if (j2 == 0 && !zzai()) {
            j2 = 64;
        }
        if (j2 == 0) {
            return 1L;
        }
        return j2;
    }

    public final long zzs() {
        long andIncrement;
        long j2;
        AtomicLong atomicLong = this.f47731zze;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f47731zze;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNextLong = new Random(System.nanoTime() ^ this.zzu.zzaU().currentTimeMillis()).nextLong();
            int i = this.f47732zzf + 1;
            this.f47732zzf = i;
            j2 = jNextLong + ((long) i);
        }
        return j2;
    }

    public final long zzt(long j2, long j3) {
        return ((j3 * 60000) + j2) / CoreConstants.MILLIS_IN_ONE_DAY;
    }

    public final Bundle zzu(Uri uri2) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri2 == null) {
            return null;
        }
        try {
            if (uri2.isHierarchical()) {
                queryParameter = uri2.getQueryParameter("utm_campaign");
                queryParameter2 = uri2.getQueryParameter("utm_source");
                queryParameter3 = uri2.getQueryParameter("utm_medium");
                queryParameter4 = uri2.getQueryParameter("gclid");
                queryParameter5 = uri2.getQueryParameter("gbraid");
                queryParameter6 = uri2.getQueryParameter("utm_id");
                queryParameter7 = uri2.getQueryParameter("dclid");
                queryParameter8 = uri2.getQueryParameter("srsltid");
                queryParameter9 = uri2.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri2.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri2.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri2.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri2.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri2.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri2.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri2.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri2.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri2.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            this.zzu.zzaW().zzk().zzb("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    public final Bundle zzz(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objZzD = zzD(str2, bundle.get(str2));
                if (objZzD == null) {
                    zzio zzioVar = this.zzu;
                    zzioVar.zzaW().zzl().zzb("Param value can't be null", zzioVar.zzj().zze(str2));
                } else {
                    zzS(bundle2, str2, objZzD);
                }
            }
        }
        return bundle2;
    }
}
