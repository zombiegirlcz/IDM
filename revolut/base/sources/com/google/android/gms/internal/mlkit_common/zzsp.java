package com.google.android.gms.internal.mlkit_common;

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
public final class zzsp implements zzrz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private b f41224zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final b f41225zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zzsb f41226zzc;

    public zzsp(Context context, zzsb zzsbVar) {
        this.f41226zzc = zzsbVar;
        a aVar = a.e;
        s.b(context);
        final q qVarC = s.a().c(aVar);
        if (a.d.contains(new c("json"))) {
            this.f41224zza = new p(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzsm
                @Override // cf.b
                public final Object get() {
                    return ((q) qVarC).a("FIREBASE_ML_SDK", new c("json"), new g() { // from class: com.google.android.gms.internal.mlkit_common.zzso
                        @Override // wb.g
                        public final Object apply(Object obj2) {
                            return (byte[]) obj2;
                        }
                    });
                }
            });
        }
        this.f41225zzb = new p(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzsn
            @Override // cf.b
            public final Object get() {
                return ((q) qVarC).a("FIREBASE_ML_SDK", new c("proto"), new g() { // from class: com.google.android.gms.internal.mlkit_common.zzsl
                    @Override // wb.g
                    public final Object apply(Object obj2) {
                        return (byte[]) obj2;
                    }
                });
            }
        });
    }

    public static d zzb(zzsb zzsbVar, zzry zzryVar) {
        return d.b(zzryVar.zze(zzsbVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzrz
    public final void zza(zzry zzryVar) {
        if (this.f41226zzc.zza() != 0) {
            ((r) ((h) this.f41225zzb.get())).b(zzb(this.f41226zzc, zzryVar));
        } else {
            b bVar = this.f41224zza;
            if (bVar != null) {
                ((r) ((h) bVar.get())).b(zzb(this.f41226zzc, zzryVar));
            }
        }
    }
}
