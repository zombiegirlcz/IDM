package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.mlkit_vision_face.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzcw extends zzdc {
    public zzcw(zzcz zzczVar, String str, Boolean bool, boolean z) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj2) {
        if (zzcb.f38925zzc.matcher(obj2).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.f38926zzd.matcher(obj2).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder sbX = a.x("Invalid boolean value for ", this.f38977zzc, ": ");
        sbX.append((String) obj2);
        sbX.toString();
        return null;
    }
}
