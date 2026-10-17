package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes16.dex */
final class zzlt implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ InputStream f45424zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ OutputStream f45425zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ long f45426zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ OutputStream f45427zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzlu f45428zze;

    public zzlt(zzlu zzluVar, InputStream inputStream, OutputStream outputStream, long j2, OutputStream outputStream2) {
        this.f45428zze = zzluVar;
        this.f45424zza = inputStream;
        this.f45425zzb = outputStream;
        this.f45426zzc = j2;
        this.f45427zzd = outputStream2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z = false;
        try {
            IOUtils.copyStream(this.f45424zza, this.f45425zzb, false, 65536);
            IOUtils.closeQuietly(this.f45424zza);
            zzlu.zza(this.f45428zze, this.f45427zzd, false, this.f45426zzc);
        } catch (IOException e) {
            try {
                if (this.f45428zze.f45431zzc) {
                    String.format("Terminating copying stream for Payload %d due to shutdown of OutgoingPayloadStreamer.", Long.valueOf(this.f45426zzc));
                } else {
                    String.format("Exception copying stream for Payload %d", Long.valueOf(this.f45426zzc));
                }
                IOUtils.closeQuietly(this.f45424zza);
                zzlu.zza(this.f45428zze, this.f45427zzd, true, this.f45426zzc);
            } catch (Throwable th10) {
                th = th10;
                z = true;
                IOUtils.closeQuietly(this.f45424zza);
                zzlu.zza(this.f45428zze, this.f45427zzd, z, this.f45426zzc);
                IOUtils.closeQuietly(this.f45425zzb);
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            IOUtils.closeQuietly(this.f45424zza);
            zzlu.zza(this.f45428zze, this.f45427zzd, z, this.f45426zzc);
            IOUtils.closeQuietly(this.f45425zzb);
            throw th;
        }
        IOUtils.closeQuietly(this.f45425zzb);
    }
}
