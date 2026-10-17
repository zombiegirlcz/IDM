package rh;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzun;

/* JADX INFO: loaded from: classes17.dex */
public final class h extends ch.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.h f254287a;

    public h(ch.h hVar) {
        this.f254287a = hVar;
    }

    @Override // ch.e
    public final /* bridge */ /* synthetic */ Object create(Object obj2) {
        qh.c cVar = (qh.c) obj2;
        zzuc zzucVarZzb = zzun.zzb(cVar.a());
        Context contextB = this.f254287a.b();
        return new a(zzucVarZzb, (GoogleApiAvailabilityLight.getInstance().getApkVersion(contextB) >= 204700000 || cVar.c()) ? new b(contextB, cVar, zzucVarZzb) : new c(contextB), cVar);
    }
}
