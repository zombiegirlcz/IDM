package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;
import ve.c;
import ve.e;
import we.b;

/* JADX INFO: loaded from: classes16.dex */
public final class zzdb implements b {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f44539zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final c f44540zzb = new c() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzda
        @Override // ve.a
        public final void encode(Object obj2, Object obj3) {
            int i = zzdb.f44539zza;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj2.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Map f44541zzc = new HashMap();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Map f44542zzd = new HashMap();

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final c f44543zze = f44540zzb;

    @Override // we.b
    @NonNull
    public final /* bridge */ /* synthetic */ b registerEncoder(@NonNull Class cls, @NonNull c cVar) {
        this.f44541zzc.put(cls, cVar);
        this.f44542zzd.remove(cls);
        return this;
    }

    public final zzdc zza() {
        return new zzdc(new HashMap(this.f44541zzc), new HashMap(this.f44542zzd), this.f44543zze);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ b registerEncoder(@NonNull Class cls, @NonNull e eVar) {
        this.f44542zzd.put(cls, eVar);
        this.f44541zzc.remove(cls);
        return this;
    }
}
