package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import ce.p;
import cf.b;
import wb.c;
import wb.d;
import wb.g;
import wb.h;
import xb.a;
import zb.q;
import zb.r;
import zb.s;

/* JADX INFO: loaded from: classes16.dex */
public final class zzmp implements zzmc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private b f43410zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final b f43411zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zzme f43412zzc;

    public zzmp(Context context, zzme zzmeVar) {
        this.f43412zzc = zzmeVar;
        a aVar = a.e;
        s.b(context);
        final q qVarC = s.a().c(aVar);
        if (a.d.contains(new c("json"))) {
            this.f43410zza = new p(new b() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmm
                @Override // cf.b
                public final Object get() {
                    return ((q) qVarC).a("FIREBASE_ML_SDK", new c("json"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmo
                        @Override // wb.g
                        public final Object apply(Object obj2) {
                            return (byte[]) obj2;
                        }
                    });
                }
            });
        }
        this.f43411zzb = new p(new b() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmn
            @Override // cf.b
            public final Object get() {
                return ((q) qVarC).a("FIREBASE_ML_SDK", new c("proto"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzml
                    @Override // wb.g
                    public final Object apply(Object obj2) {
                        return (byte[]) obj2;
                    }
                });
            }
        });
    }

    public static d zzb(zzme zzmeVar, zzmb zzmbVar) {
        return d.b(zzmbVar.zzd(zzmeVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(zzmb zzmbVar) {
        if (this.f43412zzc.zza() != 0) {
            ((r) ((h) this.f43411zzb.get())).b(zzb(this.f43412zzc, zzmbVar));
        } else {
            b bVar = this.f43410zza;
            if (bVar != null) {
                ((r) ((h) bVar.get())).b(zzb(this.f43412zzc, zzmbVar));
            }
        }
    }
}
