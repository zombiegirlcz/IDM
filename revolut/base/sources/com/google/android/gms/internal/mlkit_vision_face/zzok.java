package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import ce.p;
import cf.b;
import wb.c;
import wb.d;
import wb.g;
import wb.h;
import zb.q;
import zb.r;
import zb.s;

/* JADX INFO: loaded from: classes.dex */
public final class zzok implements zzob {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private b f44384zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final b f44385zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zznt f44386zzc;

    public zzok(Context context, zznt zzntVar) {
        this.f44386zzc = zzntVar;
        xb.a aVar = xb.a.e;
        s.b(context);
        final q qVarC = s.a().c(aVar);
        if (xb.a.d.contains(new c("json"))) {
            this.f44384zza = new p(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoh
                @Override // cf.b
                public final Object get() {
                    return ((q) qVarC).a("FIREBASE_ML_SDK", new c("json"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoj
                        @Override // wb.g
                        public final Object apply(Object obj2) {
                            return (byte[]) obj2;
                        }
                    });
                }
            });
        }
        this.f44385zzb = new p(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoi
            @Override // cf.b
            public final Object get() {
                return ((q) qVarC).a("FIREBASE_ML_SDK", new c("proto"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzog
                    @Override // wb.g
                    public final Object apply(Object obj2) {
                        return (byte[]) obj2;
                    }
                });
            }
        });
    }

    public static d zzb(zznt zzntVar, zznr zznrVar) {
        int iZza = zzntVar.zza();
        return zznrVar.zza() != 0 ? d.a(zznrVar.zze(iZza, false)) : d.b(zznrVar.zze(iZza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzob
    public final void zza(zznr zznrVar) {
        if (this.f44386zzc.zza() != 0) {
            ((r) ((h) this.f44385zzb.get())).b(zzb(this.f44386zzc, zznrVar));
        } else {
            b bVar = this.f44384zza;
            if (bVar != null) {
                ((r) ((h) bVar.get())).b(zzb(this.f44386zzc, zznrVar));
            }
        }
    }
}
