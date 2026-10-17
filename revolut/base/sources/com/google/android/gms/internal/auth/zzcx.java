package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.mlkit_vision_face.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d, boolean z) {
        super(zzczVar, str, d, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj2) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj2));
        } catch (NumberFormatException unused) {
            StringBuilder sbX = a.x("Invalid double value for ", this.f38977zzc, ": ");
            sbX.append((String) obj2);
            sbX.toString();
            return null;
        }
    }
}
