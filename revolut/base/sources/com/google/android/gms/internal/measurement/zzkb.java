package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
final class zzkb extends zzki {
    public zzkb(zzkf zzkfVar, String str, Long l2, boolean z) {
        super(zzkfVar, str, l2, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final /* synthetic */ Object zza(Object obj2) {
        if (obj2 instanceof Long) {
            return (Long) obj2;
        }
        if (obj2 instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj2));
            } catch (NumberFormatException unused) {
            }
        }
        String str = "Invalid long value for " + this.f40357zzb + ": " + obj2.toString();
        return null;
    }
}
