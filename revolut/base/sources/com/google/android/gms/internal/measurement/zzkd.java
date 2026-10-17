package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
final class zzkd extends zzki {
    public zzkd(zzkf zzkfVar, String str, Double d, boolean z) {
        super(zzkfVar, "measurement.test.double_flag", d, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final /* synthetic */ Object zza(Object obj2) {
        if (obj2 instanceof Double) {
            return (Double) obj2;
        }
        if (obj2 instanceof Float) {
            return Double.valueOf(((Float) obj2).doubleValue());
        }
        if (obj2 instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj2));
            } catch (NumberFormatException unused) {
            }
        }
        String str = "Invalid double value for " + this.f40357zzb + ": " + obj2.toString();
        return null;
    }
}
