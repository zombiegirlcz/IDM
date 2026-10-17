package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;
import ve.c;
import ve.e;
import we.b;

/* JADX INFO: loaded from: classes16.dex */
public final class zzam implements b {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f42631zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final c f42632zzb = new c() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzal
        @Override // ve.a
        public final void encode(Object obj2, Object obj3) {
            int i = zzam.f42631zza;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj2.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Map f42633zzc = new HashMap();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Map f42634zzd = new HashMap();

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final c f42635zze = f42632zzb;

    @Override // we.b
    @NonNull
    public final /* bridge */ /* synthetic */ b registerEncoder(@NonNull Class cls, @NonNull c cVar) {
        this.f42633zzc.put(cls, cVar);
        this.f42634zzd.remove(cls);
        return this;
    }

    public final zzan zza() {
        return new zzan(new HashMap(this.f42633zzc), new HashMap(this.f42634zzd), this.f42635zze);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ b registerEncoder(@NonNull Class cls, @NonNull e eVar) {
        this.f42634zzd.put(cls, eVar);
        this.f42633zzc.remove(cls);
        return this;
    }
}
