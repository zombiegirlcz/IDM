package com.google.android.gms.internal.mlkit_vision_text_common;

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
public final class zzuk implements zzts {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private b f45017zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final b f45018zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zztu f45019zzc;

    public zzuk(Context context, zztu zztuVar) {
        this.f45019zzc = zztuVar;
        a aVar = a.e;
        s.b(context);
        final q qVarC = s.a().c(aVar);
        if (a.d.contains(new c("json"))) {
            this.f45017zza = new p(new b() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzuh
                @Override // cf.b
                public final Object get() {
                    return ((q) qVarC).a("FIREBASE_ML_SDK", new c("json"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzuj
                        @Override // wb.g
                        public final Object apply(Object obj2) {
                            return (byte[]) obj2;
                        }
                    });
                }
            });
        }
        this.f45018zzb = new p(new b() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzui
            @Override // cf.b
            public final Object get() {
                return ((q) qVarC).a("FIREBASE_ML_SDK", new c("proto"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzug
                    @Override // wb.g
                    public final Object apply(Object obj2) {
                        return (byte[]) obj2;
                    }
                });
            }
        });
    }

    public static d zzb(zztu zztuVar, zztr zztrVar) {
        int iZza = zztuVar.zza();
        return zztrVar.zza() != 0 ? d.a(zztrVar.zze(iZza, false)) : d.b(zztrVar.zze(iZza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzts
    public final void zza(zztr zztrVar) {
        if (this.f45019zzc.zza() != 0) {
            ((r) ((h) this.f45018zzb.get())).b(zzb(this.f45019zzc, zztrVar));
        } else {
            b bVar = this.f45017zza;
            if (bVar != null) {
                ((r) ((h) bVar.get())).b(zzb(this.f45019zzc, zztrVar));
            }
        }
    }
}
