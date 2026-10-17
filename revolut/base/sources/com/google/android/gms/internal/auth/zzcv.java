package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.mlkit_vision_face.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l2, boolean z) {
        super(zzczVar, str, l2, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj2) {
        try {
            return Long.valueOf(Long.parseLong((String) obj2));
        } catch (NumberFormatException unused) {
            StringBuilder sbX = a.x("Invalid long value for ", this.f38977zzc, ": ");
            sbX.append((String) obj2);
            sbX.toString();
            return null;
        }
    }
}
