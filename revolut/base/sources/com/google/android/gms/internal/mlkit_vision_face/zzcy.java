package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;
import ve.c;
import ve.e;
import we.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzcy implements b {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f43557zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final c f43558zzb = new c() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzcx
        @Override // ve.a
        public final void encode(Object obj2, Object obj3) {
            int i = zzcy.f43557zza;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj2.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Map f43559zzc = new HashMap();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Map f43560zzd = new HashMap();

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final c f43561zze = f43558zzb;

    @Override // we.b
    @NonNull
    public final /* bridge */ /* synthetic */ b registerEncoder(@NonNull Class cls, @NonNull c cVar) {
        this.f43559zzc.put(cls, cVar);
        this.f43560zzd.remove(cls);
        return this;
    }

    public final zzcz zza() {
        return new zzcz(new HashMap(this.f43559zzc), new HashMap(this.f43560zzd), this.f43561zze);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ b registerEncoder(@NonNull Class cls, @NonNull e eVar) {
        this.f43560zzd.put(cls, eVar);
        this.f43559zzc.remove(cls);
        return this;
    }
}
