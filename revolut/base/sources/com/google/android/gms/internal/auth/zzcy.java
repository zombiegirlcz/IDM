package com.google.android.gms.internal.auth;

import android.util.Base64;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
final class zzcy extends zzdc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzhy f38963zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzcz zzczVar, String str, Object obj2, boolean z, zzhy zzhyVar) {
        super(zzczVar, "getTokenRefactor__blocked_packages", obj2, true, null);
        this.f38963zza = zzhyVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final Object zza(Object obj2) {
        try {
            return zzhs.zzp(Base64.decode((String) obj2, 3));
        } catch (IOException | IllegalArgumentException unused) {
            StringBuilder sbX = a.x("Invalid byte[] value for ", this.f38977zzc, ": ");
            sbX.append((String) obj2);
            sbX.toString();
            return null;
        }
    }
}
