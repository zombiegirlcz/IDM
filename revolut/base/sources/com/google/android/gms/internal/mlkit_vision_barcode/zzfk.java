package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;
import ve.c;
import ve.e;
import we.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzfk implements b {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f41410zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final c f41411zzb = new c() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzfj
        @Override // ve.a
        public final void encode(Object obj2, Object obj3) {
            int i = zzfk.f41410zza;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj2.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Map f41412zzc = new HashMap();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Map f41413zzd = new HashMap();

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final c f41414zze = f41411zzb;

    @Override // we.b
    @NonNull
    public final /* bridge */ /* synthetic */ b registerEncoder(@NonNull Class cls, @NonNull c cVar) {
        this.f41412zzc.put(cls, cVar);
        this.f41413zzd.remove(cls);
        return this;
    }

    public final zzfl zza() {
        return new zzfl(new HashMap(this.f41412zzc), new HashMap(this.f41413zzd), this.f41414zze);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ b registerEncoder(@NonNull Class cls, @NonNull e eVar) {
        this.f41413zzd.put(cls, eVar);
        this.f41412zzc.remove(cls);
        return this;
    }
}
