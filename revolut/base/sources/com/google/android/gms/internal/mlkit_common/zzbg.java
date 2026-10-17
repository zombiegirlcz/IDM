package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;
import ve.c;
import ve.e;
import we.b;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbg implements b {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f40762zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final c f40763zzb = new c() { // from class: com.google.android.gms.internal.mlkit_common.zzbf
        @Override // ve.a
        public final void encode(Object obj2, Object obj3) {
            int i = zzbg.f40762zza;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj2.getClass().getCanonicalName())));
        }
    };

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Map f40764zzc = new HashMap();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Map f40765zzd = new HashMap();

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final c f40766zze = f40763zzb;

    @Override // we.b
    @NonNull
    public final /* bridge */ /* synthetic */ b registerEncoder(@NonNull Class cls, @NonNull c cVar) {
        this.f40764zzc.put(cls, cVar);
        this.f40765zzd.remove(cls);
        return this;
    }

    public final zzbh zza() {
        return new zzbh(new HashMap(this.f40764zzc), new HashMap(this.f40765zzd), this.f40766zze);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ b registerEncoder(@NonNull Class cls, @NonNull e eVar) {
        this.f40765zzd.put(cls, eVar);
        this.f40764zzc.remove(cls);
        return this;
    }
}
