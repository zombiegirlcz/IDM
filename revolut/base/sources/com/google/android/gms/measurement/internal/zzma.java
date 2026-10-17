package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzma implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzmb f47414zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final URL f47415zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final byte[] f47416zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final zzly f47417zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final String f47418zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final Map f47419zzf;

    public zzma(zzmb zzmbVar, String str, URL url2, byte[] bArr, Map map, zzly zzlyVar) {
        this.f47414zza = zzmbVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url2);
        Preconditions.checkNotNull(zzlyVar);
        this.f47415zzb = url2;
        this.f47416zzc = bArr;
        this.f47417zzd = zzlyVar;
        this.f47418zze = str;
        this.f47419zzf = map;
    }

    private final void zzb(final int i, final Exception exc2, final byte[] bArr, final Map map) {
        this.f47414zza.zzu.zzaX().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlz
            @Override // java.lang.Runnable
            public final void run() {
                zzma zzmaVar = this.f47407zza;
                zzmaVar.f47417zzd.zza(zzmaVar.f47418zze, i, exc2, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.measurement.internal.zzma] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzma.run():void");
    }
}
