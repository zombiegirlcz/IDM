package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
final class zzkc extends zzki {
    public zzkc(zzkf zzkfVar, String str, Boolean bool, boolean z) {
        super(zzkfVar, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final /* synthetic */ Object zza(Object obj2) {
        if (obj2 instanceof Boolean) {
            return (Boolean) obj2;
        }
        if (obj2 instanceof String) {
            String str = (String) obj2;
            if (zzjc.f40304zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzjc.f40305zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = "Invalid boolean value for " + this.f40357zzb + ": " + obj2.toString();
        return null;
    }
}
