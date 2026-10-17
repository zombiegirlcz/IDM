package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzhi implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzhk f47056zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final URL f47057zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final byte[] f47058zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzhg f47059zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final String f47060zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final Map f47061zzf;

    public zzhi(zzhk zzhkVar, String str, URL url2, byte[] bArr, Map map, zzhg zzhgVar) {
        this.f47056zza = zzhkVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url2);
        Preconditions.checkNotNull(zzhgVar);
        this.f47057zzb = url2;
        this.f47058zzc = bArr;
        this.f47059zzd = zzhgVar;
        this.f47060zze = str;
        this.f47061zzf = map;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00fc: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:51:0x00fa */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00ff: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:52:0x00fe */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhi.run():void");
    }
}
