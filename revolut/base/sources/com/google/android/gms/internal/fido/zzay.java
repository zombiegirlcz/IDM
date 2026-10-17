package com.google.android.gms.internal.fido;

import com.google.android.apps.common.proguard.SideEffectFree;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class zzay {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f39297zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Set f39298zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final boolean f39299zzc;

    private zzay(String str, Set set, boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f39297zza = "com.google.android.gms.fido";
        this.f39298zzb = set;
        this.f39299zzc = z6;
    }

    @SideEffectFree
    public final zzaq zza(String str, long j2) {
        final Class<Long> cls = Long.class;
        return new zzaq(this.f39297zza, str, Long.valueOf(j2), new zzak(false, false, false, this.f39299zzc, false, this.f39298zzb, new zzax() { // from class: com.google.android.gms.internal.fido.zzav
        }, new zzax(cls) { // from class: com.google.android.gms.internal.fido.zzaw
        }), true);
    }

    @SideEffectFree
    public final zzaq zzb(String str, String str2) {
        final Class<String> cls = String.class;
        return new zzaq(this.f39297zza, str, str2, new zzak(false, false, false, this.f39299zzc, false, this.f39298zzb, new zzax() { // from class: com.google.android.gms.internal.fido.zzat
        }, new zzax(cls) { // from class: com.google.android.gms.internal.fido.zzau
        }), true);
    }

    @SideEffectFree
    public final zzaq zzc(String str, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        final Class<Boolean> cls = Boolean.class;
        return new zzaq(this.f39297zza, str, boolValueOf, new zzak(false, false, false, this.f39299zzc, false, this.f39298zzb, new zzax() { // from class: com.google.android.gms.internal.fido.zzar
        }, new zzax(cls) { // from class: com.google.android.gms.internal.fido.zzas
        }), true);
    }

    public final zzay zzd() {
        return new zzay(this.f39297zza, this.f39298zzb, false, false, false, true, false);
    }

    public final zzay zze(Set set) {
        return new zzay(this.f39297zza, set, false, false, false, this.f39299zzc, false);
    }

    public zzay(String str) {
        this("com.google.android.gms.fido", zzcf.zzk(), false, false, false, false, false);
    }
}
