package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private Object f38146zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f38147zzb;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ BaseGmsClient f38148zzd;

    public zzc(BaseGmsClient baseGmsClient, Object obj2) {
        java.util.Objects.requireNonNull(baseGmsClient);
        this.f38148zzd = baseGmsClient;
        this.f38146zza = obj2;
        this.f38147zzb = false;
    }

    public abstract void zzc(Object obj2);

    public final void zzd() {
        Object obj2;
        synchronized (this) {
            try {
                obj2 = this.f38146zza;
                if (this.f38147zzb) {
                    String string = toString();
                    StringBuilder sb6 = new StringBuilder(string.length() + 47);
                    sb6.append("Callback proxy ");
                    sb6.append(string);
                    sb6.append(" being reused. This is not safe.");
                    sb6.toString();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (obj2 != null) {
            zzc(obj2);
        }
        synchronized (this) {
            this.f38147zzb = true;
        }
        zze();
    }

    public final void zze() {
        zzf();
        BaseGmsClient baseGmsClient = this.f38148zzd;
        synchronized (baseGmsClient.zzj()) {
            baseGmsClient.zzj().remove(this);
        }
    }

    public final void zzf() {
        synchronized (this) {
            this.f38146zza = null;
        }
    }
}
