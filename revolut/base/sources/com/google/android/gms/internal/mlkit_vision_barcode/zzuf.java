package com.google.android.gms.internal.mlkit_vision_barcode;

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
public final class zzuf implements zztn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private b f42481zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final b f42482zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zztp f42483zzc;

    public zzuf(Context context, zztp zztpVar) {
        this.f42483zzc = zztpVar;
        xb.a aVar = xb.a.e;
        s.b(context);
        final q qVarC = s.a().c(aVar);
        if (xb.a.d.contains(new c("json"))) {
            this.f42481zza = new p(new b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzuc
                @Override // cf.b
                public final Object get() {
                    return ((q) qVarC).a("FIREBASE_ML_SDK", new c("json"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzue
                        @Override // wb.g
                        public final Object apply(Object obj2) {
                            return (byte[]) obj2;
                        }
                    });
                }
            });
        }
        this.f42482zzb = new p(new b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzud
            @Override // cf.b
            public final Object get() {
                return ((q) qVarC).a("FIREBASE_ML_SDK", new c("proto"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzub
                    @Override // wb.g
                    public final Object apply(Object obj2) {
                        return (byte[]) obj2;
                    }
                });
            }
        });
    }

    public static d zzb(zztp zztpVar, zztm zztmVar) {
        int iZza = zztpVar.zza();
        return zztmVar.zza() != 0 ? d.a(zztmVar.zze(iZza, false)) : d.b(zztmVar.zze(iZza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zztn
    public final void zza(zztm zztmVar) {
        if (this.f42483zzc.zza() != 0) {
            ((r) ((h) this.f42482zzb.get())).b(zzb(this.f42483zzc, zztmVar));
        } else {
            b bVar = this.f42481zza;
            if (bVar != null) {
                ((r) ((h) bVar.get())).b(zzb(this.f42483zzc, zztmVar));
            }
        }
    }
}
